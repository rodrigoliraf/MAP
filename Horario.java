public class Horario {
    private String dia;
    private String horaInicio;
    private String horaFim;

    public Horario(String dia, String horaInicio, String horaFim) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    @Override
    public String toString() {
        return "" +
                "Dia: " + dia +
                " HoraInicio: " + horaInicio +
                " HoraFim: " + horaFim;
    }
}