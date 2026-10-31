package l;

import java.io.IOException;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C20515 extends RuntimeException {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient AbstractC5698 f66102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Supplier f66103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient C2002 f66104;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient C16719 f66105;

    public C20515(AbstractC5698 abstractC5698, Supplier supplier, C2002 c2002) {
        this.f66104 = c2002;
        this.f66102 = abstractC5698;
        this.f66103 = supplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m46989() {
        Supplier supplier;
        if (this.f66105 == null && (supplier = this.f66103) != null) {
            this.f66105 = (C16719) supplier.get();
        }
        return this.f66105;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return m46989().mo29296((Locale) null);
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46990(IOException iOException) {
        super.initCause(iOException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46991(C3809 c3809) {
        this.f66103 = c3809;
        this.f66105 = null;
    }
}
