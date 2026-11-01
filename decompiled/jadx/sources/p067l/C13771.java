package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۨ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13771 extends AbstractC14618 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f38930;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC22429 f38931;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13771(ActivityC22429 activityC22429, ActivityC22429 activityC224210, boolean z) {
        super(R.layout.MT_Protector, activityC224210, "dex_search_type_constant");
        this.f38931 = activityC22429;
        this.f38930 = z;
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19589(String str, String str2, boolean z) {
        ArrayList<C15568> arrayList;
        C2981 c2981;
        ActivityC22429 activityC22429 = this.f38931;
        if (!activityC22429.f70775.f60071.isEmpty()) {
            ((C2981) activityC22429.f70775.f60071.peek()).f5265 = activityC22429.f70771.getFirstVisiblePosition();
        }
        if (this.f38930) {
            arrayList = ((C2981) activityC22429.f70775.f60071.peek()).f5264;
        } else {
            arrayList = new ArrayList();
            C9534 c9534M29924 = activityC22429.f70775.f60051.m29924();
            if (c9534M29924 != null) {
                Collections.addAll(arrayList, c9534M29924.m22225());
                Collections.addAll(arrayList, c9534M29924.m22230());
            }
        }
        if (!z) {
            c2981 = new C2981();
            c2981.f5266 = str2;
            try {
                long j = Long.parseLong(str);
                for (C15568 c15568 : arrayList) {
                    if (C7676.m17776(c15568, j)) {
                        c2981.f5264.add(c15568);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c2981 = new C2981();
            c2981.f5266 = str2;
            String lowerCase = str.toLowerCase();
            for (C15568 c15569 : arrayList) {
                if (C7676.m17777(c15569, lowerCase)) {
                    c2981.f5264.add(c15569);
                }
            }
        }
        activityC22429.f70775.f60071.push(c2981);
        activityC22429.f70775.f60068 = activityC22429.f70775.m44881();
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19588() {
        ActivityC22429 activityC22429 = this.f38931;
        activityC22429.setTitle(((C2981) activityC22429.f70775.f60071.peek()).f5266);
        activityC22429.m50379(EnumC9017.SEARCH_RESULT_METHOD);
    }
}
