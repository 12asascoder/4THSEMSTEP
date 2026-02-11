# 4th Semester Java Programming Projects for SRMIST KTR

> **Programming Language:** ☕ **Java** - A robust, object-oriented programming language known for its platform independence, strong memory management, and extensive ecosystem.

## 📁 Project Overview

This repository contains a comprehensive collection of **Java programming assignments and implementations** for the 4th semester coursework. Each project demonstrates advanced data structures, algorithms, and system design concepts implemented in **pure Java**.

---

## 🚀 Featured Java Implementations

### **WEEK 1 Projects** (Current: 11.02.2026)

| **Java Class** | **Description** | **Key Concepts** |
|---------------|-----------------|------------------|
| 🔍 `AutocompleteSystem.java` | **Trie-based autocomplete system** with frequency tracking | Trie data structure, HashMap optimization, String processing |
| 🌐 `DNSCacheTTL.java` | **DNS resolver with TTL-based caching** | LinkedHashMap LRU, Time-based expiry, Caching strategies |
| ⚡ `MultiLevelCache.java` | **Multi-tier caching system** (L1, L2, DB) | Cache hierarchy, Performance optimization, Data retrieval |
| 🏃 `RateLimiter.java` | **Token bucket rate limiting** for API protection | Concurrency control, ConcurrentHashMap, Rate limiting algorithms |
| 🅿️ `ParkingLotOpenAddressing.java` | **Hash table parking system** with collision resolution | Open addressing, Hash functions, Collision handling |
| 🛍️ `FlashSaleInventoryManager.java` | **Concurrent inventory management** for flash sales | Thread-safe operations, AtomicInteger, Producer-consumer pattern |
| 📊 `RealTimeAnalyticsDashboard.java` | **Real-time data analytics** processing system | Stream processing, Real-time computation, Data aggregation |
| 🔒 `PlagiarismDetector.java` | **Document similarity detection** algorithm | String algorithms, Similarity metrics, Text analysis |
| 💳 `TransactionAnalyzer.java` | **Financial transaction processing** and analysis | Data processing, Pattern recognition, Financial algorithms |
| 👤 `UsernameAvailabilityChecker.java` | **Username validation and availability** checker | Input validation, Availability checking, User management |

---

## 🛠️ **Java Technical Features Demonstrated**

### **Core Java Concepts**
- ✅ **Object-Oriented Programming** (OOP) principles
- ✅ **Generic Collections Framework** (HashMap, LinkedHashMap, ConcurrentHashMap)
- ✅ **Concurrency & Thread Safety** (AtomicInteger, ConcurrentLinkedQueue)
- ✅ **Memory Management** and garbage collection awareness
- ✅ **Exception Handling** and robust error management

### **Advanced Data Structures**
- 🌳 **Trie** implementation for prefix matching
- 🗂️ **Hash Tables** with collision resolution strategies
- 📚 **Multi-level Caching** architectures
- 🔄 **LRU Cache** implementations
- 🪣 **Token Bucket** algorithms

### **Design Patterns & Architecture**
- 🏗️ **Factory Pattern** usage
- 🎯 **Strategy Pattern** for different algorithms
- 🔧 **Builder Pattern** for complex object creation
- 🎪 **Observer Pattern** for real-time updates

---

## 🏃‍♂️ **Getting Started with Java**

### **Prerequisites**
```bash
# Check Java installation
java --version
javac --version

# Required: Java JDK 17+ (recommended: Java 21 LTS)
```

### **Compilation & Execution**
```bash
# Navigate to project directory
cd "WEEK1 (11.02.2026)"

# Compile any Java file
javac ClassName.java

# Run the compiled program
java ClassName

# Example: Running the MultiLevelCache
javac MultiLevelCache.java
java MultiLevelCache
```

### **Java IDE Recommendations**
- 🔷 **IntelliJ IDEA** (Professional/Community)
- 🌙 **Eclipse IDE**
- 📝 **VS Code** with Java Extension Pack
- ⚡ **NetBeans IDE**

---

## 📚 **Learning Objectives**

### **Java Programming Mastery**
1. **Advanced Java Collections** - Efficient use of Java's built-in data structures
2. **Concurrent Programming** - Thread-safe implementations and parallel processing
3. **Algorithm Implementation** - Translating theoretical concepts into Java code
4. **System Design** - Building scalable and maintainable Java applications
5. **Performance Optimization** - Writing efficient Java code with proper memory usage

### **Problem-Solving Skills**
- 🧠 **Algorithmic Thinking** in Java context
- 🔧 **Code Optimization** techniques
- 🏗️ **System Architecture** design
- 🐛 **Debugging & Testing** strategies

---

## 🎯 **Java Best Practices Followed**

```java
// ✅ Proper Java naming conventions
public class MultiLevelCache {
    private final Map<String, String> cache;
    
    // ✅ Constructor initialization
    public MultiLevelCache() {
        this.cache = new ConcurrentHashMap<>();
    }
    
    // ✅ Method documentation and error handling
    public Optional<String> getValue(String key) {
        return Optional.ofNullable(cache.get(key));
    }
}
```

### **Code Quality Standards**
- 📝 **Javadoc** documentation
- 🔒 **Encapsulation** with proper access modifiers
- 🛡️ **Null safety** with Optional usage
- 🎯 **SOLID principles** adherence
- 🧪 **Unit testing** readiness

---

## 🚀 **Future Java Enhancements**

- [ ] **Spring Boot** integration for enterprise applications
- [ ] **JUnit 5** comprehensive testing suite
- [ ] **Maven/Gradle** build automation
- [ ] **Docker** containerization for Java apps
- [ ] **Microservices** architecture patterns
- [ ] **Java Streams API** for functional programming

---

## 📖 **Resources & References**

### **Java Documentation**
- 📚 [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- 🎓 [Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- 💡 [Effective Java (Joshua Bloch)](https://www.oreilly.com/library/view/effective-java/9780134686097/)

### **Algorithm Resources**
- 📖 [Algorithms, 4th Edition (Sedgewick & Wayne)](https://algs4.cs.princeton.edu/home/)
- 🔍 [LeetCode Java Solutions](https://leetcode.com/)
- 🏆 [GeeksforGeeks Java Programs](https://www.geeksforgeeks.org/java/)

---

## 👨‍💻 **Development Environment**

- **Language**: ☕ Java (JDK 17+)
- **Platform**: Cross-platform (Write Once, Run Anywhere - WORA)
- **IDE**: VS Code with Java Extension Pack
- **Build Tool**: javac (Java Compiler)
- **Version Control**: Git

---

## 📞 **Contact & Collaboration**

Feel free to explore these **Java implementations** and contribute improvements! Each file demonstrates practical applications of computer science concepts using **Java's powerful features**.

> **Note**: All implementations are written in **pure Java** without external dependencies, showcasing the language's built-in capabilities and standard library power.

---

**Happy Coding in Java! ☕✨**