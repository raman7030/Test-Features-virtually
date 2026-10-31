package l;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.ProviderNotFoundException;
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
public final class C11844 extends AbstractC21017 implements InterfaceC23922 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final Set f35333;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final Set f35334;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Set f35335;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f35336;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final C1260 f35337;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f35338 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final HashMap f35339;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C2672 f35340;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public EnumC6199 f35341;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public HashMap f35342;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public HashMap f35343;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C20177 f35344;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC4788 m28934(InterfaceC20758 interfaceC20758) {
        InterfaceC15111 attributes;
        InterfaceC4788 interfaceC4788 = (InterfaceC4788) this.f35339.get(interfaceC20758);
        if (interfaceC4788 != null) {
            return interfaceC4788;
        }
        InterfaceC20758 interfaceC20758Mo8367 = this.f35340.mo8367(interfaceC20758);
        InterfaceC4788 c20311 = (InterfaceC4788) this.f35339.get(interfaceC20758Mo8367);
        if (c20311 != null) {
            this.f35339.put(interfaceC20758, c20311);
            return c20311;
        }
        try {
            attributes = C17229.readAttributes(interfaceC20758Mo8367, InterfaceC15111.class, new EnumC14406[0]);
        } catch (IOException unused) {
            c20311 = f35337;
            attributes = null;
        }
        if (attributes != null) {
            if (attributes.isDirectory()) {
                c20311 = new C3377(this, interfaceC20758Mo8367);
            } else {
                try {
                    c20311 = new C20311(this, interfaceC20758);
                } catch (SecurityException | ProviderNotFoundException e) {
                    throw new IOException(e);
                }
            }
        }
        this.f35339.put(interfaceC20758Mo8367, c20311);
        this.f35339.put(interfaceC20758, c20311);
        return c20311;
    }

    static {
        Object[] objArr = {EnumC16866.SOURCE, EnumC16866.CLASS};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f35334 = C20195.unmodifiableSet(hashSet);
        f35337 = new C1260();
        f35335 = Collections.EMPTY_SET;
        Object[] objArr2 = {EnumC10880.FOLLOW_LINKS};
        HashSet hashSet2 = new HashSet(1);
        Object obj2 = objArr2[0];
        C11003.requireNonNull(obj2);
        if (!hashSet2.add(obj2)) {
            throw new IllegalArgumentException(C5368.m15337(obj2, "duplicate element: "));
        }
        f35333 = C20195.unmodifiableSet(hashSet2);
        f35336 = File.separatorChar == '/';
    }

    public C11844(C2903 c2903, boolean z, Charset charset) {
        super(charset);
        this.f35344 = new C20177();
        this.f35343 = new HashMap();
        this.f35342 = new HashMap();
        this.f35339 = new HashMap();
        if (z) {
            c2903.m8839(InterfaceC11223.class, this);
        }
        mo28935(c2903);
    }

    @Override // l.AbstractC21017
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28935(C2903 c2903) {
        super.mo28935(c2903);
        C2672 c2672 = (C2672) c2903.m8837(C2672.class);
        if (c2672 == null) {
            c2672 = new C2672();
        }
        this.f35340 = c2672;
        this.f67849.m28831("ignore.symbol.file");
        String strM28824 = this.f67849.m28824("sortFiles");
        if (strM28824 != null) {
            this.f35341 = strM28824.equals("reverse") ? EnumC6199.f19018 : EnumC6199.f19020;
        }
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final ServiceLoader mo1704(InterfaceC2050 interfaceC2050, Class cls) {
        C11003.requireNonNull(interfaceC2050);
        return ServiceLoader.load(cls, mo1716(interfaceC2050));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28936(EnumC21101 enumC21101, Iterable iterable) {
        C11003.requireNonNull(enumC21101);
        C5494 c5494 = iterable == null ? null : new C5494(iterable);
        C22343 c22343 = this.f67844;
        AbstractC11055 abstractC11055M50085 = c22343.m50085(enumC21101);
        if (abstractC11055M50085 == null) {
            if (enumC21101.mo6727()) {
                abstractC11055M50085 = new C18816(c22343, enumC21101, new EnumC0121[0]);
            } else {
                abstractC11055M50085 = new C8232(c22343, enumC21101, new EnumC0121[0]);
            }
            c22343.f72408.put(enumC21101, abstractC11055M50085);
        }
        abstractC11055M50085.mo20400(c5494);
        this.f35343.remove(enumC21101);
        this.f35342.remove(enumC21101);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1710(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return false;
        }
        return abstractC11055M50085.mo23053();
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1711(InterfaceC2050 interfaceC2050, InterfaceC7757 interfaceC7757) {
        C11003.requireNonNull(interfaceC2050);
        C11003.requireNonNull(interfaceC7757);
        if (interfaceC7757 instanceof AbstractC12465) {
            InterfaceC20758 interfaceC20758 = ((AbstractC12465) interfaceC7757).f37477;
            AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
            if (abstractC11055M50085 == null) {
                throw new IllegalArgumentException("unknown location");
            }
            return abstractC11055M50085.mo20402(interfaceC20758);
        }
        throw new IllegalArgumentException(interfaceC7757.getName());
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1712(InterfaceC7757 interfaceC7757, InterfaceC7757 interfaceC7758) {
        C11003.requireNonNull(interfaceC7757);
        C11003.requireNonNull(interfaceC7758);
        if (interfaceC7757 instanceof AbstractC12465) {
            AbstractC12465 abstractC12465 = (AbstractC12465) interfaceC7757;
            if (interfaceC7758 instanceof AbstractC12465) {
                return abstractC12465.f37477.equals(((AbstractC12465) interfaceC7758).f37477);
            }
        }
        return interfaceC7757.equals(interfaceC7758);
    }

    @Override // l.InterfaceC23922
    /* JADX INFO: renamed from: ܿ */
    public final Collection mo28938(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return null;
        }
        return abstractC11055M50085.mo6225();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28925(C11844 c11844, InterfaceC20758 interfaceC20758, C10349 c10349) {
        if (!f35336) {
            try {
                String string = interfaceC20758.toRealPath(EnumC14406.NOFOLLOW_LINKS).toString();
                char cCharAt = interfaceC20758.getFileSystem().getSeparator().charAt(0);
                char[] charArray = string.toCharArray();
                char[] charArray2 = c10349.f35100.toCharArray();
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

    @Override // l.InterfaceC11223, java.io.Flushable
    public final void flush() {
        this.f67843.clear();
        this.f35343.clear();
        this.f35342.clear();
    }

    @Override // l.InterfaceC11223, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f67848 > 0) {
            C18194 c18194 = new C18194(this, C11844.class.getName().concat(" DeferredClose"));
            c18194.setDaemon(true);
            c18194.start();
            return;
        }
        this.f67844.m50087();
        HashMap map = this.f35339;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4788) it.next()).close();
        }
        map.clear();
        this.f35343.clear();
        this.f35342.clear();
        this.f67843.clear();
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ܽ */
    public final ClassLoader mo1716(InterfaceC2050 interfaceC2050) {
        m28932(interfaceC2050);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        final Collection collectionMo6225 = abstractC11055M50085 == null ? null : abstractC11055M50085.mo6225();
        Iterable iterable = collectionMo6225 == null ? null : new Iterable() { // from class: l.ᩴܿ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C15370(collectionMo6225);
            }
        };
        if (iterable == null) {
            return null;
        }
        C18837 c18837 = new C18837();
        Iterator it = iterable.iterator();
        while (true) {
            C15370 c15370 = (C15370) it;
            if (!c15370.f47085.hasNext()) {
                break;
            }
            try {
                c18837.m43511(((File) c15370.next()).toURI().toURL());
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }
        URL[] urlArr = (URL[]) c18837.toArray(new URL[c18837.size()]);
        ClassLoader classLoader = C11844.class.getClassLoader();
        String str = this.f67850;
        if (str != null) {
            try {
                return (ClassLoader) Class.forName(str).asSubclass(ClassLoader.class).getConstructor(URL[].class, ClassLoader.class).newInstance(urlArr, classLoader);
            } catch (ReflectiveOperationException unused) {
            }
        }
        return new URLClassLoader(urlArr, classLoader);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo1702(final InterfaceC2050 interfaceC2050, String str, Set set, boolean z) throws IOException {
        m28932(interfaceC2050);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C11003.requireNonNull(it.next());
        }
        C10349 c10349 = new C10349(str.toString().replace('.', '/'));
        C18837 c18837 = new C18837();
        try {
            for (C13254 c13254 : (List) C13843.computeIfAbsent((Map) C13843.computeIfAbsent(this.f35343, interfaceC2050, new C5693(2, this)), c10349, new Function() { // from class: l.᩵ܿ۠
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C11844.m28923(this.f63321, interfaceC2050);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            })) {
                c13254.f39683.mo4117(c13254.f39682, c10349, set, z, c18837);
            }
            return c18837.m43517();
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final String mo1703(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278) {
        m28932(interfaceC2050);
        C11003.requireNonNull(interfaceC18278);
        Collection collectionMo28938 = mo28938(interfaceC2050);
        if (collectionMo28938 == null) {
            return null;
        }
        if (interfaceC18278 instanceof AbstractC12465) {
            return ((AbstractC12465) interfaceC18278).mo10092(collectionMo28938);
        }
        throw new IllegalArgumentException(interfaceC18278.getClass().getName());
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18278 mo1707(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866) {
        m28932(interfaceC2050);
        C11003.requireNonNull(str);
        C11003.requireNonNull(enumC16866);
        if (!f35334.contains(enumC16866)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC16866);
        }
        C6115 c6115M17027 = C6115.m17027(str, enumC16866);
        Collection<InterfaceC20758> collectionMo28938 = mo28938(interfaceC2050);
        if (collectionMo28938 == null) {
            return null;
        }
        for (InterfaceC20758 interfaceC20758 : collectionMo28938) {
            InterfaceC18278 interfaceC18278Mo4116 = m28934(interfaceC20758).mo4116(interfaceC20758, c6115M17027);
            if (interfaceC18278Mo4116 != null) {
                return interfaceC18278Mo4116;
            }
        }
        return null;
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18278 mo1708(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866, InterfaceC7757 interfaceC7757) {
        m28927(interfaceC2050);
        C11003.requireNonNull(enumC16866);
        if (!f35334.contains(enumC16866)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC16866);
        }
        return m28924(interfaceC2050, C6115.m17027(str, enumC16866), interfaceC7757);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7757 mo1705(InterfaceC2050 interfaceC2050, String str) {
        m28927(interfaceC2050);
        try {
            URI uri = new URI(str);
            if (!uri.isAbsolute()) {
                String path = uri.normalize().getPath();
                if (path.length() != 0 && path.equals(uri.getPath()) && !path.startsWith("/") && !path.startsWith("./") && !path.startsWith("../")) {
                    return m28924(interfaceC2050, new C6115(str), (InterfaceC7757) null);
                }
            }
        } catch (URISyntaxException unused) {
        }
        throw new IllegalArgumentException(C20094.m46315("Invalid relative name: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC12465 m28924(InterfaceC2050 interfaceC2050, C6115 c6115, InterfaceC7757 interfaceC7757) throws IOException {
        InterfaceC20758 interfaceC20758;
        AbstractC11055 abstractC11055M50085;
        EnumC21101 enumC21101 = EnumC21101.CLASS_OUTPUT;
        C20177 c20177 = this.f35344;
        C22343 c22343 = this.f67844;
        if (interfaceC2050 != enumC21101) {
            EnumC21101 enumC21102 = EnumC21101.SOURCE_OUTPUT;
            if (interfaceC2050 == enumC21102) {
                c22343.getClass();
                if (!enumC21102.mo6727()) {
                    throw new IllegalArgumentException();
                }
                if (((C18816) c22343.m50085(enumC21102)).f59370 != null) {
                    c22343.getClass();
                    if (!enumC21102.mo6727()) {
                        throw new IllegalArgumentException();
                    }
                    abstractC11055M50085 = c22343.m50085(enumC21102);
                } else {
                    c22343.getClass();
                    if (!enumC21101.mo6727()) {
                        throw new IllegalArgumentException();
                    }
                }
                interfaceC20758 = ((C18816) abstractC11055M50085).f59370;
            } else {
                AbstractC11055 abstractC11055M50086 = c22343.m50085(interfaceC2050);
                Iterator it = (abstractC11055M50086 == null ? null : abstractC11055M50086.mo6225()).iterator();
                interfaceC20758 = it.hasNext() ? (InterfaceC20758) it.next() : null;
            }
            if (interfaceC20758 == null) {
                try {
                    c20177.getClass();
                    interfaceC20758 = C8763.get(System.getProperty("user.dir"), new String[0]);
                } catch (InvalidPathException e) {
                    throw new IOException("bad filename " + c6115, e);
                }
            }
            InterfaceC20758 interfaceC20759 = interfaceC20758;
            InterfaceC20758 interfaceC20758M28786 = c6115.m28786(this.f35340.mo8367(interfaceC20759));
            int i = AbstractC12465.f37474;
            return new C4704(this, interfaceC20758M28786, interfaceC20759, c6115, 0);
        }
        c22343.getClass();
        if (!enumC21101.mo6727()) {
            throw new IllegalArgumentException();
        }
        if (((C18816) c22343.m50085(enumC21101)).f59370 == null) {
            String str = c6115.f35100;
            String strSubstring = str.substring(str.lastIndexOf(47) + 1);
            if (interfaceC7757 != null && (interfaceC7757 instanceof AbstractC12465)) {
                return ((AbstractC12465) interfaceC7757).mo10093(strSubstring);
            }
            c20177.getClass();
            InterfaceC20758 interfaceC207510 = C8763.get(strSubstring, new String[0]);
            InterfaceC20758 interfaceC20758Mo8367 = this.f35340.mo8367(interfaceC207510);
            int i2 = AbstractC12465.f37474;
            return new C13170(this, interfaceC20758Mo8367, interfaceC207510, 0);
        }
        c22343.getClass();
        if (!enumC21101.mo6727()) {
            throw new IllegalArgumentException();
        }
        abstractC11055M50085 = c22343.m50085(enumC21101);
        interfaceC20758 = ((C18816) abstractC11055M50085).f59370;
        if (interfaceC20758 == null) {
            c20177.getClass();
            interfaceC20758 = C8763.get(System.getProperty("user.dir"), new String[0]);
        }
        InterfaceC20758 interfaceC207511 = interfaceC20758;
        InterfaceC20758 interfaceC20758M28787 = c6115.m28786(this.f35340.mo8367(interfaceC207511));
        int i3 = AbstractC12465.f37474;
        return new C4704(this, interfaceC20758M28787, interfaceC207511, c6115, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m28933(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
                InterfaceC20758 interfaceC20758Mo8367 = this.f35340.mo8367(interfaceC20758);
                int i = AbstractC12465.f37474;
                arrayList.add(new C13170(this, interfaceC20758Mo8367, interfaceC20758, 0));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m28923(C11844 c11844, InterfaceC2050 interfaceC2050) {
        return (List) c11844.f35342.get(interfaceC2050);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m28928(C11844 c11844, InterfaceC2050 interfaceC2050) {
        List<C13254> listM8239;
        HashMap map = new HashMap();
        Collection<InterfaceC20758> collectionMo28938 = c11844.mo28938(interfaceC2050);
        if (collectionMo28938 == null) {
            listM8239 = C2609.m8239();
        } else {
            ArrayList arrayList = new ArrayList(collectionMo28938.size());
            for (InterfaceC20758 interfaceC20758 : collectionMo28938) {
                try {
                    arrayList.add(new C13254(interfaceC20758, c11844.m28934(interfaceC20758), arrayList.size()));
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            listM8239 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13254 c13254 : listM8239) {
            if (!c13254.f39683.mo4118()) {
                arrayList2.add(c13254);
            }
        }
        for (C13254 c13255 : listM8239) {
            InterfaceC4788 interfaceC4788 = c13255.f39683;
            if (interfaceC4788.mo4118()) {
                Iterator it = interfaceC4788.mo4115().iterator();
                while (it.hasNext()) {
                    ((List) C13843.computeIfAbsent(map, (C10349) it.next(), new C6248(1, arrayList2))).add(c13255);
                }
            }
        }
        c11844.f35342.put(interfaceC2050, arrayList2);
        C19846.forEach(map.values(), new C0554());
        return map;
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2050 mo1714(InterfaceC2050 interfaceC2050, String str) {
        m28930(interfaceC2050);
        C11003.requireNonNull(str);
        EnumC21101 enumC21101 = EnumC21101.SOURCE_OUTPUT;
        C22343 c22343 = this.f67844;
        if (interfaceC2050 == enumC21101) {
            c22343.getClass();
            if (!enumC21101.mo6727()) {
                throw new IllegalArgumentException();
            }
            if (((C18816) c22343.m50085(enumC21101)).f59370 == null) {
                interfaceC2050 = EnumC21101.CLASS_OUTPUT;
            }
        }
        AbstractC11055 abstractC11055M50085 = c22343.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return null;
        }
        return abstractC11055M50085.mo23048(str);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2050 mo1715(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278) {
        m28930(interfaceC2050);
        if (!(interfaceC18278 instanceof AbstractC12465)) {
            return null;
        }
        InterfaceC20758 interfaceC20758M50077 = C22343.m50077(((AbstractC12465) interfaceC18278).f37477);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return null;
        }
        return abstractC11055M50085.mo23051(interfaceC20758M50077);
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ᩳ */
    public final String mo1717(InterfaceC2050 interfaceC2050) {
        m28932(interfaceC2050);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return null;
        }
        return abstractC11055M50085.mo27439();
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo1713(InterfaceC2050 interfaceC2050) {
        m28930(interfaceC2050);
        AbstractC11055 abstractC11055M50085 = this.f67844.m50085(interfaceC2050);
        if (abstractC11055M50085 == null) {
            return null;
        }
        return abstractC11055M50085.mo23052();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m28927(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        if (interfaceC2050.mo6727()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location: " + interfaceC2050.getName());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m28930(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        if (interfaceC2050.mo6726() || interfaceC2050.mo6727()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location or a module-oriented location: " + interfaceC2050.getName());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m28932(InterfaceC2050 interfaceC2050) {
        C11003.requireNonNull(interfaceC2050);
        if (interfaceC2050.mo6726()) {
            throw new IllegalArgumentException("location is module-oriented: " + interfaceC2050.getName());
        }
    }

    @Override // l.AbstractC21017
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28937(EnumC0121 enumC0121, String str) {
        if (AbstractC21017.f67841.contains(enumC0121)) {
            this.f35343.clear();
            this.f35342.clear();
        }
        return super.mo28937(enumC0121, str);
    }
}
