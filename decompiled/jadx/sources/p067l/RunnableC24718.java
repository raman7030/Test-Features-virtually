package p067l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.᩻ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24718 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78229;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f78230;

    public /* synthetic */ RunnableC24718(int i, Object obj) {
        this.f78229 = i;
        this.f78230 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f78229;
        Object obj = this.f78230;
        switch (i) {
            case 0:
                C14146 c14146 = (C14146) obj;
                TextKeyListener textKeyListener = C14146.f40186;
                if (c14146.isFocused() && !c14146.m32505()) {
                    c14146.m32444();
                    break;
                }
                break;
            case 1:
                int i2 = C9471.f25926;
                ((C9471) obj).m22057(false);
                break;
            default:
                RunnableC12942.m29666((RunnableC12942) obj, null);
                break;
        }
    }
}
