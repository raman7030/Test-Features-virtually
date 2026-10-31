package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.᩷ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20699 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66674;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66675;

    public /* synthetic */ RunnableC20699(int i, Object obj) {
        this.f66674 = i;
        this.f66675 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66674;
        Object obj = this.f66675;
        switch (i) {
            case 0:
                ServiceC19288.m44478((ServiceC19288) obj);
                return;
            case 1:
                C20182.m46413((C20182) obj);
                return;
            case 2:
                ((AbstractActivityC12266) obj).f36532.m15257();
                return;
            case 3:
                ((ActivityC0477) obj).m2113();
                return;
            case 4:
                ((AbstractViewOnClickListenerC11726) obj).m28620();
                return;
            case 5:
                final ActivityC10227 activityC10227 = (ActivityC10227) obj;
                int i2 = ActivityC10227.f30722;
                C4925.m14315(new Runnable() { // from class: l.ۧ۫ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC10227.m25754(activityC10227);
                    }
                });
                return;
            case 6:
                ((C13876) obj).notifyDataSetChanged();
                return;
            case 7:
                C0123.m1189((C0123) obj);
                return;
            case 8:
                ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = (ViewOnLayoutChangeListenerC7738) obj;
                int i3 = ViewOnLayoutChangeListenerC7738.f23938;
                if (C2094.f6977) {
                    DialogInterfaceOnClickListenerC10816.m27035(viewOnLayoutChangeListenerC7738, "term_api29_limit", viewOnLayoutChangeListenerC7738.getString(R.string.MT_Protector), true);
                }
                viewOnLayoutChangeListenerC7738.runOnUiThread(new RunnableC18352(3, viewOnLayoutChangeListenerC7738, new RunnableC2539(4, viewOnLayoutChangeListenerC7738)));
                return;
            case 9:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"));
                    context.startActivity(intent);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException("Unable to open OPPO floating window settings", e);
                }
            default:
                ((SearchView) obj).lambda$clearFocusAndHideKeyboard$9();
                return;
        }
    }
}
