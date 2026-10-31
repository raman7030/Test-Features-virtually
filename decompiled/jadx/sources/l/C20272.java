package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20272 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f65515;

    public C20272(ArrayList arrayList) {
        this.f65515 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20272 m46529(C17714 c17714) {
        c17714.m41479();
        boolean z = (c17714.m41456() & 128) != 0;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            int iM41456 = c17714.m41456();
            boolean z2 = (iM41456 & 64) != 0;
            boolean z3 = (iM41456 & 32) != 0;
            if (z2) {
                c17714.m41479();
            }
            if (!z2) {
                int iM41457 = c17714.m41456();
                arrayList = new ArrayList(iM41457);
                for (int i = 0; i < iM41457; i++) {
                    c17714.m41456();
                    c17714.m41479();
                    arrayList.add(new C22388());
                }
            }
            if (z3) {
                c17714.m41456();
                c17714.m41479();
            }
            c17714.m41464();
            c17714.m41456();
            c17714.m41456();
        }
        return new C20272(arrayList);
    }
}
