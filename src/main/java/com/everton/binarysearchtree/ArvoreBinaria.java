package main.java.com.everton.binarysearchtree;

public class ArvoreBinaria {
  BIntNo raiz;

  public ArvoreBinaria() {
      this.raiz = null;
  }

  public void inserirNo(int valor) {
      raiz = inserir(raiz, valor);
  }

  private BIntNo inserir(BIntNo arvore, int novoNo) {
      if (arvore == null) {
          return new BIntNo(novoNo);
      }
      if (novoNo < arvore.valor) {
          arvore.esq = inserir(arvore.esq, novoNo);
      } else {
          arvore.dir = inserir(arvore.dir, novoNo);
      }
      return arvore;
  }

  public void exibirNo() {
      System.out.print("Números em ordem crescente: ");
      exibirOrdem(raiz);
      System.out.println();
      System.out.print("Raiz: " + raiz.valor + "\n");
      System.out.print("Números em pós-ordem: ");
      exibirPosOrdem(raiz);
      System.out.println();
  }

  private void exibirOrdem(BIntNo arv) {
      if (arv != null) {
          exibirOrdem(arv.esq);
          System.out.print(arv.valor + " ");
          exibirOrdem(arv.dir);
      }
  }

  private void exibirPosOrdem(BIntNo arv) {
      if (arv != null) {
          exibirPosOrdem(arv.esq);
          exibirPosOrdem(arv.dir);
          System.out.print(arv.valor + " ");
      }
  }
}
