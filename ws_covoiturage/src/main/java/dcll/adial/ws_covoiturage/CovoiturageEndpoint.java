package dcll.adial.ws_covoiturage;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.XPathParam;
import org.w3c.dom.Element;

/**
 * Hello world!
 *
 */
@Endpoint
public class CovoiturageEndpoint {
    private CovoiturageService CovoiturageService;

    private static final String NAMESPACE_URI = "http://dcll/adial/ws_covoiturage/machin";

    public CovoiturageEndpoint(CovoiturageService CovoiturageService) {
        this.CovoiturageService = CovoiturageService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CovoiturageRequest")
    @ResponsePayload
    public Element handleCovoiturageRequest(@XPathParam("/CovoiturageRequest/Nom") String nom,
                                            @XPathParam("/CovoiturageRequest/Prenom") String prenom,
                                            @XPathParam("/CovoiturageRequest/Adresse") String adresse) throws Exception {

/*        // parse le XML de CovoiturageRequest pour extraire les informations de
        // l'année scolaire, du niveau et du semestre et creer les objets ad-hoc
        AnneeScolaire anneeScolaire = new AnneeScolaire(anneeScol);
        Niveau niveau = new Niveau(niveauCode);
        Semestre semestre = new Semestre(semestreId);
*/
    	Inscrit ins = new Inscrit(nom, prenom, adresse);
/*
        // invoque le service "Covoiturageervice" pour récupérer les objets recherchés
        //
        List<Evaluation> evals = CovoiturageService.findAllEvaluationsForAnneeScolaireNiveauAndSemestre(anneeScolaire, niveau, semestre);
*/
        // Transforme en élément XML ad-hoc pour le retour
        //
        Element elt = XmlHelper.getRootElementFromFileInClasspath("Covoiturage.xml") ;
        return elt;

    }
}