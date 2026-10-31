package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0707 extends AbstractViewOnClickListenerC16166 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2681;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f2682;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707(ActivityC21107 activityC21107, ActivityC21107 activityC21108, boolean z) {
        super(activityC21108);
        this.f2682 = activityC21107;
        this.f2681 = z;
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2796(Pattern pattern, String str) {
        ArrayList<C13889> arrayList;
        ActivityC21107 activityC21107 = this.f2682;
        if (!activityC21107.f68093.f56854.isEmpty()) {
            ((C0644) activityC21107.f68093.f56854.peek()).f2493 = activityC21107.f68089.getFirstVisiblePosition();
        }
        if (this.f2681) {
            arrayList = ((C0644) activityC21107.f68093.f56854.peek()).f2492;
        } else {
            arrayList = new ArrayList();
            C7540 c7540M27863 = activityC21107.f68093.f56834.m27863();
            if (c7540M27863 != null) {
                Collections.addAll(arrayList, c7540M27863.m20249());
                Collections.addAll(arrayList, c7540M27863.m20254());
            }
        }
        C0644 c0644 = new C0644();
        c0644.f2494 = str;
        for (C13889 c13889 : arrayList) {
            if (C5584.m15863(c13889, pattern)) {
                c0644.f2492.add(c13889);
            }
        }
        activityC21107.f68093.f56854.push(c0644);
        activityC21107.f68093.f56851 = activityC21107.f68093.m42621();
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2795() {
        ActivityC21107 activityC21107 = this.f2682;
        activityC21107.setTitle(((C0644) activityC21107.f68093.f56854.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_METHOD);
    }
}
