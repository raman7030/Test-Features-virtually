package p067l;

import android.widget.EditText;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۠ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9966 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27592;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f27593;

    public /* synthetic */ RunnableC9966(int i, Object obj) {
        this.f27592 = i;
        this.f27593 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27592) {
            case 0:
                C14146.m32192((C14146) this.f27593);
                break;
            case 1:
                C10072.m23513((C10072) this.f27593);
                break;
            case 2:
                ((EditText) this.f27593).selectAll();
                break;
            case 3:
                ((MaterialBackOrchestrator) this.f27593).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            default:
                ((TextInputLayout) this.f27593).lambda$onGlobalLayout$1();
                break;
        }
    }
}
