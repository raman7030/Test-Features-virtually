package l;

/* JADX INFO: renamed from: l.ۧۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Z2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10799 extends AbstractC17854 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f32483 = C11321.m27961(C10799.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18952 f32484;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19658 f32485;

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325 mo27001() throws C3037 {
        C17729 c17729 = ((C12914) m41828()).f38759;
        String strM41529 = c17729.m41529();
        String path = c17729.m41522().getPath();
        if (path.lastIndexOf(47) != path.length() - 1) {
            throw new C3037(c17729.m41522() + " directory must end with '/'");
        }
        if (strM41529.lastIndexOf(92) != strM41529.length() - 1) {
            throw new C3037(strM41529.concat(" UNC must end with '\\'"));
        }
        C3618 c3618M41827 = m41827();
        this.f32484 = new C18952(c3618M41827.m11094());
        try {
            c3618M41827.m11087(new C4135(c3618M41827.m11094(), strM41529, "*", 22, ((C13722) c3618M41827.m11094()).m32987(), ((C13722) c3618M41827.m11094()).m33001() - 100), this.f32484, new EnumC0214[0]);
            this.f32485 = new C19658(this.f32484.m43740(), this.f32484.m43741(), ((C13722) c3618M41827.m11094()).m32987(), ((C13722) c3618M41827.m11094()).m33001() - 100, this.f32484.m43739(), c3618M41827.m11094());
            this.f32484.m41012((byte) 2);
            InterfaceC14325 interfaceC14325M41825 = m41825(false);
            if (interfaceC14325M41825 == null) {
                m41826();
            }
            return interfaceC14325M41825;
        } catch (C3037 e) {
            C18952 c18952 = this.f32484;
            if (c18952 != null && c18952.mo28213() && e.m9291() == -1073741809) {
                m41826();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325[] mo27004() {
        return this.f32484.m41007();
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo27003() throws C3037 {
        this.f32485.m45192(this.f32484.m43741(), this.f32484.m43739());
        this.f32484.reset();
        try {
            m41827().m11087(this.f32485, this.f32484, new EnumC0214[0]);
            return this.f32484.m41008() != -2147483642;
        } catch (C3037 e) {
            if (e.m9291() == -2147483642) {
                f32483.mo7081("No more entries", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo27000() {
        return this.f32484.m43742();
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo27002() {
        try {
            C3618 c3618M41827 = m41827();
            if (this.f32484 != null) {
                c3618M41827.m11087(new C17106(c3618M41827.m11094(), this.f32484.m43740()), new C7188(c3618M41827.m11094()), new EnumC0214[0]);
            }
        } catch (C3037 e) {
            f32483.mo7081("SmbComFindClose2 failed", (Exception) e);
        }
    }
}
