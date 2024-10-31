# 2024-JAVA
### 1. 자바 소스 파일 작성 및 컴파일
- `HelloWorld.java`라는 파일을 작성합니다.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- 이 파일을 저장한 후, 명령 프롬프트(cmd)에서 해당 디렉토리로 이동합니다.
- 다음 명령어를 입력하여 컴파일합니다:

```bash
javac HelloWorld.java
```
### 2. .class 파일 실행

- 컴파일이 완료되면, `HelloWorld.class` 파일이 생성됩니다.
- 다음 명령어를 입력하여 실행합니다:

```bash
java HelloWorld
```

### 3. 결과

- 위 명령어를 실행하면 다음과 같은 결과가 출력됩니다:

```bash
Hello, World!
```


### public private static

자바에서 public과 private는 접근 제어자(access modifier)로, 클래스, 메서드, 변수 등의 접근 범위를 결정합니다. 상속 여부와 관련이 있습니다:

- public: 모든 클래스에서 접근 가능.
- private: 해당 클래스 내에서만 접근 가능.

static 키워드는 클래스의 인스턴스(객체) 생성 여부와 관련이 있습니다:

- static: 클래스 레벨에서 접근 가능. 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있습니다.
- non-static: 인스턴스 레벨에서 접근 가능. 객체를 생성해야만 접근할 수 있습니다.
