package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܽ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16848 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Inflater f51714;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f51711 = new C17714();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f51713 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11205 f51712 = new C11205();

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
        C17714 c17714 = this.f51711;
        c17714.m41462(i2 + i, bArr);
        c17714.m41484(i);
        if (this.f51714 == null) {
            this.f51714 = new Inflater();
        }
        Inflater inflater = this.f51714;
        String str = C3603.f11424;
        if (c17714.m41457() > 0 && c17714.m41477() == 120) {
            C17714 c17715 = this.f51713;
            if (C3603.m11032(c17714, c17715, inflater)) {
                c17714.m41462(c17715.m41483(), c17715.m41482());
            }
        }
        C11205 c11205 = this.f51712;
        c11205.m27777();
        ArrayList arrayList = new ArrayList();
        while (c17714.m41457() >= 3) {
            int iM41483 = c17714.m41483();
            int iM41456 = c17714.m41456();
            int iM41464 = c17714.m41464();
            int iM41485 = c17714.m41485() + iM41464;
            C19811 c19811 = null;
            if (iM41485 > iM41483) {
                c17714.m41484(iM41483);
            } else {
                if (iM41456 != 128) {
                    switch (iM41456) {
                        case 20:
                            C11205.m27775(c11205, c17714, iM41464);
                            break;
                        case 21:
                            C11205.m27773(c11205, c17714, iM41464);
                            break;
                        case 22:
                            C11205.m27774(c11205, c17714, iM41464);
                            break;
                    }
                } else {
                    C19811 c19811M27776 = c11205.m27776();
                    c11205.m27777();
                    c19811 = c19811M27776;
                }
                c17714.m41484(iM41485);
            }
            if (c19811 != null) {
                arrayList.add(c19811);
            }
        }
        interfaceC23483.accept(new C12866(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
