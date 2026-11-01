package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes2.dex */
public class C4535 {

    /* JADX INFO: renamed from: ֫ */
    public C23311 f10161;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f10162 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public C23311 f10163;

    /* JADX INFO: renamed from: ܿ */
    public C6547 f10164;

    /* JADX INFO: renamed from: ᩳ */
    public C6508 f10165;

    public C4535(C5876 c5876, C6508 c6508) {
        this.f10165 = c6508;
        this.f10164 = c5876.f14447;
        C23311 c23311 = C6547.f16897;
        this.f10161 = c23311;
        this.f10163 = c23311;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C23311 m9588(int i) {
        if (i == 0) {
            return this.f10163;
        }
        ArrayList arrayList = this.f10162;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(this.f10165.m14932());
        }
        return (C23311) arrayList.get(i - 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C23311 m9591() {
        return this.f10161;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9589() {
        this.f10161 = this.f10163;
        ArrayList arrayList = this.f10162;
        if (!arrayList.isEmpty()) {
            this.f10163 = (C23311) arrayList.remove(0);
        } else {
            this.f10163 = this.f10165.m14932();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C23311 m9590() {
        C23311 c23311 = this.f10163;
        int i = c23311.f73358;
        EnumC21300 enumC21300 = c23311.f73357;
        if (enumC21300.f67120.length() < 2 || enumC21300.f67121 != EnumC22641.DEFAULT) {
            throw new AssertionError("Cant split" + enumC21300);
        }
        String strSubstring = enumC21300.f67120.substring(0, 1);
        C6547 c6547 = this.f10164;
        EnumC21300 enumC21300M14988 = c6547.m14988(strSubstring);
        EnumC21300 enumC21300M14989 = c6547.m14988(enumC21300.f67120.substring(1));
        if (enumC21300M14988 == null || enumC21300M14989 == null) {
            throw new AssertionError("Cant split - bad subtokens");
        }
        C23311[] c23311Arr = {new C23311(enumC21300M14988, i, enumC21300M14988.f67120.length() + i, c23311.f73355), new C23311(enumC21300M14989, enumC21300M14988.f67120.length() + i, c23311.f73356, null)};
        this.f10161 = c23311Arr[0];
        C23311 c23312 = c23311Arr[1];
        this.f10163 = c23312;
        return c23312;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15575 m9587() {
        return this.f10165.mo14933();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9585() {
        return this.f10165.f16822;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9586(int i) {
        this.f10165.f16822 = i;
    }
}
