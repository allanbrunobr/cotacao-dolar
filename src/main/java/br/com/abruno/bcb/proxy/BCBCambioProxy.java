package br.com.abruno.bcb.proxy;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "bcb-banco")
public interface BCBCambioProxy {

	@GET
	@Path("CotacaoDolarPeriodo(dataInicial='{dataInicial}',dataFinalCotacao='{dataFinalCotacao}')")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getPeriodoCotacao(@PathParam("dataInicial") String dataInicial,
			@PathParam("dataFinalCotacao") String dataFinalCotacao);

	@GET
	@Path("CotacaoDolarDia(dataCotacao={dataCotacao})")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getCotacaoData(@PathParam("dataCotacao") String dataCotacao);
}
