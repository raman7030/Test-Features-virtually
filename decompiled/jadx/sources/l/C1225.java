package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f4391;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15335 f4392;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 f4393;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15068 f4394;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f4395;

    public C1225(C15068 c15068, AbstractC9693 abstractC9693, List list, C15335 c15335) {
        this.f4394 = c15068;
        this.f4393 = abstractC9693;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f4395 = C20195.unmodifiableList(arrayList);
        this.f4391 = new int[list.size()];
        this.f4392 = c15335;
    }
}
