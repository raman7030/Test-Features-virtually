package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.۬֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C12807 implements Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C12807 f38444;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38445 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f38446;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17230 f38449;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f38450;

    public /* synthetic */ C12807(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, str);
    }

    public C12807(int i, int i2, int i3, String str) {
        this.f38448 = i;
        this.f38447 = i2;
        this.f38446 = i3;
        this.f38450 = str;
        this.f38449 = C14407.m34431(new C2930(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31118() {
        return this.f38448;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31120() {
        return this.f38447;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m31121() {
        return this.f38446;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C12807 c12807) {
        C11233.m27805(c12807, "other");
        Object value = this.f38449.getValue();
        C11233.m27803(value, "<get-bigInteger>(...)");
        Object value2 = c12807.f38449.getValue();
        C11233.m27803(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final String toString() {
        String str = this.f38450;
        String strM27806 = !C3016.m9242((CharSequence) str) ? C11233.m27806(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38448);
        sb.append('.');
        sb.append(this.f38447);
        sb.append('.');
        return C3200.m9831(this.f38446, strM27806, sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12807)) {
            return false;
        }
        C12807 c12807 = (C12807) obj;
        return this.f38448 == c12807.f38448 && this.f38447 == c12807.f38447 && this.f38446 == c12807.f38446;
    }

    public final int hashCode() {
        return ((((this.f38448 + 527) * 31) + this.f38447) * 31) + this.f38446;
    }

    static {
        new C12807(0, 0, 0, "");
        f38444 = new C12807(0, 1, 0, "");
        new C12807(1, 0, 0, "");
    }
}
