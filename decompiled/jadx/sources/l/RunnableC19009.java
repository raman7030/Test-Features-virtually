package l;

import android.view.View;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: l.ᩴ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19009 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59904;

    public /* synthetic */ RunnableC19009(int i, Object obj) {
        this.f59903 = i;
        this.f59904 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59903) {
            case 0:
                ((C16560) this.f59904).m39018();
                break;
            case 1:
                C20005.m46136((C20005) this.f59904);
                break;
            case 2:
                C14159.m33784((C14159) this.f59904);
                break;
            case 3:
                ((C20478) this.f59904).m46915();
                break;
            case 4:
                ((DualProgressDialog) this.f59904).lambda$dismiss$3();
                break;
            case 5:
                ((InterfaceC4469) this.f59904).mo3374();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard((View) this.f59904, false);
                break;
        }
    }
}
