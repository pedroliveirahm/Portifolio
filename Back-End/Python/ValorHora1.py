# horas_trabalhadas | salário_mensal -> valor por hora dia

def main():
    dias = 30
    salario_mensal = float(input("escreva qual seu salário mensal: "))
    horas_trabalhadas = float(input("escreva quantas horas você trabalha por dia: "))
    print("seu valor por hora dia é: ",salario_mensal/horas_trabalhadas/dias)
main()