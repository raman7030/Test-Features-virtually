package l;

import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUY */
/* JADX INFO: loaded from: classes.dex */
public final class C22684 implements InterfaceC16602 {
    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        C23658 c23658 = c5751.f17702;
        boolean z = (c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0;
        Type typeM44750 = z ? C19426.m44750(type) : null;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            c6725.append((CharSequence) "[]");
            return;
        }
        C14485 c14485 = c5751.f17704;
        if ((c6725.f20878 & EnumC20837.DisableCircularReferenceDetect.f67472) == 0) {
            c5751.f17704 = new C14485(c14485, obj, obj2, 0);
            if (c5751.f17697 == null) {
                c5751.f17697 = new IdentityHashMap();
            }
            c5751.f17697.put(obj, c5751.f17704);
        }
        try {
            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                c6725.write(91);
                c5751.m16193();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (i != 0) {
                        c6725.write(44);
                    }
                    c5751.m16194();
                    if (obj3 != null) {
                        IdentityHashMap identityHashMap = c5751.f17697;
                        if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                            c5751.m16192(obj3);
                        } else {
                            InterfaceC16602 interfaceC16602M52187 = c23658.m52187(obj3.getClass());
                            c5751.f17704 = new C14485(c14485, obj, obj2, 0);
                            interfaceC16602M52187.mo3046(c5751, obj3, Integer.valueOf(i), typeM44750);
                        }
                    } else {
                        c6725.m18296();
                    }
                }
                c5751.m16187();
                c5751.m16194();
                c6725.write(93);
                return;
            }
            int i2 = c6725.f20880 + 1;
            if (i2 > c6725.f20879.length) {
                c6725.m18300(i2);
            }
            c6725.f20879[c6725.f20880] = '[';
            c6725.f20880 = i2;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj4 = list.get(i3);
                if (i3 != 0) {
                    int i4 = c6725.f20880 + 1;
                    if (i4 > c6725.f20879.length) {
                        c6725.m18300(i4);
                    }
                    c6725.f20879[c6725.f20880] = ',';
                    c6725.f20880 = i4;
                }
                if (obj4 == null) {
                    c6725.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        c6725.writeInt(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            c6725.m18301(jLongValue);
                            c6725.write(76);
                        } else {
                            c6725.m18301(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                            c6725.m18302(str);
                        } else {
                            c6725.m18298(str, (char) 0, true);
                        }
                    } else {
                        if ((c6725.f20878 & EnumC20837.DisableCircularReferenceDetect.f67472) == 0) {
                            c5751.f17704 = new C14485(c14485, obj, obj2, 0);
                        }
                        IdentityHashMap identityHashMap2 = c5751.f17697;
                        if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                            c5751.m16192(obj4);
                        } else {
                            c23658.m52187(obj4.getClass()).mo3046(c5751, obj4, Integer.valueOf(i3), typeM44750);
                        }
                    }
                }
            }
            int i5 = c6725.f20880 + 1;
            if (i5 > c6725.f20879.length) {
                c6725.m18300(i5);
            }
            c6725.f20879[c6725.f20880] = ']';
            c6725.f20880 = i5;
        } finally {
            c5751.f17704 = c14485;
        }
    }
}
