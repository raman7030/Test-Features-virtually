package p067l;

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
public final class C3606 implements InterfaceC17096, Closeable {

    /* JADX INFO: renamed from: ᩸֫ */
    public static final Pattern f7406 = Pattern.compile("(\\P{all})+");

    /* JADX INFO: renamed from: ֨֫ */
    public final HashSet f7408;

    /* JADX INFO: renamed from: ֫֫ */
    public final C23623 f7409;

    /* JADX INFO: renamed from: ۖ֫ */
    public EnumC17840 f7410;

    /* JADX INFO: renamed from: ۗ */
    public final C4271 f7411;

    /* JADX INFO: renamed from: ۙ */
    public final C5127 f7413;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C8374 f7414;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f7415;

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f7416;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f7417;

    /* JADX INFO: renamed from: ۠֫ */
    public final boolean f7418;

    /* JADX INFO: renamed from: ۡ֫ */
    public ServiceLoader f7419;

    /* JADX INFO: renamed from: ۢ֫ */
    public SecurityException f7420;

    /* JADX INFO: renamed from: ۤ */
    public final C15492 f7421;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C19029 f7422;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC13035 f7423;

    /* JADX INFO: renamed from: ۫ */
    public final C22602 f7424;

    /* JADX INFO: renamed from: ۬ */
    public C17687 f7425;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8453 f7426;

    /* JADX INFO: renamed from: ܳ֫ */
    public final Set f7427;

    /* JADX INFO: renamed from: ܶ֫ */
    public final boolean f7428;

    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean f7429;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C5473 f7430;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C13565 f7431;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C8200 f7432;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final C22004 f7433;

    /* JADX INFO: renamed from: ᩵֫ */
    public C23936 f7434;

    /* JADX INFO: renamed from: ᩶ */
    public final C6684 f7435;

    /* JADX INFO: renamed from: ᩷֫ */
    public ClassLoader f7436;

    /* JADX INFO: renamed from: ᩸ */
    public final C15099 f7437;

    /* JADX INFO: renamed from: ᩹ */
    public final C16852 f7438;

    /* JADX INFO: renamed from: ᩺ */
    public final C18358 f7439;

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean f7440;

    /* JADX INFO: renamed from: ۘ֫ */
    public Set f7412 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ֡֫ */
    public final C15854 f7407 = new C8971(this);

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ void m6731(C3606 c3606, InterfaceC23133 interfaceC23133, C10312 c10312) {
        c3606.m6732(interfaceC23133, Collections.EMPTY_SET, c10312);
    }

