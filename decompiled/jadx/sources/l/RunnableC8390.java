package l;

import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8390 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25728;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25731;

    public /* synthetic */ RunnableC8390(Object obj, Object obj2, Object obj3, int i) {
        this.f25730 = i;
        this.f25731 = obj;
        this.f25729 = obj2;
        this.f25728 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25730;
        Object obj = this.f25728;
        Object obj2 = this.f25729;
        Object obj3 = this.f25731;
        switch (i) {
            case 0:
                C13136 c13136 = (C13136) obj3;
                ViewOnClickListenerC19121 viewOnClickListenerC19121 = (ViewOnClickListenerC19121) obj2;
                Bundle bundle = (Bundle) obj;
                int i2 = ViewOnClickListenerC19121.f60235;
                try {
                    C9255.m23767();
                    C4925.m14315(new RunnableC14343(c13136, viewOnClickListenerC19121, bundle, 2));
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                ((DialogInterfaceC0206) obj3).dismiss();
                ((C12200) obj2).n((C21081) obj);
                return;
        }
    }
}
