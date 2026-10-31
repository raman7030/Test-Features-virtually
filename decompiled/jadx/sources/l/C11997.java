package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۨ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11997 extends AbstractC12889 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35920;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f35921;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11997(ActivityC21107 activityC21107, ActivityC21107 activityC21108, boolean z) {
        super(R.layout.MT_Protector, activityC21108, "dex_search_type_constant");
        this.f35921 = activityC21107;
        this.f35920 = z;
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫ */
    public final void mo17649(String str, String str2, boolean z) {
        ArrayList<C13889> arrayList;
        C0644 c0644;
        ActivityC21107 activityC21107 = this.f35921;
        if (!activityC21107.f68093.f56854.isEmpty()) {
            ((C0644) activityC21107.f68093.f56854.peek()).f2493 = activityC21107.f68089.getFirstVisiblePosition();
        }
        if (this.f35920) {
            arrayList = ((C0644) activityC21107.f68093.f56854.peek()).f2492;
        } else {
            arrayList = new ArrayList();
            C7540 c7540M27863 = activityC21107.f68093.f56834.m27863();
            if (c7540M27863 != null) {
                Collections.addAll(arrayList, c7540M27863.m20249());
                Collections.addAll(arrayList, c7540M27863.m20254());
            }
        }
        if (!z) {
            c0644 = new C0644();
            c0644.f2494 = str2;
            try {
                long j = Long.parseLong(str);
                for (C13889 c13889 : arrayList) {
                    if (C5584.m15861(c13889, j)) {
                        c0644.f2492.add(c13889);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c0644 = new C0644();
            c0644.f2494 = str2;
            String lowerCase = str.toLowerCase();
            for (C13889 c138810 : arrayList) {
                if (C5584.m15862(c138810, lowerCase)) {
                    c0644.f2492.add(c138810);
                }
            }
        }
        activityC21107.f68093.f56854.push(c0644);
        activityC21107.f68093.f56851 = activityC21107.f68093.m42621();
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫ */
    public final void mo17648() {
        ActivityC21107 activityC21107 = this.f35921;
        activityC21107.setTitle(((C0644) activityC21107.f68093.f56854.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_METHOD);
    }
}
