package l;

import android.app.Application;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19197 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60450;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60451;

    public /* synthetic */ ViewOnClickListenerC19197(int i, Object obj) {
        this.f60450 = i;
        this.f60451 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f60450;
        Object obj = this.f60451;
        switch (i) {
            case 0:
                C10025.m25192((AbstractActivityC3346) obj, view).m48305();
                break;
            case 1:
                int[] iArr = (int[]) obj;
                if (!(iArr[0] == 0 ? ServiceC1618.m5485() : ServiceC7926.m21228())) {
                    if (iArr[0] != 0) {
                        ServiceC7926.m21226();
                    } else {
                        int i2 = ServiceC1618.f5686;
                        Application applicationM14335 = C4925.m14335();
                        C0881.m3232(applicationM14335, new Intent(applicationM14335, (Class<?>) ServiceC1618.class));
                    }
                } else if (iArr[0] != 0) {
                    int i3 = ServiceC7926.f24535;
                    Application applicationM14336 = C4925.m14335();
                    applicationM14336.stopService(new Intent(applicationM14336, (Class<?>) ServiceC7926.class));
                } else {
                    int i4 = ServiceC1618.f5686;
                    Application applicationM14337 = C4925.m14335();
                    applicationM14337.stopService(new Intent(applicationM14337, (Class<?>) ServiceC1618.class));
                }
                break;
            case 2:
                ((C16475) obj).f50655.m46591();
                break;
            default:
                int i5 = ActivityC8092.f24923;
                ((ActivityC8092) obj).finish();
                break;
        }
    }
}
