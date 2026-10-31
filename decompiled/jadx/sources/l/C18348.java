package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86Y6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18348 extends AbstractC10503 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11293 f57020;

    public C18348(C11293 c11293) {
        super(c11293);
        this.f57020 = c11293;
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫ */
    public final EnumC4858 mo8669(EnumC13324 enumC13324) {
        switch (C16936.f52007[enumC13324.ordinal()]) {
            case 1:
                return EnumC4858.SUPPORTED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC4858.BEST_EFFORT;
            case 6:
            case 7:
            case 8:
                return EnumC4858.BEST_EFFORT;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܽ */
    public final void mo8675() throws Throwable {
        IOException e;
        C19697 c19697Mo27937;
        C19697 c19697 = null;
        if (mo8672().m30885() != EnumC3447.MISSING) {
            throw C22497.m50454(EnumC13324.CREATE_FILE_EXCLUSIVE, EnumC21792.ALREADY_EXISTS, this.f31505.mo23554(), (String) null);
        }
        try {
            c19697Mo27937 = this.f57020.mo27937();
            try {
                try {
                    c19697Mo27937.m45380(this.f31505.mo23554(), false).close();
                    c19697Mo27937.f63634 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22497.m50453(EnumC13324.CREATE_FILE_EXCLUSIVE, this.f31505.mo23554(), (String) null, e);
                }
            } catch (Throwable th) {
                C19697 c19698 = c19697Mo27937;
                th = th;
                c19697 = c19698;
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c19697Mo27937 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۜ */
    public final C12619 mo8672() throws C22497 {
        AbstractC15440 abstractC15440 = this.f31505;
        try {
            return m42769(abstractC15440, this.f57020.m27932());
        } catch (IOException e) {
            C22497 c22497M50453 = C22497.m50453(EnumC13324.STAT, abstractC15440.mo23554(), (String) null, e);
            if (c22497M50453.m50458() == EnumC21792.NOT_FOUND) {
                return C12619.m30881(abstractC15440);
            }
            throw c22497M50453;
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܳ */
    public final List mo8674() {
        return m42768(false);
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩻ */
    public final List mo8678() {
        return m42768(true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m42768(boolean z) throws Throwable {
        C19697 c19697Mo27937;
        List<C17642> listM45350;
        m42770(mo8672(), EnumC13324.LIST);
        C19697 c19697 = null;
        try {
            try {
                c19697Mo27937 = this.f57020.mo27937();
                try {
                    if (z) {
                        listM45350 = c19697Mo27937.m45387(this.f31505.mo23554());
                    } else {
                        listM45350 = c19697Mo27937.m45350(this.f31505.mo23554(), true);
                    }
                    ArrayList arrayList = new ArrayList(listM45350.size());
                    for (C17642 c17642 : listM45350) {
                        arrayList.add(m42769(this.f57020.mo27914(c17642), c17642));
                    }
                    if (c19697Mo27937 != null) {
                        c19697Mo27937.f63634 = 0L;
                    }
                    return arrayList;
                } catch (IOException e) {
                    e = e;
                    throw C22497.m50453(EnumC13324.LIST, this.f31505.mo23554(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c19697 = c19697Mo27937;
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            c19697Mo27937 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0038: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:19:0x0038 */
    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo8673() throws Throwable {
        IOException e;
        C19697 c19697;
        C19697 c19698 = null;
        if (mo8672().m30885() != EnumC3447.MISSING) {
            throw C22497.m50454(EnumC13324.CREATE_DIRECTORY_SINGLE, EnumC21792.ALREADY_EXISTS, this.f31505.mo23554(), (String) null);
        }
        try {
            try {
                C19697 c19697Mo27937 = this.f57020.mo27937();
                try {
                    c19697Mo27937.m45375(this.f31505.mo23554(), false);
                    c19697Mo27937.f63634 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22497.m50453(EnumC13324.CREATE_DIRECTORY_SINGLE, this.f31505.mo23554(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c19698 = c19697;
                if (c19698 != null) {
                    c19698.f63634 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c19698 != null) {
                c19698.f63634 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܿ */
    public final void mo8676() throws Throwable {
        IOException e;
        C19697 c19697Mo27937;
        C12619 c12619Mo8672 = mo8672();
        C19697 c19697 = null;
        if (c12619Mo8672.m30885() == EnumC3447.MISSING) {
            throw C22497.m50454(EnumC13324.DELETE_FILE_OR_LINK, EnumC21792.NOT_FOUND, this.f31505.mo23554(), (String) null);
        }
        if (c12619Mo8672.m30885() != EnumC3447.REGULAR && c12619Mo8672.m30885() != EnumC3447.LINK) {
            throw C22497.m50454(EnumC13324.DELETE_FILE_OR_LINK, EnumC21792.NOT_REGULAR_FILE, this.f31505.mo23554(), (String) null);
        }
        try {
            c19697Mo27937 = this.f57020.mo27937();
            try {
                try {
                    c19697Mo27937.m45363(this.f31505.mo23554());
                    this.f57020.mo27930();
                    c19697Mo27937.f63634 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22497.m50453(EnumC13324.DELETE_FILE_OR_LINK, this.f31505.mo23554(), (String) null, e);
                }
            } catch (Throwable th) {
                c19697 = c19697Mo27937;
                th = th;
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            c19697Mo27937 = null;
        } catch (Throwable th2) {
            th = th2;
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:17:0x0039 */
    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8677() throws Throwable {
        IOException e;
        C19697 c19697;
        m42770(mo8672(), EnumC13324.DELETE_EMPTY_DIRECTORY);
        C19697 c19698 = null;
        try {
            try {
                C19697 c19697Mo27937 = this.f57020.mo27937();
                try {
                    c19697Mo27937.m45379(this.f31505.mo23554());
                    this.f57020.mo27930();
                    c19697Mo27937.f63634 = 0L;
                } catch (IOException e2) {
                    e = e2;
                    throw C22497.m50453(EnumC13324.DELETE_EMPTY_DIRECTORY, this.f31505.mo23554(), (String) null, e);
                }
            } catch (Throwable th) {
                th = th;
                c19698 = c19697;
                if (c19698 != null) {
                    c19698.f63634 = 0L;
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c19698 != null) {
                c19698.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫ */
    public final void mo8670(AbstractC15440 abstractC15440) throws C22497 {
        if (!abstractC15440.mo27917()) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.CROSS_BACKEND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        EnumC3447 enumC3447M30885 = mo8672().m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        if (enumC3447M30885 == enumC3447) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.NOT_FOUND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        if (abstractC15440.mo23558().mo8672().m30885() != enumC3447) {
            throw C22497.m50454(EnumC13324.RENAME_NO_REPLACE, EnumC21792.ALREADY_EXISTS, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        C19697 c19697Mo27937 = null;
        try {
            try {
                c19697Mo27937 = this.f57020.mo27937();
                c19697Mo27937.m45383(this.f31505.mo23554(), abstractC15440.mo23554());
                this.f57020.mo27930();
                if (abstractC15440 instanceof C11293) {
                    ((C11293) abstractC15440).mo27930();
                }
                c19697Mo27937.f63634 = 0L;
            } catch (IOException e) {
                throw C22497.m50453(EnumC13324.RENAME_NO_REPLACE, this.f31505.mo23554(), abstractC15440.mo23554(), e);
            }
        } catch (Throwable th) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo10993(AbstractC15440 abstractC15440) throws C22497 {
        if (!abstractC15440.mo27917()) {
            throw C22497.m50454(EnumC13324.REPLACE, EnumC21792.CROSS_BACKEND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        if (mo8672().m30885() == EnumC3447.MISSING) {
            throw C22497.m50454(EnumC13324.REPLACE, EnumC21792.NOT_FOUND, this.f31505.mo23554(), abstractC15440.mo23554());
        }
        C19697 c19697Mo27937 = null;
        try {
            try {
                c19697Mo27937 = this.f57020.mo27937();
                c19697Mo27937.m45383(this.f31505.mo23554(), abstractC15440.mo23554());
                this.f57020.mo27930();
                if (abstractC15440 instanceof C11293) {
                    ((C11293) abstractC15440).mo27930();
                }
                c19697Mo27937.f63634 = 0L;
            } catch (IOException e) {
                throw C22497.m50453(EnumC13324.REPLACE, this.f31505.mo23554(), abstractC15440.mo23554(), e);
            }
        } catch (Throwable th) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12619 m42769(AbstractC15440 abstractC15440, C17642 c17642) {
        EnumC3447 enumC3447;
        char cM41288 = c17642.m41288();
        if (cM41288 == 'l') {
            enumC3447 = EnumC3447.LINK;
        } else if (cM41288 == '-') {
            enumC3447 = EnumC3447.REGULAR;
        } else if (cM41288 == 'd') {
            enumC3447 = EnumC3447.DIRECTORY;
        } else {
            enumC3447 = EnumC3447.OTHER;
        }
        EnumC3447 enumC3448 = enumC3447;
        return new C12619(abstractC15440, enumC3448, enumC3448 == EnumC3447.DIRECTORY ? -1L : c17642.m41290(), c17642.m41284(), enumC3448 == EnumC3447.LINK ? c17642.m41285() : null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42770(C12619 c12619, EnumC13324 enumC13324) throws C22497 {
        EnumC3447 enumC3447M30885 = c12619.m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (enumC3447M30885 == enumC3447) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC15440.mo23554(), (String) null);
        }
        if (c12619.m30885() != EnumC3447.DIRECTORY) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_DIRECTORY, abstractC15440.mo23554(), (String) null);
        }
    }
}
