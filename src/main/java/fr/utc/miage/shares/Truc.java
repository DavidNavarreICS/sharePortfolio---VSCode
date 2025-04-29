package fr.utc.miage.shares;

public class Truc {
    private final String trucAtt;

    public Truc(String trucAtt) {
        this.trucAtt = trucAtt;
    }

    public String getTrucAtt() {
        return trucAtt;
    }

    @Override
    public String toString() {
        return "Truc [getTrucAtt()=" + getTrucAtt() + ", getClass()=" + getClass() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((trucAtt == null) ? 0 : trucAtt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Truc other = (Truc) obj;
        if (trucAtt == null) {
            if (other.trucAtt != null)
                return false;
        } else if (!trucAtt.equals(other.trucAtt))
            return false;
        return true;
    }

}
