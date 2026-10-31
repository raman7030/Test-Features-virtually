package l;

import bin.mt.json.JSON;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2424 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f7714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f7715;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7716;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12619 f7717;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f7718;

    public /* synthetic */ C2424(AbstractC15440 abstractC15440, C12619 c12619, int i) {
        this(abstractC15440, c12619);
    }

    public C2424(AbstractC15440 abstractC15440) {
        this(abstractC15440, null);
    }

    public C2424(AbstractC15440 abstractC15440, C12619 c12619) {
        this.f7715 = abstractC15440;
        this.f7717 = c12619;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7855(C2424 c2424, List list, String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM1696 = C0306.m1696(c2424, (C12619) it.next(), str, str2);
            if (!hashSet.add(strM1696)) {
                throw C0306.m1681("FILE_STORAGE_ERROR", "The backend returned a duplicate directory child.", str, str2, "list_directory", "duplicate_child", "non_atomic", JSON.array(), strM1696, "list_directory");
            }
        }
        c2424.f7714 = list;
        c2424.f7716 = 0;
        c2424.f7718 = true;
    }
}
