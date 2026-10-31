package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7644 extends AbstractC2021 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23166 f23609;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23166 f23610;

    /* JADX INFO: renamed from: ۧ */
    public abstract C23166 mo17159(C23166 c23166);

    /* JADX INFO: renamed from: ܽ */
    public abstract C23166 mo17160(C23166 c23166);

    public AbstractC7644(C23166 c23166, C23166 c23167) {
        this.f23609 = c23167;
        this.f23610 = c23166;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23610 != null;
    }

    @Override // l.AbstractC2021
    /* JADX INFO: renamed from: ֫ */
    public final void mo6575(C23166 c23166) {
        C23166 c23166Mo17160 = null;
        if (this.f23609 == c23166 && c23166 == this.f23610) {
            this.f23610 = null;
            this.f23609 = null;
        }
        C23166 c23167 = this.f23609;
        if (c23167 == c23166) {
            this.f23609 = mo17159(c23167);
        }
        C23166 c23168 = this.f23610;
        if (c23168 == c23166) {
            C23166 c23169 = this.f23609;
            if (c23168 != c23169 && c23169 != null) {
                c23166Mo17160 = mo17160(c23168);
            }
            this.f23610 = c23166Mo17160;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23166 c23166 = this.f23610;
        C23166 c23167 = this.f23609;
        this.f23610 = (c23166 == c23167 || c23167 == null) ? null : mo17160(c23166);
        return c23166;
    }
}
