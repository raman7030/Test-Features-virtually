package p067l;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6982 {

    /* JADX INFO: renamed from: ֫ */
    public int f18163;

    /* JADX INFO: renamed from: ܳ */
    public float f18170;

    /* JADX INFO: renamed from: ᩳ */
    public int f18174;

    /* JADX INFO: renamed from: ۘ */
    public String f18165 = "";

    /* JADX INFO: renamed from: ᩴ */
    public String f18175 = "";

    /* JADX INFO: renamed from: ۖ */
    public Set f18164 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩵ */
    public String f18176 = "";

    /* JADX INFO: renamed from: ܿ */
    public String f18173 = null;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f18177 = false;

    /* JADX INFO: renamed from: ۜ */
    public boolean f18166 = false;

    /* JADX INFO: renamed from: ۡ */
    public int f18167 = -1;

    /* JADX INFO: renamed from: ֡ */
    public int f18162 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f18169 = -1;

    /* JADX INFO: renamed from: ۢ */
    public int f18168 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public int f18178 = -1;

    /* JADX INFO: renamed from: ܺ */
    public int f18171 = -1;

    /* JADX INFO: renamed from: ܽ */
    public boolean f18172 = false;

    /* JADX INFO: renamed from: ۧ */
    public final void m16019(String str) {
        this.f18165 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16025(String str) {
        this.f18175 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16012(String[] strArr) {
        this.f18164 = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m16029(String str) {
        this.f18176 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16007(String str, String str2, Set set, String str3) {
        if (this.f18165.isEmpty() && this.f18175.isEmpty() && this.f18164.isEmpty() && this.f18176.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM16005 = m16005(this.f18176, m16005(this.f18175, m16005(this.f18165, 0, 1073741824, str), 2, str2), 4, str3);
        if (iM16005 == -1 || !set.containsAll(this.f18164)) {
            return 0;
        }
        return (this.f18164.size() * 4) + iM16005;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m16015() {
        int i = this.f18169;
        if (i == -1 && this.f18168 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f18168 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m16016() {
        return this.f18167 == 1;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m16022() {
        return this.f18162 == 1;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m16030() {
        this.f18162 = 1;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m16013() {
        this.f18169 = 1;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m16014() {
        this.f18168 = 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m16027() {
        return this.f18173;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16010(String str) {
        this.f18173 = C16726.m37957(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16023() {
        if (!this.f18177) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f18174;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16018(int i) {
        this.f18174 = i;
        this.f18177 = true;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m16017() {
        return this.f18177;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16006() {
        if (!this.f18166) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.f18163;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16009(int i) {
        this.f18163 = i;
        this.f18166 = true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m16031() {
        return this.f18166;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16008(float f) {
        this.f18170 = f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16024(int i) {
        this.f18178 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m16021() {
        return this.f18178;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m16026() {
        return this.f18170;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m16028(int i) {
        this.f18171 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m16032() {
        return this.f18171;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16011(boolean z) {
        this.f18172 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16020() {
        return this.f18172;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16005(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
