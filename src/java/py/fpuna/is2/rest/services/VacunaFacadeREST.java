package py.fpuna.is2.rest.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import py.fpuna.is2.rest.entities.Vacuna;

/**
 *
 * @author Diana Franco
 */
@Stateless
@Path("vacunas")
public class VacunaFacadeREST extends AbstractFacade<Vacuna> {

    @PersistenceContext(unitName = "WebServiceAppRestIS2PU")
    private EntityManager em;

    public VacunaFacadeREST() {
        super(Vacuna.class);
    }

    @POST
    @Path("crear")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public void create(Vacuna entity) {
        super.create(entity);
    }

    @PUT
    @Path("editar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public void edit(Vacuna entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("eliminar/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("consultar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Vacuna find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("todos")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Vacuna> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
