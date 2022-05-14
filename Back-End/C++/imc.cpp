#include <string>
#include <iostream>

using namespace std;

int main()
{
    float altura, peso, imc;
    
    cout << "Bem vindo ao calculador de IMC" << endl;
    
    cout << "Digite a sua altura : ";
    cin >> altura;
    
    cout << "Digite seu peso : ";
    cin >> peso;
    
    imc = peso / altura / altura;
    
    if (imc >= 18.5 && imc <= 24.9) {
        cout << "Seu imc é: " << imc << ", o que é ideal para sua saúde";
    } else {
        cout << "Seu imc é: " << imc << ", o que está ruim para sua saúde";
    }
}
