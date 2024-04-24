import numpy as np


def read_matrix(A: np.array, n:int):
    """ Módulo para leer una matriz con numpy

    Args:
        A (np.array): Variable matriz
        n (int): dimensión de la matriz - cuadrada
    """
    for i in range(0,n,1):
        for j in range(0,n,1):
            A[i][j] = int(input(f'Ingrese el valor de la pos {i,j}'))
        

def print_matrix(A: np.array, n:int):
    """ Módulo para imprimir una matriz con numpy

    Args:
        A (np.array): Variable matriz
        n (int): dimensión de la matriz - cuadrada
    """
    for i in range(0,n,1):
        for j in range(0,n,1):
            print(A[i][j], end='|')
        print("")
        

def sum_res_matrices(A:np.array, B:np.array, n:int, C:np.array, signo:int):
    """Módulo para sumar o restar dos matrices A - B = C

    Args:
        A (np.array): variable matriz
        B (np.array): variable matriz
        n (int): dimensión de las matrices
        C (np.array): A-B = C: variable matriz
        signo (int): para sumar: 1 , restar: -1
    """
    for i in range(n):
        for j in range(n):
            C[i][j] = A[i][j] + signo * B[i][j]


def mul_matrix(A:np.array, B:np.array, n:int, C:np.array):
    """_summary_

    Args:
        A (np.array): _description_
        B (np.array): _description_
        n (int): _description_
        C (np.array): _description_
    """
    for i in range(n):
        for j in range(n):
            for k in range(n):
                C[i][j] = C[i][j] + A[i][k] * B[k][j]


if __name__ == "__main__":
    n = int(input('Ingrese el valor de la dimensión de las matrices: '))
    # print(np.array[[1,2,3],[1,34,5]]) # {{1,2,4}}
    A = np.zeros((n,n), dtype=int)
    B = np.zeros((n,n), dtype=int)
    C = np.zeros((n,n), dtype=int)
    D = np.zeros((n,n), dtype=int)
    E = np.zeros((n,n), dtype=int)
    F = np.zeros((n,n), dtype=int)
    print("Lectura de la matriz A")
    read_matrix(A,n)
    print("Lectura de la matriz B")
    read_matrix(B,n)
    print("Matriz A:")
    print_matrix(A,n)
    print("Matriz B:")
    print_matrix(B,n)
    sum_res_matrices(A,B,n,C,1)
    mul_matrix(C,A,n,D)
    sum_res_matrices(A,B,n,E,-1)
    mul_matrix(E,B,n,F)
    print("(A+B)A")
    print_matrix(D,n)
    print("(A-B)B")
    print_matrix(F,n)
