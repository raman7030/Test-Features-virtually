package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8WS */
/* JADX INFO: loaded from: classes2.dex */
public class C4615 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f10345;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f10346;

    /* JADX INFO: renamed from: ܽ */
    public final String f10347;

    public C4615(C14677 c14677) {
        this.f10347 = c14677.m33593();
        int iM33580 = c14677.m33580();
        this.f10345 = new ArrayList(iM33580);
        this.f10346 = new ArrayList(iM33580);
        for (int i = 0; i < iM33580; i++) {
            this.f10345.add(c14677.m33593());
            this.f10346.add(AbstractC17354.m39349(c14677));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m9742() {
        return this.f10347;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9740() {
        return this.f10346.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m9743(int i) {
        return (String) this.f10345.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17354 m9741(int i) {
        return (AbstractC17354) this.f10346.get(i);
    }
}
