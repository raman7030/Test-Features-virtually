package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19255 {

    /* JADX INFO: renamed from: ֫ */
    public int f57539;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC8526 f57540;

    /* JADX INFO: renamed from: ۢ */
    public boolean f57541;

    /* JADX INFO: renamed from: ۧ */
    public int f57542;

    /* JADX INFO: renamed from: ܽ */
    public int f57544;

    /* JADX INFO: renamed from: ܿ */
    public C24619 f57545;

    /* JADX INFO: renamed from: ᩷ */
    public int f57547;

    /* JADX INFO: renamed from: ܺ */
    public static final AbstractC8526[] f57538 = new AbstractC8526[0];

    /* JADX INFO: renamed from: ۡ */
    public static final boolean[] f57537 = new boolean[0];

    /* JADX INFO: renamed from: ܳ */
    public AbstractC8526[] f57543 = f57538;

    /* JADX INFO: renamed from: ᩻ */
    public boolean[] f57548 = f57537;

    /* JADX INFO: renamed from: ᩳ */
    public int f57546 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m43866(C11209 c11209) {
        C12826.requireNonNull(c11209, "store");
        AbstractC8526 abstractC8526 = c11209.f31139;
        this.f57540 = abstractC8526;
        int i = abstractC8526 == null ? 0 : abstractC8526.f22880;
        AbstractC8526[] abstractC8526Arr = this.f57543;
        if (abstractC8526Arr.length < i) {
            this.f57543 = (AbstractC8526[]) Arrays.copyOf(abstractC8526Arr, i);
            this.f57548 = Arrays.copyOf(this.f57548, i);
        }
        Arrays.fill(this.f57543, 0, this.f57542, (Object) null);
        this.f57542 = 0;
        this.f57545 = null;
        this.f57546 = -1;
        this.f57547 = 0;
        this.f57544 = 0;
        this.f57541 = false;
        this.f57539 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43867(int i) {
        AbstractC8526 abstractC8526 = this.f57540;
        int i2 = abstractC8526 == null ? 0 : abstractC8526.f22881;
        C12826.checkFromToIndex(i, i, i2);
        Arrays.fill(this.f57543, 0, this.f57542, (Object) null);
        this.f57542 = 0;
        this.f57545 = null;
        this.f57546 = -1;
        this.f57541 = false;
        AbstractC8526 abstractC8527 = this.f57540;
        if (abstractC8527 == null) {
            this.f57544 = 0;
            this.f57547 = 0;
            this.f57539 = -1;
            return false;
        }
        if (i == i2) {
            i = i2 - 1;
        }
        int i3 = 0;
        while (abstractC8527 instanceof C12550) {
            C12550 c12550 = (C12550) abstractC8527;
            AbstractC8526[] abstractC8526Arr = this.f57543;
            int i4 = this.f57542;
            abstractC8526Arr[i4] = c12550;
            AbstractC8526 abstractC8528 = c12550.f35270;
            int i5 = abstractC8528.f22881 + i3;
            if (i < i5) {
                boolean[] zArr = this.f57548;
                this.f57542 = i4 + 1;
                zArr[i4] = false;
                abstractC8527 = abstractC8528;
            } else {
                boolean[] zArr2 = this.f57548;
                this.f57542 = i4 + 1;
                zArr2[i4] = true;
                abstractC8527 = c12550.f35269;
                i3 = i5;
            }
        }
        this.f57545 = (C24619) abstractC8527;
        this.f57547 = i3;
        this.f57546 = 0;
        while (true) {
            int i6 = this.f57546;
            C24619 c24619 = this.f57545;
            if (i6 < c24619.f22882) {
                int i7 = this.f57547 + (c24619.f77931[i6] & Integer.MAX_VALUE);
                this.f57544 = i7;
                if (i < i7) {
                    this.f57541 = true;
                    this.f57539 = 0;
                    return true;
                }
                this.f57547 = i7;
                this.f57546 = i6 + 1;
            } else {
                throw new AssertionError("Invalid syntax run coverage");
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m43871() {
        if (this.f57540 == null || this.f57539 > 0) {
            return false;
        }
        if (!this.f57541) {
            return m43867(0);
        }
        int i = this.f57546 + 1;
        this.f57546 = i;
        C24619 c24619 = this.f57545;
        if (i < c24619.f22882) {
            int i2 = this.f57544;
            this.f57547 = i2;
            this.f57544 = i2 + (c24619.f77931[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f57542 - 1;
        while (i3 >= 0 && this.f57548[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f57541 = false;
            this.f57539 = 1;
            this.f57545 = null;
            this.f57546 = -1;
            Arrays.fill(this.f57543, 0, this.f57542, (Object) null);
            this.f57542 = 0;
            return false;
        }
        AbstractC8526[] abstractC8526Arr = this.f57543;
        C12550 c12550 = (C12550) abstractC8526Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC8526Arr, i4, this.f57542, (Object) null);
        this.f57542 = i3;
        this.f57543[i3] = c12550;
        boolean[] zArr = this.f57548;
        this.f57542 = i4;
        zArr[i3] = true;
        m43863(c12550.f35269, true);
        this.f57546 = 0;
        int i5 = this.f57544;
        this.f57547 = i5;
        this.f57544 = i5 + (this.f57545.f77931[0] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m43869() {
        AbstractC8526 abstractC8526 = this.f57540;
        if (abstractC8526 == null || this.f57539 < 0) {
            return false;
        }
        if (!this.f57541) {
            return m43867(abstractC8526.f22881);
        }
        int i = this.f57546 - 1;
        this.f57546 = i;
        if (i >= 0) {
            int i2 = this.f57547;
            this.f57544 = i2;
            this.f57547 = i2 - (this.f57545.f77931[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f57542 - 1;
        while (i3 >= 0 && !this.f57548[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f57541 = false;
            this.f57539 = -1;
            this.f57545 = null;
            this.f57546 = -1;
            this.f57544 = 0;
            this.f57547 = 0;
            Arrays.fill(this.f57543, 0, this.f57542, (Object) null);
            this.f57542 = 0;
            return false;
        }
        AbstractC8526[] abstractC8526Arr = this.f57543;
        C12550 c12550 = (C12550) abstractC8526Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC8526Arr, i4, this.f57542, (Object) null);
        this.f57542 = i3;
        this.f57543[i3] = c12550;
        boolean[] zArr = this.f57548;
        this.f57542 = i4;
        zArr[i3] = false;
        m43863(c12550.f35270, false);
        C24619 c24619 = this.f57545;
        int i5 = c24619.f22882 - 1;
        this.f57546 = i5;
        int i6 = this.f57547;
        this.f57544 = i6;
        this.f57547 = i6 - (c24619.f77931[i5] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43868() {
        m43864();
        return this.f57547;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43865() {
        m43864();
        return this.f57544;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C23120 m43870() {
        m43864();
        return this.f57545.f77930[this.f57546];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m43872() {
        m43864();
        return this.f57545.f77931[this.f57546] < 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m43864() {
        if (!this.f57541) {
            throw new IllegalStateException("Syntax run cursor has no current item");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43863(AbstractC8526 abstractC8526, boolean z) {
        while (abstractC8526 instanceof C12550) {
            C12550 c12550 = (C12550) abstractC8526;
            AbstractC8526[] abstractC8526Arr = this.f57543;
            int i = this.f57542;
            abstractC8526Arr[i] = c12550;
            boolean[] zArr = this.f57548;
            this.f57542 = i + 1;
            zArr[i] = !z;
            abstractC8526 = z ? c12550.f35270 : c12550.f35269;
        }
        this.f57545 = (C24619) abstractC8526;
    }
}
