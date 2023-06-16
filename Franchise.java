package SalesData;

public class Franchise {
    private Store stores[];

    public Franchise(int num) {
            stores = new Store[num];
            for(int i=0;i<num;i++)
              stores[i] = new Store();
    }

    public Store getStores(int i) {
        return stores[i];
    }

    public void setStores(Store stores, int i) {
        this.stores[i] = stores;
    }
    
    
}

