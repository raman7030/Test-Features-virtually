package p067l;

import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۗۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5352 extends C6693 implements RandomAccess {
    public static final long serialVersionUID = 0;

    @Override // p067l.C6693, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        return new C5352(this.f17350.subList(i, i2));
    }
}
