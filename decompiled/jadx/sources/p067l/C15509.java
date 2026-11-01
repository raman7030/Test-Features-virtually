package p067l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܰ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15509 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractActivityC5549 f44320;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ View f44321;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ RunnableC10817 f44322;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ RunnableC16180 f44323;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C5471 f44324;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ View[] f44325;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ DialogInterfaceC2564 f44326;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ RunnableC17521 f44327;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public C15509(View view, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, RunnableC16180 runnableC16180, RunnableC17521 runnableC17521, View[] viewArr, C5471 c5471, RunnableC10817 runnableC10817) {
        this.f44321 = view;
        this.f44320 = abstractActivityC5549;
        this.f44326 = dialogInterfaceC2564;
        this.f44323 = runnableC16180;
        this.f44327 = runnableC17521;
        this.f44325 = viewArr;
        this.f44324 = c5471;
        this.f44322 = runnableC10817;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) throws Throwable {
        View view = this.f44321;
        View viewFindFocus = view.findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
            ((InputMethodManager) this.f44320.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        int position = tab.getPosition();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f44326;
        dialogInterfaceC2564.m3861().setVisibility(position < 2 ? 8 : 0);
        dialogInterfaceC2564.m3861().setText(position == 3 ? R.string.MT_Protector : R.string.MT_Protector);
        if (position == 1) {
            this.f44323.run();
        }
        View[] viewArr = this.f44325;
        if (position == 2) {
            this.f44327.run();
            ((C4694) viewArr[2].findViewById(R.id.MT_Protector)).m9951();
        }
        if (position == 3) {
            this.f44324.m12040();
            ((C4694) viewArr[3].findViewById(R.id.MT_Protector)).m9951();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        if (tab.getPosition() == 0) {
            this.f44322.run();
        }
    }
}
