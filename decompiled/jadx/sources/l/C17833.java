package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17833 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17127 f54480;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f54481;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54482 = -2;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C17833(C17127 c17127) {
        this.f54480 = c17127;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m41766() {
        Object objInvoke;
        int i = this.f54482;
        C17127 c17127 = this.f54480;
        if (i == -2) {
            objInvoke = ((C15715) c17127.f52475).f48466;
        } else {
            InterfaceC16233 interfaceC16233 = c17127.f52476;
            Object obj = this.f54481;
            C11233.m27799(obj);
            objInvoke = interfaceC16233.invoke(obj);
        }
        this.f54481 = objInvoke;
        this.f54482 = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f54482 < 0) {
            m41766();
        }
        if (this.f54482 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f54481;
        C11233.m27800(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f54482 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f54482 < 0) {
            m41766();
        }
        return this.f54482 == 1;
    }
}
