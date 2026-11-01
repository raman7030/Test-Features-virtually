package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13393 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f37580;

    /* JADX INFO: renamed from: ܽ */
    public final String f37581;

    /* JADX INFO: renamed from: ܿ */
    public final int f37582;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f37583;

    public C13393(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f37581 = str;
        this.f37580 = str2;
        this.f37582 = i;
        this.f37583 = bArr;
    }

    @Override // p067l.AbstractC16269, p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        c19715.m44827(this.f37582, this.f37583);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13393.class == obj.getClass()) {
            C13393 c13393 = (C13393) obj;
            if (this.f37582 == c13393.f37582 && C12826.equals(this.f37581, c13393.f37581) && C12826.equals(this.f37580, c13393.f37580) && Arrays.equals(this.f37583, c13393.f37583)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f37582 + 527) * 31;
        String str = this.f37581;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f37580;
        return Arrays.hashCode(this.f37583) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": mimeType=" + this.f37581 + ", description=" + this.f37580;
    }
}
