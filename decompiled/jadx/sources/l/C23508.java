package l;

/* JADX INFO: renamed from: l.᩻ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes.dex */
public final class C23508 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f75457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f75458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14335 f75459;

    public C23508(String str, C14335 c14335, long j) {
        this.f75458 = str;
        this.f75459 = c14335;
        this.f75457 = j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23508 m51947(C12951 c12951) {
        C14335 c14335;
        long j;
        C14335 c14335M47301;
        String strM31506 = c12951.m31506();
        int i = c12951.readByte() & 255;
        int i2 = c12951.readInt();
        String strM31503 = c12951.m31503();
        C14335 c14336 = null;
        if (i != 1) {
            if (i == 2) {
                c14335 = new C14335(EnumC6575.TRACK, i2, null);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown selection type");
                }
                if (strM31503 != null) {
                    c14336 = new C14335(EnumC6575.FILE, -1, strM31503);
                }
            }
            if (c14336 != null) {
                throw new IllegalArgumentException("Invalid selection data");
            }
            j = c12951.readLong();
            c14335M47301 = C20687.m47301(c14336);
            if (c14335M47301 != null) {
                throw new IllegalArgumentException("Invalid selection payload");
            }
            return new C23508(strM31506, c14335M47301, j);
        }
        c14335 = new C14335(EnumC6575.OFF, -1, null);
        c14336 = c14335;
        if (c14336 != null) {
            throw new IllegalArgumentException("Invalid selection data");
        }
        j = c12951.readLong();
        c14335M47301 = C20687.m47301(c14336);
        if (c14335M47301 != null) {
            throw new IllegalArgumentException("Invalid selection payload");
        }
        return new C23508(strM31506, c14335M47301, j);
    }
}
