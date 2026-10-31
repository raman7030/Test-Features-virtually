package l;

/* JADX INFO: renamed from: l.۠᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8393 extends C1337 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f25736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21799 f25737;

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21996(int i, int i2) {
        this.f4814 += i2;
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15816(int i, int i2, int i3, boolean z) {
        this.f4814++;
        C21799 c21799 = this.f25737;
        if (c21799.f16031.m10580() && z) {
            this.f4814 = C11166.m27711(i) + this.f4814;
        } else {
            this.f4814 = C11166.m27697(i) + this.f4814;
        }
        if (i2 != -1) {
            int i4 = this.f4814;
            AbstractC5116[] abstractC5116Arr = c21799.f69822;
            int i5 = this.f25736;
            this.f25736 = i5 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr[i5].f16032 + 1) + i4;
        } else {
            this.f4814++;
        }
        if (i3 != -1) {
            int i6 = this.f4814;
            AbstractC5116[] abstractC5116Arr2 = c21799.f69822;
            int i7 = this.f25736;
            this.f25736 = i7 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr2[i7].f16032 + 1) + i6;
            return;
        }
        this.f4814++;
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15815(int i, int i2, int i3, int i4, boolean z) {
        this.f4814++;
        C21799 c21799 = this.f25737;
        if (c21799.f16031.m10580() && z) {
            this.f4814 = C11166.m27711(i) + this.f4814;
        } else {
            this.f4814 = C11166.m27697(i) + this.f4814;
        }
        if (i2 != -1) {
            int i5 = this.f4814;
            AbstractC5116[] abstractC5116Arr = c21799.f69822;
            int i6 = this.f25736;
            this.f25736 = i6 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr[i6].f16032 + 1) + i5;
        } else {
            this.f4814++;
        }
        if (i3 != -1) {
            int i7 = this.f4814;
            AbstractC5116[] abstractC5116Arr2 = c21799.f69822;
            int i8 = this.f25736;
            this.f25736 = i8 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr2[i8].f16032 + 1) + i7;
        } else {
            this.f4814++;
        }
        if (i4 != -1) {
            int i9 = this.f4814;
            AbstractC5116[] abstractC5116Arr3 = c21799.f69822;
            int i10 = this.f25736;
            this.f25736 = i10 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr3[i10].f16032 + 1) + i9;
            return;
        }
        this.f4814++;
    }

    public C8393(C21799 c21799) {
        this.f25737 = c21799;
        this.f4814 = 0;
        this.f25736 = 0;
    }

    @Override // l.C18977
    /* JADX INFO: renamed from: ֫ */
    public final void mo15814(int i) {
        int i2 = this.f4814;
        int i3 = i2 + 1;
        this.f4814 = i3;
        if (i != -1) {
            AbstractC5116[] abstractC5116Arr = this.f25737.f69822;
            int i4 = this.f25736;
            this.f25736 = i4 + 1;
            this.f4814 = C11166.m27697(abstractC5116Arr[i4].f16032 + 1) + i3;
            return;
        }
        this.f4814 = i2 + 2;
    }
}
