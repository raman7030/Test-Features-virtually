package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes4.dex */
public final class C17439 implements InterfaceC15602 {

    /* JADX INFO: renamed from: ۖ */
    public boolean f52125;

    /* JADX INFO: renamed from: ۜ */
    public final C23318 f52127;

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC15602 f52128;

    /* JADX INFO: renamed from: ۢ */
    public long f52129;

    /* JADX INFO: renamed from: ۧ */
    public final C11406 f52130;

    /* JADX INFO: renamed from: ܳ */
    public boolean f52131;

    /* JADX INFO: renamed from: ܽ */
    public final C23318 f52133;

    /* JADX INFO: renamed from: ܿ */
    public final C23318 f52134;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f52135;

    /* JADX INFO: renamed from: ᩴ */
    public final int f52136;

    /* JADX INFO: renamed from: ᩵ */
    public final int f52137;

    /* JADX INFO: renamed from: ᩷ */
    public long f52138;

    /* JADX INFO: renamed from: ᩻ */
    public final int f52139;

    /* JADX INFO: renamed from: ܺ */
    public C10735[] f52132 = new C10735[8];

    /* JADX INFO: renamed from: ۘ */
    public int f52126 = 1;

    /* JADX INFO: renamed from: ֫ */
    public int f52124 = -1;

    /* JADX INFO: renamed from: ֫ */
    public static C17439 m39718(int i, int i2, int i3, InterfaceC15602 interfaceC15602, C11406 c11406) {
        C12826.requireNonNull(c11406, "budget");
        if (c11406.m26379()) {
            return new C17439(i, i2, i3, interfaceC15602, c11406);
        }
        return null;
    }

    public C17439(int i, int i2, int i3, InterfaceC15602 interfaceC15602, C11406 c11406) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("End search starts outside the document");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Non-positive end search stride");
        }
        this.f52137 = i;
        this.f52139 = i2;
        this.f52128 = interfaceC15602;
        this.f52130 = c11406;
        if (!c11406.m26380()) {
            throw new IllegalStateException("End search proof budget exhausted");
        }
        long j = i2;
        long j2 = ((long) i) - j;
        int iMax = (int) Math.max(i3, j2 == 0 ? 1L : (j2 + 1022) / 1023);
        this.f52136 = iMax;
        this.f52134 = new C23318(i);
        this.f52127 = new C23318(i);
        this.f52133 = new C23318(i);
        this.f52132[0] = new C10735(i2, new C23318(i).m51939());
        this.f52138 = j;
        this.f52129 = j + ((long) iMax);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39721(int i) {
        int i2;
        if (this.f52131 || this.f52135) {
            throw new IllegalStateException("End search candidate is already active or finished");
        }
        if (i != this.f52138 || i < this.f52139 || i > (i2 = this.f52137)) {
            throw new IllegalArgumentException("End search candidates are not contiguous");
        }
        C23318 c23318 = this.f52133;
        c23318.m51940(i2);
        c23318.m51935(i);
        this.f52124 = i;
        this.f52135 = true;
        InterfaceC15602 interfaceC15602 = this.f52128;
        if (interfaceC15602 != null) {
            ((C17439) interfaceC15602).m39725(i);
        }
        if (i == i2) {
            c23318.m51934();
            if (interfaceC15602 != null) {
                ((C17439) interfaceC15602).m39720();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39723(boolean z) {
        if (!this.f52135) {
            throw new IllegalStateException("No active end search candidate");
        }
        int i = this.f52124;
        int i2 = this.f52137;
        C23318 c23318 = this.f52133;
        if (!z && i != i2) {
            int i3 = i + 1;
            c23318.m51935(i3);
            InterfaceC15602 interfaceC15602 = this.f52128;
            if (interfaceC15602 != null) {
                ((C17439) interfaceC15602).m39725(i3);
            }
        }
        this.f52127.m51938(c23318);
        C23318 c23319 = this.f52134;
        if (!z) {
            c23319.m51938(c23318);
        }
        this.f52135 = false;
        this.f52124 = -1;
        if (z) {
            this.f52131 = true;
            return;
        }
        if (i == i2) {
            this.f52138 = ((long) i2) + 1;
            this.f52131 = true;
            return;
        }
        int i4 = i + 1;
        long j = i4;
        this.f52138 = j;
        if (j >= this.f52129) {
            if (this.f52126 < 1024) {
                C11406 c11406 = this.f52130;
                if (c11406.m26379()) {
                    C21307 c21307M51939 = c23319.m51939();
                    if (this.f52126 != 1024 && c11406.m26380()) {
                        int i5 = this.f52126;
                        C10735[] c10735Arr = this.f52132;
                        if (i5 == c10735Arr.length) {
                            this.f52132 = (C10735[]) Arrays.copyOf(this.f52132, Math.min(1024, c10735Arr.length << 1));
                        }
                        C10735[] c10735Arr2 = this.f52132;
                        int i6 = this.f52126;
                        this.f52126 = i6 + 1;
                        c10735Arr2[i6] = new C10735(i4, c21307M51939);
                    }
                }
            }
            this.f52129 = j + ((long) this.f52136);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21307 m39724() {
        m39719();
        if (this.f52135) {
            throw new IllegalStateException("End search candidate is still active");
        }
        return this.f52127.m51939();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10735 m39728(int i) {
        m39719();
        if (i < this.f52139 || i > this.f52137) {
            throw new IllegalArgumentException("End search proof offset is outside the trace");
        }
        int i2 = this.f52126 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f52132[i4].f29732 <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return this.f52132[i2];
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m39727(int i) {
        m39719();
        return i >= this.f52139 && i <= this.f52137;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39726() {
        if (this.f52125) {
            return;
        }
        Arrays.fill(this.f52132, 0, this.f52126, (Object) null);
        this.f52130.m26378(this.f52126);
        this.f52126 = 0;
        this.f52125 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39720() {
        m39719();
        if (this.f52135) {
            this.f52133.m51934();
            InterfaceC15602 interfaceC15602 = this.f52128;
            if (interfaceC15602 != null) {
                ((C17439) interfaceC15602).m39720();
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39722(int i, int i2) {
        m39719();
        if (this.f52135) {
            this.f52133.m51936(i, i2);
            InterfaceC15602 interfaceC15602 = this.f52128;
            if (interfaceC15602 != null) {
                ((C17439) interfaceC15602).m39722(i, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39725(int i) {
        m39719();
        if (this.f52135) {
            this.f52133.m51935(i);
            InterfaceC15602 interfaceC15602 = this.f52128;
            if (interfaceC15602 != null) {
                ((C17439) interfaceC15602).m39725(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m39719() {
        if (this.f52125) {
            throw new IllegalStateException("End search trace has been released");
        }
    }
}
