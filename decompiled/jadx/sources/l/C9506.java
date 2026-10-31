package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M292 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9506 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28876;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f28877 = "";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16560 f28878;

    public C9506(C16560 c16560) {
        this.f28878 = c16560;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24365(boolean z) {
        if (this.f28876 != z) {
            this.f28876 = z;
            this.f28877 = "";
            C16560 c16560 = this.f28878;
            if (!z) {
                c16560.m39002(c16560.m39028());
                c16560.f50891.m29927();
            }
            if (c16560.m39021()) {
                c16560.m39016().m24093();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24361() {
        if (this.f28876) {
            this.f28876 = false;
            this.f28877 = "";
            C16560 c16560 = this.f28878;
            if (c16560.m39021()) {
                c16560.m39016().m24088();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24367() {
        return this.f28876;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m24366() {
        return this.f28877;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24364(C2075 c2075) {
        this.f28876 = c2075.f6924;
        this.f28877 = c2075.f6925;
        C16560 c16560 = this.f28878;
        if (c16560.m39021()) {
            c16560.m39016().m24093();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24363(String str, boolean z) {
        this.f28876 = z;
        this.f28877 = str;
        C16560 c16560 = this.f28878;
        if (c16560.m39021()) {
            c16560.m39016().m24093();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24362(String str) {
        this.f28877 = str;
        C16560 c16560 = this.f28878;
        c16560.m39002(m24360(str, c16560.m39028()));
        c16560.f50891.m29927();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m24360(String str, List list) {
        InterfaceC20795 c8073;
        boolean zIsEmpty = str.isEmpty();
        C23616 c23616 = InterfaceC20795.f67331;
        C6683 c6683 = InterfaceC20795.f67330;
        if (zIsEmpty) {
            c8073 = c6683;
        } else {
            try {
                if (str.startsWith("/")) {
                    if (str.length() > 1) {
                        final Matcher matcher = Pattern.compile(str.substring(1), 66).matcher("");
                        c8073 = new InterfaceC20795() { // from class: l.ܿۢܳ
                            @Override // l.InterfaceC20795
                            /* JADX INFO: renamed from: ֫ */
                            public final boolean mo15147(InterfaceC17889 interfaceC17889) {
                                return matcher.reset(interfaceC17889.getName()).find();
                            }
                        };
                    } else {
                        c8073 = c6683;
                    }
                } else {
                    if (str.startsWith("!/")) {
                        if (str.length() > 2) {
                            c8073 = new C5251(Pattern.compile(str.substring(2), 66).matcher(""));
                        }
                    } else if (str.startsWith("!")) {
                        if (str.length() > 1) {
                            final String lowerCase = str.substring(1).toLowerCase();
                            c8073 = new InterfaceC20795() { // from class: l.ܳۢܳ
                                @Override // l.InterfaceC20795
                                /* JADX INFO: renamed from: ֫ */
                                public final boolean mo15147(InterfaceC17889 interfaceC17889) {
                                    return !interfaceC17889.getName().toLowerCase().contains(lowerCase);
                                }
                            };
                        }
                    } else {
                        c8073 = new C8073(str.toLowerCase());
                    }
                    c8073 = c6683;
                }
            } catch (Exception unused) {
                c8073 = c23616;
            }
        }
        if (c8073 == c23616) {
            return new ArrayList();
        }
        if (c8073 == c6683) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (!interfaceC17889.mo36981() && c8073.mo15147(interfaceC17889)) {
                arrayList.add(interfaceC17889);
            }
        }
        return arrayList;
    }
}
