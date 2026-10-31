package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11867 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28974(C8839 c8839, C14482 c14482) {
        StringBuilder sb = new StringBuilder("XposedHelpers.get");
        if (c14482.f44371) {
            sb.append("Static");
        }
        String str = c14482.f44370;
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
        return C9045.m23341(sb, c8839.f26917, "\");");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28976(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28973(C8839 c8839) {
        String str = c8839.f26917;
        return C20087.m46306("Class<?> ", str.matches("[a-zA-Z]\\w*") ? str.concat("Class") : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535)), " = classLoader.loadClass(\"", m28976(c8839.f26919), "\");");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28975(C8839 c8839, C23655 c23655) {
        String strM14172;
        String str = c23655.f76634;
        if (str.equals("<clinit>")) {
            return "";
        }
        ArrayList<C6222> arrayList = new ArrayList();
        C13277 c13277 = new C13277(c23655.f76629);
        while (true) {
            String strM32240 = c13277.m32240();
            if (strM32240 == null) {
                break;
            }
            arrayList.add(new C6222(strM32240));
        }
        StringBuilder sb = new StringBuilder("XposedHelpers.");
        if (str.equals("<init>")) {
            sb.append("findAndHookConstructor");
        } else {
            sb.append("findAndHookMethod");
        }
        sb.append("(\"");
        sb.append(m28976(c8839.f26919));
        sb.append("\", classLoader");
        if (!str.equals("<init>")) {
            C20177.m46410(sb, ", \"", str, "\"");
        }
        for (C6222 c6222 : arrayList) {
            sb.append(", ");
            int i = c6222.f19066;
            String str2 = c6222.f19067;
            if (c6222.f19068) {
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
                strM14172 = sb2.toString();
            } else {
                if (i > 0) {
                    str2 = c6222.f19069;
                }
                strM14172 = C4860.m14172("classLoader.loadClass(\"", str2, "\")");
            }
            sb.append(strM14172);
        }
        sb.append(", new XC_MethodHook() {\n    @Override\n    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {\n        super.beforeHookedMethod(param);\n    }\n    @Override\n    protected void afterHookedMethod(MethodHookParam param) throws Throwable {\n        super.afterHookedMethod(param);\n    }\n});");
        return sb.toString();
    }
}
