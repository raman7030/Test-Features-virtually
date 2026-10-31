package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUR */
/* JADX INFO: loaded from: classes4.dex */
public final class C8573 extends C1517 {
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[Catch: Exception -> 0x01ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:58:0x00d7, B:60:0x00e2, B:76:0x0125, B:63:0x00f1, B:66:0x00ff, B:69:0x010a, B:71:0x0112, B:73:0x011b, B:78:0x012e, B:86:0x0161, B:80:0x0140, B:83:0x0150), top: B:110:0x00d7 }] */
    @Override // l.C1517, l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        Class clsM44760;
        Throwable exc;
        C1517 c1517;
        Constructor<?>[] constructorArr;
        int i;
        C7322 c7322 = c11556.f34488;
        C23389 c23389 = c11556.f34495;
        int i2 = c7322.f22491;
        HashMap map = null;
        if (i2 == 8) {
            c7322.m19638();
            return null;
        }
        if (c11556.f34490 == 2) {
            c11556.f34490 = 0;
        } else if (i2 != 12) {
            throw new C15082("syntax error");
        }
        if (type == null || !(type instanceof Class)) {
            clsM44760 = null;
        } else {
            clsM44760 = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsM44760)) {
                clsM44760 = null;
            }
        }
        Throwable th = null;
        String strM19634 = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strM19618 = c7322.m19618(c11556.f34493);
            if (strM19618 == null) {
                int i3 = c7322.f22491;
                if (i3 == 13) {
                    c7322.m19641(16);
                    break;
                }
                if (i3 == 16) {
                    continue;
                }
            }
            c7322.m19635();
            if ("@type".equals(strM19618)) {
                if (c7322.f22491 != 4) {
                    throw new C15082("syntax error");
                }
                String strM19635 = c7322.m19634();
                c23389.getClass();
                clsM44760 = C19426.m44760(strM19635);
                c7322.m19641(16);
            } else if ("message".equals(strM19618)) {
                int i4 = c7322.f22491;
                if (i4 == 8) {
                    strM19634 = null;
                } else {
                    if (i4 != 4) {
                        throw new C15082("syntax error");
                    }
                    strM19634 = c7322.m19634();
                }
                c7322.m19638();
            } else if ("cause".equals(strM19618)) {
                th = (Throwable) mo5204(c11556, null, "cause");
            } else if ("stackTrace".equals(strM19618)) {
                stackTraceElementArr = (StackTraceElement[]) c11556.m28435((String) null, StackTraceElement[].class);
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(strM19618, c11556.m28434((Object) null));
            }
            if (c7322.f22491 == 13) {
                c7322.m19641(16);
                break;
            }
        }
        if (clsM44760 == null) {
            exc = new Exception(strM19634, th);
            c1517 = null;
        } else {
            try {
                Constructor<?>[] constructors = clsM44760.getConstructors();
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
                    exc = (Throwable) constructor3.newInstance(strM19634, th);
                } else {
                    if (constructor != null) {
                        exc = (Throwable) constructor.newInstance(strM19634);
                    } else if (constructor2 != null) {
                        c1517 = null;
                        exc = (Throwable) constructor2.newInstance(null);
                    } else {
                        exc = null;
                        c1517 = null;
                    }
                    if (exc == null) {
                        exc = new Exception(strM19634, th);
                    }
                }
                c1517 = null;
                if (exc == null) {
                    exc = new Exception(strM19634, th);
                }
            } catch (Exception e) {
                throw new C15082("create instance error", (Throwable) e);
            }
        }
        if (stackTraceElementArr != null) {
            exc.setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsM44760 != null) {
                if (clsM44760 == this.f5380) {
                    c1517 = this;
                } else {
                    InterfaceC19157 interfaceC19157M51838 = c23389.m51838((Type) clsM44760);
                    if (interfaceC19157M51838 instanceof C1517) {
                        c1517 = (C1517) interfaceC19157M51838;
                    }
                }
            }
            if (c1517 != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    AbstractC18451 abstractC18451M5205 = c1517.m5205(str);
                    if (abstractC18451M5205 != null) {
                        abstractC18451M5205.mo17832(exc, value);
                    }
                }
            }
        }
        return exc;
    }
}
