package p067l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7866 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f20651;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f20652;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4116 f20653;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C15241 f20654;

    public RunnableC7866(C4116 c4116, int i, int i2, C15241 c15241) {
        this.f20653 = c4116;
        this.f20652 = i;
        this.f20651 = i2;
        this.f20654 = c15241;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4116 c4116 = this.f20653;
        InterfaceC9207 interfaceC9207 = c4116.f9064;
        if (interfaceC9207 != null) {
            ArrayList arrayList = c4116.f9063;
            int i = this.f20652;
            arrayList.remove(i);
            c4116.m8310(i, this.f20651, this.f20654);
            C19539 c19539 = (C19539) interfaceC9207;
            TextView textView = c19539.f59489;
            Runnable runnable = c19539.f59488;
            textView.removeCallbacks(runnable);
            textView.post(runnable);
        }
    }
}
