package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15857 implements InterfaceC13924 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48987;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22043 f48989;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13924 f48990;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f48991;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9509 f48992;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48993;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22043 f48995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22043 f48996;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48997;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f48998;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f48999;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f49000;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f49001;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8803[] f48994 = new C8803[8];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f48988 = 1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48986 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15857 m37546(int i, int i2, int i3, InterfaceC13924 interfaceC13924, C9509 c9509) {
        C11003.requireNonNull(c9509, "budget");
        if (c9509.m24369()) {
            return new C15857(i, i2, i3, interfaceC13924, c9509);
        }
        return null;
    }

    public C15857(int i, int i2, int i3, InterfaceC13924 interfaceC13924, C9509 c9509) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("End search starts outside the document");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Non-positive end search stride");
        }
        this.f48999 = i;
        this.f49001 = i2;
        this.f48990 = interfaceC13924;
        this.f48992 = c9509;
        if (!c9509.m24370()) {
            throw new IllegalStateException("End search proof budget exhausted");
        }
        long j = i2;
        long j2 = ((long) i) - j;
        int iMax = (int) Math.max(i3, j2 == 0 ? 1L : (j2 + 1022) / 1023);
        this.f48998 = iMax;
        this.f48996 = new C22043(i);
        this.f48989 = new C22043(i);
        this.f48995 = new C22043(i);
        this.f48994[0] = new C8803(i2, new C22043(i).m49603());
        this.f49000 = j;
        this.f48991 = j + ((long) iMax);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37549(int i) {
        int i2;
        if (this.f48993 || this.f48997) {
            throw new IllegalStateException("End search candidate is already active or finished");
        }
        if (i != this.f49000 || i < this.f49001 || i > (i2 = this.f48999)) {
            throw new IllegalArgumentException("End search candidates are not contiguous");
        }
        C22043 c22043 = this.f48995;
        c22043.m49604(i2);
        c22043.m49599(i);
        this.f48986 = i;
        this.f48997 = true;
        InterfaceC13924 interfaceC13924 = this.f48990;
        if (interfaceC13924 != null) {
            ((C15857) interfaceC13924).m37553(i);
        }
        if (i == i2) {
            c22043.m49598();
            if (interfaceC13924 != null) {
                ((C15857) interfaceC13924).m37548();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37551(boolean z) {
        if (!this.f48997) {
            throw new IllegalStateException("No active end search candidate");
        }
        int i = this.f48986;
        int i2 = this.f48999;
        C22043 c22043 = this.f48995;
        if (!z && i != i2) {
            int i3 = i + 1;
            c22043.m49599(i3);
            InterfaceC13924 interfaceC13924 = this.f48990;
            if (interfaceC13924 != null) {
                ((C15857) interfaceC13924).m37553(i3);
            }
        }
        this.f48989.m49602(c22043);
        C22043 c22044 = this.f48996;
        if (!z) {
            c22044.m49602(c22043);
        }
        this.f48997 = false;
        this.f48986 = -1;
        if (z) {
            this.f48993 = true;
            return;
        }
        if (i == i2) {
            this.f49000 = ((long) i2) + 1;
            this.f48993 = true;
            return;
        }
        int i4 = i + 1;
        long j = i4;
        this.f49000 = j;
        if (j >= this.f48991) {
            if (this.f48988 < 1024) {
                C9509 c9509 = this.f48992;
                if (c9509.m24369()) {
                    C19927 c19927M49603 = c22044.m49603();
                    if (this.f48988 != 1024 && c9509.m24370()) {
                        int i5 = this.f48988;
                        C8803[] c8803Arr = this.f48994;
                        if (i5 == c8803Arr.length) {
                            this.f48994 = (C8803[]) Arrays.copyOf(this.f48994, Math.min(1024, c8803Arr.length << 1));
                        }
                        C8803[] c8803Arr2 = this.f48994;
                        int i6 = this.f48988;
                        this.f48988 = i6 + 1;
                        c8803Arr2[i6] = new C8803(i4, c19927M49603);
                    }
                }
            }
            this.f48991 = j + ((long) this.f48998);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m37552() {
        m37547();
        if (this.f48997) {
            throw new IllegalStateException("End search candidate is still active");
        }
        return this.f48989.m49603();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8803 m37556(int i) {
        m37547();
        if (i < this.f49001 || i > this.f48999) {
            throw new IllegalArgumentException("End search proof offset is outside the trace");
        }
        int i2 = this.f48988 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f48994[i4].f26807 <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return this.f48994[i2];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37555(int i) {
        m37547();
        return i >= this.f49001 && i <= this.f48999;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37554() {
        if (this.f48987) {
            return;
        }
        Arrays.fill(this.f48994, 0, this.f48988, (Object) null);
        this.f48992.m24368(this.f48988);
        this.f48988 = 0;
        this.f48987 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37548() {
        m37547();
        if (this.f48997) {
            this.f48995.m49598();
            InterfaceC13924 interfaceC13924 = this.f48990;
            if (interfaceC13924 != null) {
                ((C15857) interfaceC13924).m37548();
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37550(int i, int i2) {
        m37547();
        if (this.f48997) {
            this.f48995.m49600(i, i2);
            InterfaceC13924 interfaceC13924 = this.f48990;
            if (interfaceC13924 != null) {
                ((C15857) interfaceC13924).m37550(i, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37553(int i) {
        m37547();
        if (this.f48997) {
            this.f48995.m49599(i);
            InterfaceC13924 interfaceC13924 = this.f48990;
            if (interfaceC13924 != null) {
                ((C15857) interfaceC13924).m37553(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m37547() {
        if (this.f48987) {
            throw new IllegalStateException("End search trace has been released");
        }
    }
}
