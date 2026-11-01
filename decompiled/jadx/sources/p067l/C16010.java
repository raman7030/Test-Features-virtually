package p067l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C16010 {
    /* JADX INFO: renamed from: ֫ */
    public static String m36382(InterfaceC7568 interfaceC7568, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!z) {
            sb.append(interfaceC7568.mo5853());
            sb.append("->");
        }
        sb.append(interfaceC7568.getName());
        sb.append('(');
        Iterator it = interfaceC7568.mo5852().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(interfaceC7568.mo5855());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36385(Writer writer, InterfaceC2873 interfaceC2873) throws IOException {
        if (interfaceC2873 instanceof C21566) {
            C21566 c21566 = (C21566) interfaceC2873;
            writer.write(40);
            c21566.m48755(writer);
            writer.write(41);
            c21566.m48756(writer);
            return;
        }
        writer.write(40);
        Iterator it = interfaceC2873.mo4624().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC2873.mo4625());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36386(Writer writer, InterfaceC7568 interfaceC7568, boolean z) throws IOException {
        if (interfaceC7568 instanceof C5472) {
            C5472 c5472 = (C5472) interfaceC7568;
            if (!z) {
                c5472.m12048(writer);
                writer.write("->");
            }
            c5472.m12049(writer);
            writer.write(40);
            c5472.m12050(writer);
            writer.write(41);
            c5472.m12052(writer);
            return;
        }
        if (interfaceC7568 instanceof C18155) {
            C18155 c18155 = (C18155) interfaceC7568;
            if (!z) {
                c18155.f54220.m23261(writer);
                writer.write("->");
            }
            c18155.m41358(writer);
            writer.write(40);
            c18155.m41361(writer);
            writer.write(41);
            c18155.m41362(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC7568.mo5853());
            writer.write("->");
        }
        writer.write(interfaceC7568.getName());
        writer.write(40);
        Iterator it = interfaceC7568.mo5852().iterator();
        while (it.hasNext()) {
            writer.write(((CharSequence) it.next()).toString());
        }
        writer.write(41);
        writer.write(interfaceC7568.mo5855());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36384(InterfaceC20309 interfaceC20309, boolean z) {
        String name = interfaceC20309.getName();
        String type = interfaceC20309.getType();
        if (!z) {
            String strMo10231 = interfaceC20309.mo10231();
            StringBuilder sb = new StringBuilder(strMo10231.length() + type.length() + name.length() + 3);
            sb.append(strMo10231);
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

    /* JADX INFO: renamed from: ֫ */
    public static String m36383(InterfaceC20309 interfaceC20309) {
        String name = interfaceC20309.getName();
        String type = interfaceC20309.getType();
        StringBuilder sb = new StringBuilder(type.length() + name.length() + 1);
        sb.append(name);
        sb.append(':');
        sb.append(type);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36387(Writer writer, InterfaceC20309 interfaceC20309, boolean z) throws IOException {
        if (interfaceC20309 instanceof C16870) {
            C16870 c16870 = (C16870) interfaceC20309;
            if (!z) {
                c16870.m38431(writer);
                writer.write("->");
            }
            c16870.m38432(writer);
            writer.write(58);
            c16870.m38433(writer);
            return;
        }
        if (!z) {
            writer.write(interfaceC20309.mo10231());
            writer.write("->");
        }
        writer.write(interfaceC20309.getName());
        writer.write(58);
        writer.write(interfaceC20309.getType());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36388(Writer writer, InterfaceC20980 interfaceC20980) throws IOException {
        writer.write(C2496.m3616(interfaceC20980.mo5178()));
        writer.write(64);
        InterfaceC10250 interfaceC10250Mo5179 = interfaceC20980.mo5179();
        if (interfaceC10250Mo5179 instanceof InterfaceC7568) {
            m36386(writer, (InterfaceC7568) interfaceC10250Mo5179, false);
        } else {
            m36387(writer, (InterfaceC20309) interfaceC10250Mo5179, false);
        }
    }
}
