package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8254 extends C9419 {

    /* JADX INFO: renamed from: ۛ֫ */
    public String f21856;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f21857;

    /* JADX INFO: renamed from: ۨ֫ */
    public final ArrayList f21858;

    /* JADX INFO: renamed from: ۫֫ */
    public String f21859;

    /* JADX INFO: renamed from: ۬֫ */
    public String f21860;

    public C8254(EnumC6799 enumC6799, C4726 c4726, int i) {
        super(c4726, C14959.class, i);
        this.f21859 = ": number_of_entries = %d";
        this.f21860 = "n/a";
        this.f21856 = "n/a";
        this.f21858 = new ArrayList(i);
        int i2 = C12278.f34292[enumC6799.ordinal()];
        if (i2 == 1) {
            this.f21857 = c4726.m30956(EnumC16818.f49720.m38127());
            this.f21859 = C22934.m51254(EnumC16818.f49659, new StringBuilder(), ": number_of_entries = %d");
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unexpected value: " + enumC6799);
            }
            this.f21857 = c4726.m30956(EnumC16818.f49706.m38127());
            this.f21859 = C22934.m51254(EnumC16818.f49577, new StringBuilder(), ": number_of_entries = %d");
        }
        this.f21860 = C5410.m11876(this.f21857, "s = %-3d", new StringBuilder("%"));
        this.f21856 = C5410.m11876(this.f21857, "s = %s", new StringBuilder("%"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19045(C14959 c14959, boolean z) {
        c14959.m34253(this.f21857, this.f21860, this.f21856);
        m21916((AbstractC11588) c14959);
        this.f21858.add(Boolean.valueOf(z));
    }

    @Override // p067l.C9419, p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        ArrayList arrayList = this.f25709;
        int size = arrayList.size();
        if (size > 0) {
            ((C14959) arrayList.get(0)).m34255(String.format(this.f21859, Integer.valueOf(arrayList.size() - ((int) C7480.stream(this.f21858).filter(new C14289(0)).count()))));
            mo12285(mo12286());
            for (int i = 0; i < size; i++) {
                C14959 c14959 = (C14959) arrayList.get(i);
                c14959.f32298 = this.f32298;
                c14959.mo6308(i, size);
            }
        }
    }
}
