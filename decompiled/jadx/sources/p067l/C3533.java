package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3533 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f7161;

    /* JADX INFO: renamed from: ۧ */
    public final C16943 f7162;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC11581 f7163;

    /* JADX INFO: renamed from: ܿ */
    public final C16689 f7164;

    /* JADX INFO: renamed from: ᩳ */
    public final List f7165;

    public C3533(C16689 c16689, AbstractC11581 abstractC11581, List list, C16943 c16943) {
        this.f7164 = c16689;
        this.f7163 = abstractC11581;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f7165 = C21562.unmodifiableList(arrayList);
        this.f7161 = new int[list.size()];
        this.f7162 = c16943;
    }
}
