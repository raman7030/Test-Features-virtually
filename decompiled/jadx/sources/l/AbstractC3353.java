package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۗܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9CR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3353 implements Closeable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13935 f10613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16594 f10614;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12216 f10615;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC2148 f10616;

    public AbstractC3353() {
        throw null;
    }

    public AbstractC3353(C12216 c12216, C13935 c13935, C16594 c16594) {
        this.f10616 = C11321.m27961(getClass());
        new ArrayList();
        new ReentrantReadWriteLock();
        this.f10615 = c12216;
        this.f10614 = c16594;
        this.f10613 = c13935;
        C11321.m27961(getClass());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10252(InterfaceC8689 interfaceC8689) throws Throwable {
        C13935 c13935 = this.f10613;
        c13935.getClass();
        C0097 c0097 = new C0097();
        InterfaceC19397 interfaceC19397M34205 = C14332.m34205(interfaceC8689);
        interfaceC19397M34205.mo3622(interfaceC8689, c0097);
        c13935.m8416(this.f10615, EnumC7069.SMB2_0_INFO_FILE, interfaceC19397M34205.mo3621(), c0097.m26098());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10613.mo8415(this.f10615);
    }

    public final int hashCode() {
        C16594 c16594 = this.f10614;
        int iHashCode = ((c16594 == null ? 0 : c16594.hashCode()) + 31) * 31;
        C13935 c13935 = this.f10613;
        return iHashCode + (c13935 != null ? c13935.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3353 abstractC3353 = (AbstractC3353) obj;
        C13935 c13935 = abstractC3353.f10613;
        C16594 c16594 = abstractC3353.f10614;
        C16594 c16595 = this.f10614;
        if (c16595 == null) {
            if (c16594 != null) {
                return false;
            }
        } else if (!c16595.equals(c16594)) {
            return false;
        }
        C13935 c13936 = this.f10613;
        if (c13936 == null) {
            return c13935 == null;
        }
        return c13936.equals(c13935);
    }
}
