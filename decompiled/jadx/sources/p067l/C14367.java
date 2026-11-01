package p067l;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14367 extends AbstractC5160 {
    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11026(Object obj) throws Exception {
        C8332 c8332 = (C8332) obj;
        C13836 c13836M19223 = c8332.m19223();
        C23249 c23249 = new C23249(C3777.m7372(false, c8332.m19224(), c8332.m19222()));
        try {
            String str = c13836M19223.f39094;
            String str2 = c13836M19223.f39095;
            C24845 c24845M51796 = c23249.m51796(c13836M19223.f39097, str);
            if ((c8332.m19224() == EnumC9673.SMB2_UNSIGNED) && c24845M51796.m54570().m20231()) {
                throw new IOException("SMB server requires signing");
            }
            C5144 c5144M7385 = C3777.m7385(c13836M19223);
            String str3 = c13836M19223.f39098;
            if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) && str2.equals("guest")) {
                TextUtils.isEmpty(str3);
            }
            return new C12356(c8332, c23249, c24845M51796, c24845M51796.m54557(c5144M7385));
        } catch (Exception e) {
            C2700.m4192(c23249);
            throw e;
        }
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final void mo11027(Object obj, InterfaceC11866 interfaceC11866) {
        C2700.m4192(((C12356) interfaceC11866.mo27170()).f34480);
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11866 mo11028(Object obj) {
        return new C24425((C12356) obj);
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11029(Object obj, InterfaceC11866 interfaceC11866) {
        if (!((C12356) interfaceC11866.mo27170()).f34481.m54569()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11866.mo27172().toEpochMilli();
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2000) {
            try {
                C24425 c24425 = (C24425) interfaceC11866;
                if (c24425.m53896()) {
                    c24425.m53897();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
