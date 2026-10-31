package l;

/* JADX INFO: renamed from: l.ܶ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15447 extends C18977 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f47302 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21799 f47303;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1547 f47304;

    public C15447(C21799 c21799, C1547 c1547) {
        this.f47303 = c21799;
        this.f47304 = c1547;
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo21996(int i, int i2) {
        this.f47304.m5298(this.f47303.f69821, i, i2);
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15816(int i, int i2, int i3, boolean z) {
        byte b = EnumC0631.DBG_START_LOCAL.f2424;
        C1547 c1547 = this.f47304;
        c1547.m5300(b);
        C21799 c21799 = this.f47303;
        if (c21799.f16031.m10580() && z) {
            c1547.m5303(i);
        } else {
            c1547.m5301(i);
        }
        if (i2 != -1) {
            AbstractC5116[] abstractC5116Arr = c21799.f69822;
            int i4 = this.f47302;
            this.f47302 = i4 + 1;
            c1547.m5301(abstractC5116Arr[i4].f16032 + 1);
        } else {
            c1547.m5300(0);
        }
        if (i3 != -1) {
            AbstractC5116[] abstractC5116Arr2 = c21799.f69822;
            int i5 = this.f47302;
            this.f47302 = i5 + 1;
            c1547.m5301(abstractC5116Arr2[i5].f16032 + 1);
            return;
        }
        c1547.m5300(0);
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15815(int i, int i2, int i3, int i4, boolean z) {
        byte b = EnumC0631.DBG_START_LOCAL_EXTENDED.f2424;
        C1547 c1547 = this.f47304;
        c1547.m5300(b);
        C21799 c21799 = this.f47303;
        if (c21799.f16031.m10580() && z) {
            c1547.m5303(i);
        } else {
            c1547.m5301(i);
        }
        if (i2 != -1) {
            AbstractC5116[] abstractC5116Arr = c21799.f69822;
            int i5 = this.f47302;
            this.f47302 = i5 + 1;
            c1547.m5301(abstractC5116Arr[i5].f16032 + 1);
        } else {
            c1547.m5300(0);
        }
        if (i3 != -1) {
            AbstractC5116[] abstractC5116Arr2 = c21799.f69822;
            int i6 = this.f47302;
            this.f47302 = i6 + 1;
            c1547.m5301(abstractC5116Arr2[i6].f16032 + 1);
        } else {
            c1547.m5300(0);
        }
        if (i4 != -1) {
            AbstractC5116[] abstractC5116Arr3 = c21799.f69822;
            int i7 = this.f47302;
            this.f47302 = i7 + 1;
            c1547.m5301(abstractC5116Arr3[i7].f16032 + 1);
            return;
        }
        c1547.m5300(0);
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15814(int i) {
        byte b = EnumC0631.DBG_SET_FILE.f2424;
        C1547 c1547 = this.f47304;
        c1547.m5300(b);
        if (i != -1) {
            AbstractC5116[] abstractC5116Arr = this.f47303.f69822;
            int i2 = this.f47302;
            this.f47302 = i2 + 1;
            c1547.m5301(abstractC5116Arr[i2].f16032 + 1);
            return;
        }
        c1547.m5300(0);
    }
}
