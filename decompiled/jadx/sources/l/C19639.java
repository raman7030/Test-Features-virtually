package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes5.dex */
public class C19639 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f63381;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f63382;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76960;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, C9523.m24404(m11556("file")), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        AbstractC15440 abstractC15440M36520;
        AbstractC15440 abstractC15440M11515 = m11515("file");
        this.f63382 = abstractC15440M11515;
        if (!abstractC15440M11515.mo23120()) {
            abstractC15440M36520 = this.f63382;
        } else {
            abstractC15440M36520 = this.f63382.m36520(".tmp");
        }
        this.f63381 = abstractC15440M36520;
        AbstractC15440[] abstractC15440ArrM39875 = C16999.m39875(m11558("ARG_PATHS"));
        boolean zM11552 = m11552("removeSources");
        long jMo23127 = 0;
        for (AbstractC15440 abstractC15440 : abstractC15440ArrM39875) {
            jMo23127 += abstractC15440.mo23127();
        }
        C19277 c19277 = new C19277(jMo23127);
        c19277.m44459(new C5544(this));
        BufferedOutputStream bufferedOutputStreamM36525 = this.f63381.m36525();
        try {
            byte[] bArr = new byte[1024];
            for (AbstractC15440 abstractC15441 : abstractC15440ArrM39875) {
                mo11520(abstractC15441.getName());
                InputStream inputStreamMo27926 = abstractC15441.mo27926();
                do {
                    try {
                        int i = inputStreamMo27926.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        c19277.m44460(i);
                        bufferedOutputStreamM36525.write(bArr, 0, i);
                    } catch (Throwable th) {
                        if (inputStreamMo27926 != null) {
                            try {
                                inputStreamMo27926.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } while (!mo1526());
                inputStreamMo27926.close();
            }
            bufferedOutputStreamM36525.close();
            if (mo1526()) {
                return C17222.m40521();
            }
            if (zM11552) {
                boolean z = abstractC15440ArrM39875.length > 1;
                if (z) {
                    m11536(R.string.MT_Protector);
                    mo11538(0);
                }
                for (AbstractC15440 abstractC15442 : abstractC15440ArrM39875) {
                    if (z) {
                        mo11520(abstractC15442.getName());
                    }
                    abstractC15442.mo27929();
                }
            }
            AbstractC15440 abstractC15443 = this.f63382;
            AbstractC15440 abstractC15444 = this.f63381;
            if (abstractC15443 != abstractC15444) {
                abstractC15444.m36498(abstractC15443, (Runnable) null);
            }
            return C17222.m40520();
        } catch (Throwable th3) {
            try {
                bufferedOutputStreamM36525.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (m11542(c16560) && c17222.m40526()) {
            c16560.m39041();
            c16560.m39053(this.f63382.getName());
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440;
        if (!c17222.m40526() && (abstractC15440 = this.f63381) != null) {
            abstractC15440.mo27929();
        }
        C15528.m36596();
    }
}
