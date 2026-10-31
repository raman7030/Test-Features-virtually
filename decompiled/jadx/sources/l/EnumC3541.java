package l;

/* JADX INFO: renamed from: l.ۗ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9EC */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3541 implements InterfaceC21614 {
    MsvAvEOL(0),
    MsvAvNbComputerName(1),
    MsvAvNbDomainName(2),
    MsvAvDnsComputerName(3),
    MsvAvDnsDomainName(4),
    MsvAvDnsTreeName(5),
    MsvAvFlags(6),
    MsvAvTimestamp(7),
    MsvAvSingleHost(8),
    MsvAvTargetName(9),
    MsvAvChannelBindings(10);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f11251;

    EnumC3541(long j) {
        this.f11251 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f11251;
    }
}
