package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11600 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f34582;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f34583;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f34584;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f34585;

    public C11600(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f34583 = str;
        this.f34582 = str2;
        this.f34584 = i;
        this.f34585 = bArr;
    }

    @Override // l.AbstractC14626, l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        c18252.m42568(this.f34584, this.f34585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11600.class == obj.getClass()) {
            C11600 c11600 = (C11600) obj;
            if (this.f34584 == c11600.f34584 && C11003.equals(this.f34583, c11600.f34583) && C11003.equals(this.f34582, c11600.f34582) && Arrays.equals(this.f34585, c11600.f34585)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f34584 + 527) * 31;
        String str = this.f34583;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34582;
        return Arrays.hashCode(this.f34585) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": mimeType=" + this.f34583 + ", description=" + this.f34582;
    }
}
