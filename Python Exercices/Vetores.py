N:float = int(input(f"Quantos números serão digitados? "))
soma: float = 0
vet = [0 for x in range(N)]

for i in range(0, N):
    vet[i] = float(input(f"Escreva o {i+1}º número:"))

print("Valores: ")
for i in range(0, N):
    print(f"{vet[i]:.2f} ")
    
    soma = vet[i] + soma
    
print(f"Soma = {soma:.2f}")
media: float = soma/N
print(f"Média = {media}")
