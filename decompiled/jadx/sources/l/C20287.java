package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20287 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4764 f65532;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20808 f65533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC18691 f65534 = C14332.m34204();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f65535;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f65536;

    public C20287(C4764 c4764) {
        AbstractC20808 abstractC20808;
        this.f65532 = c4764;
        m46543(true);
        while (true) {
            Iterator it = this.f65536;
            if (it == null) {
                abstractC20808 = null;
                break;
            } else {
                if (it.hasNext()) {
                    abstractC20808 = (AbstractC20808) this.f65536.next();
                    break;
                }
                m46543(false);
            }
        }
        this.f65533 = abstractC20808;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65533 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC20808 abstractC20808;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AbstractC20808 abstractC20809 = this.f65533;
        while (true) {
            Iterator it = this.f65536;
            if (it == null) {
                abstractC20808 = null;
                break;
            }
            if (it.hasNext()) {
                abstractC20808 = (AbstractC20808) this.f65536.next();
                break;
            }
            m46543(false);
        }
        this.f65533 = abstractC20808;
        return abstractC20809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46543(boolean z) {
        EnumSet enumSetNoneOf;
        byte[] bArr;
        C4764 c4764 = this.f65532;
        C13935 c13935 = c4764.f10613;
        if (z) {
            enumSetNoneOf = EnumSet.of(EnumC13791.SMB2_RESTART_SCANS);
        } else {
            enumSetNoneOf = EnumSet.noneOf(EnumC13791.class);
        }
        InterfaceC18691 interfaceC18691 = this.f65534;
        C2130 c2130M8410 = c13935.m8410(c4764.f10615, enumSetNoneOf, interfaceC18691.mo3621());
        long jM52202 = ((C23670) c2130M8410.mo3028()).m52202();
        byte[] bArrM7049 = c2130M8410.m7049();
        if (jM52202 == EnumC7462.STATUS_NO_MORE_FILES.getValue() || jM52202 == EnumC7462.STATUS_NO_SUCH_FILE.getValue() || ((bArr = this.f65535) != null && Arrays.equals(bArr, bArrM7049))) {
            this.f65536 = null;
            this.f65535 = null;
        } else {
            this.f65535 = bArrM7049;
            this.f65536 = C14332.m34203(bArrM7049, interfaceC18691);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
