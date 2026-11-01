package p067l;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import bin.p000mt.plus.Features3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۘ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5784 extends AbstractC12351 {

    /* JADX INFO: renamed from: ۧ */
    public final C17182 f14214;

    public C5784(C17182 c17182) {
        super(c17182);
        this.f14214 = c17182;
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final EnumC6986 mo10729(EnumC15032 enumC15032) {
        switch (C4443.f9969[enumC15032.ordinal()]) {
            case 1:
            case 2:
                return EnumC6986.SUPPORTED;
            case 3:
            case 4:
            case 5:
                return EnumC6986.ATOMIC;
            case 6:
            case 7:
            case 8:
                return EnumC6986.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܽ */
    public final void mo10735() throws C23750 {
        AbstractC17043 abstractC17043 = this.f34467;
        try {
            if (this.f14214.f51152.createNewFile()) {
            } else {
                throw C23750.m52795(EnumC15032.CREATE_FILE_EXCLUSIVE, EnumC23080.ALREADY_EXISTS, abstractC17043.mo25505(), (String) null);
            }
        } catch (SecurityException e) {
            throw m12966(EnumC15032.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (IOException e3) {
            throw C23750.m52794(EnumC15032.CREATE_FILE_EXCLUSIVE, abstractC17043.mo25505(), (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۜ */
    public final C14362 mo10732() {
        C17182 c17182 = this.f14214;
        return m12965(c17182, c17182.f51152);
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܳ */
    public final List mo10734() throws C23750 {
        AbstractC17043 abstractC17043 = this.f34467;
        C14362 c14362Mo10732 = mo10732();
        EnumC5645 enumC5645 = EnumC5645.DIRECTORY;
        EnumC15032 enumC15032 = EnumC15032.LIST;
        m12967(c14362Mo10732, enumC5645, enumC15032);
        try {
            File[] fileArrListFiles = this.f14214.f51152.listFiles();
            if (fileArrListFiles == null) {
                throw C23750.m52795(enumC15032, EnumC23080.IO_ERROR, abstractC17043.mo25505(), (String) null);
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                C14362 c14362M12965 = m12965(C18524.m42107(file), file);
                if (c14362M12965.m32962() != EnumC5645.MISSING) {
                    arrayList.add(c14362M12965);
                }
            }
            return arrayList;
        } catch (SecurityException e) {
            throw new C23750(EnumC15032.LIST, EnumC23080.PERMISSION_DENIED, abstractC17043.mo25505(), null, C6316.m14442(abstractC17043, new StringBuilder("Checked file operation LIST failed for ")), e);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo10733() throws C23750 {
        try {
            Os.mkdir(this.f14214.f51152.getPath(), SecP521R1Field.P16);
        } catch (ErrnoException e) {
            throw C23750.m52793(EnumC15032.CREATE_DIRECTORY_SINGLE, this.f34467.mo25505(), (String) null, e);
        } catch (SecurityException e2) {
            throw m12966(EnumC15032.CREATE_DIRECTORY_SINGLE, (String) null, e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܿ */
    public final void mo10736() throws C23750 {
        C14362 c14362Mo10732 = mo10732();
        EnumC5645 enumC5645M32962 = c14362Mo10732.m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 == enumC5645) {
            throw C23750.m52795(EnumC15032.DELETE_FILE_OR_LINK, EnumC23080.NOT_FOUND, abstractC17043.mo25505(), (String) null);
        }
        if (c14362Mo10732.m32962() != EnumC5645.REGULAR) {
            throw C23750.m52795(EnumC15032.DELETE_FILE_OR_LINK, EnumC23080.NOT_REGULAR_FILE, abstractC17043.mo25505(), (String) null);
        }
        try {
            Os.remove(this.f14214.f51152.getPath());
        } catch (ErrnoException e) {
            throw C23750.m52793(EnumC15032.DELETE_FILE_OR_LINK, abstractC17043.mo25505(), (String) null, e);
        } catch (SecurityException e2) {
            throw m12966(EnumC15032.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10737() throws C23750 {
        m12967(mo10732(), EnumC5645.DIRECTORY, EnumC15032.DELETE_EMPTY_DIRECTORY);
        try {
            Os.remove(this.f14214.f51152.getPath());
        } catch (ErrnoException e) {
            throw C23750.m52793(EnumC15032.DELETE_EMPTY_DIRECTORY, this.f34467.mo25505(), (String) null, e);
        } catch (SecurityException e2) {
            throw m12966(EnumC15032.DELETE_EMPTY_DIRECTORY, (String) null, e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final void mo10730(AbstractC17043 abstractC17043) throws C23750 {
        EnumC15032 enumC15032 = EnumC15032.RENAME_NO_REPLACE;
        boolean zMo38688 = abstractC17043.mo38688();
        AbstractC17043 abstractC17044 = this.f34467;
        if (!zMo38688) {
            throw C23750.m52795(enumC15032, EnumC23080.CROSS_BACKEND, abstractC17044.mo25505(), abstractC17043.mo25505());
        }
        C17182 c17182Mo38689 = abstractC17043.mo38689();
        String strMo25505 = abstractC17043.mo25505();
        EnumC5645 enumC5645M32962 = mo10732().m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        if (enumC5645M32962 != enumC5645) {
            c17182Mo38689.getClass();
            if (new C5784(c17182Mo38689).mo10732().m32962() != enumC5645) {
                throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17044.mo25505(), abstractC17043.mo25505());
            }
            m12968(c17182Mo38689, enumC15032);
            return;
        }
        throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17044.mo25505(), strMo25505);
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo12969(AbstractC17043 abstractC17043) throws C23750 {
        EnumC15032 enumC15032 = EnumC15032.REPLACE;
        boolean zMo38688 = abstractC17043.mo38688();
        AbstractC17043 abstractC17044 = this.f34467;
        if (!zMo38688) {
            throw C23750.m52795(enumC15032, EnumC23080.CROSS_BACKEND, abstractC17044.mo25505(), abstractC17043.mo25505());
        }
        C17182 c17182Mo38689 = abstractC17043.mo38689();
        String strMo25505 = abstractC17043.mo25505();
        if (mo10732().m32962() != EnumC5645.MISSING) {
            m12968(c17182Mo38689, enumC15032);
            return;
        }
        throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17044.mo25505(), strMo25505);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12968(C17182 c17182, EnumC15032 enumC15032) throws C23750 {
        C17182 c17183 = this.f14214;
        long jM38914 = c17183.m38914(c17182);
        try {
            Os.rename(c17183.f51152.getPath(), c17182.f51152.getPath());
            File file = c17182.f51152;
            if (jM38914 < 0) {
                return;
            }
            try {
                if (file.setLastModified(jM38914)) {
                    return;
                }
                file.toString();
            } catch (RuntimeException unused) {
                C12826.toString(file);
            }
        } catch (ErrnoException e) {
            throw C23750.m52793(enumC15032, this.f34467.mo25505(), c17182.mo25505(), e);
        } catch (SecurityException e2) {
            throw m12966(enumC15032, c17182.mo25505(), e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14362 m12965(AbstractC17043 abstractC17043, File file) throws C23750 {
        EnumC5645 enumC5645;
        try {
            long[] jArrM57 = Features3.m57(file.getPath());
            int i = OsConstants.S_IFMT & ((int) jArrM57[0]);
            if (i == OsConstants.S_IFREG) {
                enumC5645 = EnumC5645.REGULAR;
            } else {
                enumC5645 = i == OsConstants.S_IFDIR ? EnumC5645.DIRECTORY : EnumC5645.OTHER;
            }
            EnumC5645 enumC5646 = enumC5645;
            return new C14362(abstractC17043, enumC5646, enumC5646 == EnumC5645.DIRECTORY ? -1L : jArrM57[1], jArrM57[2], null);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.ENOENT) {
                return C14362.m32958(abstractC17043);
            }
            throw C23750.m52793(EnumC15032.STAT, abstractC17043.mo25505(), (String) null, e);
        } catch (SecurityException e2) {
            throw new C23750(EnumC15032.STAT, EnumC23080.PERMISSION_DENIED, abstractC17043.mo25505(), null, C6316.m14442(abstractC17043, new StringBuilder("Checked file operation STAT failed for ")), e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12967(C14362 c14362, EnumC5645 enumC5645, EnumC15032 enumC15032) throws C23750 {
        EnumC23080 enumC23080;
        EnumC5645 enumC5645M32962 = c14362.m32962();
        EnumC5645 enumC5646 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 == enumC5646) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17043.mo25505(), (String) null);
        }
        if (c14362.m32962() != enumC5645) {
            if (enumC5645 == EnumC5645.DIRECTORY) {
                enumC23080 = EnumC23080.NOT_DIRECTORY;
            } else {
                enumC23080 = EnumC23080.NOT_REGULAR_FILE;
            }
            throw C23750.m52795(enumC15032, enumC23080, abstractC17043.mo25505(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C23750 m12966(EnumC15032 enumC15032, String str, SecurityException securityException) {
        EnumC23080 enumC23080 = EnumC23080.PERMISSION_DENIED;
        AbstractC17043 abstractC17043 = this.f34467;
        String strMo25505 = abstractC17043.mo25505();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC15032);
        sb.append(" failed for ");
        return new C23750(enumC15032, enumC23080, strMo25505, str, C6316.m14442(abstractC17043, sb), securityException);
    }
}
