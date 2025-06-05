# Các công cụ trong Java

<strong>JDK (Java Development Kit):</strong> Bộ công cụ phát triển Java, bao gồm biên dịch, thư viện chuẩn và công cụ hỗ
trợ phát triển ứng dụng Java.

<strong>JRE (Java Runtime Environment):</strong> Môi trường chạy ứng dụng Java, bao gồm JVM và các thư viện hỗ trợ.

<strong>IDE (Integrated Development Environment):</strong> Các IDE phổ biến cho Java như IntelliJ IDEA, Eclipse, và
NetBeans giúp tăng năng suất khi phát triển ứng dụng Java.

# Lịch sử phát triển của Java

- 1991: Ra đời với tên gọi Oak bởi Sun Microsystem
- 1995: Đổi tên thành java (tên hòn đảo trồng cafe tại Indonesia) => logo của java
- 2010: Oracle mua lại

# Java Data Type

- **int** myNum = 5; -> Integer (whole number)
- **float** myFloatNum = 5.99f; -> Floating point number
- **char** myLetter = 'D'; -> Character
- **boolean** myBool = true; -> Boolean
- **String** myText = "Hello"; -> String

### Kiểu dữ liệu được chia thành 2 nhóm:

- **Primitive data types (dữ liệu nguyên thủy)** bao gồm: byte, short, int, long, float, double, boolean, char
- **Non-primitive data types hoặc Reference types** String, Arrays and Classes (sẽ học sau)

# Khái niệm về **Static** trong Java:

## 1. Biến static:

- Khi một biến được khai báo là static, nó sẽ là biến chung cho tất cả các đối tượng của lớp đó. Tất cả các đối tượng
  của
  lớp sẽ chia sẻ cùng một giá trị của biến static. Biến static sẽ được khởi tạo một lần duy nhất khi lớp được nạp vào bộ
  nhớ, thay vì mỗi khi tạo một đối tượng

## 2. Static Method

- Phương thức static là phương thức mà bạn có thể gọi mà không cần tạo một đối tượng của lớp. Thay vào đó, bạn có thể
  gọi phương thức static trực tiếp từ tên lớp.

## 3. Static Block

- Khối static là một đoạn mã được chạy một lần duy nhất khi lớp được nạp vào bộ nhớ (chỉ một lần duy nhất trong suốt quá
  trình chạy ứng dụng). Nó thường được sử dụng để khởi tạo các giá trị của các biến static.

### Lý do sử dụng **static**:

- Chia sẻ dữ liệu: Biến static cho phép chia sẻ dữ liệu giữa các đối tượng của lớp mà không cần phải sao chép giá trị
  của nó vào mỗi đối tượng.
- Tiết kiệm bộ nhớ: Khi bạn có nhiều đối tượng cần sử dụng chung một giá trị, việc sử dụng biến static giúp giảm thiểu
  việc cấp phát bộ nhớ cho mỗi đối tượng.
- Phương thức tiện ích: Phương thức static cho phép bạn gọi các hàm tiện ích mà không cần phải tạo đối tượng. Đây là lý
  do tại sao nhiều thư viện như Math hoặc Collections trong Java cung cấp các phương thức static.
- Khởi tạo trước khi tạo đối tượng: Các khối static giúp bạn thực hiện các thao tác khởi tạo một lần duy nhất trước khi
  có bất kỳ đối tượng nào của lớp.

# OOP: Object-Oriented Programming

* Lập trình Hướng Đối Tượng (OOP - Object-Oriented Programming) là một phương pháp lập trình trong đó các đối tượng (
  objects) và các lớp (classes) được sử dụng để tổ chức mã nguồn và dữ liệu. Java là một ngôn ngữ lập trình hoàn toàn
  hướng đối tượng. OOP giúp tổ chức mã nguồn rõ ràng, dễ duy trì, mở rộng và tái sử dụng. Dưới đây là các nguyên lý cơ
  bản
  của OOP trong Java:

