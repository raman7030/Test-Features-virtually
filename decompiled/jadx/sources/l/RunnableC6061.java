package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6061 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18571;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18573;

    public /* synthetic */ RunnableC6061(int i, Object obj, Object obj2) {
        this.f18572 = i;
        this.f18573 = obj;
        this.f18571 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18572) {
            case 0:
                ((TextView) this.f18573).setText((String) this.f18571);
                break;
            case 1:
                C10784.m26983((C10784) this.f18573, this.f18571);
                break;
            default:
                C13395 c13395 = (C13395) this.f18573;
                C2609 c2609 = (C2609) this.f18571;
                c13395.getClass();
                C12171.m29642(c2609.m8245() == C13395.m32389(c2609).m8245());
                break;
        }
    }
}
