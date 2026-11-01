package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܶܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16955 {

    /* JADX INFO: renamed from: ۡ */
    public final int f50159;

    /* JADX INFO: renamed from: ۢ */
    public int f50160;

    /* JADX INFO: renamed from: ۧ */
    public final C20310 f50161;

    /* JADX INFO: renamed from: ܳ */
    public final String f50162;

    /* JADX INFO: renamed from: ܺ */
    public final int f50163;

    /* JADX INFO: renamed from: ܽ */
    public C14944 f50164;

    /* JADX INFO: renamed from: ܿ */
    public final int f50165;

    /* JADX INFO: renamed from: ᩳ */
    public final int f50166;

    /* JADX INFO: renamed from: ᩴ */
    public final HashSet f50167;

    /* JADX INFO: renamed from: ᩷ */
    public final int f50168;

    /* JADX INFO: renamed from: ᩻ */
    public final int f50169;

    /* JADX INFO: renamed from: ۜ */
    public final HashMap f50158 = new HashMap();

    /* JADX INFO: renamed from: ۘ */
    public final LinkedHashSet f50157 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f50155 = new ArrayList();

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList f50156 = new ArrayList();

    public C16955(C20310 c20310, int i, String str, int i2, int i3, int i4, int i5, int i6, HashSet hashSet) {
        this.f50161 = c20310;
        this.f50168 = i;
        this.f50162 = str;
        this.f50159 = i2;
        this.f50163 = i3;
        this.f50165 = i4;
        this.f50166 = i5;
        this.f50169 = i6;
        this.f50167 = hashSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38544() {
        C3545 c3545 = new C3545();
        ArrayList arrayList = this.f50155;
        C8150.sort(arrayList, c3545);
        this.f50160 = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = this.f50156;
            if (arrayList2.size() >= this.f50159) {
                return;
            }
            C7569 c7569 = (C7569) arrayList.get(i);
            arrayList2.add(C10962.m25253(this.f50161, c7569.f19840, c7569.f19841, this.f50163, this.f50165, this.f50166, this.f50169, this.f50167, this.f50158));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m38543() {
        ArrayList arrayList = new ArrayList(this.f50157);
        C8150.sort(arrayList, new C10251());
        return arrayList;
    }
}
