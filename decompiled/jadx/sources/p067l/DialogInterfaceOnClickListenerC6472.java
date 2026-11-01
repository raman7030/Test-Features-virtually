package p067l;

import android.content.DialogInterface;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6472 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16722;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Serializable f16723;

    public /* synthetic */ DialogInterfaceOnClickListenerC6472(int i, Serializable serializable) {
        this.f16722 = i;
        this.f16723 = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f16722;
        Object obj = this.f16723;
        switch (i2) {
            case 0:
                ((AtomicInteger) obj).set(i);
                break;
            default:
                int i3 = ActivityC2822.f4836;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
