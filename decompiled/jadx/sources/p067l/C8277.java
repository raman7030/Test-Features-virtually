package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8277 {

    /* JADX INFO: renamed from: ֫ */
    public int f21918 = 0;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C17441 f21919;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int[] f21920;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ int f21921;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int[] f21922;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ List f21923;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ List f21924;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C17441 f21925;

    public C8277(C17441 c17441, int i, int[] iArr, C17441 c17442, List list, List list2, int[] iArr2) {
        this.f21919 = c17441;
        this.f21921 = i;
        this.f21922 = iArr;
        this.f21925 = c17442;
        this.f21924 = list;
        this.f21923 = list2;
        this.f21920 = iArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19073() {
        m19072(0, this.f21919.size() - 1, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19072(int i, int i2, int i3) {
        int[] iArr = this.f21922;
        int i4 = this.f21921;
        if (i3 != i4) {
            while (i <= i2) {
                iArr[i3] = i;
                i++;
                m19072(i, i2, i3 + 1);
            }
            return;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((C24370) this.f21924.get(this.f21925.getInt(i6))).equals(this.f21923.get(this.f21919.getInt(iArr[i6])))) {
                i5++;
            }
        }
        if (i5 > this.f21918) {
            this.f21918 = i5;
            System.arraycopy(iArr, 0, this.f21920, 0, iArr.length);
        }
    }
}
