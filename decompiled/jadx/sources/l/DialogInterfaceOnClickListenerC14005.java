package l;

import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.ܰᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC14005 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21063[] f42365 = C9068.m23414();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42366;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f42367;

    public DialogInterfaceOnClickListenerC14005(int i) {
        int i2 = 0;
        while (true) {
            C21063[] c21063Arr = this.f42365;
            if (i2 >= c21063Arr.length) {
                i2 = -1;
                break;
            }
            C21063 c21063 = c21063Arr[i2];
            if (c21063.m47909() == i) {
                c21063.setSpan(new ForegroundColorSpan(C21943.f70304), 0, c21063.length(), 33);
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new RuntimeException();
        }
        this.f42367 = i2;
        this.f42366 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f42366 = i;
    }
}
