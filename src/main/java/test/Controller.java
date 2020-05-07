package test;

import java.net.URL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Controller {
    int CountsWhite = 12;
    int CountsBlack = 12;
    int MoveTime = 0;


    boolean IsCorrectSecond(Circle x){
        if(!IsUnderAttack(Integer.parseInt(x.getId())+11+"", (Color) x.getFill())&&IsEmpty(Integer.parseInt(x.getId())+22+"")||(!IsUnderAttack(Integer.parseInt(x.getId())+9+"", (Color) x.getFill())&&IsEmpty(Integer.parseInt(x.getId())+18+""))||(!IsUnderAttack(Integer.parseInt(x.getId())-11+"", (Color) x.getFill())&&IsEmpty(Integer.parseInt(x.getId())-22+""))||(!IsUnderAttack(Integer.parseInt(x.getId())-9+"", (Color) x.getFill()))&&IsEmpty(Integer.parseInt(x.getId())-18+""))return false;
        return true;
    }
    boolean IsCorrect(){
        Circle[] list = {A3,C3,E3,G3,B2,D2,F2,H2,A1,C1,E1,G1,H6,F6,D6,B6,G7,E7,C7,A7,H8,F8,D8,B8};
        for(int i=0;i<list.length;i++){
            if((!IsUnderAttack(Integer.parseInt(list[i].getId())+11+"", (Color) list[i].getFill())&&IsEmpty(Integer.parseInt(list[i].getId())+22+""))||(!IsUnderAttack(Integer.parseInt(list[i].getId())+9+"", (Color) list[i].getFill())&&IsEmpty(Integer.parseInt(list[i].getId())+18+""))||(!IsUnderAttack(Integer.parseInt(list[i].getId())-11+"", (Color) list[i].getFill())&&IsEmpty(Integer.parseInt(list[i].getId())-22+""))||(!IsUnderAttack(Integer.parseInt(list[i].getId())-9+"", (Color) list[i].getFill()))&&IsEmpty(Integer.parseInt(list[i].getId())-18+"")) return false;
        }
        return true;
    }

    boolean IsUnderAttack(String x, Color c){

        Circle[] list = {A3,C3,E3,G3,B2,D2,F2,H2,A1,C1,E1,G1,H6,F6,D6,B6,G7,E7,C7,A7,H8,F8,D8,B8};
            if (MoveTime == 1) {
                for(int i=0;i<=11;i++){
                    if(list[i].getId().equals(x)&&!list[i].getFill().equals(c)&&!list[i].getFill().equals(Color.BLUE))return false;
                }
            }
            if (MoveTime == 0) {
                for(int i=12;i<list.length;i++){
                    if(list[i].getId().equals(x)&&!list[i].getFill().equals(c)&&!list[i].getFill().equals(Color.RED))return false;
                }
            }
        return true;

    }

    @FXML
    private Button reset;

    void Reset(){
        A1.setId("11");A1.setLayoutX(a1.getLayoutX()+18);A1.setLayoutY(a1.getLayoutY()+18);A1.setVisible(true);A1.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        C1.setId("31");C1.setLayoutX(c1.getLayoutX()+18);C1.setLayoutY(c1.getLayoutY()+18);C1.setVisible(true);C1.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        E1.setId("51");E1.setLayoutX(e1.getLayoutX()+18);E1.setLayoutY(e1.getLayoutY()+18);E1.setVisible(true);E1.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        G1.setId("71");G1.setLayoutX(g1.getLayoutX()+18);G1.setLayoutY(g1.getLayoutY()+18);G1.setVisible(true);G1.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        B2.setId("22");B2.setLayoutX(b2.getLayoutX()+18);B2.setLayoutY(b2.getLayoutY()+18);B2.setVisible(true);B2.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        D2.setId("42");D2.setLayoutX(d2.getLayoutX()+18);D2.setLayoutY(d2.getLayoutY()+18);D2.setVisible(true);D2.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        F2.setId("62");F2.setLayoutX(f2.getLayoutX()+18);F2.setLayoutY(f2.getLayoutY()+18);F2.setVisible(true);F2.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        H2.setId("82");H2.setLayoutX(h2.getLayoutX()+18);H2.setLayoutY(h2.getLayoutY()+18);H2.setVisible(true);H2.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        A3.setId("13");A3.setLayoutX(a3.getLayoutX()+18);A3.setLayoutY(a3.getLayoutY()+18);A3.setVisible(true);A3.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        C3.setId("33");C3.setLayoutX(c3.getLayoutX()+18);C3.setLayoutY(c3.getLayoutY()+18);C3.setVisible(true);C3.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        E3.setId("53");E3.setLayoutX(e3.getLayoutX()+18);E3.setLayoutY(e3.getLayoutY()+18);E3.setVisible(true);E3.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        G3.setId("73");G3.setLayoutX(g3.getLayoutX()+18);G3.setLayoutY(g3.getLayoutY()+18);G3.setVisible(true);G3.setFill(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1));
        B6.setId("26");B6.setLayoutX(b6.getLayoutX()+18);B6.setLayoutY(b6.getLayoutY()+18);B6.setVisible(true);B6.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        D6.setId("46");D6.setLayoutX(d6.getLayoutX()+18);D6.setLayoutY(d6.getLayoutY()+18);D6.setVisible(true);D6.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        F6.setId("66");F6.setLayoutX(f6.getLayoutX()+18);F6.setLayoutY(f6.getLayoutY()+18);F6.setVisible(true);F6.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        H6.setId("86");H6.setLayoutX(h6.getLayoutX()+18);H6.setLayoutY(h6.getLayoutY()+18);H6.setVisible(true);H6.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        G7.setId("77");G7.setLayoutX(g7.getLayoutX()+18);G7.setLayoutY(g7.getLayoutY()+18);G7.setVisible(true);G7.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        E7.setId("57");E7.setLayoutX(e7.getLayoutX()+18);E7.setLayoutY(e7.getLayoutY()+18);E7.setVisible(true);E7.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        C7.setId("37");C7.setLayoutX(c7.getLayoutX()+18);C7.setLayoutY(c7.getLayoutY()+18);C7.setVisible(true);C7.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        A7.setId("17");A7.setLayoutX(a7.getLayoutX()+18);A7.setLayoutY(a7.getLayoutY()+18);A7.setVisible(true);A7.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        B8.setId("28");B8.setLayoutX(b8.getLayoutX()+18);B8.setLayoutY(b8.getLayoutY()+18);B8.setVisible(true);B8.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        D8.setId("48");D8.setLayoutX(d8.getLayoutX()+18);D8.setLayoutY(d8.getLayoutY()+18);D8.setVisible(true);D8.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        F8.setId("68");F8.setLayoutX(f8.getLayoutX()+18);F8.setLayoutY(f8.getLayoutY()+18);F8.setVisible(true);F8.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        H8.setId("88");H8.setLayoutX(h8.getLayoutX()+18);H8.setLayoutY(h8.getLayoutY()+18);H8.setVisible(true);H8.setFill(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1));
        MoveTime=0;
    }

    Circle IsKingEmpty(String x){
        if(A3.getId().equals(x))return A3;
        if(C3.getId().equals(x))return C3;
        if(E3.getId().equals(x))return E3;
        if(G3.getId().equals(x))return G3;
        if(B2.getId().equals(x))return B2;
        if(D2.getId().equals(x))return D2;
        if(F2.getId().equals(x))return F2;
        if(H2.getId().equals(x))return H2;
        if(A1.getId().equals(x))return A1;
        if(C1.getId().equals(x))return C1;
        if(E1.getId().equals(x))return E1;
        if(G1.getId().equals(x))return G1;
        if(H6.getId().equals(x))return H6;
        if(F6.getId().equals(x))return F6;
        if(D6.getId().equals(x))return D6;
        if(B6.getId().equals(x))return B6;
        if(G7.getId().equals(x))return G7;
        if(E7.getId().equals(x))return E7;
        if(C7.getId().equals(x))return C7;
        if(A7.getId().equals(x))return A7;
        if(H8.getId().equals(x))return H8;
        if(F8.getId().equals(x))return F8;
        if(D8.getId().equals(x))return D8;
        if(B8.getId().equals(x))return B8;
        return null;
    }
    Integer KingChange(int x,int y, int c, Color cl){
        Circle circle = null;
        int k=0;
        if(x%11==0)
            if (x<0)
                for(int i=y;i>c;i-=11){
                    if(k>1){k=2;break;}
                    if(IsKingEmpty(i+"")!=null){k++;circle = IsKingEmpty(i+"");}
                }
             else
                for(int i=y;i<c;i+=11){
                    if(k>1){k=2;break;}
                    if(IsKingEmpty(i+"")!=null){k++;circle = IsKingEmpty(i+"");}
                }
        if(x%9==0){
            if(x<0)
                for(int i=y;i>c;i-=9){
                    if(k>1){k=-1;break;}
                    if(IsKingEmpty(i+"")!=null){k++;circle = IsKingEmpty(i+"");}
                }
             else
                for(int i=y;i<c;i+=9){
                    if(k>1){k=2;break;}
                    if(IsKingEmpty(i+"")!=null){k++;circle = IsKingEmpty(i+"");}
                }
        }
        if(k==1){
            if(cl.equals(Color.BLUE)) {
                if (circle.getFill().equals(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1)) || circle.getFill().equals(Color.RED)) {
                    circle.setVisible(false);
                    circle.setId("-20");
                    CountsBlack--;
                }
                else  k=2;
            }
            else
                if(circle.getFill().equals(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1)) || circle.getFill().equals(Color.BLUE)){
                    circle.setVisible(false);
                    circle.setId("-20");
                    CountsWhite--;
                }
                else  k=2;
        }
        return k;
    }
    void Change(String x, Circle y){
        if(A3.getId().equals(x) & !A3.getFill().equals(y.getFill())){A3.setVisible(false);A3.setId("-20");}
        if(C3.getId().equals(x) & !C3.getFill().equals(y.getFill())){C3.setVisible(false);;C3.setId("-20");}
        if(E3.getId().equals(x) & !E3.getFill().equals(y.getFill())){E3.setVisible(false);;E3.setId("-20");}
        if(G3.getId().equals(x) & !G3.getFill().equals(y.getFill())){G3.setVisible(false);G3.setId("-20");}
        if(B2.getId().equals(x) & !B2.getFill().equals(y.getFill())){B2.setVisible(false);B2.setId("-20");}
        if(D2.getId().equals(x) & !D2.getFill().equals(y.getFill())){D2.setVisible(false);D2.setId("-20");}
        if(F2.getId().equals(x) & !F2.getFill().equals(y.getFill())){F2.setVisible(false);F2.setId("-20");}
        if(H2.getId().equals(x) & !H2.getFill().equals(y.getFill())){H2.setVisible(false);H2.setId("-20");}
        if(A1.getId().equals(x) & !A1.getFill().equals(y.getFill())){A1.setVisible(false);A1.setId("-20");}
        if(C1.getId().equals(x) & !C1.getFill().equals(y.getFill())){C1.setVisible(false);C1.setId("-20");}
        if(E1.getId().equals(x) & !E1.getFill().equals(y.getFill())){E1.setVisible(false);E1.setId("-20");}
        if(G1.getId().equals(x) & !G1.getFill().equals(y.getFill())){G1.setVisible(false);G1.setId("-20");}
        if(H6.getId().equals(x) & !H6.getFill().equals(y.getFill())){H6.setVisible(false);H6.setId("-20");}
        if(F6.getId().equals(x) & !F6.getFill().equals(y.getFill())){F6.setVisible(false);F6.setId("-20");}
        if(D6.getId().equals(x) & !D6.getFill().equals(y.getFill())){D6.setVisible(false);D6.setId("-20");}
        if(B6.getId().equals(x) & !B6.getFill().equals(y.getFill())){B6.setVisible(false);B6.setId("-20");}
        if(G7.getId().equals(x) & !G7.getFill().equals(y.getFill())){G7.setVisible(false);G7.setId("-20");}
        if(E7.getId().equals(x) & !E7.getFill().equals(y.getFill())){E7.setVisible(false);E7.setId("-20");}
        if(C7.getId().equals(x) & !C7.getFill().equals(y.getFill())){C7.setVisible(false);C7.setId("-20");}
        if(A7.getId().equals(x) & !A7.getFill().equals(y.getFill())){A7.setVisible(false);A7.setId("-20");}
        if(H8.getId().equals(x) & !H8.getFill().equals(y.getFill())){H8.setVisible(false);H8.setId("-20");}
        if(F8.getId().equals(x) & !F8.getFill().equals(y.getFill())){F8.setVisible(false);F8.setId("-20");}
        if(D8.getId().equals(x) & !D8.getFill().equals(y.getFill())){D8.setVisible(false);D8.setId("-20");}
        if(B8.getId().equals(x) & !B8.getFill().equals(y.getFill())){B8.setVisible(false);B8.setId("-20");}
    }
    boolean Attack(Rectangle x, Circle y){
        if(!IsEmpty((Integer.parseInt(y.getId())+(Integer.parseInt(x.getId())-Integer.parseInt(y.getId()))/2+""))){
            if(Math.abs(Integer.parseInt(y.getId())-Integer.parseInt(x.getId())) == 22 || Math.abs(Integer.parseInt(y.getId())-Integer.parseInt(x.getId())) == 18){
                return true;
            }
        }
        return false;
    }
    boolean IsEmpty(String x){
        if(g1.getId().equals(x)||e1.getId().equals(x)||c1.getId().equals(x)||a1.getId().equals(x)||h2.getId().equals(x)||f2.getId().equals(x)||d2.getId().equals(x)||b2.getId().equals(x)||g3.getId().equals(x)||e3.getId().equals(x)||c3.getId().equals(x)||a3.getId().equals(x)||b4.getId().equals(x)||d4.getId().equals(x)||h4.getId().equals(x)||f4.getId().equals(x)||g5.getId().equals(x)||e5.getId().equals(x)||c5.getId().equals(x)||a5.getId().equals(x)||h6.getId().equals(x)||b6.getId().equals(x)||d6.getId().equals(x)||f6.getId().equals(x)||a7.getId().equals(x)||c7.getId().equals(x)||e7.getId().equals(x)||g7.getId().equals(x)||b8.getId().equals(x)||d8.getId().equals(x)||f8.getId().equals(x)||h8.getId().equals(x)) {
            if (A3.getId().equals(x)) return false;
            if (C3.getId().equals(x)) return false;
            if (E3.getId().equals(x)) return false;
            if (G3.getId().equals(x)) return false;
            if (B2.getId().equals(x)) return false;
            if (D2.getId().equals(x)) return false;
            if (F2.getId().equals(x)) return false;
            if (H2.getId().equals(x)) return false;
            if (A1.getId().equals(x)) return false;
            if (C1.getId().equals(x)) return false;
            if (E1.getId().equals(x)) return false;
            if (G1.getId().equals(x)) return false;
            if (H6.getId().equals(x)) return false;
            if (F6.getId().equals(x)) return false;
            if (D6.getId().equals(x)) return false;
            if (B6.getId().equals(x)) return false;
            if (G7.getId().equals(x)) return false;
            if (E7.getId().equals(x)) return false;
            if (C7.getId().equals(x)) return false;
            if (A7.getId().equals(x)) return false;
            if (H8.getId().equals(x)) return false;
            if (F8.getId().equals(x)) return false;
            if (D8.getId().equals(x)) return false;
            if (B8.getId().equals(x)) return false;
            return true;
        }
        return false;
    }
    public void Move(Circle x, Rectangle y) {
        if (IsEmpty(y.getId())) {
            if (x.getFill().equals(new Color(227f / 255f, 231f / 255f, 235f / 255f, 1))&&MoveTime==0) {
                if (Integer.parseInt(x.getId()) + 11 == Integer.parseInt(y.getId()) || Integer.parseInt(x.getId()) - 9 == Integer.parseInt(y.getId())) {
                    if (IsCorrect()) {
                        x.setLayoutX(y.getLayoutX() + 18);
                        x.setLayoutY(y.getLayoutY() + 18);
                        x.setId(y.getId());
                        MoveTime=1;
                    }
                }
                if(Attack(y,x)){
                    Change(Integer.parseInt(x.getId())+(Integer.parseInt(y.getId())-Integer.parseInt(x.getId()))/2+"",x);
                    if(IsEmpty(Integer.parseInt(x.getId())+(Integer.parseInt(y.getId())-Integer.parseInt(x.getId()))/2+"")) {
                        x.setLayoutX(y.getLayoutX() + 18);
                        x.setLayoutY(y.getLayoutY() + 18);
                        x.setId(y.getId());
                        CountsBlack--;
                        if(IsCorrectSecond(x))
                        MoveTime=1;
                    }
                }
                if (Integer.parseInt(y.getId())%10 == 8)x.setFill(Color.BLUE);
                if(CountsBlack == 0) System.out.println("White Win");
            }
            if(x.getFill().equals(new Color(150f / 255f, 164f / 255f, 178f / 255f, 1))&&MoveTime==1){
                if (Integer.parseInt(y.getId()) + 11 == Integer.parseInt(x.getId()) || Integer.parseInt(y.getId()) - 9 == Integer.parseInt(x.getId())) {
                    if(IsCorrect()) {
                        x.setLayoutX(y.getLayoutX() + 18);
                        x.setLayoutY(y.getLayoutY() + 18);
                        x.setId(y.getId());
                        MoveTime=0;
                    }
                }
                if(Attack(y,x)){
                    Change(Integer.parseInt(x.getId())+(Integer.parseInt(y.getId())-Integer.parseInt(x.getId()))/2+"",x);
                    if(IsEmpty(Integer.parseInt(x.getId())+(Integer.parseInt(y.getId())-Integer.parseInt(x.getId()))/2+"")) {
                        x.setLayoutX(y.getLayoutX() + 18);
                        x.setLayoutY(y.getLayoutY() + 18);
                        x.setId(y.getId());
                        CountsWhite--;
                        if(IsCorrectSecond(x))
                        MoveTime=0;
                    }
                }
                if (Integer.parseInt(y.getId())%10 == 1)x.setFill(Color.RED);
                if(CountsWhite == 0) System.out.println("Black Win");
            }
            if(x.getFill().equals(Color.BLUE)&&MoveTime==0){
                if(KingChange(Integer.parseInt(x.getId())-Integer.parseInt(y.getId()),Integer.parseInt(y.getId()),Integer.parseInt(x.getId()), Color.BLUE)<=1) {
                    if ((Integer.parseInt(y.getId()) - Integer.parseInt(x.getId())) % 11 == 0 || (Integer.parseInt(y.getId()) - Integer.parseInt(x.getId())) % 9 == 0) {
                            x.setLayoutX(y.getLayoutX() + 18);
                            x.setLayoutY(y.getLayoutY() + 18);
                            x.setId(y.getId());
                            MoveTime = 1;
                    }
                    if(CountsBlack == 0) System.out.println("White Win");
                }
            }
            if(x.getFill().equals(Color.RED)&&MoveTime==1){
                if(KingChange(Integer.parseInt(x.getId())-Integer.parseInt(y.getId()),Integer.parseInt(y.getId()),Integer.parseInt(x.getId()), Color.RED)<=1) {
                    if ((Integer.parseInt(y.getId()) - Integer.parseInt(x.getId())) % 11 == 0 || (Integer.parseInt(y.getId()) - Integer.parseInt(x.getId())) % 9 == 0) {

                        x.setLayoutX(y.getLayoutX() + 18);
                        x.setLayoutY(y.getLayoutY() + 18);
                        x.setId(y.getId());
                            MoveTime = 0;
                    }
                    if(CountsWhite == 0) System.out.println("Black Win");
                }
            }
        }
    }
    public void Check(Circle x){
            a1.setOnMouseClicked(mouseEvent -> {
                Move(x,a1);
            });
            c1.setOnMouseClicked(mouseEvent -> {
                Move(x,c1);
            });

            g1.setOnMouseClicked(mouseEvent -> {
                Move(x,g1);
            });
            e1.setOnMouseClicked(mouseEvent -> {
                Move(x,e1);
            });
            b2.setOnMouseClicked(mouseEvent -> {
                Move(x,b2);
            });
            d2.setOnMouseClicked(mouseEvent -> {
                Move(x,d2);
            });
            f2.setOnMouseClicked(mouseEvent -> {
                Move(x,f2);
            });
            h2.setOnMouseClicked(mouseEvent -> {
                Move(x,h2);
            });
            a3.setOnMouseClicked(mouseEvent -> {
                Move(x,a3);
            });
            c3.setOnMouseClicked(mouseEvent -> {
                Move(x,c3);
            });
            e3.setOnMouseClicked(mouseEvent -> {
                Move(x,e3);
            });
            g3.setOnMouseClicked(mouseEvent -> {
                Move(x,g3);
            });
            d4.setOnMouseClicked(mouseEvent -> {
                Move(x,d4);
            });
            b4.setOnMouseClicked(mouseEvent -> {
                Move(x,b4);
            });
            f4.setOnMouseClicked(mouseEvent -> {
                Move(x,f4);
            });
            h4.setOnMouseClicked(mouseEvent -> {
                Move(x,h4);
            });
            a5.setOnMouseClicked(mouseEvent -> {
                Move(x,a5);
            });
            c5.setOnMouseClicked(mouseEvent -> {
                Move(x,c5);
            });
            e5.setOnMouseClicked(mouseEvent -> {
                Move(x,e5);
            });
            g5.setOnMouseClicked(mouseEvent -> {
                Move(x,g5);
            });
            h6.setOnMouseClicked(mouseEvent -> {
                Move(x,h6);
            });
            f6.setOnMouseClicked(mouseEvent -> {
                Move(x,f6);
            });
            d6.setOnMouseClicked(mouseEvent -> {
                Move(x,d6);
            });
            b6.setOnMouseClicked(mouseEvent -> {
                Move(x,b6);
            });
            a7.setOnMouseClicked(mouseEvent -> {
                Move(x,a7);
            });
            c7.setOnMouseClicked(mouseEvent -> {
                Move(x,c7);
            });
            e7.setOnMouseClicked(mouseEvent -> {
                Move(x,e7);
            });
            g7.setOnMouseClicked(mouseEvent -> {
                Move(x,g7);
            });
            h8.setOnMouseClicked(mouseEvent -> {
                Move(x,h8);
            });
            f8.setOnMouseClicked(mouseEvent -> {
                Move(x,f8);
            });
            d8.setOnMouseClicked(mouseEvent -> {
                Move(x,d8);
            });
            b8.setOnMouseClicked(mouseEvent -> {
                Move(x,b8);
            });
        }

    @FXML
    private Rectangle b8;

    @FXML
    private Rectangle d8;

    @FXML
    private Rectangle f8;

    @FXML
    private Rectangle h8;

    @FXML
    private Rectangle a7;

    @FXML
    private Rectangle c7;

    @FXML
    private Rectangle e7;

    @FXML
    private Rectangle g7;

    @FXML
    private Rectangle b6;

    @FXML
    private Rectangle d6;

    @FXML
    private Rectangle f6;

    @FXML
    private Rectangle h6;

    @FXML
    private Rectangle a5;

    @FXML
    private Rectangle c5;

    @FXML
    private Rectangle e5;

    @FXML
    private Rectangle g5;

    @FXML
    private Rectangle b4;

    @FXML
    private Rectangle d4;

    @FXML
    private Rectangle f4;

    @FXML
    private Rectangle h4;

    @FXML
    private Rectangle a3;

    @FXML
    private Rectangle c3;

    @FXML
    private Rectangle e3;

    @FXML
    private Rectangle g3;

    @FXML
    private Rectangle b2;

    @FXML
    private Rectangle d2;

    @FXML
    private Rectangle f2;

    @FXML
    private Rectangle h2;

    @FXML
    private Rectangle a1;

    @FXML
    private Rectangle c1;

    @FXML
    private Rectangle e1;

    @FXML
    private Rectangle g1;

    @FXML
    private Circle A1;

    @FXML
    private Circle C1;

    @FXML
    private Circle B2;

    @FXML
    private Circle E1;

    @FXML
    private Circle D2;

    @FXML
    private Circle G1;

    @FXML
    private Circle H2;

    @FXML
    private Circle F2;

    @FXML
    private Circle A3;

    @FXML
    private Circle C3;

    @FXML
    private Circle E3;

    @FXML
    private Circle G3;

    @FXML
    private Circle H6;

    @FXML
    private Circle F6;

    @FXML
    private Circle D6;

    @FXML
    private Circle B6;

    @FXML
    private Circle G7;

    @FXML
    private Circle E7;

    @FXML
    private Circle H8;

    @FXML
    private Circle F8;

    @FXML
    private Circle D8;

    @FXML
    private Circle C7;

    @FXML
    private Circle B8;

    @FXML
    private Circle A7;


    @FXML
    void initialize() {
        reset.setOnAction(actionEvent -> {
            Reset();
        });
        A3.setOnMouseClicked(mouseEvent -> {
            Check(A3);
        });
        C3.setOnMouseClicked(mouseEvent -> {
            Check(C3);
        });
        E3.setOnMouseClicked(mouseEvent -> {
            Check(E3);
        });
        G3.setOnMouseClicked(mouseEvent -> {
            Check(G3);
        });
        B2.setOnMouseClicked(mouseEvent -> {
            Check(B2);
        });
        D2.setOnMouseClicked(mouseEvent -> {
            Check(D2);
        });
        F2.setOnMouseClicked(mouseEvent -> {
            Check(F2);
        });
        H2.setOnMouseClicked(mouseEvent -> {
            Check(H2);
        });
        A1.setOnMouseClicked(mouseEvent -> {
            Check(A1);
        });
        C1.setOnMouseClicked(mouseEvent -> {
            Check(C1);
        });
        E1.setOnMouseClicked(mouseEvent -> {
            Check(E1);
        });
        G1.setOnMouseClicked(mouseEvent -> {
            Check(G1);
        });
        H8.setOnMouseClicked(mouseEvent -> {
            Check(H8);
        });
        F8.setOnMouseClicked(mouseEvent -> {
            Check(F8);
        });
        D8.setOnMouseClicked(mouseEvent -> {
            Check(D8);
        });
        B8.setOnMouseClicked(mouseEvent -> {
            Check(B8);
        });
        G7.setOnMouseClicked(mouseEvent -> {
            Check(G7);
        });
        E7.setOnMouseClicked(mouseEvent -> {
            Check(E7);
        });
        C7.setOnMouseClicked(mouseEvent -> {
            Check(C7);
        });
        A7.setOnMouseClicked(mouseEvent -> {
            Check(A7);
        });
        B6.setOnMouseClicked(mouseEvent -> {
            Check(B6);
        });
        D6.setOnMouseClicked(mouseEvent -> {
            Check(D6);
        });
        F6.setOnMouseClicked(mouseEvent -> {
            Check(F6);
        });
        H6.setOnMouseClicked(mouseEvent -> {
            Check(H6);
        });
    }
}