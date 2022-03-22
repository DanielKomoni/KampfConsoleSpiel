class LangSchwert implements IWaffenwahl{
    private float Preis = 10.0F;
    private int Pover = 10;

    public float GetPreis() {
        return Preis;
    }

    public int GetPover() {
        return Pover;
    }
}

class GroßSchield implements IWaffenwahl{
    private float Preis=16.0F;
    private int Pover=8;

    public float GetPreis() {
        return Preis;
    }

    public int GetPover() {
        return Pover;
    }
}

class SchwereRüstung implements IWaffenwahl{
    private float Preis=20.0F;
    private int Pover=10;

    public float GetPreis() {
        return Preis;
    }

    public int GetPover() {
        return Pover;
    }
}


class KurzSchwert implements IWaffenwahl{
    private float Preis=5.0F;
    private int Pover = 10;

    public float GetPreis(){return Preis;}

    public int GetPover() {
        return Pover;
    }
}

class KleinSchield implements IWaffenwahl{
    private float Preis = 8.0F;
    private int Pover=4;

    public float GetPreis(){return Preis;}

    public int GetPover(){return Pover;}
}

class LeichteRüstung implements IWaffenwahl{
    private float Preis = 10.0F;
    private int Pover = 5;

    public float GetPreis(){return Preis;}

    public int GetPover(){return Pover;}
}