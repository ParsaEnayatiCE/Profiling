1. در مرحله ی اول yourkit را نصب کردم و آن را برای ۱۵ روز فعال کردم. در مرحله ی بعد آن را به intellij اضافه کردم و از صحت آن اطمینان حاصل کردم![image](https://github.com/user-attachments/assets/5f77648e-34b1-4ce7-a404-59649c61ff8c)

2. سپس طبق داک profling را برای JavaCup اجرا می کنیم و فانکشن ها را بررسی می کنم:!![image](https://github.com/user-attachments/assets/4d88609f-be5c-4240-8378-aa906b5a6ce6)![image](https://github.com/user-attachments/assets/f3471182-8c12-4c5d-b59a-5f39d25fee82)


3. به وضوح معلوم است که Temp بدون در نظر گرفتن Main مصرف بیش از اندازه ای داشته است  
4. حال اقدام به بررسی چرایی زمان زیاد آن می پردازیم. همان طور که مشاهده می کنید ۲ حلقه ی تو در تو وجود دارد و مقدار معلومی در یک آرایه اضافه می شود![image](https://github.com/user-attachments/assets/0d75bdd6-b907-456c-b23e-1b240805b25d)

5. همان طور که در درس داده ساختار و bp خواندیم، چون اندازه ی آرایه فکیس نیست، هر موقع که به اندازه ی نصف رسید آرایه ای جدید با سایز ۲ برابر ساخته می شود و مقادیر copy می شود. تحلیل الگوریتم آن می گوید که O(1)  است، ولی ضریب ثابت می دهد  
6. برای بهتر کردن آن می توان طول آرایه را از قبل fix گرفت![image](https://github.com/user-attachments/assets/9704c31c-624c-4314-bf68-f13236d25e68)


[Report](https://docs.google.com/document/d/1DEvn08uMs--f0PwltJTUSVDdpQflN8gOmEVepkhdsLk/edit?tab=t.0)
