public class Main {

    public static void main(String[] args) {
	// write your code here
        double DaX = 5d, DaY = 2d, DaZ = -5d;
        double DbX = 4d, DbY = 9d, DbZ = 2d;
        double DcX = -3d, DcY = 2d, DcZ = 6d;
        double DaDb = Math.sqrt(Math.pow(DaY - DbY, 2d) + Math.pow(DaX - DbX, 2d) + Math.pow(DaZ - DbZ, 2d));
        double DaDc = Math.sqrt(Math.pow(DaY - DcY, 2d) + Math.pow(DaX - DcX, 2d) + Math.pow(DaZ - DcZ, 2d));
        double DbDc = Math.sqrt(Math.pow(DbY - DcY, 2d) + Math.pow(DbX - DcX, 2d) + Math.pow(DbZ - DcZ, 2d));
        System.out.println("Drone A is "+ DaDb +" units from Drone B.\nDrone A is "+ DaDc +" units from Drone C.\nDrone B is "+ DbDc +" unit s from Drone C.");
        double MaxDi = Math.max(Math.max(DaDb, DaDc), Math.max(DaDc, DbDc));
        System.out.println("The maximum distance between two drones is "+ MaxDi +" units.");
        double MinDi = Math.min(Math.min(DaDb, DaDc), Math.min(DaDc, DbDc));
        System.out.println("The minimum distance between two drones is "+ MinDi +" units.");
    }
}
