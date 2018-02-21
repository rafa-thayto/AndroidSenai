package com.example.a06929749974.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

/**
 * Created by 06929749974 on 16/02/2018.
 */

public class FormularioAlunoHelper {

    private EditText nome;
    private EditText email;
    private EditText endereco;
    private EditText telefone;
    private RatingBar classificacao;

    @Override
    public String toString() {
        return "FormularioAlunoHelper{" +
                "nome=" + nome +
                ", email=" + email +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                ", classificacao=" + classificacao +
                '}';
    }


    public FormularioAlunoHelper(FormularioAlunoActivity formularioAluno) {
        nome = formularioAluno.findViewById(R.id.etNome);
        email = formularioAluno.findViewById(R.id.etEmail);
        endereco = formularioAluno.findViewById(R.id.etEnd);
        telefone = formularioAluno.findViewById(R.id.etTel);
        classificacao = formularioAluno.findViewById(R.id.rbClassificacao);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(email.getText().toString());
        aluno.setTelefone(endereco.getText().toString());
        aluno.setEmail(telefone.getText().toString());
        aluno.setClassificacao(Double.valueOf(classificacao.getProgress()));

        return aluno;
    }
}
