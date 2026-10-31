package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AWR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16876 implements InterfaceC7767, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f51784;

    public AbstractC16876(int i) {
        this.f51784 = i;
    }

    @Override // l.InterfaceC7767
    /* JADX INFO: renamed from: ܳ */
    public final int mo6745() {
        return this.f51784;
    }

    public final String toString() {
        String strM18934 = C6999.m18934(this);
        C11233.m27803(strM18934, "renderLambdaToString(...)");
        return strM18934;
    }
}
