/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulirsurveisiswa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class FormulirSurveiSiswaFacade extends AbstractFacade<FormulirSurveiSiswa> {

    @PersistenceContext(unitName = "formulirsurveiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormulirSurveiSiswaFacade() {
        super(FormulirSurveiSiswa.class);
    }
    
}
