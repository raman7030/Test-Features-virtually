package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5955 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f18257;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f18258;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f18259;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C5955(String str, byte[] bArr, String str2) {
        this.f18257 = bArr;
        this.f18258 = str;
        this.f18259 = str2;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        String str = this.f18258;
        if (str != null) {
            c18252.m42586(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5955.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18257, ((C5955) obj).f18257);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18257);
    }

    public final String toString() {
        return C3200.m9831(this.f18257.length, "\"", C3435.m10501("ICY: title=\"", this.f18258, "\", url=\"", this.f18259, "\", rawMetadata.length=\""));
    }
}
