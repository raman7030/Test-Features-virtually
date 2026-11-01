package p067l;

import android.view.View;
import bin.p000mt.plugin.api.p002ui.dialog.DualProgressDialog;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: l.ᩴ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20435 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f63132;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f63133;

    public /* synthetic */ RunnableC20435(int i, Object obj) {
        this.f63132 = i;
        this.f63133 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63132) {
            case 0:
                ((C18107) this.f63133).m41244();
                break;
            case 1:
                C21381.m48451((C21381) this.f63133);
                break;
            case 2:
                C15826.m35916((C15826) this.f63133);
                break;
            case 3:
                ((C21831) this.f63133).m49238();
                break;
            case 4:
                ((DualProgressDialog) this.f63133).lambda$dismiss$3();
                break;
            case 5:
                ((InterfaceC6616) this.f63133).mo5693();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard((View) this.f63133, false);
                break;
        }
    }
}
