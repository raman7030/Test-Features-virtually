package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15612 extends C4925 {

    /* JADX INFO: renamed from: ܿ֫ */
    public final InterfaceC6226 f44694;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final InterfaceC20348 f44693 = new C12261();

    /* JADX INFO: renamed from: ۜ֫ */
    public static final InterfaceC20348 f44691 = new C8237();

    /* JADX INFO: renamed from: ܳ֫ */
    public static InterfaceC20348 f44692 = new C13602();

    public C15612(C18139 c18139, C21019 c21019, InterfaceC6226 interfaceC6226) {
        super(c18139, c21019);
        this.f44694 = interfaceC6226;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5555 m35487(String str, Set set, EnumSet enumSet, Set set2, EnumC9955 enumC9955, EnumSet enumSet2) {
        C18139 c18139 = new C18139(this.f11220, str);
        try {
            C24330 c24330 = (C24330) this.f44694.mo14099(this.f11214, c18139, new C14272(this, c18139, set, enumSet, set2, enumC9955, enumSet2));
            C21512 c21512 = c24330.f77087;
            C18139 c181310 = c24330.f77089;
            C15612 c15612 = c24330.f77088;
            if (c21512.m48717().contains(EnumC4038.FILE_ATTRIBUTE_DIRECTORY)) {
                return new C6896(c21512.m48718(), c15612, c181310);
            }
            return new C9578(c21512.m48718(), c15612, c181310);
        } catch (C17624 e) {
            throw new C3406(e.m40148().getValue(), EnumC24036.SMB2_CREATE, "Cannot resolve path " + c18139, e);
        }
    }

    @Override // p067l.C4925
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20348 mo10459() {
        return this.f44694.mo14101();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24330 m35485(C15612 c15612, C18139 c18139, Set set, Set set2, Set set3, EnumC9955 enumC9955, Set set4) {
        C21512 c21512M10460 = c15612.m10460(c18139, set, set2, set3, enumC9955, set4);
        try {
            C24330 c24330 = (C24330) c15612.f44694.mo14100(c15612.f11214, c21512M10460, c18139, new C14942(c15612, c18139, set, set2, set3, enumC9955, set4));
            return c24330 != null ? c24330 : new C24330(c21512M10460, c18139, c15612);
        } catch (C17624 e) {
            throw new C3406(e.m40149(), EnumC24036.SMB2_CREATE, "Cannot resolve path " + c18139, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6896 m35488(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC9955 enumC9955, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC16659.class);
        enumSetCopyOf.add(EnumC16659.FILE_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC16659.FILE_NON_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC4038.class);
        enumSetCopyOf2.add(EnumC4038.FILE_ATTRIBUTE_DIRECTORY);
        return (C6896) m35487(str, (Set) enumSet, enumSetCopyOf2, set, enumC9955, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9578 m35491(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC9955 enumC9955, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC16659.class);
        enumSetCopyOf.add(EnumC16659.FILE_NON_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC16659.FILE_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC4038.class);
        enumSetCopyOf2.remove(EnumC4038.FILE_ATTRIBUTE_DIRECTORY);
        return (C9578) m35487(str, (Set) enumSet, enumSetCopyOf2, set, enumC9955, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35490(String str) {
        return m35486(str, EnumSet.of(EnumC16659.FILE_NON_DIRECTORY_FILE), f44693);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35492(String str) {
        return m35486(str, EnumSet.of(EnumC16659.FILE_DIRECTORY_FILE), f44691);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m35486(String str, EnumSet enumSet, InterfaceC20348 interfaceC20348) {
        try {
            m35487(str, (Set) EnumSet.of(EnumC13484.FILE_READ_ATTRIBUTES), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_NORMAL), EnumC8771.f23812, EnumC9955.FILE_OPEN, enumSet).close();
            return true;
        } catch (C3406 e) {
            if (interfaceC20348.mo14221(e.m6034())) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m35494(String str) {
        C6896 c6896M35488 = m35488(str, EnumSet.of(EnumC13484.FILE_LIST_DIRECTORY, EnumC13484.FILE_READ_ATTRIBUTES, EnumC13484.FILE_READ_EA), (EnumSet) null, EnumC8771.f23812, EnumC9955.FILE_OPEN, (EnumSet) null);
        C13978 c13978 = c6896M35488.f13423;
        C15612 c15612 = c6896M35488.f13421;
        C18139 c18139 = c6896M35488.f13422;
        InterfaceC4410 interfaceC4410 = c6896M35488.f13424;
        try {
            ArrayList arrayList = new ArrayList();
            C21649 c21649 = new C21649(c6896M35488);
            while (c21649.hasNext()) {
                arrayList.add((AbstractC22144) c21649.next());
            }
            try {
                c6896M35488.close();
                return arrayList;
            } catch (Exception e) {
                interfaceC4410.mo9179("{} close failed for {},{},{}", "Directory", c18139, c15612, c13978, e);
                return arrayList;
            }
        } catch (Throwable th) {
            try {
                c6896M35488.close();
                throw th;
            } catch (Exception e2) {
                interfaceC4410.mo9179("{} close failed for {},{},{}", "Directory", c18139, c15612, c13978, e2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35489(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("rmdir: path should be non-null and non-empty");
        }
        try {
            if (z) {
                for (C4709 c4709 : m35494(str)) {
                    if (!c4709.m49952().equals(".") && !c4709.m49952().equals("..")) {
                        String str2 = str + "\\" + c4709.m49952();
                        if (!C16873.m38441(c4709.m9984(), EnumC4038.FILE_ATTRIBUTE_DIRECTORY)) {
                            m35493(str2);
                        } else {
                            m35489(str2, true);
                        }
                    }
                }
                m35489(str, false);
                return;
            }
            AbstractC5555 abstractC5555M35487 = m35487(str, (Set) EnumSet.of(EnumC13484.DELETE), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_DIRECTORY), (Set) EnumSet.of(EnumC8771.FILE_SHARE_DELETE, EnumC8771.FILE_SHARE_WRITE, EnumC8771.FILE_SHARE_READ), EnumC9955.FILE_OPEN, EnumSet.of(EnumC16659.FILE_DIRECTORY_FILE));
            try {
                C15612 c15612 = abstractC5555M35487.f13421;
                C13978 c13978 = abstractC5555M35487.f13423;
                c15612.getClass();
                C11415 c11415 = new C11415();
                C2460 c2460 = new C2460();
                InterfaceC20803 interfaceC20803M36338 = C15989.m36338(c11415);
                interfaceC20803M36338.mo5893(c11415, c2460);
                c15612.m10462(c13978, EnumC9087.SMB2_0_INFO_FILE, interfaceC20803M36338.mo5892(), c2460.m28123());
                abstractC5555M35487.close();
            } catch (Throwable th) {
                try {
                    abstractC5555M35487.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3406 e) {
            if (!((C13602) f44692).mo14221(e.m6034())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35493(String str) {
        try {
            AbstractC5555 abstractC5555M35487 = m35487(str, (Set) EnumSet.of(EnumC13484.DELETE), EnumSet.of(EnumC4038.FILE_ATTRIBUTE_NORMAL), (Set) EnumSet.of(EnumC8771.FILE_SHARE_DELETE, EnumC8771.FILE_SHARE_WRITE, EnumC8771.FILE_SHARE_READ), EnumC9955.FILE_OPEN, EnumSet.of(EnumC16659.FILE_NON_DIRECTORY_FILE));
            try {
                C15612 c15612 = abstractC5555M35487.f13421;
                C13978 c13978 = abstractC5555M35487.f13423;
                c15612.getClass();
                C11415 c11415 = new C11415();
                C2460 c2460 = new C2460();
                InterfaceC20803 interfaceC20803M36338 = C15989.m36338(c11415);
                interfaceC20803M36338.mo5893(c11415, c2460);
                c15612.m10462(c13978, EnumC9087.SMB2_0_INFO_FILE, interfaceC20803M36338.mo5892(), c2460.m28123());
                abstractC5555M35487.close();
            } catch (Throwable th) {
                try {
                    abstractC5555M35487.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3406 e) {
            if (!((C13602) f44692).mo14221(e.m6034())) {
                throw e;
            }
        }
    }

    public final String toString() {
        return "DiskShare[" + this.f11220 + "]";
    }
}
