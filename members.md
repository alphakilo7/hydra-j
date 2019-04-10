# Members of *RelativeLayout*  

## Member Methods  

### `public void $(JComponent child, int position, JComponent parent)`  
This method, as can be observed, takes three parameters to work.  

`JComponent child`  : This is the component to be placed relative to something.  
`int position`      : This is the position relative to the parent (top, bottom, left, right).  
`JComponent parent` : The parent to which child will be relative.  

The default gap between two components is 15px. For custom gap, the second method of the same name can be used.  

### `public void $(JComponent child, int position, JComponent parent, int gap);`  
This method is same as above one, but it takes on parameter extra.  

`int gap` : This is the custom gap between two components.  

***
## Member Variables

### `public static int TOP`  
`value = 1`
Specifies child on top of parent.  
### `public static int BOTTOM`  
`value = 2`  
Specifies child at the bottom of parent  
### `public static int LEFT`  
`value = 3`  
Specifies child on the left of the parent  
### `public static int RIGHT`  
`value = 4`  
Specifies child on the right of the parent
