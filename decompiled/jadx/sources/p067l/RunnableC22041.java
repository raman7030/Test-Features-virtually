package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bin.p000mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.᩷ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22041 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f69355;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f69356;

    public /* synthetic */ RunnableC22041(int i, Object obj) {
        this.f69355 = i;
        this.f69356 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f69355;
        Object obj = this.f69356;
        switch (i) {
            case 0:
                ServiceC20700.m46772((ServiceC20700) obj);
                return;
            case 1:
                C21549.m48732((C21549) obj);
                return;
            case 2:
                ((AbstractActivityC14026) obj).f39548.m17163();
                return;
            case 3:
                ((ActivityC2822) obj).m4494();
                return;
            case 4:
                ((AbstractViewOnClickListenerC13513) obj).m30668();
                return;
            case 5:
                final ActivityC12088 activityC12088 = (ActivityC12088) obj;
                int i2 = ActivityC12088.f33683;
                C7050.m16212(new Runnable() { // from class: l.ۧ۫ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC12088.m27776(activityC12088);
                    }
                });
                return;
            case 6:
                ((C15556) obj).notifyDataSetChanged();
                return;
            case 7:
                C2485.m3590((C2485) obj);
                return;
            case 8:
                ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = (ViewOnLayoutChangeListenerC9723) obj;
                int i3 = ViewOnLayoutChangeListenerC9723.f26851;
                if (C4359.f9761) {
                    DialogInterfaceOnClickListenerC12648.m29080(viewOnLayoutChangeListenerC9723, "term_api29_limit", viewOnLayoutChangeListenerC9723.getString(R.string.MT_Protector), true);
                }
                viewOnLayoutChangeListenerC9723.runOnUiThread(new RunnableC19811(3, viewOnLayoutChangeListenerC9723, new RunnableC4782(4, viewOnLayoutChangeListenerC9723)));
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
