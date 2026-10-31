package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۡۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55OK */
/* JADX INFO: loaded from: classes4.dex */
public final class C8582 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("OS/2", "MM-dd-yy HH:mm", null);
    }

    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        C10384 c10384 = new C10384();
        if (!m38493(str)) {
            return null;
        }
        String strM38492 = m38492(1);
        String strM38493 = m38492(2);
        String strM38494 = m38492(3);
        String str2 = m38492(4) + " " + m38492(5);
        String strM38495 = m38492(6);
        try {
            c10384.m26185(m38494(str2));
        } catch (ParseException unused) {
        }
        if (strM38494.trim().equals("DIR") || strM38493.trim().equals("DIR")) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26194(strM38495.trim());
        c10384.m26183(Long.parseLong(strM38492.trim()));
        return c10384;
    }
}
