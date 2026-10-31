package l;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩵᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19781 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63884;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63885;

    public /* synthetic */ RunnableC19781(int i, Object obj) {
        this.f63884 = i;
        this.f63885 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f63884;
        Object obj = this.f63885;
        switch (i) {
            case 0:
                ((C14134) obj).m33742();
                break;
            case 1:
                AbstractC13246.m32141((Context) obj);
                break;
            case 2:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 3:
                int i2 = C17735.f54278;
                ((C17735) obj).setVisibility(8);
                break;
            case 4:
                C3125.m9506((C3125) obj);
                break;
            case 5:
                C2998.m9140(((C18954) obj).f59774);
                break;
            case 6:
                ((AsyncTask) obj).lambda$start$1();
                break;
            default:
                AbstractC4311.m12953((AbstractC4311) obj);
                break;
        }
    }
}
