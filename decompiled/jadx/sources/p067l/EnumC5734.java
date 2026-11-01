package p067l;

/* JADX INFO: renamed from: l.ۗ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9EC */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5734 implements InterfaceC22910 {
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


    /* JADX INFO: renamed from: ᩸ */
    public final long f14057;

    EnumC5734(long j) {
        this.f14057 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f14057;
    }
}
