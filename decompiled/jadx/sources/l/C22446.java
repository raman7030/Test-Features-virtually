package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IA */
/* JADX INFO: loaded from: classes2.dex */
public final class C22446 extends AbstractC8891 implements InterfaceC12568 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3396 f72699;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f72700;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f72701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4807 f72702;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f72703;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f72704;

    public C22446(String str, C4807 c4807, String str2, C3396 c3396, ArrayList arrayList) {
        int i;
        this.f72701 = str;
        this.f72702 = C4807.m14019(c4807);
        this.f72700 = str2;
        this.f72699 = C3396.m10363(c3396);
        this.f72703 = C23836.m52532(arrayList);
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f72704 = i;
    }

    @Override // l.InterfaceC4060
    public final String getName() {
        return this.f72701;
    }

    @Override // l.InterfaceC4060
    public final int getIndex() {
        return this.f72704;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19583 mo12184() {
        return this.f72702;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ܺ */
    public final String mo12183() {
        return this.f72700;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC0531 mo12182() {
        return this.f72699;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۢ */
    public final List mo12181() {
        return this.f72703;
    }
}
