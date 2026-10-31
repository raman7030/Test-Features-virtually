package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܳۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14318 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f43181;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383[] f43182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23565 f43183 = new C23565(new C15000(1, this));

    public C14318(List list) {
        this.f43181 = list;
        this.f43182 = new InterfaceC19383[list.size()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34185(InterfaceC21830 interfaceC21830, C19259 c19259) {
        int i = 0;
        while (true) {
            InterfaceC19383[] interfaceC19383Arr = this.f43182;
            if (i >= interfaceC19383Arr.length) {
                return;
            }
            c19259.m44443();
            InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 3);
            C8353 c8353 = (C8353) this.f43181.get(i);
            String str = c8353.f25614;
            C22632.m50630("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strM44444 = c8353.f25621;
            if (strM44444 == null) {
                strM44444 = c19259.m44444();
            }
            C1297 c1297 = new C1297();
            c1297.m4469(strM44444);
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
    public final void m34183(int i) {
        this.f43183.m52032(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34184(long j, C17714 c17714) {
        this.f43183.m52033(j, c17714);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34186() {
        this.f43183.m52034();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34182() {
        this.f43183.m52034();
    }
}
