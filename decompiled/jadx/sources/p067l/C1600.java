package p067l;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶܳ */
/* JADX INFO: compiled from: Q4Q8 */
/* JADX INFO: loaded from: classes5.dex */
public class C1600 extends DialogInterfaceOnCancelListenerC12199 {
    public C1600() {
    }

    public C1600(int i) {
        super(i);
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC1250(getContext(), getTheme());
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC1250) {
            DialogC1250 dialogC1250 = (DialogC1250) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dialogC1250.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
