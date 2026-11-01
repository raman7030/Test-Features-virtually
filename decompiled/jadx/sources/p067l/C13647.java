package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13647 {
    /* JADX INFO: renamed from: ֫ */
    public static String m31025(C10769 c10769, C16132 c16132) {
        StringBuilder sb = new StringBuilder("XposedHelpers.get");
        if (c16132.f47472) {
            sb.append("Static");
        }
        String str = c16132.f47471;
        str.getClass();
        switch (str) {
            case "B":
                sb.append("Byte");
                break;
            case "C":
                sb.append("Char");
                break;
            case "D":
                sb.append("Double");
                break;
            case "F":
                sb.append("Float");
                break;
            case "I":
                sb.append("Int");
                break;
            case "J":
                sb.append("Long");
                break;
            case "S":
                sb.append("Short");
                break;
            case "Z":
                sb.append("Boolean");
                break;
        }
        sb.append("Field(/*runtimeObject*/, \"");
        return C10965.m25286(sb, c10769.f29841, "\");");
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31027(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m31024(C10769 c10769) {
        String str = c10769.f29841;
        return C21459.m48622("Class<?> ", str.matches("[a-zA-Z]\\w*") ? str.concat("Class") : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535)), " = classLoader.loadClass(\"", m31027(c10769.f29843), "\");");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m31026(C10769 c10769, C24850 c24850) {
        String strM16053;
        String str = c24850.f79380;
        if (str.equals("<clinit>")) {
            return "";
        }
        ArrayList<C8282> arrayList = new ArrayList();
        C14987 c14987 = new C14987(c24850.f79375);
        while (true) {
            String strM34339 = c14987.m34339();
            if (strM34339 == null) {
                break;
            }
            arrayList.add(new C8282(strM34339));
        }
        StringBuilder sb = new StringBuilder("XposedHelpers.");
        if (str.equals("<init>")) {
            sb.append("findAndHookConstructor");
        } else {
            sb.append("findAndHookMethod");
        }
        sb.append("(\"");
        sb.append(m31027(c10769.f29843));
        sb.append("\", classLoader");
        if (!str.equals("<init>")) {
            C21545.m48729(sb, ", \"", str, "\"");
        }
        for (C8282 c8282 : arrayList) {
            sb.append(", ");
            int i = c8282.f21929;
            String str2 = c8282.f21930;
            if (c8282.f21931) {
                StringBuilder sb2 = new StringBuilder();
                if (str2.startsWith("java.lang.")) {
                    sb2.append(str2.substring(10));
                } else {
                    sb2.append(str2);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    sb2.append("[]");
                }
                sb2.append(".class");
                strM16053 = sb2.toString();
            } else {
                if (i > 0) {
                    str2 = c8282.f21932;
                }
                strM16053 = C6988.m16053("classLoader.loadClass(\"", str2, "\")");
            }
            sb.append(strM16053);
        }
        sb.append(", new XC_MethodHook() {\n    @Override\n    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {\n        super.beforeHookedMethod(param);\n    }\n    @Override\n    protected void afterHookedMethod(MethodHookParam param) throws Throwable {\n        super.afterHookedMethod(param);\n    }\n});");
        return sb.toString();
    }
}
