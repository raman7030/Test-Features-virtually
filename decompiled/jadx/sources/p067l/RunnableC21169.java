package p067l;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bin.p000mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩵᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21169 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f66521;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f66522;

    public /* synthetic */ RunnableC21169(int i, Object obj) {
        this.f66521 = i;
        this.f66522 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66521;
        Object obj = this.f66522;
        switch (i) {
            case 0:
                ((C15802) obj).m35874();
                break;
            case 1:
                AbstractC1499.m34240((Context) obj);
                break;
            case 2:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 3:
                int i2 = C19223.f57470;
                ((C19223) obj).setVisibility(8);
                break;
            case 4:
                C5338.m11549((C5338) obj);
                break;
            case 5:
                C5218.m11191(((C20383) obj).f63003);
                break;
            case 6:
                ((AsyncTask) obj).lambda$start$1();
                break;
            default:
                AbstractC6465.m14817((AbstractC6465) obj);
                break;
        }
    }
}
