package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10915 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f32790;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return 2;
    }

    public C10915(ActivityC8092 activityC8092) {
        this.f32790 = activityC8092;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        return this.f32790.getString(i == 0 ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        ActivityC8092 activityC8092 = this.f32790;
        C13132 c13132 = i == 0 ? activityC8092.f24925.f7826 : activityC8092.f24926.f52917;
        c0452.addView(c13132);
        return c13132;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        ActivityC8092 activityC8092 = this.f32790;
        c0452.removeView(i == 0 ? activityC8092.f24925.f7826 : activityC8092.f24926.f52917);
    }
}
