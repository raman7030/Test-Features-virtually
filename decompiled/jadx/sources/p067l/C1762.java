package p067l;

import android.view.View;
import com.umeng.analytics.pro.C0698cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۚ */
/* JADX INFO: compiled from: U1BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C1762 implements Comparable {

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f60693;

    /* JADX INFO: renamed from: ᩸ */
    public float f60695 = 1.0f;

    /* JADX INFO: renamed from: ۤ */
    public int f60686 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public float f60694 = 0.0f;

    /* JADX INFO: renamed from: ۛ */
    public float f60684 = 0.0f;

    /* JADX INFO: renamed from: ۨ */
    public float f60688 = 0.0f;

    /* JADX INFO: renamed from: ᩺ */
    public float f60697 = 0.0f;

    /* JADX INFO: renamed from: ܰ */
    public float f60691 = 1.0f;

    /* JADX INFO: renamed from: ۟ */
    public float f60685 = 1.0f;

    /* JADX INFO: renamed from: ۗ */
    public float f60682 = Float.NaN;

    /* JADX INFO: renamed from: ۬ */
    public float f60690 = Float.NaN;

    /* JADX INFO: renamed from: ֫֫ */
    public float f60681 = 0.0f;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f60687 = 0.0f;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f60692 = 0.0f;

    /* JADX INFO: renamed from: ۙ */
    public float f60683 = Float.NaN;

    /* JADX INFO: renamed from: ۫ */
    public float f60689 = Float.NaN;

    /* JADX INFO: renamed from: ᩹ */
    public LinkedHashMap f60696 = new LinkedHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((C1762) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45360(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45364(C1762 c1762, HashSet hashSet) {
        if (m45360(this.f60695, c1762.f60695)) {
            hashSet.add("alpha");
        }
        if (m45360(this.f60694, c1762.f60694)) {
            hashSet.add("elevation");
        }
        int i = this.f60693;
        int i2 = c1762.f60693;
        if (i != i2 && this.f60686 == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m45360(this.f60684, c1762.f60684)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f60683) || !Float.isNaN(c1762.f60683)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f60689) || !Float.isNaN(c1762.f60689)) {
            hashSet.add("progress");
        }
        if (m45360(this.f60688, c1762.f60688)) {
            hashSet.add("rotationX");
        }
        if (m45360(this.f60697, c1762.f60697)) {
            hashSet.add("rotationY");
        }
        if (m45360(this.f60682, c1762.f60682)) {
            hashSet.add("transformPivotX");
        }
        if (m45360(this.f60690, c1762.f60690)) {
            hashSet.add("transformPivotY");
        }
        if (m45360(this.f60691, c1762.f60691)) {
            hashSet.add("scaleX");
        }
        if (m45360(this.f60685, c1762.f60685)) {
            hashSet.add("scaleY");
        }
        if (m45360(this.f60681, c1762.f60681)) {
            hashSet.add("translationX");
        }
        if (m45360(this.f60687, c1762.f60687)) {
            hashSet.add("translationY");
        }
        if (m45360(this.f60692, c1762.f60692)) {
            hashSet.add("translationZ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m45361(int i, HashMap map) {
        for (String str : map.keySet()) {
            AbstractC1791 abstractC1791 = (AbstractC1791) map.get(str);
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        b = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        b = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = C0698cb.f2569k;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    abstractC1791.mo28784(Float.isNaN(this.f60688) ? 0.0f : this.f60688, i);
                    break;
                case 1:
                    abstractC1791.mo28784(Float.isNaN(this.f60697) ? 0.0f : this.f60697, i);
                    break;
                case 2:
                    abstractC1791.mo28784(Float.isNaN(this.f60681) ? 0.0f : this.f60681, i);
                    break;
                case 3:
                    abstractC1791.mo28784(Float.isNaN(this.f60687) ? 0.0f : this.f60687, i);
                    break;
                case 4:
                    abstractC1791.mo28784(Float.isNaN(this.f60692) ? 0.0f : this.f60692, i);
                    break;
                case 5:
                    abstractC1791.mo28784(Float.isNaN(this.f60689) ? 0.0f : this.f60689, i);
                    break;
                case 6:
                    abstractC1791.mo28784(Float.isNaN(this.f60691) ? 1.0f : this.f60691, i);
                    break;
                case 7:
                    abstractC1791.mo28784(Float.isNaN(this.f60685) ? 1.0f : this.f60685, i);
                    break;
                case 8:
                    abstractC1791.mo28784(Float.isNaN(this.f60682) ? 0.0f : this.f60682, i);
                    break;
                case 9:
                    abstractC1791.mo28784(Float.isNaN(this.f60690) ? 0.0f : this.f60690, i);
                    break;
                case 10:
                    abstractC1791.mo28784(Float.isNaN(this.f60684) ? 0.0f : this.f60684, i);
                    break;
                case 11:
                    abstractC1791.mo28784(Float.isNaN(this.f60694) ? 0.0f : this.f60694, i);
                    break;
                case 12:
                    abstractC1791.mo28784(Float.isNaN(this.f60683) ? 0.0f : this.f60683, i);
                    break;
                case 13:
                    abstractC1791.mo28784(Float.isNaN(this.f60695) ? 1.0f : this.f60695, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f60696;
                        if (linkedHashMap.containsKey(str2)) {
                            C1531 c1531 = (C1531) linkedHashMap.get(str2);
                            if (abstractC1791 instanceof C1371) {
                                ((C1371) abstractC1791).f35027.append(i, c1531);
                            } else {
                                c1531.m35415();
                                C12826.toString(abstractC1791);
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45362(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f60693 = view.getVisibility();
        this.f60695 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f60694 = view.getElevation();
        this.f60684 = view.getRotation();
        this.f60688 = view.getRotationX();
        this.f60697 = view.getRotationY();
        this.f60691 = view.getScaleX();
        this.f60685 = view.getScaleY();
        this.f60682 = view.getPivotX();
        this.f60690 = view.getPivotY();
        this.f60681 = view.getTranslationX();
        this.f60687 = view.getTranslationY();
        this.f60692 = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45363(C1591 c1591, C1050 c1050, int i) {
        c1591.m37932();
        c1591.m37933();
        C1890 c1890M14560 = c1050.m14560(i);
        C1645 c1645 = c1890M14560.f70844;
        C1295 c1295 = c1890M14560.f70845;
        int i2 = c1645.f53039;
        this.f60686 = i2;
        int i3 = c1645.f53038;
        this.f60693 = i3;
        this.f60695 = (i3 == 0 || i2 != 0) ? c1645.f53035 : 0.0f;
        C0980 c0980 = c1890M14560.f70842;
        boolean z = c0980.f11486;
        this.f60694 = c0980.f11491;
        this.f60684 = c0980.f11496;
        this.f60688 = c0980.f11495;
        this.f60697 = c0980.f11492;
        this.f60691 = c0980.f11498;
        this.f60685 = c0980.f11488;
        this.f60682 = c0980.f11497;
        this.f60690 = c0980.f11490;
        this.f60681 = c0980.f11489;
        this.f60687 = c0980.f11493;
        this.f60692 = c0980.f11487;
        C1265.m24178(c1295.f30618);
        this.f60683 = c1295.f30614;
        this.f60689 = c1890M14560.f70844.f53037;
        for (String str : c1890M14560.f70841.keySet()) {
            C1531 c1531 = (C1531) c1890M14560.f70841.get(str);
            if (c1531.m35411() != EnumC1986.STRING_TYPE) {
                this.f60696.put(str, c1531);
            }
        }
    }
}
