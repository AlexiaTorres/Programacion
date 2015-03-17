import java.util.Comparator;
public class fechaYhora implements Comparator{
	public int compare(Object o1, Object o2) {
			PlazaAparcamiento p1 = (PlazaAparcamiento) o1;
			PlazaAparcamiento p2 = (PlazaAparcamiento) o2;
			
			if (p1.getFechaEntrada().getAño() != p2.getFechaEntrada().getAño()){
				return p1.getFechaEntrada().getAño() - p2.getFechaEntrada().getAño();
			}else{
				if (p1.getFechaEntrada().getMes() != p2.getFechaEntrada().getMes()){
					return p1.getFechaEntrada().getMes() - p2.getFechaEntrada().getMes();
					}else{
						if (p1.getHoraEntrada().getHora() != p2.getHoraEntrada().getHora()){
							return p1.getHoraEntrada().getHora() - p2.getHoraEntrada().getHora();
						}else{
							return p1.getHoraEntrada().getMinuto() - p2.getHoraEntrada().getMinuto();
						}
					}
				}
			}
			
		}