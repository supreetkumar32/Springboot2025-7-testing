# Springboot2025-7-testing

Common annotations:

• @Test: Marks a method as a test method. JUnit will execute this method when running
tests.
• @DisplayName: Sets a custom display name for the test class or test method. This name
is used in test reports and IDEs.
• @Disabled: Disables a test class or test method. Disabled tests are not executed.

• @BeforeEach: Indicates that the annotated method should be executed before each test method. These can
be used to reset each test case conditions.
• @AfterEach: Indicates that the annotated method should be executed after each test method.
• @BeforeAll: Indicates that the annotated method should be executed once before all test methods in the
class. The method must be static. (Executed once)
• @AfterAll: Indicates that the annotated method should be executed once after all test methods in the
class. The method must be static. (Executed once)
