package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19317 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18646 f57678;

    /* JADX INFO: renamed from: ᩸ */
    public Object f57679;

    /* JADX INFO: renamed from: ᩹ */
    public int f57680 = -2;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C19317(C18646 c18646) {
        this.f57678 = c18646;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m44012() {
        Object objInvoke;
        int i = this.f57680;
        C18646 c18646 = this.f57678;
        if (i == -2) {
            objInvoke = ((C17304) c18646.f55658).f51606;
        } else {
            InterfaceC17797 interfaceC17797 = c18646.f55659;
            Object obj = this.f57679;
            C13045.m29861(obj);
            objInvoke = interfaceC17797.invoke(obj);
        }
        this.f57679 = objInvoke;
        this.f57680 = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f57680 < 0) {
            m44012();
        }
        if (this.f57680 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f57679;
        C13045.m29862(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f57680 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f57680 < 0) {
            m44012();
        }
        return this.f57680 == 1;
    }
}
