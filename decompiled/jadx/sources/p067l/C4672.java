package p067l;

import bin.p000mt.json.JSON;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4672 {

    /* JADX INFO: renamed from: ֫ */
    public List f10505;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f10506;

    /* JADX INFO: renamed from: ܽ */
    public int f10507;

    /* JADX INFO: renamed from: ܿ */
    public final C14362 f10508;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f10509;

    public /* synthetic */ C4672(AbstractC17043 abstractC17043, C14362 c14362, int i) {
        this(abstractC17043, c14362);
    }

    public C4672(AbstractC17043 abstractC17043) {
        this(abstractC17043, null);
    }

    public C4672(AbstractC17043 abstractC17043, C14362 c14362) {
        this.f10506 = abstractC17043;
        this.f10508 = c14362;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9903(C4672 c4672, List list, String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM4094 = C2659.m4094(c4672, (C14362) it.next(), str, str2);
            if (!hashSet.add(strM4094)) {
                throw C2659.m4079("FILE_STORAGE_ERROR", "The backend returned a duplicate directory child.", str, str2, "list_directory", "duplicate_child", "non_atomic", JSON.array(), strM4094, "list_directory");
            }
        }
        c4672.f10505 = list;
        c4672.f10507 = 0;
        c4672.f10509 = true;
    }
}
