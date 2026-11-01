package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9777 {

    /* JADX INFO: renamed from: ֫ */
    public int f27005;

    /* JADX INFO: renamed from: ۧ */
    public int f27006;

    /* JADX INFO: renamed from: ܽ */
    public C15811[] f27007 = new C15811[16];

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C3940 f27008;

    public C9777(C3940 c3940) {
        this.f27008 = c3940;
        int i = 0;
        while (true) {
            C15811[] c15811Arr = this.f27007;
            if (i < c15811Arr.length) {
                c15811Arr[i] = new C15811();
                i++;
            } else {
                this.f27005 = 0;
                this.f27006 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15811 m22804(int i) throws C18080, C24529 {
        this.f27005--;
        int i2 = this.f27006;
        int i3 = i2 + 1;
        this.f27006 = i3;
        C15811[] c15811Arr = this.f27007;
        if (i3 == c15811Arr.length) {
            this.f27006 = 0;
        }
        C15811 c15811 = c15811Arr[i2];
        if (c15811.f45778 == i) {
            c15811.f45778 = 0;
            return c15811;
        }
        long j = C14849.FOREVER_NS;
        for (C15811 c15812 : c15811Arr) {
            if (c15812.f45778 != 0) {
                long j2 = c15812.f45780;
                if (j > j2) {
                    j = j2;
                }
            }
        }
        for (C15811 c15813 : c15811Arr) {
            if (c15813.f45778 == i) {
                c15813.f45778 = 0;
                C24529 c24529 = new C24529();
                c24529.f77690 = j;
                throw c24529;
            }
        }
        throw new C18080(4, C20778.m46922(i, "RequestQueue: unknown request id "));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22805(C17823 c17823, C8436 c8436) throws IOException {
        int i = this.f27005;
        for (int i2 = 0; i2 < i; i2++) {
            C3940 c3940 = this.f27008;
            c3940.m7795(c17823, c8436);
            int i3 = c8436.f22620;
            int i4 = 0;
            while (true) {
                C15811[] c15811Arr = this.f27007;
                if (i4 >= c15811Arr.length) {
                    break;
                }
                C15811 c15811 = c15811Arr[i4];
                if (c15811.f45778 == c8436.f22621) {
                    c15811.f45778 = 0;
                    break;
                }
                i4++;
            }
            C3940.m7787(c3940, i3);
        }
        this.f27005 = 0;
        this.f27006 = 0;
    }
}
