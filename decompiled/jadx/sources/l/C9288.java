package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۢۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9288 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
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
        String strM38495 = m38492(4);
        String strM38496 = m38492(5);
        String strM38497 = m38492(9);
        try {
            c10384.m26185(m38494(strM38496));
        } catch (ParseException unused) {
        }
        if (strM38492.trim().equals("d")) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26196(strM38494);
        c10384.m26194(strM38497.trim());
        c10384.m26183(Long.parseLong(strM38495.trim()));
        if (strM38493.indexOf(82) != -1) {
            c10384.m26182(0, 0, true);
        }
        if (strM38493.indexOf(87) != -1) {
            c10384.m26182(0, 1, true);
        }
        return c10384;
    }
}
