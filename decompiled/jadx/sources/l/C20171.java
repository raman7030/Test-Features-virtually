package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20171 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65286;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f65287;

    public C20171(Object obj) {
        this.f65287 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f65286;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f65286) {
            throw new NoSuchElementException();
        }
        this.f65286 = true;
        return this.f65287;
    }
}
