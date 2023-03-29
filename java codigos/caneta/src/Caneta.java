public Caneta(String modelo, String cor, int carga, boolean tampada) {
    this.modelo = modelo;
    this.cor = cor;
    this.carga = carga;
    this.tampada = tampada;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public int getCarga() {
    return carga;
}

public void setCarga(int carga) {
    this.carga = carga;
}

public boolean isTampada() {
    return tampada;
}

public void setTampada(boolean tampada) {
    this.tampada = tampada;
}

public void status() {
    if(tampada) {
        System.out.println("Caneta tampada");
    } else {
        System.out.println("Caneta destampada");
    }
}
