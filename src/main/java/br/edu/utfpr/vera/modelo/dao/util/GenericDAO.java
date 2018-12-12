package br.edu.utfpr.vera.modelo.dao.util;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GenericDAO<T> implements iDAO<T> {

    //private List<T> objetos = new ArrayList();
    EntityManager manager = ConexaoHibernate.getInstance();

    @Override
    public T save(T obj) {
        manager.getTransaction().begin();
        manager.persist(obj);
        manager.getTransaction().commit();
              
        System.out.println("Objeto adicionado!");
        return obj;
    }
    
    @Override
    public List<T> listAll(Class clazz) {
        
        Query query = manager.createQuery("SELECT p FROM " + clazz.getTypeName() + " p");
        List<T> pessoas = query.getResultList();
        return pessoas;
        //return objetos;
    }

    @Override
    public T listOne(int index) {
        T obj = null;
        try {
            //obj = objetos.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index não existente");
        }
        return obj;
    }
   

    @Override
    public T update(T obj) {
         manager.getTransaction().begin();
        manager.persist(obj);
        manager.getTransaction().commit();
        System.out.println(obj.getClass().getSimpleName() + " Atualização bem-sucedida!");
        
        return obj;
    }

    @Override
    public void delete(T obj) {
        manager.getTransaction().begin();
        manager.remove(obj);
        manager.getTransaction().commit();
        System.out.println(obj.getClass().getSimpleName() + " Exclusão bem-sucedida!");
    }

    @Override
    public void delete(int index) {
        try {
           // objetos.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Código inexistente, operação não realizada!");
        }
        
    }
}
