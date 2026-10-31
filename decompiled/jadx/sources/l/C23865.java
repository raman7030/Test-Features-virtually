package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23865 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f77188 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6932 f77189;

    public C23865(AbstractC6932 abstractC6932) {
        this.f77189 = abstractC6932;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f77188 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f77188;
            AbstractC6932 abstractC6932 = this.f77189;
            if (i > abstractC6932.mo2344()) {
                return false;
            }
            if (abstractC6932.mo2347(this.f77188)) {
                return true;
            }
            this.f77188++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f77188;
        this.f77188 = i + 1;
        InterfaceC21211 interfaceC21211Mo2346 = this.f77189.mo2346(i);
        C11003.requireNonNull(interfaceC21211Mo2346);
        return interfaceC21211Mo2346;
    }
}
