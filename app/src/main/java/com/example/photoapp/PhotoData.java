package com.example.photoapp;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos =new ArrayList<>();
        photos.add(new Photo(0,"https://caphethuonghang.vn/wp-content/uploads/2020/06/ArabicHoney-600x600.jpg","milk","Arabica Cầu Đất thượng hạng có vị chua thanh xen lẫn với vị đắng nhẹ, nước pha màu nước nâu nhạt, trong trẻo của hổ phách. Mùi hương của Arabica rất thanh tao, quý phái, Arabica có mùi của hoa trái, hòa quyện với mùi của mật ong, và cà mùi bánh mì nướng, mùi của cánh đồng rơm buổi trưa hè…"));
        photos.add(new Photo(1,"https://bizweb.dktcdn.net/100/139/060/products/hanh-nhan-hat-chia-khong-duong-1l.png","Sữa Hạnh Nhân","Với sản phẩm tươi sống, trọng lượng thực tế có thể chênh lệch khoảng 10%.\n" +
                "\n" +
                "Giá sản phẩm trên TriFarm đã bao gồm thuế theo luật hiện hành."));
        photos.add(new Photo(2,"https://cdn.shopify.com/s/files/1/0617/2497/files/nam-linh-chi-trang_f714aa6a-9d11-49fd-ac37-0017607f42c7_480x480.png?v=1635501240","nấm","Nấm thủy tiên trắng Nhật Bản là một trong những loại nấm thuộc họ nấm thủy tinh, với màu trắng tinh khiết, gợi đến sự thuần khiết từ tự nhiên, nấm thủy tiên trắng luôn là loại nấm được thực khách lựa chọn. Nấm thủy tiên trắng có hương thơm của Nấm linh chi."));
        photos.add(new Photo(3,"https://salt.tikicdn.com/cache/w1200/ts/product/02/50/38/4ecfb025ef4a74aa3041e8fd71352bbc.png","mứt vải","Vina Mứt Vải là Dòng sản phẩm chuyên dụng pha chế các thức uống. Hương trái cây tự nhiện, đậm vị dễ dàng pha trộn với các dòng sản phẩm khác. Hương thơm nhẹ của vải cùng vị ngon ngọt. Mứt thích hợp dùng để pha chế."));
        return photos;
    }
    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs =generatePhotoData();
        for (int i=0;i < phs.size();id++)
            if (phs.get(i).getId()==id)
               return phs.get(i);
         return null;
    }
}
