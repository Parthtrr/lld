package com.lm10.lld.pen.pen1;

import com.lm10.lld.pen.pen1.dto.Ink;
import com.lm10.lld.pen.pen1.dto.Nib;
import com.lm10.lld.pen.pen1.dto.Refill;
import com.lm10.lld.pen.pen1.pens.BallPen;
import com.lm10.lld.pen.pen1.pens.JamesBondPen;
import com.lm10.lld.pen.pen1.pens.Pen;

public class MainPen {

  public static void main(String[] args) {
    Refill ballPenrefill = Refill.builder().nib(Nib.builder().radius(1).build())
      .brand("s").ink(Ink.builder().color("red").type("circular").build())
      .build();
    Pen ballPen = new BallPen(ballPenrefill);
    ballPen.write();

    JamesBondPen spyPen = new JamesBondPen(ballPenrefill);
    spyPen.write();
    System.out.println("What does this pen have" + spyPen.hasCamera() + " and " + spyPen.hasMic());
    String s1 = "1";
    String s2 = "1";
    Integer i1= 1289;
    Integer i2 = 1289;
    int i3=1;
    int i4=i3;
    System.out.println(s1==s2);
    System.out.println(i1==i2);
    System.out.println(i3==i4);

  }

}
