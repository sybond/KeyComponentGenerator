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
## Features
- Support Single length, Double length, and Triple length keys
- Key check value calculation
- Odd parity check
- With Graphical User Interface
- Java, runs everywhere

## Credits
Graphical icon made by [madebyoliver](http://www.flaticon.com/authors/madebyoliver) from [www.flaticon.com](http://www.flaticon.com)
