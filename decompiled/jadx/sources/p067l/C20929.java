package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.᩵ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20929 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ActivityC2822 f65721;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return view == obj;
    }

    public C20929(ActivityC2822 activityC2822) {
        this.f65721 = activityC2822;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(final int i) {
        ActivityC2822 activityC2822 = this.f65721;
        if (i == activityC2822.f4838.size()) {
            C7050.m16212(new Runnable() { // from class: l.ᩴܳܿ
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.Tab tabAt = this.f62605.f65721.f4837.getTabAt(i);
                    C12826.requireNonNull(tabAt);
                    tabAt.setIcon(R.drawable.MT_Protector);
                }
            });
            return null;
        }
        try {
            return ((C24951) activityC2822.f4838.get(i)).m54835().m17413();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        View view;
        ActivityC2822 activityC2822 = this.f65721;
        if (i == activityC2822.f4838.size()) {
            view = activityC2822.f4845.f15525;
        } else {
            view = ((C24951) activityC2822.f4838.get(i)).f79675;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        c2798.addView(view);
        return view;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        c2798.removeView((View) obj);
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return this.f65721.f4838.size() + 1;
    }
}
