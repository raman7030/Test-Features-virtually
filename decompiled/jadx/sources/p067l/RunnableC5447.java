package p067l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5447 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f12994;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12995;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f12996;

    public /* synthetic */ RunnableC5447(int i, Object obj, Object obj2) {
        this.f12995 = i;
        this.f12996 = obj;
        this.f12994 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12995) {
            case 0:
                DialogInterfaceOnClickListenerC20813.m46992((DialogInterfaceOnClickListenerC20813) this.f12996, (TextView) this.f12994);
                break;
            case 1:
                C16658 c16658 = (C16658) this.f12996;
                this.f12994.mo23093(c16658.f48938, c16658.f48937);
                break;
            case 2:
                ((InterfaceC24686) this.f12996).accept(this.f12994);
                break;
            default:
                C10987.m25353((C8975) this.f12996, (ArrayList) this.f12994);
                break;
        }
    }
}
