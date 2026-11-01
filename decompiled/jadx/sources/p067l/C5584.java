package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 255M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5584 extends AbstractC12961 {

    /* JADX INFO: renamed from: ۗ */
    public String f13488;

    /* JADX INFO: renamed from: ۙ */
    public boolean f13489;

    /* JADX INFO: renamed from: ᩶ */
    public C23198[] f13490;

    /* JADX INFO: renamed from: ᩸ */
    public int f13491;

    /* JADX INFO: renamed from: ᩹ */
    public final C14971 f13492;

    public C5584(C14971 c14971, String str, C23198[] c23198Arr, boolean z) {
        this.f13491 = -1;
        str.getClass();
        this.f13492 = c14971;
        this.f13488 = str;
        this.f13490 = c23198Arr;
        if (c23198Arr == null || !z) {
            return;
        }
        for (C23198 c23198 : c23198Arr) {
            c14971.m34285(c23198.f72883);
        }
    }

    public C5584(C14971 c14971, String str) {
        this(c14971, str, null, false);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m12359() {
        int i = this.f13491;
        C14971 c14971 = this.f13492;
        if (i != -1 && c14971.getItem(i) == this) {
            return this.f13491;
        }
        int iM34277 = c14971.m34277(this);
        this.f13491 = iM34277;
        return iM34277;
    }

    @Override // p067l.InterfaceC5763
    public final String getValue() {
        return this.f13488;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12357(String str) {
        C23198[] c23198Arr = this.f13490;
        C14971 c14971 = this.f13492;
        if (c23198Arr == null) {
            if (this.f13488.equals(str)) {
                return;
            }
            c14971.f42776.remove(this.f13488);
            this.f13488 = str;
            c14971.f42776.put(str, this);
            return;
        }
        c14971.f42775.remove(this);
        this.f13488 = str;
        this.f13490 = null;
        c14971.f42776.put(str, this);
    }

    @Override // p067l.InterfaceC5763
    public final int[] getStyle() {
        if (!mo12361()) {
            return null;
        }
        C23198[] c23198ArrM16373 = C7104.m16373(m29718(this.f13490));
        int[] iArr = new int[c23198ArrM16373.length * 3];
        for (int i = 0; i < c23198ArrM16373.length; i++) {
            C23198 c23198 = c23198ArrM16373[i];
            int i2 = i * 3;
            iArr[i2] = this.f13492.m34283(c23198.f72883);
            iArr[i2 + 1] = c23198.f72882;
            iArr[i2 + 2] = c23198.f72881 - 1;
        }
        return iArr;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩶֫ */
    public final C23198[] mo12360() {
        C23198[] c23198Arr = this.f13490;
        return c23198Arr != null ? (C23198[]) c23198Arr.clone() : c23198Arr;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ܰ֫ */
    public final C23198[] mo12358() {
        return m29718(this.f13490);
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩺֫ */
    public final boolean mo12361() {
        C23198[] c23198Arr = this.f13490;
        return c23198Arr != null && c23198Arr.length > 0;
    }

    @Override // p067l.AbstractC12961
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5584.class == obj.getClass()) {
            C5584 c5584 = (C5584) obj;
            if (Arrays.equals(this.f13490, c5584.f13490) && this.f13488.equals(c5584.f13488)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC12961
    public final int hashCode() {
        return this.f13488.hashCode();
    }
}
