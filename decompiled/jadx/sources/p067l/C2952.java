package p067l;

/* JADX INFO: renamed from: l.֡᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2952 {

    /* JADX INFO: renamed from: ֫ */
    public C20388[] f5142 = new C20388[16];

    /* JADX INFO: renamed from: ۧ */
    public C18375 f5143;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC6544 f5144;

    public C2952() {
        int i = 0;
        while (true) {
            C20388[] c20388Arr = this.f5142;
            if (i >= c20388Arr.length) {
                return;
            }
            c20388Arr[i] = new C20388(this, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4885(C9226 c9226, AbstractC23740 abstractC23740) {
        this.f5144 = c9226;
        if (this.f5143 == null) {
            C18375 c18375 = new C18375();
            C10309 c10309 = new C10309("InputA");
            c18375.f54880 = c10309;
            c18375.m55058(c10309);
            C10309 c103010 = new C10309("InputB");
            c18375.f54881 = c103010;
            c18375.m55058(c103010);
            C17013 c17013 = new C17013("OutputB");
            c18375.f54879 = c17013;
            c18375.m55058(c17013);
            this.f5143 = c18375;
            c9226.m21255(c18375);
        }
        C21059 c21059 = new C21059(this, 64, abstractC23740);
        for (int i = 0; i < 16; i++) {
            this.f5142[i].m46037(c21059);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4883(int i, int i2) {
        this.f5142[i].m46039(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4884(int i, int i2, int i3) {
        this.f5142[i].m46035(i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4887(int i, int i2, int i3) {
        this.f5142[i].m46036(i2, ((double) i3) * 0.007874015748031496d * 0.25d);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4889(int i, double d) {
        this.f5142[i].m46041(d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4882(int i, double d) {
        this.f5142[i].m46034(d);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4891(int i, double d) {
        this.f5142[i].m46043(d);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m4888(int i, double d) {
        this.f5142[i].m46040(d);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m4890(int i, double d) {
        this.f5142[i].m46042(d);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m4892(int i, double d) {
        this.f5142[i].m46044(d);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4886(int i, double d) {
        this.f5142[i].m46038(d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17013 m4881() {
        return this.f5143.f54879;
    }
}
