package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes.dex */
public final class C22066 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f70709;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f70710;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70711;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f70712;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f70713;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C22066(CharSequence charSequence) {
        C11233.m27805(charSequence, "string");
        this.f70710 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f70711;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f70712 < 0) {
            this.f70711 = 2;
            return false;
        }
        CharSequence charSequence = this.f70710;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f70709; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f70711 = 1;
                this.f70712 = i;
                this.f70713 = length;
                return true;
            }
        }
        i = -1;
        this.f70711 = 1;
        this.f70712 = i;
        this.f70713 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f70711 = 0;
        int i = this.f70713;
        int i2 = this.f70709;
        this.f70709 = this.f70712 + i;
        return this.f70710.subSequence(i2, i).toString();
    }
}
