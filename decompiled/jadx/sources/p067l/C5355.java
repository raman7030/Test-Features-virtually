package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۗۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5355 extends AbstractC5160 {
    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11026(Object obj) throws IOException {
        InterfaceC14937 c14267;
        C5550 c5550 = (C5550) obj;
        boolean z = true;
        if (c5550.f13415 == 1) {
            C12256 c12256 = new C12256(!c5550.f13410, c5550);
            c12256.m28269(c5550.f13407);
            c14267 = c12256;
        } else {
            c14267 = new C14267(c5550);
        }
        String str = c5550.f13406;
        if (!str.equalsIgnoreCase(C0233a.f1077D) && !str.equalsIgnoreCase("UTF8")) {
            z = false;
        }
        c14267.m34177(str);
        Charset.forName(str);
        try {
            c14267.m34169(c5550.f13416, c5550.f13412);
            if (c5550.f13413) {
                c14267.m34168();
                if (c14267 instanceof C12256) {
                    C12256 c12257 = (C12256) c14267;
                    c12257.m35439();
                    c12257.m35438();
                }
            }
            try {
                String str2 = c5550.f13409;
                String str3 = c5550.f13411;
                if (str2.equals("anonymous") && str3.isEmpty()) {
                    str3 = "anonymous@";
                }
                if (!c14267.m34181(str2, str3)) {
                    StringBuilder sbM21133 = C9179.m21133(C7050.m16224(R.string.MT_Protector), ": ");
                    sbM21133.append(c14267.m34174());
                    throw new C20807(sbM21133.toString());
                }
                if (z) {
                    c14267.mo28272("OPTS", "UTF8 ON");
                }
                c14267.mo28271();
                if (c14267.m34190()) {
                    return c14267;
                }
                c14267.mo28274();
                throw null;
            } catch (Exception e) {
                throw new IOException(C20778.m46923(e, C9179.m21133(C7050.m16224(R.string.MT_Protector), ": ")), e);
            }
        } catch (Exception e2) {
            throw new IOException(C20778.m46923(e2, C9179.m21133(C7050.m16224(R.string.MT_Protector), ": ")), e2);
        }
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final void mo11027(Object obj, InterfaceC11866 interfaceC11866) {
        try {
            InterfaceC14937 interfaceC14937 = (InterfaceC14937) interfaceC11866.mo27170();
            if (interfaceC14937.m34183()) {
                interfaceC14937.m34178();
            }
        } catch (Exception unused) {
        }
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11866 mo11028(Object obj) {
        return new C17938((InterfaceC14937) obj);
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11029(Object obj, InterfaceC11866 interfaceC11866) {
        InterfaceC14937 interfaceC14937 = (InterfaceC14937) interfaceC11866.mo27170();
        if (!interfaceC14937.m34175()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11866.mo27172().toEpochMilli();
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
            return true;
        }
        try {
            return interfaceC14937.m34179();
        } catch (IOException unused) {
            return false;
        }
    }
}
