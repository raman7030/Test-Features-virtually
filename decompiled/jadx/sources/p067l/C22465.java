package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22465 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Runnable f70862;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C5030 f70863;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f70864;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f70865;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f70866;

    public C22465(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, C5030 c5030, Runnable runnable) {
        this.f70866 = abstractActivityC5549;
        this.f70865 = abstractC17043;
        this.f70863 = c5030;
        this.f70862 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f70866);
        c24164.mo51878((Runnable) null);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53429(R.string.MT_Protector);
        c24164.mo51883();
        this.f70864 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        AbstractC17043 abstractC17043 = this.f70865;
        abstractC17043.mo25503();
        abstractC17043.mo37342();
        C5030 c5030 = this.f70863;
        String strM55212 = C25165.m55212(c5030.f11535);
        C18724 c18724M16220 = C7050.m16220();
        C11349 c11349 = new C11349();
        c11349.m26292(strM55212);
        C20066 c20066Execute = c18724M16220.m42716(c11349.m26284()).execute();
        try {
            if (!c20066Execute.m45439()) {
                throw new IOException("Code-" + c20066Execute.m45443() + ": " + c20066Execute.m45437());
            }
            AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
            if (abstractC2630M45436 == null) {
                throw new IOException("Response body is null");
            }
            C20689 c20689 = new C20689(abstractC2630M45436.mo4015());
            C24164 c24164 = this.f70864;
            C12826.requireNonNull(c24164);
            c20689.m46753(new C24793(c24164));
            InputStream inputStreamM4011 = abstractC2630M45436.m4011();
            try {
                BufferedOutputStream bufferedOutputStreamM38683 = abstractC17043.m38683();
                try {
                    byte[] bArr = new byte[512];
                    do {
                        int i = inputStreamM4011.read(bArr);
                        if (i != -1) {
                            c20689.m46754(i);
                            bufferedOutputStreamM38683.write(bArr, 0, i);
                        } else {
                            bufferedOutputStreamM38683.close();
                            inputStreamM4011.close();
                            c20066Execute.close();
                            if (C16111.m36659(abstractC17043.m38664()).equals(c5030.f11532)) {
                                return;
                            }
                            C20953.m47264();
                            throw new C3924("File md5 verification failed");
                        }
                        try {
                            inputStreamM4011.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (!this.f70864.m53444());
                    bufferedOutputStreamM38683.close();
                    inputStreamM4011.close();
                    c20066Execute.close();
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStreamM38683.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM4011.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c20066Execute.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean zM53444 = this.f70864.m53444();
        Runnable runnable = this.f70862;
        if (zM53444) {
            runnable.run();
            return;
        }
        C6371.m14587(this.f70866, this.f70865, this.f70863, runnable);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f70866.m12259(exc, (DialogInterface.OnDismissListener) null);
        this.f70862.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f70864.m53442();
    }
}
