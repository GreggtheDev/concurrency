
# Producer-Consumer Problem in Java

This project demonstrates a simple implementation of the Producer-Consumer problem using Java threads, synchronization, and the `wait()` and `notifyAll()` methods.

## Project Structure

- **src/main/java/org/example/SharedBuffer.java**: Defines the `SharedBuffer` class, which handles the shared buffer between the producer and consumer threads.
- **src/main/java/org/example/Producer.java**: Implements the `Producer` class, which generates random numbers and adds them to the shared buffer.
- **src/main/java/org/example/Consumer.java**: Implements the `Consumer` class, which retrieves numbers from the shared buffer and calculates their sum.
- **src/main/java/org/example/Main.java**: Contains the `Main` class, which sets up and starts the producer and consumer threads.

## Classes

### SharedBuffer

The `SharedBuffer` class manages a buffer with a specified maximum size and provides synchronized methods to add and remove elements. It uses `wait()` and `notifyAll()` for thread coordination.

### Producer

The `Producer` class implements the `Runnable` interface and generates random numbers, adding them to the shared buffer using the synchronized `add` method of `SharedBuffer`.

### Consumer

The `Consumer` class implements the `Runnable` interface and retrieves numbers from the shared buffer using the synchronized `remove` method of `SharedBuffer`. It calculates and prints the sum of the retrieved numbers.

## Usage

1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Compile the project:**
   ```sh
   javac src/main/java/org/example/*.java
   ```

3. **Run the `Main` class:**
   ```sh
   java -cp src/main/java org.example.Main
   ```

## Example Output

```
Produced: 42
Produced: 15
Consumed: 42, Current Sum: 42
Produced: 87
Consumed: 15, Current Sum: 57
Produced: 33
Consumed: 87, Current Sum: 144
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

```

This `README.md` file provides an overview of the project, its structure, usage instructions, and an example output. You can customize it further based on any additional details or instructions specific to your project.
