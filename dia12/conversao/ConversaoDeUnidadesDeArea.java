package dia12.conversao;

public class ConversaoDeUnidadesDeArea {

    private static final double metro_Para_Pes = 10.76;
    private static final double pes_Para_Centimetros = 929;
    private static final double milha_Para_Acres = 640;
    private static final double acre_Para_Pes = 43_560;

    public static double metroParaPes(double metros){
        return metros * metro_Para_Pes;
    }

    public static double pesParaCentimetros(double pes){
        return pes * pes_Para_Centimetros;
    }

    public static double milhasParaAcres(double milhas){
        return milhas * milha_Para_Acres;
    }

    public static double acreParaPes(double acre){
        return acre * acre_Para_Pes;
    }

    public static void main(String[] args) {

        System.out.println(ConversaoDeUnidadesDeArea.metroParaPes(2));
        System.out.println(ConversaoDeUnidadesDeArea.pesParaCentimetros(2));
        System.out.println(ConversaoDeUnidadesDeArea.milhasParaAcres(2));
        System.out.println(ConversaoDeUnidadesDeArea.acreParaPes(2));

    }

}
