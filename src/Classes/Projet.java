package Classes;


import Classes.Membre;
import Classes.Discipline;
import java.util.*;

/**
 *
 */
public class Projet {

    /**
     * Default constructor
     */
    public Projet() {
    }

    /**
     *
     */
    public String titre;

    /**
     *
     */
    public String client;

    /**
     *
     */
    public String date_debut;

    /**
     *
     */
    public String date_fin;

    /**
     *
     */
    public Discipline discipline;

    /**
     *
     */
    public Membre membre;

    /**
     *
     */
    public Set<Travail> travail;

    /**
     *
     */
    public Set<Temps> temps;

    /**
     *
     * @return 
     */
    public String getTitre() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setTitre(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getClient() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setClient(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDate_debut() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setDate_debut(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDate_fin() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setDate_fin(String value) {
        // TODO implement here
    }

    /**
     *
     */
    public class AssociationClass1 {

        /**
         * Default constructor
         */
        public AssociationClass1() {
        }

    }

    /**
     *
     */
    public class Travail {

        /**
         * Default constructor
         */
        public Travail() {
        }

        /**
         *
         */
        public String date_eng;

        /**
         *
         */
        public float pourcentage_temps;

        /**
         *
         */
        public Membre membre;

        /**
         *
         */
        public Projet projet;

        /**
         * @return
         */
        public String getDate_eng() {
            // TODO implement here
            return "";
        }

        /**
         * @param value
         */
        public void setDate_eng(String value) {
            // TODO implement here
        }

        /**
         * @return
         */
        public float getPourcentage_temps() {
            // TODO implement here
            return 0.0f;
        }

        /**
         * @param value
         */
        public void setPourcentage_temps(float value) {
            // TODO implement here
        }

    }

    /**
     *
     */
    public class AssociationClass2 {

        /**
         * Default constructor
         */
        public AssociationClass2() {
        }

    }

}
