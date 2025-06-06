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

## 1. Lớp (Class) và Đối tượng (Object)

- **Lớp (Class):** Là một bản thiết kế (template) cho các đối tượng. Lớp định nghĩa các thuộc tính (fields) và phương
  thức (methods) mà đối tượng sẽ có.

- **Đối tượng (Object):** Là một thực thể cụ thể được tạo ra từ lớp, chứa các dữ liệu thực tế và có thể thực thi các
  phương thức của lớp.

## 2. Encapsulation (Đóng gói)

- **Encapsulation** là việc ẩn đi các chi tiết triển khai (implementation details) và chỉ cung cấp các phương thức công
  khai (public methods) để tương tác với đối tượng. Điều này giúp bảo vệ dữ liệu và đảm bảo tính toàn vẹn của chúng.

- **Getter và Setter** là các phương thức giúp truy cập và thay đổi giá trị của các thuộc tính trong lớp.

## 3. Inheritance (Kế thừa)

- **Inheritance** cho phép bạn tạo ra một lớp mới từ một lớp đã có, giúp tái sử dụng mã nguồn và mở rộng các tính năng
  của lớp cha. Lớp con kế thừa tất cả các thuộc tính và phương thức của lớp cha.

- **extends:** Dùng để khai báo kế thừa trong Java.

## 4. Polymorphism (Đa hình)

**Polymorphism** cho phép bạn sử dụng cùng một phương thức hoặc thuộc tính với nhiều hình thức khác nhau. Đa hình có thể
xảy ra dưới hai hình thức:

- **Method Overloading (Nạp chồng phương thức):** Khi bạn khai báo nhiều phương thức có cùng tên nhưng khác về số lượng
  hoặc kiểu tham số.

- **Method Overriding (Ghi đè phương thức):** Khi lớp con cung cấp một cài đặt cụ thể của phương thức đã được kế thừa từ
  lớp cha.

## 5. Abstraction (Trừu tượng)

**Abstraction** giúp ẩn đi các chi tiết cài đặt không cần thiết và chỉ cung cấp các thông tin quan trọng, cho phép người
dùng tương tác với đối tượng mà không cần biết cách thức hoạt động bên trong của nó. Trong Java, có hai cách để thực
hiện trừu tượng:

- **Lớp trừu tượng (Abstract Class):** Lớp không thể tạo đối tượng trực tiếp và có thể chứa các phương thức trừu tượng (
  chưa được cài đặt).

- **Giao diện (Interface):** Định nghĩa một tập hợp các phương thức mà các lớp phải cài đặt.