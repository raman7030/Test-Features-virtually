package p067l;

/* JADX INFO: renamed from: l.ۛ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes3.dex */
public final class C8010 extends AbstractC5328 {

    /* JADX INFO: renamed from: ᩶ */
    public static final int f21071 = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: ᩹ */
    public static final AbstractC13375 f21072 = new C8010("CharMatcher.whitespace()");

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15183(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f21071) == c;
    }
}
