package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13935 extends C2690 {

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4059 f41613;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f41612 = new C10409();

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f41610 = new C6175();

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18918 f41611 = new C11820();

    public C13935(C16594 c16594, C19624 c19624, InterfaceC4059 interfaceC4059) {
        super(c16594, c19624);
        this.f41613 = interfaceC4059;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3353 m33368(String str, Set set, EnumSet enumSet, Set set2, EnumC7983 enumC7983, EnumSet enumSet2) {
        C16594 c16594 = new C16594(this.f8426, str);
        try {
            C23108 c23108 = (C23108) this.f41613.mo12178(this.f8420, c16594, new C12525(this, c16594, set, enumSet, set2, enumC7983, enumSet2));
            C20143 c20143 = c23108.f74342;
            C16594 c16595 = c23108.f74344;
            C13935 c13935 = c23108.f74343;
            if (c20143.m46401().contains(EnumC1757.FILE_ATTRIBUTE_DIRECTORY)) {
                return new C4764(c20143.m46402(), c13935, c16595);
            }
            return new C7586(c20143.m46402(), c13935, c16595);
        } catch (C16052 e) {
            throw new C1092(e.m37961().getValue(), EnumC22799.SMB2_CREATE, "Cannot resolve path " + c16594, e);
        }
    }

    @Override // l.C2690
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18918 mo8413() {
        return this.f41613.mo12180();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23108 m33366(C13935 c13935, C16594 c16594, Set set, Set set2, Set set3, EnumC7983 enumC7983, Set set4) {
        C20143 c20143M8414 = c13935.m8414(c16594, set, set2, set3, enumC7983, set4);
        try {
            C23108 c23108 = (C23108) c13935.f41613.mo12179(c13935.f8420, c20143M8414, c16594, new C13230(c13935, c16594, set, set2, set3, enumC7983, set4));
            return c23108 != null ? c23108 : new C23108(c20143M8414, c16594, c13935);
        } catch (C16052 e) {
            throw new C1092(e.m37962(), EnumC22799.SMB2_CREATE, "Cannot resolve path " + c16594, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4764 m33369(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC7983 enumC7983, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC15037.class);
        enumSetCopyOf.add(EnumC15037.FILE_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC15037.FILE_NON_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC1757.class);
        enumSetCopyOf2.add(EnumC1757.FILE_ATTRIBUTE_DIRECTORY);
        return (C4764) m33368(str, (Set) enumSet, enumSetCopyOf2, set, enumC7983, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7586 m33372(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC7983 enumC7983, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC15037.class);
        enumSetCopyOf.add(EnumC15037.FILE_NON_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC15037.FILE_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC1757.class);
        enumSetCopyOf2.remove(EnumC1757.FILE_ATTRIBUTE_DIRECTORY);
        return (C7586) m33368(str, (Set) enumSet, enumSetCopyOf2, set, enumC7983, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33371(String str) {
        return m33367(str, EnumSet.of(EnumC15037.FILE_NON_DIRECTORY_FILE), f41612);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33373(String str) {
        return m33367(str, EnumSet.of(EnumC15037.FILE_DIRECTORY_FILE), f41610);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33367(String str, EnumSet enumSet, InterfaceC18918 interfaceC18918) {
        try {
            m33368(str, (Set) EnumSet.of(EnumC11696.FILE_READ_ATTRIBUTES), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_NORMAL), EnumC6737.f20938, EnumC7983.FILE_OPEN, enumSet).close();
            return true;
        } catch (C1092 e) {
            if (interfaceC18918.mo12316(e.m3762())) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m33375(String str) {
        C4764 c4764M33369 = m33369(str, EnumSet.of(EnumC11696.FILE_LIST_DIRECTORY, EnumC11696.FILE_READ_ATTRIBUTES, EnumC11696.FILE_READ_EA), (EnumSet) null, EnumC6737.f20938, EnumC7983.FILE_OPEN, (EnumSet) null);
        C12216 c12216 = c4764M33369.f10615;
        C13935 c13935 = c4764M33369.f10613;
        C16594 c16594 = c4764M33369.f10614;
        InterfaceC2148 interfaceC2148 = c4764M33369.f10616;
        try {
            ArrayList arrayList = new ArrayList();
            C20287 c20287 = new C20287(c4764M33369);
            while (c20287.hasNext()) {
                arrayList.add((AbstractC20808) c20287.next());
            }
            try {
                c4764M33369.close();
                return arrayList;
            } catch (Exception e) {
                interfaceC2148.mo7084("{} close failed for {},{},{}", "Directory", c16594, c13935, c12216, e);
                return arrayList;
            }
        } catch (Throwable th) {
            try {
                c4764M33369.close();
                throw th;
            } catch (Exception e2) {
                interfaceC2148.mo7084("{} close failed for {},{},{}", "Directory", c16594, c13935, c12216, e2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33370(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("rmdir: path should be non-null and non-empty");
        }
        try {
            if (z) {
                for (C2463 c2463 : m33375(str)) {
                    if (!c2463.m47624().equals(".") && !c2463.m47624().equals("..")) {
                        String str2 = str + "\\" + c2463.m47624();
                        if (!C15262.m36280(c2463.m7936(), EnumC1757.FILE_ATTRIBUTE_DIRECTORY)) {
                            m33374(str2);
                        } else {
                            m33370(str2, true);
                        }
                    }
                }
                m33370(str, false);
                return;
            }
            AbstractC3353 abstractC3353M33368 = m33368(str, (Set) EnumSet.of(EnumC11696.DELETE), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_DIRECTORY), (Set) EnumSet.of(EnumC6737.FILE_SHARE_DELETE, EnumC6737.FILE_SHARE_WRITE, EnumC6737.FILE_SHARE_READ), EnumC7983.FILE_OPEN, EnumSet.of(EnumC15037.FILE_DIRECTORY_FILE));
            try {
                C13935 c13935 = abstractC3353M33368.f10613;
                C12216 c12216 = abstractC3353M33368.f10615;
                c13935.getClass();
                C9519 c9519 = new C9519();
                C0097 c0097 = new C0097();
                InterfaceC19397 interfaceC19397M34205 = C14332.m34205(c9519);
                interfaceC19397M34205.mo3622(c9519, c0097);
                c13935.m8416(c12216, EnumC7069.SMB2_0_INFO_FILE, interfaceC19397M34205.mo3621(), c0097.m26098());
                abstractC3353M33368.close();
            } catch (Throwable th) {
                try {
                    abstractC3353M33368.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C1092 e) {
            if (!((C11820) f41611).mo12316(e.m3762())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33374(String str) {
        try {
            AbstractC3353 abstractC3353M33368 = m33368(str, (Set) EnumSet.of(EnumC11696.DELETE), EnumSet.of(EnumC1757.FILE_ATTRIBUTE_NORMAL), (Set) EnumSet.of(EnumC6737.FILE_SHARE_DELETE, EnumC6737.FILE_SHARE_WRITE, EnumC6737.FILE_SHARE_READ), EnumC7983.FILE_OPEN, EnumSet.of(EnumC15037.FILE_NON_DIRECTORY_FILE));
            try {
                C13935 c13935 = abstractC3353M33368.f10613;
                C12216 c12216 = abstractC3353M33368.f10615;
                c13935.getClass();
                C9519 c9519 = new C9519();
                C0097 c0097 = new C0097();
                InterfaceC19397 interfaceC19397M34205 = C14332.m34205(c9519);
                interfaceC19397M34205.mo3622(c9519, c0097);
                c13935.m8416(c12216, EnumC7069.SMB2_0_INFO_FILE, interfaceC19397M34205.mo3621(), c0097.m26098());
                abstractC3353M33368.close();
            } catch (Throwable th) {
                try {
                    abstractC3353M33368.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C1092 e) {
            if (!((C11820) f41611).mo12316(e.m3762())) {
                throw e;
            }
        }
    }

    public final String toString() {
        return "DiskShare[" + this.f8426 + "]";
    }
}
