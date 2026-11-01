package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86Y6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19807 extends AbstractC12351 {

    /* JADX INFO: renamed from: ۧ */
    public final C13102 f60238;

    public C19807(C13102 c13102) {
        super(c13102);
        this.f60238 = c13102;
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final EnumC6986 mo10729(EnumC15032 enumC15032) {
        switch (C18465.f55188[enumC15032.ordinal()]) {
            case 1:
                return EnumC6986.SUPPORTED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC6986.BEST_EFFORT;
            case 6:
            case 7:
            case 8:
                return EnumC6986.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܽ */
    public final void mo10735() throws Throwable {
        IOException e;
        C21089 c21089Mo29998;
        C21089 c21089 = null;
        if (mo10732().m32962() != EnumC5645.MISSING) {
            throw C23750.m52795(EnumC15032.CREATE_FILE_EXCLUSIVE, EnumC23080.ALREADY_EXISTS, this.f34467.mo25505(), (String) null);
        }
        try {
            c21089Mo29998 = this.f60238.mo29998();
            try {
                try {
                    c21089Mo29998.m47677(this.f34467.mo25505(), false).close();
                    c21089Mo29998.f66255 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C23750.m52794(EnumC15032.CREATE_FILE_EXCLUSIVE, this.f34467.mo25505(), (String) null, e);
                }
            } catch (Throwable th) {
                C21089 c210810 = c21089Mo29998;
                th = th;
                c21089 = c210810;
                if (c21089 != null) {
                    c21089.f66255 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c21089Mo29998 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c21089 != null) {
                c21089.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۜ */
    public final C14362 mo10732() throws C23750 {
        AbstractC17043 abstractC17043 = this.f34467;
        try {
            return m45031(abstractC17043, this.f60238.m29993());
        } catch (IOException e) {
            C23750 c23750M52794 = C23750.m52794(EnumC15032.STAT, abstractC17043.mo25505(), (String) null, e);
            if (c23750M52794.m52799() == EnumC23080.NOT_FOUND) {
                return C14362.m32958(abstractC17043);
            }
            throw c23750M52794;
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܳ */
    public final List mo10734() {
        return m45030(false);
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩻ */
    public final List mo10738() {
        return m45030(true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX INFO: renamed from: ֫ */
    private ArrayList m45030(boolean z) throws Throwable {
        C21089 c21089Mo29998;
        List<C19136> listM47647;
        m45032(mo10732(), EnumC15032.LIST);
        C21089 c21089 = null;
        try {
            try {
                c21089Mo29998 = this.f60238.mo29998();
                try {
                    if (z) {
                        listM47647 = c21089Mo29998.m47684(this.f34467.mo25505());
                    } else {
                        listM47647 = c21089Mo29998.m47647(this.f34467.mo25505(), true);
                    }
                    ArrayList arrayList = new ArrayList(listM47647.size());
                    for (C19136 c19136 : listM47647) {
                        arrayList.add(m45031(this.f60238.mo29975(c19136), c19136));
                    }
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    return arrayList;
                } catch (IOException e) {
                    e = e;
                    throw C23750.m52794(EnumC15032.LIST, this.f34467.mo25505(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c21089 = c21089Mo29998;
                if (c21089 != null) {
                    c21089.f66255 = 0L;
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            c21089Mo29998 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c21089 != null) {
                c21089.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:19:0x0038 */
    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo10733() throws Throwable {
        IOException e;
        C21089 c21089;
        C21089 c210810 = null;
        if (mo10732().m32962() != EnumC5645.MISSING) {
            throw C23750.m52795(EnumC15032.CREATE_DIRECTORY_SINGLE, EnumC23080.ALREADY_EXISTS, this.f34467.mo25505(), (String) null);
        }
        try {
            try {
                C21089 c21089Mo29998 = this.f60238.mo29998();
                try {
                    c21089Mo29998.m47672(this.f34467.mo25505(), false);
                    c21089Mo29998.f66255 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C23750.m52794(EnumC15032.CREATE_DIRECTORY_SINGLE, this.f34467.mo25505(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c210810 = c21089;
                if (c210810 != null) {
                    c210810.f66255 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c210810 != null) {
                c210810.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܿ */
    public final void mo10736() throws Throwable {
        IOException e;
        C21089 c21089Mo29998;
        C14362 c14362Mo10732 = mo10732();
        C21089 c21089 = null;
        if (c14362Mo10732.m32962() == EnumC5645.MISSING) {
            throw C23750.m52795(EnumC15032.DELETE_FILE_OR_LINK, EnumC23080.NOT_FOUND, this.f34467.mo25505(), (String) null);
        }
        if (c14362Mo10732.m32962() != EnumC5645.REGULAR && c14362Mo10732.m32962() != EnumC5645.LINK) {
            throw C23750.m52795(EnumC15032.DELETE_FILE_OR_LINK, EnumC23080.NOT_REGULAR_FILE, this.f34467.mo25505(), (String) null);
        }
        try {
            c21089Mo29998 = this.f60238.mo29998();
            try {
                try {
                    c21089Mo29998.m47660(this.f34467.mo25505());
                    this.f60238.mo29991();
                    c21089Mo29998.f66255 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C23750.m52794(EnumC15032.DELETE_FILE_OR_LINK, this.f34467.mo25505(), (String) null, e);
                }
            } catch (Throwable th) {
                c21089 = c21089Mo29998;
                th = th;
                if (c21089 != null) {
                    c21089.f66255 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c21089Mo29998 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c21089 != null) {
                c21089.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0039 */
    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10737() throws Throwable {
        IOException e;
        C21089 c21089;
        m45032(mo10732(), EnumC15032.DELETE_EMPTY_DIRECTORY);
        C21089 c210810 = null;
        try {
            try {
                C21089 c21089Mo29998 = this.f60238.mo29998();
                try {
                    c21089Mo29998.m47676(this.f34467.mo25505());
                    this.f60238.mo29991();
                    c21089Mo29998.f66255 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C23750.m52794(EnumC15032.DELETE_EMPTY_DIRECTORY, this.f34467.mo25505(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c210810 = c21089;
                if (c210810 != null) {
                    c210810.f66255 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c210810 != null) {
                c210810.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final void mo10730(AbstractC17043 abstractC17043) throws C23750 {
        if (!abstractC17043.mo29978()) {
            throw C23750.m52795(EnumC15032.RENAME_NO_REPLACE, EnumC23080.CROSS_BACKEND, this.f34467.mo25505(), abstractC17043.mo25505());
        }
        EnumC5645 enumC5645M32962 = mo10732().m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        if (enumC5645M32962 == enumC5645) {
            throw C23750.m52795(EnumC15032.RENAME_NO_REPLACE, EnumC23080.NOT_FOUND, this.f34467.mo25505(), abstractC17043.mo25505());
        }
        if (abstractC17043.mo25509().mo10732().m32962() != enumC5645) {
            throw C23750.m52795(EnumC15032.RENAME_NO_REPLACE, EnumC23080.ALREADY_EXISTS, this.f34467.mo25505(), abstractC17043.mo25505());
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = this.f60238.mo29998();
                c21089Mo29998.m47680(this.f34467.mo25505(), abstractC17043.mo25505());
                this.f60238.mo29991();
                if (abstractC17043 instanceof C13102) {
                    ((C13102) abstractC17043).mo29991();
                }
                c21089Mo29998.f66255 = 0L;
            } catch (IOException e) {
                throw C23750.m52794(EnumC15032.RENAME_NO_REPLACE, this.f34467.mo25505(), abstractC17043.mo25505(), e);
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo12969(AbstractC17043 abstractC17043) throws C23750 {
        if (!abstractC17043.mo29978()) {
            throw C23750.m52795(EnumC15032.REPLACE, EnumC23080.CROSS_BACKEND, this.f34467.mo25505(), abstractC17043.mo25505());
        }
        if (mo10732().m32962() == EnumC5645.MISSING) {
            throw C23750.m52795(EnumC15032.REPLACE, EnumC23080.NOT_FOUND, this.f34467.mo25505(), abstractC17043.mo25505());
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = this.f60238.mo29998();
                c21089Mo29998.m47680(this.f34467.mo25505(), abstractC17043.mo25505());
                this.f60238.mo29991();
                if (abstractC17043 instanceof C13102) {
                    ((C13102) abstractC17043).mo29991();
                }
                c21089Mo29998.f66255 = 0L;
            } catch (IOException e) {
                throw C23750.m52794(EnumC15032.REPLACE, this.f34467.mo25505(), abstractC17043.mo25505(), e);
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14362 m45031(AbstractC17043 abstractC17043, C19136 c19136) {
        EnumC5645 enumC5645;
        char cM43534 = c19136.m43534();
        if (cM43534 == 'l') {
            enumC5645 = EnumC5645.LINK;
        } else if (cM43534 == '-') {
            enumC5645 = EnumC5645.REGULAR;
        } else if (cM43534 == 'd') {
            enumC5645 = EnumC5645.DIRECTORY;
        } else {
            enumC5645 = EnumC5645.OTHER;
        }
        EnumC5645 enumC5646 = enumC5645;
        return new C14362(abstractC17043, enumC5646, enumC5646 == EnumC5645.DIRECTORY ? -1L : c19136.m43536(), c19136.m43530(), enumC5646 == EnumC5645.LINK ? c19136.m43531() : null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45032(C14362 c14362, EnumC15032 enumC15032) throws C23750 {
        EnumC5645 enumC5645M32962 = c14362.m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 == enumC5645) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17043.mo25505(), (String) null);
        }
        if (c14362.m32962() != EnumC5645.DIRECTORY) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_DIRECTORY, abstractC17043.mo25505(), (String) null);
        }
    }
}
