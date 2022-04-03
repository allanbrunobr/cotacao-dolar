package br.com.abruno.client.services;

import java.text.ParseException;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.abruno.bcb.proxy.BCBCambioProxy;
import br.com.abruno.client.exceptions.DataInvalidaException;
import br.com.abruno.client.utils.Utils;

@ApplicationScoped
public class ClienteService {

	BCBCambioProxy bcbCambioProxy;

	public ClienteService(@RestClient BCBCambioProxy bcbCambioProxy) {
		super();
		this.bcbCambioProxy = bcbCambioProxy;
	}

	public String getPeriodoCotacao(String dataPeriodo) throws DataInvalidaException, ParseException {
		return bcbCambioProxy.getPeriodoCotacao(Utils.getDataAnterior(dataPeriodo), dataPeriodo);
	}

	public String getCotacaoData(String dataCotacao) {
		return bcbCambioProxy.getCotacaoData(dataCotacao);
	}

}
