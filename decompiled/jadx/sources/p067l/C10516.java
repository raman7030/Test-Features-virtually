package p067l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10516 extends C3810 {
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[Catch: Exception -> 0x01ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:58:0x00d7, B:60:0x00e2, B:76:0x0125, B:63:0x00f1, B:66:0x00ff, B:69:0x010a, B:71:0x0112, B:73:0x011b, B:78:0x012e, B:86:0x0161, B:80:0x0140, B:83:0x0150), top: B:110:0x00d7 }] */
    @Override // p067l.C3810, p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        Class clsM47054;
        Throwable exc;
        C3810 c3810;
        Constructor<?>[] constructorArr;
        int i;
        C9327 c9327 = c13351.f37485;
        C24597 c24597 = c13351.f37492;
        int i2 = c9327.f25382;
        HashMap map = null;
        if (i2 == 8) {
            c9327.m21606();
            return null;
        }
        if (c13351.f37487 == 2) {
            c13351.f37487 = 0;
        } else if (i2 != 12) {
            throw new C16702("syntax error");
        }
        if (type == null || !(type instanceof Class)) {
            clsM47054 = null;
        } else {
            clsM47054 = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsM47054)) {
                clsM47054 = null;
            }
        }
        Throwable th = null;
        String strM21602 = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strM21586 = c9327.m21586(c13351.f37490);
            if (strM21586 == null) {
                int i3 = c9327.f25382;
                if (i3 == 13) {
                    c9327.m21609(16);
                    break;
                }
                if (i3 == 16) {
                    continue;
                }
            }
            c9327.m21603();
            if ("@type".equals(strM21586)) {
                if (c9327.f25382 != 4) {
                    throw new C16702("syntax error");
                }
                String strM21603 = c9327.m21602();
                c24597.getClass();
                clsM47054 = C20831.m47054(strM21603);
                c9327.m21609(16);
            } else if ("message".equals(strM21586)) {
                int i4 = c9327.f25382;
                if (i4 == 8) {
                    strM21602 = null;
                } else {
                    if (i4 != 4) {
                        throw new C16702("syntax error");
                    }
                    strM21602 = c9327.m21602();
                }
                c9327.m21606();
            } else if ("cause".equals(strM21586)) {
                th = (Throwable) mo7431(c13351, null, "cause");
            } else if ("stackTrace".equals(strM21586)) {
                stackTraceElementArr = (StackTraceElement[]) c13351.m30481((String) null, StackTraceElement[].class);
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(strM21586, c13351.m30480((Object) null));
            }
            if (c9327.f25382 == 13) {
                c9327.m21609(16);
                break;
            }
        }
        if (clsM47054 == null) {
            exc = new Exception(strM21602, th);
            c3810 = null;
        } else {
            try {
                Constructor<?>[] constructors = clsM47054.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                Constructor<?> constructor2 = null;
                int i5 = 0;
                Constructor<?> constructor3 = null;
                while (i5 < length) {
                    Constructor<?> constructor4 = constructors[i5];
                    if (constructor4.getParameterTypes().length == 0) {
                        constructorArr = constructors;
                        i = length;
                        constructor2 = constructor4;
                    } else {
                        constructorArr = constructors;
                        i = length;
                        if (constructor4.getParameterTypes().length == 1 && constructor4.getParameterTypes()[0] == String.class) {
                            constructor = constructor4;
                        } else if (constructor4.getParameterTypes().length == 2 && constructor4.getParameterTypes()[0] == String.class && constructor4.getParameterTypes()[1] == Throwable.class) {
                            constructor3 = constructor4;
                        }
                    }
                    i5++;
                    constructors = constructorArr;
                    length = i;
                }
                if (constructor3 != null) {
                    exc = (Throwable) constructor3.newInstance(strM21602, th);
                } else {
                    if (constructor != null) {
                        exc = (Throwable) constructor.newInstance(strM21602);
                    } else if (constructor2 != null) {
                        c3810 = null;
                        exc = (Throwable) constructor2.newInstance(null);
                    } else {
                        exc = null;
                        c3810 = null;
                    }
                    if (exc == null) {
                        exc = new Exception(strM21602, th);
                    }
                }
                c3810 = null;
                if (exc == null) {
                    exc = new Exception(strM21602, th);
                }
            } catch (Exception e) {
                throw new C16702("create instance error", (Throwable) e);
            }
        }
        if (stackTraceElementArr != null) {
            exc.setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsM47054 != null) {
                if (clsM47054 == this.f8161) {
                    c3810 = this;
                } else {
                    InterfaceC20575 interfaceC20575M54235 = c24597.m54235((Type) clsM47054);
                    if (interfaceC20575M54235 instanceof C3810) {
                        c3810 = (C3810) interfaceC20575M54235;
                    }
                }
            }
            if (c3810 != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    AbstractC19904 abstractC19904M7432 = c3810.m7432(str);
                    if (abstractC19904M7432 != null) {
                        abstractC19904M7432.mo19779(exc, value);
                    }
                }
            }
        }
        return exc;
    }
}
