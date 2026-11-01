package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۖ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99OR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4432 {

    /* JADX INFO: renamed from: ֫ */
    public static final char[] f9952;

    static {
        char[] cArr = new char[80];
        f9952 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m9264(AbstractC23049 abstractC23049, String str) {
        StringBuilder sbM21133 = C9179.m21133("# ", str);
        m9267(abstractC23049, sbM21133, 0);
        return sbM21133.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:131:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    /* JADX INFO: renamed from: ֫ */
    public static void m9267(AbstractC23049 abstractC23049, StringBuilder sb, int i) {
        int i2;
        Method method;
        Method method2;
        Object objM51427;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC23049.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method5 = declaredMethods[i3];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                m9266(sb, i, C17073.m38720(4, 0, strSubstring), AbstractC23049.m51427(method4, abstractC23049, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m9266(sb, i, C17073.m38720(3, 0, strSubstring), AbstractC23049.m51427(method3, abstractC23049, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM51427 = AbstractC23049.m51427(method, abstractC23049, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM51427 instanceof Boolean) {
                                    zEquals = !((Boolean) objM51427).booleanValue();
                                } else if (objM51427 instanceof Integer) {
                                    if (((Integer) objM51427).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51427 instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM51427).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51427 instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM51427).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51427 instanceof String) {
                                    zEquals = objM51427.equals("");
                                } else if (objM51427 instanceof AbstractC7962) {
                                    zEquals = objM51427.equals(AbstractC7962.f20935);
                                } else if ((objM51427 instanceof InterfaceC10467) ? !((objM51427 instanceof Enum) && ((Enum) objM51427).ordinal() == 0) : objM51427 != ((InterfaceC10467) objM51427).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC23049.m51427(method2, abstractC23049, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m9266(sb, i, strSubstring, objM51427);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM51427 = AbstractC23049.m51427(method, abstractC23049, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM51427 instanceof Boolean) {
                                zEquals = !((Boolean) objM51427).booleanValue();
                            } else if (objM51427 instanceof Integer) {
                                if (((Integer) objM51427).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51427 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM51427).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51427 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM51427).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51427 instanceof String) {
                                zEquals = objM51427.equals("");
                            } else if (objM51427 instanceof AbstractC7962) {
                                zEquals = objM51427.equals(AbstractC7962.f20935);
                            } else if (objM51427 instanceof InterfaceC10467) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC23049.m51427(method2, abstractC23049, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m9266(sb, i, strSubstring, objM51427);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (abstractC23049 instanceof AbstractC2931) {
            Iterator itM46614 = ((AbstractC2931) abstractC23049).f5089.m46614();
            while (itM46614.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM46614.next();
                ((C7626) entry2.getKey()).getClass();
                m9266(sb, i, "[0]", entry2.getValue());
            }
        }
        C10487 c10487 = abstractC23049.f72437;
        if (c10487 != null) {
            c10487.m24206(sb, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9266(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9266(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9266(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m9265(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C3781.m7389(AbstractC7962.m18417((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC7962) {
            sb.append(": \"");
            sb.append(C3781.m7389((AbstractC7962) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC23049) {
            sb.append(" {");
            m9267((AbstractC23049) obj, sb, i + 2);
            sb.append("\n");
            m9265(sb, i);
            sb.append(C0249l.f1198d);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            m9266(sb, i3, "key", entry.getKey());
            m9266(sb, i3, C0226b.f1011d, entry.getValue());
            sb.append("\n");
            m9265(sb, i);
            sb.append(C0249l.f1198d);
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9265(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f9952, 0, i2);
            i -= i2;
        }
    }
}
