package l;

import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857H */
/* JADX INFO: loaded from: classes5.dex */
public final class C18856 extends AbstractC20886 implements InterfaceC18961 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Comparator f59457 = new C4039();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59459;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC6079 f59460 = AbstractC6079.of();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f59461;

    @Override // l.AbstractC20886, l.InterfaceC0098, l.InterfaceC21972
    public final String getSignature() {
        return null;
    }

    public C18856(int i, String str) {
        this.f59459 = i;
        this.f59458 = str;
    }

    @Override // l.InterfaceC18961
    /* JADX INFO: renamed from: ֫ */
    public final int mo20455() {
        return this.f59459;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return this.f59458;
    }

    @Override // l.InterfaceC0098
    public final Set getAnnotations() {
        return this.f59460;
    }

    @Override // l.InterfaceC0098, l.InterfaceC21972
    public final String getName() {
        return this.f59461;
    }
}
