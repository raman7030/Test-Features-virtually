package l;

/* JADX INFO: renamed from: l.ۛ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes3.dex */
public final class C5936 extends AbstractC3114 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f18217 = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f18218 = new C5936("CharMatcher.whitespace()");

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13300(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f18217) == c;
    }
}
