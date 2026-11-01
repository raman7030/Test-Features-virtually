package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ܽ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18062 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C17984 f53920;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC15599 f53921;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f53922;

    public /* synthetic */ C18062(C17984 c17984, AbstractC15599 abstractC15599, String str) {
        this.f53920 = c17984;
        this.f53921 = abstractC15599;
        this.f53922 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16050 m41118(C7074 c7074, C23168 c23168) {
        Uri uriM24199 = C10486.m24199(c7074.f34777, c23168.f75749);
        C11358.m26321(uriM24199);
        InterfaceC19370 interfaceC19370M40962 = this.f53920.m40962(uriM24199);
        long j = c23168.f75748;
        long j2 = c23168.f75747;
        long size = interfaceC19370M40962.getSize();
        if (j < 0) {
            throw new C22087("HLS resource offset is invalid");
        }
        if (j2 == -1) {
            if (size < j) {
                throw new C22087("HLS resource length is unknown");
            }
            j2 = size - j;
        }
        long j3 = j2;
        if (j3 <= 0 || j > C14849.FOREVER_NS - j3 || (size >= 0 && (j > size || j3 > size - j))) {
            throw new C22087("HLS resource range is invalid");
        }
        return new C16050(uriM24199, C22224.m50055(this.f53921, interfaceC19370M40962, this.f53922), j, j3);
    }
}
