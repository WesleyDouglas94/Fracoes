package com.example.fraes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class QuestoesAvaliacao extends AppCompatActivity {

    // Declare suas variáveis PieChart
    private PieChart graficoPizza1;
    private PieChart graficoPizza2;

    // Declare outras variáveis e views necessárias

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes_avaliacao);

        // Inicialize suas variáveis PieChart
        graficoPizza1 = findViewById(R.id.grafico_pizza1);
        graficoPizza2 = findViewById(R.id.grafico_pizza2);

        //GRAFICO 1

        ArrayList<PieEntry> entradasGrafico1 = new ArrayList<>();
        entradasGrafico1.add(new PieEntry(1/3f, "1/3"));
        entradasGrafico1.add(new PieEntry(2/3f, "2/3"));
        entradasGrafico1.add(new PieEntry(3/3f, "3/3"));

        PieDataSet dataSetGrafico1 = new PieDataSet(entradasGrafico1, " ");
        dataSetGrafico1.setColors(ColorTemplate.COLORFUL_COLORS); // Cores predefinidas

       // dataSetGrafico1.setDrawValues(false);


        PieData dataGrafico1 = new PieData(dataSetGrafico1);
        graficoPizza1.setData(dataGrafico1);
        graficoPizza1.setDescription(null);
        graficoPizza1.invalidate(); // Atualiza o gráfico
        graficoPizza1.setDrawEntryLabels(true);


        // GRAFICO 2

        // Configurar dados para o segundo gráfico de pizza
        ArrayList<PieEntry> entradasGrafico2 = new ArrayList<>();
        entradasGrafico2.add(new PieEntry(1/5f, "1/5"));
        entradasGrafico2.add(new PieEntry(2/5f, "2/5"));
        entradasGrafico2.add(new PieEntry(3/5f, "3/5"));
        entradasGrafico2.add(new PieEntry(4/5f, "4/5"));
        entradasGrafico2.add(new PieEntry(5/5f, "5/5"));

        PieDataSet dataSetGrafico2 = new PieDataSet(entradasGrafico2, " ");
        dataSetGrafico2.setColors(ColorTemplate.COLORFUL_COLORS); // Cores predefinidas

        PieData dataGrafico2 = new PieData(dataSetGrafico2);

        graficoPizza2.setData(dataGrafico2);
        graficoPizza2.invalidate(); // Atualiza o gráfico
        graficoPizza2.setDescription(null);
        graficoPizza2.setDrawEntryLabels(true);
        //dataSetGrafico2.setDrawValues(false);




        graficoPizza1.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                // Obtenha o valor selecionado pelo usuário no gráfico de pizza 1
                int valorSelecionadoGrafico1 = (int) e.getY();

                // Mostre o feedback ao usuário
                Toast.makeText(QuestoesAvaliacao.this, "Opção selecionada no grafico 1", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected() {
            }
        });

        graficoPizza2.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                // Obtenha o valor selecionado pelo usuário no gráfico de pizza 2
                int valorSelecionadoGrafico2 = (int) e.getY();

                // Mostre o feedback ao usuário
                Toast.makeText(QuestoesAvaliacao.this, "Opção selecionada no grafico 2", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });

        Button btnProximaEtapa = findViewById(R.id.btnProxima_etapa);
        btnProximaEtapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lide com a mudança para a próxima etapa da pergunta
            }
        });

    }

    // Método para verificar a resposta do usuário e mostrar o feedback


}

