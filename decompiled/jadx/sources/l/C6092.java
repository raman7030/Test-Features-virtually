package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6092 extends AbstractC20910 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11737 f18671;

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        C11737 c11737 = this.f18671;
        char[] cArr = c11737.f35005;
        int i = c11737.f35006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] == c) {
                return true;
            }
            i = i2;
        }
    }

    public C6092(C11737 c11737) {
        this.f18671 = c11737;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C12442(this);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return new C12442(this);
    }

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C10326(this, 0, this.f18671.f35006);
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
        C11737 c11737 = this.f18671;
        char[] cArr = c11737.f35005;
        int i = c11737.f35006;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC23662.mo18328(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18671.f35006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18671.f35006 = 0;
    }
}
