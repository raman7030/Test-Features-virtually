package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D7NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12712 extends AbstractC10596 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C12712 f38252;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f38253;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f38254;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Map f38255;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f38256;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f38257;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f38258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f38259;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f38260;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f38261;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8353 f38262;

    static {
        List list = Collections.EMPTY_LIST;
        f38252 = new C12712("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C12712(String str, List list, List list2, List list3, List list4, List list5, List list6, C8353 c8353, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C13417) list2.get(i)).f40105;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m30981(list3, arrayList);
        m30981(list4, arrayList);
        m30981(list5, arrayList);
        m30981(list6, arrayList);
        this.f38257 = C20195.unmodifiableList(arrayList);
        this.f38258 = C20195.unmodifiableList(list2);
        this.f38253 = C20195.unmodifiableList(list3);
        this.f38260 = C20195.unmodifiableList(list4);
        this.f38256 = C20195.unmodifiableList(list5);
        this.f38259 = C20195.unmodifiableList(list6);
        this.f38262 = c8353;
        this.f38254 = list7 != null ? C20195.unmodifiableList(list7) : null;
        this.f38255 = C20195.unmodifiableMap(map);
        this.f38261 = C20195.unmodifiableList(list8);
    }

    @Override // l.AbstractC10596
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14390(List list) {
        ArrayList arrayListM30980 = m30980(this.f38258, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new C12712(this.f31806, this.f31808, arrayListM30980, list2, m30980(this.f38260, 1, list), m30980(this.f38256, 2, list), list2, this.f38262, this.f38254, this.f31807, this.f38255, this.f38261);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30981(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C3540) list.get(i)).f11238;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m30980(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C15428 c15428 = (C15428) list2.get(i3);
                if (c15428.f47236 == i && c15428.f47235 == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }
}
