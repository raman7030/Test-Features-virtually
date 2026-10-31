package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7970 extends AbstractC10128 {
    public C7970() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        long jM39733;
        AbstractC16891 abstractC16891M39044 = c16560.m39044();
        AbstractC13921 abstractC13921Mo6020 = abstractC16891M39044.mo6020();
        try {
            String strM39854 = C16996.m39854(abstractC13921Mo6020);
            C11971 c11971M24094 = c16560.m39016().m24094();
            c11971M24094.m29245();
            try {
                jM39733 = c16560.m39044().m39733(strM39854);
                if (jM39733 == 0) {
                    jM39733 = c16560.m39026().m39044().m39733(strM39854);
                }
                if (jM39733 == 0) {
                    Iterator<E> it = c11971M24094.iterator();
                    while (it.hasNext()) {
                        jM39733 = ((AbstractC16891) it.next()).m39733(strM39854);
                        if (jM39733 != 0) {
                            break;
                        }
                    }
                }
                c11971M24094.m29244();
            } catch (Throwable th) {
                c11971M24094.m29244();
                throw th;
            }
        } catch (Exception unused) {
            jM39733 = 0;
        }
        try {
            int i = C15104.f46193;
            C0994 c0994 = new C0994(C0914.class);
            c0994.m3476("ARG_STATELESS_VISITOR", abstractC13921Mo6020.m33350());
            c0994.m3474("archiveName", abstractC16891M39044.mo6017().m29744());
            if (jM39733 != 0) {
                c0994.m3471(jM39733, "sourceTempLease");
            }
            if (c0994.m3469() != -1) {
                return;
            }
            AbstractC16891.m39726(jM39733);
        } catch (Throwable th2) {
            AbstractC16891.m39726(jM39733);
            throw th2;
        }
    }
}
