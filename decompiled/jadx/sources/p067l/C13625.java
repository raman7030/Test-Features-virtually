package p067l;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.ProviderNotFoundException;
import java.p066io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13625 extends AbstractC22343 implements InterfaceC25104 {

    /* JADX INFO: renamed from: ۜ֫ */
    public static final Set f38338;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final Set f38339;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final Set f38340;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final boolean f38341;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C3566 f38342;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final /* synthetic */ int f38343 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public final HashMap f38344;

    /* JADX INFO: renamed from: ۧ֫ */
    public C4908 f38345;

    /* JADX INFO: renamed from: ܳ֫ */
    public EnumC8260 f38346;

    /* JADX INFO: renamed from: ܽ֫ */
    public HashMap f38347;

    /* JADX INFO: renamed from: ܿ֫ */
    public HashMap f38348;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C21545 f38349;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized InterfaceC6919 m30984(InterfaceC22097 interfaceC22097) {
        InterfaceC16730 attributes;
        InterfaceC6919 interfaceC6919 = (InterfaceC6919) this.f38344.get(interfaceC22097);
        if (interfaceC6919 != null) {
            return interfaceC6919;
        }
        InterfaceC22097 interfaceC22097Mo10413 = this.f38345.mo10413(interfaceC22097);
        InterfaceC6919 c21672 = (InterfaceC6919) this.f38344.get(interfaceC22097Mo10413);
        if (c21672 != null) {
            this.f38344.put(interfaceC22097, c21672);
            return c21672;
        }
        try {
            attributes = C18743.readAttributes(interfaceC22097Mo10413, InterfaceC16730.class, new EnumC16060[0]);
        } catch (IOException unused) {
            c21672 = f38342;
            attributes = null;
        }
        if (attributes != null) {
            if (attributes.isDirectory()) {
                c21672 = new C5578(this, interfaceC22097Mo10413);
            } else {
                try {
                    c21672 = new C21672(this, interfaceC22097);
                } catch (SecurityException | ProviderNotFoundException e) {
                    throw new IOException(e);
                }
            }
        }
        this.f38344.put(interfaceC22097Mo10413, c21672);
        this.f38344.put(interfaceC22097, c21672);
        return c21672;
    }

    static {
        Object[] objArr = {EnumC18398.SOURCE, EnumC18398.CLASS};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f38339 = C21562.unmodifiableSet(hashSet);
        f38342 = new C3566();
        f38340 = Collections.EMPTY_SET;
        Object[] objArr2 = {EnumC12709.FOLLOW_LINKS};
        HashSet hashSet2 = new HashSet(1);
        Object obj2 = objArr2[0];
        C12826.requireNonNull(obj2);
        if (!hashSet2.add(obj2)) {
            throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
        }
        f38338 = C21562.unmodifiableSet(hashSet2);
        f38341 = File.separatorChar == '/';
    }

    public C13625(C5127 c5127, boolean z, Charset charset) {
        super(charset);
        this.f38349 = new C21545();
        this.f38348 = new HashMap();
        this.f38347 = new HashMap();
        this.f38344 = new HashMap();
        if (z) {
            c5127.m10906(InterfaceC13035.class, this);
        }
        mo30985(c5127);
    }

    @Override // p067l.AbstractC22343
    /* JADX INFO: renamed from: ֫ */
    public final void mo30985(C5127 c5127) {
        super.mo30985(c5127);
        C4908 c4908 = (C4908) c5127.m10904(C4908.class);
        if (c4908 == null) {
            c4908 = new C4908();
        }
        this.f38345 = c4908;
        this.f70534.m30879("ignore.symbol.file");
        String strM30872 = this.f70534.m30872("sortFiles");
        if (strM30872 != null) {
            this.f38346 = strM30872.equals("reverse") ? EnumC8260.f21879 : EnumC8260.f21881;
        }
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final ServiceLoader mo4102(InterfaceC4317 interfaceC4317, Class cls) {
        C12826.requireNonNull(interfaceC4317);
        return ServiceLoader.load(cls, mo4114(interfaceC4317));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30986(EnumC22423 enumC22423, Iterable iterable) {
        C12826.requireNonNull(enumC22423);
        C7590 c7590 = iterable == null ? null : new C7590(iterable);
        C23603 c23603 = this.f70529;
        AbstractC12875 abstractC12875M52424 = c23603.m52424(enumC22423);
        if (abstractC12875M52424 == null) {
            if (enumC22423.mo8853()) {
                abstractC12875M52424 = new C20251(c23603, enumC22423, new EnumC2483[0]);
            } else {
                abstractC12875M52424 = new C10192(c23603, enumC22423, new EnumC2483[0]);
            }
            c23603.f75134.put(enumC22423, abstractC12875M52424);
        }
        abstractC12875M52424.mo22379(c7590);
        this.f38348.remove(enumC22423);
        this.f38347.remove(enumC22423);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4108(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return false;
        }
        return abstractC12875M52424.mo25027();
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4109(InterfaceC4317 interfaceC4317, InterfaceC9741 interfaceC9741) {
        C12826.requireNonNull(interfaceC4317);
        C12826.requireNonNull(interfaceC9741);
        if (interfaceC9741 instanceof AbstractC14215) {
            InterfaceC22097 interfaceC22097 = ((AbstractC14215) interfaceC9741).f40497;
            AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
            if (abstractC12875M52424 == null) {
                throw new IllegalArgumentException("unknown location");
            }
            return abstractC12875M52424.mo22381(interfaceC22097);
        }
        throw new IllegalArgumentException(interfaceC9741.getName());
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4110(InterfaceC9741 interfaceC9741, InterfaceC9741 interfaceC9742) {
        C12826.requireNonNull(interfaceC9741);
        C12826.requireNonNull(interfaceC9742);
        if (interfaceC9741 instanceof AbstractC14215) {
            AbstractC14215 abstractC14215 = (AbstractC14215) interfaceC9741;
            if (interfaceC9742 instanceof AbstractC14215) {
                return abstractC14215.f40497.equals(((AbstractC14215) interfaceC9742).f40497);
            }
        }
        return interfaceC9741.equals(interfaceC9742);
    }

    @Override // p067l.InterfaceC25104
    /* JADX INFO: renamed from: ܿ */
    public final Collection mo30988(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return null;
        }
        return abstractC12875M52424.mo8427();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30975(C13625 c13625, InterfaceC22097 interfaceC22097, C12204 c12204) {
        if (!f38341) {
            try {
                String string = interfaceC22097.toRealPath(EnumC16060.NOFOLLOW_LINKS).toString();
                char cCharAt = interfaceC22097.getFileSystem().getSeparator().charAt(0);
                char[] charArray = string.toCharArray();
                char[] charArray2 = c12204.f38099.toCharArray();
                int length = charArray.length - 1;
                int length2 = charArray2.length - 1;
                while (length >= 0 && length2 >= 0) {
                    while (length >= 0 && charArray[length] == cCharAt) {
                        length--;
                    }
                    while (length2 >= 0 && charArray2[length2] == '/') {
                        length2--;
                    }
                    if (length >= 0 && length2 >= 0) {
                        if (charArray[length] != charArray2[length2]) {
                            return false;
                        }
                        length--;
                        length2--;
                    }
                }
                if (length2 >= 0) {
                    return false;
                }
            } catch (IOException unused) {
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC13035, java.io.Flushable
    public final void flush() {
        this.f70528.clear();
        this.f38348.clear();
        this.f38347.clear();
    }

    @Override // p067l.InterfaceC13035, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f70533 > 0) {
            C19660 c19660 = new C19660(this, C13625.class.getName().concat(" DeferredClose"));
            c19660.setDaemon(true);
            c19660.start();
            return;
        }
        this.f70529.m52426();
        HashMap map = this.f38344;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC6919) it.next()).close();
        }
        map.clear();
        this.f38348.clear();
        this.f38347.clear();
        this.f70528.clear();
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ܽ */
    public final ClassLoader mo4114(InterfaceC4317 interfaceC4317) {
        m30982(interfaceC4317);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        final Collection collectionMo8427 = abstractC12875M52424 == null ? null : abstractC12875M52424.mo8427();
        Iterable iterable = collectionMo8427 == null ? null : new Iterable() { // from class: l.ᩴܿ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C16976(collectionMo8427);
            }
        };
        if (iterable == null) {
            return null;
        }
        C20271 c20271 = new C20271();
        Iterator it = iterable.iterator();
        while (true) {
            C16976 c16976 = (C16976) it;
            if (!c16976.f50212.hasNext()) {
                break;
            }
            try {
                c20271.m45777(((File) c16976.next()).toURI().toURL());
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }
        URL[] urlArr = (URL[]) c20271.toArray(new URL[c20271.size()]);
        ClassLoader classLoader = C13625.class.getClassLoader();
        String str = this.f70535;
        if (str != null) {
            try {
                return (ClassLoader) Class.forName(str).asSubclass(ClassLoader.class).getConstructor(URL[].class, ClassLoader.class).newInstance(urlArr, classLoader);
            } catch (ReflectiveOperationException unused) {
            }
        }
        return new URLClassLoader(urlArr, classLoader);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo4100(final InterfaceC4317 interfaceC4317, String str, Set set, boolean z) throws IOException {
        m30982(interfaceC4317);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C12826.requireNonNull(it.next());
        }
        C12204 c12204 = new C12204(str.toString().replace('.', '/'));
        C20271 c20271 = new C20271();
        try {
            for (C14965 c14965 : (List) C15525.computeIfAbsent((Map) C15525.computeIfAbsent(this.f38348, interfaceC4317, new C7780(2, this)), c12204, new Function() { // from class: l.᩵ܿ۠
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C13625.m30973(this.f65939, interfaceC4317);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            })) {
                c14965.f42747.mo6361(c14965.f42746, c12204, set, z, c20271);
            }
            return c20271.m45783();
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final String mo4101(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740) {
        m30982(interfaceC4317);
        C12826.requireNonNull(interfaceC19740);
        Collection collectionMo30988 = mo30988(interfaceC4317);
        if (collectionMo30988 == null) {
            return null;
        }
        if (interfaceC19740 instanceof AbstractC14215) {
            return ((AbstractC14215) interfaceC19740).mo12127(collectionMo30988);
        }
        throw new IllegalArgumentException(interfaceC19740.getClass().getName());
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo4105(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398) {
        m30982(interfaceC4317);
        C12826.requireNonNull(str);
        C12826.requireNonNull(enumC18398);
        if (!f38339.contains(enumC18398)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC18398);
        }
        C8180 c8180M18958 = C8180.m18958(str, enumC18398);
        Collection<InterfaceC22097> collectionMo30988 = mo30988(interfaceC4317);
        if (collectionMo30988 == null) {
            return null;
        }
        for (InterfaceC22097 interfaceC22097 : collectionMo30988) {
            InterfaceC19740 interfaceC19740Mo6360 = m30984(interfaceC22097).mo6360(interfaceC22097, c8180M18958);
            if (interfaceC19740Mo6360 != null) {
                return interfaceC19740Mo6360;
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo4106(InterfaceC4317 interfaceC4317, String str, EnumC18398 enumC18398, InterfaceC9741 interfaceC9741) {
        m30977(interfaceC4317);
        C12826.requireNonNull(enumC18398);
        if (!f38339.contains(enumC18398)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC18398);
        }
        return m30974(interfaceC4317, C8180.m18958(str, enumC18398), interfaceC9741);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9741 mo4103(InterfaceC4317 interfaceC4317, String str) {
        m30977(interfaceC4317);
        try {
            URI uri = new URI(str);
            if (!uri.isAbsolute()) {
                String path = uri.normalize().getPath();
                if (path.length() != 0 && path.equals(uri.getPath()) && !path.startsWith("/") && !path.startsWith("./") && !path.startsWith("../")) {
                    return m30974(interfaceC4317, new C8180(str), (InterfaceC9741) null);
                }
            }
        } catch (URISyntaxException unused) {
        }
        throw new IllegalArgumentException(C21466.m48631("Invalid relative name: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private AbstractC14215 m30974(InterfaceC4317 interfaceC4317, C8180 c8180, InterfaceC9741 interfaceC9741) throws IOException {
        InterfaceC22097 interfaceC22097;
        AbstractC12875 abstractC12875M52424;
        EnumC22423 enumC22423 = EnumC22423.CLASS_OUTPUT;
        C21545 c21545 = this.f38349;
        C23603 c23603 = this.f70529;
        if (interfaceC4317 != enumC22423) {
            EnumC22423 enumC22424 = EnumC22423.SOURCE_OUTPUT;
            if (interfaceC4317 == enumC22424) {
                c23603.getClass();
                if (!enumC22424.mo8853()) {
                    throw new IllegalArgumentException();
                }
                if (((C20251) c23603.m52424(enumC22424)).f62597 != null) {
                    c23603.getClass();
                    if (!enumC22424.mo8853()) {
                        throw new IllegalArgumentException();
                    }
                    abstractC12875M52424 = c23603.m52424(enumC22424);
                } else {
                    c23603.getClass();
                    if (!enumC22423.mo8853()) {
                        throw new IllegalArgumentException();
                    }
                }
                interfaceC22097 = ((C20251) abstractC12875M52424).f62597;
            } else {
                AbstractC12875 abstractC12875M52425 = c23603.m52424(interfaceC4317);
                Iterator it = (abstractC12875M52425 == null ? null : abstractC12875M52425.mo8427()).iterator();
                interfaceC22097 = it.hasNext() ? (InterfaceC22097) it.next() : null;
            }
            if (interfaceC22097 == null) {
                try {
                    c21545.getClass();
                    interfaceC22097 = C10697.get(System.getProperty("user.dir"), new String[0]);
                } catch (InvalidPathException e) {
                    throw new IOException("bad filename " + c8180, e);
                }
            }
            InterfaceC22097 interfaceC22098 = interfaceC22097;
            InterfaceC22097 interfaceC22097M30833 = c8180.m30833(this.f38345.mo10413(interfaceC22098));
            int i = AbstractC14215.f40494;
            return new C6839(this, interfaceC22097M30833, interfaceC22098, c8180, 0);
        }
        c23603.getClass();
        if (!enumC22423.mo8853()) {
            throw new IllegalArgumentException();
        }
        if (((C20251) c23603.m52424(enumC22423)).f62597 == null) {
            String str = c8180.f38099;
            String strSubstring = str.substring(str.lastIndexOf(47) + 1);
            if (interfaceC9741 != null && (interfaceC9741 instanceof AbstractC14215)) {
                return ((AbstractC14215) interfaceC9741).mo12128(strSubstring);
            }
            c21545.getClass();
            InterfaceC22097 interfaceC22099 = C10697.get(strSubstring, new String[0]);
            InterfaceC22097 interfaceC22097Mo10413 = this.f38345.mo10413(interfaceC22099);
            int i2 = AbstractC14215.f40494;
            return new C14885(this, interfaceC22097Mo10413, interfaceC22099, 0);
        }
        c23603.getClass();
        if (!enumC22423.mo8853()) {
            throw new IllegalArgumentException();
        }
        abstractC12875M52424 = c23603.m52424(enumC22423);
        interfaceC22097 = ((C20251) abstractC12875M52424).f62597;
        if (interfaceC22097 == null) {
            c21545.getClass();
            interfaceC22097 = C10697.get(System.getProperty("user.dir"), new String[0]);
        }
        InterfaceC22097 interfaceC220910 = interfaceC22097;
        InterfaceC22097 interfaceC22097M30834 = c8180.m30833(this.f38345.mo10413(interfaceC220910));
        int i3 = AbstractC14215.f40494;
        return new C6839(this, interfaceC22097M30834, interfaceC220910, c8180, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m30983(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
                InterfaceC22097 interfaceC22097Mo10413 = this.f38345.mo10413(interfaceC22097);
                int i = AbstractC14215.f40494;
                arrayList.add(new C14885(this, interfaceC22097Mo10413, interfaceC22097, 0));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ List m30973(C13625 c13625, InterfaceC4317 interfaceC4317) {
        return (List) c13625.f38347.get(interfaceC4317);
    }

    /* JADX INFO: renamed from: ۧ */
    public static HashMap m30978(C13625 c13625, InterfaceC4317 interfaceC4317) {
        List<C14965> listM10283;
        HashMap map = new HashMap();
        Collection<InterfaceC22097> collectionMo30988 = c13625.mo30988(interfaceC4317);
        if (collectionMo30988 == null) {
            listM10283 = C4848.m10283();
        } else {
            ArrayList arrayList = new ArrayList(collectionMo30988.size());
            for (InterfaceC22097 interfaceC22097 : collectionMo30988) {
                try {
                    arrayList.add(new C14965(interfaceC22097, c13625.m30984(interfaceC22097), arrayList.size()));
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            listM10283 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C14965 c14965 : listM10283) {
            if (!c14965.f42747.mo6362()) {
                arrayList2.add(c14965);
            }
        }
        for (C14965 c14966 : listM10283) {
            InterfaceC6919 interfaceC6919 = c14966.f42747;
            if (interfaceC6919.mo6362()) {
                Iterator it = interfaceC6919.mo6359().iterator();
                while (it.hasNext()) {
                    ((List) C15525.computeIfAbsent(map, (C12204) it.next(), new C8307(1, arrayList2))).add(c14966);
                }
            }
        }
        c13625.f38347.put(interfaceC4317, arrayList2);
        C21230.forEach(map.values(), new C2895());
        return map;
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo4112(InterfaceC4317 interfaceC4317, String str) {
        m30980(interfaceC4317);
        C12826.requireNonNull(str);
        EnumC22423 enumC22423 = EnumC22423.SOURCE_OUTPUT;
        C23603 c23603 = this.f70529;
        if (interfaceC4317 == enumC22423) {
            c23603.getClass();
            if (!enumC22423.mo8853()) {
                throw new IllegalArgumentException();
            }
            if (((C20251) c23603.m52424(enumC22423)).f62597 == null) {
                interfaceC4317 = EnumC22423.CLASS_OUTPUT;
            }
        }
        AbstractC12875 abstractC12875M52424 = c23603.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return null;
        }
        return abstractC12875M52424.mo25022(str);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo4113(InterfaceC4317 interfaceC4317, InterfaceC19740 interfaceC19740) {
        m30980(interfaceC4317);
        if (!(interfaceC19740 instanceof AbstractC14215)) {
            return null;
        }
        InterfaceC22097 interfaceC22097M52416 = C23603.m52416(((AbstractC14215) interfaceC19740).f40497);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return null;
        }
        return abstractC12875M52424.mo25025(interfaceC22097M52416);
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ᩳ */
    public final String mo4115(InterfaceC4317 interfaceC4317) {
        m30982(interfaceC4317);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return null;
        }
        return abstractC12875M52424.mo29501();
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo4111(InterfaceC4317 interfaceC4317) {
        m30980(interfaceC4317);
        AbstractC12875 abstractC12875M52424 = this.f70529.m52424(interfaceC4317);
        if (abstractC12875M52424 == null) {
            return null;
        }
        return abstractC12875M52424.mo25026();
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m30977(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        if (interfaceC4317.mo8853()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location: " + interfaceC4317.getName());
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m30980(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        if (interfaceC4317.mo8852() || interfaceC4317.mo8853()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location or a module-oriented location: " + interfaceC4317.getName());
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m30982(InterfaceC4317 interfaceC4317) {
        C12826.requireNonNull(interfaceC4317);
        if (interfaceC4317.mo8852()) {
            throw new IllegalArgumentException("location is module-oriented: " + interfaceC4317.getName());
        }
    }

    @Override // p067l.AbstractC22343
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30987(EnumC2483 enumC2483, String str) {
        if (AbstractC22343.f70526.contains(enumC2483)) {
            this.f38348.clear();
            this.f38347.clear();
        }
        return super.mo30987(enumC2483, str);
    }
}
