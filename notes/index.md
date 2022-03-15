### variables
#### Naming convention:
- should start with letter, $, _
- should only contain char, digit, $, _
- Use full words instead of abbrevations
- camelCase
#### types:
- instance
- class
- local variable
- parameters
- constants
#### Data types:
- byte --> 1 byte
- short --> 2 bytes
- int --> 4 bytes
- long --> 8 bytes
- float --> 4 bytes
- double --> 8 bytes
- boolean --> not defined but uses 1 bit
- char --> 2 bytes (suuports 65535 chars) --> unicode \u0000 to \uffff
```
    default values:
        byte	0
        short	0
        int	0
        long	0L
        float	0.0f
        double	0.0d
        char	'\u0000'
        boolean	false
        String   null
        
        Note: Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable.
```

Literals:

        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

### Operators:
#### Assignment Operator
        =       Simple assignment operator
#### Arithmetic Operators
        +       Additive operator (also used
                for String concatenation)
        -       Subtraction operator
        *       Multiplication operator
        /       Division operator
        %       Remainder operator
#### Unary Operators
        +       Unary plus operator; indicates
                positive value (numbers are 
                positive without this, however)
        -       Unary minus operator; negates
                an expression
        ++      Increment operator; increments
                a value by 1
        --      Decrement operator; decrements
                a value by 1
        !       Logical complement operator;
                inverts the value of a boolean
#### Equality and Relational Operators
        ==      Equal to
        !=      Not equal to
        >       Greater than
        >=      Greater than or equal to
        <       Less than
        <=      Less than or equal to
#### Conditional Operators
        &&      Conditional-AND
        ||      Conditional-OR
        ?:      Ternary (shorthand for 
                if-then-else statement)
#### Type Comparison Operator
        instanceof      Compares an object to a specified type 
#### Bitwise and Bit Shift Operators
        ~       Unary bitwise complement
        <<      Signed left shift
        >>      Signed right shift
        >>>     Unsigned right shift
        &       Bitwise AND
        ^       Bitwise exclusive OR
        |       Bitwise inclusive OR