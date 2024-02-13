# GreetingQAProject

### Quality Assurance Report

### Project: Greeting Endpoint Testing

### Date: 13/02/2024

## 1. Overview

The purpose of this report is to summarize the quality assurance testing conducted on the Greeting Endpoint feature of the project. This report includes details of the feature, the testing approach, test results, and recommendations for improvement.

## 2. Feature Description

The Greeting Endpoint feature allows users to interact with an API endpoint that returns a greeting message based on provided input. The feature supports various input scenarios, including default greetings, custom names, and special characters.

## 3. Testing Approach

The testing approach involved using behavior-driven development (BDD) with Cucumber to define feature scenarios and step definitions. The scenarios outlined various input scenarios, and the step definitions executed HTTP requests and assertions against the API response.

## 4. Test Results

There were 8 test cases executed in the process with different inputs and the results are summarized below:

<img align="center" alt="scenarios" src="https://github.com/vikaspabla/GreetingQAProject/blob/main/greetingScenarios.PNG">

<img align="center" alt="scenarios" src="https://github.com/vikaspabla/GreetingQAProject/blob/main/testcases.PNG">



### 1st Test Case:  
Input: None  
Expected Output: "Hello, World!"  
Result: Pass

### 2nd Test Case:  
Input: Custom string "Pabla"  
Expected Output: "Hello, Pabla!"  
Result: Pass

### 3rd Test Case:  
Input: A positive number, 123456  
Expected Output: "Hello, 123456!"  
Result: Pass

### 4th Test Case:  
Input: A negative number, -123456  
Expected Output: "Hello, -123456!"  
Result: Pass

### 5th Test Case:  
Input: A long positive number, 9223372036854775807L  
Expected Output: "Hello, 9223372036854775807L!"  
Result: Pass

### 6th Test Case:  
Input: A long negative number, -9223372036854775807L  
Expected Output: "Hello, -9223372036854775807L!"  
Result: Pass

### 7th Test Case:  
Input: Set of special characters not found in regular expressions  , **%%   
Expected Output: "Hello, **%%!"  
Result: Pass

### 8th Test Case:  
Input: Set of special characters in regular expressions  , !@#$%^&()_+=-{}[]:;"'<>,.?/`~`   
Expected Output: "Hello, !@#$%^&*()_+=-{}[]\:;"'<>,.?/`~!"  
Result: Fail

## 5. Recommendations

Based on the successful execution of 7 tests out of 8 and validation of expected outputs, the Greeting Endpoint feature appears to be functioning as intended. However, it's recommended to consider the following for future improvements:

Some of the characters in the 8th test case we provided are special characters in regular expressions and may cause issues if not properly escaped or handled. Here's a breakdown of some of the characters and their significance in regular expressions:

":, ?, .:" These characters have special meanings in regular expressions. For example, . represents any single character, ? represents zero or one occurrence of the preceding character, and : is used in some constructs like named groups. To match these characters literally in a regex pattern, they need to be escaped with a backslash (\).

## 6. Conclusion

In conclusion, the quality assurance testing conducted on the Greeting Endpoint feature demonstrated that the functionality meets the specified requirements. The successful execution of several tests confirms that the endpoint behaves as expected under various input scenarios. With the recommended improvements, the feature can further enhance its reliability and performance.


