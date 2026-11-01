package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes5.dex */
public final class C22078 implements InterfaceC18228 {

    /* JADX INFO: renamed from: ۗ */
    public final C22575 f69445;

    /* JADX INFO: renamed from: ۙ */
    public final C10678 f69446;

    /* JADX INFO: renamed from: ۬ */
    public final C6892 f69447;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f69448;

    /* JADX INFO: renamed from: ᩸ */
    public final C18724 f69449;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC21582 f69450;

    public C22078(C18724 c18724, C10678 c10678) {
        this.f69449 = c18724;
        this.f69446 = c10678;
        this.f69445 = new C22575(c18724);
        C24759 c24759 = new C24759(this);
        this.f69447 = c24759;
        long j = c18724.f55963;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c24759.mo22306(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22078 m49698(C18724 c18724, C10678 c10678) {
        C22078 c22078 = new C22078(c18724, c10678);
        ((C22923) c18724.f55957).getClass();
        c22078.f69450 = AbstractC21582.f68054;
        return c22078;
    }

    @Override // p067l.InterfaceC18228
    public final C20066 execute() {
        synchronized (this) {
            if (this.f69448) {
                throw new IllegalStateException("Already Executed");
            }
            this.f69448 = true;
        }
        this.f69445.m50600(C20304.m45846().mo45852());
        this.f69447.m15805();
        this.f69450.getClass();
        try {
            try {
                this.f69449.f55954.m17321(this);
                C20066 c20066M49700 = m49700();
                if (c20066M49700 == null) {
                    throw new IOException("Canceled");
                }
                this.f69449.f55954.m17324(this);
                return c20066M49700;
            } catch (IOException e) {
                IOException iOExceptionM49699 = m49699(e);
                this.f69450.getClass();
                throw iOExceptionM49699;
            }
        } catch (Throwable th) {
            this.f69449.f55954.m17324(this);
            throw th;
        }
        this.f69449.f55954.m17324(this);
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IOException m49699(IOException iOException) {
        if (!this.f69447.m15803()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(C0180b.f794n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // p067l.InterfaceC18228
    /* JADX INFO: renamed from: ֫ */
    public final void mo41457(InterfaceC19570 interfaceC19570) {
        synchronized (this) {
            if (this.f69448) {
                throw new IllegalStateException("Already Executed");
            }
            this.f69448 = true;
        }
        this.f69445.m50600(C20304.m45846().mo45852());
        this.f69450.getClass();
        this.f69449.f55954.m17320(new C8666(this, interfaceC19570));
    }

    @Override // p067l.InterfaceC18228
    public final void cancel() {
        this.f69445.m50599();
    }

    @Override // p067l.InterfaceC18228
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo41458() {
        return this.f69445.m50601();
    }

    public final Object clone() {
        return m49698(this.f69449, this.f69446);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20066 m49700() throws IOException {
        ArrayList arrayList = new ArrayList();
        C18724 c18724 = this.f69449;
        arrayList.addAll(c18724.f55960);
        C22575 c22575 = this.f69445;
        arrayList.add(c22575);
        arrayList.add(new C4469(c18724.f55947));
        C9770 c9770 = c18724.f55966;
        arrayList.add(new C5313(c9770 != null ? c9770.f26978 : null));
        arrayList.add(new C18550(c18724));
        arrayList.addAll(c18724.f55962);
        arrayList.add(new C19892());
        AbstractC21582 abstractC21582 = this.f69450;
        int i = c18724.f55956;
        int i2 = c18724.f55948;
        int i3 = c18724.f55959;
        C10678 c10678 = this.f69446;
        C20066 c20066M23001 = new C9833(arrayList, null, null, null, 0, c10678, this, abstractC21582, i, i2, i3).m23001(c10678);
        if (!c22575.m50601()) {
            return c20066M23001;
        }
        C21407.m48495(c20066M23001);
        throw new IOException("Canceled");
    }
}
