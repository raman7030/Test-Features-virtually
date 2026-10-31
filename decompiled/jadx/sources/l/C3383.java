package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 255M */
/* JADX INFO: loaded from: classes3.dex */
public final class C3383 extends AbstractC11145 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f10681;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21916[] f10683;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13260 f10685;

    public C3383(C13260 c13260, String str, C21916[] c21916Arr, boolean z) {
        this.f10684 = -1;
        str.getClass();
        this.f10685 = c13260;
        this.f10681 = str;
        this.f10683 = c21916Arr;
        if (c21916Arr == null || !z) {
            return;
        }
        for (C21916 c21916 : c21916Arr) {
            c13260.m32186(c21916.f70169);
        }
    }

    public C3383(C13260 c13260, String str) {
        this(c13260, str, null, false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m10321() {
        int i = this.f10684;
        C13260 c13260 = this.f10685;
        if (i != -1 && c13260.getItem(i) == this) {
            return this.f10684;
        }
        int iM32178 = c13260.m32178(this);
        this.f10684 = iM32178;
        return iM32178;
    }

    @Override // l.InterfaceC3571
    public final String getValue() {
        return this.f10681;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10319(String str) {
        C21916[] c21916Arr = this.f10683;
        C13260 c13260 = this.f10685;
        if (c21916Arr == null) {
            if (this.f10681.equals(str)) {
                return;
            }
            c13260.f39712.remove(this.f10681);
            this.f10681 = str;
            c13260.f39712.put(str, this);
            return;
        }
        c13260.f39711.remove(this);
        this.f10681 = str;
        this.f10683 = null;
        c13260.f39712.put(str, this);
    }

    @Override // l.InterfaceC3571
    public final int[] getStyle() {
        if (!mo10323()) {
            return null;
        }
        C21916[] c21916ArrM14469 = C4982.m14469(m27656(this.f10683));
        int[] iArr = new int[c21916ArrM14469.length * 3];
        for (int i = 0; i < c21916ArrM14469.length; i++) {
            C21916 c21916 = c21916ArrM14469[i];
            int i2 = i * 3;
            iArr[i2] = this.f10685.m32184(c21916.f70169);
            iArr[i2 + 1] = c21916.f70168;
            iArr[i2 + 2] = c21916.f70167 - 1;
        }
        return iArr;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final C21916[] mo10322() {
        C21916[] c21916Arr = this.f10683;
        return c21916Arr != null ? (C21916[]) c21916Arr.clone() : c21916Arr;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final C21916[] mo10320() {
        return m27656(this.f10683);
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10323() {
        C21916[] c21916Arr = this.f10683;
        return c21916Arr != null && c21916Arr.length > 0;
    }

    @Override // l.AbstractC11145
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3383.class == obj.getClass()) {
            C3383 c3383 = (C3383) obj;
            if (Arrays.equals(this.f10683, c3383.f10683) && this.f10681.equals(c3383.f10681)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC11145
    public final int hashCode() {
        return this.f10681.hashCode();
    }
}
