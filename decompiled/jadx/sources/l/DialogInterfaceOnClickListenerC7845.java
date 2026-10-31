package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7845 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24330;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24331;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24332;

    public /* synthetic */ DialogInterfaceOnClickListenerC7845(Object obj, Object obj2, Object obj3, int i) {
        this.f24331 = i;
        this.f24332 = obj;
        this.f24330 = obj2;
        this.f24329 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f24331) {
            case 0:
                C12079 c12079 = (C12079) this.f24332;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f24330;
                AtomicInteger atomicInteger = (AtomicInteger) this.f24329;
                synchronized (c12079) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        atomicInteger.set(-1);
                        c12079.notify();
                    }
                    break;
                }
                return;
            default:
                C21769.m49095((Context) this.f24329, (InterfaceC15417) this.f24332, (Runnable) this.f24330);
                return;
        }
    }
}
