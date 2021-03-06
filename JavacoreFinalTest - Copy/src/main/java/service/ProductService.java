package service;

import controller.Controller;
import exception.MyException;
import models.Product;
import models.Type;

import java.util.*;

public class ProductService {
    public static Controller controller = new Controller();
    static Scanner sc = new Scanner(System.in);
    static public ArrayList<Product> allProducts = getAllProducts();
    public static ArrayList<Product> getAllProducts(){
        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.add(new Product(1,"Xeon E5-2696",Type.CPU,"Intel",3,50499000,20,"corespeed : 3.6 Mhz, 18 cores, 36 threads"));
        allProducts.add(new Product(2,"I9 12900K",Type.CPU,"Intel",3,17599000,100,"corespeed : 5.2 Mhz, 16 cores, 24 threads"));
        allProducts.add(new Product(3,"Ryzen Threadripper pro 3395WX",Type.CPU,"AMD",5,142409000,15,"corespeed : 4.2 Mhz, 64 cores, 128 threads"));
        allProducts.add(new Product(4,"Ryzen 9 5950X",Type.CPU,"AMD",3,19999000,50,"corespeed : 4.9 Mhz, 16 cores, 32 threads"));
        allProducts.add(new Product(5,"Ryzen 7 5800X",Type.CPU,"AMD",3,10999000,100,"corespeed : 4.7 Mhz, 8 cores, 16 threads"));
        allProducts.add(new Product(6,"RTX 3090 Gaming X Trio",Type.GPU,"MSI",5,68999000,100,"GPU clock : 1785 MHz, 24Gb vram"));
        allProducts.add(new Product(7,"RTX 3090 Aorus master",Type.GPU,"Gigabyte",5,68999000,100,"GPU clock : 1785 MHz, 24Gb vram"));
        allProducts.add(new Product(8,"RTX 3090 GaimgPro",Type.GPU,"Palit",5,60599000,100,"GPU clock : 1695 MHz, 24Gb vram"));
        allProducts.add(new Product(9,"RTX 3080Ti Ventus OC",Type.GPU,"MSI",5,48999000,100,"GPU clock : 1785 MHz, 12Gb vram"));
        allProducts.add(new Product(10,"ROG Strix RX 6900XT",Type.GPU,"Asus",5,59999000,100,"GPU clock : 2365 MHz, 16Gb vram"));
        allProducts.add(new Product(11,"Z690 Extreme Glacial",Type.Mainboard,"Asus",5,54999000,200,"m2Sata : 12 slots, m2Pcie : 5 slots, USB : 7 slots"));
        allProducts.add(new Product(12,"Z690 Extreme Maximus",Type.Mainboard,"Asus",5,25699000,200,"m2Sata : 10 slots, m2Pcie : 4 slots, USB : 5 slots"));
        allProducts.add(new Product(13,"MEG X570 Godlike",Type.Mainboard,"MSI",5,19999000,300,"m2Sata : 9 slots, m2Pcie : 3 slots, USB : 8 slots"));
        allProducts.add(new Product(14,"X299X Designare", Type.Mainboard,"Gigabyte",5,16259000,250,"m2Sata : 20 slots, m2Pcie : 5 slots, USB : 12 slots"));
        allProducts.add(new Product(15,"Z690 Taichi",Type.Mainboard,"Asrock",5,15399000,400,"m2Sata : 12 slots, m2Pcie : 4 slots, USB : 7 slots"));
        allProducts.add(new Product(16,"AX1600i",Type.PSU,"Corsair",5,12729000,500,"wattage : 1600W"));
        allProducts.add(new Product(17,"ROG Thor",Type.PSU,"Asus",5,10509000,500,"wattage : 1200W"));
        allProducts.add(new Product(18,"ROG Strix 850G",Type.PSU,"Asus",5,6229000,1000,"wattage : 850W"));
        allProducts.add(new Product(19,"MWE GOLD 1050 V2",Type.PSU,"Cooler Master",5,4729000,800,"wattage : 1050W"));
        allProducts.add(new Product(20,"GP P1000GM",Type.PSU,"Gigabyte",5,4039000,1200,"wattage : 1000W"));
        allProducts.add(new Product(21,"Fury Renegade",Type.SSD,"Kingston",5,31999000,200,"Capacity : 4TB"));
        allProducts.add(new Product(22,"MP600",Type.SSD,"Corsair",5,11899000,600,"Capacity : 2TB"));
        allProducts.add(new Product(23,"WD Black Game Dock",Type.SSD,"Western Digital",5,10999000,800,"Capacity : 1TB"));
        allProducts.add(new Product(24,"970 Pro",Type.SSD,"Samsung",5,10699000,400,"Capacity : 1TB"));
        allProducts.add(new Product(25,"Aorus",Type.SSD,"Gigabyte",5,6999000,500,"Capacity : 1TB"));
        allProducts.add(new Product(26,"Trident Z5",Type.Ram,"Gskill",5,13499000,450,"Capacity : 32GB"));
        allProducts.add(new Product(27,"Fury Beast",Type.Ram,"Kingston",5,9299000,250,"Capacity : 32GB"));
        allProducts.add(new Product(28,"Dominator Platinum",Type.Ram,"Corsair",5,9299000,850,"Capacity : 32GB"));
        allProducts.add(new Product(29,"Spectrix D80",Type.Ram,"Adata",5,6990000,1000,"Capacity : 32GB"));
        allProducts.add(new Product(30,"Trident Z Royal",Type.Ram,"Gskill",5,4599000,450,"Capacity : 16GB"));

        return allProducts;
    }
    public Product addProduct() {
        System.out.println("Nh???p ID s???n ph???m : ");
        int id = sc.nextInt();
        System.out.println("Nh???p t??n s???n ph???m : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Ch???n th??? lo???i : ");
        Type type = null;
        int choose = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                choose = Integer.parseInt(sc.nextLine());
                if (choose < 1 || choose > 6) {
                    throw new MyException("L???a ch???n kh??ng h???p l???");
                }
                isContinue=false;
            } catch (NumberFormatException e) {
                System.out.println("Vui l??ng nh???p l???i");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui l??ng nh???p l???i : ");
            }
        }
        switch (choose) {
            case 1 -> type = Type.CPU;
            case 2 -> type = Type.GPU;
            case 3 -> type = Type.Mainboard;
            case 4 -> type = Type.PSU;
            case 5 -> type = Type.Ram;
            case 6 -> type = Type.SSD;
        }
        System.out.println("Nh???p h??ng s???n xu???t : ");
        sc.nextLine();
        String manufaturer = sc.nextLine();
        System.out.println("Nh???p th???i h???n b???o h??nh : ");
        int warranty = Integer.parseInt(sc.nextLine());
        System.out.println("Nh???p gi?? : ");
        long price = sc.nextLong();
        System.out.println("Nh???p s??? l?????ng : ");
        int stock = sc.nextInt();
        System.out.println("Nh???p th??ng s??? chi ti???t : ");
        sc.nextLine();
        String detail = sc.nextLine();
        Product newProduct = new Product(id, name, type, manufaturer, warranty, price, stock, detail);

        return newProduct;
    }

    public void updateProduct() {
        System.out.println("Nh???p ID s???n ph???m c???n s???a : ");
        int id = sc.nextInt();
        for (Product p : allProducts) {
            if (p.getId() == id) {
                System.out.println("Nh???p t??n s???n ph???m : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Ch???n th??? lo???i : ");
                Type type = null;
                int choose = 0;
                boolean isContinue = true;
                while (isContinue) {
                    try {
                        choose = Integer.parseInt(sc.nextLine());
                        if (choose < 1 || choose > 6) {
                            throw new MyException("L???a ch???n kh??ng h???p l???");
                        }
                        isContinue=false;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui l??ng nh???p l???i");
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui l??ng nh???p l???i : ");
                    }
                }
                switch (choose) {
                    case 1 -> type = Type.CPU;
                    case 2 -> type = Type.GPU;
                    case 3 -> type = Type.Mainboard;
                    case 4 -> type = Type.PSU;
                    case 5 -> type = Type.Ram;
                    case 6 -> type = Type.SSD;
                }
                System.out.println("Nh???p h??ng s???n xu???t : ");
                sc.nextLine();
                String manufaturer = sc.nextLine();
                System.out.println("Nh???p th???i h???n b???o h??nh : ");
                int warranty = Integer.parseInt(sc.nextLine());
                System.out.println("Nh???p gi?? : ");
                long price = sc.nextLong();
                System.out.println("Nh???p s??? l?????ng : ");
                int stock = sc.nextInt();
                System.out.println("Nh???p th??ng s??? chi ti???t : ");
                sc.nextLine();
                String detail = sc.nextLine();
                p.setName(name);
                p.setType(type);
                p.setManufacturer(manufaturer);
                p.setWarrantyPeriod(warranty);
                p.setStock(stock);
                p.setPrice(price);
                p.setDetail(detail);
                System.out.println("C???p nh???t s???n ph???m th??nh c??ng");
            }
        }
    }
    public void deleteProduct(){
        System.out.println("Nh???p ID s???n ph???m c???n x??a : ");
        int id = sc.nextInt();
        for (int i =0; i<allProducts.size(); i++){
            Product p = allProducts.get(i);
            if (p.getId()==id){
                allProducts.remove(p);
                System.out.println("X??a s???n ph???m th??nh c??ng");
            }
        }
    }
    //t??m theo h??ng s???n xu???t
    public static void searchByManufacturer(){
        sc.nextLine();
        int count = 0;
        System.out.print("Nh???p t??n h??ng b???n c???n t??m : ");
        String manufacturer = sc.nextLine();
        for (Product p : allProducts){
            if (p.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        CartService.addToCart(controller.currentUser);
        if (count==0){
            System.out.println("Kh??ng t??m th???y h??ng");
            return;
        }
    }
    //mua h??ng theo gi?? ti???n
    public static void searchByPrice(){
        Collections.sort(allProducts, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });

        while (true){
            System.out.println("Nh???p kho???ng gi?? b???n mu???n t??m : ");
            System.out.println("   1 - T??? 4 ?????n 10 tri???u");
            System.out.println("   2 - T??? 10 ?????n 20 tri???u");
            System.out.println("   3 - T??? 20 ?????n 40 tri???u");
            System.out.println("   4 - T??? 40 ?????n 70 tri???u");
            System.out.println("   5 - Tr??n 70 tri???u");
            System.out.println("   0 - Quay l???i");
            System.out.print("l???a ch???n gi?? ti???n : ");
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 5) {
                        throw new MyException("L???a ch???n kh??ng h???p l???");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui l??ng nh???p l???i");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui l??ng nh???p l???i : ");
                }
            }
            switch (choose){
                case 1 -> {
                    showProductListByPrice(allProducts,4000000,10000000);
                    CartService.addToCart(Controller.currentUser);
                }
                case 2 -> {
                    showProductListByPrice(allProducts,10000000,20000000);
                    CartService.addToCart(Controller.currentUser);
                }
                case 3 -> {
                    showProductListByPrice(allProducts,20000000,40000000);
                    CartService.addToCart(Controller.currentUser);
                }
                case 4 -> {
                    showProductListByPrice(allProducts,40000000,70000000);
                    CartService.addToCart(Controller.currentUser);
                }
                case 5 -> {
                    showProductListByPrice(allProducts,70000000,1000000000);
                    CartService.addToCart(Controller.currentUser);
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
    //mua h??ng theo t??n
    public static void searchByProductname(){
        sc.nextLine();
        int count = 0;
        System.out.print("Nh???p t??n s???n ph???m b???n c???n t??m : ");
        String name = sc.nextLine();
        for (Product p : allProducts){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        CartService.addToCart(Controller.currentUser);
        if (count==0){
            System.out.println("Kh??ng t??m th???y s???n ph???m");
            return;
        }
    }
    //menu mua h??ng theo th??? lo???i
    public static void searchByCategory(){
        while (true){
            Controller.searchByCategoryMenu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 6) {
                        throw new MyException("L???a ch???n kh??ng h???p l???");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui l??ng nh???p l???i");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui l??ng nh???p l???i : ");
                }
            }
            switch (choose){
                case 1 ->{
                    showProductListByType(allProducts,Type.CPU);
                    CartService.addToCart(Controller.currentUser);
                }
                case 2 -> {
                    showProductListByType(allProducts,Type.GPU);
                    CartService.addToCart(Controller.currentUser);
                }
                case 3 -> {
                    showProductListByType(allProducts,Type.Mainboard);
                    CartService.addToCart(Controller.currentUser);
                }
                case 4 -> {
                    showProductListByType(allProducts,Type.PSU);
                    CartService.addToCart(Controller.currentUser);
                }
                case 5 -> {
                    showProductListByType(allProducts,Type.Ram);
                    CartService.addToCart(Controller.currentUser);
                }
                case 6 -> {
                    showProductListByType(allProducts,Type.SSD);
                    CartService.addToCart(Controller.currentUser);
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
    public static void showProductListByType(ArrayList<Product> products, Type type){
        for (Product p : products){
            if (p.getType()==type){
                System.out.println(p);
            }
        }
    }
    public static void showProductListByPrice(ArrayList<Product> products, long minPrice, long maxPrice){
        for (Product p : products){
            if (p.getPrice()>=minPrice && p.getPrice()<maxPrice){
                System.out.println(p);
            }
        }
    }
}


