package l;

/* JADX INFO: renamed from: l.ۧ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11197 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3414 f33609;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6236 f33610;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23169 f33611;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11881 f33612;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17546 f33613;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f33614;

    static {
        new C22464().m50394();
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
        C3603.m11056(3);
        C3603.m11056(4);
        C3603.m11056(5);
    }

    public C11197(String str, C3414 c3414, C11881 c11881, C6236 c6236, C17546 c17546, C23169 c23169) {
        this.f33614 = str;
        this.f33612 = c11881;
        this.f33610 = c6236;
        this.f33613 = c17546;
        this.f33609 = c3414;
        this.f33611 = c23169;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22464 m27766() {
        return new C22464(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11197)) {
            return false;
        }
        C11197 c11197 = (C11197) obj;
        return C11003.equals(this.f33614, c11197.f33614) && this.f33609.equals(c11197.f33609) && C11003.equals(this.f33612, c11197.f33612) && this.f33610.equals(c11197.f33610) && C11003.equals(this.f33613, c11197.f33613) && C11003.equals(this.f33611, c11197.f33611);
    }

    public final int hashCode() {
        int iHashCode = this.f33614.hashCode() * 31;
        C11881 c11881 = this.f33612;
        int iHashCode2 = (this.f33613.hashCode() + ((this.f33609.hashCode() + ((this.f33610.hashCode() + ((iHashCode + (c11881 != null ? c11881.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f33611.getClass();
        return iHashCode2;
    }
}
