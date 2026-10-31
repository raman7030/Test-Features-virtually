package l;

import android.view.View;
import com.umeng.analytics.pro.cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18542 implements Comparable {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f57469;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f57471 = 1.0f;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57462 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f57470 = 0.0f;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f57460 = 0.0f;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f57464 = 0.0f;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f57473 = 0.0f;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f57467 = 1.0f;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f57461 = 1.0f;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f57458 = Float.NaN;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f57466 = Float.NaN;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f57457 = 0.0f;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f57463 = 0.0f;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f57468 = 0.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f57459 = Float.NaN;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f57465 = Float.NaN;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f57472 = new LinkedHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((C18542) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43082(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43086(C18542 c18542, HashSet hashSet) {
        if (m43082(this.f57471, c18542.f57471)) {
            hashSet.add("alpha");
        }
        if (m43082(this.f57470, c18542.f57470)) {
            hashSet.add("elevation");
        }
        int i = this.f57469;
        int i2 = c18542.f57469;
        if (i != i2 && this.f57462 == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m43082(this.f57460, c18542.f57460)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f57459) || !Float.isNaN(c18542.f57459)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f57465) || !Float.isNaN(c18542.f57465)) {
            hashSet.add("progress");
        }
        if (m43082(this.f57464, c18542.f57464)) {
            hashSet.add("rotationX");
        }
        if (m43082(this.f57473, c18542.f57473)) {
            hashSet.add("rotationY");
        }
        if (m43082(this.f57458, c18542.f57458)) {
            hashSet.add("transformPivotX");
        }
        if (m43082(this.f57466, c18542.f57466)) {
            hashSet.add("transformPivotY");
        }
        if (m43082(this.f57467, c18542.f57467)) {
            hashSet.add("scaleX");
        }
        if (m43082(this.f57461, c18542.f57461)) {
            hashSet.add("scaleY");
        }
        if (m43082(this.f57457, c18542.f57457)) {
            hashSet.add("translationX");
        }
        if (m43082(this.f57463, c18542.f57463)) {
            hashSet.add("translationY");
        }
        if (m43082(this.f57468, c18542.f57468)) {
            hashSet.add("translationZ");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43083(int i, HashMap map) {
        for (String str : map.keySet()) {
            AbstractC19123 abstractC19123 = (AbstractC19123) map.get(str);
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
                        b = cb.k;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    abstractC19123.mo26745(Float.isNaN(this.f57464) ? 0.0f : this.f57464, i);
                    break;
                case 1:
                    abstractC19123.mo26745(Float.isNaN(this.f57473) ? 0.0f : this.f57473, i);
                    break;
                case 2:
                    abstractC19123.mo26745(Float.isNaN(this.f57457) ? 0.0f : this.f57457, i);
                    break;
                case 3:
                    abstractC19123.mo26745(Float.isNaN(this.f57463) ? 0.0f : this.f57463, i);
                    break;
                case 4:
                    abstractC19123.mo26745(Float.isNaN(this.f57468) ? 0.0f : this.f57468, i);
                    break;
                case 5:
                    abstractC19123.mo26745(Float.isNaN(this.f57465) ? 0.0f : this.f57465, i);
                    break;
                case 6:
                    abstractC19123.mo26745(Float.isNaN(this.f57467) ? 1.0f : this.f57467, i);
                    break;
                case 7:
                    abstractC19123.mo26745(Float.isNaN(this.f57461) ? 1.0f : this.f57461, i);
                    break;
                case 8:
                    abstractC19123.mo26745(Float.isNaN(this.f57458) ? 0.0f : this.f57458, i);
                    break;
                case 9:
                    abstractC19123.mo26745(Float.isNaN(this.f57466) ? 0.0f : this.f57466, i);
                    break;
                case 10:
                    abstractC19123.mo26745(Float.isNaN(this.f57460) ? 0.0f : this.f57460, i);
                    break;
                case 11:
                    abstractC19123.mo26745(Float.isNaN(this.f57470) ? 0.0f : this.f57470, i);
                    break;
                case 12:
                    abstractC19123.mo26745(Float.isNaN(this.f57459) ? 0.0f : this.f57459, i);
                    break;
                case 13:
                    abstractC19123.mo26745(Float.isNaN(this.f57471) ? 1.0f : this.f57471, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f57472;
                        if (linkedHashMap.containsKey(str2)) {
                            C13888 c13888 = (C13888) linkedHashMap.get(str2);
                            if (abstractC19123 instanceof C10656) {
                                ((C10656) abstractC19123).f32056.append(i, c13888);
                            } else {
                                c13888.m33296();
                                C11003.toString(abstractC19123);
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43084(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f57469 = view.getVisibility();
        this.f57471 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f57470 = view.getElevation();
        this.f57460 = view.getRotation();
        this.f57464 = view.getRotationX();
        this.f57473 = view.getRotationY();
        this.f57467 = view.getScaleX();
        this.f57461 = view.getScaleY();
        this.f57458 = view.getPivotX();
        this.f57466 = view.getPivotY();
        this.f57457 = view.getTranslationX();
        this.f57463 = view.getTranslationY();
        this.f57468 = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43085(C15094 c15094, C4201 c4201, int i) {
        c15094.m35774();
        c15094.m35775();
        C21135 c21135M12684 = c4201.m12684(i);
        C16194 c16194 = c21135M12684.f68162;
        C9140 c9140 = c21135M12684.f68163;
        int i2 = c16194.f49873;
        this.f57462 = i2;
        int i3 = c16194.f49872;
        this.f57469 = i3;
        this.f57471 = (i3 == 0 || i2 != 0) ? c16194.f49869 : 0.0f;
        C2790 c2790 = c21135M12684.f68160;
        boolean z = c2790.f8692;
        this.f57470 = c2790.f8697;
        this.f57460 = c2790.f8702;
        this.f57464 = c2790.f8701;
        this.f57473 = c2790.f8698;
        this.f57467 = c2790.f8704;
        this.f57461 = c2790.f8694;
        this.f57458 = c2790.f8703;
        this.f57466 = c2790.f8696;
        this.f57457 = c2790.f8695;
        this.f57463 = c2790.f8699;
        this.f57468 = c2790.f8693;
        C8518.m22210(c9140.f27678);
        this.f57459 = c9140.f27674;
        this.f57465 = c21135M12684.f68162.f49871;
        for (String str : c21135M12684.f68159.keySet()) {
            C13888 c13888 = (C13888) c21135M12684.f68159.get(str);
            if (c13888.m33292() != EnumC23061.STRING_TYPE) {
                this.f57472.put(str, c13888);
            }
        }
    }
}
