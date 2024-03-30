/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.grin.tpcustomertsiory.service;

import fr.grin.tpcustomertsiory.entity.Discount;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 * Façade pour gérer les Discount.
 *
 * @author tsiory
 */
@RequestScoped
public class DiscountManager {

    @PersistenceContext(unitName = "discountPU")
    private EntityManager em;

    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    @Transactional
    public Discount update(Discount discount) {
        return null;
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }
}
