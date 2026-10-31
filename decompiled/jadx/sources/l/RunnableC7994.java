package l;

import android.widget.EditText;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۠ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7994 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24680;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24681;

    public /* synthetic */ RunnableC7994(int i, Object obj) {
        this.f24680 = i;
        this.f24681 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24680) {
            case 0:
                C12392.m30128((C12392) this.f24681);
                break;
            case 1:
                C8106.m21545((C8106) this.f24681);
                break;
            case 2:
                ((EditText) this.f24681).selectAll();
                break;
            case 3:
                ((MaterialBackOrchestrator) this.f24681).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            default:
                ((TextInputLayout) this.f24681).lambda$onGlobalLayout$1();
                break;
        }
    }
}
