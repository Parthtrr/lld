package com.lm10.lld.pen.PenCodex.PenCodex;

import com.lm10.lld.pen.PenCodex.PenCodex.model.BodyMaterial;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.InkType;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.NibMaterial;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.BallPen;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.DotPen;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.FountainPen;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.GelPen;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.JamesBondPen;
import com.lm10.lld.pen.PenCodex.PenCodex.pen.Pen;
import com.lm10.lld.pen.PenCodex.PenCodex.style.FastWritingStyle;
import com.lm10.lld.pen.PenCodex.PenCodex.style.SmoothWritingStyle;

public final class PenCodexDemo {
  private PenCodexDemo() {
  }

  public static void main(String[] args) {
    Ink blueOilInk = new Ink("Blue", InkType.OIL_BASED);
    Ink blackGelInk = new Ink("Black", InkType.GEL_BASED);
    Ink royalBlueInk = new Ink("Royal Blue", InkType.WATER_BASED);

    Nib fineNib = new Nib(0.7, NibMaterial.STEEL);
    Nib mediumNib = new Nib(1.0, NibMaterial.BRASS);
    Nib premiumNib = new Nib(0.8, NibMaterial.GOLD);

    Pen ballPen = new BallPen(
        new PenMetadata("Reynolds", "Trimax", BodyMaterial.PLASTIC, 45.0),
        fineNib,
        new FastWritingStyle(),
        new Refill("Reynolds", blueOilInk, 100.0));

    Pen gelPen = new GelPen(
        new PenMetadata("Pilot", "G2", BodyMaterial.PLASTIC, 80.0),
        mediumNib,
        new SmoothWritingStyle(),
        new Refill("Pilot", blackGelInk, 120.0));

    FountainPen fountainPen = new FountainPen(
        new PenMetadata("Parker", "Vector", BodyMaterial.METAL, 950.0),
        premiumNib,
        new SmoothWritingStyle(),
        royalBlueInk,
        150.0,
        90.0);

    Pen dotPen = new DotPen(
        new PenMetadata("Cello", "PinPoint", BodyMaterial.PLASTIC, 10.0),
        fineNib,
        new FastWritingStyle(),
        blueOilInk,
        60.0);

    JamesBondPen spyPen = new JamesBondPen(
        new PenMetadata("MI6", "Spectre", BodyMaterial.METAL, 5000.0),
        fineNib,
        new FastWritingStyle(),
        new Refill("MI6", blueOilInk, 100.0));

    print(ballPen);
    print(gelPen);
    print(fountainPen);
    print(dotPen);
    print(spyPen);

    System.out.println(ballPen.write("Design should follow behavior."));
    System.out.println(gelPen.write("Composition keeps the model flexible."));
    System.out.println(fountainPen.write("Fountain pens prefer deliberate strokes."));
    fountainPen.fillInk(royalBlueInk, 20.0);
    System.out.println("After refill: " + fountainPen.describe());
    System.out.println(spyPen.write("Mission accepted."));
    System.out.println("Spy features: " + spyPen.featureSummary());
  }

  private static void print(Pen pen) {
    System.out.println(pen.describe());
  }
}
