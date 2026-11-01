package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6882 extends AbstractC7553 {

    /* JADX INFO: renamed from: ֫ */
    public final List f17892;

    public C6882(ArrayList arrayList) {
        this.f17892 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6882 m15777(C19203 c19203) {
        int iM43702 = c19203.m43702();
        ArrayList arrayList = new ArrayList(iM43702);
        for (int i = 0; i < iM43702; i++) {
            arrayList.add(C21635.m48851(c19203));
        }
        return new C6882(arrayList);
    }
}
