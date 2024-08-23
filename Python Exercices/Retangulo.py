base: float
altura: float

base = float(input("Qual o valor da base? "))
altura = float(input("Qual o valor da altura? "))

calculoDaArea: float
calculoDaArea = base*altura
calculoDoPerimetro: float
calculoDoPerimetro = 2 * (base + altura)
calculoDaDiagonal = float
calculoDaDiagonal = ((altura ** 2 + base ** 2) ** (1/2))

print(f"Área = {calculoDaArea:.4f}")
print(f"Perimetro = {calculoDoPerimetro:.4f}")
print(f"Diagonal = {calculoDaDiagonal:.4f}")
