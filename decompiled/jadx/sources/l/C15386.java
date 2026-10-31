package l;

/* JADX INFO: renamed from: l.ܶᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15386 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f47113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11860 f47114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f47115 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11860 f47116;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11860 f47117;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f47118;

    public C15386(C11860 c11860) {
        this.f47117 = c11860;
        this.f47114 = c11860;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36422(int i) {
        C11860 c11860M28968 = this.f47114.m28968(i);
        int i2 = 1;
        if (this.f47115 == 2) {
            if (c11860M28968 != null) {
                this.f47114 = c11860M28968;
                this.f47113++;
            } else if (i == 65038) {
                m36421();
            } else if (i != 65039) {
                if (this.f47114.m28967() != null) {
                    if (this.f47113 != 1 || m36420()) {
                        this.f47116 = this.f47114;
                        m36421();
                        i2 = 3;
                    } else {
                        m36421();
                    }
                } else {
                    m36421();
                }
            }
            i2 = 2;
        } else if (c11860M28968 == null) {
            m36421();
        } else {
            this.f47115 = 2;
            this.f47114 = c11860M28968;
            this.f47113 = 1;
            i2 = 2;
        }
        this.f47118 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m36421() {
        this.f47115 = 1;
        this.f47114 = this.f47117;
        this.f47113 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1961 m36424() {
        return this.f47116.m28967();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1961 m36423() {
        return this.f47114.m28967();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36425() {
        if (this.f47115 != 2 || this.f47114.m28967() == null) {
            return false;
        }
        return this.f47113 > 1 || m36420();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m36420() {
        return this.f47114.m28967().m6466() || this.f47118 == 65039;
    }
}
