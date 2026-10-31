package l;

import android.content.DialogInterface;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4318 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13907;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f13908;

    public /* synthetic */ DialogInterfaceOnClickListenerC4318(int i, Serializable serializable) {
        this.f13907 = i;
        this.f13908 = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f13907;
        Object obj = this.f13908;
        switch (i2) {
            case 0:
                ((AtomicInteger) obj).set(i);
                break;
            default:
                int i3 = ActivityC0477.f2061;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
