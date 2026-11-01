package p067l;

/* JADX INFO: renamed from: l.᩻᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01EH */
/* JADX INFO: loaded from: classes.dex */
public final class C25209 {

    /* JADX INFO: renamed from: ֫ */
    public final int f80611;

    /* JADX INFO: renamed from: ۧ */
    public final int f80612;

    /* JADX INFO: renamed from: ܳ */
    public final int f80613;

    /* JADX INFO: renamed from: ܽ */
    public final int f80614;

    /* JADX INFO: renamed from: ܿ */
    public final C23198[] f80615;

    /* JADX INFO: renamed from: ᩳ */
    public final String f80616;

    public C25209(int i, int i2, String str, C23198[] c23198Arr, int i3, int i4) {
        this.f80613 = i;
        this.f80612 = i2;
        this.f80616 = str;
        this.f80615 = c23198Arr;
        this.f80614 = i3;
        this.f80611 = i4;
    }

    public C25209(C6925 c6925, int i, int i2) {
        if (c6925.mo7252()) {
            this.f80613 = 1;
            this.f80612 = -1;
            this.f80616 = c6925.mo7251().getValue();
            this.f80615 = c6925.mo7251().mo12358();
        } else if (c6925.mo7250()) {
            this.f80613 = 2;
            this.f80612 = c6925.getValue();
            this.f80616 = null;
            this.f80615 = null;
        } else if (c6925.mo7248()) {
            this.f80613 = 3;
            this.f80612 = c6925.getValue();
            this.f80616 = null;
            this.f80615 = null;
        } else {
            throw new RuntimeException();
        }
        this.f80614 = i;
        this.f80611 = i2;
    }

    public C25209(int i, int i2, int i3) {
        this.f80613 = 0;
        this.f80612 = i;
        this.f80616 = null;
        this.f80615 = null;
        this.f80614 = i2;
        this.f80611 = i3;
    }
}
