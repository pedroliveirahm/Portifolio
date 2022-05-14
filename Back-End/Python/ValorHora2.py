# horas_trabalhadas | salário_mensal -> valor por hora dia

def main():
 horas_trabalhadas = input("escreva quantas horas você trabalha por dia: ")
 salario_mensal = input("escreva seu salário mensal: ")
 dias = 30
 print("seu valor por hora dia é: ", float(salario_mensal)/float(horas_trabalhadas)/int(dias))
main()