# mega-method

상상하는 모든 함수가 여기에 있습니다.

## Overview

mega-method는 다양한 유틸리티 함수를 제공하는 Java 라이브러리입니다. JDK 21을 기반으로 하며 JitPack을 통해 배포됩니다.

## Requirements

- JDK 21 or higher
- Gradle 8.5 or higher

## Installation

### Using Gradle

**Step 1:** Add JitPack repository to your `build.gradle`:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

**Step 2:** Add the dependency:

```gradle
dependencies {
    implementation 'com.github.NexTach:mega-method:1.0.0'
}
```

### Using Maven

**Step 1:** Add JitPack repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

**Step 2:** Add the dependency:

```xml
<dependency>
    <groupId>com.github.NexTach</groupId>
    <artifactId>mega-method</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```java
import com.nextach.megamethod.MegaMethod;

public class Example {
    public static void main(String[] args) {
        // Greeting
        String greeting = MegaMethod.greet("World");
        System.out.println(greeting); // Output: Hello, World!
        
        // Addition
        int sum = MegaMethod.add(5, 3);
        System.out.println(sum); // Output: 8
        
        // Palindrome check
        boolean isPalindrome = MegaMethod.isPalindrome("racecar");
        System.out.println(isPalindrome); // Output: true
    }
}
```

## Building

To build the project:

```bash
./gradlew build
```

To run tests:

```bash
./gradlew test
```

To publish to local Maven repository:

```bash
./gradlew publishToMavenLocal
```

## Development

This project uses:
- Java 21
- Gradle 8.5
- JUnit 5 for testing

## License

This project is available as open source.

## JitPack Configuration

This project is configured for JitPack deployment with JDK 21. The `jitpack.yml` file ensures that JitPack uses the correct JDK version during build.
