// EmpresaModel.ts
export class EmpresaModel {
    id: number;
    nome: string;
    ramo: string;

    constructor(nome: string, ramo: string, id: number = 0) {
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
    }
}
