package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1302 implements InterfaceC15496, Closeable {

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f4634 = Pattern.compile("(\\P{all})+");

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final HashSet f4636;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C22364 f4637;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public EnumC16280 f4638;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2002 f4639;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2903 f4641;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C6319 f4642;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f4643;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4644;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f4645;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final boolean f4646;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public ServiceLoader f4647;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public SecurityException f4648;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13809 f4649;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C17530 f4650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f4651;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21290 f4652;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16118 f4653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 f4654;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final Set f4655;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4656;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4657;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C3267 f4658;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C11781 f4659;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C6136 f4660;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f4661;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C22694 f4662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4541 f4663;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public ClassLoader f4664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13395 f4665;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15240 f4666;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16824 f4667;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean f4668;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Set f4640 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C14190 f4635 = new C6947(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m4499(C1302 c1302, InterfaceC21848 interfaceC21848, C8358 c8358) {
        c1302.m4500(interfaceC21848, Collections.EMPTY_SET, c8358);
    }

    public final String toString() {
        return "javac ProcessingEnvironment";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m4495(C1302 c1302, C2609 c2609) {
        c1302.getClass();
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1323 c1323 = (C1323) it.next();
            if (c1323.f4745.mo21322("package-info", EnumC16866.SOURCE)) {
                c2609M8239 = c2609M8239.m8246(c1323.f4746);
            }
        }
        return c2609M8239.m8250();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2609 m4509(C1302 c1302, C2609 c2609) {
        c1302.getClass();
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            for (AbstractC5144 abstractC5144 : ((C1323) it.next()).f4738) {
                if (abstractC5144.m14709(EnumC18550.f57582)) {
                    C14163 c14163 = ((C5557) abstractC5144).f17186;
                    C12171.m29637(c14163);
                    c2609M8239 = c2609M8239.m8246(c14163);
                }
            }
        }
        return c2609M8239.m8250();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1302 m4494(C2903 c2903) {
        C1302 c1302 = (C1302) c2903.m8837(C1302.class);
        return c1302 == null ? new C1302(c2903) : c1302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1302(C2903 c2903) {
        String strSubstring;
        this.f4641 = c2903;
        c2903.m8839(C1302.class, this);
        this.f4637 = C22364.m50099(c2903);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f4638 = enumC16280M38301;
        C5931.m16615(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f4659 = c11781M28823;
        this.f4668 = c11781M28823.m28832(EnumC0121.f1182);
        this.f4644 = c11781M28823.m28832(EnumC0121.f1134);
        this.f4646 = c11781M28823.m28832(EnumC0121.f1141);
        this.f4645 = C4824.m14050(c2903).m14055(EnumC20347.PROCESSING);
        C4541 c4541M13316 = C4541.m13316(c2903);
        this.f4663 = c4541M13316;
        if (c11781M28823.m28829(EnumC0121.f1200, "only") || c11781M28823.m28832(EnumC0121.f1156)) {
            c4541M13316.f14464 = EnumC21592.PROCESS;
        }
        this.f4643 = c11781M28823.m28831("fatalEnterError");
        this.f4657 = c11781M28823.m28831("showResolveErrors");
        this.f4656 = c11781M28823.m28832(EnumC0121.f1169);
        this.f4651 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        String str = EnumC10637.f32009.m26686(enumC16280M38301) ? "java.base/" : "";
        String[] strArr = {str.concat("java.lang.Deprecated"), str.concat("java.lang.FunctionalInterface"), str.concat("java.lang.Override"), str.concat("java.lang.SafeVarargs"), str.concat("java.lang.SuppressWarnings"), str.concat("java.lang.annotation.Documented"), str.concat("java.lang.annotation.Inherited"), str.concat("java.lang.annotation.Native"), str.concat("java.lang.annotation.Repeatable"), str.concat("java.lang.annotation.Retention"), str.concat("java.lang.annotation.Target"), str.concat("java.io.Serial")};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str2 = strArr[i];
            C11003.requireNonNull(str2);
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        this.f4655 = C20195.unmodifiableSet(hashSet);
        this.f4667 = new C16824(c2903);
        C17530 c17530 = new C17530();
        c17530.f53540 = 0;
        c17530.f53541 = C22364.m50099(c2903);
        c17530.f53542 = this;
        this.f4650 = c17530;
        this.f4652 = C21290.m48319(c2903);
        int i2 = C21995.f70419;
        if (((C21995) c2903.m8837(C21995.class)) == null) {
            c2903.m8839(C21995.class, new C21995());
            C20661.m47250(c2903);
            C6319.m17456(c2903);
        }
        this.f4658 = C3267.m10022(c2903);
        this.f4642 = C6319.m17456(c2903);
        this.f4665 = C13395.m32391(c2903);
        Set<String> setM28826 = this.f4659.m28826();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : setM28826) {
            if (str3.startsWith("-A") && str3.length() > 2) {
                int iIndexOf = str3.indexOf(61);
                String strSubstring2 = null;
                if (iIndexOf == -1) {
                    strSubstring2 = str3.substring(2);
                    strSubstring = null;
                } else if (iIndexOf >= 3) {
                    String strSubstring3 = str3.substring(2, iIndexOf);
                    strSubstring = iIndexOf < str3.length() + (-1) ? str3.substring(iIndexOf + 1) : null;
                    strSubstring2 = strSubstring3;
                } else {
                    strSubstring = null;
                }
                linkedHashMap.put(strSubstring2, strSubstring);
            }
        }
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) this.f4641.m8837(InterfaceC5808.class);
        if (interfaceC5808 != null) {
            Iterator it = interfaceC5808.m16303().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((InterfaceC10042) it.next()).m25212());
            }
        }
        Map mapUnmodifiableMap = C20195.unmodifiableMap(linkedHashMap);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(mapUnmodifiableMap.keySet());
        this.f4636 = hashSet2;
        C14602.m34851(c2903);
        this.f4662 = C22694.m50706(c2903);
        this.f4661 = C20661.m47250(c2903);
        this.f4639 = C2002.m6532(c2903);
        this.f4660 = C6136.m17057(c2903);
        this.f4649 = C13809.m33121(c2903);
        this.f4654 = C19914.m45820(c2903).m45828();
        this.f4666 = C15240.m36054(c2903);
        C23168.m51341(c2903);
        InterfaceC11223 interfaceC11223 = this.f4651;
        try {
            EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH;
            if (interfaceC11223.mo1710(enumC21101)) {
                try {
                    this.f4647 = interfaceC11223.mo1704(enumC21101, InterfaceC21848.class);
                    return;
                } catch (IOException e) {
                    throw new C6430(e);
                }
            }
            EnumC21101 enumC21102 = EnumC21101.ANNOTATION_PROCESSOR_PATH;
            ClassLoader classLoaderMo1716 = interfaceC11223.mo1710(enumC21102) ? interfaceC11223.mo1716(enumC21102) : interfaceC11223.mo1716(EnumC21101.CLASS_PATH);
            this.f4664 = classLoaderMo1716;
            if (classLoaderMo1716 == 0 || !(classLoaderMo1716 instanceof Closeable)) {
                return;
            }
            C4541 c4541 = this.f4663;
            c4541.f14459 = c4541.f14459.m8246((Closeable) classLoaderMo1716);
        } catch (SecurityException e2) {
            this.f4648 = e2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m4523() {
        Object c18942;
        C12171.m29644(this.f4653);
        EnumC0121 enumC0121 = EnumC0121.f1156;
        C11781 c11781 = this.f4659;
        if (c11781.m28832(enumC0121)) {
            try {
                c18942 = C2609.of((Object) new C13296()).iterator();
            } catch (Throwable th) {
                AssertionError assertionError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertionError.initCause(th);
                throw assertionError;
            }
        } else {
            SecurityException securityException = this.f4648;
            if (securityException == null) {
                String strM28825 = c11781.m28825(EnumC0121.f1158);
                boolean zMo1710 = this.f4651.mo1710(EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH);
                C22364 c22364 = this.f4637;
                if (zMo1710) {
                    if (strM28825 == null) {
                        c18942 = new C5536(this.f4647, c22364);
                    } else {
                        c18942 = new C18942(this.f4647, c22364, strM28825);
                    }
                } else if (strM28825 == null) {
                    ClassLoader classLoader = this.f4664;
                    C5536 c5536 = new C5536();
                    c5536.f17131 = c22364;
                    try {
                        try {
                            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC21848.class, classLoader);
                            c5536.f17133 = serviceLoaderLoad;
                            c5536.f17132 = serviceLoaderLoad.iterator();
                            c18942 = c5536;
                        } catch (Exception unused) {
                            c5536.f17132 = m4508("proc.no.service", (Exception) null);
                            c18942 = c5536;
                        }
                    } catch (Throwable th2) {
                        c22364.m7276(C6241.f19168);
                        throw new C6430(th2);
                    }
                } else {
                    C4125 c4125 = new C4125();
                    c4125.f13081 = null;
                    c4125.f13083 = Arrays.asList(strM28825.split(",")).iterator();
                    c4125.f13080 = this.f4664;
                    c4125.f13082 = c22364;
                    c18942 = c4125;
                }
            } else {
                c18942 = m4508("proc.cant.create.loader", securityException);
            }
        }
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) this.f4641.m8837(InterfaceC5808.class);
        List list = Collections.EMPTY_LIST;
        if (interfaceC5808 != null) {
            list = C5378.stream(interfaceC5808.m16303()).map(new C18865(5)).toList();
        }
        this.f4653 = new C16118(this, C22159.m49777(C2609.of(c18942, (Object) list.iterator()), new C11653(3)));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ServiceLoader m4525() {
        EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH;
        InterfaceC11223 interfaceC11223 = this.f4651;
        if (interfaceC11223.mo1710(enumC21101)) {
            try {
                return interfaceC11223.mo1704(enumC21101, InterfaceC23399.class);
            } catch (IOException e) {
                throw new C6430(e);
            }
        }
        return ServiceLoader.load(InterfaceC23399.class, this.f4664);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Iterator m4508(String str, Exception exc) {
        Collection collectionMo28938;
        InterfaceC11223 interfaceC11223 = this.f4651;
        if (interfaceC11223 instanceof C11844) {
            C11844 c11844 = (C11844) interfaceC11223;
            EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_PATH;
            if (c11844.mo1710(enumC21101)) {
                collectionMo28938 = c11844.mo28938((InterfaceC2050) enumC21101);
            } else {
                collectionMo28938 = c11844.mo28938((InterfaceC2050) EnumC21101.CLASS_PATH);
            }
            if (this.f4659.m28825(EnumC0121.f1158) == null) {
                URL[] urlArr = new URL[1];
                Iterator it = collectionMo28938.iterator();
                while (it.hasNext()) {
                    try {
                        urlArr[0] = ((InterfaceC20758) it.next()).toUri().toURL();
                        if (!C10475.m26366(urlArr)) {
                        }
                    } catch (MalformedURLException e) {
                        throw new AssertionError(e);
                    } catch (C12591 e2) {
                        this.f4637.m7276(C6241.m17192(e2.getLocalizedMessage()));
                    }
                }
                return Collections.EMPTY_LIST.iterator();
            }
            m4497(str, exc);
            throw null;
        }
        m4497(str, exc);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4497(String str, Exception exc) {
        C22364 c22364 = this.f4637;
        if (exc != null) {
            c22364.m7271(str, exc.getLocalizedMessage());
            throw new C6430(exc);
        }
        c22364.m7271(str, new Object[0]);
        throw new C6430();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4522() {
        C16118 c16118 = this.f4653;
        c16118.getClass();
        return c16118.f49661.iterator().hasNext() || c16118.f49662.hasNext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4498(C1302 c1302, LinkedHashSet linkedHashSet, C2609 c2609, C2609 c26010, C2609 c26011) {
        C22364 c22364 = c1302.f4637;
        HashMap map = new HashMap(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9169 interfaceC9169 = (InterfaceC9169) it.next();
            InterfaceC17635 interfaceC17635M48322 = c1302.f4652.m48322(interfaceC9169);
            if (EnumC10637.f32009.m26686(c1302.f4638) && interfaceC17635M48322 != null) {
                str = ((Object) interfaceC17635M48322.mo957()) + "/";
            }
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(interfaceC9169.mo957().toString());
            map.put(sbM15339.toString(), interfaceC9169);
        }
        if (map.size() == 0) {
            map.put("", null);
        }
        C16118 c16118 = c1302.f4653;
        c16118.getClass();
        C9064 c9064 = new C9064(c16118, c16118);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(c2609);
        linkedHashSet2.addAll(c26010);
        linkedHashSet2.addAll(c26011);
        C8358 c8358 = new C8358(false, false, C20195.unmodifiableSet(linkedHashSet2), c1302);
        while (map.size() > 0 && c9064.hasNext()) {
            C19648 next = c9064.next();
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (next.m45164(str2)) {
                    hashSet.add(str2);
                    InterfaceC9169 interfaceC91610 = (InterfaceC9169) entry.getValue();
                    if (interfaceC91610 != null) {
                        linkedHashSet3.add(interfaceC91610);
                    }
                }
            }
            if (hashSet.size() > 0 || next.f63396) {
                boolean zM4500 = c1302.m4500(next.f63397, linkedHashSet3, c8358);
                next.f63396 = true;
                next.m45163(c1302.f4636);
                if (c1302.f4668 || c1302.f4646) {
                    c22364.m50118("x.print.processor.info", next.f63397.getClass().getName(), hashSet.toString(), Boolean.valueOf(zM4500));
                }
                if (zM4500) {
                    map.keySet().removeAll(hashSet);
                }
            }
        }
        map.remove("");
        if (c1302.f4645 && map.size() > 0) {
            map.keySet().removeAll(c1302.f4655);
            if (map.size() > 0) {
                Set setKeySet = map.keySet();
                C11076 c11076 = C14001.f42334;
                c22364.m7275(new C11076("compiler", "proc.annotations.without.processors", setKeySet));
            }
        }
        Iterator it2 = c9064.f27483;
        if (c9064.f27484) {
            return;
        }
        Set set = Collections.EMPTY_SET;
        while (it2.hasNext()) {
            C19648 c19648 = (C19648) it2.next();
            if (c19648.f63396) {
                m4499(c9064.f27481.f49660, c19648.f63397, c8358);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m4500(InterfaceC21848 interfaceC21848, Set set, C8358 c8358) {
        C22364 c22364 = this.f4637;
        C2002 c2002 = this.f4639;
        InterfaceC7213 interfaceC7213M6533 = c2002.m6533(c2002.f6699);
        try {
            try {
                interfaceC21848.mo32267(c8358);
                c2002.m6533(interfaceC7213M6533);
                return true;
            } catch (Throwable th) {
                c2002.m6533(interfaceC7213M6533);
                throw th;
            }
        } catch (C21325 e) {
            AbstractC5698 abstractC5698 = e.f66102;
            C16719 c16719M46989 = e.m46989();
            C12281 c12281 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.access.1", abstractC5698, c16719M46989));
            c2002.m6533(interfaceC7213M6533);
            return false;
        } catch (C20515 e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            AbstractC5698 abstractC5699 = e2.f66102;
            C16719 c16719M469810 = e2.m46989();
            String string = stringWriter.toString();
            C12281 c12282 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.access", abstractC5699, c16719M469810, string));
            c2002.m6533(interfaceC7213M6533);
            return false;
        } catch (Throwable th2) {
            throw new C11181(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4521(C2609 c2609, C2609 c26010, C2609 c26011, C5431 c5431) {
        boolean zM2462;
        C16824 c16824;
        C1302 c1302;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Iterator it = this.f4649.m33129().iterator();
        while (it.hasNext()) {
            setNewSetFromMap.add(((C1755) it.next()).f6075);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c26011.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add((C7814) it2.next());
        }
        this.f4640 = C20195.unmodifiableSet(linkedHashSet);
        C0596 c0596 = new C0596(this, c2609, c26010, setNewSetFromMap, c5431);
        do {
            c0596.m2460(false, false);
            zM2462 = c0596.m2462();
            c16824 = this.f4667;
            boolean zM39562 = c16824.m39562();
            c0596.m2459(this.f4657);
            c0596 = c0596.m2457(new LinkedHashSet(c16824.m39561()), new LinkedHashMap(c16824.m39558()));
            c1302 = c0596.f2324;
            if (c0596.m2462()) {
                zM2462 = true;
            }
            if (!zM39562) {
                break;
            }
        } while (!zM2462);
        c0596.m2460(true, zM2462);
        c0596.m2459(true);
        c16824.m39563();
        HashSet hashSet = this.f4636;
        if (!hashSet.isEmpty()) {
            String string = hashSet.toString();
            C11076 c11076 = C14001.f42334;
            this.f4637.m7275(new C11076("compiler", "proc.unmatched.processor.options", string));
        }
        if (this.f4650.f53540 > 0) {
            zM2462 = true;
        } else if (this.f4656) {
            C4541 c4541 = c1302.f4663;
            if (c4541.f14455.f72451 > 0 && c4541.m13346() > 0) {
                zM2462 = true;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c16824.m39561());
        C2609 c2609M8248 = c0596.f2331;
        C4541 c4542 = this.f4663;
        boolean z = zM2462 || c4542.m13346() > 0;
        if (linkedHashSet2.size() > 0) {
            C2609 c2609M13329 = c4542.m13329((Set) linkedHashSet2, false);
            c2609M8248.getClass();
            c2609M8248 = c2609M13329.m8248(c2609M8248);
        }
        if ((z || c4542.m13346() > 0) && c4542.m13346() == 0) {
            c4542.f14455.f72454++;
        }
        if (c4542.m13345()) {
            c0596.m2458();
            c4542.m13344(c2609M8248);
            c4542.m13338(c2609M8248);
        } else {
            c4542.f14447.clear();
        }
        close();
        C22694 c22694 = this.f4662;
        if (c22694.m50708()) {
            return;
        }
        c22694.m50707(new C20578(EnumC6466.ANNOTATION_PROCESSING));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it;
        ServiceLoader serviceLoader;
        this.f4667.close();
        C16118 c16118 = this.f4653;
        if (c16118 != null && (it = c16118.f49662) != null && (it instanceof C5536) && (serviceLoader = ((C5536) it).f17133) != null) {
            try {
                serviceLoader.reload();
            } catch (Exception unused) {
            }
        }
        this.f4653 = null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17530 m4529() {
        return this.f4650;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16824 m4526() {
        return this.f4667;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21290 m4527() {
        return this.f4652;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21290 m4528() {
        return this.f4652;
    }

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final EnumC3503 m4524() {
        return EnumC16280.m38299(this.f4638);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[LOOP:0: B:35:0x0086->B:36:0x0088, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m4493(boolean z, String str, InterfaceC21848 interfaceC21848, C22364 c22364, boolean z2) {
        String strQuote;
        String strSubstring;
        String strM36561;
        int iIndexOf = str.indexOf(47);
        boolean zM10687 = true;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            if (!EnumC3503.m10693(strSubstring2)) {
                return m4492(str, interfaceC21848, c22364, z2);
            }
            strQuote = Pattern.quote(strSubstring2 + "/");
            strSubstring = str.substring(iIndexOf + 1);
        } else {
            if (str.equals("*")) {
                return C3314.m10126(str);
            }
            strQuote = z ? ".*/" : "";
            strSubstring = str;
        }
        int i = C3314.f10381;
        if (!strSubstring.equals("*")) {
            int iIndexOf2 = strSubstring.indexOf(42);
            if (iIndexOf2 == -1) {
                strM36561 = strSubstring;
                if (zM10687) {
                    for (String str2 : strM36561.split("\\.", strM36561.length() + 2)) {
                        zM10687 &= EnumC3503.m10687(str2);
                    }
                }
            } else if (iIndexOf2 == strSubstring.length() - 1) {
                int i2 = iIndexOf2 - 1;
                if (i2 >= 0) {
                    zM10687 = strSubstring.charAt(i2) == '.';
                    strM36561 = C15472.m36561(2, 0, strSubstring);
                } else {
                    strM36561 = strSubstring;
                }
                if (zM10687) {
                    while (i < r4) {
                        zM10687 &= EnumC3503.m10687(str2);
                    }
                }
            } else {
                zM10687 = false;
            }
        }
        if (!zM10687) {
            return m4492(str, interfaceC21848, c22364, z2);
        }
        StringBuilder sbM15339 = C5368.m15339(strQuote);
        sbM15339.append(C3314.m10127(strSubstring));
        return Pattern.compile(sbM15339.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m4492(String str, InterfaceC21848 interfaceC21848, C22364 c22364, boolean z) {
        if (z) {
            String name = interfaceC21848.getClass().getName();
            C11076 c11076 = C14001.f42334;
            c22364.m7275(new C11076("compiler", "proc.malformed.supported.string", str, name));
        }
        return f4634;
    }
}
