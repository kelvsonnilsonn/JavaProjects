package Projetos.Restaurante.Classes;

class Mesa{
    private boolean isTableBusy; // encapsulamento -> usar gatters e setters
    private int tableNum;

    public Mesa(boolean busyTable, int tableNum){
        this.isTableBusy = busyTable;
        this.tableNum = tableNum;
    }

    public int getTableNum(){
        return tableNum;
    }

    public boolean getTableStatus(){
        return isTableBusy;
    }

    public void setTableNum(int table){
        if(table > 0){
            this.tableNum = table;
        } else {
            System.out.println("Mesa inexistente.");
        }
    }

    public void setTableStatus(boolean status){
        this.isTableBusy = status;
    }

    public void displayTable(){
        System.out.println("Mesa: " + tableNum);
        System.out.println("Status: " + isTableBusy);
        System.out.println("-----------------------");
    }
}
