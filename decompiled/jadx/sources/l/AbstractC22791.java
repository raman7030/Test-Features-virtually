package l;

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
public abstract /* synthetic */ class AbstractC22791 {
    public static /* synthetic */ String A(Iterable iterable) {
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

    public static /* synthetic */ List B(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(C11003.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry C(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(C11003.requireNonNull(obj), C11003.requireNonNull(obj2));
    }

    public static /* synthetic */ Set D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(C11003.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean E(Unsafe unsafe, Object obj, long j, C0357 c0357) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, c0357)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ EnumC14406[] F(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC14406[] enumC14406Arr = new EnumC14406[length];
        for (int i = 0; i < length; i++) {
            enumC14406Arr[i] = linkOptionArr[i] == null ? null : EnumC14406.NOFOLLOW_LINKS;
        }
        return enumC14406Arr;
    }

    public static /* synthetic */ InterfaceC19347[] H(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        InterfaceC19347[] interfaceC19347Arr = new InterfaceC19347[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            interfaceC19347Arr[i] = modifier == null ? null : modifier instanceof C21152 ? ((C21152) modifier).a : new C23973(modifier);
        }
        return interfaceC19347Arr;
    }

    public static /* synthetic */ CopyOption[] J(InterfaceC22667[] interfaceC22667Arr) {
        CopyOption c3323;
        if (interfaceC22667Arr == null) {
            return null;
        }
        int length = interfaceC22667Arr.length;
        CopyOption[] copyOptionArr = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            InterfaceC22667 interfaceC22667 = interfaceC22667Arr[i];
            if (interfaceC22667 == null) {
                c3323 = null;
            } else if (interfaceC22667 instanceof C8057) {
                c3323 = ((C8057) interfaceC22667).a;
            } else if (interfaceC22667 instanceof EnumC14406) {
                c3323 = LinkOption.NOFOLLOW_LINKS;
            } else if (interfaceC22667 instanceof EnumC2413) {
                EnumC2413 enumC2413 = (EnumC2413) interfaceC22667;
                c3323 = enumC2413 == EnumC2413.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : enumC2413 == EnumC2413.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
            } else {
                c3323 = new C3323(interfaceC22667);
            }
            copyOptionArr[i] = c3323;
        }
        return copyOptionArr;
    }

    public static /* synthetic */ LinkOption[] K(EnumC14406[] enumC14406Arr) {
        if (enumC14406Arr == null) {
            return null;
        }
        int length = enumC14406Arr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = enumC14406Arr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] M(InterfaceC19347[] interfaceC19347Arr) {
        if (interfaceC19347Arr == null) {
            return null;
        }
        int length = interfaceC19347Arr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            InterfaceC19347 interfaceC19347 = interfaceC19347Arr[i];
            modifierArr[i] = interfaceC19347 == null ? null : interfaceC19347 instanceof C23973 ? ((C23973) interfaceC19347).a : new C21152(interfaceC19347);
        }
        return modifierArr;
    }

    public static /* synthetic */ long O(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long P(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long Q(long j, long j2) {
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

    public static /* synthetic */ long R(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ StandardOpenOption n(EnumC3824 enumC3824) {
        if (enumC3824 == null) {
            return null;
        }
        if (enumC3824 == EnumC3824.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC3824 == EnumC3824.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC3824 == EnumC3824.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC3824 == EnumC3824.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC3824 == EnumC3824.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC3824 == EnumC3824.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC3824 == EnumC3824.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC3824 == EnumC3824.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC3824 == EnumC3824.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static /* synthetic */ int y(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long z(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static C4529 m(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return C4529.fromMillis(fileTime.toMillis());
    }

    public static WatchEvent.Kind[] L(InterfaceC18641[] interfaceC18641Arr) {
        WatchEvent.Kind c17623;
        if (interfaceC18641Arr == null) {
            return null;
        }
        int length = interfaceC18641Arr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            InterfaceC18641 interfaceC18641 = interfaceC18641Arr[i];
            if (interfaceC18641 == null) {
                c17623 = null;
            } else if (interfaceC18641 == AbstractC11790.b) {
                c17623 = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (interfaceC18641 == AbstractC11790.c) {
                c17623 = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (interfaceC18641 == AbstractC11790.d) {
                c17623 = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (interfaceC18641 == AbstractC11790.a) {
                c17623 = StandardWatchEventKinds.OVERFLOW;
            } else {
                c17623 = interfaceC18641 instanceof C16917 ? ((C16917) interfaceC18641).a : new C17623(interfaceC18641);
            }
            kindArr[i] = c17623;
        }
        return kindArr;
    }

    public static Class r(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return InterfaceC15111.class;
        }
        if (cls == InterfaceC15111.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return InterfaceC3118.class;
        }
        if (cls == InterfaceC3118.class) {
            return PosixFileAttributes.class;
        }
        if (cls == C6851.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return C6851.class;
        }
        C16461.a(cls, "java.nio.file.attribute.BasicFileAttributes");
        throw null;
    }

    public static FileTime o(C4529 c4529) {
        if (c4529 == null) {
            return null;
        }
        return FileTime.fromMillis(c4529.toMillis());
    }

    public static InterfaceC22168[] I(FileAttribute[] fileAttributeArr) {
        InterfaceC22168 c20963;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC22168[] interfaceC22168Arr = new InterfaceC22168[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                c20963 = null;
            } else if (x(fileAttribute.value())) {
                c20963 = new C17022(3, fileAttribute);
            } else {
                c20963 = fileAttribute instanceof C9674 ? ((C9674) fileAttribute).a : new C20963(fileAttribute);
            }
            interfaceC22168Arr[i] = c20963;
        }
        return interfaceC22168Arr;
    }

    public static InterfaceC18641[] G(WatchEvent.Kind[] kindArr) {
        InterfaceC18641 c16917;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC18641[] interfaceC18641Arr = new InterfaceC18641[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                c16917 = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                c16917 = AbstractC11790.b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                c16917 = AbstractC11790.c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                c16917 = AbstractC11790.d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                c16917 = AbstractC11790.a;
            } else {
                c16917 = kind instanceof C17623 ? ((C17623) kind).a : new C16917(kind);
            }
            interfaceC18641Arr[i] = c16917;
        }
        return interfaceC18641Arr;
    }

    public static Object p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC20758) {
            return C7745.l((InterfaceC20758) obj);
        }
        return obj instanceof Path ? C14094.l((Path) obj) : obj;
    }

    public static char S(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static Class q(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC16728.class;
        }
        if (cls == InterfaceC16728.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return C8262.class;
        }
        if (cls == C8262.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC19552.class;
        }
        if (cls == InterfaceC19552.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC21463.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC21463.class;
        }
        if (cls == C22373.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return C22373.class;
        }
        if (cls == C5940.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C5940.class;
        }
        C16461.a(cls, "java.nio.file.attribute.FileAttributeView");
        throw null;
    }

    public static FileAttribute[] N(InterfaceC22168[] interfaceC22168Arr) {
        FileAttribute c9674;
        if (interfaceC22168Arr == null) {
            return null;
        }
        int length = interfaceC22168Arr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC22168 interfaceC22168 = interfaceC22168Arr[i];
            if (interfaceC22168 == null) {
                c9674 = null;
            } else if (x(interfaceC22168.value())) {
                c9674 = new C8968(interfaceC22168);
            } else {
                c9674 = interfaceC22168 instanceof C20963 ? ((C20963) interfaceC22168).a : new C9674(interfaceC22168);
            }
            fileAttributeArr[i] = c9674;
        }
        return fileAttributeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static RuntimeException U(String str, Integer... numArr) {
        int i;
        String strConcat;
        List listB = B(numArr);
        if (listB == null) {
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
            switch (listB.size() != i ? "" : str) {
                case "checkIndex":
                    strConcat = String.format("Index %d out of bounds for length %d", listB.get(0), listB.get(1));
                    break;
                case "checkFromToIndex":
                    strConcat = String.format("Range [%d, %d) out of bounds for length %d", listB.get(0), listB.get(1), listB.get(2));
                    break;
                case "checkFromIndexSize":
                    strConcat = String.format("Range [%d, %<d + %d) out of bounds for length %d", listB.get(0), listB.get(1), listB.get(2));
                    break;
                default:
                    strConcat = String.format("Range check failed: %s %s", str, listB);
                    break;
            }
        }
        return new IndexOutOfBoundsException(strConcat);
    }

    public static boolean x(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof EnumC12995) || (next instanceof PosixFilePermission);
    }

    public static FileChannel T(InterfaceC20758 interfaceC20758, Set set) throws IOException {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC23579) it.next()).getClass();
        }
        if (interfaceC20758.toFile().exists()) {
            if (set.contains(EnumC3824.CREATE_NEW) && set.contains(EnumC3824.WRITE)) {
                throw new FileAlreadyExistsException(interfaceC20758.toString());
            }
        } else if (!set.contains(EnumC3824.CREATE) && !set.contains(EnumC3824.CREATE_NEW)) {
            throw new NoSuchFileException(interfaceC20758.toString());
        }
        if (set.contains(EnumC3824.READ) && set.contains(EnumC3824.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC3824 enumC3824 = EnumC3824.APPEND;
        if (set.contains(enumC3824) && set.contains(EnumC3824.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = interfaceC20758.toFile();
        EnumC3824 enumC3825 = EnumC3824.WRITE;
        if (!set.contains(enumC3825) && !set.contains(enumC3824)) {
            str = "r";
        } else if (set.contains(EnumC3824.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC3824.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC3824.TRUNCATE_EXISTING) && set.contains(enumC3825)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(enumC3824) && !set.contains(EnumC3824.DELETE_ON_CLOSE)) {
            return C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        int i = C16316.e;
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof C16316) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((C16316) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new C16316(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(EnumC3824.DELETE_ON_CLOSE), set.contains(enumC3824), interfaceC20758);
    }

    public static Set u(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC23579) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C11979.a((InterfaceC23579) it.next()));
                } catch (ClassCastException e) {
                    C16461.a(e, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C16461.a(next.getClass(), "java.nio.file.OpenOption");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C3512.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C16461.a(e2, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Object t(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return m((FileTime) obj);
            } catch (ClassCastException e) {
                C16461.a(e, "java.nio.file.attribute.FileTime");
                throw null;
            }
        }
        if (!(obj instanceof C4529)) {
            return obj;
        }
        try {
            return o((C4529) obj);
        } catch (ClassCastException e2) {
            C16461.a(e2, "java.nio.file.attribute.FileTime");
            throw null;
        }
    }

    public static Map s(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, t(map.get(str)));
        }
        return map2;
    }

    public static Set v(Set set) {
        EnumC12995 enumC12995;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC12995) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC12995 enumC12996 = (EnumC12995) it.next();
                    if (enumC12996 == null) {
                        posixFilePermission = null;
                    } else if (enumC12996 == EnumC12995.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC12996 == EnumC12995.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC12996 == EnumC12995.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC12996 == EnumC12995.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC12996 == EnumC12995.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC12996 == EnumC12995.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC12996 == EnumC12995.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC12996 == EnumC12995.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C16461.a(e, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C16461.a(next.getClass(), "java.nio.file.attribute.PosixFilePermission");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        enumC12995 = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        enumC12995 = EnumC12995.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        enumC12995 = EnumC12995.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        enumC12995 = EnumC12995.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        enumC12995 = EnumC12995.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        enumC12995 = EnumC12995.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        enumC12995 = EnumC12995.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        enumC12995 = EnumC12995.OTHERS_READ;
                    } else {
                        enumC12995 = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC12995.OTHERS_WRITE : EnumC12995.OTHERS_EXECUTE;
                    }
                    hashSet.add(enumC12995);
                } catch (ClassCastException e2) {
                    C16461.a(e2, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static int e(InterfaceC22583 interfaceC22583, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC23931.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 1) {
                throw new C11441("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return interfaceC22583.t().l(interfaceC10030);
            }
            return interfaceC22583.h().b;
        }
        return AbstractC5796.a(interfaceC22583, interfaceC10030);
    }

    public static List w(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof C9157) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C9157 c9157 = (C9157) it.next();
                    arrayList.add(c9157 == null ? null : c9157.a);
                } catch (ClassCastException e) {
                    C16461.a(e, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C16461.a(obj.getClass(), "java.nio.file.WatchEvent");
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : new C9157(watchEvent));
                } catch (ClassCastException e2) {
                    C16461.a(e2, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static Object h(InterfaceC14115 interfaceC14115, C8556 c8556) {
        if (c8556 == AbstractC5796.a || c8556 == AbstractC5796.e || c8556 == AbstractC5796.d) {
            return null;
        }
        if (c8556 == AbstractC5796.g) {
            return interfaceC14115.b();
        }
        if (c8556 == AbstractC5796.b) {
            return interfaceC14115.a();
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        return c8556.h(interfaceC14115);
    }

    public static boolean f(InterfaceC13410 interfaceC13410, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).isDateBased();
        }
        return interfaceC10030 != null && interfaceC10030.l(interfaceC13410);
    }

    public static C4239 l(InterfaceC14115 interfaceC14115, C18078 c18078) {
        return C4239.ofEpochSecond(interfaceC14115.r(c18078), interfaceC14115.b().d);
    }

    public static long j(InterfaceC14115 interfaceC14115, C18078 c18078) {
        C11003.requireNonNull(c18078, "offset");
        return ((interfaceC14115.f().H() * 86400) + ((long) interfaceC14115.b().i0())) - ((long) c18078.b);
    }

    public static Object i(InterfaceC22583 interfaceC22583, C8556 c8556) {
        if (c8556 == AbstractC5796.e || c8556 == AbstractC5796.a) {
            return interfaceC22583.F();
        }
        if (c8556 == AbstractC5796.d) {
            return interfaceC22583.h();
        }
        if (c8556 == AbstractC5796.g) {
            return interfaceC22583.b();
        }
        if (c8556 == AbstractC5796.b) {
            return interfaceC22583.a();
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        return c8556.h(interfaceC22583);
    }

    public static int c(InterfaceC14115 interfaceC14115, InterfaceC14115 interfaceC14116) {
        int iR = interfaceC14115.f().compareTo(interfaceC14116.f());
        return (iR == 0 && (iR = interfaceC14115.b().compareTo(interfaceC14116.b())) == 0) ? ((AbstractC4944) interfaceC14115.a()).k().compareTo(interfaceC14116.a().k()) : iR;
    }

    public static Object g(InterfaceC13410 interfaceC13410, C8556 c8556) {
        if (c8556 == AbstractC5796.a || c8556 == AbstractC5796.e || c8556 == AbstractC5796.d || c8556 == AbstractC5796.g) {
            return null;
        }
        if (c8556 == AbstractC5796.b) {
            return interfaceC13410.a();
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.DAYS;
        }
        return c8556.h(interfaceC13410);
    }

    public static InterfaceC15672 a(InterfaceC13410 interfaceC13410, InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(interfaceC13410.H(), EnumC18496.EPOCH_DAY);
    }

    public static long k(InterfaceC22583 interfaceC22583) {
        return ((interfaceC22583.f().H() * 86400) + ((long) interfaceC22583.b().i0())) - ((long) interfaceC22583.h().b);
    }

    public static int d(InterfaceC22583 interfaceC22583, InterfaceC22583 interfaceC22584) {
        int iCompare = Long.compare(interfaceC22583.U(), interfaceC22584.U());
        return (iCompare == 0 && (iCompare = interfaceC22583.b().d - interfaceC22584.b().d) == 0 && (iCompare = interfaceC22583.t().compareTo(interfaceC22584.t())) == 0 && (iCompare = interfaceC22583.F().k().compareTo(interfaceC22584.F().k())) == 0) ? ((AbstractC4944) interfaceC22583.a()).k().compareTo(interfaceC22584.a().k()) : iCompare;
    }

    public static int b(InterfaceC13410 interfaceC13410, InterfaceC13410 interfaceC13411) {
        int iCompare = Long.compare(interfaceC13410.H(), interfaceC13411.H());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC4944) interfaceC13410.a()).k().compareTo(interfaceC13411.a().k());
    }
}
