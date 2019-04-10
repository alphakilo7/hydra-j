# Hydra-Java
## RelativeLayout version1.0

As every Java and/or Android developer is aware that in Android programming there is a layout manager named *RelativeLayout*. As far as my knowledge about Java and Android is considered, *RelativeLayout* manager does not exist for standard java AWT, Swing, SWT. In this project, I tried to create a layout manager that works like Android's *RelativeLayout*. Although it is a layout, it actually isn't! It is actually a member method of *RelativeLayout* class that manages the relation of JComponents.  

The *RelativeLayout* has two methods.

`public void $(JComponent child, int position, JComponent parent);`  
`public void $(JComponent child, int position, JComponent parent, int gap);`  


### Using *RelativeLayout*
In order to use this layout.
1. import the class from package (Why am i tellin' this?).
2. create the object of RelativeLayout (!)
3. call the method '$(child, posit, parent)' or '$(child, posit, parent, gap)'
4. add the object (pt. 2) of the class to the container. [Checkout the example for clarification]
5. done!


If you like it, the please let me know! That would encourage me to do more as this is my first repository in Java :)
