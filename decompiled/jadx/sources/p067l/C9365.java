package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9365 {

    /* JADX INFO: renamed from: ֫ */
    public C18277 f25516;

    /* JADX INFO: renamed from: ۜ */
    public final C9385 f25517;

    /* JADX INFO: renamed from: ۡ */
    public final String f25518;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C24983 f25519;

    /* JADX INFO: renamed from: ۧ */
    public C24117 f25520;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f25521;

    /* JADX INFO: renamed from: ܽ */
    public C12914 f25522;

    /* JADX INFO: renamed from: ܿ */
    public C12914 f25523;

    /* JADX INFO: renamed from: ᩳ */
    public C24117 f25524;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayDeque f25525;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC18948 f25526;

    public /* synthetic */ C9365(C24983 c24983, AbstractC17043 abstractC17043, String str, boolean z, C9385 c9385, C22107 c22107, C22302 c22302, int i) {
        this(c24983, abstractC17043, str, z, c9385, c22107, c22302);
    }

    public C9365(C24983 c24983, AbstractC17043 abstractC17043, String str, boolean z, C9385 c9385, C22107 c22107) {
        this(c24983, abstractC17043, str, z, c9385, c22107, null);
    }

    public C9365(C24983 c24983, AbstractC17043 abstractC17043, String str, boolean z, C9385 c9385, C22107 c22107, C22302 c22302) {
        this.f25519 = c24983;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f25525 = arrayDeque;
        this.f25526 = c22302;
        this.f25521 = z;
        this.f25517 = c9385;
        this.f25518 = c22107.f69960;
        arrayDeque.push(m21761(abstractC17043, str, ""));
        String str2 = c22107.f69959;
        if (str2.isEmpty()) {
            return;
        }
        String[] strArrSplit = str2.split("/");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            C12914 c12914 = (C12914) this.f25525.peek();
            List list = c12914.f36310;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (((C24117) list.get(i3)).f76534.compareTo(str3) <= 0) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            c12914.f36311 = i2;
            if (i2 == 0) {
                return;
            }
            int i4 = i2 - 1;
            if (!((C24117) list.get(i4)).f76534.equals(str3)) {
                return;
            }
            C24117 c24117 = (C24117) list.get(i4);
            if (this.f25526 == null || i != strArrSplit.length - 1) {
                if (!this.f25521 || !m21764(c24117, c12914)) {
                    return;
                }
            } else {
                if (this.f25521 && c24117.f76535.m32962() == EnumC5645.DIRECTORY) {
                    this.f25524 = c24117;
                    this.f25523 = c12914;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m21764(C24117 c24117, C12914 c12914) throws C5276 {
        try {
            return m21766(c24117, c12914);
        } catch (C5276 e) {
            InterfaceC18948 interfaceC18948 = this.f25526;
            if (interfaceC18948 != null) {
                C4867.m10328(((C22302) interfaceC18948).f70439, "directory_unreadable");
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m21766(C24117 c24117, C12914 c12914) {
        C14362 c14362 = c24117.f76535;
        String strM53357 = c24117.f76534;
        String str = c24117.f76533;
        EnumC5645 enumC5645M32962 = c14362.m32962();
        EnumC5645 enumC5645 = EnumC5645.DIRECTORY;
        if (enumC5645M32962 != enumC5645) {
            return false;
        }
        boolean z = c12914.f36309;
        String str2 = c12914.f36312;
        C14362 c14362M43858 = z ? this.f25519.f79755.m43858(str) : c24117.f76535;
        if (c14362M43858.m32962() != enumC5645) {
            return false;
        }
        if (!str2.isEmpty()) {
            strM53357 = C24104.m53357(str2, "/", strM53357);
        }
        this.f25525.push(m21761(c14362M43858.m32959(), str, strM53357));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m21762() throws C5276 {
        String string;
        if (this.f25516 == null) {
            C18277 c18277 = null;
            if (this.f25524 != null) {
                C4867.m10326();
                C24117 c24117 = this.f25524;
                C12914 c12914 = this.f25523;
                this.f25524 = null;
                this.f25523 = null;
                m21764(c24117, c12914);
            }
            while (true) {
                ArrayDeque arrayDeque = this.f25525;
                if (!arrayDeque.isEmpty()) {
                    InterfaceC18948 interfaceC18948 = this.f25526;
                    if (interfaceC18948 != null) {
                        C4867.m10326();
                    }
                    C12914 c12915 = (C12914) arrayDeque.peek();
                    int i = c12915.f36311;
                    String str = c12915.f36312;
                    List list = c12915.f36310;
                    if (i < list.size()) {
                        int i2 = c12915.f36311;
                        c12915.f36311 = i2 + 1;
                        C24117 c24118 = (C24117) list.get(i2);
                        if (str.isEmpty()) {
                            string = c24118.f76534;
                        } else {
                            StringBuilder sbM21133 = C9179.m21133(str, "/");
                            sbM21133.append(c24118.f76534);
                            string = sbM21133.toString();
                        }
                        if (interfaceC18948 != null) {
                            this.f25520 = c24118;
                            this.f25522 = c12915;
                        } else if (this.f25521) {
                            m21764(c24118, c12915);
                        }
                        c18277 = new C18277(c24118.f76535, string);
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    break;
                }
            }
            this.f25516 = c18277;
        }
        return this.f25516 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C18277 m21767(C9365 c9365) {
        if (!c9365.m21762()) {
            throw new IllegalStateException("No more file entries");
        }
        C18277 c18277 = c9365.f25516;
        if (c9365.f25526 != null) {
            C24117 c24117 = c9365.f25520;
            C12914 c12914 = c9365.f25522;
            if (c9365.f25521 && c24117.f76535.m32962() == EnumC5645.DIRECTORY) {
                c9365.f25524 = c24117;
                c9365.f25523 = c12914;
            }
            c9365.f25520 = null;
            c9365.f25522 = null;
        }
        c9365.f25516 = null;
        return c18277;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m21765(C9365 c9365) {
        if (c9365.f25516 != null || c9365.f25524 != null) {
            return true;
        }
        for (C12914 c12914 : c9365.f25525) {
            if (c12914.f36311 < c12914.f36310.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C12914 m21761(AbstractC17043 abstractC17043, String str, String str2) throws C5276 {
        C9385 c9385 = this.f25517;
        C4196 c4196 = new C4196(this.f25518, c9385.f25641, str);
        C24983 c24983 = this.f25519;
        List listM54876 = C24983.m54876(c24983, c4196);
        if (listM54876 != null) {
            return new C12914(str2, listM54876, true);
        }
        c24983.f79755.getClass();
        try {
            List<C14362> listMo10734 = abstractC17043.mo25509().mo10734();
            ArrayList arrayList = new ArrayList(listMo10734.size());
            for (C14362 c14362 : listMo10734) {
                if (c14362.m32962() != EnumC5645.MISSING) {
                    String strM54880 = C24983.m54880(str, c14362.m32959().mo25505());
                    if (c9385.m21854(strM54880).f76571.m18662()) {
                        arrayList.add(new C24117(c14362, strM54880, C24983.m54882(str, strM54880)));
                    }
                }
            }
            C8150.sort(arrayList, C10162.comparing(new C15399()));
            C24983.m54878(c24983, c4196, arrayList);
            return new C12914(str2, arrayList, false);
        } catch (C23750 e) {
            throw C19247.m43849(e);
        }
    }
}
