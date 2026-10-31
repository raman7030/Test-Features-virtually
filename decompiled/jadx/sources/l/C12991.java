package l;

/* JADX INFO: renamed from: l.۬۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public class C12991 extends AbstractC11581 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC11581 f38905;

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo13299() {
        throw null;
    }

    @Override // l.InterfaceC18842
    @Deprecated
    public final boolean apply(Object obj) {
        return mo13300(((Character) obj).charValue());
    }

    public C12991(AbstractC11581 abstractC11581) {
        this.f38905 = abstractC11581;
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13300(char c) {
        return !this.f38905.mo13300(c);
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo25531(CharSequence charSequence) {
        return this.f38905.mo25532(charSequence);
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25532(CharSequence charSequence) {
        return this.f38905.mo25531(charSequence);
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final int mo25529(CharSequence charSequence) {
        return charSequence.length() - this.f38905.mo25529(charSequence);
    }

    public final String toString() {
        return this.f38905 + ".negate()";
    }
}
