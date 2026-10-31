package l;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21461 extends AbstractC10503 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10503 f69081;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12993 f69082;

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫ */
    public final EnumC4858 mo8669(EnumC13324 enumC13324) {
        C11233.m27805(enumC13324, "operation");
        EnumC4858 enumC4858Mo8669 = this.f69081.mo8669(enumC13324);
        C11233.m27803(enumC4858Mo8669, "capability(...)");
        return enumC4858Mo8669;
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫ */
    public final void mo8670(AbstractC15440 abstractC15440) throws C22497 {
        C12993 c12993 = this.f69082;
        C11233.m27805(abstractC15440, "target");
        EnumC13324 enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        m48613(enumC13324, abstractC15440.mo23554());
        AbstractC15440 abstractC15440M48612 = m48612(abstractC15440, enumC13324);
        String strMo23554 = abstractC15440.mo23554();
        try {
            this.f69081.mo8670(abstractC15440M48612);
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), strMo23554, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), strMo23554, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + (strMo23554 == null ? "" : " -> ".concat(strMo23554)), e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo10993(AbstractC15440 abstractC15440) throws C22497 {
        C12993 c12993 = this.f69082;
        C11233.m27805(abstractC15440, "target");
        EnumC13324 enumC13324 = EnumC13324.REPLACE;
        m48613(enumC13324, abstractC15440.mo23554());
        AbstractC15440 abstractC15440M48612 = m48612(abstractC15440, enumC13324);
        String strMo23554 = abstractC15440.mo23554();
        try {
            this.f69081.mo10993(abstractC15440M48612);
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), strMo23554, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), strMo23554, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + (strMo23554 == null ? "" : " -> ".concat(strMo23554)), e2);
        }
    }

    public C21461(C12993 c12993, AbstractC15440 abstractC15440) {
        super(c12993);
        this.f69082 = c12993;
        this.f69081 = abstractC15440.mo23558();
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۜ */
    public final C12619 mo8672() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.STAT;
        m48613(enumC13324, null);
        try {
            C12619 c12619Mo8672 = this.f69081.mo8672();
            C11233.m27803(c12619Mo8672, "stat(...)");
            return m48610(c12993, c12619Mo8672);
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܳ */
    public final List mo8674() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.LIST;
        m48613(enumC13324, null);
        try {
            List<C12619> listMo8674 = this.f69081.mo8674();
            C11233.m27803(listMo8674, "list(...)");
            ArrayList arrayList = new ArrayList(C1913.m6270((Iterable) listMo8674));
            for (C12619 c12619 : listMo8674) {
                C11233.m27799(c12619);
                AbstractC15440 abstractC15440M30882 = c12619.m30882();
                C11233.m27803(abstractC15440M30882, "getFile(...)");
                arrayList.add(m48610(m48611(c12993, abstractC15440M30882), c12619));
            }
            return arrayList;
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩻ */
    public final List mo8678() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.LIST;
        m48613(enumC13324, null);
        try {
            List<C12619> listMo8678 = this.f69081.mo8678();
            C11233.m27803(listMo8678, "listForMutation(...)");
            ArrayList arrayList = new ArrayList(C1913.m6270((Iterable) listMo8678));
            for (C12619 c12619 : listMo8678) {
                C11233.m27799(c12619);
                AbstractC15440 abstractC15440M30882 = c12619.m30882();
                C11233.m27803(abstractC15440M30882, "getFile(...)");
                arrayList.add(m48610(m48611(c12993, abstractC15440M30882), c12619));
            }
            return arrayList;
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܽ */
    public final void mo8675() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.CREATE_FILE_EXCLUSIVE;
        m48613(enumC13324, null);
        try {
            this.f69081.mo8675();
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo8673() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.CREATE_DIRECTORY_SINGLE;
        m48613(enumC13324, null);
        try {
            this.f69081.mo8673();
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܿ */
    public final void mo8676() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.DELETE_FILE_OR_LINK;
        m48613(enumC13324, null);
        try {
            this.f69081.mo8676();
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8677() throws C22497 {
        C12993 c12993 = this.f69082;
        EnumC13324 enumC13324 = EnumC13324.DELETE_EMPTY_DIRECTORY;
        m48613(enumC13324, null);
        try {
            this.f69081.mo8677();
        } catch (C17432 e) {
            throw new C22497(enumC13324, EnumC21792.PERMISSION_DENIED, c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554(), e);
        } catch (C22497 e2) {
            throw new C22497(enumC13324, e2.m50458(), c12993.mo23554(), null, "Checked file operation " + enumC13324 + " failed for " + c12993.mo23554() + "", e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final AbstractC15440 m48612(AbstractC15440 abstractC15440, EnumC13324 enumC13324) throws C22497 {
        C12993 c12993 = abstractC15440 instanceof C12993 ? (C12993) abstractC15440 : null;
        if (c12993 == null) {
            throw C22497.m50454(enumC13324, EnumC21792.CROSS_BACKEND, this.f69082.mo23554(), abstractC15440.mo23554());
        }
        AbstractC15440 abstractC15440M31555 = C12993.m31555(c12993);
        if (abstractC15440M31555 != null) {
            return abstractC15440M31555;
        }
        throw m26404(enumC13324, ((C12993) abstractC15440).mo23554());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12993 m48611(C12993 c12993, AbstractC15440 abstractC15440) throws C22497 {
        if (abstractC15440 instanceof C12993) {
            return (C12993) abstractC15440;
        }
        if (!(abstractC15440 instanceof C6849)) {
            throw C22497.m50454(EnumC13324.LIST, EnumC21792.IO_ERROR, c12993.mo23554(), (String) null);
        }
        C6849 c6849 = (C6849) abstractC15440;
        String name = c6849.getName();
        C12993 c12994 = new C12993(new File(c12993.f38917, name), C22870.m50967(c12993.f38914, "/", name), c12993.m31565());
        c12994.f38912 = c6849;
        return c12994;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12619 m48610(AbstractC15440 abstractC15440, C12619 c12619) {
        return new C12619(abstractC15440, c12619.m30885(), c12619.m30884(), c12619.m30883(), c12619.m30886());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m48613(EnumC13324 enumC13324, String str) throws C22497 {
        if (mo8669(enumC13324) == EnumC4858.UNSUPPORTED) {
            throw m26404(enumC13324, str);
        }
    }
}
