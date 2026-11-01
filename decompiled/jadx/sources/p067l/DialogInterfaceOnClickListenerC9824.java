package p067l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9824 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f27245;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f27246;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27247;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f27248;

    public /* synthetic */ DialogInterfaceOnClickListenerC9824(Object obj, Object obj2, Object obj3, int i) {
        this.f27247 = i;
        this.f27248 = obj;
        this.f27246 = obj2;
        this.f27245 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f27247) {
            case 0:
                C13848 c13848 = (C13848) this.f27248;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f27246;
                AtomicInteger atomicInteger = (AtomicInteger) this.f27245;
                synchronized (c13848) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        atomicInteger.set(-1);
                        c13848.notify();
                    }
                    break;
                }
                return;
            default:
                C23058.m51445((Context) this.f27245, (InterfaceC17021) this.f27248, (Runnable) this.f27246);
                return;
        }
    }
}
