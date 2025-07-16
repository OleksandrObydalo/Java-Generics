package type_limiting;

class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

public class D<T extends A & B & C> {
    // ...
}
