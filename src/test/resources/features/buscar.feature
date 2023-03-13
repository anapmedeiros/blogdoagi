# language: pt

  Funcionalidade: Testar o o botão pesquisar
    Eu como usuário do blog
    Quero fazer uma pesquisa no site
    Para achar artigos de interesse

    Cenário: Pesquisar conteúdo
      Dado que estou no site Blog da agi
      Quando clico na lupa no canto superior direito
      E escrevo uma palavra-chave válida
      Então aparece os artigos relacionados

    Cenário: Pesquisar conteúdo
      Dado que eu escrevo uma palavra-chave inválida
      Então aparece a mensagem de Texto nenhum resultado