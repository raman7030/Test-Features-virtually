package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3093 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9668;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9669 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9670 = 0;

    public C3093(String str) {
        this.f9668 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9669 != -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9669;
        if (i == -1) {
            throw new NoSuchElementException();
        }
        while (true) {
            int i2 = this.f9670;
            String str = this.f9668;
            if (i2 < str.length()) {
                char cCharAt = str.charAt(this.f9670);
                if (cCharAt != '\n') {
                    if (cCharAt != '\r') {
                        this.f9670++;
                    } else if (this.f9670 + 1 < str.length() && str.charAt(this.f9670 + 1) == '\n') {
                        this.f9670++;
                    }
                }
                int i3 = this.f9670 + 1;
                this.f9670 = i3;
                this.f9669 = i3;
                break;
            }
            this.f9669 = -1;
            break;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
