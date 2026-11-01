package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6649 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final String f17152;

    /* JADX INFO: renamed from: ᩸ */
    public int f17153;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f17154;

    public C6649(String str) {
        this.f17152 = str;
        C5308 c5308 = new C5308(str);
        this.f17154 = c5308;
        this.f17153 = ((Integer) c5308.next()).intValue();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f17153;
        C5308 c5308 = (C5308) this.f17154;
        boolean zHasNext = c5308.hasNext();
        String str = this.f17152;
        if (zHasNext) {
            this.f17153 = ((Integer) c5308.next()).intValue();
        } else if (hasNext()) {
            this.f17153 = str.length();
        } else {
            throw new NoSuchElementException();
        }
        return str.substring(i, this.f17153);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17153 < this.f17152.length();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
