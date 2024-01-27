
# TCP,UDP

<br>

## 인터넷 프로토콜 스택의 4계층

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/02cbf17e-0d1b-4e38-a922-cef148249c9c)


<br>


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/2b04aeb7-4307-4a2d-b465-5db2aa6a6317)



<br>



## TCP
- Transmission Control Protocol
- 연결지향 TCP3 wah handshake(가상연결) 사용
- 데이터 전달이 보장되고, 순서도 보장.
   
<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5943bcf9-effa-47f1-aee7-b08e8de6a43f)



<br>

- 다음과 같이 SYN 접속 요청을하고 ACK 요청 수락을 하며 서로 3번주고 받아 안전하게 보낸다. 요새는 3번 ACK에 데이터를 전송한다.


  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c76225d9-daa3-4366-b431-d842f6a259cb)

  

<br>

<br>

## UDP
- User Datagram Protocol
- 데이터전달이 보증되지 않고, 순서보장도 되지 않지만 빠르다!!
- IP와 비슷하지만 PORT정도가 추가된다.
