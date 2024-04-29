import org.example.service.CurencyConverter_SvKr;

module org.example.consumer {
    requires org.example.service;
    uses org.example.service.CurencyConverter_SvKr;

}