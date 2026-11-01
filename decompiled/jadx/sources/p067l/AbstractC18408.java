package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AWR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18408 implements InterfaceC9751, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f54965;

    public AbstractC18408(int i) {
        this.f54965 = i;
    }

    @Override // p067l.InterfaceC9751
    /* JADX INFO: renamed from: ܳ */
    public final int mo8871() {
        return this.f54965;
    }

    public final String toString() {
        String strM20891 = C9021.m20891(this);
        C13045.m29865(strM20891, "renderLambdaToString(...)");
        return strM20891;
    }
}
