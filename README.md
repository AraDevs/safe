## About The Project

Safe is a simple library that allows you to access safely to nullable properties, without worrying
about null pointer exceptions. Currently supports most of the common types, including lists and maps
however if your needed type doesn't have a ```safe<Type>()``` function feel free to use the generic
``` .safe(default: T) ``` method.

## Getting started
Add JitPack repository to your root build.gradle file

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

Add the dependency

```groovy
dependencies {
    implementation 'com.github.aradevs:safe:1.0.2'
}
```

## Usage

You can use the safe functions to access nullable properties while avoiding null pointer exceptions. Avoiding the use of the !! operator.
For example:

This will throw a null pointer exception if the property is null

```kotlin
    val yourSuperMessage: String? = null
    Toast.makeText(this, yourSuperMessage!!, Toast.LENGTH_SHORT).show()
```

This will safely handle the null value and show a toast with the default value

```kotlin
    val yourSuperMessage: String? = null
    Toast.makeText(this, yourSuperMessage.safeString(), Toast.LENGTH_SHORT).show()
```

This will safely handle the null value and show a toast with your default value

```kotlin
    val yourSuperMessage: String? = null
    Toast.makeText(this, yourSuperMessage.safeString("Error!"), Toast.LENGTH_SHORT).show()
```

This will safely handle your custom objects!

```kotlin
    val yourSuperObject: MyObject? = null
    Toast.makeText(this, yourSuperObject.safe(MySuperObject()).value, Toast.LENGTH_SHORT).show()
```

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.
