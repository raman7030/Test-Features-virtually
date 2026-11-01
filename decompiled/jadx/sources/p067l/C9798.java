package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1I5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9798 extends AbstractC11811 {
    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC13152 mo22866(String str, String str2) {
        throw null;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public final void mo9269(Appendable appendable, int i, C2421 c2421) {
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC13152 mo12956() {
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public final String mo5244() {
        return "#doctype";
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo12957() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m22865(String str) {
        return !C21869.m49327(super.mo27065(str));
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22867(String str) {
        if (str != null) {
            super.mo22866("pubSysKey", str);
        }
    }

    public C9798(String str, String str2, String str3) {
        C18515.m42065((Object) str);
        C18515.m42065((Object) str2);
        C18515.m42065((Object) str3);
        super.mo22866("name", str);
        super.mo22866("publicId", str2);
        super.mo22866("systemId", str3);
        if (m22865("publicId")) {
            super.mo22866("pubSysKey", "PUBLIC");
        } else if (m22865("systemId")) {
            super.mo22866("pubSysKey", "SYSTEM");
        }
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final void mo9268(Appendable appendable, int i, C2421 c2421) throws IOException {
        if (this.f36968 > 0 && c2421.m3374()) {
            appendable.append('\n');
        }
        if (c2421.m3379() != EnumC20528.html || m22865("publicId") || m22865("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m22865("name")) {
            appendable.append(" ").append(super.mo27065("name"));
        }
        if (m22865("pubSysKey")) {
            appendable.append(" ").append(super.mo27065("pubSysKey"));
        }
        if (m22865("publicId")) {
            appendable.append(" \"").append(super.mo27065("publicId")).append('\"');
        }
        if (m22865("systemId")) {
            appendable.append(" \"").append(super.mo27065("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
