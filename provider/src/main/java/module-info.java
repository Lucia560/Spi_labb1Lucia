import org.example.provider.EuroToSwedishKr;
import org.example.provider.RonToSwedishKr;
import org.example.service.CurencyConverter_SvKr;

module org.example.provider {
    requires org.example.service;
    provides CurencyConverter_SvKr with EuroToSwedishKr, RonToSwedishKr;
}