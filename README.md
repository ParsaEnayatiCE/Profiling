1. در مرحله ی اول yourkit را نصب کردم و آن را برای ۱۵ روز فعال کردم. در مرحله ی بعد آن را به intellij اضافه کردم و از صحت آن اطمینان حاصل کردم![image](https://github.com/user-attachments/assets/5f77648e-34b1-4ce7-a404-59649c61ff8c)

2. سپس طبق داک profling را برای JavaCup اجرا می کنیم و فانکشن ها را بررسی می کنم:!![image](https://github.com/user-attachments/assets/4d88609f-be5c-4240-8378-aa906b5a6ce6)![image](https://github.com/user-attachments/assets/f3471182-8c12-4c5d-b59a-5f39d25fee82)


3. به وضوح معلوم است که Temp بدون در نظر گرفتن Main مصرف بیش از اندازه ای داشته است  
4. حال اقدام به بررسی چرایی زمان زیاد آن می پردازیم. همان طور که مشاهده می کنید ۲ حلقه ی تو در تو وجود دارد و مقدار معلومی در یک آرایه اضافه می شود![image](https://github.com/user-attachments/assets/0d75bdd6-b907-456c-b23e-1b240805b25d)

5. همان طور که در درس داده ساختار و bp خواندیم، چون اندازه ی آرایه فکیس نیست، هر موقع که به اندازه ی نصف رسید آرایه ای جدید با سایز ۲ برابر ساخته می شود و مقادیر copy می شود. تحلیل الگوریتم آن می گوید که O(1)  است، ولی ضریب ثابت می دهد  
6. برای بهتر کردن آن می توان طول آرایه را از قبل fix گرفت![image](https://github.com/user-attachments/assets/9704c31c-624c-4314-bf68-f13236d25e68)


بخش دوم:

کدهای نابهینه و مشکلات آنها

۱. بخش محاسباتی (CPU-Intensive)

کد نابهینه:
![Screenshot 2025-05-13 173555](https://github.com/user-attachments/assets/510e9155-bfed-472e-ad39-4bff49c5593e)



مشکلات:

پیچیدگی زمانی O(n²) به دلیل حلقه‌های تودرتو

انجام ۱ میلیارد عملیات ضرب و جمع

مصرف بالای پردازنده و زمان اجرای طولانی

![Screenshot 2025-05-13 164107](https://github.com/user-attachments/assets/473e50a4-9b87-4019-a229-fdff269a4b34)



۲. بخش مدیریت حافظه (Memory-Intensive)

کد نابهینه:
![Screenshot 2025-05-13 173620](https://github.com/user-attachments/assets/00b08949-afed-4636-8641-4682a8f4db45)

مشکلات:

ایجاد ضمنی StringBuilder جدید در هر بار الحاق رشته

تغییر اندازه پویای ArrayList و کپی‌های مکرر آرایه

فشار زیاد به سیستم مدیریت حافظه (GC)

![Screenshot 2025-05-13 164356](https://github.com/user-attachments/assets/cf3c578c-589a-459e-bfd8-4eeda4011e59)


۱. بهینه‌سازی محاسباتی

کد بهینه:
![Screenshot 2025-05-13 173639](https://github.com/user-attachments/assets/5fbd1c57-34fa-4619-9fa7-a0be16d85024)


بهبودها:

کاهش پیچیدگی از O(n²) به O(n)

کاهش از ۱ میلیارد به ۱۱۰ هزار عملیات
![Screenshot 2025-05-13 164213](https://github.com/user-attachments/assets/e009d366-70cf-49f7-ac79-cdebd52d9842)



۲. بهینه‌سازی حافظه

کد بهینه:

![Screenshot 2025-05-13 173655](https://github.com/user-attachments/assets/8fd22194-839c-4649-a798-ea7fdc282a11)


حذف ایجاد خودکار StringBuilder در هر تکرار

پیش‌تنظیم ظرفیت ArrayList

کاهش ۴۰٪ مصرف حافظه موقت

کاهش ۷۰٪ فراخوانی‌های GC
![Screenshot 2025-05-13 154738](https://github.com/user-attachments/assets/a9d41145-3beb-4fbe-9603-ad5adbe5ed15)


در نهایت به کمک قطعه کدی یکسان بودن نتایج قبل و بعد از تغییر را بررسی کردیم.
![Screenshot 2025-05-13 163444](https://github.com/user-attachments/assets/6b3cd237-ed8f-4ebc-82c1-19b1149dfa82)


[Report](https://docs.google.com/document/d/1DEvn08uMs--f0PwltJTUSVDdpQflN8gOmEVepkhdsLk/edit?tab=t.0)

