package py.com.prestamos.service;

import py.com.prestamos.model.PrestamosPersona;
import py.com.prestamos.request.DatosClienteRequest;

public interface PrestamoService {
    PrestamosPersona consultarPrestamo(DatosClienteRequest request) throws Exception;

    DatosClienteRequest getParams(Integer moneda, String numeroDocumento, Integer paisDocumento, Integer tipoDocumento, Integer cuenta) throws Exception;
}
