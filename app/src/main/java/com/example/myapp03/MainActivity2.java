package com.example.myapp03;;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import com.example.myapp03.model.Car;


public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ car ไว้ใน ArrayList<car> ชื่อว่า cars
        //
        List<Car> cars = new ArrayList<Car>();
        Car car = new Car();
        car.setCar_name("Honda City");
        car.setCar_image("https://www.honda.co.th/uploads/car_models/grade/1686759424_764.jpg");
        car.setCar_price(629000);
        car.setCar_Website_url("https://www.honda.co.th/city");
        cars.add(car);

        Car car1 = new Car();
        car1.setCar_name("Honda Civic");
        car1.setCar_image("https://www.honda.co.th/uploads/car_models/grade/1654249371_709.png");
        car1.setCar_price(964900);
        car1.setCar_Website_url("https://www.honda.co.th/civic");
        cars.add(car1);

        Car car2 = new Car();
        car2.setCar_name("Tesla Model 3");
        car2.setCar_image("https://digitalassets.tesla.com/tesla-contents/image/upload/h_1800,w_2880,c_fit,f_auto,q_auto:best/Model-3-Main-Hero-Desktop-RHD");
        car2.setCar_price(1759000);
        car2.setCar_Website_url("https://www.tesla.com/th_th/model3");
        cars.add(car2);

        Car car3 = new Car();
        car3.setCar_name("Tesla Model Y");
        car3.setCar_image("https://digitalassets.tesla.com/tesla-contents/image/upload/h_1800,w_2880,c_fit,f_auto,q_auto:best/Model-Y-Main-Hero-Desktop-Global");
        car3.setCar_price(1959000);
        car3.setCar_Website_url("https://www.tesla.com/th_th/modely");
        cars.add(car3);

        Car car4 = new Car();
        car4.setCar_name("Koenigsegg Jesko");
        car4.setCar_image("https://mainwebstorage.blob.core.windows.net/mediacontainers/styles/1920x1400/azure/2022-04/Pre-series%20Jesko%202.jpg?h=053a0b09&itok=uNbJxASB");
        car4.setCar_price(350000000);
        car4.setCar_Website_url("https://www.koenigsegg.com/model/jesko-attack");
        cars.add(car4);

        Car car5 = new Car();
        car5.setCar_name("Koenigsegg CC850");
        car5.setCar_image("https://mainwebstorage.blob.core.windows.net/mediacontainers/styles/1920x1400/azure/2023-01/Koenigsegg-CC850%205.jpg?h=fd59b84b&itok=99EwcGDI");
        car5.setCar_price(133000000);
        car5.setCar_Website_url("https://www.koenigsegg.com/model/cc850");
        cars.add(car5);

        Car car6 = new Car();
        car6.setCar_name("Ford Ranger Raptor");
        car6.setCar_image("https://www.ford.co.th/content/dam/ecomm/raptor/release-2/th/th_th/landing/next-gen-ranger-raptor.jpg.renditions.original.png");
        car6.setCar_price(1919000);
        car6.setCar_Website_url("https://www.ford.co.th/showroom/future-vehicle/next-generation-ranger-raptor");
        cars.add(car6);

        Car car7 = new Car();
        car7.setCar_name("Ford Everest");
        car7.setCar_image("https://www.ford.co.th/content/dam/ecomm/u704/release-3/th-th/landing/next-gen-everest-billboard-one.jpg.renditions.original.png");
        car7.setCar_price(1354000);
        car7.setCar_Website_url("https://www.ford.co.th/showroom/future-vehicle/next-generation-everest");
        cars.add(car7);

        Car car8 = new Car();
        car8.setCar_name("Honda HR-V");
        car8.setCar_image("https://www.honda.co.th/uploads/car_models/grade/1635850799_725.png");
        car8.setCar_price(979000);
        car8.setCar_Website_url("https://www.honda.co.th/hrvehev");
        cars.add(car8);

        Car car9 = new Car();
        car9.setCar_name("BMW i4");
        car9.setCar_image("https://www.bmw.co.th/content/dam/bmw/common/all-models/i-series/i4/onepager-new/bmw-i4-edrive-40-onepager-sp-desktop.jpg/jcr:content/renditions/cq5dam.resized.img.1680.large.time1625584117626.jpg");
        car9.setCar_price(3789000);
        car9.setCar_Website_url("https://www.toyotakrungthai.com/cars/yaris/");
        cars.add(car9);

        Car car10 = new Car();
        car10.setCar_name("Toyota Camry HEV Premium Luxury");
        car10.setCar_image("https://www.toyota.co.th/media/product/series/grades/v/camry/181/5218fee9a08edf612a42103b76279f20ebcf87df6a2c49ec40957759191a25e3.webp");
        car10.setCar_price(1809000);
        car10.setCar_Website_url("https://www.toyota.co.th/model/camry/specification");
        cars.add(car10);

        mAdapter = new MyAdapter(cars, this);
        recyclerView.setAdapter(mAdapter);
    }
}
