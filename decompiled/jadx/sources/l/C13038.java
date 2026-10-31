package l;

/* JADX INFO: renamed from: l.۬ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13038 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f39041;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f39042;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f39043 = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f39045 = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f39044 = Integer.getInteger("net.mdns.port", 5353).intValue();

    static {
        int iIntValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f39042 = iIntValue;
        f39041 = iIntValue * 500;
    }
}
