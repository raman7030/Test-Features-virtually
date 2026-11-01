package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59EU */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8771 implements InterfaceC22910 {
    FILE_SHARE_READ(1),
    FILE_SHARE_WRITE(2),
    FILE_SHARE_DELETE(4);


    /* JADX INFO: renamed from: ᩶ */
    public static final Set f23812 = C21562.unmodifiableSet(EnumSet.allOf(EnumC8771.class));

    /* JADX INFO: renamed from: ᩸ */
    public long f23814;

    EnumC8771(long j) {
        this.f23814 = j;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f23814;
    }
}
