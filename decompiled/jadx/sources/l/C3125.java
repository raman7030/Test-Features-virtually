package l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۗۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3125 implements InterfaceC23586 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C3125 f9760 = new C3125();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f9764;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f9765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Handler f9768;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9762 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f9763 = true;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20765 f9761 = new C20765(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC19781 f9767 = new RunnableC19781(4, this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4536 f9766 = new C4536(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9510(Context context) {
        C11233.m27805(context, d.R);
        this.f9768 = new Handler();
        this.f9761.m47438(EnumC22901.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C11233.m27800((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C20059(this));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9512() {
        int i = this.f9764 + 1;
        this.f9764 = i;
        if (i == 1 && this.f9763) {
            this.f9761.m47438(EnumC22901.ON_START);
            this.f9763 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9511() {
        int i = this.f9765 + 1;
        this.f9765 = i;
        if (i == 1) {
            if (this.f9762) {
                this.f9761.m47438(EnumC22901.ON_RESUME);
                this.f9762 = false;
            } else {
                Handler handler = this.f9768;
                C11233.m27799(handler);
                handler.removeCallbacks(this.f9767);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9509() {
        int i = this.f9765 - 1;
        this.f9765 = i;
        if (i == 0) {
            Handler handler = this.f9768;
            C11233.m27799(handler);
            handler.postDelayed(this.f9767, 700L);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9513() {
        int i = this.f9764 - 1;
        this.f9764 = i;
        if (i == 0 && this.f9762) {
            this.f9761.m47438(EnumC22901.ON_STOP);
            this.f9763 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9506(C3125 c3125) {
        C20765 c20765 = c3125.f9761;
        if (c3125.f9765 == 0) {
            c3125.f9762 = true;
            c20765.m47438(EnumC22901.ON_PAUSE);
        }
        if (c3125.f9764 == 0 && c3125.f9762) {
            c20765.m47438(EnumC22901.ON_STOP);
            c3125.f9763 = true;
        }
    }

    @Override // l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        return this.f9761;
    }
}
