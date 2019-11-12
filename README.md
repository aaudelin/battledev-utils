# Battle Dev utils

This program is a simple way to check whether your program is working and can be submited to the battle dev engine. 

Keep in mind that the tests samples can be different from what you can download and the actual tests on the battledev engine.
Thus, you might encounter times where your code is working locally but not on the battledev engine.

## How to use it

* Step 1 : Download the samples from battledev download feature
* Step 2 : Unzip the file to a desired folder, this is called the **testsFolder**
* Step 3 : Implement the algorithm in a java file. The class name is called the **programName** and is located in the **programFolder**
* Step 4 : Run the `Main.kt` with 3 arguments in the following order : **programName** **programFolder** **testsFolder**

## Debug and validate

In your program you can use `System.out.println` to print your result. You need only one result per exercise.

You can also use `System.err.println` to debug anything. You might use it to display the input you receive in your program.

Please refer to `IsoContest.java` sample file

## Results

Foreach exercise, if the result does not match the expected it is printed in the standard output.
If all exercices are ok a message will be printed.

You can now copy paste your program to the battledev engine !
