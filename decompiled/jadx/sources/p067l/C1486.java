package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬۠ */
/* JADX INFO: compiled from: W1DE */
/* JADX INFO: loaded from: classes4.dex */
public class C1486 extends C1591 {

    /* JADX INFO: renamed from: ᩺֫ */
    public C1591[] f41928 = new C1591[4];

    /* JADX INFO: renamed from: ܰ֫ */
    public int f41927 = 0;

    /* JADX INFO: renamed from: ᩻֫ */
    public void mo27538() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33628(C1591 c1591) {
        if (c1591 == this || c1591 == null) {
            return;
        }
        int i = this.f41927 + 1;
        C1591[] c1591Arr = this.f41928;
        if (i > c1591Arr.length) {
            this.f41928 = (C1591[]) Arrays.copyOf(c1591Arr, c1591Arr.length * 2);
        }
        C1591[] c1591Arr2 = this.f41928;
        int i2 = this.f41927;
        c1591Arr2[i2] = c1591;
        this.f41927 = i2 + 1;
    }

    @Override // p067l.C1591
    /* JADX INFO: renamed from: ֫ */
    public void mo9821(C1591 c1591, HashMap map) {
        super.mo9821(c1591, map);
        C1486 c1486 = (C1486) c1591;
        this.f41927 = 0;
        int i = c1486.f41927;
        for (int i2 = 0; i2 < i; i2++) {
            m33628((C1591) map.get(c1486.f41928[i2]));
        }
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final void m33629() {
        this.f41927 = 0;
        Arrays.fill(this.f41928, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33627(int i, C0866 c0866, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f41927; i2++) {
            c0866.m4506(this.f41928[i2]);
        }
        for (int i3 = 0; i3 < this.f41927; i3++) {
            C1181.m20465(this.f41928[i3], i, arrayList, c0866);
        }
    }
}
