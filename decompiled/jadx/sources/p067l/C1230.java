package p067l;

import android.content.Context;
import android.util.AttributeSet;
import com.umeng.analytics.pro.C0698cb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֡ */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230 extends AbstractC1090 {

    /* JADX INFO: renamed from: ܳ */
    public int f27048 = -1;

    /* JADX INFO: renamed from: ܿ */
    public float f27050 = Float.NaN;

    /* JADX INFO: renamed from: ᩻ */
    public float f27054 = Float.NaN;

    /* JADX INFO: renamed from: ۡ */
    public float f27046 = Float.NaN;

    /* JADX INFO: renamed from: ܺ */
    public float f27049 = Float.NaN;

    /* JADX INFO: renamed from: ۖ */
    public float f27042 = Float.NaN;

    /* JADX INFO: renamed from: ۜ */
    public float f27045 = Float.NaN;

    /* JADX INFO: renamed from: ᩷ */
    public float f27053 = Float.NaN;

    /* JADX INFO: renamed from: ᩵ */
    public float f27052 = Float.NaN;

    /* JADX INFO: renamed from: ۘ */
    public float f27043 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ */
    public float f27051 = Float.NaN;

    /* JADX INFO: renamed from: ֡ */
    public float f27040 = Float.NaN;

    /* JADX INFO: renamed from: ۚ */
    public float f27044 = Float.NaN;

    /* JADX INFO: renamed from: ֨ */
    public float f27041 = Float.NaN;

    /* JADX INFO: renamed from: ۢ */
    public float f27047 = Float.NaN;

    public C1230() {
        this.f18544 = new HashMap();
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13280(Context context, AttributeSet attributeSet) {
        C0880.m5225(this, context.obtainStyledAttributes(attributeSet, C1925.f72702));
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13282(HashSet hashSet) {
        if (!Float.isNaN(this.f27050)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f27054)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f27046)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f27049)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f27042)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f27045)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f27053)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f27040)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f27044)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f27041)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f27052)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f27043)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f27051)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f27047)) {
            hashSet.add("progress");
        }
        if (this.f18544.size() > 0) {
            Iterator it = this.f18544.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ۧ */
    public final void mo16378(HashMap map) {
        if (this.f27048 == -1) {
            return;
        }
        if (!Float.isNaN(this.f27050)) {
            map.put("alpha", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27054)) {
            map.put("elevation", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27046)) {
            map.put("rotation", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27049)) {
            map.put("rotationX", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27042)) {
            map.put("rotationY", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27045)) {
            map.put("transformPivotX", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27053)) {
            map.put("transformPivotY", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27040)) {
            map.put("translationX", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27044)) {
            map.put("translationY", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27041)) {
            map.put("translationZ", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27052)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27043)) {
            map.put("scaleX", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27051)) {
            map.put("scaleY", Integer.valueOf(this.f27048));
        }
        if (!Float.isNaN(this.f27047)) {
            map.put("progress", Integer.valueOf(this.f27048));
        }
        if (this.f18544.size() > 0) {
            Iterator it = this.f18544.keySet().iterator();
            while (it.hasNext()) {
                map.put(C21466.m48631("CUSTOM,", (String) it.next()), Integer.valueOf(this.f27048));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13281(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC1791 abstractC1791 = (AbstractC1791) map.get(str);
            byte b = 7;
            if (str.startsWith("CUSTOM")) {
                C1531 c1531 = (C1531) this.f18544.get(str.substring(7));
                if (c1531 != null) {
                    ((C1371) abstractC1791).f35027.append(this.f18545, c1531);
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
                            b = C0698cb.f2569k;
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
                        if (!Float.isNaN(this.f27049)) {
                            abstractC1791.mo28784(this.f27049, this.f18545);
                        }
                        break;
                    case 1:
                        if (!Float.isNaN(this.f27042)) {
                            abstractC1791.mo28784(this.f27042, this.f18545);
                        }
                        break;
                    case 2:
                        if (!Float.isNaN(this.f27040)) {
                            abstractC1791.mo28784(this.f27040, this.f18545);
                        }
                        break;
                    case 3:
                        if (!Float.isNaN(this.f27044)) {
                            abstractC1791.mo28784(this.f27044, this.f18545);
                        }
                        break;
                    case 4:
                        if (!Float.isNaN(this.f27041)) {
                            abstractC1791.mo28784(this.f27041, this.f18545);
                        }
                        break;
                    case 5:
                        if (!Float.isNaN(this.f27047)) {
                            abstractC1791.mo28784(this.f27047, this.f18545);
                        }
                        break;
                    case 6:
                        if (!Float.isNaN(this.f27043)) {
                            abstractC1791.mo28784(this.f27043, this.f18545);
                        }
                        break;
                    case 7:
                        if (!Float.isNaN(this.f27051)) {
                            abstractC1791.mo28784(this.f27051, this.f18545);
                        }
                        break;
                    case 8:
                        if (!Float.isNaN(this.f27049)) {
                            abstractC1791.mo28784(this.f27045, this.f18545);
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.f27042)) {
                            abstractC1791.mo28784(this.f27053, this.f18545);
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.f27046)) {
                            abstractC1791.mo28784(this.f27046, this.f18545);
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.f27054)) {
                            abstractC1791.mo28784(this.f27054, this.f18545);
                        }
                        break;
                    case 12:
                        if (!Float.isNaN(this.f27052)) {
                            abstractC1791.mo28784(this.f27052, this.f18545);
                        }
                        break;
                    case 13:
                        if (!Float.isNaN(this.f27050)) {
                            abstractC1791.mo28784(this.f27050, this.f18545);
                        }
                        break;
                }
            }
        }
    }
}
