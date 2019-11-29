package com.example.springb.rnehave;

import model.BørnClasse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController
{
    BørnClasse objBørnClasse = new BørnClasse();
    DatabaseAdapter objDatabaseAdapter = new DatabaseAdapter();
    @GetMapping("/")
    public String home()
    {
        System.out.println("GetMapping er kaldt i HomeController");
        return "index";
    }
    //@GetMapping("/login")
    //public String login()
    //@RestController
    //jpa   Først i 3 semester

    //{
    //    return "login";
    //}

    //@GetMapping("/secretarea")
    //public String secretarea()

    //{
    //    return  "secretarea";
    //}
    //@PostMapping("/aaBørn")
    @PostMapping("/aBørn")
    //public String aBørn(String navn1, String navn2, String navn3)

    public String aBørn(String barnNavn, String fødselsdag, String forældresNavn,
                        String forældresTlf, String barnetsAlergiSyg,
                        HttpSession httpSession, Model model)
        //Jeg vil prøve at fange navn
    //public String aBørn()
    {
        boolean kanlæses = true;


        System.out.println("Vi er i aBørn. barnNavn =  " + barnNavn + ", "
                + fødselsdag + ", " + forældresNavn + ", " + forældresTlf + ", " + barnetsAlergiSyg);
        boolean ikkeklartilbrug = false;
        ikkeklartilbrug = objBørnClasse.filinfo();
        kanlæses = objBørnClasse.opretBørn(barnNavn, fødselsdag, forældresNavn, forældresTlf,barnetsAlergiSyg );
        kanlæses = objBørnClasse.læsbørn();
        String tilSkærm = "Jakob";
        model.addAttribute( "navn" , tilSkærm);
        System.out.println("Vi returnere til indexTom " + "tilSkærm = " + tilSkærm );
        //return "indexTom";
        //objDatabaseAdapter Connection();
        return "indexTom";
    }
        //System.out.println("Vi er i aBørn. firstname =  " );

        //objBørnClasse.opretBørn(firstname1, firstname2, firstname3);
        //return "index";
    //}
        @PostMapping("/akasse")
        //public String akasse(String navn1, String navn2, String navn3)
        public String akasse(String firstname1, String firstname2, String firstname3)
        {
            //Jeg vil prøve at fange navn
            System.out.println("Vi er i akasse. firstname =  " + firstname1 + " "
                    +       firstname2 + " "  + firstname3);
      //      objBlanket.behblanket(firstname1, firstname2, firstname3);
            return "index";
        }
}
