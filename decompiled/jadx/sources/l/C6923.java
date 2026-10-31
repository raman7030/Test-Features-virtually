package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6923 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f21374 = C11321.m27961(C6923.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f21375;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12216 f21376;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13935 f21377;

    public C6923(C13935 c13935, C12216 c12216, String str) {
        this.f21377 = c13935;
        this.f21376 = c12216;
        this.f21375 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6613 m18727(long j, int i, byte[] bArr) {
        C20993 c20993 = new C20993(j, i, bArr);
        ArrayList arrayList = new ArrayList();
        while (c20993.m47804()) {
            f21374.mo7082("Sending async write request to {} from offset {}", this.f21375, Long.valueOf(c20993.m24675()));
            arrayList.add(new C6613(this.f21377.m8411(this.f21376, c20993), new C14683(c20993.m24674())));
        }
        return new C6613(new C23546(arrayList), new C23856());
    }
}
