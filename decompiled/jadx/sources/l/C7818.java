package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1I5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7818 extends AbstractC9936 {
    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ AbstractC11347 mo20901(String str, String str2) {
        throw null;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ */
    public final void mo7190(Appendable appendable, int i, C0056 c0056) {
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public final String mo2915() {
        return "#doctype";
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo10981() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m20900(String str) {
        return !C20519.m47004(super.mo25048(str));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20902(String str) {
        if (str != null) {
            super.mo20901("pubSysKey", str);
        }
    }

    public C7818(String str, String str2, String str3) {
        C16990.m39822((Object) str);
        C16990.m39822((Object) str2);
        C16990.m39822((Object) str3);
        super.mo20901("name", str);
        super.mo20901("publicId", str2);
        super.mo20901("systemId", str3);
        if (m20900("publicId")) {
            super.mo20901("pubSysKey", "PUBLIC");
        } else if (m20900("systemId")) {
            super.mo20901("pubSysKey", "SYSTEM");
        }
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public final void mo7189(Appendable appendable, int i, C0056 c0056) throws IOException {
        if (this.f33970 > 0 && c0056.m979()) {
            appendable.append('\n');
        }
        if (c0056.m984() != EnumC19108.html || m20900("publicId") || m20900("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m20900("name")) {
            appendable.append(" ").append(super.mo25048("name"));
        }
        if (m20900("pubSysKey")) {
            appendable.append(" ").append(super.mo25048("pubSysKey"));
        }
        if (m20900("publicId")) {
            appendable.append(" \"").append(super.mo25048("publicId")).append('\"');
        }
        if (m20900("systemId")) {
            appendable.append(" \"").append(super.mo25048("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
