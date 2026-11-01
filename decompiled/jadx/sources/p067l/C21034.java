package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195D */
/* JADX INFO: loaded from: classes5.dex */
public class C21034 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f66004;

    /* JADX INFO: renamed from: ܺ֫ */
    public AbstractC17043 f66005;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79712;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, C11419.m26414(m13492("file")), C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        AbstractC17043 abstractC17043M38678;
        AbstractC17043 abstractC17043M13451 = m13451("file");
        this.f66005 = abstractC17043M13451;
        if (!abstractC17043M13451.mo25094()) {
            abstractC17043M38678 = this.f66005;
        } else {
            abstractC17043M38678 = this.f66005.m38678(".tmp");
        }
        this.f66004 = abstractC17043M38678;
        AbstractC17043[] abstractC17043ArrM42118 = C18524.m42118(m13494("ARG_PATHS"));
        boolean zM13488 = m13488("removeSources");
        long jMo25101 = 0;
        for (AbstractC17043 abstractC17043 : abstractC17043ArrM42118) {
            jMo25101 += abstractC17043.mo25101();
        }
        C20689 c20689 = new C20689(jMo25101);
        c20689.m46753(new C7638(this));
        BufferedOutputStream bufferedOutputStreamM38683 = this.f66004.m38683();
        try {
            byte[] bArr = new byte[1024];
            for (AbstractC17043 abstractC17044 : abstractC17043ArrM42118) {
                mo13456(abstractC17044.getName());
                InputStream inputStreamMo29987 = abstractC17044.mo29987();
                do {
                    try {
                        int i = inputStreamMo29987.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        c20689.m46754(i);
                        bufferedOutputStreamM38683.write(bArr, 0, i);
                    } catch (Throwable th) {
                        if (inputStreamMo29987 != null) {
                            try {
                                inputStreamMo29987.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } while (!mo3924());
                inputStreamMo29987.close();
            }
            bufferedOutputStreamM38683.close();
            if (mo3924()) {
                return C18736.m42768();
            }
            if (zM13488) {
                boolean z = abstractC17043ArrM42118.length > 1;
                if (z) {
                    m13472(R.string.MT_Protector);
                    mo13474(0);
                }
                for (AbstractC17043 abstractC17045 : abstractC17043ArrM42118) {
                    if (z) {
                        mo13456(abstractC17045.getName());
                    }
                    abstractC17045.mo29990();
                }
            }
            AbstractC17043 abstractC17046 = this.f66005;
            AbstractC17043 abstractC17047 = this.f66004;
            if (abstractC17046 != abstractC17047) {
                abstractC17047.m38656(abstractC17046, (Runnable) null);
            }
            return C18736.m42767();
        } catch (Throwable th3) {
            try {
                bufferedOutputStreamM38683.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (m13478(c18107) && c18736.m42773()) {
            c18107.m41267();
            c18107.m41279(this.f66005.getName());
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043;
        if (!c18736.m42773() && (abstractC17043 = this.f66004) != null) {
            abstractC17043.mo29990();
        }
        C17127.m38756();
    }
}
