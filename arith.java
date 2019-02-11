# arithematic
import java.io.*;
import java.util.*;
class CFG
{
static void printAP(int a, int d, int n)  
{
    int curr_term = 0; 
    for (int i = 1; i <= n; i++)  
    { 
    curr_term += d; 
    System.out.print(curr_term + " "); 
    } 
} 
public static void main(String[] args)  
{  
int a = 2; 
int d = 1;   
int n = 5;  
printAP(a, d, n); 
} 
} 
