package p067l;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22765 extends AbstractC12351 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12351 f71779;

    /* JADX INFO: renamed from: ܽ */
    public final C14717 f71780;

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final EnumC6986 mo10729(EnumC15032 enumC15032) {
        C13045.m29867(enumC15032, "operation");
        EnumC6986 enumC6986Mo10729 = this.f71779.mo10729(enumC15032);
        C13045.m29865(enumC6986Mo10729, "capability(...)");
        return enumC6986Mo10729;
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final void mo10730(AbstractC17043 abstractC17043) throws C23750 {
        C14717 c14717 = this.f71780;
        C13045.m29867(abstractC17043, "target");
        EnumC15032 enumC15032 = EnumC15032.RENAME_NO_REPLACE;
        m50950(enumC15032, abstractC17043.mo25505());
        AbstractC17043 abstractC17043M50949 = m50949(abstractC17043, enumC15032);
        String strMo25505 = abstractC17043.mo25505();
        try {
            this.f71779.mo10730(abstractC17043M50949);
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), strMo25505, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), strMo25505, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + (strMo25505 == null ? "" : " -> ".concat(strMo25505)), e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo12969(AbstractC17043 abstractC17043) throws C23750 {
        C14717 c14717 = this.f71780;
        C13045.m29867(abstractC17043, "target");
        EnumC15032 enumC15032 = EnumC15032.REPLACE;
        m50950(enumC15032, abstractC17043.mo25505());
        AbstractC17043 abstractC17043M50949 = m50949(abstractC17043, enumC15032);
        String strMo25505 = abstractC17043.mo25505();
        try {
            this.f71779.mo12969(abstractC17043M50949);
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), strMo25505, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), strMo25505, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + (strMo25505 == null ? "" : " -> ".concat(strMo25505)), e2);
        }
    }

    public C22765(C14717 c14717, AbstractC17043 abstractC17043) {
        super(c14717);
        this.f71780 = c14717;
        this.f71779 = abstractC17043.mo25509();
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۜ */
    public final C14362 mo10732() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.STAT;
        m50950(enumC15032, null);
        try {
            C14362 c14362Mo10732 = this.f71779.mo10732();
            C13045.m29865(c14362Mo10732, "stat(...)");
            return m50947(c14717, c14362Mo10732);
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܳ */
    public final List mo10734() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.LIST;
        m50950(enumC15032, null);
        try {
            List<C14362> listMo10734 = this.f71779.mo10734();
            C13045.m29865(listMo10734, "list(...)");
            ArrayList arrayList = new ArrayList(C4187.m8472((Iterable) listMo10734));
            for (C14362 c14362 : listMo10734) {
                C13045.m29861(c14362);
                AbstractC17043 abstractC17043M32959 = c14362.m32959();
                C13045.m29865(abstractC17043M32959, "getFile(...)");
                arrayList.add(m50947(m50948(c14717, abstractC17043M32959), c14362));
            }
            return arrayList;
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩻ */
    public final List mo10738() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.LIST;
        m50950(enumC15032, null);
        try {
            List<C14362> listMo10738 = this.f71779.mo10738();
            C13045.m29865(listMo10738, "listForMutation(...)");
            ArrayList arrayList = new ArrayList(C4187.m8472((Iterable) listMo10738));
            for (C14362 c14362 : listMo10738) {
                C13045.m29861(c14362);
                AbstractC17043 abstractC17043M32959 = c14362.m32959();
                C13045.m29865(abstractC17043M32959, "getFile(...)");
                arrayList.add(m50947(m50948(c14717, abstractC17043M32959), c14362));
            }
            return arrayList;
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܽ */
    public final void mo10735() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.CREATE_FILE_EXCLUSIVE;
        m50950(enumC15032, null);
        try {
            this.f71779.mo10735();
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo10733() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.CREATE_DIRECTORY_SINGLE;
        m50950(enumC15032, null);
        try {
            this.f71779.mo10733();
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܿ */
    public final void mo10736() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.DELETE_FILE_OR_LINK;
        m50950(enumC15032, null);
        try {
            this.f71779.mo10736();
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10737() throws C23750 {
        C14717 c14717 = this.f71780;
        EnumC15032 enumC15032 = EnumC15032.DELETE_EMPTY_DIRECTORY;
        m50950(enumC15032, null);
        try {
            this.f71779.mo10737();
        } catch (C18936 e) {
            throw new C23750(enumC15032, EnumC23080.PERMISSION_DENIED, c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505(), e);
        } catch (C23750 e2) {
            throw new C23750(enumC15032, e2.m52799(), c14717.mo25505(), null, "Checked file operation " + enumC15032 + " failed for " + c14717.mo25505() + "", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final AbstractC17043 m50949(AbstractC17043 abstractC17043, EnumC15032 enumC15032) throws C23750 {
        C14717 c14717 = abstractC17043 instanceof C14717 ? (C14717) abstractC17043 : null;
        if (c14717 == null) {
            throw C23750.m52795(enumC15032, EnumC23080.CROSS_BACKEND, this.f71780.mo25505(), abstractC17043.mo25505());
        }
        AbstractC17043 abstractC17043M33640 = C14717.m33640(c14717);
        if (abstractC17043M33640 != null) {
            return abstractC17043M33640;
        }
        throw m28437(enumC15032, ((C14717) abstractC17043).mo25505());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14717 m50948(C14717 c14717, AbstractC17043 abstractC17043) throws C23750 {
        if (abstractC17043 instanceof C14717) {
            return (C14717) abstractC17043;
        }
        if (!(abstractC17043 instanceof C8878)) {
            throw C23750.m52795(EnumC15032.LIST, EnumC23080.IO_ERROR, c14717.mo25505(), (String) null);
        }
        C8878 c8878 = (C8878) abstractC17043;
        String name = c8878.getName();
        C14717 c14718 = new C14717(new File(c14717.f41963, name), C24104.m53357(c14717.f41960, "/", name), c14717.m33650());
        c14718.f41958 = c8878;
        return c14718;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14362 m50947(AbstractC17043 abstractC17043, C14362 c14362) {
        return new C14362(abstractC17043, c14362.m32962(), c14362.m32961(), c14362.m32960(), c14362.m32963());
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m50950(EnumC15032 enumC15032, String str) throws C23750 {
        if (mo10729(enumC15032) == EnumC6986.UNSUPPORTED) {
            throw m28437(enumC15032, str);
        }
    }
}
