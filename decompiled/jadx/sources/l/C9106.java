package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9106 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27599;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27600 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16160 f27601;

    public C9106(AbstractC16160 abstractC16160, int i) {
        this.f27601 = abstractC16160;
        this.f27599 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27600 < this.f27599;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f27600;
        this.f27600 = i + 1;
        return this.f27601.getName(i);
    }
}
