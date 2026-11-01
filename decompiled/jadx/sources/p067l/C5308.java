package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5308 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final String f12471;

    /* JADX INFO: renamed from: ᩸ */
    public int f12472 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f12473 = 0;

    public C5308(String str) {
        this.f12471 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12472 != -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12472;
        if (i == -1) {
            throw new NoSuchElementException();
        }
        while (true) {
            int i2 = this.f12473;
            String str = this.f12471;
            if (i2 < str.length()) {
                char cCharAt = str.charAt(this.f12473);
                if (cCharAt != '\n') {
                    if (cCharAt != '\r') {
                        this.f12473++;
                    } else if (this.f12473 + 1 < str.length() && str.charAt(this.f12473 + 1) == '\n') {
                        this.f12473++;
                    }
                }
                int i3 = this.f12473 + 1;
                this.f12473 = i3;
                this.f12472 = i3;
                break;
            }
            this.f12472 = -1;
            break;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
