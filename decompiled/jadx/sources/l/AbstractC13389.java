package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.security.AccessController;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.۬᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13389 {
    public static volatile List b;
    public static boolean c;
    public static final Object a = new Object();
    public static final Set d = AbstractC22791.D(new Object[]{EnumC3824.CREATE, EnumC3824.TRUNCATE_EXISTING, EnumC3824.WRITE});

    public abstract void checkAccess(InterfaceC20758 interfaceC20758, EnumC11379... enumC11379Arr);

    public abstract void copy(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667... interfaceC22667Arr);

    public abstract void createDirectory(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr);

    public abstract void delete(InterfaceC20758 interfaceC20758);

    public abstract InterfaceC20052 getFileAttributeView(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr);

    public abstract AbstractC13494 getFileStore(InterfaceC20758 interfaceC20758);

    public abstract AbstractC7145 getFileSystem(URI uri);

    public abstract InterfaceC20758 getPath(URI uri);

    public abstract String getScheme();

    public abstract boolean isHidden(InterfaceC20758 interfaceC20758);

    public abstract boolean isSameFile(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759);

    public abstract void move(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667... interfaceC22667Arr);

    public abstract SeekableByteChannel newByteChannel(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168... interfaceC22168Arr);

    public abstract DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter);

    public abstract AbstractC7145 newFileSystem(URI uri, Map map);

    public abstract Map readAttributes(InterfaceC20758 interfaceC20758, String str, EnumC14406... enumC14406Arr);

    public abstract InterfaceC15111 readAttributes(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr);

    public abstract void setAttribute(InterfaceC20758 interfaceC20758, String str, Object obj, EnumC14406... enumC14406Arr);

    public AbstractC13389() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public static List d() {
        if (b == null) {
            AbstractC13389 abstractC13389Provider = C1707.getDefault().provider();
            synchronized (a) {
                if (b == null) {
                    if (c) {
                        throw new Error("Circular loading of installed providers detected");
                    }
                    c = true;
                    List list = (List) AccessController.doPrivileged(new C12684(0));
                    list.add(0, abstractC13389Provider);
                    b = Collections.unmodifiableList(list);
                }
            }
        }
        return b;
    }

    public AbstractC7145 newFileSystem(InterfaceC20758 interfaceC20758, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream newInputStream(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        Set set;
        if (interfaceC23579Arr.length > 0) {
            for (InterfaceC23579 interfaceC23579 : interfaceC23579Arr) {
                if (interfaceC23579 == EnumC3824.APPEND || interfaceC23579 == EnumC3824.WRITE) {
                    throw new UnsupportedOperationException("'" + interfaceC23579 + "' not allowed");
                }
            }
        }
        Set set2 = C17229.a;
        if (interfaceC23579Arr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC23579Arr);
            set = hashSet;
        }
        return Channels.newInputStream(C17229.b(interfaceC20758).newByteChannel(interfaceC20758, set, new InterfaceC22168[0]));
    }

    public OutputStream g(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        Set set;
        if (interfaceC23579Arr.length == 0) {
            set = d;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC23579 interfaceC23579 : interfaceC23579Arr) {
                if (interfaceC23579 == EnumC3824.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC23579);
            }
            hashSet.add(EnumC3824.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(newByteChannel(interfaceC20758, set, new InterfaceC22168[0]));
    }

    public FileChannel f(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    public C9968 e(InterfaceC20758 interfaceC20758, Set set, ExecutorService executorService, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    public void b(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    public void a(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        throw new UnsupportedOperationException();
    }

    public boolean c(InterfaceC20758 interfaceC20758) {
        try {
            delete(interfaceC20758);
            return true;
        } catch (NoSuchFileException unused) {
            return false;
        }
    }

    public InterfaceC20758 h(InterfaceC20758 interfaceC20758) {
        throw new UnsupportedOperationException();
    }
}
