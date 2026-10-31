package l;

import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18084 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56320;

    public /* synthetic */ C18084(int i, Object obj) {
        this.f56319 = i;
        this.f56320 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f56319) {
            case 0:
                C3267.m10027((C3267) this.f56320, (Set) obj);
                break;
            default:
                ((C19207) this.f56320).m44288(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
