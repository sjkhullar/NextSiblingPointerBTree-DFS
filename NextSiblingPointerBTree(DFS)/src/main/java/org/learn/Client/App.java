package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.Question.NextSiblingPointer;

public class App 
{
	public static void main( String[] args )
    {		
       /*
        			 1
        		   /   \	
                  2     3
              	 / \   / \ 
              	4   5 6   7       
        
        */
		Node root = Node.createNode(1);
		root.left = Node.createNode(2);
		root.right = Node.createNode(3);
		// left sub tree
		root.left.left = Node.createNode(4);
		root.left.right = Node.createNode(5);

		// right subtree
		root.right.left = Node.createNode(6);
		root.right.right = Node.createNode(7);

    	NextSiblingPointer.nextSiblingPointer(root);    	
    	NextSiblingPointer.printUsingNextSibling(root);    
    }
}
