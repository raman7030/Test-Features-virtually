package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩹ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22003 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70532;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70533;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70534;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70535;

    public /* synthetic */ RunnableC22003(Object obj, Object obj2, Object obj3, int i) {
        this.f70534 = i;
        this.f70535 = obj;
        this.f70533 = obj2;
        this.f70532 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f70534;
        Object obj = this.f70532;
        Object obj2 = this.f70533;
        Object obj3 = this.f70535;
        switch (i) {
            case 0:
                ActivityC19887.m45735((ActivityC19887) obj3, (C15518) obj2, (float[]) obj);
                break;
            case 1:
                EditText editText = (EditText) obj2;
                View view = (View) obj;
                int i2 = ActivityC0477.f2061;
                if (((EditText) obj3).getVisibility() == 0 || editText.getVisibility() == 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                break;
            default:
                C13395.m32398((C13395) obj3, (C1755) obj2, (AbstractC12612) obj);
                break;
        }
    }
}
