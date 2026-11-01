package p067l;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1XF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16769 {

    /* JADX INFO: renamed from: ֫ */
    public final C3422 f49420;

    /* JADX INFO: renamed from: ۧ */
    public final List f49421;

    /* JADX INFO: renamed from: ܽ */
    public final List f49422;

    /* JADX INFO: renamed from: ᩳ */
    public final Set f49423;

    public C16769(C2993 c2993, C3349 c3349, C3422 c3422) {
        this.f49420 = c3422;
        this.f49421 = c3422.mo6074();
        List<C18174> listMo6068 = c3422.mo6068();
        this.f49422 = listMo6068;
        HashSet hashSet = new HashSet();
        for (C18174 c18174 : listMo6068) {
            hashSet.add(c18174.f54254);
            hashSet.add(c18174.f54252);
        }
        this.f49423 = C21562.unmodifiableSet(hashSet);
    }
}
