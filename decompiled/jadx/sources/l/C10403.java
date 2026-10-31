package l;

import com.alipay.sdk.m.n.c;
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
public final class C10403 extends C13910 implements InterfaceC13224 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f31300;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C3347 f31301;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f31302;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f31303;

    public C10403(boolean z, C3347 c3347) {
        super(z);
        this.f31301 = c3347;
        m15542();
        m15540();
        m13883();
    }

    @Override // l.InterfaceC13224
    public final C3347 getKey() {
        return this.f31301;
    }

    @Override // l.C13910, l.C15321, l.InterfaceC13224
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo26243(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo26243(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo13861();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo13861();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IOException mo26245() throws SocketException {
        String strM36351 = m36351();
        String strValueOf = String.valueOf(m36355());
        throw new SocketException(strM36351.contains(strValueOf) ? "FTP reply: ".concat(strM36351) : C19462.m44858("FTP reply ", strValueOf, ": ", strM36351));
    }

    @Override // l.InterfaceC13224
    public final String getPath() {
        return this.f31302;
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo26244() {
        return this.f31300;
    }

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo26241(String str) throws SocketException {
        if (AbstractC16891.m39731(str).equals(this.f31302)) {
            return true;
        }
        if (!C11250.m27829(m36350(EnumC13205.CWD, str))) {
            return false;
        }
        mo26242();
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26240(boolean z) {
        this.f31303 = z;
    }

    @Override // l.C13910, l.C4739
    /* JADX INFO: renamed from: ܿ */
    public final Socket mo13874(String str, String str2) {
        if (this.f31303) {
            Socket socket = this.f16949;
            if (socket instanceof SSLSocket ? ((SSLSocket) socket).getEnableSessionCreation() : false) {
                try {
                    m33317(false);
                    return super.mo13874(str, str2);
                } finally {
                    m33317(true);
                }
            }
        }
        return super.mo13874(str, str2);
    }

    @Override // l.C13910
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo26239(Socket socket) throws IOException {
        boolean zM26238;
        if (this.f31303 && (socket instanceof SSLSocket)) {
            SSLSession session = ((SSLSocket) this.f16949).getSession();
            if (!session.isValid()) {
                throw new IOException("Invalid SSL Session");
            }
            try {
                try {
                    if (m26237(session, socket)) {
                        zM26238 = true;
                    } else {
                        e = null;
                        try {
                            zM26238 = m26238(session, socket);
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
            if (!zM26238) {
                throw new IOException("Invalid SSL Session");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m26237(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
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
                            HashSet hashSetM26236 = m26236(sSLSession);
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                try {
                                    Class<?> superclass4 = key.getClass();
                                    while (true) {
                                        if (superclass4 != null) {
                                            try {
                                                Field declaredField2 = superclass4.getDeclaredField(c.f);
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
                                            throw new NoSuchFieldException(c.f);
                                        }
                                        strValueOf = null;
                                        break;
                                    }
                                } catch (NoSuchFieldException unused3) {
                                }
                                int iM26235 = m26235(entry.getKey());
                                if (strValueOf != null && iM26235 >= 0) {
                                    Iterator it = hashSetM26236.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            continue;
                                        } else if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                            Object objInvoke2 = declaredMethod.invoke(sessionContext2, strValueOf, Integer.valueOf(iM26235));
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m26238(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
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
                    HashSet hashSetM26236 = m26236(sSLSession);
                    int peerPort = sSLSession.getPeerPort();
                    Object obj3 = null;
                    for (Object obj4 : map.keySet()) {
                        try {
                            Class<?> superclass2 = obj4.getClass();
                            while (true) {
                                if (superclass2 != null) {
                                    try {
                                        Field declaredField2 = superclass2.getDeclaredField(c.f);
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
                                    throw new NoSuchFieldException(c.f);
                                }
                                strValueOf = null;
                                break;
                            }
                        } catch (NoSuchFieldException unused2) {
                        }
                        int iM26235 = m26235(obj4);
                        if (strValueOf != null && iM26235 >= 0) {
                            Iterator it = hashSetM26236.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                    if (peerPort != iM26235) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashSet m26236(SSLSession sSLSession) {
        HashSet hashSet = new HashSet();
        String peerHost = sSLSession.getPeerHost();
        if (peerHost != null && !peerHost.isEmpty()) {
            hashSet.add(peerHost);
        }
        Socket socket = this.f16949;
        if (socket != null && socket.getInetAddress() != null) {
            String hostName = this.f16949.getInetAddress().getHostName();
            if (hostName != null && !hostName.isEmpty()) {
                hashSet.add(hostName);
            }
            String hostAddress = this.f16949.getInetAddress().getHostAddress();
            if (hostAddress != null && !hostAddress.isEmpty()) {
                hashSet.add(hostAddress);
            }
        }
        return hashSet;
    }

    @Override // l.C4739, l.InterfaceC13224
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo13872(String str) throws IOException {
        try {
            Field declaredField = C4739.class.getDeclaredField("ۗ");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this)).intValue() != 2) {
                throw new IOException("FTPS storeFileStream only supports binary file type");
            }
            Socket socketM13866 = m13866(EnumC13205.STOR, str);
            if (socketM13866 == null) {
                return null;
            }
            return new C11109(socketM13866, socketM13866.getOutputStream());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to read FTP file type reflectively", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26235(Object obj) {
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

    @Override // l.InterfaceC13224
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo26242() throws SocketException {
        String strM30702 = m36350(EnumC13205.PWD, (String) null) != 257 ? null : C12519.m30702((String) C18566.m43105(this.f46975, 1));
        if (strM30702 == null) {
            mo26245();
            throw null;
        }
        String strM39731 = AbstractC16891.m39731(strM30702);
        this.f31302 = strM39731;
        if (this.f31300 == null) {
            this.f31300 = strM39731;
        }
        return strM30702;
    }
}
