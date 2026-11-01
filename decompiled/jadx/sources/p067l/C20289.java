package p067l;

import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857H */
/* JADX INFO: loaded from: classes5.dex */
public final class C20289 extends AbstractC22218 implements InterfaceC20389 {

    /* JADX INFO: renamed from: ۗ */
    public static final Comparator f62686 = new C6207();

    /* JADX INFO: renamed from: ۙ */
    public final String f62687;

    /* JADX INFO: renamed from: ᩶ */
    public final int f62688;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC8146 f62689 = AbstractC8146.m18915of();

    /* JADX INFO: renamed from: ᩹ */
    public String f62690;

    @Override // p067l.AbstractC22218, p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getSignature() {
        return null;
    }

    public C20289(int i, String str) {
        this.f62688 = i;
        this.f62687 = str;
    }

    @Override // p067l.InterfaceC20389
    /* JADX INFO: renamed from: ֫ */
    public final int mo22435() {
        return this.f62688;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return this.f62687;
    }

    @Override // p067l.InterfaceC2461
    public final Set getAnnotations() {
        return this.f62689;
    }

    @Override // p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getName() {
        return this.f62690;
    }
}
