package p067l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10889 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC10218 f30168;

    public C10889(ActivityC10218 activityC10218) {
        this.f30168 = activityC10218;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f30168, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC10218 activityC10218 = this.f30168;
        C3512 c3512 = activityC10218.f28325;
        int i = C18524.f55316;
        c3512.f7116 = C18524.m42105(activityC10218.getIntent());
        activityC10218.f28325.f7115 = activityC10218.f28325.f7116.getName();
        activityC10218.f28325.f7109 = C16820.m38131(activityC10218.f28325.f7116);
        activityC10218.f28325.f7113 = new int[activityC10218.f28325.f7109.f49796.size()];
        activityC10218.f28325.f7118 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC10218 activityC10218 = this.f30168;
        ListView listView = activityC10218.f28326;
        C14352 c14352 = new C14352(new C7536(activityC10218));
        activityC10218.f28327 = c14352;
        listView.setAdapter((ListAdapter) c14352);
        activityC10218.f28326.setOnScrollListener(new C11560(this));
        activityC10218.f28327.m15992(activityC10218.f28326);
        activityC10218.f28327.m12528(true);
        activityC10218.f28327.m12530();
        activityC10218.f28326.setOnItemClickListener(activityC10218);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f30168.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
