package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.C20195;
import l.C4331;
import l.C8200;

/* JADX INFO: loaded from: classes.dex */
public final class TemperatureCache {
    public final Hct input;
    public Hct precomputedComplement;
    public List precomputedHctsByHue;
    public List precomputedHctsByTemp;
    public Map precomputedTempsByHct;

    public static boolean isBetween(double d, double d2, double d3) {
        if (d2 < d3) {
            return d2 <= d && d <= d3;
        }
        return d2 <= d || d <= d3;
    }

    public TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }

    public Hct getComplement() {
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double dDoubleValue = ((Double) getTempsByHct().get(getColdest())).doubleValue();
        double hue2 = getWarmest().getHue();
        double dDoubleValue2 = ((Double) getTempsByHct().get(getWarmest())).doubleValue() - dDoubleValue;
        boolean zIsBetween = isBetween(this.input.getHue(), hue, hue2);
        double d = zIsBetween ? hue2 : hue;
        if (!zIsBetween) {
            hue = hue2;
        }
        Hct hct2 = (Hct) getHctsByHue().get((int) Math.round(this.input.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d2 = 1000.0d;
        for (double d3 = 0.0d; d3 <= 360.0d; d3 += 1.0d) {
            double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((1.0d * d3) + d);
            if (isBetween(dSanitizeDegreesDouble, d, hue)) {
                Hct hct3 = (Hct) getHctsByHue().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((((Double) getTempsByHct().get(hct3)).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d2) {
                    hct2 = hct3;
                    d2 = dAbs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public List getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public List getAnalogousColors(int i, int i2) {
        int iRound = (int) Math.round(this.input.getHue());
        Hct hct = (Hct) getHctsByHue().get(iRound);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double dAbs = 0.0d;
        int i3 = 0;
        double dAbs2 = 0.0d;
        while (i3 < 360) {
            double relativeTemperature2 = getRelativeTemperature((Hct) getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i3)));
            dAbs2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i3++;
            relativeTemperature = relativeTemperature2;
        }
        double d = dAbs2 / ((double) i2);
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i4 = 1;
        while (arrayList.size() < i2) {
            Hct hct2 = (Hct) getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i4));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            dAbs += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z = dAbs >= ((double) arrayList.size()) * d;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(hct2);
                double d2 = relativeTemperature4;
                z = dAbs >= ((double) (arrayList.size() + i5)) * d;
                i5++;
                relativeTemperature4 = d2;
            }
            double d3 = relativeTemperature4;
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(hct2);
                }
                break;
            }
            relativeTemperature3 = d3;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int iFloor = (int) Math.floor((((double) i) - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < iFloor + 1; i6++) {
            int size = 0 - i6;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(size));
        }
        int i7 = i - iFloor;
        for (int i8 = 1; i8 < i7; i8++) {
            int size2 = i8;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(size2));
        }
        return arrayList2;
    }

    public double getRelativeTemperature(Hct hct) {
        double dDoubleValue = ((Double) getTempsByHct().get(getWarmest())).doubleValue() - ((Double) getTempsByHct().get(getColdest())).doubleValue();
        double dDoubleValue2 = ((Double) getTempsByHct().get(hct)).doubleValue() - ((Double) getTempsByHct().get(getColdest())).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public static double rawTemperature(Hct hct) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return (Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1]))) - 50.0d))) * (Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d)) - 0.5d;
    }

    private Hct getColdest() {
        return (Hct) getHctsByTemp().get(0);
    }

    private List getHctsByHue() {
        List list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            arrayList.add(Hct.from(d, this.input.getChroma(), this.input.getTone()));
        }
        List listUnmodifiableList = C20195.unmodifiableList(arrayList);
        this.precomputedHctsByHue = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List getHctsByTemp() {
        List list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, C8200.comparing(new C4331(2, this), new TemperatureCache$$ExternalSyntheticLambda1()));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return (Double) getTempsByHct().get(hct);
    }

    private Map getTempsByHct() {
        Map map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap map2 = new HashMap();
        for (Hct hct : arrayList) {
            map2.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = map2;
        return map2;
    }

    private Hct getWarmest() {
        return (Hct) getHctsByTemp().get(getHctsByTemp().size() - 1);
    }
}
