package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.֫᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C2024 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f6748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f6749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f6750;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f6751;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6752;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f6753;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Uri f6754;

    public C2024(C7647 c7647) {
        this.f6754 = c7647.f23618;
        this.f6753 = c7647.f23617;
        this.f6751 = c7647.f23615;
        this.f6750 = c7647.f23614;
        this.f6752 = c7647.f23616;
        this.f6749 = c7647.f23613;
        this.f6748 = c7647.f23612;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2024)) {
            return false;
        }
        C2024 c2024 = (C2024) obj;
        return this.f6754.equals(c2024.f6754) && C11003.equals(this.f6753, c2024.f6753) && C11003.equals(this.f6751, c2024.f6751) && this.f6750 == c2024.f6750 && this.f6752 == c2024.f6752 && C11003.equals(this.f6749, c2024.f6749) && C11003.equals(this.f6748, c2024.f6748);
    }

    public final int hashCode() {
        int iHashCode = this.f6754.hashCode() * 31;
        String str = this.f6753;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6751;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f6750) * 31) + this.f6752) * 31;
        String str3 = this.f6749;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6748;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    static {
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
    }
}
