# Is Odd API

*This 👈 is 🅱💰 a 🐍 simple API that 🍑 returns 💌 whether 📊📊 a 🔥 number 💦🔢 is 🙈💦 odd 🤥 or 💰 not. ♂ With 👏👼 this 🏽👈 API you 😭💄 can 💁🔫 check ✔ if ❗ a number ❤ is 💦 odd 🤥 or not. 🙅*\
*However, 💯 there's a 💰😾 twist 🔄🔄...*

Implementation in C (v2.0): [by hatkidchan](https://github.com/hatkidchan/is-odd-api-but-its-in-c)

## Features 📊

- Blazing 🔥🔥 fast 🏃🏃!
- Scalable 📈📈!
- Native 🇺🇸🇺🇸 support 🇺🇸🇺🇸 for 🇺🇸🇺🇸 all 🇺🇸🇺🇸 operating 🇺🇸🇺🇸 systems 🇺🇸🇺🇸!
- 100% 📈📈 uptime 📈📈!
- 100% 💯 vegan 🌱🌱🌱!
- 📊📊 Returns 💌 whether 📊📊 a 🔥 number 💦🔢 is 🙈💦 odd 🤥 or 💰 not.
- Easily 🙅🙅 check ✔ if ❗ a number ❤ is 💦 odd 🤥 or not.
- It's 🙈💦 free 🆓 and 🍑 open 📖 source 📖.
- It's 🙈💦 fast 🏃🏃.
- It's 😖➡ simple 🐍.
- It's 🙈💦 easy 🙅🙅 to 🍑 use 🍑.
- It's 😖➡ secure 🔒.
- It's 😖➡ reliable 📡.
- It's 😖➡ accurate 📊📊.
- It's 😖➡ fun 🎉.
- It's 😖➡ awesome 🤩.
- It's 😖➡ cool 😎.
- It's 😖➡ amazing 🤩.
- It's 😖➡ great 🙌.

*...and 🍑 much 🙈💦 more!*

###### *This description was generated by GitHub Copilot 🤖*

## Requirements 📋

### Example 🤔 System ✊✊ Configuration 🖥

- To 😫 index 1 ♂👵 billion numbers in 😍🌙 15 💵 minutes 🕘🕑 you 😘 will ❓ need:
  - Approximately 350 GBs of 🐲 RAM 👋
  - 96 cores of 🐲 CPU 🖥

## Screenshots 📷

Current usage for 👏 `is-odd-api-dev` is: 🗡
![htop-sv](https://user-images.githubusercontent.com/108177877/189773593-9d3fa1d5-99c9-4cbe-82a7-7cbe650792e9.png)

## API Methods 📡

### `/isEven/{number}`

Can be 😱🐝 used to 💦😂 determine 🤔 whether or 🅱 not 🚫♂ the 👏👽 number is 📃 even. 🆗🌃

**Returns:** [`ResponseNotFound`](#responsenotfound) 😳 or [`ResponseIsEven`](#responseiseven) 📊

### `/isOdd/{number}`

Can 🔫💦 be used 🙄😏 to determine 🧐 whether or 🔮💦 not ❌ the 👏 number 💦😧 is odd. 🤥😜

**Returns:** [`ResponseNotFound`](#responsenotfound) or [`ResponseIsOdd`](#responseisodd)

### `/lastEven`

**Returns:** last ⏳ indexed 🔎 even 🎭 number 💦🔢

### `/lastOdd`

**Returns:** last ⏳ indexed 🔎 odd 🤨 number 💦🔢

## API Objects 📦

### `ResponseIsOdd`

Property `odd` 😜 will 📃 be `true` if `{number}` 💦💦 is 😳 odd 😜 and 🗣👏 `false` if 👏 `{number}` is 🙈 even.

```json
{
  "odd": true
}
```

### `ResponseIsEven`

Property `even` 💁🌃 will be `true` ⭐☑ if 🚫🤥 `{number}` 🔢 is even and 👏👏 `false` 👳❌ if 👏 `{number}` is 😳 odd.

```json
{
  "even": true
}
```

### `ResponseNotFound`

Returns when 😤🕔 the 👩 number wasn't indexed yet. 👌❗

```json
{
  "message": "This number is not indexed yet."
}
```

## Liability 📜 and 🍑 Disclaimer 📜

This 👩😬 is 👏 a 😂🤡 joke project. ⬆ We 👧 decided to 💦 rent out 💯 the 🚀🏼 machine 💦 with 😲🙅 more ➕😖 than ⬆😽 a 1 TB of 🐲 RAM 👋 and 96 cores of 🐲 CPU 🖥 to 🍑 index 📊📊 all 🙈💦 numbers 📊📊 from 1 ♂👵 to 🍑 `long` ♂👵 maximum. 📊📊
