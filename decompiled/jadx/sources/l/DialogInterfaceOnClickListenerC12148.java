package l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12148 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36251;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36252;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36253;

    public /* synthetic */ DialogInterfaceOnClickListenerC12148(int i, Object obj, Object obj2) {
        this.f36252 = i;
        this.f36253 = obj;
        this.f36251 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36252) {
            case 0:
                C10032.m25206((C10032) this.f36253, (boolean[]) this.f36251);
                break;
            default:
                C4779.m13951((C4779) this.f36253, (List) this.f36251);
                break;
        }
    }
}
