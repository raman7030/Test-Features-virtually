package p067l;

/* JADX INFO: renamed from: l.ۖܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C0969 {

    /* JADX INFO: renamed from: ֫ */
    public final C1914 f10891;

    /* JADX INFO: renamed from: ۧ */
    public C1388[] f10892;

    /* JADX INFO: renamed from: ֫ */
    public void mo10133(C1388 c1388) {
    }

    /* JADX INFO: renamed from: ۧ */
    public C1914 mo10134() {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10135(C1388 c1388) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo10136(C1388 c1388) {
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo10137(C1388 c1388) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo10138(C1388 c1388) {
        throw null;
    }

    public C0969() {
        this(new C1914());
    }

    public C0969(C1914 c1914) {
        this.f10891 = c1914;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10132(int i, C1388 c1388) {
        if (this.f10892 == null) {
            this.f10892 = new C1388[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f10892[C1249.m23670(i2)] = c1388;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10131() {
        C1388[] c1388Arr = this.f10892;
        if (c1388Arr != null) {
            C1388 c1388M51163 = c1388Arr[0];
            C1388 c1388M51164 = c1388Arr[1];
            C1914 c1914 = this.f10891;
            if (c1388M51164 == null) {
                c1388M51164 = c1914.m51163(2);
            }
            if (c1388M51163 == null) {
                c1388M51163 = c1914.m51163(1);
            }
            mo10138(C1388.m29405(c1388M51163, c1388M51164));
            C1388 c1388 = this.f10892[C1249.m23670(16)];
            if (c1388 != null) {
                mo10136(c1388);
            }
            C1388 c1389 = this.f10892[C1249.m23670(32)];
            if (c1389 != null) {
                mo10133(c1389);
            }
            C1388 c13810 = this.f10892[C1249.m23670(64)];
            if (c13810 != null) {
                mo10137(c13810);
            }
        }
    }
}
