package l;

import android.content.Context;
import android.util.AttributeSet;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7812 extends AbstractC4990 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24132 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f24134 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f24138 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f24130 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f24133 = Float.NaN;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f24126 = Float.NaN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f24129 = Float.NaN;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f24137 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f24136 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f24127 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f24135 = Float.NaN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f24124 = Float.NaN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f24128 = Float.NaN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f24125 = Float.NaN;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f24131 = Float.NaN;

    public C7812() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C0756.m2896(this, context.obtainStyledAttributes(attributeSet, C21840.f69993));
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f24134)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24138)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24130)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24133)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24126)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24129)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f24137)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f24124)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24128)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24125)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f24136)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24127)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24135)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24131)) {
            hashSet.add("progress");
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ۧ */
    public final void mo14474(HashMap map) {
        if (this.f24132 == -1) {
            return;
        }
        if (!Float.isNaN(this.f24134)) {
            map.put("alpha", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24138)) {
            map.put("elevation", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24130)) {
            map.put("rotation", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24133)) {
            map.put("rotationX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24126)) {
            map.put("rotationY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24129)) {
            map.put("transformPivotX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24137)) {
            map.put("transformPivotY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24124)) {
            map.put("translationX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24128)) {
            map.put("translationY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24125)) {
            map.put("translationZ", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24136)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24127)) {
            map.put("scaleX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24135)) {
            map.put("scaleY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24131)) {
            map.put("progress", Integer.valueOf(this.f24132));
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                map.put(C20094.m46315("CUSTOM,", (String) it.next()), Integer.valueOf(this.f24132));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11329(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC19123 abstractC19123 = (AbstractC19123) map.get(str);
            byte b = 7;
            if (str.startsWith("CUSTOM")) {
                C13888 c13888 = (C13888) this.f15711.get(str.substring(7));
                if (c13888 != null) {
                    ((C10656) abstractC19123).f32056.append(this.f15712, c13888);
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -908189617:
                        if (!str.equals("scaleY")) {
                            b = -1;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        } else {
                            b = -1;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = cb.k;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        if (!Float.isNaN(this.f24133)) {
                            abstractC19123.mo26745(this.f24133, this.f15712);
                        }
                        break;
                    case 1:
                        if (!Float.isNaN(this.f24126)) {
                            abstractC19123.mo26745(this.f24126, this.f15712);
                        }
                        break;
                    case 2:
                        if (!Float.isNaN(this.f24124)) {
                            abstractC19123.mo26745(this.f24124, this.f15712);
                        }
                        break;
                    case 3:
                        if (!Float.isNaN(this.f24128)) {
                            abstractC19123.mo26745(this.f24128, this.f15712);
                        }
                        break;
                    case 4:
                        if (!Float.isNaN(this.f24125)) {
                            abstractC19123.mo26745(this.f24125, this.f15712);
                        }
                        break;
                    case 5:
                        if (!Float.isNaN(this.f24131)) {
                            abstractC19123.mo26745(this.f24131, this.f15712);
                        }
                        break;
                    case 6:
                        if (!Float.isNaN(this.f24127)) {
                            abstractC19123.mo26745(this.f24127, this.f15712);
                        }
                        break;
                    case 7:
                        if (!Float.isNaN(this.f24135)) {
                            abstractC19123.mo26745(this.f24135, this.f15712);
                        }
                        break;
                    case 8:
                        if (!Float.isNaN(this.f24133)) {
                            abstractC19123.mo26745(this.f24129, this.f15712);
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.f24126)) {
                            abstractC19123.mo26745(this.f24137, this.f15712);
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.f24130)) {
                            abstractC19123.mo26745(this.f24130, this.f15712);
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.f24138)) {
                            abstractC19123.mo26745(this.f24138, this.f15712);
                        }
                        break;
                    case 12:
                        if (!Float.isNaN(this.f24136)) {
                            abstractC19123.mo26745(this.f24136, this.f15712);
                        }
                        break;
                    case 13:
                        if (!Float.isNaN(this.f24134)) {
                            abstractC19123.mo26745(this.f24134, this.f15712);
                        }
                        break;
                }
            }
        }
    }
}
