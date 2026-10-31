package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59EU */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6737 implements InterfaceC21614 {
    FILE_SHARE_READ(1),
    FILE_SHARE_WRITE(2),
    FILE_SHARE_DELETE(4);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Set f20938 = C20195.unmodifiableSet(EnumSet.allOf(EnumC6737.class));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f20940;

    EnumC6737(long j) {
        this.f20940 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f20940;
    }
}
