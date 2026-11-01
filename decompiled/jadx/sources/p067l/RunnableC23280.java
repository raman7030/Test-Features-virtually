package p067l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩹ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23280 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f73246;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f73247;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f73248;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f73249;

    public /* synthetic */ RunnableC23280(Object obj, Object obj2, Object obj3, int i) {
        this.f73248 = i;
        this.f73249 = obj;
        this.f73247 = obj2;
        this.f73246 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f73248;
        Object obj = this.f73246;
        Object obj2 = this.f73247;
        Object obj3 = this.f73249;
        switch (i) {
            case 0:
                ActivityC21269.m48046((ActivityC21269) obj3, (C17117) obj2, (float[]) obj);
                break;
            case 1:
                EditText editText = (EditText) obj2;
                View view = (View) obj;
                int i2 = ActivityC2822.f4836;
                if (((EditText) obj3).getVisibility() == 0 || editText.getVisibility() == 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                break;
            default:
                C15099.m34500((C15099) obj3, (C4036) obj2, (AbstractC14355) obj);
                break;
        }
    }
}
