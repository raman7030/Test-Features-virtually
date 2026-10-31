package l;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9594 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29116;

    public /* synthetic */ DialogInterfaceOnClickListenerC9594(int i, Object obj) {
        this.f29115 = i;
        this.f29116 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f29115;
        Object obj = this.f29116;
        switch (i2) {
            case 0:
                int i3 = ActivityC17169.f52595;
                ((ActivityC17169) obj).finish();
                break;
            case 1:
                ((AtomicInteger) obj).set(i);
                break;
            case 2:
                C5839.m16353((C5839) obj);
                break;
            default:
                ViewOnClickListenerC21628.m48869((ViewOnClickListenerC21628) obj);
                break;
        }
    }
}
