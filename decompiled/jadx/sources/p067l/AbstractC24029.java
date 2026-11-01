package p067l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩺ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC24029 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m53211A(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ List m53212B(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(C12826.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Map.Entry m53213C(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(C12826.requireNonNull(obj), C12826.requireNonNull(obj2));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Set m53214D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(C12826.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m53215E(Unsafe unsafe, Object obj, long j, C2708 c2708) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, c2708)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ EnumC16060[] m53216F(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC16060[] enumC16060Arr = new EnumC16060[length];
        for (int i = 0; i < length; i++) {
            enumC16060Arr[i] = linkOptionArr[i] == null ? null : EnumC16060.NOFOLLOW_LINKS;
        }
        return enumC16060Arr;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ InterfaceC20756[] m53218H(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        InterfaceC20756[] interfaceC20756Arr = new InterfaceC20756[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            interfaceC20756Arr[i] = modifier == null ? null : modifier instanceof C22472 ? ((C22472) modifier).f70884a : new C25153(modifier);
        }
        return interfaceC20756Arr;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ CopyOption[] m53220J(InterfaceC23911[] interfaceC23911Arr) {
        CopyOption c5527;
        if (interfaceC23911Arr == null) {
            return null;
        }
        int length = interfaceC23911Arr.length;
        CopyOption[] copyOptionArr = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            InterfaceC23911 interfaceC23911 = interfaceC23911Arr[i];
            if (interfaceC23911 == null) {
                c5527 = null;
            } else if (interfaceC23911 instanceof C10026) {
                c5527 = ((C10026) interfaceC23911).f27774a;
            } else if (interfaceC23911 instanceof EnumC16060) {
                c5527 = LinkOption.NOFOLLOW_LINKS;
            } else if (interfaceC23911 instanceof EnumC4662) {
                EnumC4662 enumC4662 = (EnumC4662) interfaceC23911;
                c5527 = enumC4662 == EnumC4662.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : enumC4662 == EnumC4662.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
            } else {
                c5527 = new C5527(interfaceC23911);
            }
            copyOptionArr[i] = c5527;
        }
        return copyOptionArr;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ LinkOption[] m53221K(EnumC16060[] enumC16060Arr) {
        if (enumC16060Arr == null) {
            return null;
        }
        int length = enumC16060Arr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = enumC16060Arr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ WatchEvent.Modifier[] m53223M(InterfaceC20756[] interfaceC20756Arr) {
        if (interfaceC20756Arr == null) {
            return null;
        }
        int length = interfaceC20756Arr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            InterfaceC20756 interfaceC20756 = interfaceC20756Arr[i];
            modifierArr[i] = interfaceC20756 == null ? null : interfaceC20756 instanceof C25153 ? ((C25153) interfaceC20756).f80483a : new C22472(interfaceC20756);
        }
        return modifierArr;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ long m53225O(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ long m53226P(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ long m53227Q(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ long m53228R(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ StandardOpenOption m53245n(EnumC6003 enumC6003) {
        if (enumC6003 == null) {
            return null;
        }
        if (enumC6003 == EnumC6003.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC6003 == EnumC6003.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC6003 == EnumC6003.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC6003 == EnumC6003.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC6003 == EnumC6003.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC6003 == EnumC6003.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC6003 == EnumC6003.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC6003 == EnumC6003.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC6003 == EnumC6003.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m53256y(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ long m53257z(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    /* JADX INFO: renamed from: m */
    public static C6673 m53244m(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return C6673.fromMillis(fileTime.toMillis());
    }

    /* JADX INFO: renamed from: L */
    public static WatchEvent.Kind[] m53222L(InterfaceC20085[] interfaceC20085Arr) {
        WatchEvent.Kind c19118;
        if (interfaceC20085Arr == null) {
            return null;
        }
        int length = interfaceC20085Arr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            InterfaceC20085 interfaceC20085 = interfaceC20085Arr[i];
            if (interfaceC20085 == null) {
                c19118 = null;
            } else if (interfaceC20085 == AbstractC13574.f38180b) {
                c19118 = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (interfaceC20085 == AbstractC13574.f38181c) {
                c19118 = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (interfaceC20085 == AbstractC13574.f38182d) {
                c19118 = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (interfaceC20085 == AbstractC13574.f38179a) {
                c19118 = StandardWatchEventKinds.OVERFLOW;
            } else {
                c19118 = interfaceC20085 instanceof C18447 ? ((C18447) interfaceC20085).f55159a : new C19118(interfaceC20085);
            }
            kindArr[i] = c19118;
        }
        return kindArr;
    }

    /* JADX INFO: renamed from: r */
    public static Class m53249r(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return InterfaceC16730.class;
        }
        if (cls == InterfaceC16730.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return InterfaceC5332.class;
        }
        if (cls == InterfaceC5332.class) {
            return PosixFileAttributes.class;
        }
        if (cls == C8880.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return C8880.class;
        }
        C18013.m40990a(cls, "java.nio.file.attribute.BasicFileAttributes");
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static FileTime m53246o(C6673 c6673) {
        if (c6673 == null) {
            return null;
        }
        return FileTime.fromMillis(c6673.toMillis());
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC23437[] m53219I(FileAttribute[] fileAttributeArr) {
        InterfaceC23437 c22292;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC23437[] interfaceC23437Arr = new InterfaceC23437[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                c22292 = null;
            } else if (m53255x(fileAttribute.value())) {
                c22292 = new C18546(3, fileAttribute);
            } else {
                c22292 = fileAttribute instanceof C11563 ? ((C11563) fileAttribute).f32227a : new C22292(fileAttribute);
            }
            interfaceC23437Arr[i] = c22292;
        }
        return interfaceC23437Arr;
    }

    /* JADX INFO: renamed from: G */
    public static InterfaceC20085[] m53217G(WatchEvent.Kind[] kindArr) {
        InterfaceC20085 c18447;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC20085[] interfaceC20085Arr = new InterfaceC20085[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                c18447 = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                c18447 = AbstractC13574.f38180b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                c18447 = AbstractC13574.f38181c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                c18447 = AbstractC13574.f38182d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                c18447 = AbstractC13574.f38179a;
            } else {
                c18447 = kind instanceof C19118 ? ((C19118) kind).f57035a : new C18447(kind);
            }
            interfaceC20085Arr[i] = c18447;
        }
        return interfaceC20085Arr;
    }

    /* JADX INFO: renamed from: p */
    public static Object m53247p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC22097) {
            return C9730.m22751l((InterfaceC22097) obj);
        }
        return obj instanceof Path ? C15764.m35828l((Path) obj) : obj;
    }

    /* JADX INFO: renamed from: S */
    public static char m53229S(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: q */
    public static Class m53248q(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC18267.class;
        }
        if (cls == InterfaceC18267.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return C10221.class;
        }
        if (cls == C10221.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC20951.class;
        }
        if (cls == InterfaceC20951.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC22767.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC22767.class;
        }
        if (cls == C23632.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return C23632.class;
        }
        if (cls == C8014.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C8014.class;
        }
        C18013.m40990a(cls, "java.nio.file.attribute.FileAttributeView");
        throw null;
    }

    /* JADX INFO: renamed from: N */
    public static FileAttribute[] m53224N(InterfaceC23437[] interfaceC23437Arr) {
        FileAttribute c11563;
        if (interfaceC23437Arr == null) {
            return null;
        }
        int length = interfaceC23437Arr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC23437 interfaceC23437 = interfaceC23437Arr[i];
            if (interfaceC23437 == null) {
                c11563 = null;
            } else if (m53255x(interfaceC23437.value())) {
                c11563 = new C10892(interfaceC23437);
            } else {
                c11563 = interfaceC23437 instanceof C22292 ? ((C22292) interfaceC23437).f70425a : new C11563(interfaceC23437);
            }
            fileAttributeArr[i] = c11563;
        }
        return fileAttributeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: U */
    public static RuntimeException m53231U(String str, Integer... numArr) {
        int i;
        String strConcat;
        List listM53212B = m53212B(numArr);
        if (listM53212B == null) {
            strConcat = "Range check failed: ".concat(str);
        } else {
            switch (str) {
                case "checkIndex":
                    i = 2;
                    break;
                case "checkFromToIndex":
                case "checkFromIndexSize":
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
            switch (listM53212B.size() != i ? "" : str) {
                case "checkIndex":
                    strConcat = String.format("Index %d out of bounds for length %d", listM53212B.get(0), listM53212B.get(1));
                    break;
                case "checkFromToIndex":
                    strConcat = String.format("Range [%d, %d) out of bounds for length %d", listM53212B.get(0), listM53212B.get(1), listM53212B.get(2));
                    break;
                case "checkFromIndexSize":
                    strConcat = String.format("Range [%d, %<d + %d) out of bounds for length %d", listM53212B.get(0), listM53212B.get(1), listM53212B.get(2));
                    break;
                default:
                    strConcat = String.format("Range check failed: %s %s", str, listM53212B);
                    break;
            }
        }
        return new IndexOutOfBoundsException(strConcat);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m53255x(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof EnumC14719) || (next instanceof PosixFilePermission);
    }

    /* JADX INFO: renamed from: T */
    public static FileChannel m53230T(InterfaceC22097 interfaceC22097, Set set) throws IOException {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC24778) it.next()).getClass();
        }
        if (interfaceC22097.toFile().exists()) {
            if (set.contains(EnumC6003.CREATE_NEW) && set.contains(EnumC6003.WRITE)) {
                throw new FileAlreadyExistsException(interfaceC22097.toString());
            }
        } else if (!set.contains(EnumC6003.CREATE) && !set.contains(EnumC6003.CREATE_NEW)) {
            throw new NoSuchFileException(interfaceC22097.toString());
        }
        if (set.contains(EnumC6003.READ) && set.contains(EnumC6003.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC6003 enumC6003 = EnumC6003.APPEND;
        if (set.contains(enumC6003) && set.contains(EnumC6003.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = interfaceC22097.toFile();
        EnumC6003 enumC6004 = EnumC6003.WRITE;
        if (!set.contains(enumC6004) && !set.contains(enumC6003)) {
            str = "r";
        } else if (set.contains(EnumC6003.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC6003.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC6003.TRUNCATE_EXISTING) && set.contains(enumC6004)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(enumC6003) && !set.contains(EnumC6003.DELETE_ON_CLOSE)) {
            return C13853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        int i = C17875.f53421e;
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof C17875) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((C17875) fileChannelConvertMaybeLegacyFileChannelFromLibrary).f53422a;
        }
        return new C17875(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(EnumC6003.DELETE_ON_CLOSE), set.contains(enumC6003), interfaceC22097);
    }

    /* JADX INFO: renamed from: u */
    public static Set m53252u(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC24778) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C13754.m31339a((InterfaceC24778) it.next()));
                } catch (ClassCastException e) {
                    C18013.m40990a(e, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C18013.m40990a(next.getClass(), "java.nio.file.OpenOption");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C5707.m12701a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C18013.m40990a(e2, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: t */
    public static Object m53251t(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return m53244m((FileTime) obj);
            } catch (ClassCastException e) {
                C18013.m40990a(e, "java.nio.file.attribute.FileTime");
                throw null;
            }
        }
        if (!(obj instanceof C6673)) {
            return obj;
        }
        try {
            return m53246o((C6673) obj);
        } catch (ClassCastException e2) {
            C18013.m40990a(e2, "java.nio.file.attribute.FileTime");
            throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static Map m53250s(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, m53251t(map.get(str)));
        }
        return map2;
    }

    /* JADX INFO: renamed from: v */
    public static Set m53253v(Set set) {
        EnumC14719 enumC14719;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC14719) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC14719 enumC147110 = (EnumC14719) it.next();
                    if (enumC147110 == null) {
                        posixFilePermission = null;
                    } else if (enumC147110 == EnumC14719.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC147110 == EnumC14719.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC147110 == EnumC14719.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC147110 == EnumC14719.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC147110 == EnumC14719.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC147110 == EnumC14719.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC147110 == EnumC14719.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC147110 == EnumC14719.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C18013.m40990a(e, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C18013.m40990a(next.getClass(), "java.nio.file.attribute.PosixFilePermission");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        enumC14719 = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        enumC14719 = EnumC14719.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        enumC14719 = EnumC14719.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        enumC14719 = EnumC14719.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        enumC14719 = EnumC14719.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        enumC14719 = EnumC14719.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        enumC14719 = EnumC14719.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        enumC14719 = EnumC14719.OTHERS_READ;
                    } else {
                        enumC14719 = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC14719.OTHERS_WRITE : EnumC14719.OTHERS_EXECUTE;
                    }
                    hashSet.add(enumC14719);
                } catch (ClassCastException e2) {
                    C18013.m40990a(e2, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e */
    public static int m53236e(InterfaceC23832 interfaceC23832, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            int i = AbstractC25113.f80363a[((EnumC19947) interfaceC11901).ordinal()];
            if (i == 1) {
                throw new C13242("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return interfaceC23832.mo7159t().mo6952l(interfaceC11901);
            }
            return interfaceC23832.mo7156h().f59520b;
        }
        return AbstractC7877.m18193a(interfaceC23832, interfaceC11901);
    }

    /* JADX INFO: renamed from: w */
    public static List m53254w(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof C11072) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C11072 c11072 = (C11072) it.next();
                    arrayList.add(c11072 == null ? null : c11072.f30656a);
                } catch (ClassCastException e) {
                    C18013.m40990a(e, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C18013.m40990a(obj.getClass(), "java.nio.file.WatchEvent");
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : new C11072(watchEvent));
                } catch (ClassCastException e2) {
                    C18013.m40990a(e2, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Object m53239h(InterfaceC15784 interfaceC15784, C10500 c10500) {
        if (c10500 == AbstractC7877.f20679a || c10500 == AbstractC7877.f20683e || c10500 == AbstractC7877.f20682d) {
            return null;
        }
        if (c10500 == AbstractC7877.f20685g) {
            return interfaceC15784.mo35852b();
        }
        if (c10500 == AbstractC7877.f20680b) {
            return interfaceC15784.mo35851a();
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        return c10500.m24242h(interfaceC15784);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m53237f(InterfaceC15114 interfaceC15114, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).isDateBased();
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(interfaceC15114);
    }

    /* JADX INFO: renamed from: l */
    public static C6398 m53243l(InterfaceC15784 interfaceC15784, C19550 c19550) {
        return C6398.ofEpochSecond(interfaceC15784.mo35854r(c19550), interfaceC15784.mo35852b().f25136d);
    }

    /* JADX INFO: renamed from: j */
    public static long m53241j(InterfaceC15784 interfaceC15784, C19550 c19550) {
        C12826.requireNonNull(c19550, "offset");
        return ((interfaceC15784.mo35853f().mo16118H() * 86400) + ((long) interfaceC15784.mo35852b().m21357i0())) - ((long) c19550.f59520b);
    }

    /* JADX INFO: renamed from: i */
    public static Object m53240i(InterfaceC23832 interfaceC23832, C10500 c10500) {
        if (c10500 == AbstractC7877.f20683e || c10500 == AbstractC7877.f20679a) {
            return interfaceC23832.mo7146F();
        }
        if (c10500 == AbstractC7877.f20682d) {
            return interfaceC23832.mo7156h();
        }
        if (c10500 == AbstractC7877.f20685g) {
            return interfaceC23832.mo7151b();
        }
        if (c10500 == AbstractC7877.f20680b) {
            return interfaceC23832.mo7150a();
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        return c10500.m24242h(interfaceC23832);
    }

    /* JADX INFO: renamed from: c */
    public static int m53234c(InterfaceC15784 interfaceC15784, InterfaceC15784 interfaceC15785) {
        int iMo31406R = interfaceC15784.mo35853f().compareTo(interfaceC15785.mo35853f());
        return (iMo31406R == 0 && (iMo31406R = interfaceC15784.mo35852b().compareTo(interfaceC15785.mo35852b())) == 0) ? ((AbstractC7068) interfaceC15784.mo35851a()).mo10584k().compareTo(interfaceC15785.mo35851a().mo10584k()) : iMo31406R;
    }

    /* JADX INFO: renamed from: g */
    public static Object m53238g(InterfaceC15114 interfaceC15114, C10500 c10500) {
        if (c10500 == AbstractC7877.f20679a || c10500 == AbstractC7877.f20683e || c10500 == AbstractC7877.f20682d || c10500 == AbstractC7877.f20685g) {
            return null;
        }
        if (c10500 == AbstractC7877.f20680b) {
            return interfaceC15114.mo16126a();
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.DAYS;
        }
        return c10500.m24242h(interfaceC15114);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC17263 m53232a(InterfaceC15114 interfaceC15114, InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(interfaceC15114.mo16118H(), EnumC19947.EPOCH_DAY);
    }

    /* JADX INFO: renamed from: k */
    public static long m53242k(InterfaceC23832 interfaceC23832) {
        return ((interfaceC23832.mo7154f().mo16118H() * 86400) + ((long) interfaceC23832.mo7151b().m21357i0())) - ((long) interfaceC23832.mo7156h().f59520b);
    }

    /* JADX INFO: renamed from: d */
    public static int m53235d(InterfaceC23832 interfaceC23832, InterfaceC23832 interfaceC23833) {
        int iCompare = Long.compare(interfaceC23832.mo7147U(), interfaceC23833.mo7147U());
        return (iCompare == 0 && (iCompare = interfaceC23832.mo7151b().f25136d - interfaceC23833.mo7151b().f25136d) == 0 && (iCompare = interfaceC23832.mo7159t().compareTo(interfaceC23833.mo7159t())) == 0 && (iCompare = interfaceC23832.mo7146F().mo17866k().compareTo(interfaceC23833.mo7146F().mo17866k())) == 0) ? ((AbstractC7068) interfaceC23832.mo7150a()).mo10584k().compareTo(interfaceC23833.mo7150a().mo10584k()) : iCompare;
    }

    /* JADX INFO: renamed from: b */
    public static int m53233b(InterfaceC15114 interfaceC15114, InterfaceC15114 interfaceC15115) {
        int iCompare = Long.compare(interfaceC15114.mo16118H(), interfaceC15115.mo16118H());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC7068) interfaceC15114.mo16126a()).mo10584k().compareTo(interfaceC15115.mo16126a().mo10584k());
    }
}
