package p067l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.᩷ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O546 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21924 extends AbstractC17899 {

    /* JADX INFO: renamed from: ܿ */
    public final C18570 f68938;

    public C21924(C5531 c5531) {
        mo6295(c5531);
        C5531 c5532 = new C5531("WINDOWS", "MM-dd-yy kk:mm", null);
        c5532.m12217("MM-dd-yy kk:mm");
        C18570 c18570 = new C18570();
        this.f68938 = c18570;
        c18570.mo6295(c5532);
    }

    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("WINDOWS", "MM-dd-yy hh:mma", null);
    }

    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        if (!m40709(str)) {
            return null;
        }
        C12237 c12237 = new C12237();
        c12237.m28227(str);
        String str2 = m40708(1) + " " + m40708(2);
        String strM40708 = m40708(3);
        String strM40709 = m40708(4);
        String strM407010 = m40708(5);
        if (strM407010 == null || strM407010.equals(".") || strM407010.equals("..")) {
            return null;
        }
        try {
            try {
                c12237.m28214(m40710(str2));
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
            c12237.m28214(this.f68938.m42263(str2));
        }
        c12237.m28223(strM407010);
        if ("<DIR>".equals(strM40708)) {
            c12237.m28210(1);
            c12237.m28212(0L);
        } else {
            c12237.m28210(0);
            if (strM40709 != null) {
                c12237.m28212(Long.parseLong(strM40709));
            }
        }
        return c12237;
    }
}
