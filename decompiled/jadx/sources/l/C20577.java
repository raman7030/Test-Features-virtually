package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.᩷ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O546 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20577 extends AbstractC16342 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17048 f66257;

    public C20577(C3328 c3328) {
        mo4051(c3328);
        C3328 c3329 = new C3328("WINDOWS", "MM-dd-yy kk:mm", null);
        c3329.m10181("MM-dd-yy kk:mm");
        C17048 c17048 = new C17048();
        this.f66257 = c17048;
        c17048.mo4051(c3329);
    }

    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("WINDOWS", "MM-dd-yy hh:mma", null);
    }

    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        String str2 = m38492(1) + " " + m38492(2);
        String strM38492 = m38492(3);
        String strM38493 = m38492(4);
        String strM38494 = m38492(5);
        if (strM38494 == null || strM38494.equals(".") || strM38494.equals("..")) {
            return null;
        }
        try {
            try {
                c10384.m26185(m38494(str2));
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
            c10384.m26185(this.f66257.m40018(str2));
        }
        c10384.m26194(strM38494);
        if ("<DIR>".equals(strM38492)) {
            c10384.m26181(1);
            c10384.m26183(0L);
        } else {
            c10384.m26181(0);
            if (strM38493 != null) {
                c10384.m26183(Long.parseLong(strM38493));
            }
        }
        return c10384;
    }
}
