# Key Component Generator

![](https://raw.githubusercontent.com/sybond/KeyComponentGenerator/master/Screenshot%20from%202016-10-23%2014-16-02.png)

*Key Component Generator* is simple tool to generate new key component from single key.
By normal condition during key ceremonies, a key custodians will generate their own key component, and in the end HSM will calculate the key components into single master key then encrypt it using HSM's LMK.

```
Key Component - 1
Key Component - 2    --> (XOR) --> Single Master Key
   ...
Key Component - n
```

This tools help you to recreate a new random key components (up to 9 components) of a single master key. Every single key component will be guaranteed in form of *odd parity*, that will be safely accepted by most HSM.

```
                                                  Key Component - 1
Single Master Key  --> KeyComponentGenerator -->  Key Component - 2
                                                        ...
                                                  Key Component - n
```
For example, we have single master key: `1C1C1C1C1C1C1C1C`. We want to generate random 5 key component from the master key.
Here is sample result using this tool.

```
Key Component #1=374CF23D577AE6BF KCV=E6032E
Key Component #2=3E8946529237C198 KCV=4923F5
Key Component #3=2F61EC9D7304D53E KCV=B282D9
Key Component #4=046832BC3E9EA49B KCV=ED3125
Key Component #5=3ED0765294CB4A9E KCV=8F4690

Done in 9 milisecond(s)
```

## Console Support
In console mode you can generate up to 99 key component, which is enormous useless :P

Here is the syntax for generating key component from console:
```
Usage: KeyComponentGenerator.jar KEY_INPUT NUM_OF_COMPONENT

KEY_INPUT         A key represented in hex-string. For example:
                  1c1c1c1c1c1c1c1c or 1C1C1C1C1C1C1C1C or 1C1c1c1C1C1c1c1C
                  Any input with invalid key size will be padded
                  by (byte)0x00 until meet the correct length.

NUM_OF_COMPONENT  Number of component to be generated. Valid values
                  are 2 to 99. But it is useless since HSM normally
                  support only (max) 9 key component.

More helps please visit http://sybond.web.id.
```

Example executing Key Component Generator in console mode:
```
java -jar KeyComponentGenerator.jar 1c1c1c1c1c1c1c1c 9
Key Component Generator v1.2
Copyright (c) 2014 Bondan Sumbodo <sybond@gmail.com>

- Input key check value: 77800C, is Odd Parity: true
- Key Component #01 = E931A7255B13BF4C KCV = AB8814
- Key Component #02 = 3804AB79791F89BA KCV = 763B83
- Key Component #03 = 9B347562265B4F5E KCV = DEDC9E
- Key Component #04 = C1EABF1CCBB5FDE6 KCV = 9E2615
- Key Component #05 = D6B50E8FFB0DD5E3 KCV = C14132
- Key Component #06 = 4A7FD52525A14562 KCV = 24EF18
- Key Component #07 = 40C78949DFD61F9D KCV = F8902E
- Key Component #08 = 8AF22FEFA432AED5 KCV = 21EDE2
- Key Component #09 = C108A73276B6B99B KCV = 6CCCF8
```

## Features
- Support Single length, Double length, and Triple length keys
- Key check value calculation
- Odd parity check
- With Graphical User Interface; enabled console mode for scripting support
- Java, runs everywhere

## Credits
Graphical icon made by [madebyoliver](http://www.flaticon.com/authors/madebyoliver) from [www.flaticon.com](http://www.flaticon.com)
