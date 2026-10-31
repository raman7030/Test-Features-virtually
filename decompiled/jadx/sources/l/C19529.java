package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.᩵ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19529 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f63101;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    public C19529(ActivityC0477 activityC0477) {
        this.f63101 = activityC0477;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(final int i) {
        ActivityC0477 activityC0477 = this.f63101;
        if (i == activityC0477.f2064.size()) {
            C4925.m14315(new Runnable() { // from class: l.ᩴܳܿ
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.Tab tabAt = this.f59378.f63101.f2063.getTabAt(i);
                    C11003.requireNonNull(tabAt);
                    tabAt.setIcon(R.drawable.MT_Protector);
                }
            });
            return null;
        }
        try {
            return ((C23761) activityC0477.f2064.get(i)).m52426().m15502();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        View view;
        ActivityC0477 activityC0477 = this.f63101;
        if (i == activityC0477.f2064.size()) {
            view = activityC0477.f2071.f12709;
        } else {
            view = ((C23761) activityC0477.f2064.get(i)).f76923;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        c0452.addView(view);
        return view;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        c0452.removeView((View) obj);
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return this.f63101.f2064.size() + 1;
    }
}
