package p067l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۗۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5338 implements InterfaceC24784 {

    /* JADX INFO: renamed from: ۛ */
    public static final C5338 f12563 = new C5338();

    /* JADX INFO: renamed from: ۫ */
    public int f12567;

    /* JADX INFO: renamed from: ۬ */
    public int f12568;

    /* JADX INFO: renamed from: ᩹ */
    public Handler f12571;

    /* JADX INFO: renamed from: ۙ */
    public boolean f12565 = true;

    /* JADX INFO: renamed from: ۤ */
    public boolean f12566 = true;

    /* JADX INFO: renamed from: ۗ */
    public final C22103 f12564 = new C22103(this);

    /* JADX INFO: renamed from: ᩸ */
    public final RunnableC21169 f12570 = new RunnableC21169(4, this);

    /* JADX INFO: renamed from: ᩶ */
    public final C6679 f12569 = new C6679(this);

    /* JADX INFO: renamed from: ֫ */
    public final void m11553(Context context) {
        C13045.m29867(context, C0708d.f2602R);
        this.f12571 = new Handler();
        this.f12564.m49766(EnumC24133.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C13045.m29862((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C21432(this));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11555() {
        int i = this.f12567 + 1;
        this.f12567 = i;
        if (i == 1 && this.f12566) {
            this.f12564.m49766(EnumC24133.ON_START);
            this.f12566 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11554() {
        int i = this.f12568 + 1;
        this.f12568 = i;
        if (i == 1) {
            if (this.f12565) {
                this.f12564.m49766(EnumC24133.ON_RESUME);
                this.f12565 = false;
            } else {
                Handler handler = this.f12571;
                C13045.m29861(handler);
                handler.removeCallbacks(this.f12570);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11552() {
        int i = this.f12568 - 1;
        this.f12568 = i;
        if (i == 0) {
            Handler handler = this.f12571;
            C13045.m29861(handler);
            handler.postDelayed(this.f12570, 700L);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11556() {
        int i = this.f12567 - 1;
        this.f12567 = i;
        if (i == 0 && this.f12565) {
            this.f12564.m49766(EnumC24133.ON_STOP);
            this.f12566 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11549(C5338 c5338) {
        C22103 c22103 = c5338.f12564;
        if (c5338.f12568 == 0) {
            c5338.f12565 = true;
            c22103.m49766(EnumC24133.ON_PAUSE);
        }
        if (c5338.f12567 == 0 && c5338.f12565) {
            c22103.m49766(EnumC24133.ON_STOP);
            c5338.f12566 = true;
        }
    }

    @Override // p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        return this.f12564;
    }
}
