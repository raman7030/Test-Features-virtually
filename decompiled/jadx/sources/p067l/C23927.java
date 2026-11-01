package p067l;

import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUY */
/* JADX INFO: loaded from: classes.dex */
public final class C23927 implements InterfaceC18147 {
    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        C24853 c24853 = c7834.f20547;
        boolean z = (c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0;
        Type typeM47044 = z ? C20831.m47044(type) : null;
        if (obj == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullListAsEmpty.f70155) != 0) {
                c8760.write("[]");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            c8760.append((CharSequence) "[]");
            return;
        }
        C16135 c16135 = c7834.f20549;
        if ((c8760.f23752 & EnumC22172.DisableCircularReferenceDetect.f70155) == 0) {
            c7834.f20549 = new C16135(c16135, obj, obj2, 0);
            if (c7834.f20542 == null) {
                c7834.f20542 = new IdentityHashMap();
            }
            c7834.f20542.put(obj, c7834.f20549);
        }
        try {
            if ((c8760.f23752 & EnumC22172.PrettyFormat.f70155) != 0) {
                c8760.write(91);
                c7834.m18112();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (i != 0) {
                        c8760.write(44);
                    }
                    c7834.m18113();
                    if (obj3 != null) {
                        IdentityHashMap identityHashMap = c7834.f20542;
                        if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                            c7834.m18111(obj3);
                        } else {
                            InterfaceC18147 interfaceC18147M54590 = c24853.m54590(obj3.getClass());
                            c7834.f20549 = new C16135(c16135, obj, obj2, 0);
                            interfaceC18147M54590.mo5359(c7834, obj3, Integer.valueOf(i), typeM47044);
                        }
                    } else {
                        c8760.m20244();
                    }
                }
                c7834.m18106();
                c7834.m18113();
                c8760.write(93);
                return;
            }
            int i2 = c8760.f23754 + 1;
            if (i2 > c8760.f23753.length) {
                c8760.m20248(i2);
            }
            c8760.f23753[c8760.f23754] = '[';
            c8760.f23754 = i2;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj4 = list.get(i3);
                if (i3 != 0) {
                    int i4 = c8760.f23754 + 1;
                    if (i4 > c8760.f23753.length) {
                        c8760.m20248(i4);
                    }
                    c8760.f23753[c8760.f23754] = ',';
                    c8760.f23754 = i4;
                }
                if (obj4 == null) {
                    c8760.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        c8760.writeInt(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            c8760.m20249(jLongValue);
                            c8760.write(76);
                        } else {
                            c8760.m20249(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((c8760.f23752 & EnumC22172.UseSingleQuotes.f70155) != 0) {
                            c8760.m20250(str);
                        } else {
                            c8760.m20246(str, (char) 0, true);
                        }
                    } else {
                        if ((c8760.f23752 & EnumC22172.DisableCircularReferenceDetect.f70155) == 0) {
                            c7834.f20549 = new C16135(c16135, obj, obj2, 0);
                        }
                        IdentityHashMap identityHashMap2 = c7834.f20542;
                        if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                            c7834.m18111(obj4);
                        } else {
                            c24853.m54590(obj4.getClass()).mo5359(c7834, obj4, Integer.valueOf(i3), typeM47044);
                        }
                    }
                }
            }
            int i5 = c8760.f23754 + 1;
            if (i5 > c8760.f23753.length) {
                c8760.m20248(i5);
            }
            c8760.f23753[c8760.f23754] = ']';
            c8760.f23754 = i5;
        } finally {
            c7834.f20549 = c16135;
        }
    }
}
