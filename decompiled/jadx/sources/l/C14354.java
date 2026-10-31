package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14354 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34249(InterfaceC5471 interfaceC5471, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!z) {
            sb.append(interfaceC5471.mo3566());
            sb.append("->");
        }
        sb.append(interfaceC5471.getName());
        sb.append('(');
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(interfaceC5471.mo3568());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34252(Writer writer, InterfaceC0531 interfaceC0531) throws IOException {
        if (interfaceC0531 instanceof C20200) {
            C20200 c20200 = (C20200) interfaceC0531;
            writer.write(40);
            c20200.m46436(writer);
            writer.write(41);
            c20200.m46437(writer);
            return;
        }
        writer.write(40);
        Iterator it = interfaceC0531.mo2257().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC0531.mo2258());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34253(Writer writer, InterfaceC5471 interfaceC5471, boolean z) throws IOException {
        if (interfaceC5471 instanceof C3266) {
            C3266 c3266 = (C3266) interfaceC5471;
            if (!z) {
                c3266.m10015(writer);
                writer.write("->");
            }
            c3266.m10016(writer);
            writer.write(40);
            c3266.m10017(writer);
            writer.write(41);
            c3266.m10019(writer);
            return;
        }
        if (interfaceC5471 instanceof C16611) {
            C16611 c16611 = (C16611) interfaceC5471;
            if (!z) {
                c16611.f51043.m21295(writer);
                writer.write("->");
            }
            c16611.m39131(writer);
            writer.write(40);
            c16611.m39134(writer);
            writer.write(41);
            c16611.m39135(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC5471.mo3566());
            writer.write("->");
        }
        writer.write(interfaceC5471.getName());
        writer.write(40);
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC5471.mo3568());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34251(InterfaceC18877 interfaceC18877, boolean z) {
        String name = interfaceC18877.getName();
        String type = interfaceC18877.getType();
        if (!z) {
            String strMo8192 = interfaceC18877.mo8192();
            StringBuilder sb = new StringBuilder(strMo8192.length() + type.length() + name.length() + 3);
            sb.append(strMo8192);
            sb.append("->");
            sb.append(name);
            sb.append(':');
            sb.append(type);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(type.length() + name.length() + 1);
        sb2.append(name);
        sb2.append(':');
        sb2.append(type);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34250(InterfaceC18877 interfaceC18877) {
        String name = interfaceC18877.getName();
        String type = interfaceC18877.getType();
        StringBuilder sb = new StringBuilder(type.length() + name.length() + 1);
        sb.append(name);
        sb.append(':');
        sb.append(type);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34254(Writer writer, InterfaceC18877 interfaceC18877, boolean z) throws IOException {
        if (interfaceC18877 instanceof C15259) {
            C15259 c15259 = (C15259) interfaceC18877;
            if (!z) {
                c15259.m36270(writer);
                writer.write("->");
            }
            c15259.m36271(writer);
            writer.write(58);
            c15259.m36272(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC18877.mo8192());
            writer.write("->");
        }
        writer.write(interfaceC18877.getName());
        writer.write(58);
        writer.write(interfaceC18877.getType());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34255(Writer writer, InterfaceC19583 interfaceC19583) throws IOException {
        writer.write(C0135.m1214(interfaceC19583.mo2849()));
        writer.write(64);
        InterfaceC8293 interfaceC8293Mo2850 = interfaceC19583.mo2850();
        if (interfaceC8293Mo2850 instanceof InterfaceC5471) {
            m34253(writer, (InterfaceC5471) interfaceC8293Mo2850, false);
        } else {
            m34254(writer, (InterfaceC18877) interfaceC8293Mo2850, false);
        }
    }
}
