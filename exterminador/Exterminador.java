package exterminador;
import robocode.*;
import java.awt.Color;
import java.awt.*;


/*
Nome:EXTERMINADOR Mack01
Robo desenvolvido pelo aluno: Lucas Matheus Pereira De Lacerda(ADS)
*/


public class Exterminador extends Robot {


	public void run() {
		// escolhendo as cores!
		setBodyColor(Color.blue);       //cor do corpo do robô
		setGunColor(Color.white);       //cor do canhao do robô
		setRadarColor(Color.white);     //cor do radar do robô
		setBulletColor(Color.red);      //cor da bala do robô
		setScanColor(Color.red);        //cor do scanner do robô

        //Loop da movimentação aleatóriazinha :) do robo durante a batalha
		while (true) {
			ahead(50);                      //anda 50 pixels para a frente
            turnGunRight(180);              //gira o canhão a 180 para a direita
            back(50);                       //anda 50px para atrás
            turnGunRight(180);              //gira o canhão a 180 para a direita
            back(50);                       //anda 50px para atrás
            turnGunRight(360);              //gira o canhão a 360 para a direita
            ahead(50);                      //anda 50 pixels para a frente
            turnGunLeft(360);               //gira o canhão a 360 para a esquerda

            turnLeft(90);                   //gira o robô 90 a esquerda
            ahead(50);                      //anda 50 pixels para a frente
            turnGunRight(360);              //gira o canhão a 360 para a direita
            back(50);                       //anda 50 para atrás
            turnRight(90);

            turnRight(90);
            ahead(50);                      //anda 50 pixels para a frente
            turnGunLeft(360);               //gira o canhão a 360 para a esquerda
            back(50);                       //anda 50 para atrás
            turnLeft(90);                   //gira 90 para a esquerda
            
		}
        
        public void onScannedRobot(ScannedRobotEvent e){
            Fire(1);
        }

        public void onHitByBullet(HitByBullet e){
            back(10);
        }

        public void onHitWall(HitWallEvent e){
            back(20);
        }
    }
}
