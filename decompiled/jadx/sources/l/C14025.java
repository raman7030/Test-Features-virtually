package l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14025 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f42411 = new C17714();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20377 f42410 = new C20377();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C3443 c3443M51479;
        C17714 c17714 = this.f42411;
        c17714.m41462(i2 + i, bArr);
        c17714.m41484(i);
        ArrayList arrayList = new ArrayList();
        try {
            C7676.m20561(c17714);
            while (!TextUtils.isEmpty(c17714.m41474(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iM41485 = 0;
                while (b == -1) {
                    iM41485 = c17714.m41485();
                    String strM41474 = c17714.m41474(StandardCharsets.UTF_8);
                    if (strM41474 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM41474)) {
                        b = 2;
                    } else {
                        b = strM41474.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c17714.m41484(iM41485);
                if (b == 0) {
                    C5811.m16314(new C10646(arrayList2), c21062, interfaceC23483);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(c17714.m41474(StandardCharsets.UTF_8))) {
                    }
                } else if (b == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    c17714.m41474(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f42410.m46694(c17714));
                } else if (b == 3 && (c3443M51479 = C23198.m51479(c17714, arrayList)) != null) {
                    arrayList2.add(c3443M51479);
                }
            }
        } catch (C9080 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
