package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20738 implements InterfaceC16687 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21262 f66761;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8743 f66762;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4760 f66763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66764;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17209 f66765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20216 f66766;

    public C20738(C17209 c17209, C8743 c8743) {
        this.f66765 = c17209;
        this.f66762 = c8743;
        this.f66761 = new C21262(c17209);
        C23559 c23559 = new C23559(this);
        this.f66763 = c23559;
        long j = c17209.f52781;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c23559.mo20329(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20738 m47371(C17209 c17209, C8743 c8743) {
        C20738 c20738 = new C20738(c17209, c8743);
        ((C21627) c17209.f52775).getClass();
        c20738.f66766 = AbstractC20216.f65406;
        return c20738;
    }

    @Override // l.InterfaceC16687
    public final C18621 execute() {
        synchronized (this) {
            if (this.f66764) {
                throw new IllegalStateException("Already Executed");
            }
            this.f66764 = true;
        }
        this.f66761.m48269(C18872.m43580().mo43586());
        this.f66763.m13925();
        this.f66766.getClass();
        try {
            try {
                this.f66765.f52772.m15410(this);
                C18621 c18621M47373 = m47373();
                if (c18621M47373 == null) {
                    throw new IOException("Canceled");
                }
                this.f66765.f52772.m15413(this);
                return c18621M47373;
            } catch (IOException e) {
                IOException iOExceptionM47372 = m47372(e);
                this.f66766.getClass();
                throw iOExceptionM47372;
            }
        } catch (Throwable th) {
            this.f66765.f52772.m15413(this);
            throw th;
        }
        this.f66765.f52772.m15413(this);
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m47372(IOException iOException) {
        if (!this.f66763.m13923()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // l.InterfaceC16687
    /* JADX INFO: renamed from: ֫ */
    public final void mo39222(InterfaceC18099 interfaceC18099) {
        synchronized (this) {
            if (this.f66764) {
                throw new IllegalStateException("Already Executed");
            }
            this.f66764 = true;
        }
        this.f66761.m48269(C18872.m43580().mo43586());
        this.f66766.getClass();
        this.f66765.f52772.m15409(new C6626(this, interfaceC18099));
    }

    @Override // l.InterfaceC16687
    public final void cancel() {
        this.f66761.m48268();
    }

    @Override // l.InterfaceC16687
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo39223() {
        return this.f66761.m48270();
    }

    public final Object clone() {
        return m47371(this.f66765, this.f66762);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m47373() throws IOException {
        ArrayList arrayList = new ArrayList();
        C17209 c17209 = this.f66765;
        arrayList.addAll(c17209.f52778);
        C21262 c21262 = this.f66761;
        arrayList.add(c21262);
        arrayList.add(new C2211(c17209.f52765));
        C7787 c7787 = c17209.f52784;
        arrayList.add(new C3098(c7787 != null ? c7787.f24061 : null));
        arrayList.add(new C17027(c17209));
        arrayList.addAll(c17209.f52780);
        arrayList.add(new C18439());
        AbstractC20216 abstractC20216 = this.f66766;
        int i = c17209.f52774;
        int i2 = c17209.f52766;
        int i3 = c17209.f52777;
        C8743 c8743 = this.f66762;
        C18621 c18621M21036 = new C7855(arrayList, null, null, null, 0, c8743, this, abstractC20216, i, i2, i3).m21036(c8743);
        if (!c21262.m48270()) {
            return c18621M21036;
        }
        C20032.m46179(c18621M21036);
        throw new IOException("Canceled");
    }
}
