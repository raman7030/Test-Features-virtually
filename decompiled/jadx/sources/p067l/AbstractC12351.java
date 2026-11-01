package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12351 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f34467;

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC6986 mo10729(EnumC15032 enumC15032);

    public AbstractC12351(AbstractC17043 abstractC17043) {
        this.f34467 = abstractC17043;
    }

    /* JADX INFO: renamed from: ۜ */
    public C14362 mo10732() {
        throw m28437(EnumC15032.STAT, null);
    }

    /* JADX INFO: renamed from: ܳ */
    public List mo10734() throws C23750 {
        throw m28437(EnumC15032.LIST, null);
    }

    /* JADX INFO: renamed from: ᩻ */
    public List mo10738() {
        return mo10734();
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo10728(C14362 c14362) {
        return mo10738();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo10735() throws C23750 {
        throw m28437(EnumC15032.CREATE_FILE_EXCLUSIVE, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo10731() throws C23750 {
        C14362 c14362Mo10732 = mo10732();
        if (c14362Mo10732.m32962() == EnumC5645.MISSING) {
            return true;
        }
        if (c14362Mo10732.m32962() != EnumC5645.REGULAR || mo10729(EnumC15032.DELETE_FILE_OR_LINK) == EnumC6986.UNSUPPORTED) {
            return false;
        }
        mo10736();
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10733() throws C23750 {
        throw m28437(EnumC15032.CREATE_DIRECTORY_SINGLE, null);
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo10736() throws C23750 {
        throw m28437(EnumC15032.DELETE_FILE_OR_LINK, null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo10737() throws C23750 {
        throw m28437(EnumC15032.DELETE_EMPTY_DIRECTORY, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10730(AbstractC17043 abstractC17043) throws C23750 {
        throw m28437(EnumC15032.RENAME_NO_REPLACE, abstractC17043.mo25505());
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo12969(AbstractC17043 abstractC17043) throws C23750 {
        throw m28437(EnumC15032.REPLACE, abstractC17043.mo25505());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23750 m28437(EnumC15032 enumC15032, String str) {
        return C23750.m52796(enumC15032, this.f34467.mo25505(), str);
    }
}
