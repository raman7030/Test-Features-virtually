package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC14343 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43253;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43254;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43255;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43256;

    public /* synthetic */ RunnableC14343(Object obj, Object obj2, Object obj3, int i) {
        this.f43255 = i;
        this.f43256 = obj;
        this.f43254 = obj2;
        this.f43253 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43255) {
            case 0:
                C12392.m30136((C12392) this.f43256, (C0273) this.f43254, (C0273) this.f43253);
                break;
            case 1:
                C7119.m19134((C7119) this.f43256, (ArrayList) this.f43254, (C2450) this.f43253);
                break;
            default:
                ViewOnClickListenerC19121.m44086((C13136) this.f43256, (ViewOnClickListenerC19121) this.f43254, (Bundle) this.f43253);
                break;
        }
    }
}
