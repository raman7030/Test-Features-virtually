package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14532 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44525;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44526;

    public /* synthetic */ RunnableC14532(int i, Object obj) {
        this.f44525 = i;
        this.f44526 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f44525) {
            case 0:
                C17294.m40607(((View) this.f44526).findViewById(R.id.MT_Protector));
                break;
            case 1:
                DialogInterfaceOnClickListenerC19407.m44692((C13136) this.f44526);
                break;
            case 2:
                ((InterfaceC14544) this.f44526).mo13743(-1);
                break;
            default:
                C4835.m14079((Context) this.f44526);
                break;
        }
    }
}
