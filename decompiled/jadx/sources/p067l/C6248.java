package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6248 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f15819;

    /* JADX INFO: renamed from: ۧ */
    public boolean f15822;

    /* JADX INFO: renamed from: ܽ */
    public C19659 f15824;

    /* JADX INFO: renamed from: ܿ */
    public boolean f15825;

    /* JADX INFO: renamed from: ᩳ */
    public final C24729 f15826;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f15823 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f15828 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f15827 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f15820 = new ArrayList();

    /* JADX INFO: renamed from: ۢ */
    public int f15821 = -1;

    public C6248(C24729 c24729) {
        this.f15826 = c24729;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14185(C25123 c25123) {
        this.f15823.add(c25123);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14182(String str) {
        ArrayList arrayList = this.f15828;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14183(String str, C5276 c5276) {
        this.f15827.add(str);
        this.f15820.add(new C22442(str, c5276.f12413, c5276.getMessage()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14186() {
        return this.f15823.size() >= this.f15826.f78283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14184(C19659 c19659) {
        this.f15824 = c19659;
    }
}
