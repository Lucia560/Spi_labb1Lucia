import org.example.service.CurencyConverter_SvKr;

module org.example.consumer {
    requires org.example.service;
    requires  org.example.provider;
    uses org.example.service.CurencyConverter_SvKr;
}