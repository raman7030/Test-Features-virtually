package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17768 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54345;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC6479 f54346;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f54347;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54348;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54350;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23412 f54351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54353;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6479[] f54344 = new AbstractC6479[0];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f54343 = new boolean[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC6479[] f54349 = f54344;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean[] f54354 = f54343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f54352 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41620(C9302 c9302) {
        C11003.requireNonNull(c9302, "store");
        AbstractC6479 abstractC6479 = c9302.f28190;
        this.f54346 = abstractC6479;
        int i = abstractC6479 == null ? 0 : abstractC6479.f20005;
        AbstractC6479[] abstractC6479Arr = this.f54349;
        if (abstractC6479Arr.length < i) {
            this.f54349 = (AbstractC6479[]) Arrays.copyOf(abstractC6479Arr, i);
            this.f54354 = Arrays.copyOf(this.f54354, i);
        }
        Arrays.fill(this.f54349, 0, this.f54348, (Object) null);
        this.f54348 = 0;
        this.f54351 = null;
        this.f54352 = -1;
        this.f54353 = 0;
        this.f54350 = 0;
        this.f54347 = false;
        this.f54345 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41621(int i) {
        AbstractC6479 abstractC6479 = this.f54346;
        int i2 = abstractC6479 == null ? 0 : abstractC6479.f20006;
        C11003.checkFromToIndex(i, i, i2);
        Arrays.fill(this.f54349, 0, this.f54348, (Object) null);
        this.f54348 = 0;
        this.f54351 = null;
        this.f54352 = -1;
        this.f54347 = false;
        AbstractC6479 abstractC64710 = this.f54346;
        if (abstractC64710 == null) {
            this.f54350 = 0;
            this.f54353 = 0;
            this.f54345 = -1;
            return false;
        }
        if (i == i2) {
            i = i2 - 1;
        }
        int i3 = 0;
        while (abstractC64710 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC64710;
            AbstractC6479[] abstractC6479Arr = this.f54349;
            int i4 = this.f54348;
            abstractC6479Arr[i4] = c10713;
            AbstractC6479 abstractC64711 = c10713.f32295;
            int i5 = abstractC64711.f20006 + i3;
            if (i < i5) {
                boolean[] zArr = this.f54354;
                this.f54348 = i4 + 1;
                zArr[i4] = false;
                abstractC64710 = abstractC64711;
            } else {
                boolean[] zArr2 = this.f54354;
                this.f54348 = i4 + 1;
                zArr2[i4] = true;
                abstractC64710 = c10713.f32294;
                i3 = i5;
            }
        }
        this.f54351 = (C23412) abstractC64710;
        this.f54353 = i3;
        this.f54352 = 0;
        while (true) {
            int i6 = this.f54352;
            C23412 c23412 = this.f54351;
            if (i6 < c23412.f20007) {
                int i7 = this.f54353 + (c23412.f75185[i6] & Integer.MAX_VALUE);
                this.f54350 = i7;
                if (i < i7) {
                    this.f54347 = true;
                    this.f54345 = 0;
                    return true;
                }
                this.f54353 = i7;
                this.f54352 = i6 + 1;
            } else {
                throw new AssertionError("Invalid syntax run coverage");
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m41625() {
        if (this.f54346 == null || this.f54345 > 0) {
            return false;
        }
        if (!this.f54347) {
            return m41621(0);
        }
        int i = this.f54352 + 1;
        this.f54352 = i;
        C23412 c23412 = this.f54351;
        if (i < c23412.f20007) {
            int i2 = this.f54350;
            this.f54353 = i2;
            this.f54350 = i2 + (c23412.f75185[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f54348 - 1;
        while (i3 >= 0 && this.f54354[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f54347 = false;
            this.f54345 = 1;
            this.f54351 = null;
            this.f54352 = -1;
            Arrays.fill(this.f54349, 0, this.f54348, (Object) null);
            this.f54348 = 0;
            return false;
        }
        AbstractC6479[] abstractC6479Arr = this.f54349;
        C10713 c10713 = (C10713) abstractC6479Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC6479Arr, i4, this.f54348, (Object) null);
        this.f54348 = i3;
        this.f54349[i3] = c10713;
        boolean[] zArr = this.f54354;
        this.f54348 = i4;
        zArr[i3] = true;
        m41617(c10713.f32294, true);
        this.f54352 = 0;
        int i5 = this.f54350;
        this.f54353 = i5;
        this.f54350 = i5 + (this.f54351.f75185[0] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m41623() {
        AbstractC6479 abstractC6479 = this.f54346;
        if (abstractC6479 == null || this.f54345 < 0) {
            return false;
        }
        if (!this.f54347) {
            return m41621(abstractC6479.f20006);
        }
        int i = this.f54352 - 1;
        this.f54352 = i;
        if (i >= 0) {
            int i2 = this.f54353;
            this.f54350 = i2;
            this.f54353 = i2 - (this.f54351.f75185[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f54348 - 1;
        while (i3 >= 0 && !this.f54354[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f54347 = false;
            this.f54345 = -1;
            this.f54351 = null;
            this.f54352 = -1;
            this.f54350 = 0;
            this.f54353 = 0;
            Arrays.fill(this.f54349, 0, this.f54348, (Object) null);
            this.f54348 = 0;
            return false;
        }
        AbstractC6479[] abstractC6479Arr = this.f54349;
        C10713 c10713 = (C10713) abstractC6479Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC6479Arr, i4, this.f54348, (Object) null);
        this.f54348 = i3;
        this.f54349[i3] = c10713;
        boolean[] zArr = this.f54354;
        this.f54348 = i4;
        zArr[i3] = false;
        m41617(c10713.f32295, false);
        C23412 c23412 = this.f54351;
        int i5 = c23412.f20007 - 1;
        this.f54352 = i5;
        int i6 = this.f54353;
        this.f54350 = i6;
        this.f54353 = i6 - (c23412.f75185[i5] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41622() {
        m41618();
        return this.f54353;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41619() {
        m41618();
        return this.f54350;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 m41624() {
        m41618();
        return this.f54351.f75184[this.f54352];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41626() {
        m41618();
        return this.f54351.f75185[this.f54352] < 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41618() {
        if (!this.f54347) {
            throw new IllegalStateException("Syntax run cursor has no current item");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41617(AbstractC6479 abstractC6479, boolean z) {
        while (abstractC6479 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC6479;
            AbstractC6479[] abstractC6479Arr = this.f54349;
            int i = this.f54348;
            abstractC6479Arr[i] = c10713;
            boolean[] zArr = this.f54354;
            this.f54348 = i + 1;
            zArr[i] = !z;
            abstractC6479 = z ? c10713.f32295 : c10713.f32294;
        }
        this.f54351 = (C23412) abstractC6479;
    }
}
