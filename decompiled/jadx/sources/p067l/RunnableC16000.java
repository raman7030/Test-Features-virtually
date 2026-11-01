package p067l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC16000 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f46344;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f46345;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f46346;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f46347;

    public /* synthetic */ RunnableC16000(Object obj, Object obj2, Object obj3, int i) {
        this.f46346 = i;
        this.f46347 = obj;
        this.f46345 = obj2;
        this.f46344 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46346) {
            case 0:
                C14146.m32200((C14146) this.f46347, (C2628) this.f46345, (C2628) this.f46344);
                break;
            case 1:
                C9134.m21077((C9134) this.f46347, (ArrayList) this.f46345, (C4697) this.f46344);
                break;
            default:
                ViewOnClickListenerC20541.m46380((C14853) this.f46347, (ViewOnClickListenerC20541) this.f46345, (Bundle) this.f46344);
                break;
        }
    }
}
