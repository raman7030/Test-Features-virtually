package p067l;

import android.os.SystemClock;
import android.widget.ImageView;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۛ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8368 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f22426;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f22427;

    public /* synthetic */ RunnableC8368(int i, Object obj) {
        this.f22426 = i;
        this.f22427 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22426;
        Object obj = this.f22427;
        switch (i) {
            case 0:
                ((C9471) obj).m22062();
                break;
            case 1:
                ((C9823) obj).m22932();
                break;
            case 2:
                ((C6495) obj).close();
                break;
            case 3:
                DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, (AbstractActivityC5549) obj, "def_sign_key_warn");
                break;
            case 4:
                int i2 = ActivityC17586.f52553;
                ((AtomicBoolean) obj).set(true);
                break;
            case 5:
                String str = (String) obj;
                int[] iArr = {500, 500, 500, 500, 1000, 1000, 1000, 1000, 1000, 2000, 2000};
                for (int i3 = 0; i3 < 11; i3++) {
                    SystemClock.sleep(iArr[i3]);
                    C19701 c19701M44739 = C19701.m44739(4208);
                    c19701M44739.m44750(str);
                    C25065 c25065M44755 = c19701M44739.m44755();
                    C13045.m29865(c25065M44755, "requestNeedLogin(...)");
                    if (c25065M44755.m55016()) {
                        C15342.m34916();
                        C9111.f24679.mo4062(new Object());
                    } else if (c25065M44755.m55020()) {
                    }
                    break;
                }
                break;
            default:
                ((ImageView) obj).setVisibility(8);
                break;
        }
    }
}
