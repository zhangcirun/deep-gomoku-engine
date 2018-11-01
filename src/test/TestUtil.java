package test;

import ai.utility.AiUtils;
import ai.ThreatAgent;

public class TestUtil {
    private static int[][] dummyChess = new int[][]
        {
            {1,1,0,0,0,0,0,-1,1,0,0,0,0,0,0},
            {-1,1,0,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,-1,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
            {0,0,0,0,0,0,0,0,-1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,-1,1,0,0,0,0,0,0,0,0,0,0,0,-1},
        };

    public static int[][] dummyChess2 = new int[][]
        {
            {0,0,1,-1,-1,-1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {0,0,-1,0,0,0,0,0,-1,0,0,0,0,0,0},
            {0,0,-1,0,0,0,0,0,-1,0,0,0,0,0,0},
            {0,0,-1,0,0,0,0,0,-1,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

    public static int[][] dummyChess3 = new int[][]
        {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,9,9,9,1,0,0,0},
            {0,0,0,0,0,0,0,9,9,9,1,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

    public static int[][] dummyChess4 = new int[][]
        {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,-1,-1,-1,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,1,-1,-1,-1,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1},
            {0,0,0,0,0,-1,-1,0,0,0,0,0,0,0,0},
            {0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,-1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
        };

    public static int[][] dummyChess5 = new int[][]
        {
            {-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,-1,-1,-1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };
    public static void main(String[] args){
        //GameController.initGame();

        //ThreatAgent.startThreatSpaceSearchTest(dummyChess4);

        //System.out.println(ThreatAgent.scanHorizontal(dummyChess, 1, 0, 1, 3, -1));
        //System.out.println(ThreatAgent.scanVertical(dummyChess, 1, 1, 2, 1, -1));
        //System.out.println(ThreatAgent.scanDiagonal(dummyChess3,8,6,7,7, -1));
        //System.out.println(ThreatAgent.scanAntiDiagonal(dummyChess4, 0, 3, -1, -1, -1));
        //System.out.println(ThreatAgent.numOfNearbyThreats(2, 4, dummyChess5, 1));
        //ThreatAgent.defenseVerticalThreat(dummyChess5, 2, 5, -1);
        //System.out.println(dummyChess5[1][0]);
        //ThreatAgent.defenseDiagonalThreat(dummyChess5, 5, 3, 1);
        //System.out.println(dummyChess5[7][5]);
        System.out.println(ThreatAgent.detectPotentialThreatWithDirection(2,5,dummyChess5) + " threat dire");
        int[][] nextChess = AiUtils.nextMoveChessboard(dummyChess5, 2, 5, -1);
        //Defense the threat.
        ThreatAgent.defenseSimulation(nextChess , 2, 5, -1 ,1);

        System.out.println(nextChess[2][5]);
        System.out.println(nextChess[2][6]);
    }
}
