package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes.dex */
public final class C23340 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public int f73430;

    /* JADX INFO: renamed from: ۙ */
    public final CharSequence f73431;

    /* JADX INFO: renamed from: ᩶ */
    public int f73432;

    /* JADX INFO: renamed from: ᩸ */
    public int f73433;

    /* JADX INFO: renamed from: ᩹ */
    public int f73434;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C23340(CharSequence charSequence) {
        C13045.m29867(charSequence, "string");
        this.f73431 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f73432;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f73433 < 0) {
            this.f73432 = 2;
            return false;
        }
        CharSequence charSequence = this.f73431;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f73430; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f73432 = 1;
                this.f73433 = i;
                this.f73434 = length;
                return true;
            }
        }
        i = -1;
        this.f73432 = 1;
        this.f73433 = i;
        this.f73434 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f73432 = 0;
        int i = this.f73434;
        int i2 = this.f73430;
        this.f73430 = this.f73433 + i;
        return this.f73431.subSequence(i2, i).toString();
    }
}
