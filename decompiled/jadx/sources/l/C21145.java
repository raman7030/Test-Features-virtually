package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21145 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f68180;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2800 f68181;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f68182;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f68183;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f68184;

    public C21145(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, C2800 c2800, Runnable runnable) {
        this.f68184 = abstractActivityC3346;
        this.f68183 = abstractC15440;
        this.f68181 = c2800;
        this.f68180 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f68184);
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51038(R.string.MT_Protector);
        c22933.mo49547();
        this.f68182 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        AbstractC15440 abstractC15440 = this.f68183;
        abstractC15440.mo23552();
        abstractC15440.mo35195();
        C2800 c2800 = this.f68181;
        String strM52806 = C23986.m52806(c2800.f8741);
        C17209 c17209M14323 = C4925.m14323();
        C9449 c9449 = new C9449();
        c9449.m24282(strM52806);
        C18621 c18621Execute = c17209M14323.m40469(c9449.m24274()).execute();
        try {
            if (!c18621Execute.m43173()) {
                throw new IOException("Code-" + c18621Execute.m43177() + ": " + c18621Execute.m43171());
            }
            AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
            if (abstractC0275M43170 == null) {
                throw new IOException("Response body is null");
            }
            C19277 c19277 = new C19277(abstractC0275M43170.mo1615());
            C22933 c22933 = this.f68182;
            C11003.requireNonNull(c22933);
            c19277.m44459(new C23595(c22933));
            InputStream inputStreamM1611 = abstractC0275M43170.m1611();
            try {
                BufferedOutputStream bufferedOutputStreamM36525 = abstractC15440.m36525();
                try {
                    byte[] bArr = new byte[512];
                    do {
                        int i = inputStreamM1611.read(bArr);
                        if (i != -1) {
                            c19277.m44460(i);
                            bufferedOutputStreamM36525.write(bArr, 0, i);
                        } else {
                            bufferedOutputStreamM36525.close();
                            inputStreamM1611.close();
                            c18621Execute.close();
                            if (C14460.m34525(abstractC15440.m36506()).equals(c2800.f8738)) {
                                return;
                            }
                            C19554.m44964();
                            throw new C1637("File md5 verification failed");
                        }
                        try {
                            inputStreamM1611.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (!this.f68182.m51053());
                    bufferedOutputStreamM36525.close();
                    inputStreamM1611.close();
                    c18621Execute.close();
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStreamM36525.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM1611.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c18621Execute.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean zM51053 = this.f68182.m51053();
        Runnable runnable = this.f68180;
        if (zM51053) {
            runnable.run();
            return;
        }
        C4211.m12711(this.f68184, this.f68183, this.f68181, runnable);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f68184.m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f68180.run();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f68182.m51051();
    }
}
