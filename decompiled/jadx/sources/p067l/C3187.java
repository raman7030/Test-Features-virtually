package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3187 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C9794 f6121;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterable f6122;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Set f6123;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC19740 f6124;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f6125;

    public C3187(Iterable iterable, C9794 c9794, Set set) {
        this.f6122 = iterable;
        this.f6121 = c9794;
        this.f6123 = set;
        this.f6125 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6124 == null) {
            while (true) {
                Iterator it = this.f6125;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC19740 interfaceC19740 = (InterfaceC19740) it.next();
                if (interfaceC19740.mo23287() != EnumC18398.CLASS && interfaceC19740.mo23287() != EnumC18398.SOURCE) {
                    this.f6121.f20409 |= 4503599627370496L;
                }
                if (this.f6123.contains(interfaceC19740.mo23287())) {
                    this.f6124 = interfaceC19740;
                    break;
                }
            }
        }
        return this.f6124 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        InterfaceC19740 interfaceC19740 = this.f6124;
        this.f6124 = null;
        return interfaceC19740;
    }
}
