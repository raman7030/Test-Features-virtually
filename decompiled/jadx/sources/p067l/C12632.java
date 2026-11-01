package p067l;

/* JADX INFO: renamed from: l.ۧۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Z2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12632 extends AbstractC19337 {

    /* JADX INFO: renamed from: ۛ */
    public static final InterfaceC4410 f35459 = C13128.m30022(C12632.class);

    /* JADX INFO: renamed from: ۤ */
    public C20381 f35460;

    /* JADX INFO: renamed from: ۫ */
    public C21052 f35461;

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC15983 mo29046() throws C5255 {
        C19218 c19218 = ((C14642) m44074()).f41801;
        String strM43775 = c19218.m43775();
        String path = c19218.m43768().getPath();
        if (path.lastIndexOf(47) != path.length() - 1) {
            throw new C5255(c19218.m43768() + " directory must end with '/'");
        }
        if (strM43775.lastIndexOf(92) != strM43775.length() - 1) {
            throw new C5255(strM43775.concat(" UNC must end with '\\'"));
        }
        C5807 c5807M44073 = m44073();
        this.f35460 = new C20381(c5807M44073.m13070());
        try {
            c5807M44073.m13063(new C6299(c5807M44073.m13070(), strM43775, "*", 22, ((C15410) c5807M44073.m13070()).m35101(), ((C15410) c5807M44073.m13070()).m35115() - 100), this.f35460, new EnumC2572[0]);
            this.f35461 = new C21052(this.f35460.m46007(), this.f35460.m46008(), ((C15410) c5807M44073.m13070()).m35101(), ((C15410) c5807M44073.m13070()).m35115() - 100, this.f35460.m46006(), c5807M44073.m13070());
            this.f35460.m43257((byte) 2);
            InterfaceC15983 interfaceC15983M44071 = m44071(false);
            if (interfaceC15983M44071 == null) {
                m44072();
            }
            return interfaceC15983M44071;
        } catch (C5255 e) {
            C20381 c20381 = this.f35460;
            if (c20381 != null && c20381.mo30257() && e.m11333() == -1073741809) {
                m44072();
                return null;
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15983[] mo29049() {
        return this.f35460.m43252();
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo29048() throws C5255 {
        this.f35461.m47489(this.f35460.m46008(), this.f35460.m46006());
        this.f35460.reset();
        try {
            m44073().m13063(this.f35461, this.f35460, new EnumC2572[0]);
            return this.f35460.m43253() != -2147483642;
        } catch (C5255 e) {
            if (e.m11333() == -2147483642) {
                f35459.mo9176("No more entries", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo29045() {
        return this.f35460.m46009();
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ܽ */
    public final void mo29047() {
        try {
            C5807 c5807M44073 = m44073();
            if (this.f35460 != null) {
                c5807M44073.m13063(new C18626(c5807M44073.m13070(), this.f35460.m46007()), new C9200(c5807M44073.m13070()), new EnumC2572[0]);
            }
        } catch (C5255 e) {
            f35459.mo9176("SmbComFindClose2 failed", (Exception) e);
        }
    }
}
