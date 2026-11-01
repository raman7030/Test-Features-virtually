package p067l;

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
public abstract class AbstractC15094 {

    /* JADX INFO: renamed from: b */
    public static volatile List f43082b;

    /* JADX INFO: renamed from: c */
    public static boolean f43083c;

    /* JADX INFO: renamed from: a */
    public static final Object f43081a = new Object();

    /* JADX INFO: renamed from: d */
    public static final Set f43084d = AbstractC24029.m53214D(new Object[]{EnumC6003.CREATE, EnumC6003.TRUNCATE_EXISTING, EnumC6003.WRITE});

    public abstract void checkAccess(InterfaceC22097 interfaceC22097, EnumC13183... enumC13183Arr);

    public abstract void copy(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr);

    public abstract void createDirectory(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr);

    public abstract void delete(InterfaceC22097 interfaceC22097);

    public abstract InterfaceC21426 getFileAttributeView(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr);

    public abstract AbstractC15193 getFileStore(InterfaceC22097 interfaceC22097);

    public abstract AbstractC9159 getFileSystem(URI uri);

    public abstract InterfaceC22097 getPath(URI uri);

    public abstract String getScheme();

    public abstract boolean isHidden(InterfaceC22097 interfaceC22097);

    public abstract boolean isSameFile(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098);

    public abstract void move(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr);

    public abstract SeekableByteChannel newByteChannel(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437... interfaceC23437Arr);

    public abstract DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter);

    public abstract AbstractC9159 newFileSystem(URI uri, Map map);

    public abstract Map readAttributes(InterfaceC22097 interfaceC22097, String str, EnumC16060... enumC16060Arr);

    public abstract InterfaceC16730 readAttributes(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr);

    public abstract void setAttribute(InterfaceC22097 interfaceC22097, String str, Object obj, EnumC16060... enumC16060Arr);

    public AbstractC15094() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    /* JADX INFO: renamed from: d */
    public static List m34488d() {
        if (f43082b == null) {
            AbstractC15094 abstractC15094Provider = C3991.getDefault().provider();
            synchronized (f43081a) {
                if (f43082b == null) {
                    if (f43083c) {
                        throw new Error("Circular loading of installed providers detected");
                    }
                    f43083c = true;
                    List list = (List) AccessController.doPrivileged(new C14424(0));
                    list.add(0, abstractC15094Provider);
                    f43082b = Collections.unmodifiableList(list);
                }
            }
        }
        return f43082b;
    }

    public AbstractC9159 newFileSystem(InterfaceC22097 interfaceC22097, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream newInputStream(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        Set set;
        if (interfaceC24778Arr.length > 0) {
            for (InterfaceC24778 interfaceC24778 : interfaceC24778Arr) {
                if (interfaceC24778 == EnumC6003.APPEND || interfaceC24778 == EnumC6003.WRITE) {
                    throw new UnsupportedOperationException("'" + interfaceC24778 + "' not allowed");
                }
            }
        }
        Set set2 = C18743.f56028a;
        if (interfaceC24778Arr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC24778Arr);
            set = hashSet;
        }
        return Channels.newInputStream(C18743.m42775b(interfaceC22097).newByteChannel(interfaceC22097, set, new InterfaceC23437[0]));
    }

    /* JADX INFO: renamed from: g */
    public OutputStream mo28599g(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        Set set;
        if (interfaceC24778Arr.length == 0) {
            set = f43084d;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC24778 interfaceC24778 : interfaceC24778Arr) {
                if (interfaceC24778 == EnumC6003.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC24778);
            }
            hashSet.add(EnumC6003.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(newByteChannel(interfaceC22097, set, new InterfaceC23437[0]));
    }

    /* JADX INFO: renamed from: f */
    public FileChannel mo25793f(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public C11842 mo25792e(InterfaceC22097 interfaceC22097, Set set, ExecutorService executorService, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public void mo25790b(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a */
    public void mo25789a(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo25791c(InterfaceC22097 interfaceC22097) {
        try {
            delete(interfaceC22097);
            return true;
        } catch (NoSuchFileException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC22097 mo25794h(InterfaceC22097 interfaceC22097) {
        throw new UnsupportedOperationException();
    }
}
