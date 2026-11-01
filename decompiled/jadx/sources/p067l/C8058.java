package p067l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H52M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8058 extends AbstractC12811 implements InterfaceC17625 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC3167 f21275 = EnumC3167.f5900;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractCollection f21276;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089;
    }

    public C8058(ArrayList arrayList) {
        super(f21275);
        if (arrayList == null) {
            this.f21276 = AbstractC16192.m36872of();
        } else {
            this.f21276 = C9468.m21989(arrayList, new C12082(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // p067l.InterfaceC18811
    /* JADX INFO: renamed from: ۙ */
    public final List mo10139() {
        return this.f21276;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // p067l.AbstractC9476, p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public final int mo6216() {
        return (this.f21276.size() * 4) + 2;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f21275.f6090;
    }
}
