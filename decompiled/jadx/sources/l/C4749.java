package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4749 extends AbstractC5455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f15061;

    public C4749(ArrayList arrayList) {
        this.f15061 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4749 m13897(C17714 c17714) {
        int iM41456 = c17714.m41456();
        ArrayList arrayList = new ArrayList(iM41456);
        for (int i = 0; i < iM41456; i++) {
            arrayList.add(C20272.m46529(c17714));
        }
        return new C4749(arrayList);
    }
}
