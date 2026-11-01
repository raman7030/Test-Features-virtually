package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18542 implements InterfaceC14499 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f55362;

    /* JADX INFO: renamed from: ۜ */
    public int f55363;

    /* JADX INFO: renamed from: ۧ */
    public C15859 f55364;

    /* JADX INFO: renamed from: ܳ */
    public float f55365;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f55366;

    /* JADX INFO: renamed from: ܿ */
    public boolean f55367;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55368;

    /* JADX INFO: renamed from: ᩻ */
    public float f55369;

    public C18542(C19884 c19884, C5112 c5112) {
        ArrayList arrayList = new ArrayList();
        this.f55366 = arrayList;
        this.f55364 = null;
        this.f55367 = false;
        this.f55368 = true;
        this.f55363 = -1;
        if (c5112 == null) {
            return;
        }
        c5112.m10894(this);
        if (this.f55362) {
            this.f55364.m35996((C15859) arrayList.get(this.f55363));
            arrayList.set(this.f55363, this.f55364);
            this.f55362 = false;
        }
        C15859 c15859 = this.f55364;
        if (c15859 != null) {
            arrayList.add(c15859);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m42216() {
        return this.f55366;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10890(float f, float f2) {
        boolean z = this.f55362;
        ArrayList arrayList = this.f55366;
        if (z) {
            this.f55364.m35996((C15859) arrayList.get(this.f55363));
            arrayList.set(this.f55363, this.f55364);
            this.f55362 = false;
        }
        C15859 c15859 = this.f55364;
        if (c15859 != null) {
            arrayList.add(c15859);
        }
        this.f55365 = f;
        this.f55369 = f2;
        this.f55364 = new C15859(f, f2, 0.0f, 0.0f);
        this.f55363 = arrayList.size();
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ۧ */
    public final void mo10895(float f, float f2) {
        this.f55364.m35995(f, f2);
        this.f55366.add(this.f55364);
        C15859 c15859 = this.f55364;
        this.f55364 = new C15859(f, f2, f - c15859.f45938, f2 - c15859.f45937);
        this.f55362 = false;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10892(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f55368 || this.f55367) {
            this.f55364.m35995(f, f2);
            this.f55366.add(this.f55364);
            this.f55367 = false;
        }
        this.f55364 = new C15859(f5, f6, f5 - f3, f6 - f4);
        this.f55362 = false;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10891(float f, float f2, float f3, float f4) {
        this.f55364.m35995(f, f2);
        this.f55366.add(this.f55364);
        this.f55364 = new C15859(f3, f4, f3 - f, f4 - f2);
        this.f55362 = false;
    }

    @Override // p067l.InterfaceC14499
    /* JADX INFO: renamed from: ֫ */
    public final void mo10893(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f55367 = true;
        this.f55368 = false;
        C15859 c15859 = this.f55364;
        C19884.m45136(c15859.f45938, c15859.f45937, f, f2, f3, z, z2, f4, f5, this);
        this.f55368 = true;
        this.f55362 = false;
    }

    @Override // p067l.InterfaceC14499
    public final void close() {
        this.f55366.add(this.f55364);
        mo10895(this.f55365, this.f55369);
        this.f55362 = true;
    }
}
