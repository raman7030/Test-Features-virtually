package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7362 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16739 f22602;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7383 f22603;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f22604;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23795 f22605;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22884 f22606;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f22607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11096 f22608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11096 f22609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22884 f22610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f22611;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC17445 f22612;

    public /* synthetic */ C7362(C23795 c23795, AbstractC15440 abstractC15440, String str, boolean z, C7383 c7383, C20769 c20769, C20974 c20974, int i) {
        this(c23795, abstractC15440, str, z, c7383, c20769, c20974);
    }

    public C7362(C23795 c23795, AbstractC15440 abstractC15440, String str, boolean z, C7383 c7383, C20769 c20769) {
        this(c23795, abstractC15440, str, z, c7383, c20769, null);
    }

    public C7362(C23795 c23795, AbstractC15440 abstractC15440, String str, boolean z, C7383 c7383, C20769 c20769, C20974 c20974) {
        this.f22605 = c23795;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22611 = arrayDeque;
        this.f22612 = c20974;
        this.f22607 = z;
        this.f22603 = c7383;
        this.f22604 = c20769.f67276;
        arrayDeque.push(m19788(abstractC15440, str, ""));
        String str2 = c20769.f67275;
        if (str2.isEmpty()) {
            return;
        }
        String[] strArrSplit = str2.split("/");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            C11096 c11096 = (C11096) this.f22611.peek();
            List list = c11096.f33308;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (((C22884) list.get(i3)).f73803.compareTo(str3) <= 0) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            c11096.f33309 = i2;
            if (i2 == 0) {
                return;
            }
            int i4 = i2 - 1;
            if (!((C22884) list.get(i4)).f73803.equals(str3)) {
                return;
            }
            C22884 c22884 = (C22884) list.get(i4);
            if (this.f22612 == null || i != strArrSplit.length - 1) {
                if (!this.f22607 || !m19791(c22884, c11096)) {
                    return;
                }
            } else {
                if (this.f22607 && c22884.f73804.m30885() == EnumC3447.DIRECTORY) {
                    this.f22610 = c22884;
                    this.f22609 = c11096;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m19791(C22884 c22884, C11096 c11096) throws C3059 {
        try {
            return m19793(c22884, c11096);
        } catch (C3059 e) {
            InterfaceC17445 interfaceC17445 = this.f22612;
            if (interfaceC17445 != null) {
                C2629.m8284(((C20974) interfaceC17445).f67753, "directory_unreadable");
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m19793(C22884 c22884, C11096 c11096) {
        C12619 c12619 = c22884.f73804;
        String strM50967 = c22884.f73803;
        String str = c22884.f73802;
        EnumC3447 enumC3447M30885 = c12619.m30885();
        EnumC3447 enumC3447 = EnumC3447.DIRECTORY;
        if (enumC3447M30885 != enumC3447) {
            return false;
        }
        boolean z = c11096.f33307;
        String str2 = c11096.f33310;
        C12619 c12619M41613 = z ? this.f22605.f77002.m41613(str) : c22884.f73804;
        if (c12619M41613.m30885() != enumC3447) {
            return false;
        }
        if (!str2.isEmpty()) {
            strM50967 = C22870.m50967(str2, "/", strM50967);
        }
        this.f22611.push(m19788(c12619M41613.m30882(), str, strM50967));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19789() throws C3059 {
        String string;
        if (this.f22602 == null) {
            C16739 c16739 = null;
            if (this.f22610 != null) {
                C2629.m8282();
                C22884 c22884 = this.f22610;
                C11096 c11096 = this.f22609;
                this.f22610 = null;
                this.f22609 = null;
                m19791(c22884, c11096);
            }
            while (true) {
                ArrayDeque arrayDeque = this.f22611;
                if (!arrayDeque.isEmpty()) {
                    InterfaceC17445 interfaceC17445 = this.f22612;
                    if (interfaceC17445 != null) {
                        C2629.m8282();
                    }
                    C11096 c11097 = (C11096) arrayDeque.peek();
                    int i = c11097.f33309;
                    String str = c11097.f33310;
                    List list = c11097.f33308;
                    if (i < list.size()) {
                        int i2 = c11097.f33309;
                        c11097.f33309 = i2 + 1;
                        C22884 c22885 = (C22884) list.get(i2);
                        if (str.isEmpty()) {
                            string = c22885.f73803;
                        } else {
                            StringBuilder sbM19190 = C7166.m19190(str, "/");
                            sbM19190.append(c22885.f73803);
                            string = sbM19190.toString();
                        }
                        if (interfaceC17445 != null) {
                            this.f22606 = c22885;
                            this.f22608 = c11097;
                        } else if (this.f22607) {
                            m19791(c22885, c11097);
                        }
                        c16739 = new C16739(c22885.f73804, string);
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    break;
                }
            }
            this.f22602 = c16739;
        }
        return this.f22602 != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C16739 m19794(C7362 c7362) {
        if (!c7362.m19789()) {
            throw new IllegalStateException("No more file entries");
        }
        C16739 c16739 = c7362.f22602;
        if (c7362.f22612 != null) {
            C22884 c22884 = c7362.f22606;
            C11096 c11096 = c7362.f22608;
            if (c7362.f22607 && c22884.f73804.m30885() == EnumC3447.DIRECTORY) {
                c7362.f22610 = c22884;
                c7362.f22609 = c11096;
            }
            c7362.f22606 = null;
            c7362.f22608 = null;
        }
        c7362.f22602 = null;
        return c16739;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m19792(C7362 c7362) {
        if (c7362.f22602 != null || c7362.f22610 != null) {
            return true;
        }
        for (C11096 c11096 : c7362.f22611) {
            if (c11096.f33309 < c11096.f33308.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11096 m19788(AbstractC15440 abstractC15440, String str, String str2) throws C3059 {
        C7383 c7383 = this.f22603;
        C1923 c1923 = new C1923(this.f22604, c7383.f22729, str);
        C23795 c23795 = this.f22605;
        List listM52467 = C23795.m52467(c23795, c1923);
        if (listM52467 != null) {
            return new C11096(str2, listM52467, true);
        }
        c23795.f77002.getClass();
        try {
            List<C12619> listMo8674 = abstractC15440.mo23558().mo8674();
            ArrayList arrayList = new ArrayList(listMo8674.size());
            for (C12619 c12619 : listMo8674) {
                if (c12619.m30885() != EnumC3447.MISSING) {
                    String strM52471 = C23795.m52471(str, c12619.m30882().mo23554());
                    if (c7383.m19881(strM52471).f73841.m16736()) {
                        arrayList.add(new C22884(c12619, strM52471, C23795.m52473(str, strM52471)));
                    }
                }
            }
            C6083.sort(arrayList, C8200.comparing(new C13711()));
            C23795.m52469(c23795, c1923, arrayList);
            return new C11096(str2, arrayList, false);
        } catch (C22497 e) {
            throw C17760.m41604(e);
        }
    }
}
