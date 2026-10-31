package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ܽ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f50741;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13921 f50742;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50743;

    public /* synthetic */ C16513(C16431 c16431, AbstractC13921 abstractC13921, String str) {
        this.f50741 = c16431;
        this.f50742 = abstractC13921;
        this.f50743 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14396 m38892(C4951 c4951, C21885 c21885) {
        Uri uriM22231 = C8542.m22231(c4951.f31806, c21885.f73022);
        C9459.m24311(uriM22231);
        InterfaceC17889 interfaceC17889M38737 = this.f50741.m38737(uriM22231);
        long j = c21885.f73021;
        long j2 = c21885.f73020;
        long size = interfaceC17889M38737.getSize();
        if (j < 0) {
            throw new C20748("HLS resource offset is invalid");
        }
        if (j2 == -1) {
            if (size < j) {
                throw new C20748("HLS resource length is unknown");
            }
            j2 = size - j;
        }
        long j3 = j2;
        if (j3 <= 0 || j > C13132.FOREVER_NS - j3 || (size >= 0 && (j > size || j3 > size - j))) {
            throw new C20748("HLS resource range is invalid");
        }
        return new C14396(uriM22231, C20892.m47725(this.f50742, interfaceC17889M38737, this.f50743), j, j3);
    }
}
