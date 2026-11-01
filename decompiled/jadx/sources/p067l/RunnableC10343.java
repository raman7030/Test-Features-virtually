package p067l;

import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10343 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f28641;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f28642;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28643;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f28644;

    public /* synthetic */ RunnableC10343(Object obj, Object obj2, Object obj3, int i) {
        this.f28643 = i;
        this.f28644 = obj;
        this.f28642 = obj2;
        this.f28641 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28643;
        Object obj = this.f28641;
        Object obj2 = this.f28642;
        Object obj3 = this.f28644;
        switch (i) {
            case 0:
                C14853 c14853 = (C14853) obj3;
                ViewOnClickListenerC20541 viewOnClickListenerC20541 = (ViewOnClickListenerC20541) obj2;
                Bundle bundle = (Bundle) obj;
                int i2 = ViewOnClickListenerC20541.f63467;
                try {
                    C11164.m25768();
                    C7050.m16212(new RunnableC16000(c14853, viewOnClickListenerC20541, bundle, 2));
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                ((DialogInterfaceC2564) obj3).dismiss();
                ((C13963) obj2).m45213n((C22404) obj);
                return;
        }
    }
}
