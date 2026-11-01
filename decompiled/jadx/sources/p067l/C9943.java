package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes3.dex */
public final class C9943 extends AbstractC11994 {
    public C9943() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        long jM41974;
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        AbstractC15599 abstractC15599Mo8217 = abstractC18422M41270.mo8217();
        try {
            String strM42097 = C18521.m42097(abstractC15599Mo8217);
            C13746 c13746M26103 = c18107.m41242().m26103();
            c13746M26103.m31299();
            try {
                jM41974 = c18107.m41270().m41974(strM42097);
                if (jM41974 == 0) {
                    jM41974 = c18107.m41252().m41270().m41974(strM42097);
                }
                if (jM41974 == 0) {
                    Iterator<E> it = c13746M26103.iterator();
                    while (it.hasNext()) {
                        jM41974 = ((AbstractC18422) it.next()).m41974(strM42097);
                        if (jM41974 != 0) {
                            break;
                        }
                    }
                }
                c13746M26103.m31298();
            } catch (Throwable th) {
                c13746M26103.m31298();
                throw th;
            }
        } catch (Exception unused) {
            jM41974 = 0;
        }
        try {
            int i = C16723.f49313;
            C3313 c3313 = new C3313(C3237.class);
            c3313.m5779("ARG_STATELESS_VISITOR", abstractC15599Mo8217.m35469());
            c3313.m5777("archiveName", abstractC18422M41270.mo8214().m31806());
            if (jM41974 != 0) {
                c3313.m5774(jM41974, "sourceTempLease");
            }
            if (c3313.m5772() != -1) {
                return;
            }
            AbstractC18422.m41967(jM41974);
        } catch (Throwable th2) {
            AbstractC18422.m41967(jM41974);
            throw th2;
        }
    }
}
