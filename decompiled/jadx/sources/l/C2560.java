package l;

/* JADX INFO: renamed from: l.ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C2560 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21610 f8101;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11007[] f8102;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8101(C11007 c11007) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21610 mo8102() {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo8103(C11007 c11007) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo8104(C11007 c11007) {
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo8105(C11007 c11007) {
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo8106(C11007 c11007) {
        throw null;
    }

    public C2560() {
        this(new C21610());
    }

    public C2560(C21610 c21610) {
        this.f8101 = c21610;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8100(int i, C11007 c11007) {
        if (this.f8102 == null) {
            this.f8102 = new C11007[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f8102[C8204.m21701(i2)] = c11007;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8099() {
        C11007[] c11007Arr = this.f8102;
        if (c11007Arr != null) {
            C11007 c11007M48815 = c11007Arr[0];
            C11007 c11007M48816 = c11007Arr[1];
            C21610 c21610 = this.f8101;
            if (c11007M48816 == null) {
                c11007M48816 = c21610.m48815(2);
            }
            if (c11007M48815 == null) {
                c11007M48815 = c21610.m48815(1);
            }
            mo8106(C11007.m27343(c11007M48815, c11007M48816));
            C11007 c11007 = this.f8102[C8204.m21701(16)];
            if (c11007 != null) {
                mo8104(c11007);
            }
            C11007 c11008 = this.f8102[C8204.m21701(32)];
            if (c11008 != null) {
                mo8101(c11008);
            }
            C11007 c11009 = this.f8102[C8204.m21701(64)];
            if (c11009 != null) {
                mo8105(c11009);
            }
        }
    }
}
