package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16180 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f47631;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f47632;

    public /* synthetic */ RunnableC16180(int i, Object obj) {
        this.f47631 = i;
        this.f47632 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f47631) {
            case 0:
                C18805.m42858(((View) this.f47632).findViewById(R.id.MT_Protector));
                break;
            case 1:
                DialogInterfaceOnClickListenerC20813.m46986((C14853) this.f47632);
                break;
            case 2:
                ((InterfaceC16191) this.f47632).mo15618(-1);
                break;
            default:
                C6964.m15959((Context) this.f47632);
                break;
        }
    }
}
