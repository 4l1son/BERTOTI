export interface EquipeModel {
    id: number;
    liderNome: string;
    funcionarios: FuncionarioModel[];
  }
  
  export interface FuncionarioModel {
    id: number;
    name: string;
  }
  