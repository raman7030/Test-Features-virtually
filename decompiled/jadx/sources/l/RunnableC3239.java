package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3239 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10188;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10189;

    public /* synthetic */ RunnableC3239(int i, Object obj, Object obj2) {
        this.f10188 = i;
        this.f10189 = obj;
        this.f10187 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10188) {
            case 0:
                DialogInterfaceOnClickListenerC19407.m44698((DialogInterfaceOnClickListenerC19407) this.f10189, (TextView) this.f10187);
                break;
            case 1:
                C15036 c15036 = (C15036) this.f10189;
                this.f10187.mo21128(c15036.f45822, c15036.f45821);
                break;
            case 2:
                ((InterfaceC23483) this.f10189).accept(this.f10187);
                break;
            default:
                C9068.m23407((C6951) this.f10189, (ArrayList) this.f10187);
                break;
        }
    }
}
