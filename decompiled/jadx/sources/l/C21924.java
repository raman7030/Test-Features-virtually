package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes.dex */
public final class C21924 extends AbstractC4990 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70195 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f70192 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f70187 = Float.NaN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f70190 = 0.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f70191 = Float.NaN;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f70196 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f70198 = Float.NaN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f70202 = Float.NaN;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f70201 = Float.NaN;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f70189 = Float.NaN;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f70194 = Float.NaN;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f70193 = Float.NaN;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f70197 = Float.NaN;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f70188 = Float.NaN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f70199 = Float.NaN;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f70200 = Float.NaN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f70186 = Float.NaN;

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11329(HashMap map) {
        throw null;
    }

    public C21924() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C21219.m48170(this, context.obtainStyledAttributes(attributeSet, C21840.f69976));
    }

    @Override // l.AbstractC4990
    /* JADX INFO: renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f70198)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f70202)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f70201)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f70194)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f70193)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f70197)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f70188)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f70189)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f70199)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f70200)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f70186)) {
            hashSet.add("translationZ");
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49381(HashMap map) {
        float f;
        float f2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C13888 c13888 = (C13888) this.f15711.get(str.substring(7));
                if (c13888 != null && c13888.m33292() == EnumC23061.FLOAT_TYPE) {
                    ((AbstractC14307) map.get(str)).m34135(this.f15712, this.f70192, this.f70196, this.f70187, this.f70190, c13888.m33296(), c13888);
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f70194;
                        f2 = f;
                        break;
                    case "rotationY":
                        f = this.f70193;
                        f2 = f;
                        break;
                    case "translationX":
                        f = this.f70199;
                        f2 = f;
                        break;
                    case "translationY":
                        f = this.f70200;
                        f2 = f;
                        break;
                    case "translationZ":
                        f = this.f70186;
                        f2 = f;
                        break;
                    case "progress":
                        f = this.f70191;
                        f2 = f;
                        break;
                    case "scaleX":
                        f = this.f70197;
                        f2 = f;
                        break;
                    case "scaleY":
                        f = this.f70188;
                        f2 = f;
                        break;
                    case "rotation":
                        f = this.f70201;
                        f2 = f;
                        break;
                    case "elevation":
                        f = this.f70202;
                        f2 = f;
                        break;
                    case "transitionPathRotate":
                        f = this.f70189;
                        f2 = f;
                        break;
                    case "alpha":
                        f = this.f70198;
                        f2 = f;
                        break;
                    case "waveOffset":
                        f = this.f70190;
                        f2 = f;
                        break;
                    default:
                        f2 = Float.NaN;
                        break;
                }
                if (!Float.isNaN(f2)) {
                    ((AbstractC14307) map.get(str)).m34134(this.f15712, this.f70192, this.f70196, this.f70187, this.f70190, f2);
                }
            }
        }
    }
}
