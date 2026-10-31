package l;

/* JADX INFO: renamed from: l.֫ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7630 f6584;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f6585;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6586;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f6587;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6588;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f6589;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f6590;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f6591;

    public C1965(String str, int i, int i2, CharSequence charSequence) {
        this.f6585 = str;
        this.f6591 = i;
        this.f6586 = i2;
        this.f6587 = charSequence;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m6473() {
        m6471();
        return this.f6590;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6472() {
        m6471();
        return this.f6588;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6474() {
        m6471();
        return this.f6589;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m6471() {
        int iCodePointCount;
        if (this.f6590 != null) {
            return;
        }
        C7630 c7630M20423 = this.f6584;
        int i = this.f6591;
        if (c7630M20423 == null) {
            c7630M20423 = C7630.m20423(i, this.f6586, this.f6587);
            this.f6584 = c7630M20423;
        }
        if (c7630M20423.f23577) {
            iCodePointCount = 0;
        } else {
            String str = c7630M20423.f23576;
            iCodePointCount = (240 - str.codePointCount(0, str.length())) / 2;
        }
        int iM21642 = C8163.m21642(i, -iCodePointCount, this.f6587);
        this.f6588 = iM21642;
        String strM21636 = C8163.m21636(iM21642, 240, this.f6587);
        this.f6590 = strM21636;
        int i2 = this.f6588;
        this.f6589 = i2 > 0 || strM21636.length() + i2 < this.f6587.length();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6475() {
        if (this.f6584 == null) {
            this.f6584 = C7630.m20423(this.f6591, this.f6586, this.f6587);
        }
        m6471();
        this.f6587 = "";
    }
}
