package org.example;

import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ** 연산자
        // 산술연산자
        // +, -, *, /, %, (= 대입연산자)

        // 비교연산자
        // <,>,<=,>=

        // 논리연산자
        // ==, !=, !, &&, ||, &, |

        // 분기문 (예외처리)
        // if ~ else, switch ~ case

        // ** 반복문
        // for, while



        // ** 배열
        // Java식 표현 : int [] array = new int[10];
        // C식 표현 : int array[10];
        // 이게 왜 다르냐면 자바는 int[] array = new int[10];에서 int[](자료형)부터 모든게 객체이기 때문임


        // ====================
        // C의 진입점(Java랑 똑같이 main이고, 진입점은 하나임)
        // int main(void)
        //{ //**  대한민국 영역 
            //Output();
            // int index = 10;

            //{ // ** 서울영역
                //int a = 3; 
                //index -= a; // 10에서 3을 빼서 그 값을 index에 대입해라
            //}

            //{ //** 대전 영역
                //int b = 2 + a; // 여기서 a를 못씀 왜냐면 a는 다른 영역에서 선언된 변수이기 때문임
                //index -= b;
            //} 
            
            //{ // ** 강원 영역
                // int c = 1;
                // index -= c;

            //}

            //{ ** 춘천영역
    
            //}
    
            //{ // ** 광주 영역
    
            //}
                
            //} // ** 부산 영역

            // }

        // return 0;
        
        
        // ============== 응용버전 ========
        
        
        //(1)
        //class Member // 멤버 클래스가 있다면
        //{
            
        //}
        
         //Member OutputMember() // 멤버 클래스를 반환하는 함수도 쓸 수 있다고 함
        //{
            // return Member();  
        //}

        //(2)
        //int Output() // 멤버 클래스가 있다면
        //{
            //short s = 10;
            //return s; // ** 이거 반환 안된다고 함
                        // 같은 정수라고 무조건 반환되는게 아님
                        // 반환타입과 반환값의 형태가 무조건 같아야한다고 함
                        // 같은 정수형태여도 데이터타입이 다르면 반환안됨
                        // 데이터타입이 무조건 완벽하게 같아야함 
                        // 반환타입이 업캐스팅(상위호환형태)여라고해서 하위호환의 반환값을 반환할 수 있는게 아니라고 함
                        // 왜냐면 자바는 int도 객체로 보기 때문임
        //}

        /*
        int i = 10;
        int i : l 벨류라고 부름(보편적으로 l벨류를 변수라고 부름)
        10 : r 벨류라고 부름 (상수라고 부름)
        */

        /*
        int value = 10; // 10이 정수라서 상수가 아니라 오른쪽에 있고 처음 이 값이 등장했기 때문에 이 값이 상수임
        int a = 2; // 2가 상수임
        int c = value; // 근데 이 코드에서 무조건 r벨류를 상수라고 부를 순 없다고 함 왜냐면 그 전에 변수(l변수)였기 때문임
        value -= c; // 그리고 여기선 다시 변수(l벨류)임
         */
        
        /* 
        this.academy = academy;
        this.address = address; 에서는 r벨류가 상수가 아니라 변수임 
        그래서 무조건 r벨류가 상수라고 말할 수는 없지만 보편적으로는 r벨류가 상수임
         */
    }

}