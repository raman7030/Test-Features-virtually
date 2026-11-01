package p067l;

/* JADX INFO: renamed from: l.ܽۘ */
/* JADX INFO: compiled from: 64IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C1655 {

    /* JADX INFO: renamed from: ܳ */
    public int f53576 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public int f53580 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f53574 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫ */
    public int f53573 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۧ */
    public int f53575 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f53577 = 0;

    /* JADX INFO: renamed from: ܿ */
    public boolean f53578 = false;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f53579 = false;

    /* JADX INFO: renamed from: ۧ */
    public final int m40792() {
        return this.f53576;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40794() {
        return this.f53580;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40795() {
        return this.f53578 ? this.f53580 : this.f53576;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40789() {
        return this.f53578 ? this.f53576 : this.f53580;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40793(int i, int i2) {
        this.f53574 = i;
        this.f53573 = i2;
        this.f53579 = true;
        if (this.f53578) {
            if (i2 != Integer.MIN_VALUE) {
                this.f53576 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f53580 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f53576 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f53580 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40790(int i, int i2) {
        this.f53579 = false;
        if (i != Integer.MIN_VALUE) {
            this.f53575 = i;
            this.f53576 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f53577 = i2;
            this.f53580 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40791(boolean z) {
        if (z == this.f53578) {
            return;
        }
        this.f53578 = z;
        if (!this.f53579) {
            this.f53576 = this.f53575;
            this.f53580 = this.f53577;
            return;
        }
        if (z) {
            int i = this.f53573;
            if (i == Integer.MIN_VALUE) {
                i = this.f53575;
            }
            this.f53576 = i;
            int i2 = this.f53574;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f53577;
            }
            this.f53580 = i2;
            return;
        }
        int i3 = this.f53574;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f53575;
        }
        this.f53576 = i3;
        int i4 = this.f53573;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f53577;
        }
        this.f53580 = i4;
    }
}
