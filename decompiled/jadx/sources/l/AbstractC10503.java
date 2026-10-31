package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10503 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f31505;

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC4858 mo8669(EnumC13324 enumC13324);

    public AbstractC10503(AbstractC15440 abstractC15440) {
        this.f31505 = abstractC15440;
    }

    /* JADX INFO: renamed from: ۜ */
    public C12619 mo8672() {
        throw m26404(EnumC13324.STAT, null);
    }

    /* JADX INFO: renamed from: ܳ */
    public List mo8674() throws C22497 {
        throw m26404(EnumC13324.LIST, null);
    }

    /* JADX INFO: renamed from: ᩻ */
    public List mo8678() {
        return mo8674();
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo8668(C12619 c12619) {
        return mo8678();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo8675() throws C22497 {
        throw m26404(EnumC13324.CREATE_FILE_EXCLUSIVE, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo8671() throws C22497 {
        C12619 c12619Mo8672 = mo8672();
        if (c12619Mo8672.m30885() == EnumC3447.MISSING) {
            return true;
        }
        if (c12619Mo8672.m30885() != EnumC3447.REGULAR || mo8669(EnumC13324.DELETE_FILE_OR_LINK) == EnumC4858.UNSUPPORTED) {
            return false;
        }
        mo8676();
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo8673() throws C22497 {
        throw m26404(EnumC13324.CREATE_DIRECTORY_SINGLE, null);
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo8676() throws C22497 {
        throw m26404(EnumC13324.DELETE_FILE_OR_LINK, null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo8677() throws C22497 {
        throw m26404(EnumC13324.DELETE_EMPTY_DIRECTORY, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8670(AbstractC15440 abstractC15440) throws C22497 {
        throw m26404(EnumC13324.RENAME_NO_REPLACE, abstractC15440.mo23554());
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10993(AbstractC15440 abstractC15440) throws C22497 {
        throw m26404(EnumC13324.REPLACE, abstractC15440.mo23554());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22497 m26404(EnumC13324 enumC13324, String str) {
        return C22497.m50455(enumC13324, this.f31505.mo23554(), str);
    }
}
