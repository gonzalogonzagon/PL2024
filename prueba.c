int operacion(int a, float b){
    a = a + 2;
    b = b - 3 / 2;
    return a + b;
}

void main(void){
//Prueba de expresiones y condiciones logicas
int a;
int c;
    if(a >= 3 || b <= c && c == 0 && !a < 2){
        int b;
        a = b * c + 2 - 8;
        b = a / 3 % 2;
    }else{
        c = 3 * operacion(a,b) / 8 % operacion(b,a);
    }
}
