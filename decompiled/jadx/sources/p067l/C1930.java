package p067l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹֡ */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes.dex */
public final class C1930 extends AbstractC1090 {

    /* JADX INFO: renamed from: ܳ */
    public int f72907 = 0;

    /* JADX INFO: renamed from: ۠ */
    public int f72904 = -1;

    /* JADX INFO: renamed from: ֨ */
    public float f72899 = Float.NaN;

    /* JADX INFO: renamed from: ۚ */
    public float f72902 = 0.0f;

    /* JADX INFO: renamed from: ۜ */
    public float f72903 = Float.NaN;

    /* JADX INFO: renamed from: ܶ */
    public int f72908 = -1;

    /* JADX INFO: renamed from: ܿ */
    public float f72910 = Float.NaN;

    /* JADX INFO: renamed from: ᩻ */
    public float f72914 = Float.NaN;

    /* JADX INFO: renamed from: ᩷ */
    public float f72913 = Float.NaN;

    /* JADX INFO: renamed from: ۘ */
    public float f72901 = Float.NaN;

    /* JADX INFO: renamed from: ۢ */
    public float f72906 = Float.NaN;

    /* JADX INFO: renamed from: ۡ */
    public float f72905 = Float.NaN;

    /* JADX INFO: renamed from: ܺ */
    public float f72909 = Float.NaN;

    /* JADX INFO: renamed from: ۖ */
    public float f72900 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ */
    public float f72911 = Float.NaN;

    /* JADX INFO: renamed from: ᩵ */
    public float f72912 = Float.NaN;

    /* JADX INFO: renamed from: ֡ */
    public float f72898 = Float.NaN;

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13281(HashMap map) {
        throw null;
    }

    public C1930() {
        this.f18544 = new HashMap();
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13280(Context context, AttributeSet attributeSet) {
        C1895.m50501(this, context.obtainStyledAttributes(attributeSet, C1925.f72685));
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13282(HashSet hashSet) {
        if (!Float.isNaN(this.f72910)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f72914)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f72913)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f72906)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f72905)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f72909)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f72900)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f72901)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f72911)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f72912)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f72898)) {
            hashSet.add("translationZ");
        }
        if (this.f18544.size() > 0) {
            Iterator it = this.f18544.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX INFO: renamed from: ܽ */
    public final void m51718(HashMap map) {
        float f;
        float f2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C1531 c1531 = (C1531) this.f18544.get(str.substring(7));
                if (c1531 != null && c1531.m35411() == EnumC1986.FLOAT_TYPE) {
                    ((AbstractC1552) map.get(str)).m36268(this.f18545, this.f72904, this.f72908, this.f72899, this.f72902, c1531.m35415(), c1531);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f72906;
                        f2 = f;
                        break;
                    case "rotationY":
                        f = this.f72905;
                        f2 = f;
                        break;
                    case "translationX":
                        f = this.f72911;
                        f2 = f;
                        break;
                    case "translationY":
                        f = this.f72912;
                        f2 = f;
                        break;
                    case "translationZ":
                        f = this.f72898;
                        f2 = f;
                        break;
                    case "progress":
                        f = this.f72903;
                        f2 = f;
                        break;
                    case "scaleX":
                        f = this.f72909;
                        f2 = f;
                        break;
                    case "scaleY":
                        f = this.f72900;
                        f2 = f;
                        break;
                    case "rotation":
                        f = this.f72913;
                        f2 = f;
                        break;
                    case "elevation":
                        f = this.f72914;
                        f2 = f;
                        break;
                    case "transitionPathRotate":
                        f = this.f72901;
                        f2 = f;
                        break;
                    case "alpha":
                        f = this.f72910;
                        f2 = f;
                        break;
                    case "waveOffset":
                        f = this.f72902;
                        f2 = f;
                        break;
                    default:
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2)) {
                    ((AbstractC1552) map.get(str)).m36267(this.f18545, this.f72904, this.f72908, this.f72899, this.f72902, f2);
                }
            }
        }
    }
}
