package l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18JT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0913 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f3494;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383[] f3495;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23565 f3496;

    public C0913(List list) {
        this.f3494 = list;
        this.f3495 = new InterfaceC19383[list.size()];
        C23565 c23565 = new C23565(new InterfaceC14392() { // from class: l.ۚۚۧ
            @Override // l.InterfaceC14392
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo14710(long j, C17714 c17714) {
                C7013.m18948(j, c17714, this.f16088.f3495);
            }
        });
        this.f3496 = c23565;
        c23565.m52032(3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3268(InterfaceC21830 interfaceC21830, C19259 c19259) {
        int i = 0;
        while (true) {
            InterfaceC19383[] interfaceC19383Arr = this.f3495;
            if (i >= interfaceC19383Arr.length) {
                return;
            }
            c19259.m44443();
            InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 3);
            C8353 c8353 = (C8353) this.f3494.get(i);
            String str = c8353.f25614;
            C22632.m50630("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C1297 c1297 = new C1297();
            c1297.m4469(c19259.m44444());
            c1297.m4462("video/mp2t");
            c1297.m4465(str);
            c1297.m4466(c8353.f25628);
            c1297.m4471(c8353.f25603);
            c1297.m4442(c8353.f25598);
            c1297.m4446(c8353.f25634);
            interfaceC19383Mo3429.mo8456(c1297.m4440());
            interfaceC19383Arr[i] = interfaceC19383Mo3429;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3267(long j, C17714 c17714) {
        if (c17714.m41457() < 9) {
            return;
        }
        int iM41493 = c17714.m41493();
        int iM41494 = c17714.m41493();
        int iM41456 = c17714.m41456();
        if (iM41493 == 434 && iM41494 == 1195456820 && iM41456 == 3) {
            this.f3496.m52033(j, c17714);
        }
    }
}
