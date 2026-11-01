package p067l;

/* JADX INFO: renamed from: l.ۨܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38EG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13577 extends C17278 {

    /* JADX INFO: renamed from: ۧ֫ */
    public final C3659 f38184;

    @Override // p067l.C17278
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30899() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C3659 m30900() {
        return this.f38184;
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public final C18028 mo26440() {
        int i;
        int i2;
        C3659 c3659 = this.f38184;
        int iM6977 = c3659.m6977() & 4095;
        if (!c3659.m7008()) {
            if (c3659.m7006()) {
                i2 = iM6977 | 16384;
            } else {
                i = 32768;
            }
            return new C18028(i2, c3659.m6984(), c3659.m6994());
        }
        i = 40960;
        i2 = iM6977 | i;
        return new C18028(i2, c3659.m6984(), c3659.m6994());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13577(C3659 c3659) {
        String strSubstring;
        String strSubstring2;
        String strM6979 = c3659.m6979();
        if (strM6979.isEmpty()) {
            strSubstring = "";
        } else {
            int length = strM6979.length();
            int i = length - 1;
            i = strM6979.charAt(i) == '/' ? length - 2 : i;
            strSubstring = strM6979.substring(strM6979.lastIndexOf(47, i) + 1, i + 1);
        }
        String strM69710 = c3659.m6979();
        if (strM69710.isEmpty()) {
            strSubstring2 = null;
        } else {
            int length2 = strM69710.length();
            int i2 = length2 - 1;
            int iLastIndexOf = strM69710.lastIndexOf(47, strM69710.charAt(i2) == '/' ? length2 - 2 : i2) + 1;
            strSubstring2 = iLastIndexOf != 0 ? strM69710.substring(0, iLastIndexOf) : "";
        }
        super(strSubstring, strSubstring2, c3659.m7008() ? c3659.m7005() : null, c3659.m7003(), c3659.m6996().getTime(), c3659.m7004());
        this.f38184 = c3659;
    }
}
