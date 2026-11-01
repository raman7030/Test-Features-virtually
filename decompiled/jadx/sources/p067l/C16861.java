package p067l;

import android.os.Build;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16861 extends C22209 {

    /* JADX INFO: renamed from: ۖ */
    public String f49923;

    /* JADX INFO: renamed from: ۘ */
    public boolean f49924;

    /* JADX INFO: renamed from: ۡ */
    public boolean f49926;

    /* JADX INFO: renamed from: ۢ */
    public boolean f49927;

    /* JADX INFO: renamed from: ܺ */
    public final Predicate f49929;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC22898 f49930;

    /* JADX INFO: renamed from: ᩴ */
    public final String f49931;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC20887 f49933;

    /* JADX INFO: renamed from: ᩵ */
    public static final C4781 f49922 = new C4781(1);

    /* JADX INFO: renamed from: ֡ */
    public static final C20216 f49921 = new C20216();

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f49928 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f49932 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public boolean f49925 = false;

    /* JADX INFO: renamed from: ֫ */
    public static C16861 m38377(String str, C6727 c6727, InterfaceC20887 interfaceC20887) {
        return m38378(str, c6727, interfaceC20887, f49922);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16861 m38378(String str, InterfaceC22898 interfaceC22898, InterfaceC20887 interfaceC20887, Predicate predicate) {
        boolean z = !C18524.m42130(str) && C21129.m47753(str) == null;
        return new C16861(str, interfaceC22898, z, z, interfaceC20887, predicate);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16861 m38376(String str, AbstractC5375 abstractC5375, InterfaceC22898 interfaceC22898, InterfaceC20887 interfaceC20887) {
        C16861 c16861 = new C16861(str, interfaceC22898, abstractC5375.mo11752(), false, interfaceC20887, f49922);
        c16861.f49925 = true;
        return c16861;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16861 m38379(InterfaceC20887 interfaceC20887) {
        return new C16861("", null, true, true, interfaceC20887, f49922);
    }

    public C16861(String str, InterfaceC22898 interfaceC22898, boolean z, boolean z2, InterfaceC20887 interfaceC20887, Predicate predicate) {
        this.f49931 = str;
        this.f49930 = interfaceC22898;
        this.f49926 = z;
        this.f49927 = z2;
        this.f49933 = interfaceC20887;
        this.f49929 = predicate;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m38407() {
        this.f49926 = false;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m38408() {
        this.f49927 = false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m38410() {
        this.f49924 = true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m38406() {
        this.f49925 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38397(String str) {
        this.f49923 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38389(String[] strArr, AbstractC15599 abstractC15599, boolean z) throws IOException {
        for (String str : strArr) {
            InterfaceC19370 interfaceC19370M35470 = abstractC15599.m35470(str);
            m38388(interfaceC19370M35470, ((C17278) interfaceC19370M35470).getName(), abstractC15599, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38388(InterfaceC19370 interfaceC19370, String str, AbstractC15599 abstractC15599, boolean z) throws IOException {
        boolean z2 = false;
        boolean z3 = z && interfaceC19370.mo39144();
        try {
            if (interfaceC19370.isDirectory() && !z3) {
                z2 = true;
            }
            String strM42103 = C18524.m42103(str, z2);
            if (z3) {
                String strMo39143 = interfaceC19370.mo39143();
                if (strMo39143 == null) {
                    throw new IOException(C21466.m48631("Archive symbolic link target is missing: ", str));
                }
                C18524.m42124(strM42103, strMo39143);
            }
            if (interfaceC19370.isDirectory()) {
                for (InterfaceC19370 interfaceC19371 : abstractC15599.mo9708(interfaceC19370.getPath(), true)) {
                    String name = interfaceC19371.getName();
                    if (!strM42103.isEmpty()) {
                        name = C24104.m53357(strM42103, "/", name);
                    }
                    m38388(interfaceC19371, name, abstractC15599, z);
                }
            }
        } catch (IOException e) {
            String path = interfaceC19370.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            throw new IOException(C21466.m48631("Unsafe archive entry path: ", path), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38403(String[] strArr, AbstractC15599 abstractC15599, boolean z, boolean z2) throws IOException {
        AbstractC3451 c7475;
        int i;
        C18028 c18028Mo26440;
        String[] strArr2 = strArr;
        String str = this.f49923;
        if (str != null && strArr2.length != 1) {
            throw new IllegalStateException();
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC3451> arrayList = this.f49928;
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (i2 < length) {
                String str2 = strArr2[i2];
                if (interfaceC20887.mo3924()) {
                    return;
                }
                InterfaceC19370 interfaceC19370M35470 = abstractC15599.m35470(str2);
                String name = str != null ? str : ((C17278) interfaceC19370M35470).getName();
                C17278 c17278 = (C17278) interfaceC19370M35470;
                boolean zIsDirectory = c17278.isDirectory();
                if (z) {
                    name = C18524.m42103(name, zIsDirectory);
                }
                AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f49931, name);
                boolean zMo25094 = abstractC17043M42109.mo25094();
                boolean z3 = this.f49927 && c17278.mo39144();
                boolean z4 = zMo25094 && z3 && this.f49924;
                if (zMo25094 && z3) {
                    if (!this.f49924) {
                        m38391(abstractC17043M42109.mo25505());
                        throw null;
                    }
                }
                if (c17278.isDirectory()) {
                    c7475 = new C2780();
                    if (zMo25094 && !z4) {
                        m38387(abstractC17043M42109);
                    }
                    i = length;
                } else {
                    c7475 = new C7475();
                    if (!zMo25094 || z4) {
                        i = length;
                    } else {
                        m38394(abstractC17043M42109);
                        int iM38375 = m38375(abstractC17043M42109, interfaceC19370M35470, name);
                        i = length;
                        InterfaceC22898 interfaceC22898 = this.f49930;
                        if (interfaceC22898.mo3924()) {
                            interfaceC20887.mo6576();
                            return;
                        }
                        if (iM38375 != 1) {
                            if (iM38375 == 2) {
                                c7475.m6152();
                            } else if (this.f49926) {
                                C19056 c19056 = new C19056();
                                c19056.m43296(abstractC17043M42109);
                                c7475.m6126(c19056.m43295());
                            }
                            if (iM38375 == 0 && interfaceC22898.mo15383() && abstractC17043M42109.mo31068()) {
                                c7475.m6138(true);
                            }
                        }
                        i2++;
                        strArr2 = strArr;
                        str = str;
                        length = i;
                    }
                    c7475.m6122(c17278.getSize());
                    this.f70246 = c7475.m6154() + this.f70246;
                }
                c7475.m6148(name);
                c7475.m6135(c17278.getTime());
                c7475.m6127(z3);
                if (c7475.m6150()) {
                    c7475.m6123(c17278.mo39143());
                }
                if (this.f49926 && c7475.m6145() == null && (c18028Mo26440 = interfaceC19370M35470.mo26440()) != null) {
                    if (interfaceC19370M35470 instanceof C11450) {
                        if (C11450.m26439(c18028Mo26440)) {
                            if (!((C11450) interfaceC19370M35470).mo26445().mo37343()) {
                                try {
                                    c7475.m6126(new C19727(C21759.m49047(((C17278) interfaceC19370M35470).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c7475.m6126(new C19727(c18028Mo26440.m41069(), c18028Mo26440.m41066(), c18028Mo26440.m41064()));
                        }
                    } else {
                        c7475.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                    }
                }
                c7475.m6143(str2);
                c7475.m6137(abstractC17043M42109);
                c7475.m6136(name);
                c7475.m6144(zMo25094);
                arrayList.add(c7475);
                this.f70245++;
                i2++;
                strArr2 = strArr;
                str = str;
                length = i;
            } else {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : arrayList) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (m38390(abstractC3451)) {
                        m38385(abstractC3451.mo4359(), abstractC15599, z);
                    }
                }
                if (z2) {
                    interfaceC20887.mo6577();
                    for (AbstractC3451 abstractC3452 : arrayList) {
                        if (abstractC3452.m6129()) {
                            m38395(abstractC3452.mo4359());
                        }
                    }
                }
                Collections.sort(arrayList, f49921);
                for (AbstractC3451 abstractC3453 : arrayList) {
                    if (abstractC3453.m6129()) {
                        abstractC3453.mo4359().m4361();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38385(C2780 c2780, AbstractC15599 abstractC15599, boolean z) throws IOException {
        AbstractC3451 c2781;
        C18028 c18028Mo26440;
        String strM6139 = c2780.m6139();
        Iterator it = abstractC15599.mo9708(c2780.m6151(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (!zHasNext) {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : c2780.f4692) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (m38390(abstractC3451)) {
                        m38385(abstractC3451.mo4359(), abstractC15599, z);
                    }
                }
                return;
            }
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC20887.mo3924()) {
                return;
            }
            String name = interfaceC19370.getName();
            if (!strM6139.isEmpty()) {
                name = C24104.m53357(strM6139, "/", name);
            }
            boolean zIsDirectory = interfaceC19370.isDirectory();
            if (z) {
                name = C18524.m42103(name, zIsDirectory);
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f49931, name);
            boolean z2 = false;
            boolean z3 = c2780.m6120() && abstractC17043M42109.mo25094();
            boolean z4 = this.f49927 && interfaceC19370.mo39144();
            if (z3 && z4 && this.f49924) {
                z2 = true;
            }
            if (interfaceC19370.isDirectory()) {
                c2781 = new C2780();
                if (z3 && !z2) {
                    m38387(abstractC17043M42109);
                }
            } else {
                C7475 c7475 = new C7475();
                if (z3 && !z2) {
                    m38394(abstractC17043M42109);
                    int iM38375 = m38375(abstractC17043M42109, interfaceC19370, name);
                    InterfaceC22898 interfaceC22898 = this.f49930;
                    if (interfaceC22898.mo3924()) {
                        interfaceC20887.mo6576();
                        return;
                    }
                    if (iM38375 == 1) {
                        c2780.f4693 = true;
                    } else {
                        if (iM38375 == 2) {
                            c7475.m6152();
                        } else {
                            C19056 c19056 = new C19056();
                            c19056.m43296(abstractC17043M42109);
                            c7475.m6126(c19056.m43295());
                        }
                        if (iM38375 == 0 && interfaceC22898.mo15383() && abstractC17043M42109.mo31068()) {
                            c7475.m6138(true);
                        }
                    }
                }
                c7475.m6122(interfaceC19370.getSize());
                this.f70246 = c7475.m6154() + this.f70246;
                c2781 = c7475;
            }
            c2781.m6135(interfaceC19370.getTime());
            c2781.m6127(z4);
            if (c2781.m6150()) {
                c2781.m6123(interfaceC19370.mo39143());
            }
            if (this.f49926 && c2781.m6145() == null && (c18028Mo26440 = interfaceC19370.mo26440()) != null) {
                if (!(interfaceC19370 instanceof C11450)) {
                    c2781.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                } else if (!C11450.m26439(c18028Mo26440)) {
                    c2781.m6126(new C19727(c18028Mo26440.m41069(), c18028Mo26440.m41066(), c18028Mo26440.m41064()));
                } else if (!interfaceC19370.mo26445().mo37343()) {
                    try {
                        c2781.m6126(new C19727(C21759.m49047(interfaceC19370.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c2781.m6143(interfaceC19370.getPath());
            c2781.m6137(abstractC17043M42109);
            c2781.m6136(name);
            c2781.m6144(z3);
            c2780.f4692.add(c2781);
            this.f70245++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m38375(AbstractC17043 abstractC17043, InterfaceC19370 interfaceC19370, String str) {
        boolean zTest = this.f49929.test(abstractC17043);
        if (!this.f49930.mo15381(zTest)) {
            C23568 c23568 = C23568.f75044;
            return this.f49930.mo15379(str, c23568, c23568, false, zTest);
        }
        return this.f49930.mo15379(str, C23568.m52379(interfaceC19370), C23568.m52378(abstractC17043), abstractC17043.mo31068(), zTest);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m38390(AbstractC3451 abstractC3451) {
        if (!abstractC3451.m6129()) {
            return false;
        }
        if (!abstractC3451.m6150() || this.f49925) {
            return (this.f49924 && abstractC3451.m6150() && abstractC3451.m6120()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38399(String[] strArr) throws IOException {
        AbstractC3451 c7475;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC3451> arrayList = this.f49928;
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC20887.mo3924()) {
                    return;
                }
                AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
                String name = abstractC17043M42109.getName();
                AbstractC17043 abstractC17043M421010 = C18524.m42109(this.f49931, name);
                if (!C18524.m42121(abstractC17043M42109.mo25505(), abstractC17043M421010.mo25505())) {
                    boolean zMo25094 = abstractC17043M421010.mo25094();
                    if (abstractC17043M42109.mo25087()) {
                        if (abstractC17043M421010.m38662(abstractC17043M42109)) {
                            throw new C20807(C7050.m16203(R.string.MT_Protector, abstractC17043M42109.mo25505()));
                        }
                        c7475 = new C2780();
                    } else {
                        c7475 = new C7475();
                        c7475.m6122(abstractC17043M42109.mo25101());
                    }
                    c7475.m6148(abstractC17043M42109.getName());
                    c7475.m6135(abstractC17043M42109.mo25091());
                    c7475.m6127(this.f49927 && abstractC17043M42109.m38691());
                    c7475.m6125(abstractC17043M42109);
                    c7475.m6137(abstractC17043M421010);
                    c7475.m6136(name);
                    c7475.m6144(zMo25094);
                    if (!zMo25094) {
                        interfaceC20887.mo6578(name);
                        if (abstractC17043M42109.mo25502(abstractC17043M421010)) {
                            if (c7475.m6129()) {
                                abstractC17043M421010.mo20486(c7475.m6128());
                            }
                            this.f49932.add(c7475);
                            this.f70245++;
                            m50045();
                        }
                    } else if (c7475.f6894) {
                        if (abstractC17043M421010.mo25087() && !abstractC17043M421010.m38691()) {
                            m38391(abstractC17043M421010.mo25505());
                            throw null;
                        }
                    } else if (c7475.m6129()) {
                        m38387(abstractC17043M421010);
                    } else {
                        m38394(abstractC17043M421010);
                    }
                    if (c7475.f6894 || !c7475.m6129()) {
                        C7475 c7475Mo4363 = c7475.mo4363();
                        if (zMo25094) {
                            c7475Mo4363.m6153();
                            InterfaceC22898 interfaceC22898 = this.f49930;
                            if (interfaceC22898.mo15385()) {
                                interfaceC22898.mo15380(name, C23568.m52378(abstractC17043M42109), C23568.m52378(abstractC17043M421010), abstractC17043M421010.mo31068());
                            }
                            if (interfaceC22898.mo3924()) {
                                interfaceC20887.mo6576();
                                return;
                            }
                            if (interfaceC22898.mo15382() != 1) {
                                if (interfaceC22898.mo15382() == 2) {
                                    c7475Mo4363.m6152();
                                } else if (!c7475.f6894) {
                                    C19056 c19056 = new C19056();
                                    c19056.m43296(abstractC17043M421010);
                                    c7475Mo4363.m6126(c19056.m43295());
                                }
                                if (interfaceC22898.mo15382() == 0 && interfaceC22898.mo15383() && abstractC17043M421010.mo31068()) {
                                    c7475Mo4363.m6138(true);
                                }
                            }
                        }
                        if (!c7475.f6894) {
                            this.f70246 += c7475.f6893;
                        }
                        arrayList.add(c7475);
                        this.f70245++;
                    } else {
                        arrayList.add(c7475);
                        this.f70245++;
                    }
                }
                i++;
            } else {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : arrayList) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && !abstractC3451.m6150()) {
                        m38381(abstractC3451.mo4359());
                    }
                }
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3452 : arrayList) {
                    if (abstractC3452.m6129()) {
                        m38395(abstractC3452.mo4359());
                    }
                }
                Collections.sort(arrayList, f49921);
                for (AbstractC3451 abstractC3453 : arrayList) {
                    if (abstractC3453.m6129()) {
                        abstractC3453.mo4359().m4361();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38381(C2780 c2780) throws IOException {
        AbstractC3451 c7475;
        AbstractC17043 abstractC17043M6131 = c2780.m6131();
        String str = c2780.m6139() + "/";
        Iterator it = abstractC17043M6131.mo25500(true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (!zHasNext) {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : c2780.f4692) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && !abstractC3451.m6150()) {
                        m38381(abstractC3451.mo4359());
                    }
                }
                return;
            }
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            if (interfaceC20887.mo3924()) {
                return;
            }
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(abstractC17043.getName());
            String string = sbM17248.toString();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f49931, string);
            if (!C18524.m42121(abstractC17043.mo25505(), abstractC17043M42109.mo25505())) {
                boolean z = false;
                boolean z2 = c2780.m6120() && abstractC17043M42109.mo25094();
                if (abstractC17043.mo25087()) {
                    c7475 = new C2780();
                } else {
                    c7475 = new C7475();
                    c7475.m6122(abstractC17043.mo25101());
                }
                c7475.m6135(abstractC17043.mo25091());
                if (this.f49927 && abstractC17043.m38691()) {
                    z = true;
                }
                c7475.m6127(z);
                c7475.m6125(abstractC17043);
                c7475.m6137(abstractC17043M42109);
                c7475.m6136(string);
                c7475.m6144(z2);
                if (c2780.m6120() && !z2) {
                    interfaceC20887.mo6578(string);
                    if (abstractC17043.mo25502(abstractC17043M42109)) {
                        if (c7475.m6129()) {
                            abstractC17043M42109.mo20486(c7475.m6128());
                        }
                        this.f49932.add(c7475);
                        this.f70245++;
                        m50045();
                    }
                }
                if (z2) {
                    if (c7475.f6894) {
                        if (abstractC17043M42109.mo25087() && !abstractC17043M42109.m38691()) {
                            m38391(abstractC17043M42109.mo25505());
                            throw null;
                        }
                    } else if (c7475.m6129()) {
                        m38387(abstractC17043M42109);
                    } else {
                        m38394(abstractC17043M42109);
                    }
                }
                if (c7475.f6894 || !c7475.m6129()) {
                    C7475 c7475Mo4363 = c7475.mo4363();
                    if (z2) {
                        if (c2780.m6120()) {
                            c7475Mo4363.m6153();
                        }
                        InterfaceC22898 interfaceC22898 = this.f49930;
                        if (interfaceC22898.mo15385()) {
                            interfaceC22898.mo15380(string, C23568.m52378(abstractC17043), C23568.m52378(abstractC17043M42109), abstractC17043M42109.mo31068());
                        }
                        if (interfaceC22898.mo3924()) {
                            interfaceC20887.mo6576();
                            return;
                        }
                        if (interfaceC22898.mo15382() == 1) {
                            c2780.f4693 = true;
                        } else {
                            if (interfaceC22898.mo15382() == 2) {
                                c7475Mo4363.m6152();
                            } else if (!c7475.f6894) {
                                C19056 c19056 = new C19056();
                                c19056.m43296(abstractC17043M42109);
                                c7475Mo4363.m6126(c19056.m43295());
                            }
                            if (interfaceC22898.mo15382() == 0 && interfaceC22898.mo15383() && abstractC17043M42109.mo31068()) {
                                c7475Mo4363.m6138(true);
                            }
                        }
                    }
                    if (!c7475.f6894) {
                        this.f70246 += c7475.f6893;
                    }
                }
                c2780.f4692.add(c7475);
                this.f70245++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38402(String[] strArr, AbstractC15599 abstractC15599, AbstractC5375 abstractC5375, InterfaceC3343 interfaceC3343) {
        AbstractC3451 c2780;
        C18028 c18028Mo26440;
        C23568 c23568M52379;
        C18028 c18028Mo26441;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC3451> arrayList = this.f49928;
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC20887.mo3924()) {
                    return;
                }
                InterfaceC19370 interfaceC19370M35470 = abstractC15599.m35470(str);
                C17278 c17278 = (C17278) interfaceC19370M35470;
                String name = c17278.getName();
                String strM26403 = C11419.m26403(this.f49931, name);
                boolean zMo11747 = abstractC5375.mo11747(strM26403);
                if (zMo11747 && this.f49927 && c17278.mo39144()) {
                    m38391(strM26403);
                    throw null;
                }
                if (c17278.isDirectory()) {
                    interfaceC3343.setName(name);
                    c2780 = new C2780();
                    if (zMo11747) {
                        m38386(abstractC5375, strM26403);
                    }
                    length = length;
                } else {
                    C7475 c7475 = new C7475();
                    if (zMo11747) {
                        m38393(abstractC5375, strM26403);
                        InterfaceC22898 interfaceC22898 = this.f49930;
                        if (interfaceC22898.mo15385()) {
                            C23568 c23568M523710 = C23568.m52379(interfaceC19370M35470);
                            try {
                                c23568M52379 = C23568.m52379(abstractC5375.m35470(strM26403));
                            } catch (Exception unused) {
                                c23568M52379 = C23568.f75044;
                            }
                            interfaceC22898.mo15380(name, c23568M523710, c23568M52379, false);
                        }
                        if (interfaceC22898.mo3924()) {
                            interfaceC20887.mo6576();
                            return;
                        }
                        if (interfaceC22898.mo15382() != 1) {
                            if (interfaceC22898.mo15382() == 2) {
                                c7475.m6152();
                            } else if (this.f49926 && (c18028Mo26440 = abstractC5375.m35470(strM26403).mo26440()) != null) {
                                c7475.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                            }
                        }
                        i++;
                        strArr2 = strArr;
                        length = length;
                    } else {
                        length = length;
                    }
                    c7475.m6122(c17278.getSize());
                    this.f70246 += c7475.m6154();
                    c2780 = c7475;
                }
                c2780.m6148(name);
                c2780.m6135(c17278.getTime());
                c2780.m6127(this.f49927 && c17278.mo39144());
                if (c2780.m6150()) {
                    c2780.m6123(c17278.mo39143());
                }
                if (this.f49926 && c2780.m6145() == null && (c18028Mo26441 = interfaceC19370M35470.mo26440()) != null) {
                    int iM41069 = c18028Mo26441.m41069();
                    if ((interfaceC19370M35470 instanceof C11450) && C11450.m26439(c18028Mo26441) && !((C11450) interfaceC19370M35470).mo26445().mo37343()) {
                        try {
                            iM41069 = C21759.m49047(((C17278) interfaceC19370M35470).getPath()).m43537();
                        } catch (IOException unused2) {
                        }
                    }
                    c2780.m6126(new C19727(iM41069, -1, -1));
                }
                c2780.m6143(c17278.getPath());
                c2780.m6146(strM26403);
                c2780.m6136(name);
                c2780.m6144(zMo11747);
                arrayList.add(c2780);
                this.f70245++;
                i++;
                strArr2 = strArr;
                length = length;
            } else {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : arrayList) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38384(abstractC3451.mo4359(), abstractC15599, abstractC5375, interfaceC3343);
                    }
                }
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3452 : arrayList) {
                    if (abstractC3452.m6129()) {
                        m38395(abstractC3452.mo4359());
                    }
                }
                Collections.sort(arrayList, f49921);
                for (AbstractC3451 abstractC3453 : arrayList) {
                    if (abstractC3453.m6129()) {
                        abstractC3453.mo4359().m4361();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38384(C2780 c2780, AbstractC15599 abstractC15599, AbstractC5375 abstractC5375, InterfaceC3343 interfaceC3343) throws IOException {
        AbstractC3451 c2781;
        C18028 c18028Mo26440;
        C18028 c18028Mo26441;
        C23568 c23568M52379;
        String str = c2780.m6139() + "/";
        Iterator it = abstractC15599.mo9708(c2780.m6151(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (!zHasNext) {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : c2780.f4692) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38384(abstractC3451.mo4359(), abstractC15599, abstractC5375, interfaceC3343);
                    }
                }
                return;
            }
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC20887.mo3924()) {
                return;
            }
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(interfaceC19370.getName());
            String string = sbM17248.toString();
            String strM26403 = C11419.m26403(this.f49931, string);
            boolean z = false;
            boolean z2 = c2780.m6120() && abstractC5375.mo11747(strM26403);
            if (interfaceC19370.isDirectory()) {
                interfaceC3343.setName(string);
                c2781 = new C2780();
                if (z2) {
                    m38386(abstractC5375, strM26403);
                }
            } else {
                C7475 c7475 = new C7475();
                if (z2) {
                    m38393(abstractC5375, strM26403);
                    InterfaceC22898 interfaceC22898 = this.f49930;
                    if (interfaceC22898.mo15385()) {
                        C23568 c23568M523710 = C23568.m52379(interfaceC19370);
                        try {
                            c23568M52379 = C23568.m52379(abstractC5375.m35470(strM26403));
                        } catch (Exception unused) {
                            c23568M52379 = C23568.f75044;
                        }
                        interfaceC22898.mo15380(string, c23568M523710, c23568M52379, false);
                    }
                    if (interfaceC22898.mo3924()) {
                        interfaceC20887.mo6576();
                        return;
                    } else if (interfaceC22898.mo15382() == 1) {
                        c2780.f4693 = true;
                    } else if (interfaceC22898.mo15382() == 2) {
                        c7475.m6152();
                    } else if (this.f49926 && (c18028Mo26441 = abstractC5375.m35470(strM26403).mo26440()) != null) {
                        c7475.m6126(new C19727(c18028Mo26441.m41069(), -1, -1));
                    }
                }
                c7475.m6122(interfaceC19370.getSize());
                this.f70246 += c7475.m6154();
                c2781 = c7475;
            }
            c2781.m6135(interfaceC19370.getTime());
            if (this.f49927 && interfaceC19370.mo39144()) {
                z = true;
            }
            c2781.m6127(z);
            if (c2781.m6150()) {
                c2781.m6123(interfaceC19370.mo39143());
            }
            if (this.f49926 && c2781.m6145() == null && (c18028Mo26440 = interfaceC19370.mo26440()) != null) {
                int iM41069 = c18028Mo26440.m41069();
                if ((interfaceC19370 instanceof C11450) && C11450.m26439(c18028Mo26440) && !interfaceC19370.mo26445().mo37343()) {
                    try {
                        iM41069 = C21759.m49047(interfaceC19370.getPath()).m43537();
                    } catch (IOException unused2) {
                    }
                }
                c2781.m6126(new C19727(iM41069, -1, -1));
            }
            c2781.m6143(interfaceC19370.getPath());
            c2781.m6146(strM26403);
            c2781.m6136(string);
            c2781.m6144(z2);
            c2780.f4692.add(c2781);
            this.f70245++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX INFO: renamed from: ֫ */
    public final void m38400(String[] strArr, AbstractC5375 abstractC5375, InterfaceC23460 interfaceC23460) throws IOException {
        AbstractC3451 c2780;
        C18028 c18028Mo26440;
        C23568 c23568M52379;
        C18028 c18028Mo26441;
        String[] strArr2 = strArr;
        boolean zMo15799 = abstractC5375.mo15799();
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC3451> arrayList = this.f49928;
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC20887.mo3924()) {
                    return;
                }
                InterfaceC19370 interfaceC19370M35470 = abstractC5375.m35470(str);
                C17278 c17278 = (C17278) interfaceC19370M35470;
                String name = c17278.getName();
                String strM26403 = C11419.m26403(this.f49931, name);
                String path = c17278.getPath();
                if (!zMo15799 ? !path.equals(strM26403) : !path.equalsIgnoreCase(strM26403)) {
                    boolean zMo11747 = abstractC5375.mo11747(strM26403);
                    if (zMo11747 && this.f49927 && c17278.mo39144()) {
                        m38391(strM26403);
                        throw null;
                    }
                    if (c17278.isDirectory()) {
                        interfaceC23460.setName(name);
                        c2780 = new C2780();
                        if (zMo11747) {
                            m38386(abstractC5375, strM26403);
                        }
                        zMo15799 = zMo15799;
                        length = length;
                    } else {
                        C7475 c7475 = new C7475();
                        if (zMo11747) {
                            m38393(abstractC5375, strM26403);
                            InterfaceC22898 interfaceC22898 = this.f49930;
                            if (interfaceC22898.mo15385()) {
                                C23568 c23568M523710 = C23568.m52379(interfaceC19370M35470);
                                try {
                                    c23568M52379 = C23568.m52379(abstractC5375.m35470(strM26403));
                                } catch (Exception unused) {
                                    c23568M52379 = C23568.f75044;
                                }
                                interfaceC22898.mo15380(name, c23568M523710, c23568M52379, false);
                            }
                            if (interfaceC22898.mo3924()) {
                                interfaceC20887.mo6576();
                                return;
                            } else if (interfaceC22898.mo15382() != 1) {
                                if (interfaceC22898.mo15382() == 2) {
                                    c7475.m6152();
                                } else if (this.f49926 && (c18028Mo26440 = abstractC5375.m35470(strM26403).mo26440()) != null) {
                                    c7475.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                                }
                            }
                        } else {
                            zMo15799 = zMo15799;
                            length = length;
                        }
                        c7475.m6122(c17278.getSize());
                        this.f70246 = c7475.m6154() + this.f70246;
                        c2780 = c7475;
                    }
                    c2780.m6148(name);
                    c2780.m6135(c17278.getTime());
                    c2780.m6127(this.f49927 && c17278.mo39144());
                    if (c2780.m6150()) {
                        c2780.m6123(c17278.mo39143());
                    }
                    if (this.f49926 && c2780.m6145() == null && (c18028Mo26441 = interfaceC19370M35470.mo26440()) != null) {
                        int iM41069 = c18028Mo26441.m41069();
                        if ((interfaceC19370M35470 instanceof C11450) && C11450.m26439(c18028Mo26441) && !((C11450) interfaceC19370M35470).mo26445().mo37343()) {
                            try {
                                iM41069 = C21759.m49047(((C17278) interfaceC19370M35470).getPath()).m43537();
                            } catch (IOException unused2) {
                            }
                        }
                        c2780.m6126(new C19727(iM41069, -1, -1));
                    }
                    c2780.m6143(path);
                    c2780.m6146(strM26403);
                    c2780.m6136(name);
                    c2780.m6144(zMo11747);
                    if (!zMo11747 && c2780.m6129()) {
                        try {
                            if (abstractC5375.mo11740(c2780.m6151(), c2780.m6141())) {
                                this.f49932.add(c2780);
                                this.f70245++;
                                m50045();
                            } else {
                                arrayList.add(c2780);
                                this.f70245++;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        arrayList.add(c2780);
                        this.f70245++;
                    }
                } else {
                    zMo15799 = zMo15799;
                    length = length;
                }
                i++;
                strArr2 = strArr;
                zMo15799 = zMo15799;
                length = length;
            } else {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : arrayList) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38382(abstractC3451.mo4359(), abstractC5375, interfaceC23460);
                    }
                }
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3452 : arrayList) {
                    if (abstractC3452.m6129()) {
                        m38395(abstractC3452.mo4359());
                    }
                }
                Collections.sort(arrayList, f49921);
                for (AbstractC3451 abstractC3453 : arrayList) {
                    if (abstractC3453.m6129()) {
                        abstractC3453.mo4359().m4361();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38382(C2780 c2780, AbstractC5375 abstractC5375, InterfaceC23460 interfaceC23460) throws IOException {
        AbstractC3451 c2781;
        C18028 c18028Mo26440;
        C18028 c18028Mo26441;
        C23568 c23568M52379;
        String str = c2780.m6139() + "/";
        Iterator it = abstractC5375.mo9708(c2780.m6151(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (!zHasNext) {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : c2780.f4692) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38382(abstractC3451.mo4359(), abstractC5375, interfaceC23460);
                    }
                }
                return;
            }
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC20887.mo3924()) {
                return;
            }
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(interfaceC19370.getName());
            String string = sbM17248.toString();
            String strM26403 = C11419.m26403(this.f49931, string);
            boolean z = false;
            boolean z2 = c2780.m6120() && abstractC5375.mo11747(strM26403);
            if (interfaceC19370.isDirectory()) {
                interfaceC23460.setName(string);
                c2781 = new C2780();
                if (z2) {
                    m38386(abstractC5375, strM26403);
                }
            } else {
                C7475 c7475 = new C7475();
                if (z2) {
                    m38393(abstractC5375, strM26403);
                    InterfaceC22898 interfaceC22898 = this.f49930;
                    if (interfaceC22898.mo15385()) {
                        C23568 c23568M523710 = C23568.m52379(interfaceC19370);
                        try {
                            c23568M52379 = C23568.m52379(abstractC5375.m35470(strM26403));
                        } catch (Exception unused) {
                            c23568M52379 = C23568.f75044;
                        }
                        interfaceC22898.mo15380(string, c23568M523710, c23568M52379, false);
                    }
                    if (interfaceC22898.mo3924()) {
                        interfaceC20887.mo6576();
                        return;
                    } else if (interfaceC22898.mo15382() == 1) {
                        c2780.f4693 = true;
                    } else if (interfaceC22898.mo15382() == 2) {
                        c7475.m6152();
                    } else if (this.f49926 && (c18028Mo26441 = abstractC5375.m35470(strM26403).mo26440()) != null) {
                        c7475.m6126(new C19727(c18028Mo26441.m41069(), -1, -1));
                    }
                }
                c7475.m6122(interfaceC19370.getSize());
                this.f70246 += c7475.m6154();
                c2781 = c7475;
            }
            c2781.m6135(interfaceC19370.getTime());
            if (this.f49927 && interfaceC19370.mo39144()) {
                z = true;
            }
            c2781.m6127(z);
            if (c2781.m6150()) {
                c2781.m6123(interfaceC19370.mo39143());
            }
            if (this.f49926 && c2781.m6145() == null && (c18028Mo26440 = interfaceC19370.mo26440()) != null) {
                int iM41069 = c18028Mo26440.m41069();
                if ((interfaceC19370 instanceof C11450) && C11450.m26439(c18028Mo26440) && !interfaceC19370.mo26445().mo37343()) {
                    try {
                        iM41069 = C21759.m49047(interfaceC19370.getPath()).m43537();
                    } catch (IOException unused2) {
                    }
                }
                c2781.m6126(new C19727(iM41069, -1, -1));
            }
            c2781.m6143(interfaceC19370.getPath());
            c2781.m6146(strM26403);
            c2781.m6136(string);
            c2781.m6144(z2);
            c2780.f4692.add(c2781);
            this.f70245++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38401(String[] strArr, AbstractC15599 abstractC15599) {
        AbstractC3451 c7475;
        C18028 c18028Mo26440;
        int length = strArr.length;
        int i = 0;
        while (true) {
            InterfaceC20887 interfaceC20887 = this.f49933;
            ArrayList<AbstractC3451> arrayList = this.f49928;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC20887.mo3924()) {
                    return;
                }
                InterfaceC19370 interfaceC19370M35470 = abstractC15599.m35470(str);
                C17278 c17278 = (C17278) interfaceC19370M35470;
                String name = c17278.getName();
                if (c17278.isDirectory()) {
                    c7475 = new C2780();
                } else {
                    c7475 = new C7475();
                    c7475.m6122(c17278.getSize());
                    this.f70246 = c7475.m6154() + this.f70246;
                }
                c7475.m6148(name);
                c7475.m6135(c17278.getTime());
                c7475.m6127(this.f49927 && c17278.mo39144());
                if (c7475.m6150()) {
                    c7475.m6123(c17278.mo39143());
                }
                if (this.f49926 && (c18028Mo26440 = interfaceC19370M35470.mo26440()) != null) {
                    if (interfaceC19370M35470 instanceof C11450) {
                        if (C11450.m26439(c18028Mo26440)) {
                            if (!((C11450) interfaceC19370M35470).mo26445().mo37343()) {
                                try {
                                    c7475.m6126(new C19727(C21759.m49047(((C17278) interfaceC19370M35470).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c7475.m6126(new C19727(c18028Mo26440.m41069(), c18028Mo26440.m41066(), c18028Mo26440.m41064()));
                        }
                    } else {
                        c7475.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                    }
                }
                c7475.m6143(str);
                c7475.m6146(this.f49931 + name);
                c7475.m6136(name);
                c7475.m6144(false);
                arrayList.add(c7475);
                this.f70245++;
                i++;
            } else {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : arrayList) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38383(abstractC3451.mo4359(), abstractC15599);
                    }
                }
                Collections.sort(arrayList, f49921);
                for (AbstractC3451 abstractC3452 : arrayList) {
                    if (abstractC3452.m6129()) {
                        abstractC3452.mo4359().m4361();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38383(C2780 c2780, AbstractC15599 abstractC15599) {
        AbstractC3451 c7475;
        C18028 c18028Mo26440;
        String str = c2780.m6139() + "/";
        Iterator it = abstractC15599.mo9708(c2780.m6151(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC20887 interfaceC20887 = this.f49933;
            if (!zHasNext) {
                interfaceC20887.mo6577();
                for (AbstractC3451 abstractC3451 : c2780.f4692) {
                    if (interfaceC20887.mo3924()) {
                        return;
                    }
                    if (abstractC3451.m6129() && (!abstractC3451.m6150() || this.f49925)) {
                        m38383(abstractC3451.mo4359(), abstractC15599);
                    }
                }
                return;
            }
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC20887.mo3924()) {
                return;
            }
            String strM40053 = C17588.m40053(str, interfaceC19370.getName());
            if (interfaceC19370.isDirectory()) {
                c7475 = new C2780();
            } else {
                c7475 = new C7475();
                c7475.m6122(interfaceC19370.getSize());
                this.f70246 = c7475.m6154() + this.f70246;
            }
            c7475.m6135(interfaceC19370.getTime());
            c7475.m6127(this.f49927 && interfaceC19370.mo39144());
            if (c7475.m6150()) {
                c7475.m6123(interfaceC19370.mo39143());
            }
            if (this.f49926 && (c18028Mo26440 = interfaceC19370.mo26440()) != null) {
                if (!(interfaceC19370 instanceof C11450)) {
                    c7475.m6126(new C19727(c18028Mo26440.m41069(), -1, -1));
                } else if (!C11450.m26439(c18028Mo26440)) {
                    c7475.m6126(new C19727(c18028Mo26440.m41069(), c18028Mo26440.m41066(), c18028Mo26440.m41064()));
                } else if (!interfaceC19370.mo26445().mo37343()) {
                    try {
                        c7475.m6126(new C19727(C21759.m49047(interfaceC19370.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c7475.m6143(interfaceC19370.getPath());
            c7475.m6146(this.f49931 + strM40053);
            c7475.m6136(strM40053);
            c7475.m6144(false);
            c2780.f4692.add(c7475);
            this.f70245++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38391(String str) throws IOException {
        throw new IOException(C21466.m48631("Cannot create symbolic link because it already exists: ", str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38393(AbstractC5375 abstractC5375, String str) throws IOException {
        if (abstractC5375.mo11735(str)) {
            throw new IOException(C6988.m16053("File '", str, "' exists but is a directory"));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38386(AbstractC5375 abstractC5375, String str) throws IOException {
        if (!abstractC5375.mo11735(str)) {
            throw new IOException(C6988.m16053("File '", str, "' exists but is not a directory"));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38394(AbstractC17043 abstractC17043) throws IOException {
        if (abstractC17043.mo25087()) {
            throw new IOException("File '" + abstractC17043 + "' exists but is a directory");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38387(AbstractC17043 abstractC17043) throws IOException {
        if (abstractC17043.mo25087()) {
            return;
        }
        throw new IOException("File '" + abstractC17043 + "' exists but is not a directory");
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m38395(C2780 c2780) {
        if (c2780.m6150()) {
            return;
        }
        if (!c2780.m6120()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c2780.f6898 = countDownLatch;
            Iterator it = c2780.m4364().iterator();
            while (it.hasNext()) {
                ((AbstractC3451) it.next()).mo4360(countDownLatch);
            }
        }
        for (AbstractC3451 abstractC3451 : c2780.m4364()) {
            if (abstractC3451.m6129()) {
                m38395(abstractC3451.mo4359());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38398(C21684 c21684) {
        m38380(this.f49928, c21684);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38380(ArrayList arrayList, InterfaceC10157 interfaceC10157) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3451 abstractC3451 = (AbstractC3451) it.next();
            C21684 c21684 = (C21684) interfaceC10157;
            String str = c21684.f68302;
            C20661 c20661 = c21684.f68303;
            int i = c21684.f68304;
            int i2 = C14977.f42792;
            if (!abstractC3451.m6129()) {
                StringBuilder sbM17248 = C7470.m17248(str);
                sbM17248.append(abstractC3451.m6139());
                C5738 entry = c20661.getEntry(sbM17248.toString());
                if (entry != null && (i == 2 || abstractC3451.m6128() <= entry.getTime())) {
                    it.remove();
                    this.f70245--;
                    if (abstractC3451.m6129()) {
                        m38392(abstractC3451.mo4359());
                    } else {
                        this.f70246 -= abstractC3451.f6893;
                    }
                }
            }
            if (abstractC3451.m6129()) {
                m38380(abstractC3451.mo4359().f4692, interfaceC10157);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38392(C2780 c2780) {
        for (AbstractC3451 abstractC3451 : c2780.f4692) {
            this.f70245--;
            if (abstractC3451.m6129()) {
                m38392(abstractC3451.mo4359());
            } else {
                this.f70246 -= abstractC3451.f6893;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final List m38409() {
        return C21562.unmodifiableList(this.f49928);
    }

    /* JADX INFO: renamed from: ۖ */
    public final List m38405() {
        return C21562.unmodifiableList(this.f49932);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38404(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        C10024 c10024 = new C10024();
        Iterator it = C21562.unmodifiableList(this.f49928).iterator();
        while (it.hasNext()) {
            ((AbstractC3451) it.next()).m6124(c10024, z);
        }
        return c10024.m23404();
    }
}
