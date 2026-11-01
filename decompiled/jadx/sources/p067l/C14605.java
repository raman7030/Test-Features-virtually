package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;

/* JADX INFO: renamed from: l.۬ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AF6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14605 extends AbstractC18707 {

    /* JADX INFO: renamed from: ۧ֫ */
    public C18028 f41693;

    public C14605(C13801 c13801, String str) {
        super(c13801.m31453(), str, c13801.m31454(), c13801.m31455(), c13801.m31452(), !c13801.m31451());
        if ((c13801.m31448().m7969() & 4) != 0) {
            String[] strArrSplit = c13801.m31456().split("\\s+", 5);
            if (strArrSplit.length == 5) {
                int i = 0;
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[2];
                String str4 = strArrSplit[3];
                if (str2.length() != 10) {
                    return;
                }
                try {
                    int iM29222 = C12710.m29222(str2.substring(1));
                    char cCharAt = str2.charAt(0);
                    if (cCharAt == '-') {
                        i = 32768;
                    } else if (cCharAt == 'l') {
                        i = 40960;
                    } else if (cCharAt == 'p') {
                        i = 4096;
                    } else if (cCharAt != 's') {
                        switch (cCharAt) {
                            case 'b':
                                i = 24576;
                                break;
                            case C0254q.f1216f /* 99 */:
                                i = 8192;
                                break;
                            case 'd':
                                i = 16384;
                                break;
                        }
                    } else {
                        i = 49152;
                    }
                    if (i == 0) {
                        return;
                    }
                    this.f41693 = new C18028(i | iM29222, str3, str4);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public final C18028 mo26440() {
        return this.f41693;
    }

    @Override // p067l.AbstractC18707
    /* JADX INFO: renamed from: ֫ */
    public final void mo31924(C18028 c18028) {
        if (this.f41693 == null) {
            throw new UnsupportedOperationException();
        }
        this.f41693 = c18028;
    }
}
