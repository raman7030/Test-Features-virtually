package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D7NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14450 extends AbstractC12439 {

    /* JADX INFO: renamed from: ۘ */
    public static final C14450 f41281;

    /* JADX INFO: renamed from: ۖ */
    public final List f41282;

    /* JADX INFO: renamed from: ۜ */
    public final List f41283;

    /* JADX INFO: renamed from: ۡ */
    public final Map f41284;

    /* JADX INFO: renamed from: ۢ */
    public final List f41285;

    /* JADX INFO: renamed from: ܳ */
    public final List f41286;

    /* JADX INFO: renamed from: ܺ */
    public final List f41287;

    /* JADX INFO: renamed from: ܿ */
    public final List f41288;

    /* JADX INFO: renamed from: ᩳ */
    public final List f41289;

    /* JADX INFO: renamed from: ᩷ */
    public final List f41290;

    /* JADX INFO: renamed from: ᩻ */
    public final C10307 f41291;

    static {
        List list = Collections.EMPTY_LIST;
        f41281 = new C14450("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C14450(String str, List list, List list2, List list3, List list4, List list5, List list6, C10307 c10307, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C15120) list2.get(i)).f43174;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m33059(list3, arrayList);
        m33059(list4, arrayList);
        m33059(list5, arrayList);
        m33059(list6, arrayList);
        this.f41286 = C21562.unmodifiableList(arrayList);
        this.f41287 = C21562.unmodifiableList(list2);
        this.f41282 = C21562.unmodifiableList(list3);
        this.f41289 = C21562.unmodifiableList(list4);
        this.f41285 = C21562.unmodifiableList(list5);
        this.f41288 = C21562.unmodifiableList(list6);
        this.f41291 = c10307;
        this.f41283 = list7 != null ? C21562.unmodifiableList(list7) : null;
        this.f41284 = C21562.unmodifiableMap(map);
        this.f41290 = C21562.unmodifiableList(list8);
    }

    @Override // p067l.AbstractC12439
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16293(List list) {
        ArrayList arrayListM33058 = m33058(this.f41287, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new C14450(this.f34777, this.f34779, arrayListM33058, list2, m33058(this.f41289, 1, list), m33058(this.f41285, 2, list), list2, this.f41291, this.f41283, this.f34778, this.f41284, this.f41290);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33059(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C5733) list.get(i)).f14044;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m33058(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C17031 c17031 = (C17031) list2.get(i3);
                if (c17031.f50365 == i && c17031.f50364 == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }
}
