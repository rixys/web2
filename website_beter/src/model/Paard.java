package model;

public class Paard {
        private int leeftijd;
        private String naam;
        private String naamRuiter;

        public Paard(int leef, String n, String ruit) {
                if (n == null || n.trim().isEmpty()) throw new IllegalArgumentException();
                if (leef < 0) throw new IllegalArgumentException();
                if (ruit == null || ruit.trim().isEmpty()) throw new IllegalArgumentException();
                this.leeftijd = leef;
                this.naam = n;
                this.naamRuiter = ruit;
        }

        public int getLeeftijd() {
                return leeftijd;
        }

        public String getNaam() {
                return naam;
        }

        public String getNaamRuiter() {
                return naamRuiter;
        }


}

