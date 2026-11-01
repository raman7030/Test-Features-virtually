package p067l;

import java.io.IOException;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C21865 extends RuntimeException {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public transient AbstractC7783 f68780;

    /* JADX INFO: renamed from: ᩶ */
    public transient Supplier f68781;

    /* JADX INFO: renamed from: ᩸ */
    public final transient C4271 f68782;

    /* JADX INFO: renamed from: ᩹ */
    public transient C18258 f68783;

    public C21865(AbstractC7783 abstractC7783, Supplier supplier, C4271 c4271) {
        this.f68782 = c4271;
        this.f68780 = abstractC7783;
        this.f68781 = supplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m49312() {
        Supplier supplier;
        if (this.f68783 == null && (supplier = this.f68781) != null) {
            this.f68783 = (C18258) supplier.get();
        }
        return this.f68783;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return m49312().mo31351((Locale) null);
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49313(IOException iOException) {
        super.initCause(iOException);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49314(C5988 c5988) {
        this.f68781 = c5988;
        this.f68783 = null;
    }
}
