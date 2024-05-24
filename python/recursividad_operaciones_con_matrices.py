import numpy as np

def coeficiente_binomial(n:int,k:int):
    """combinatoria de n en k

    Args:
        n (int): total del conjunto
        k (int): cuántas tomo

    Returns:
        int: c(n,k)
    """
    if k==0 or k==n:# caso base
        return 1
    else:
        return coeficiente_binomial(n-1,k-1) + coeficiente_binomial(n-1,k) # llamado recursivo más pequeño


def leer_matriz_recursiva(A:np.array, n:int, m:int, i:int, j:int):
    if i<n:# tengo filas por recorrer
        if j < m:#tengo columnas por recorrer
            A[i][j] = int(input(f"Ingrese A[{i,j}]"))
            leer_matriz_recursiva(A,n,m,i,j+1)
        else:
            leer_matriz_recursiva(A,n,m,i+1,0)

def imprimir_matriz_recursiva(A:np.array, n:int, m:int, i:int, j:int):
    if i<n:# tengo filas por recorrer
        if j < m:#tengo columnas por recorrer
            print(A[i][j], end="|")
            imprimir_matriz_recursiva(A,n,m,i,j+1)
        else:
            print("")
            imprimir_matriz_recursiva(A,n,m,i+1,0)


def suma_resta_matriz_recursiva(A:np.array,B:np.array, n:int, m:int, i:int, j:int, s:int, C:np.array):
    if i<n:# tengo filas por recorrer
        if j < m:#tengo columnas por recorrer
            C[i][j] = A[i][j] + s * B[i][j]
            suma_resta_matriz_recursiva(A,B,n,m,i,j+1,s,C)
        else:
            suma_resta_matriz_recursiva(A,B,n,m,i+1,0,s,C)

def multiplicar_matriz_recursiva(A:np.array,B:np.array, n:int, m:int, i:int, j:int,k:int, C:np.array):
    if i<n:# tengo filas por recorrer
        if j < n:#tengo columnas por recorrer
            if k < m:
                C[i][j] = A[i][k] * B[k][j] + C[i][j]
                multiplicar_matriz_recursiva(A,B,n,m,i,j,k+1,C)
            else:
                multiplicar_matriz_recursiva(A,B,n,m,i,j+1,0,C)
        else:
            multiplicar_matriz_recursiva(A,B,n,m,i+1,0,0,C)

def transponer_matriz_recursiva(A:np.array, At:np.array, n:int, m:int, i:int, j:int):
    if i < n:# tengo filas por recorrer
        if j < m:#tengo columnas por recorrer
            At[j][i] = A[i][j]
            transponer_matriz_recursiva(A,At,n,m,i,j+1)
        else:
            transponer_matriz_recursiva(A,At,n,m,i+1,0)
        

if __name__ == "__main__":
    print(coeficiente_binomial(14,4))
    n = int(input('Ingrese el número de filas: '))
    m = int(input('Ingrese el número de columnas: '))

    A = np.zeros(shape=(n,m), dtype=int)
    B = np.zeros(shape=(n,m), dtype=int)
    C = np.zeros(shape=(n,m), dtype=int) # A+B =C
    D = np.zeros(shape=(n,m), dtype=int) # A-B =D
    AT = np.zeros(shape=(m,n), dtype=int) # AT
    BT = np.zeros(shape=(m,n), dtype=int) # BT
    E = np.zeros(shape=(n,m), dtype=int) # ATB =E
    F = np.zeros(shape=(n,m), dtype=int) # BTA = F
    G = np.zeros(shape=(n,m), dtype=int) # (ATB)(BTA)

    print("Leer matriz A")
    leer_matriz_recursiva(A,n,m,0,0)
    print("Leer matriz B")
    leer_matriz_recursiva(B,n,m,0,0)
    print("Matriz A")
    imprimir_matriz_recursiva(A,n,m,0,0)
    print("Matriz B")
    imprimir_matriz_recursiva(B,n,m,0,0)
    suma_resta_matriz_recursiva(A,B,n,m,0,0,1,C)
    print("Matriz A+B")
    imprimir_matriz_recursiva(C,n,m,0,0)
    suma_resta_matriz_recursiva(A,B,n,m,0,0,-1,D)
    print("Matriz A-B")
    imprimir_matriz_recursiva(D,n,m,0,0)
    transponer_matriz_recursiva(A,AT,n,m,0,0)
    transponer_matriz_recursiva(B,BT,n,m,0,0)
     # ATB =E
    multiplicar_matriz_recursiva(AT,B,m,n,0,0,0,E)
     # BTA =F
    multiplicar_matriz_recursiva(BT,A,m,n,0,0,0,F)
    multiplicar_matriz_recursiva(E,F,m,m,0,0,0,G)
    print("(ATB)(BTA)")
    imprimir_matriz_recursiva(G,m,m,0,0)
    #Tarea: estudiar y practicar los ejercicios en clase y terminar los enunciados

    # cadena = "paula"
    # print(cadena[0])