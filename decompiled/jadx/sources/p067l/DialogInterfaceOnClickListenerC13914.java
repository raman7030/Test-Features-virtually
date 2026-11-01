package p067l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13914 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f39262;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39263;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39264;

    public /* synthetic */ DialogInterfaceOnClickListenerC13914(int i, Object obj, Object obj2) {
        this.f39263 = i;
        this.f39264 = obj;
        this.f39262 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f39263) {
            case 0:
                C11903.m27223((C11903) this.f39264, (boolean[]) this.f39262);
                break;
            default:
                C6911.m15831((C6911) this.f39264, (List) this.f39262);
                break;
        }
    }
}
