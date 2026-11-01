package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3041 extends AbstractViewOnClickListenerC17733 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean f5454;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ActivityC22429 f5455;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3041(ActivityC22429 activityC22429, ActivityC22429 activityC224210, boolean z) {
        super(activityC224210);
        this.f5455 = activityC22429;
        this.f5454 = z;
    }

    @Override // p067l.AbstractViewOnClickListenerC17733
    /* JADX INFO: renamed from: ֫ */
    public final void mo5141(Pattern pattern, String str) {
        ArrayList<C15568> arrayList;
        ActivityC22429 activityC22429 = this.f5455;
        if (!activityC22429.f70775.f60071.isEmpty()) {
            ((C2981) activityC22429.f70775.f60071.peek()).f5265 = activityC22429.f70771.getFirstVisiblePosition();
        }
        if (this.f5454) {
            arrayList = ((C2981) activityC22429.f70775.f60071.peek()).f5264;
        } else {
            arrayList = new ArrayList();
            C9534 c9534M29924 = activityC22429.f70775.f60051.m29924();
            if (c9534M29924 != null) {
                Collections.addAll(arrayList, c9534M29924.m22225());
                Collections.addAll(arrayList, c9534M29924.m22230());
            }
        }
        C2981 c2981 = new C2981();
        c2981.f5266 = str;
        for (C15568 c15568 : arrayList) {
            if (C7676.m17778(c15568, pattern)) {
                c2981.f5264.add(c15568);
            }
        }
        activityC22429.f70775.f60071.push(c2981);
        activityC22429.f70775.f60068 = activityC22429.f70775.m44881();
    }

    @Override // p067l.AbstractViewOnClickListenerC17733
    /* JADX INFO: renamed from: ֫ */
    public final void mo5140() {
        ActivityC22429 activityC22429 = this.f5455;
        activityC22429.setTitle(((C2981) activityC22429.f70775.f60071.peek()).f5266);
        activityC22429.m50379(EnumC9017.SEARCH_RESULT_METHOD);
    }
}
