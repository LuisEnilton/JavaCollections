import string
with open("leipzig100k.txt", "r") as input_file:
    lines = input_file.readlines()
    
    texto = ''
    for l in lines:
        texto = texto + l 
#print(texto)
palavras= texto.split()
#print(palavras)
palavras_sem_pontuacao = []
    # Remove a pontuação e vírgulas usando o método translate() da classe str
palavras_sem_pontuacao = [palavra.translate(str.maketrans('', '', string.punctuation)) + '\n' for palavra in palavras]
    # Adiciona a palavra sem pontuação à nova lista

print(palavras_sem_pontuacao)

with open("palavras.txt", "w") as input_file:
    input_file.writelines(palavras_sem_pontuacao)
    