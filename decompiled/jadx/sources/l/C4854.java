package l;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4854 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15332;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f15339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15343;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f15334 = "";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f15344 = "";

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Set f15333 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f15345 = "";

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f15342 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15346 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f15335 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f15336 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15331 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15338 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f15337 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f15347 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15340 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f15341 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14138(String str) {
        this.f15334 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14144(String str) {
        this.f15344 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14131(String[] strArr) {
        this.f15333 = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14148(String str) {
        this.f15345 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14126(String str, String str2, Set set, String str3) {
        if (this.f15334.isEmpty() && this.f15344.isEmpty() && this.f15333.isEmpty() && this.f15345.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM14124 = m14124(this.f15345, m14124(this.f15344, m14124(this.f15334, 0, 1073741824, str), 2, str2), 4, str3);
        if (iM14124 == -1 || !set.containsAll(this.f15333)) {
            return 0;
        }
        return (this.f15333.size() * 4) + iM14124;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m14134() {
        int i = this.f15338;
        if (i == -1 && this.f15337 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f15337 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m14135() {
        return this.f15336 == 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m14141() {
        return this.f15331 == 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m14149() {
        this.f15331 = 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14132() {
        this.f15338 = 1;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14133() {
        this.f15337 = 1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m14146() {
        return this.f15342;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14129(String str) {
        this.f15342 = C15107.m35799(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14142() {
        if (!this.f15346) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f15343;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14137(int i) {
        this.f15343 = i;
        this.f15346 = true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m14136() {
        return this.f15346;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14125() {
        if (!this.f15335) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.f15332;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14128(int i) {
        this.f15332 = i;
        this.f15335 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m14150() {
        return this.f15335;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14127(float f) {
        this.f15339 = f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14143(int i) {
        this.f15347 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14140() {
        return this.f15347;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m14145() {
        return this.f15339;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14147(int i) {
        this.f15340 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m14151() {
        return this.f15340;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14130(boolean z) {
        this.f15341 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14139() {
        return this.f15341;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14124(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
