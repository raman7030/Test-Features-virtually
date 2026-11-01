package p067l;

import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.ܰᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC15679 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final C22387[] f45448 = C10987.m25360();

    /* JADX INFO: renamed from: ᩸ */
    public int f45449;

    /* JADX INFO: renamed from: ᩹ */
    public final int f45450;

    public DialogInterfaceOnClickListenerC15679(int i) {
        int i2 = 0;
        while (true) {
            C22387[] c22387Arr = this.f45448;
            if (i2 >= c22387Arr.length) {
                i2 = -1;
                break;
            }
            C22387 c22387 = c22387Arr[i2];
            if (c22387.m50239() == i) {
                c22387.setSpan(new ForegroundColorSpan(C23223.f73015), 0, c22387.length(), 33);
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new RuntimeException();
        }
        this.f45450 = i2;
        this.f45449 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f45449 = i;
    }
}
