package p067l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۢۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11195 extends AbstractC17899 {
    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
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
        String strM407011 = m40708(4);
        String strM407012 = m40708(5);
        String strM407013 = m40708(9);
        try {
            c12237.m28214(m40710(strM407012));
        } catch (ParseException unused) {
        }
        if (strM40708.trim().equals("d")) {
            c12237.m28210(1);
        } else {
            c12237.m28210(0);
        }
        c12237.m28225(strM407010);
        c12237.m28223(strM407013.trim());
        c12237.m28212(Long.parseLong(strM407011.trim()));
        if (strM40709.indexOf(82) != -1) {
            c12237.m28211(0, 0, true);
        }
        if (strM40709.indexOf(87) != -1) {
            c12237.m28211(0, 1, true);
        }
        return c12237;
    }
}