    public final String toString() {
        return "javac ProcessingEnvironment";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m6727(C3606 c3606, C4848 c4848) {
        c3606.getClass();
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C3626 c3626 = (C3626) it.next();
            if (c3626.f7516.mo23288("package-info", EnumC18398.SOURCE)) {
                c4848M10283 = c4848M10283.m10290(c3626.f7517);
            }
        }
        return c4848M10283.m10294();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4848 m6741(C3606 c3606, C4848 c4848) {
        c3606.getClass();
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            for (AbstractC7257 abstractC7257 : ((C3626) it.next()).f7509) {
                if (abstractC7257.m16617(EnumC19998.f60806)) {
                    C15828 c15828 = ((C7650) abstractC7257).f20027;
                    C1446.m31699(c15828);
                    c4848M10283 = c4848M10283.m10290(c15828);
                }
            }
        }
        return c4848M10283.m10294();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3606 m6726(C5127 c5127) {
        C3606 c3606 = (C3606) c5127.m10904(C3606.class);
        return c3606 == null ? new C3606(c5127) : c3606;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3606(C5127 c5127) {
        String strSubstring;
        this.f7413 = c5127;
        c5127.m10906(C3606.class, this);
        this.f7409 = C23623.m52439(c5127);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f7410 = enumC17840M40515;
        C8005.m18541(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f7431 = c13565M30871;
        this.f7440 = c13565M30871.m30880(EnumC2483.f3958);
        this.f7416 = c13565M30871.m30880(EnumC2483.f3910);
        this.f7418 = c13565M30871.m30880(EnumC2483.f3917);
        this.f7417 = C6953.m15930(c5127).m15935(EnumC21706.PROCESSING);
        C6684 c6684M15204 = C6684.m15204(c5127);
        this.f7435 = c6684M15204;
        if (c13565M30871.m30877(EnumC2483.f3976, "only") || c13565M30871.m30880(EnumC2483.f3932)) {
            c6684M15204.f17295 = EnumC22889.PROCESS;
        }
        this.f7415 = c13565M30871.m30879("fatalEnterError");
        this.f7429 = c13565M30871.m30879("showResolveErrors");
        this.f7428 = c13565M30871.m30880(EnumC2483.f3945);
        this.f7423 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        String str = EnumC12477.f34980.m28726(enumC17840M40515) ? "java.base/" : "";
        String[] strArr = {str.concat("java.lang.Deprecated"), str.concat("java.lang.FunctionalInterface"), str.concat("java.lang.Override"), str.concat("java.lang.SafeVarargs"), str.concat("java.lang.SuppressWarnings"), str.concat("java.lang.annotation.Documented"), str.concat("java.lang.annotation.Inherited"), str.concat("java.lang.annotation.Native"), str.concat("java.lang.annotation.Repeatable"), str.concat("java.lang.annotation.Retention"), str.concat("java.lang.annotation.Target"), str.concat("java.io.Serial")};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str2 = strArr[i];
            C12826.requireNonNull(str2);
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        this.f7427 = C21562.unmodifiableSet(hashSet);
        this.f7439 = new C18358(c5127);
        C19029 c19029 = new C19029();
        c19029.f56731 = 0;
        c19029.f56732 = C23623.m52439(c5127);
        c19029.f56733 = this;
        this.f7422 = c19029;
        this.f7424 = C22602.m50653(c5127);
        int i2 = C23272.f73134;
        if (((C23272) c5127.m10904(C23272.class)) == null) {
            c5127.m10906(C23272.class, new C23272());
            C22004.m49577(c5127);
            C8374.m19396(c5127);
        }
        this.f7430 = C5473.m12055(c5127);
        this.f7414 = C8374.m19396(c5127);
        this.f7437 = C15099.m34493(c5127);
        Set<String> setM30874 = this.f7431.m30874();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : setM30874) {
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
        InterfaceC7888 interfaceC7888 = (InterfaceC7888) this.f7413.m10904(InterfaceC7888.class);
        if (interfaceC7888 != null) {
            Iterator it = interfaceC7888.m18228().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((InterfaceC11912) it.next()).m27229());
            }
        }
        Map mapUnmodifiableMap = C21562.unmodifiableMap(linkedHashMap);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(mapUnmodifiableMap.keySet());
        this.f7408 = hashSet2;
        C16246.m37002(c5127);
        this.f7434 = C23936.m53032(c5127);
        this.f7433 = C22004.m49577(c5127);
        this.f7411 = C4271.m8674(c5127);
        this.f7432 = C8200.m18988(c5127);
        this.f7421 = C15492.m35238(c5127);
        this.f7426 = C21294.m48132(c5127).m48140();
        this.f7438 = C16852.m38215(c5127);
        C24387.m53737(c5127);
        InterfaceC13035 interfaceC13035 = this.f7423;
        try {
            EnumC22423 enumC22423 = EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH;
            if (interfaceC13035.mo4108(enumC22423)) {
                try {
                    this.f7419 = interfaceC13035.mo4102(enumC22423, InterfaceC23133.class);
                    return;
                } catch (IOException e) {
                    throw new C8479(e);
                }
            }
            EnumC22423 enumC22424 = EnumC22423.ANNOTATION_PROCESSOR_PATH;
            ClassLoader classLoaderMo4114 = interfaceC13035.mo4108(enumC22424) ? interfaceC13035.mo4114(enumC22424) : interfaceC13035.mo4114(EnumC22423.CLASS_PATH);
            this.f7436 = classLoaderMo4114;
            if (classLoaderMo4114 == 0 || !(classLoaderMo4114 instanceof Closeable)) {
                return;
            }
            C6684 c6684 = this.f7435;
            c6684.f17290 = c6684.f17290.m10290((Closeable) classLoaderMo4114);
        } catch (SecurityException e2) {
            this.f7420 = e2;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m6755() {
        Object c20371;
        C1446.m31706(this.f7425);
        EnumC2483 enumC2483 = EnumC2483.f3932;
        C13565 c13565 = this.f7431;
        if (c13565.m30880(enumC2483)) {
            try {
                c20371 = C4848.m10276of((Object) new C15005()).iterator();
            } catch (Throwable th) {
                AssertionError assertionError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertionError.initCause(th);
                throw assertionError;
            }
        } else {
            SecurityException securityException = this.f7420;
            if (securityException == null) {
                String strM30873 = c13565.m30873(EnumC2483.f3934);
                boolean zMo4108 = this.f7423.mo4108(EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH);
                C23623 c23623 = this.f7409;
                if (zMo4108) {
                    if (strM30873 == null) {
                        c20371 = new C7630(this.f7419, c23623);
                    } else {
                        c20371 = new C20371(this.f7419, c23623, strM30873);
                    }
                } else if (strM30873 == null) {
                    ClassLoader classLoader = this.f7436;
                    C7630 c7630 = new C7630();
                    c7630.f19973 = c23623;
                    try {
                        try {
                            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC23133.class, classLoader);
                            c7630.f19975 = serviceLoaderLoad;
                            c7630.f19974 = serviceLoaderLoad.iterator();
                            c20371 = c7630;
                        } catch (Exception unused) {
                            c7630.f19974 = m6740("proc.no.service", (Exception) null);
                            c20371 = c7630;
                        }
                    } catch (Throwable th2) {
                        c23623.m9355(C8300.f22033);
                        throw new C8479(th2);
                    }
                } else {
                    C6289 c6289 = new C6289();
                    c6289.f15895 = null;
                    c6289.f15897 = Arrays.asList(strM30873.split(",")).iterator();
                    c6289.f15894 = this.f7436;
                    c6289.f15896 = c23623;
                    c20371 = c6289;
                }
            } else {
                c20371 = m6740("proc.cant.create.loader", securityException);
            }
        }
        InterfaceC7888 interfaceC7888 = (InterfaceC7888) this.f7413.m10904(InterfaceC7888.class);
        List list = Collections.EMPTY_LIST;
        if (interfaceC7888 != null) {
            list = C7480.stream(interfaceC7888.m18228()).map(new C20298(5)).toList();
        }
        this.f7425 = new C17687(this, C23428.m52115(C4848.m10277of(c20371, (Object) list.iterator()), new C13443(3)));
    }

    /* JADX INFO: renamed from: ۜ */
    public final ServiceLoader m6757() {
        EnumC22423 enumC22423 = EnumC22423.ANNOTATION_PROCESSOR_MODULE_PATH;
        InterfaceC13035 interfaceC13035 = this.f7423;
        if (interfaceC13035.mo4108(enumC22423)) {
            try {
                return interfaceC13035.mo4102(enumC22423, InterfaceC24606.class);
            } catch (IOException e) {
                throw new C8479(e);
            }
        }
        return ServiceLoader.load(InterfaceC24606.class, this.f7436);
    }

    /* JADX INFO: renamed from: ۧ */
    private Iterator m6740(String str, Exception exc) {
        Collection collectionMo30988;
        InterfaceC13035 interfaceC13035 = this.f7423;
        if (interfaceC13035 instanceof C13625) {
            C13625 c13625 = (C13625) interfaceC13035;
            EnumC22423 enumC22423 = EnumC22423.ANNOTATION_PROCESSOR_PATH;
            if (c13625.mo4108(enumC22423)) {
                collectionMo30988 = c13625.mo30988((InterfaceC4317) enumC22423);
            } else {
                collectionMo30988 = c13625.mo30988((InterfaceC4317) EnumC22423.CLASS_PATH);
            }
            if (this.f7431.m30873(EnumC2483.f3934) == null) {
                URL[] urlArr = new URL[1];
                Iterator it = collectionMo30988.iterator();
                while (it.hasNext()) {
                    try {
                        urlArr[0] = ((InterfaceC22097) it.next()).toUri().toURL();
                        if (!C12324.m28398(urlArr)) {
                        }
                    } catch (MalformedURLException e) {
                        throw new AssertionError(e);
                    } catch (C14335 e2) {
                        this.f7409.m9355(C8300.m19130(e2.getLocalizedMessage()));
                    }
                }
                return Collections.EMPTY_LIST.iterator();
            }
            m6729(str, exc);
            throw null;
        }
        m6729(str, exc);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6729(String str, Exception exc) {
        C23623 c23623 = this.f7409;
        if (exc != null) {
            c23623.m9350(str, exc.getLocalizedMessage());
            throw new C8479(exc);
        }
        c23623.m9350(str, new Object[0]);
        throw new C8479();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6754() {
        C17687 c17687 = this.f7425;
        c17687.getClass();
        return c17687.f52827.iterator().hasNext() || c17687.f52828.hasNext();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6730(C3606 c3606, LinkedHashSet linkedHashSet, C4848 c4848, C4848 c4849, C4848 c48410) {
        C23623 c23623 = c3606.f7409;
        HashMap map = new HashMap(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            InterfaceC11083 interfaceC11083 = (InterfaceC11083) it.next();
            InterfaceC19129 interfaceC19129M50656 = c3606.f7424.m50656(interfaceC11083);
            if (EnumC12477.f34980.m28726(c3606.f7410) && interfaceC19129M50656 != null) {
                str = ((Object) interfaceC19129M50656.mo3352()) + "/";
            }
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(interfaceC11083.mo3352().toString());
            map.put(sbM17248.toString(), interfaceC11083);
        }
        if (map.size() == 0) {
            map.put("", null);
        }
        C17687 c17687 = c3606.f7425;
        c17687.getClass();
        C10983 c10983 = new C10983(c17687, c17687);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(c4848);
        linkedHashSet2.addAll(c4849);
        linkedHashSet2.addAll(c48410);
        C10312 c10312 = new C10312(false, false, C21562.unmodifiableSet(linkedHashSet2), c3606);
        while (map.size() > 0 && c10983.hasNext()) {
            C21042 next = c10983.next();
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (next.m47460(str2)) {
                    hashSet.add(str2);
                    InterfaceC11083 interfaceC11084 = (InterfaceC11083) entry.getValue();
                    if (interfaceC11084 != null) {
                        linkedHashSet3.add(interfaceC11084);
                    }
                }
            }
            if (hashSet.size() > 0 || next.f66019) {
                boolean zM6732 = c3606.m6732(next.f66020, linkedHashSet3, c10312);
                next.f66019 = true;
                next.m47459(c3606.f7408);
                if (c3606.f7440 || c3606.f7418) {
                    c23623.m52458("x.print.processor.info", next.f66020.getClass().getName(), hashSet.toString(), Boolean.valueOf(zM6732));
                }
                if (zM6732) {
                    map.keySet().removeAll(hashSet);
                }
            }
        }
        map.remove("");
        if (c3606.f7417 && map.size() > 0) {
            map.keySet().removeAll(c3606.f7427);
            if (map.size() > 0) {
                Set setKeySet = map.keySet();
                C12895 c12895 = C15675.f45417;
                c23623.m9354(new C12895("compiler", "proc.annotations.without.processors", setKeySet));
            }
        }
        Iterator it2 = c10983.f30421;
        if (c10983.f30422) {
            return;
        }
        Set set = Collections.EMPTY_SET;
        while (it2.hasNext()) {
            C21042 c21042 = (C21042) it2.next();
            if (c21042.f66019) {
                m6731(c10983.f30419.f52826, c21042.f66020, c10312);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m6732(InterfaceC23133 interfaceC23133, Set set, C10312 c10312) {
        C23623 c23623 = this.f7409;
        C4271 c4271 = this.f7411;
        InterfaceC9223 interfaceC9223M8675 = c4271.m8675(c4271.f9486);
        try {
            try {
                interfaceC23133.mo34368(c10312);
                c4271.m8675(interfaceC9223M8675);
                return true;
            } catch (Throwable th) {
                c4271.m8675(interfaceC9223M8675);
                throw th;
            }
        } catch (C22635 e) {
            AbstractC7783 abstractC7783 = e.f68780;
            C18258 c18258M49312 = e.m49312();
            C14040 c14040 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "proc.cant.access.1", abstractC7783, c18258M49312));
            c4271.m8675(interfaceC9223M8675);
            return false;
        } catch (C21865 e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            AbstractC7783 abstractC7784 = e2.f68780;
            C18258 c18258M49313 = e2.m49312();
            String string = stringWriter.toString();
            C14040 c14041 = C8300.f21997;
            c23623.m9355(new C14040("compiler", "proc.cant.access", abstractC7784, c18258M49313, string));
            c4271.m8675(interfaceC9223M8675);
            return false;
        } catch (Throwable th2) {
            throw new C12995(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX INFO: renamed from: ֫ */
    public final void m6753(C4848 c4848, C4848 c4849, C4848 c48410, C7530 c7530) {
        boolean zM4817;
        C18358 c18358;
        C3606 c3606;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Iterator it = this.f7421.m35246().iterator();
        while (it.hasNext()) {
            setNewSetFromMap.add(((C4036) it.next()).f8851);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c48410.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add((C9794) it2.next());
        }
        this.f7412 = C21562.unmodifiableSet(linkedHashSet);
        C2935 c2935 = new C2935(this, c4848, c4849, setNewSetFromMap, c7530);
        do {
            c2935.m4815(false, false);
            zM4817 = c2935.m4817();
            c18358 = this.f7439;
            boolean zM41798 = c18358.m41798();
            c2935.m4814(this.f7429);
            c2935 = c2935.m4812(new LinkedHashSet(c18358.m41797()), new LinkedHashMap(c18358.m41794()));
            c3606 = c2935.f5098;
            if (c2935.m4817()) {
                zM4817 = true;
            }
            if (!zM41798) {
                break;
            }
        } while (!zM4817);
        c2935.m4815(true, zM4817);
        c2935.m4814(true);
        c18358.m41799();
        HashSet hashSet = this.f7408;
        if (!hashSet.isEmpty()) {
            String string = hashSet.toString();
            C12895 c12895 = C15675.f45417;
            this.f7409.m9354(new C12895("compiler", "proc.unmatched.processor.options", string));
        }
        if (this.f7422.f56731 > 0) {
            zM4817 = true;
        } else if (this.f7428) {
            C6684 c6684 = c3606.f7435;
            if (c6684.f17286.f75177 > 0 && c6684.m15234() > 0) {
                zM4817 = true;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c18358.m41797());
        C4848 c4848M10292 = c2935.f5105;
        C6684 c6685 = this.f7435;
        boolean z = zM4817 || c6685.m15234() > 0;
        if (linkedHashSet2.size() > 0) {
            C4848 c4848M15217 = c6685.m15217((Set) linkedHashSet2, false);
            c4848M10292.getClass();
            c4848M10292 = c4848M15217.m10292(c4848M10292);
        }
        if ((z || c6685.m15234() > 0) && c6685.m15234() == 0) {
            c6685.f17286.f75180++;
        }
        if (c6685.m15233()) {
            c2935.m4813();
            c6685.m15232(c4848M10292);
            c6685.m15226(c4848M10292);
        } else {
            c6685.f17278.clear();
        }
        close();
        C23936 c23936 = this.f7434;
        if (c23936.m53034()) {
            return;
        }
        c23936.m53033(new C21925(EnumC8513.ANNOTATION_PROCESSING));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it;
        ServiceLoader serviceLoader;
        this.f7439.close();
        C17687 c17687 = this.f7425;
        if (c17687 != null && (it = c17687.f52828) != null && (it instanceof C7630) && (serviceLoader = ((C7630) it).f19975) != null) {
            try {
                serviceLoader.reload();
            } catch (Exception unused) {
            }
        }
        this.f7425 = null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C19029 m6761() {
        return this.f7422;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C18358 m6758() {
        return this.f7439;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22602 m6759() {
        return this.f7424;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C22602 m6760() {
        return this.f7424;
    }

    /* JADX INFO: renamed from: ۘۧ */
    public final EnumC5698 m6756() {
        return EnumC17840.m40513(this.f7410);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[LOOP:0: B:35:0x0086->B:36:0x0088, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public static Pattern m6725(boolean z, String str, InterfaceC23133 interfaceC23133, C23623 c23623, boolean z2) {
        String strQuote;
        String strSubstring;
        String strM38720;
        int iIndexOf = str.indexOf(47);
        boolean zM12682 = true;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            if (!EnumC5698.m12688(strSubstring2)) {
                return m6724(str, interfaceC23133, c23623, z2);
            }
            strQuote = Pattern.quote(strSubstring2 + "/");
            strSubstring = str.substring(iIndexOf + 1);
        } else {
            if (str.equals("*")) {
                return C5518.m12162(str);
            }
            strQuote = z ? ".*/" : "";
            strSubstring = str;
        }
        int i = C5518.f13190;
        if (!strSubstring.equals("*")) {
            int iIndexOf2 = strSubstring.indexOf(42);
            if (iIndexOf2 == -1) {
                strM38720 = strSubstring;
                if (zM12682) {
                    for (String str2 : strM38720.split("\\.", strM38720.length() + 2)) {
                        zM12682 &= EnumC5698.m12682(str2);
                    }
                }
            } else if (iIndexOf2 == strSubstring.length() - 1) {
                int i2 = iIndexOf2 - 1;
                if (i2 >= 0) {
                    zM12682 = strSubstring.charAt(i2) == '.';
                    strM38720 = C17073.m38720(2, 0, strSubstring);
                } else {
                    strM38720 = strSubstring;
                }
                if (zM12682) {
                    while (i < r4) {
                        zM12682 &= EnumC5698.m12682(str2);
                    }
                }
            } else {
                zM12682 = false;
            }
        }
        if (!zM12682) {
            return m6724(str, interfaceC23133, c23623, z2);
        }
        StringBuilder sbM17248 = C7470.m17248(strQuote);
        sbM17248.append(C5518.m12163(strSubstring));
        return Pattern.compile(sbM17248.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pattern m6724(String str, InterfaceC23133 interfaceC23133, C23623 c23623, boolean z) {
        if (z) {
            String name = interfaceC23133.getClass().getName();
            C12895 c12895 = C15675.f45417;
            c23623.m9354(new C12895("compiler", "proc.malformed.supported.string", str, name));
        }
        return f7406;
    }
}
