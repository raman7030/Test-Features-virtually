package p067l;

/* JADX INFO: renamed from: l.ۜۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E88Z */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8595 implements InterfaceC22910 {
    REQUEST(0),
    PING(1),
    RESPONSE(2),
    FAULT(3),
    WORKING(4),
    NOCALL(5),
    REJECT(6),
    ACK(7),
    CL_CANCEL(8),
    FACK(9),
    CANCEL_ACK(10),
    BIND(11),
    BIND_ACK(12),
    BIND_NAK(13),
    ALTER_CONTEXT(14),
    ALTER_CONTEXT_RESP(15),
    SHUTDOWN(17),
    CO_CANCEL(18),
    ORPHANED(19);


    /* JADX INFO: renamed from: ᩸ */
    public final int f23104;

    EnumC8595(int i) {
        this.f23104 = i;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f23104;
    }
}
