package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۟֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes2.dex */
public final class C9163 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24826;

    /* JADX INFO: renamed from: ۧ */
    public final C13598 f24827;

    /* JADX INFO: renamed from: ܽ */
    public final C13598 f24828;

    /* JADX INFO: renamed from: ᩳ */
    public static final C13598 f24823 = C13598.m30949(":");

    /* JADX INFO: renamed from: ܿ */
    public static final C13598 f24822 = C13598.m30949(":status");

    /* JADX INFO: renamed from: ᩻ */
    public static final C13598 f24825 = C13598.m30949(":method");

    /* JADX INFO: renamed from: ۜ */
    public static final C13598 f24820 = C13598.m30949(":path");

    /* JADX INFO: renamed from: ᩷ */
    public static final C13598 f24824 = C13598.m30949(":scheme");

    /* JADX INFO: renamed from: ܳ */
    public static final C13598 f24821 = C13598.m30949(":authority");

    public C9163(String str, String str2) {
        this(C13598.m30949(str), C13598.m30949(str2));
    }

    public C9163(C13598 c13598, String str) {
        this(c13598, C13598.m30949(str));
    }

    public C9163(C13598 c13598, C13598 c13599) {
        this.f24827 = c13598;
        this.f24828 = c13599;
        this.f24826 = c13599.mo4707() + c13598.mo4707() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9163) {
            C9163 c9163 = (C9163) obj;
            if (this.f24827.equals(c9163.f24827) && this.f24828.equals(c9163.f24828)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f24828.hashCode() + ((this.f24827.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strMo4706 = this.f24827.mo4706();
        String strMo4707 = this.f24828.mo4706();
        byte[] bArr = C21407.f67526;
        Locale locale = Locale.US;
        return C24104.m53357(strMo4706, ": ", strMo4707);
    }
}
