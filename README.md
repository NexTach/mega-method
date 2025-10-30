# Mega-Method

> 상상하는 모든 함수가 여기에 있습니다.

## 개요

Mega-Method는 다양한 유틸리티 함수를 제공하는 Java 라이브러리입니다. JDK 21을 기반으로 하며 JitPack을 통해 쉽게 설치할 수 있습니다.

## 요구사항

- JDK 21 이상
- Gradle 8.5 이상

## 설치 방법

### Gradle 사용

**1단계:** `build.gradle`에 JitPack 저장소를 추가합니다:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

**2단계:** 의존성을 추가합니다:

```gradle
dependencies {
    implementation 'com.github.nextech:mega-method:1.0.0'
}
```

### Maven 사용

**1단계:** `pom.xml`에 JitPack 저장소를 추가합니다:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

**2단계:** 의존성을 추가합니다:

```xml
<dependency>
    <groupId>com.github.nextech</groupId>
    <artifactId>mega-method</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 사용 방법

```java
import com.nextach.megamethod.MegaMethod;

public class Example {
    static void main(String[] args) {
        // 인사 메시지 생성
        String greeting = MegaMethod.greet("세계");
        System.out.println(greeting); // 출력: Hello, 세계!

        // 덧셈
        int sum = MegaMethod.add(5, 3);
        System.out.println(sum); // 출력: 8

        // 회문 검사
        boolean isPalindrome = MegaMethod.isPalindrome("racecar");
        System.out.println(isPalindrome); // 출력: true
    }
}
```

## 빌드 방법

프로젝트를 빌드하려면:

```bash
./gradlew build
```

테스트를 실행하려면:

```bash
./gradlew test
```

로컬 Maven 저장소에 배포하려면:

```bash
./gradlew publishToMavenLocal
```

## 개발 환경

이 프로젝트는 다음을 사용합니다:
- Java 21
- Gradle 8.5
- JUnit 5 (테스트용)

## 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.

## JitPack 설정

이 프로젝트는 JDK 21을 사용하는 JitPack 배포용으로 구성되어 있습니다. `jitpack.yml` 파일은 빌드 중에 올바른 JDK 버전을 사용하도록 보장합니다.

## 기여

이슈 제보, 기능 제안 또는 Pull Request를 환영합니다!
