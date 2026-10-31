package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.᩻ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23516 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75483;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75484;

    public /* synthetic */ RunnableC23516(int i, Object obj) {
        this.f75483 = i;
        this.f75484 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f75483;
        Object obj = this.f75484;
        switch (i) {
            case 0:
                C12392 c12392 = (C12392) obj;
                TextKeyListener textKeyListener = C12392.f37169;
                if (c12392.isFocused() && !c12392.m30441()) {
                    c12392.m30380();
                    break;
                }
                break;
            case 1:
                int i2 = C7473.f23014;
                ((C7473) obj).m20082(false);
                break;
            default:
                RunnableC11125.m27604((RunnableC11125) obj, null);
                break;
        }
    }
}
