package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1178 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4231;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4232;

    public /* synthetic */ C1178(int i, Object obj) {
        this.f4231 = i;
        this.f4232 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4231) {
            case 0:
                ((ViewOnClickListenerC7528) this.f4232).f23162.m11401().mo1669((String) obj);
                break;
            default:
                ((StringBuilder) this.f4232).append((String) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
