package l;

import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۗۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3139 extends C4550 implements RandomAccess {
    public static final long serialVersionUID = 0;

    @Override // l.C4550, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        return new C3139(this.f14520.subList(i, i2));
    }
}
