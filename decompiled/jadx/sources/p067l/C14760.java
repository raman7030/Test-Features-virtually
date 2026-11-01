package p067l;

/* JADX INFO: renamed from: l.۬ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14760 {

    /* JADX INFO: renamed from: ֫ */
    public static final int f42087;

    /* JADX INFO: renamed from: ۧ */
    public static final int f42088;

    /* JADX INFO: renamed from: ܽ */
    public static final String f42089 = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* JADX INFO: renamed from: ᩳ */
    public static final String f42091 = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* JADX INFO: renamed from: ܿ */
    public static final int f42090 = Integer.getInteger("net.mdns.port", 5353).intValue();

    static {
        int iIntValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f42088 = iIntValue;
        f42087 = iIntValue * 500;
    }
}
