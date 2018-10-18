package com.scp.Programs_60;

public class MatrixOperations 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int[][] martix1= {{1,2},{2,3},{3,4}}; //3x2
		int[][] martix2= {{4,5},{5,6},{6,7}}; //3x2
		int[][] martix3= {{7,8,9},{8,9,10}}; //2x3
		
		//MatrixAddition(martix1, martix2, 3, 2);
		//MatrixSubtraction(martix2, martix1, 3, 2);
		//MatrixMultiplication(martix1, 3, 2, martix3, 2, 3);
		MatrixTranspose(martix1, 3, 2);
	}
	
	public static void MatrixAddition(int[][] martix1,int[][] martix2,int rows,int columns) 
	{
		int[][] result= new int[rows][columns];
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++)
			{
				result[i][j]=martix1[i][j]+martix2[i][j];
			}
		}
		MatrixDisplay(result, rows, columns);
	}
	
	public static void MatrixSubtraction(int[][] martix1,int[][] martix2,int rows,int columns) 
	{
		int[][] result= new int[rows][columns];
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++)
			{
				result[i][j]=martix1[i][j]-martix2[i][j];
			}
		}
		MatrixDisplay(result, rows, columns);
	}
	
	public static void MatrixMultiplication(int[][] martix1,int matrix1rows,int matrix1columns,int[][] martix2,int matrix2rows,int matrix2columns) 
	{
		if(matrix1columns!=matrix2rows)
		{
			System.out.println("Cannot Multiply");
			return;
		}
		
		int[][] result= new int[matrix1rows][matrix2columns];
		
		for (int i = 0; i < matrix1rows; i++) 
		{
			for (int j = 0; j < matrix2columns; j++) 
			{
				for (int k = 0; k < matrix1columns||k < matrix2rows; k++) 
				{
					result[i][j]+=martix1[i][k]*martix2[k][j];
				}
			}
		}
		MatrixDisplay(martix1, matrix1rows, matrix1columns);
		MatrixDisplay(martix2, matrix2rows, matrix2columns);
		MatrixDisplay(result, matrix1rows, matrix2columns);
	}
	
	public static void MatrixTranspose(int[][] martix,int rows,int columns) 
	{
		int[][] result=new int[columns][rows];
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				result[j][i]=martix[i][j];
			}
		}
		MatrixDisplay(martix, rows, columns);
		MatrixDisplay(result, columns, rows);
	}
	
	public static void MatrixDisplay(int[][] result,int rows,int columns) 
	{
		System.out.println("Result : ");
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print("\t"+result[i][j]);
			}
			System.out.println();
		}
	}
}

