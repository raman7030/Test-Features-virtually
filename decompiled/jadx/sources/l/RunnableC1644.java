package l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.֫ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1644 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5742;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5743;

    public /* synthetic */ RunnableC1644(int i, Object obj) {
        this.f5742 = i;
        this.f5743 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5742;
        Object obj = this.f5743;
        switch (i) {
            case 0:
                TextKeyListener textKeyListener = C12392.f37169;
                C4925.m14315(new RunnableC17872((C12392) obj, 0));
                break;
            default:
                ((C0273) obj).mo1598();
                break;
        }
    }
}
