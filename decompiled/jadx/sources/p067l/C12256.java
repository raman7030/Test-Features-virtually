package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۤܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12256 extends C15588 implements InterfaceC14937 {

    /* JADX INFO: renamed from: ۖ֫ */
    public String f34265;

    /* JADX INFO: renamed from: ۘ֫ */
    public final C5550 f34266;

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f34267;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f34268;

    public C12256(boolean z, C5550 c5550) {
        super(z);
        this.f34266 = c5550;
        m17453();
        m17451();
        m15763();
    }

    @Override // p067l.InterfaceC14937
    public final C5550 getKey() {
        return this.f34266;
    }

    @Override // p067l.C15588, p067l.C16929, p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܽ */
    public final int mo28272(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo28272(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo15741();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo15741();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ᩻ */
    public final IOException mo28274() throws SocketException {
        String strM38509 = m38509();
        String strValueOf = String.valueOf(m38513());
        throw new SocketException(strM38509.contains(strValueOf) ? "FTP reply: ".concat(strM38509) : C20865.m47154("FTP reply ", strValueOf, ": ", strM38509));
    }

    @Override // p067l.InterfaceC14937
    public final String getPath() {
        return this.f34267;
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ᩷ */
    public final String mo28273() {
        return this.f34265;
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28270(String str) throws SocketException {
        if (AbstractC18422.m41972(str).equals(this.f34267)) {
            return true;
        }
        if (!C13061.m29891(m38508(EnumC14918.CWD, str))) {
            return false;
        }
        mo28271();
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28269(boolean z) {
        this.f34268 = z;
    }

    @Override // p067l.C15588, p067l.C6872
    /* JADX INFO: renamed from: ܿ */
    public final Socket mo15754(String str, String str2) {
        if (this.f34268) {
            Socket socket = this.f19790;
            if (socket instanceof SSLSocket ? ((SSLSocket) socket).getEnableSessionCreation() : false) {
                try {
                    m35436(false);
                    return super.mo15754(str, str2);
                } finally {
                    m35436(true);
                }
            }
        }
        return super.mo15754(str, str2);
    }

    @Override // p067l.C15588
    /* JADX INFO: renamed from: ۧ */
    public final void mo28268(Socket socket) throws IOException {
        boolean zM28267;
        if (this.f34268 && (socket instanceof SSLSocket)) {
            SSLSession session = ((SSLSocket) this.f19790).getSession();
            if (!session.isValid()) {
                throw new IOException("Invalid SSL Session");
            }
            try {
                try {
                    if (m28266(session, socket)) {
                        zM28267 = true;
                    } else {
                        e = null;
                        try {
                            zM28267 = m28267(session, socket);
                        } catch (ReflectiveOperationException e) {
                            if (e != null) {
                                e.addSuppressed(e);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            } catch (ReflectiveOperationException e3) {
                e = e3;
            }
            if (!zM28267) {
                throw new IOException("Invalid SSL Session");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m28266(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object obj;
        Method declaredMethod;
        Method method;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        Class<?> superclass = sessionContext.getClass();
        Class<?> cls = Integer.TYPE;
        Class<?>[] clsArr = {String.class, cls};
        while (true) {
            obj = null;
            if (superclass == null) {
                declaredMethod = null;
                break;
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("getSession", clsArr);
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Class<?> superclass2 = sessionContext.getClass();
        loop1: while (true) {
            if (superclass2 == null) {
                method = null;
                break;
            }
            Method[] declaredMethods = superclass2.getDeclaredMethods();
            int length = declaredMethods.length;
            for (int i = 0; i < length; i++) {
                method = declaredMethods[i];
                if ("putSession".equals(method.getName()) && method.getParameterTypes().length == 2) {
                    break loop1;
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        if (declaredMethod != null && method != null) {
            declaredMethod.setAccessible(true);
            method.setAccessible(true);
            SSLSessionContext sessionContext2 = sSLSession.getSessionContext();
            Object objInvoke = declaredMethod.invoke(sessionContext2, sSLSession.getPeerHost(), Integer.valueOf(sSLSession.getPeerPort()));
            if (objInvoke != null) {
                obj = objInvoke;
            } else {
                Class<?> superclass3 = sessionContext2.getClass();
                while (true) {
                    if (superclass3 != null) {
                        try {
                            Field declaredField = superclass3.getDeclaredField("sessionsByHostAndPort");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(sessionContext2);
                            Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                            HashSet hashSetM28265 = m28265(sSLSession);
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                try {
                                    Class<?> superclass4 = key.getClass();
                                    while (true) {
                                        if (superclass4 != null) {
                                            try {
                                                Field declaredField2 = superclass4.getDeclaredField(C0172c.f710f);
                                                declaredField2.setAccessible(true);
                                                Object obj3 = declaredField2.get(key);
                                                if (obj3 != null) {
                                                    strValueOf = String.valueOf(obj3);
                                                    break;
                                                }
                                                strValueOf = null;
                                                break;
                                            } catch (NoSuchFieldException unused2) {
                                                superclass4 = superclass4.getSuperclass();
                                            }
                                        } else {
                                            throw new NoSuchFieldException(C0172c.f710f);
                                        }
                                        strValueOf = null;
                                        break;
                                    }
                                } catch (NoSuchFieldException unused3) {
                                }
                                int iM28264 = m28264(entry.getKey());
                                if (strValueOf != null && iM28264 >= 0) {
                                    Iterator it = hashSetM28265.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            continue;
                                        } else if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                            Object objInvoke2 = declaredMethod.invoke(sessionContext2, strValueOf, Integer.valueOf(iM28264));
                                            if (objInvoke2 != null) {
                                                obj = objInvoke2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        } catch (NoSuchFieldException unused4) {
                            superclass3 = superclass3.getSuperclass();
                        }
                    } else {
                        throw new NoSuchFieldException("sessionsByHostAndPort");
                    }
                }
            }
            if (obj != null) {
                Constructor<?> declaredConstructor = method.getParameterTypes()[0].getDeclaredConstructor(String.class, cls);
                declaredConstructor.setAccessible(true);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m28267(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Object obj;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        for (Class<?> superclass = sessionContext.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("sessionsByHostAndPort");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(sessionContext);
                Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                if (!map.isEmpty()) {
                    HashSet hashSetM28265 = m28265(sSLSession);
                    int peerPort = sSLSession.getPeerPort();
                    Object obj3 = null;
                    for (Object obj4 : map.keySet()) {
                        try {
                            Class<?> superclass2 = obj4.getClass();
                            while (true) {
                                if (superclass2 != null) {
                                    try {
                                        Field declaredField2 = superclass2.getDeclaredField(C0172c.f710f);
                                        declaredField2.setAccessible(true);
                                        Object obj5 = declaredField2.get(obj4);
                                        if (obj5 != null) {
                                            strValueOf = String.valueOf(obj5);
                                            break;
                                        }
                                        strValueOf = null;
                                        break;
                                    } catch (NoSuchFieldException unused) {
                                        superclass2 = superclass2.getSuperclass();
                                    }
                                } else {
                                    throw new NoSuchFieldException(C0172c.f710f);
                                }
                                strValueOf = null;
                                break;
                            }
                        } catch (NoSuchFieldException unused2) {
                        }
                        int iM28264 = m28264(obj4);
                        if (strValueOf != null && iM28264 >= 0) {
                            Iterator it = hashSetM28265.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                    if (peerPort != iM28264) {
                                        if (obj3 != null) {
                                            break;
                                        }
                                        obj3 = obj4;
                                        break;
                                    }
                                    obj3 = obj4;
                                    break;
                                }
                            }
                        }
                    }
                    if (obj3 != null && (obj = map.get(obj3)) != null) {
                        Constructor<?> declaredConstructor = obj3.getClass().getDeclaredConstructor(String.class, Integer.TYPE);
                        declaredConstructor.setAccessible(true);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                        return true;
                    }
                }
                return false;
            } catch (NoSuchFieldException unused3) {
            }
        }
        throw new NoSuchFieldException("sessionsByHostAndPort");
    }

    /* JADX INFO: renamed from: ֫ */
    private HashSet m28265(SSLSession sSLSession) {
        HashSet hashSet = new HashSet();
        String peerHost = sSLSession.getPeerHost();
        if (peerHost != null && !peerHost.isEmpty()) {
            hashSet.add(peerHost);
        }
        Socket socket = this.f19790;
        if (socket != null && socket.getInetAddress() != null) {
            String hostName = this.f19790.getInetAddress().getHostName();
            if (hostName != null && !hostName.isEmpty()) {
                hashSet.add(hostName);
            }
            String hostAddress = this.f19790.getInetAddress().getHostAddress();
            if (hostAddress != null && !hostAddress.isEmpty()) {
                hashSet.add(hostAddress);
            }
        }
        return hashSet;
    }

    @Override // p067l.C6872, p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo15752(String str) throws IOException {
        try {
            Field declaredField = C6872.class.getDeclaredField("ۗ");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this)).intValue() != 2) {
                throw new IOException("FTPS storeFileStream only supports binary file type");
            }
            Socket socketM15746 = m15746(EnumC14918.STOR, str);
            if (socketM15746 == null) {
                return null;
            }
            return new C12927(socketM15746, socketM15746.getOutputStream());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to read FTP file type reflectively", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28264(Object obj) {
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField("port");
                    declaredField.setAccessible(true);
                    return ((Integer) declaredField.get(obj)).intValue();
                } catch (NoSuchFieldException unused) {
                }
            }
            throw new NoSuchFieldException("port");
        } catch (NoSuchFieldException unused2) {
            return -1;
        }
    }

    @Override // p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܳ */
    public final String mo28271() throws SocketException {
        String strM32776 = m38508(EnumC14918.PWD, (String) null) != 257 ? null : C14267.m32776((String) C20013.m45383(this.f50101, 1));
        if (strM32776 == null) {
            mo28274();
            throw null;
        }
        String strM41972 = AbstractC18422.m41972(strM32776);
        this.f34267 = strM41972;
        if (this.f34265 == null) {
            this.f34265 = strM41972;
        }
        return strM32776;
    }
}
