package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2835 extends AbstractC3506 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23623 f4887;

    public C2835(C23623 c23623) {
        this.f4887 = c23623;
    }

    @Override // p067l.AbstractC3506
    /* JADX INFO: renamed from: ֫ */
    public final void mo4532(C18258 c18258) {
        C23623 c23623 = this.f4887;
        HashSet hashSet = c23623.f75188;
        if (hashSet != null) {
            hashSet.remove(c18258.mo31353());
        }
        int i = C20942.f65816[c18258.m41589().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i != 2) {
            if (i == 3) {
                if (c23623.f75184 || c18258.m41583()) {
                    if (c23623.f75177 < c23623.f75189) {
                        c23623.m52461(c18258);
                        c23623.f75177++;
                    } else {
                        c23623.f75192++;
                    }
                }
            } else if (i == 4 && (c18258.m41582(EnumC21417.API) || C23623.m52445(c23623, c18258))) {
                if (c23623.f75180 < c23623.f75190) {
                    c23623.m52461(c18258);
                    c23623.f75180++;
                } else {
                    c23623.f75191++;
                }
            }
        } else if ((c23623.f75184 || c18258.m41583()) && !c23623.f75187) {
            c23623.m52461(c18258);
        }
        if (c18258.m41582(EnumC21417.COMPRESSED)) {
            c23623.f75186 = true;
        }
    }
}
