package l;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4Q8 */
/* JADX INFO: loaded from: classes5.dex */
public class C15278 extends DialogInterfaceOnCancelListenerC10344 {
    public C15278() {
    }

    public C15278(int i) {
        super(i);
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC8224(getContext(), getTheme());
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC8224) {
            DialogC8224 dialogC8224 = (DialogC8224) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dialogC8224.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
