package p067l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۡۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55OK */
/* JADX INFO: loaded from: classes4.dex */
public final class C10524 extends AbstractC17899 {
    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("OS/2", "MM-dd-yy HH:mm", null);
    }

    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        C12237 c12237 = new C12237();
        if (!m40709(str)) {
            return null;
        }
        String strM40708 = m40708(1);
        String strM40709 = m40708(2);
        String strM407010 = m40708(3);
        String str2 = m40708(4) + " " + m40708(5);
        String strM407011 = m40708(6);
        try {
            c12237.m28214(m40710(str2));
        } catch (ParseException unused) {
        }
        if (strM407010.trim().equals("DIR") || strM40709.trim().equals("DIR")) {
            c12237.m28210(1);
        } else {
            c12237.m28210(0);
        }
        c12237.m28223(strM407011.trim());
        c12237.m28212(Long.parseLong(strM40708.trim()));
        return c12237;
    }
}
