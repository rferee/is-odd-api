# is-odd-api
- Innovative
- Blazing fast

## Requiremets:
- To index 1 billion numbers in 15 minutes you will need: 
  - Approx. 350 GBs of RAM
  - 96 cores.
  
- Current usage for `is-odd-api-dev` is:
![htop-stat-dev](https://user-images.githubusercontent.com/108177877/189765914-191a62b2-cb58-4466-abd7-3f43d1ec64d5.png)

## API methods:
  
### `/isEven/{number}`
Can be used to determine whether or not the number is even.

**Returns:** ResponseNotFound or ResponseIsEven

### `/isOdd/{number}`
Can be used to determine whether or not the number is odd.

**Returns:** ResponseNotFound or ResponseIsOdd

### `/lastEven`
**Returns:** last indexed even number.

### `/lastOdd`
**Returns:** last indexed odd number.

## API objects:
### ResponseIsOdd
Property `odd` will be `true` if `{number}` is odd and `false` if `{number}` is even.
```json
{
  "odd": true
}
```

### ResponseIsEven
Property `even` will be `true` if `{number}` is even and `false` if `{number}` is odd.
```json
{
  "even": true
}
```

### ResponseNotFound
Returns when the number wasn't indexed yet.
```json
{
  "message": "This number is not indexed yet."
}
```
