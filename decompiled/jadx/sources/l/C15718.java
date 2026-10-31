package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15718 extends AbstractC4990 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48480 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f48482 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f48486 = Float.NaN;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f48485 = Float.NaN;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f48479 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f48478 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f48474 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f48481 = Float.NaN;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f48473 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f48483 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f48484 = Float.NaN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f48471 = Float.NaN;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f48476 = Float.NaN;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f48477 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f48472 = Float.NaN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f48475 = 0.0f;

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11329(HashMap map) {
        throw null;
    }

    public C15718() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C8664.m22421(this, context.obtainStyledAttributes(attributeSet, C21840.f69979));
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f48482)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f48486)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f48485)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f48479)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f48478)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f48483)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f48484)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f48471)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f48474)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f48481)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f48473)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f48476)) {
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
        if (this.f48480 == -1) {
            return;
        }
        if (!Float.isNaN(this.f48482)) {
            map.put("alpha", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48486)) {
            map.put("elevation", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48485)) {
            map.put("rotation", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48479)) {
            map.put("rotationX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48478)) {
            map.put("rotationY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48483)) {
            map.put("translationX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48484)) {
            map.put("translationY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48471)) {
            map.put("translationZ", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48474)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48481)) {
            map.put("scaleX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48481)) {
            map.put("scaleY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48476)) {
            map.put("progress", Integer.valueOf(this.f48480));
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                map.put(C20094.m46315("CUSTOM,", (String) it.next()), Integer.valueOf(this.f48480));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37091(HashMap map) {
        for (String str : map.keySet()) {
            AbstractC5717 abstractC5717 = (AbstractC5717) map.get(str);
            if (str.startsWith("CUSTOM")) {
                C13888 c13888 = (C13888) this.f15711.get(str.substring(7));
                if (c13888 != null) {
                    C5011 c5011 = (C5011) abstractC5717;
                    int i = this.f15712;
                    float f = this.f48472;
                    int i2 = this.f48477;
                    float f2 = this.f48475;
                    c5011.f15784.append(i, c13888);
                    c5011.f15788.append(i, new float[]{f, f2});
                    c5011.f17630 = Math.max(c5011.f17630, i2);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f48479)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48479, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (Float.isNaN(this.f48478)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48478, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "translationX":
                        if (Float.isNaN(this.f48483)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48483, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "translationY":
                        if (Float.isNaN(this.f48484)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48484, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (Float.isNaN(this.f48471)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48471, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "progress":
                        if (Float.isNaN(this.f48476)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48476, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (Float.isNaN(this.f48481)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48481, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (Float.isNaN(this.f48473)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48473, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "rotation":
                        if (Float.isNaN(this.f48485)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48485, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "elevation":
                        if (Float.isNaN(this.f48486)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48486, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f48474)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48474, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                    case "alpha":
                        if (Float.isNaN(this.f48482)) {
                            break;
                        } else {
                            abstractC5717.mo14501(this.f48482, this.f48472, this.f48475, this.f15712, this.f48477);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
