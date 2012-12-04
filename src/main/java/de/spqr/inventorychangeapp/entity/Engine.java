/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.inventorychangeapp.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Entity class of a part you need to build a car
 * @author said
 */
@Entity
public class Engine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
	private int engineID;
	private String producer;		
	
	public Engine(){
		
	}

    public int getEngineID() {
        return engineID;
    }

    public void setEngineID(int engineID) {
        this.engineID = engineID;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Engine)) {
            return false;
        }
        Engine other = (Engine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.spqr.activitiderbysoapservice.entity.Engine[ id=" + id + " ]";
    }
    
}
