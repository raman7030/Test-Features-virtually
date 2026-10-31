package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7361 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11095 f22600;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18150 f22601;

    public C7361(C18150 c18150) {
        this.f22601 = c18150;
        this.f22600 = c18150.f56443;
        this.f22600 = m19787();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11095 m19787() {
        C11095 c11095 = this.f22600.f33304;
        C18150 c18150 = this.f22601;
        if (c11095 == c18150.f56442) {
            return null;
        }
        while (c11095.f33304 != c18150.f56442) {
            int i = c11095.f33302;
            C11095 c11096 = c11095.f33304;
            if (i != c11096.f33305 || !c11095.f33303.equals(c11096.f33303)) {
                break;
            }
            C11095 c11097 = c11095.f33304;
            c11095.f33302 = c11097.f33302;
            C11095 c11098 = c11097.f33304;
            c11098.f33306 = c11097.f33306;
            c11097.f33306.f33304 = c11098;
        }
        return c11095;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22600 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C11095 c11095 = this.f22600;
        this.f22600 = m19787();
        return c11095;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
