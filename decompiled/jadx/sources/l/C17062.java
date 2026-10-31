package l;

/* JADX INFO: renamed from: l.ܿۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17062 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52310;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52311;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52312;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC6479[] f52313;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC6479 f52314;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f52315;

    public C17062(AbstractC6479 abstractC6479, boolean z) {
        this.f52313 = new AbstractC6479[abstractC6479.f20005];
        this.f52315 = z;
        m40046(abstractC6479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40050() {
        C10713 c10713 = (C10713) this.f52314;
        int i = this.f52310;
        this.f52310 = i + 1;
        boolean z = this.f52315;
        this.f52313[i] = z ? c10713.f32295 : c10713.f32294;
        m40046(z ? c10713.f32294 : c10713.f32295);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40052() {
        int i = this.f52310;
        if (i == 0) {
            m40046((AbstractC6479) null);
            return;
        }
        int i2 = i - 1;
        this.f52310 = i2;
        AbstractC6479[] abstractC6479Arr = this.f52313;
        AbstractC6479 abstractC6479 = abstractC6479Arr[i2];
        abstractC6479Arr[i2] = null;
        m40046(abstractC6479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40051(int i) {
        this.f52309 += i;
        int i2 = this.f52311 - i;
        this.f52311 = i2;
        if (i2 != 0) {
            return;
        }
        C23412 c23412 = (C23412) this.f52314;
        int i3 = this.f52312 + (this.f52315 ? -1 : 1);
        this.f52312 = i3;
        if (i3 < 0 || i3 == c23412.f20007) {
            m40052();
        } else {
            this.f52311 = c23412.f75185[i3] & Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40046(AbstractC6479 abstractC6479) {
        this.f52314 = abstractC6479;
        this.f52309 = 0;
        if (abstractC6479 instanceof C23412) {
            C23412 c23412 = (C23412) abstractC6479;
            int i = this.f52315 ? c23412.f20007 - 1 : 0;
            this.f52312 = i;
            this.f52311 = c23412.f75185[i] & Integer.MAX_VALUE;
        }
    }
}
