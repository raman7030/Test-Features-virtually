package l;

/* JADX INFO: renamed from: l.ۨܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38EG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11793 extends C15688 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C1358 f35182;

    @Override // l.C15688
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28850() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1358 m28851() {
        return this.f35182;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ֨ۧ */
    public final C16477 mo24428() {
        int i;
        int i2;
        C1358 c1358 = this.f35182;
        int iM4739 = c1358.m4739() & 4095;
        if (!c1358.m4770()) {
            if (c1358.m4768()) {
                i2 = iM4739 | 16384;
            } else {
                i = 32768;
            }
            return new C16477(i2, c1358.m4746(), c1358.m4756());
        }
        i = 40960;
        i2 = iM4739 | i;
        return new C16477(i2, c1358.m4746(), c1358.m4756());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11793(C1358 c1358) {
        String strSubstring;
        String strSubstring2;
        String strM4741 = c1358.m4741();
        if (strM4741.isEmpty()) {
            strSubstring = "";
        } else {
            int length = strM4741.length();
            int i = length - 1;
            i = strM4741.charAt(i) == '/' ? length - 2 : i;
            strSubstring = strM4741.substring(strM4741.lastIndexOf(47, i) + 1, i + 1);
        }
        String strM4742 = c1358.m4741();
        if (strM4742.isEmpty()) {
            strSubstring2 = null;
        } else {
            int length2 = strM4742.length();
            int i2 = length2 - 1;
            int iLastIndexOf = strM4742.lastIndexOf(47, strM4742.charAt(i2) == '/' ? length2 - 2 : i2) + 1;
            strSubstring2 = iLastIndexOf != 0 ? strM4742.substring(0, iLastIndexOf) : "";
        }
        super(strSubstring, strSubstring2, c1358.m4770() ? c1358.m4767() : null, c1358.m4765(), c1358.m4758().getTime(), c1358.m4766());
        this.f35182 = c1358;
    }
}
