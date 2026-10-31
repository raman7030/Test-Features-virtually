package l;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.۟ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7515 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11816 f23124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23125;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13864 f23126;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20155(String str, String str2) {
        this.f23125.add(C1687.m5687(str, null, AbstractC2393.m7754((C13864) null, str2)));
    }

    public C7515() {
        String string = UUID.randomUUID().toString();
        this.f23126 = C10860.f32620;
        this.f23125 = new ArrayList();
        this.f23124 = C11816.m28900(string);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20157(C13864 c13864) {
        if (c13864 == null) {
            throw new NullPointerException("type == null");
        }
        if (!c13864.m33218().equals("multipart")) {
            throw new IllegalArgumentException("multipart != " + c13864);
        }
        this.f23126 = c13864;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20156(String str, String str2, AbstractC2393 abstractC2393) {
        this.f23125.add(C1687.m5687(str, str2, abstractC2393));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10860 m20154() {
        ArrayList arrayList = this.f23125;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C10860(this.f23124, this.f23126, arrayList);
    }
}
