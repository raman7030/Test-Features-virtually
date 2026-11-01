package p067l;

import android.app.Application;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20613 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f63680;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f63681;

    public /* synthetic */ ViewOnClickListenerC20613(int i, Object obj) {
        this.f63680 = i;
        this.f63681 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f63680;
        Object obj = this.f63681;
        switch (i) {
            case 0:
                C11896.m27209((AbstractActivityC5549) obj, view).m50639();
                break;
            case 1:
                int[] iArr = (int[]) obj;
                if (!(iArr[0] == 0 ? ServiceC3906.m7715() : ServiceC9901.m23194())) {
                    if (iArr[0] != 0) {
                        ServiceC9901.m23192();
                    } else {
                        int i2 = ServiceC3906.f8466;
                        Application applicationM16232 = C7050.m16232();
                        C0886.m5546(applicationM16232, new Intent(applicationM16232, (Class<?>) ServiceC3906.class));
                    }
                } else if (iArr[0] != 0) {
                    int i3 = ServiceC9901.f27449;
                    Application applicationM16233 = C7050.m16232();
                    applicationM16233.stopService(new Intent(applicationM16233, (Class<?>) ServiceC9901.class));
                } else {
                    int i4 = ServiceC3906.f8466;
                    Application applicationM16234 = C7050.m16232();
                    applicationM16234.stopService(new Intent(applicationM16234, (Class<?>) ServiceC3906.class));
                }
                break;
            case 2:
                ((C18026) obj).f53832.m48914();
                break;
            default:
                int i5 = ActivityC10059.f27834;
                ((ActivityC10059) obj).finish();
                break;
        }
    }
}
