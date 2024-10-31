## 목차
### 01 ~04
기본문법
### 05 ~ 08
객체지향

## JDK 구성
- **JDK(Java Development Kit)**: 자바 애플리케이션을 개발하는 데 필요한 도구가 제공됩니다.
  - 자바 컴파일러(javac): .java를 .class 파일로 컴파일 하고, 컴파일 에러를 찾아줍니다.
  - 자바 디버거(jdb): 런타임 에러를 찾아줍니다.
  - 그 외 다양한 개발 도구
  - JRE
- **JRE(Java Runtime Enviroment)**: 자바 런타임 환경으로, 자바 애플리케이션을 실행할 수 있도록 최소한의 환경을 제공합니다.
  - 자바 프로그램을 실행하는 데 필요한 라이브러리(.jar)
  - JVM
- **JVM(Java Virtual Machine)**: 자바 가상 머신
  

Os에 관계없이 컴파일 가능

## JDK 설치

## 이클립스 설치

## 이클립스 실행

1. *File - New - Java Project* 생성
2. *src - New - Class* 생성 (*public static void main(String[] args)* 체크)
3. `System.out.println("Hello, World");` 작성



```
package ch01;

public class hello {
	public static void main(String[] args) {
		System.out.println("Hello, World");
	}
}
```
