class Player1 {
    public float Player1Money;
    public int Player1Pover;
    public int Player1Life=50;

    Player1(float Player1Money, IWaffenwahl schwert){
        this.Player1Money = Player1Money;

        this.Player1Pover = schwert.GetPover();

        this.Player1Money=Player1Money-schwert.GetPreis();
    }
    Player1(float Player1Money, IWaffenwahl schwert, IWaffenwahl schield){
        this.Player1Money=Player1Money;

        this.Player1Pover=Player1Pover+ schwert.GetPover()+schield.GetPover();

        this.Player1Money=Player1Money- (schwert.GetPreis()+ schield.GetPreis());

    }
    Player1(float Player1Money, IWaffenwahl schwert, IWaffenwahl schield, IWaffenwahl rüstung){
        this.Player1Money=Player1Money;

        this.Player1Pover=Player1Pover+ schwert.GetPover()+ schield.GetPover()+ rüstung.GetPover();

        this.Player1Money=Player1Money-(schwert.GetPreis()+ schield.GetPreis()+ rüstung.GetPreis());
    }
}

class Player2{
    public float Player2Money;
    public int Player2Pover;
    public int Player2Life=50;

    Player2(float Player2Money, IWaffenwahl schwert){
        this.Player2Money = Player2Money;

        this.Player2Pover = schwert.GetPover();

        this.Player2Money=Player2Money-schwert.GetPreis();
    }
    Player2(float Player2Money, IWaffenwahl schwert, IWaffenwahl schield){
        this.Player2Money=Player2Money;

        this.Player2Pover=Player2Pover+ schwert.GetPover()+schield.GetPover();

        this.Player2Money=Player2Money- (schwert.GetPreis()+ schield.GetPreis());

    }
    Player2(float Player2Money, IWaffenwahl schwert, IWaffenwahl schield, IWaffenwahl rüstung){
        this.Player2Money=Player2Money;

        this.Player2Pover=Player2Pover+ schwert.GetPover()+ schield.GetPover()+ rüstung.GetPover();

        this.Player2Money=Player2Money-(schwert.GetPreis()+ schield.GetPreis()+ rüstung.GetPreis());
    }
}