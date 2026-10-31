package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9484 extends AbstractC20773 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28816;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17714 f28817;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f28818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17714 f28819;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f28820;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f28821;

    public C9484(InterfaceC19383 interfaceC19383) {
        super(interfaceC19383);
        this.f28817 = new C17714(C16509.f50737);
        this.f28819 = new C17714(4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24325(C17714 c17714) throws C6661 {
        int iM41456 = c17714.m41456();
        int i = (iM41456 >> 4) & 15;
        int i2 = iM41456 & 15;
        if (i2 != 7) {
            throw new C6661(C19370.m44628(i2, "Video format not supported: "));
        }
        this.f28816 = i;
        return i != 5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24324(long j, C17714 c17714) {
        int iM41456 = c17714.m41456();
        long jM41468 = (((long) c17714.m41468()) * 1000) + j;
        InterfaceC19383 interfaceC19383 = this.f67280;
        if (iM41456 == 0 && !this.f28818) {
            C17714 c17715 = new C17714(new byte[c17714.m41457()]);
            c17714.m41461(0, c17714.m41457(), c17715.m41482());
            C7304 c7304M19582 = C7304.m19582(c17715);
            this.f28821 = c7304M19582.f22417;
            C1297 c1297 = new C1297();
            c1297.m4462("video/x-flv");
            c1297.m4465("video/avc");
            c1297.m4445(c7304M19582.f22421);
            c1297.m4453(c7304M19582.f22420);
            c1297.m4457(c7304M19582.f22425);
            c1297.m4460(c7304M19582.f22416);
            c1297.m4446((List) c7304M19582.f22415);
            interfaceC19383.mo8456(c1297.m4440());
            this.f28818 = true;
            return false;
        }
        if (iM41456 == 1 && this.f28818) {
            int i = this.f28816 == 1 ? 1 : 0;
            if (this.f28820 || i != 0) {
                C17714 c17716 = this.f28819;
                byte[] bArrM41482 = c17716.m41482();
                bArrM41482[0] = 0;
                bArrM41482[1] = 0;
                bArrM41482[2] = 0;
                int i2 = 4 - this.f28821;
                int i3 = 0;
                while (c17714.m41457() > 0) {
                    c17714.m41461(i2, this.f28821, c17716.m41482());
                    c17716.m41484(0);
                    int iM41492 = c17716.m41492();
                    C17714 c17717 = this.f28817;
                    c17717.m41484(0);
                    interfaceC19383.mo8453(4, c17717);
                    interfaceC19383.mo8453(iM41492, c17714);
                    i3 = i3 + 4 + iM41492;
                }
                this.f67280.mo8455(jM41468, i, i3, 0, null);
                this.f28820 = true;
                return true;
            }
        }
        return false;
    }
}
