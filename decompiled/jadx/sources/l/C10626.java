package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C10626 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20504 f31913;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22390 f31914;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f31915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f31916;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14152 f31917;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20316 f31918;

    public C10626(C22390 c22390, C20316 c20316, boolean z, InterfaceC10711 interfaceC10711) {
        super(4, -1);
        if (c20316 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f31914 = c22390;
        this.f31918 = c20316;
        this.f31915 = z;
        this.f31916 = interfaceC10711;
        this.f31913 = null;
        this.f31917 = null;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CODE_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C4484 c4484M5614 = c1662.m5614();
        C16892 c16892M5632 = c1662.m5632();
        C20316 c20316 = this.f31918;
        if (c20316.m46605() || c20316.m46599()) {
            C14152 c14152 = new C14152(c20316, this.f31915, this.f31914);
            this.f31917 = c14152;
            c4484M5614.m13220((AbstractC3073) c14152);
        }
        if (c20316.m46606()) {
            Iterator it = c20316.m46597().iterator();
            while (it.hasNext()) {
                c16892M5632.m39751((C7573) it.next());
            }
            this.f31913 = new C20504(c20316);
        }
        Iterator it2 = c20316.m46602().iterator();
        while (it2.hasNext()) {
            c1662.m5625((AbstractC13717) it2.next());
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f31914.mo2463() + l.d;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f31914.mo2463();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        int iM46979;
        C1662 c1662M16521 = c4484.m16521();
        C12742 c12742 = new C12742(c1662M16521);
        C20316 c20316 = this.f31918;
        c20316.m46598(c12742);
        C20504 c20504 = this.f31913;
        if (c20504 != null) {
            c20504.m46977(c1662M16521);
            iM46979 = this.f31913.m46979();
        } else {
            iM46979 = 0;
        }
        int iM10315 = c20316.m46604().m10315();
        if ((iM10315 & 1) != 0) {
            iM10315++;
        }
        m9389((iM10315 * 2) + 16 + iM46979);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        int i;
        String string;
        boolean zM42506 = c18241.m42506();
        C20316 c20316 = this.f31918;
        int iM10318 = c20316.m46604().m10318();
        int iM10317 = c20316.m46604().m10317();
        boolean z = this.f31915;
        C22390 c22390 = this.f31914;
        int iM33357 = c22390.m39385(z).m51259().m33357();
        int iM10315 = c20316.m46604().m10315();
        boolean z2 = (iM10315 & 1) != 0;
        C20504 c20504 = this.f31913;
        int iM46976 = c20504 == null ? 0 : c20504.m46976();
        C14152 c14152 = this.f31917;
        int iM9390 = c14152 == null ? 0 : c14152.m9390();
        if (zM42506) {
            c18241.m42501(0, m9391() + ' ' + c22390.mo2463());
            c18241.m42501(2, "  registers_size: ".concat(C14712.m35006(iM10318)));
            c18241.m42501(2, "  ins_size:       ".concat(C14712.m35006(iM33357)));
            c18241.m42501(2, "  outs_size:      ".concat(C14712.m35006(iM10317)));
            c18241.m42501(2, "  tries_size:     ".concat(C14712.m35006(iM46976)));
            c18241.m42501(4, "  debug_off:      ".concat(C14712.m35008(iM9390)));
            c18241.m42501(4, "  insns_size:     ".concat(C14712.m35008(iM10315)));
            InterfaceC10711 interfaceC10711 = this.f31916;
            if (interfaceC10711.size() != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int size = interfaceC10711.size();
                if (size == 0) {
                    string = "<empty>";
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        if (i2 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(interfaceC10711.getType(i2).mo2463());
                        i2++;
                        size = i3;
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                c18241.m42501(0, sb.toString());
            } else {
                c22390 = c22390;
            }
        } else {
            c22390 = c22390;
        }
        c18241.m42511(iM10318);
        c18241.m42511(iM33357);
        c18241.m42511(iM10317);
        c18241.m42511(iM46976);
        c18241.m42514(iM9390);
        c18241.m42514(iM10315);
        try {
            c20316.m46604().m10316(c18241);
            if (this.f31913 != null) {
                if (z2) {
                    if (zM42506) {
                        c18241.m42501(2, "  padding: 0");
                    }
                    i = 0;
                    c18241.m42511(0);
                } else {
                    i = 0;
                }
                this.f31913.m46978(c18241);
            } else {
                i = 0;
            }
            if (!zM42506 || this.f31917 == null) {
                return;
            }
            c18241.m42501(i, "  debug info");
            this.f31917.m33764(c1662, c18241);
        } catch (RuntimeException e) {
            throw C8136.m21601("...while writing instructions for " + c22390.mo2463(), e);
        }
    }
}
