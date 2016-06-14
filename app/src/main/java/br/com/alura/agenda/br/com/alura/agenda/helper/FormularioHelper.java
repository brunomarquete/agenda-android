package br.com.alura.agenda.br.com.alura.agenda.helper;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.R;
import br.com.alura.agenda.br.com.alura.agenda.activity.FormularioActivity;
import br.com.alura.agenda.br.com.alura.agenda.modelo.Aluno;

/**
 * Created by Bruno Marquete on 13/06/2016.
 */
public class FormularioHelper {

    Aluno aluno;

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {

        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
        aluno = new Aluno();

    }

    public Aluno getAluno() {
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNome(campoNome.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }

    public void preecheFormulario(Aluno aluno) {

        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        campoTelefone.setText(aluno.getTelefone());
        campoSite.setText(aluno.getSite());
        campoNota.setProgress(aluno.getNota().intValue());
        this.aluno = aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
