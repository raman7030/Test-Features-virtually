package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6217 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19055 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15859 f19056;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f19057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19058;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f19059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f19060;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f19061;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15859 f19062;

    public C6217(C15859 c15859, int i, int[] iArr, C15859 c158510, List list, List list2, int[] iArr2) {
        this.f19056 = c15859;
        this.f19058 = i;
        this.f19059 = iArr;
        this.f19062 = c158510;
        this.f19061 = list;
        this.f19060 = list2;
        this.f19057 = iArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17141() {
        m17140(0, this.f19056.size() - 1, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17140(int i, int i2, int i3) {
        int[] iArr = this.f19059;
        int i4 = this.f19058;
        if (i3 != i4) {
            while (i <= i2) {
                iArr[i3] = i;
                i++;
                m17140(i, i2, i3 + 1);
            }
            return;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((C23150) this.f19061.get(this.f19062.getInt(i6))).equals(this.f19060.get(this.f19056.getInt(iArr[i6])))) {
                i5++;
            }
        }
        if (i5 > this.f19055) {
            this.f19055 = i5;
            System.arraycopy(iArr, 0, this.f19057, 0, iArr.length);
        }
    }
}
