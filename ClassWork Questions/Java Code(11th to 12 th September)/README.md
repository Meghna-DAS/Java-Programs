Inheritance problem

Fulltime Employee  :-  EMPNO, Name , dept, email , phno, Qulification , desg,   basic pay , Month 
Methods :- setdata(), getdata(), calsal(), display_sal();
Employee - full   - paymaent  = basicpay 12000   , DA-90% of basicpay , TA= 80% of baispay, HRA=50%  basicpay, monltly Sal = basic+ DA + HRA + TA  -8 hours

Employee Part time  EMPNO, Name , dept, email , phno, Qulification ,    cpay , Extwrkhr, Month
Methods  :- setdata(). getdata(), calpay()
part time  - fix time they work 3 hours day  -- consolidate  =50000/-  EXta hour paid =1000/-

EMP-base:-   EMPNO, Name , dept, email , phno, Qulification ,Month 
             Setdata and getdata
			 
F_EMPloyee :-  Desg, basicpay
   calsal(), display_sal()

P_Employee	 :- cpay , Extwrkhr, exprience 
if exprience  is <=5 years = 20000/-
if exprience  is >5 years  and <10 years = 30000/ -
if exprience  is >10 years = 50000/-
Methods :- calpay()
