package p067l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.p000mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21818 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC22429 f68648;

    public C21818(ActivityC22429 activityC22429) {
        this.f68648 = activityC22429;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f68648, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC22429 activityC22429 = this.f68648;
        C19746 c19746 = activityC22429.f70775;
        int i = C18524.f55316;
        c19746.f60059 = C18524.m42105(activityC22429.getIntent());
        activityC22429.f70775.f60057 = new C5651(activityC22429.f70775.f60059.mo29987());
        for (C13068 c13068 : activityC22429.f70775.f60057.f13741.m27253()) {
            activityC22429.f70775.f60049.put(C17073.m38720(1, 1, c13068.m29923().m53168()), c13068);
        }
        C19746 c19747 = activityC22429.f70775;
        Set setKeySet = activityC22429.f70775.f60049.keySet();
        C16392 c16392 = new C16392();
        c16392.f48182 = new C25110(activityC22429, "", "", null);
        c16392.m37213(setKeySet);
        c19747.f60064 = c16392;
        ActivityC22429.m50392(activityC22429);
        activityC22429.f70775.f60065 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC22429 activityC22429 = this.f68648;
        ListView listView = activityC22429.f70771;
        C14352 c14352 = new C14352(new C9747(activityC22429));
        activityC22429.f70774 = c14352;
        listView.setAdapter((ListAdapter) c14352);
        activityC22429.f70771.setOnScrollListener(new C23829(this));
        activityC22429.f70774.m15992(activityC22429.f70771);
        activityC22429.f70774.m12528(true);
        activityC22429.f70774.m12530();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f68648.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
