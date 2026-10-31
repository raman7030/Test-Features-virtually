package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1115 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4068;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4069;

    public /* synthetic */ DialogInterfaceOnClickListenerC1115(int i, Object obj) {
        this.f4068 = i;
        this.f4069 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4068) {
            case 0:
                ActivityC10227.m25826((ActivityC10227) this.f4069);
                break;
            default:
                ((boolean[]) this.f4069)[0] = true;
                break;
        }
    }
}
