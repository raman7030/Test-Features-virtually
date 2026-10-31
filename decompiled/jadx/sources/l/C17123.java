package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17123 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f52467;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f52468;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f52469;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f52470;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17120 f52471;

    public C17123(ActivityC22062 activityC22062) {
        this.f52468 = activityC22062;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f52468.f70694.m29958(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f52470 = C8863.m22895();
        this.f52467 = (List) C5378.stream(C16293.m38327().m36526("keystore").mo23549(true)).filter(new C16417()).sorted(new C5626(1)).collect(C22976.toUnmodifiableList());
        ActivityC22062 activityC22062 = this.f52468;
        List list = activityC22062.f70700;
        ArrayList arrayList = new ArrayList();
        arrayList.add("h1");
        if (this.f52470.isEmpty()) {
            arrayList.add("e1");
        } else {
            for (AbstractC13262 abstractC13262 : this.f52470) {
                if (abstractC13262.mo14004().equals(activityC22062.f70704)) {
                    arrayList.add("k" + abstractC13262.mo10324() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("k" + abstractC13262.mo10324());
                }
            }
        }
        arrayList.add("h2");
        if (this.f52467.isEmpty()) {
            arrayList.add("e2");
        } else {
            for (AbstractC15440 abstractC15440 : this.f52467) {
                if (abstractC15440.getName().equals(activityC22062.f70695)) {
                    arrayList.add("f" + abstractC15440.getName() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("f" + abstractC15440.getName());
                }
            }
        }
        this.f52469 = arrayList;
        if (activityC22062.f70701 == null || list.isEmpty()) {
            return;
        }
        this.f52471 = C20649.m47228(new C17829(list, arrayList));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        List list = this.f52470;
        ActivityC22062 activityC22062 = this.f52468;
        activityC22062.f70702 = list;
        activityC22062.f70699 = this.f52467;
        activityC22062.f70700 = this.f52469;
        if (activityC22062.f70701 != null) {
            activityC22062.f70701.m51927();
            C17120 c17120 = this.f52471;
            if (c17120 != null) {
                c17120.m40148(activityC22062.f70701);
            } else {
                activityC22062.f70701.notifyDataSetChanged();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f52468.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f52468.f70694.m29958(false);
    }
}
