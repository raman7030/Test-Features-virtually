package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8680 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26460;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26461;

    public /* synthetic */ DialogInterfaceOnClickListenerC8680(int i, Object obj) {
        this.f26460 = i;
        this.f26461 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f26460) {
            case 0:
                ActivityC16315.m38427((ActivityC16315) this.f26461);
                break;
            default:
                ((C22372) this.f26461).m50218(-1, false, true);
                break;
        }
    }
}
