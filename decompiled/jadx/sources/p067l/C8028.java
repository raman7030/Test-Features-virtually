package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8028 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f21112;

    /* JADX INFO: renamed from: ۧ */
    public final String f21113;

    /* JADX INFO: renamed from: ܽ */
    public final String f21114;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C8028(String str, byte[] bArr, String str2) {
        this.f21112 = bArr;
        this.f21113 = str;
        this.f21114 = str2;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        String str = this.f21113;
        if (str != null) {
            c19715.m44845(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8028.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21112, ((C8028) obj).f21112);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21112);
    }

    public final String toString() {
        return C5410.m11876(this.f21112.length, "\"", C5633.m12525("ICY: title=\"", this.f21113, "\", url=\"", this.f21114, "\", rawMetadata.length=\""));
    }
}
