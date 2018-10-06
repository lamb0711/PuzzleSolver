# PuzzleSolver
sudoku, kakurasu, 3 in a raw 문제 해결

### 실행방법
본 프로그램은 apache cli 라이브러리를 사용하고 있다. 

1.	터미널을 켜고 다음 명령어를 입력한다.
<pre><code> git clone https://github.com/lamb0711/PuzzleSolver.git </code></pre>
2.	해결하고자 하는 input문제를 ./PuzzleSolver에 저장한다.
3.	우리는 이클립스를 이용하여 구현하였다. 그러니 이클립스 사용을 권장한다.
이클립스에서 마우스 오른쪽 버튼 -> import -> PuzzleSolver를 하여 PuzzleSover프로젝트를 이클립스에 추가한다.

### Mac
1. 스도쿠를 실행할 경우
hgu.cs.discretemathematics.hw1.sudoku 패키지 안에 있는 Main.java클래스 에서 실행한다.
이클립스의 run configuration에 <pre><code> -i input.txt </code></pre>을 한 후 코드를 실행한다.
예시 파일을 돌려보고 싶다면 다음과 같은 명령어를 run configuration에 설정해준다.
<pre><code>-i sudokuInput.txt </code></pre>

2.  Three_In_A_Row를 실행할 경우
hgu.cs.discretemathematics.hw1.tir 패키지 안에 있는 Three_In_A_Row.java클래스 에서 실행한다.
이클립스의 run configuration에 <pre><code> -i input.txt을 한 후 코드를 실행한다.
예시 파일을 돌려보고 싶다면 다음과 같은 명령어를 run configuration에 설정해준다.
<pre><code> -i 3nr.txt </code></pre>

3.  kakurasu를 실행할 경우
hgu.cs.discretemathematics.hw1.kakurasu 패키지 안에 있는 kaku.java class에서 실행한다.
이클립스의 run configuration에 <pre><code> -i input.txt </code></pre> 을 한 후 코드를 실행한다.
예시 파일을 돌려보고 싶다면 다음과 같은 명령어를 run configuration에 설정해준다.
<pre><code> -i kakurasuInput.txt </code></pre>

### Window
1. 스도쿠를 실행할 경우
Mac의 1과 같은 패키지에 있는 MainWin.java 클래스에서 실행한다. 같은 input option을 가진다.
2. kakurasu를 실행할 경우
Mac의 2와 같은 패키지에 있는 kaku.java.java 클래스에서 실행한다. 같은 input option을 가진다.
3.  3-in-row를 실행할 경우
Mac의 3과 같은 패키지에 있는 Tree_In_A_Raw_win.java 클래스에서 실행한다. 같은 input option을 가진다.

입력에 어려움을 격는다면 <pre><code> -h </code></pre> 옵션을 통해 도움을 받을 수 있다.
