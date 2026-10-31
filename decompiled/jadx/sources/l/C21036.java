package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21036 extends AbstractC14534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20372 f67877 = new C6924();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC17486 f67878;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f67879;

    public C21036(String str, InterfaceC10410 interfaceC10410) {
        this.f67879 = str;
        this.f67878 = C23836.m52534(interfaceC10410);
    }

    public C21036(String str, InterfaceC17486 interfaceC17486) {
        this.f67879 = str;
        this.f67878 = interfaceC17486;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m47863(Collection collection) {
        return f67877.m46689((Iterable) collection);
    }

    @Override // l.InterfaceC9272
    public final String getName() {
        return this.f67879;
    }

    @Override // l.InterfaceC9272
    public final InterfaceC10410 getValue() {
        return this.f67878;
    }
}
