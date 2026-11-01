package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5313 implements InterfaceC24263 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19221 f12495;

    public C5313(InterfaceC19221 interfaceC19221) {
        this.f12495 = interfaceC19221;
    }

    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) {
        InterfaceC7603 interfaceC7603Mo19638;
        InterfaceC19221 interfaceC19221 = this.f12495;
        C20066 c20066Mo33103 = interfaceC19221 != null ? interfaceC19221.mo33103(c9833.m23010()) : null;
        C12019 c12019M31866 = new C14030(System.currentTimeMillis(), c9833.m23010(), c20066Mo33103).m31866();
        C10678 c10678 = c12019M31866.f33498;
        C20066 c20066 = c12019M31866.f33497;
        if (interfaceC19221 != null) {
            interfaceC19221.mo33101(c12019M31866);
        }
        if (c20066Mo33103 != null && c20066 == null) {
            C21407.m48495(c20066Mo33103.m45436());
        }
        if (c10678 == null && c20066 == null) {
            C5984 c5984 = new C5984();
            c5984.m13415(c9833.m23010());
            c5984.m13418(EnumC16041.HTTP_1_1);
            c5984.m13411(504);
            c5984.m13422("Unsatisfiable Request (only-if-cached)");
            c5984.m13414(C21407.f67536);
            c5984.m13421(-1L);
            c5984.m13412(System.currentTimeMillis());
            return c5984.m13410();
        }
        if (c10678 == null) {
            C5984 c5984M45438 = c20066.m45438();
            c5984M45438.m13419(m11491(c20066));
            return c5984M45438.m13410();
        }
        try {
            C20066 c20066M23001 = c9833.m23001(c10678);
            if (c20066M23001 == null && c20066Mo33103 != null) {
                C21407.m48495(c20066Mo33103.m45436());
            }
            if (c20066 != null) {
                if (c20066M23001.m45443() == 304) {
                    C5984 c5984M45439 = c20066.m45438();
                    C12194 c12194M45446 = c20066.m45446();
                    C12194 c12194M45447 = c20066M23001.m45446();
                    C14205 c14205 = new C14205();
                    int iM28164 = c12194M45446.m28164();
                    for (int i = 0; i < iM28164; i++) {
                        String strM28161 = c12194M45446.m28161(i);
                        String strM28165 = c12194M45446.m28165(i);
                        if ((!"Warning".equalsIgnoreCase(strM28161) || !strM28165.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM28161) || "Content-Encoding".equalsIgnoreCase(strM28161) || "Content-Type".equalsIgnoreCase(strM28161) || !m11492(strM28161) || c12194M45447.m28162(strM28161) == null)) {
                            AbstractC10007.f27689.mo23320(c14205, strM28161, strM28165);
                        }
                    }
                    int iM28165 = c12194M45447.m28164();
                    for (int i2 = 0; i2 < iM28165; i2++) {
                        String strM28162 = c12194M45447.m28161(i2);
                        if (!"Content-Length".equalsIgnoreCase(strM28162) && !"Content-Encoding".equalsIgnoreCase(strM28162) && !"Content-Type".equalsIgnoreCase(strM28162) && m11492(strM28162)) {
                            AbstractC10007.f27689.mo23320(c14205, strM28162, c12194M45447.m28165(i2));
                        }
                    }
                    c5984M45439.m13416(c14205.m32677());
                    c5984M45439.m13421(c20066M23001.m45441());
                    c5984M45439.m13412(c20066M23001.m45445());
                    c5984M45439.m13419(m11491(c20066));
                    c5984M45439.m13423(m11491(c20066M23001));
                    C20066 c20066M13410 = c5984M45439.m13410();
                    c20066M23001.m45436().close();
                    interfaceC19221.mo33099();
                    interfaceC19221.mo33102(c20066, c20066M13410);
                    return c20066M13410;
                }
                C21407.m48495(c20066.m45436());
            }
            C5984 c5984M454310 = c20066M23001.m45438();
            c5984M454310.m13419(m11491(c20066));
            c5984M454310.m13423(m11491(c20066M23001));
            C20066 c20066M13411 = c5984M454310.m13410();
            if (interfaceC19221 != null) {
                if (C3127.m5332(c20066M13411) && C12019.m27510(c10678, c20066M13411)) {
                    InterfaceC14700 interfaceC14700Mo33098 = interfaceC19221.mo33098(c20066M13411);
                    if (interfaceC14700Mo33098 != null && (interfaceC7603Mo19638 = interfaceC14700Mo33098.mo19638()) != null) {
                        C6654 c6654 = new C6654(c20066M13411.m45436().mo4016(), interfaceC14700Mo33098, C25037.m54977(interfaceC7603Mo19638));
                        String strM45435 = c20066M13411.m45435("Content-Type");
                        long jMo4015 = c20066M13411.m45436().mo4015();
                        C5984 c5984M454311 = c20066M13411.m45438();
                        c5984M454311.m13414(new C16538(strM45435, jMo4015, C25037.m54976(c6654)));
                        return c5984M454311.m13410();
                    }
                } else if (C5595.m12398(c10678.m24589())) {
                    try {
                        interfaceC19221.mo33100(c10678);
                    } catch (IOException unused) {
                    }
                }
            }
            return c20066M13411;
        } catch (Throwable th) {
            if (c20066Mo33103 != null) {
                C21407.m48495(c20066Mo33103.m45436());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20066 m11491(C20066 c20066) {
        if (c20066 == null || c20066.m45436() == null) {
            return c20066;
        }
        C5984 c5984M45438 = c20066.m45438();
        c5984M45438.m13414((AbstractC2630) null);
        return c5984M45438.m13410();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11492(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
