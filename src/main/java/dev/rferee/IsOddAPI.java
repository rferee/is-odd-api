package dev.rferee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class IsOddAPI {
    public static ArrayList<Long> oddNumbers = new ArrayList<>();
    public static ArrayList<Long> evenNumbers = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(IsOddAPI.class, args);

        System.out.println("GENERATING ODD NUMBERS");

        ExecutorService pl = Executors.newFixedThreadPool(94);
        for (long i = 0; i != Long.MAX_VALUE; i += 1001) {
            WorkerThread workerThread = new WorkerThread(i, i+1000);

            pl.submit(workerThread);
        }

        System.out.println("ODD NUMBERS GENERATED");
    }
}

class WorkerThread implements Runnable {
    private Long bound_start;
    private Long bound_end;

    public WorkerThread(Long bound_start, Long bound_end){
        this.bound_start = bound_start;
        this.bound_end = bound_end;
    }

    @Override
    public void run() {
        for (long i = bound_start; i < bound_end; i++) {
            if (i % 2 != 0) {
                try {
                    IsOddAPI.oddNumbers.add(i);
                } catch (OutOfMemoryError e) {
                    System.err.println("I DIED. BIGGEST NUMBAH: " + i);
                    e.printStackTrace();
                    return;
                }
            } else {
                try {
                    IsOddAPI.evenNumbers.add(i);
                } catch (OutOfMemoryError e) {
                    System.err.println("I DIED. BIGGEST NUMBAH: " + i);
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}

@RestController
class Controller {

    @GetMapping("/isOdd/{number}")
    public Response isOdd(@PathVariable long number) {
       if (IsOddAPI.oddNumbers.contains(number)) {
           return new ResponseIsOdd(true);
       } else if (IsOddAPI.evenNumbers.contains(number)) {
           return new ResponseIsOdd(false);
       } else {
           return new ResponseNotFound("This number is not indexed yet.");
       }
    }

    @GetMapping("/isEven/{number}")
    public Response isEven(@PathVariable long number) {
        if (IsOddAPI.oddNumbers.contains(number)) {
            return new ResponseIsEven(false);
        } else if (IsOddAPI.evenNumbers.contains(number)) {
            return new ResponseIsEven(true);
        } else {
            return new ResponseNotFound("This number is not indexed yet.");
        }
    }

    @GetMapping("/lastEven")
    public Long lastEven() {
        return IsOddAPI.evenNumbers.get(IsOddAPI.evenNumbers.size());
    }

    @GetMapping("/lastOdd")
    public Long lastOdd() {
        return IsOddAPI.oddNumbers.get(IsOddAPI.oddNumbers.size());
    }
}

class Response {}
class ResponseIsOdd extends Response {
    private boolean isOdd;

    public ResponseIsOdd(boolean isOdd) {
        this.isOdd = isOdd;
    }

    public boolean isOdd() {
        return isOdd;
    }
}

class ResponseIsEven extends Response {
    private boolean isEven;

    public ResponseIsEven(boolean isOdd) {
        this.isEven = isOdd;
    }

    public boolean isEven() {
        return isEven;
    }
}

class ResponseNotFound extends Response {
    private String message;

    public ResponseNotFound(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}