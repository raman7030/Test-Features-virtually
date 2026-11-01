package p067l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۚ */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1622 extends AbstractC1090 {

    /* JADX INFO: renamed from: ܳ */
    public int f51620 = -1;

    /* JADX INFO: renamed from: ܿ */
    public float f51622 = Float.NaN;

    /* JADX INFO: renamed from: ᩻ */
    public float f51626 = Float.NaN;

    /* JADX INFO: renamed from: ᩷ */
    public float f51625 = Float.NaN;

    /* JADX INFO: renamed from: ۢ */
    public float f51619 = Float.NaN;

    /* JADX INFO: renamed from: ۡ */
    public float f51618 = Float.NaN;

    /* JADX INFO: renamed from: ۘ */
    public float f51614 = Float.NaN;

    /* JADX INFO: renamed from: ܺ */
    public float f51621 = Float.NaN;

    /* JADX INFO: renamed from: ۖ */
    public float f51613 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ */
    public float f51623 = Float.NaN;

    /* JADX INFO: renamed from: ᩵ */
    public float f51624 = Float.NaN;

    /* JADX INFO: renamed from: ֡ */
    public float f51611 = Float.NaN;

    /* JADX INFO: renamed from: ۜ */
    public float f51616 = Float.NaN;

    /* JADX INFO: renamed from: ۠ */
    public int f51617 = 0;

    /* JADX INFO: renamed from: ֨ */
    public float f51612 = Float.NaN;

    /* JADX INFO: renamed from: ۚ */
    public float f51615 = 0.0f;

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13281(HashMap map) {
        throw null;
    }

    public C1622() {
        this.f18544 = new HashMap();
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13280(Context context, AttributeSet attributeSet) {
        C1272.m24390(this, context.obtainStyledAttributes(attributeSet, C1925.f72688));
    }

    @Override // p067l.AbstractC1090
    /* JADX INFO: renamed from: ֫ */
    public final void mo13282(HashSet hashSet) {
        if (!Float.isNaN(this.f51622)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f51626)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f51625)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f51619)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f51618)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f51623)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f51624)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f51611)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f51614)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f51621)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f51613)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f51616)) {
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
        if (this.f51620 == -1) {
            return;
        }
        if (!Float.isNaN(this.f51622)) {
            map.put("alpha", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51626)) {
            map.put("elevation", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51625)) {
            map.put("rotation", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51619)) {
            map.put("rotationX", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51618)) {
            map.put("rotationY", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51623)) {
            map.put("translationX", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51624)) {
            map.put("translationY", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51611)) {
            map.put("translationZ", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51614)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51621)) {
            map.put("scaleX", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51621)) {
            map.put("scaleY", Integer.valueOf(this.f51620));
        }
        if (!Float.isNaN(this.f51616)) {
            map.put("progress", Integer.valueOf(this.f51620));
        }
        if (this.f18544.size() > 0) {
            Iterator it = this.f18544.keySet().iterator();
            while (it.hasNext()) {
                map.put(C21466.m48631("CUSTOM,", (String) it.next()), Integer.valueOf(this.f51620));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX INFO: renamed from: ܽ */
    public final void m39260(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC1126 abstractC1126 = (AbstractC1126) map.get(str);
            if (str.startsWith("CUSTOM")) {
                C1531 c1531 = (C1531) this.f18544.get(str.substring(7));
                if (c1531 != null) {
                    C1091 c1091 = (C1091) abstractC1126;
                    int i = this.f18545;
                    float f = this.f51612;
                    int i2 = this.f51617;
                    float f2 = this.f51615;
                    c1091.f18616.append(i, c1531);
                    c1091.f18620.append(i, new float[]{f, f2});
                    c1091.f20475 = Math.max(c1091.f20475, i2);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f51619)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51619, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f51618)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51618, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f51623)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51623, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f51624)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51624, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f51611)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51611, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f51616)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51616, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f51621)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51621, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f51613)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51613, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f51625)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51625, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f51626)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51626, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f51614)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51614, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f51622)) {
                            break;
                        } else {
                            abstractC1126.mo16405(this.f51622, this.f51612, this.f51615, this.f18545, this.f51617);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
