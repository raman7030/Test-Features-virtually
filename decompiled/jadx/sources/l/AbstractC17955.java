package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1WW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17955 extends AbstractC16543 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19388 f55984;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f55985;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f55986;

    public AbstractC17955(C17249 c17249, InterfaceC5276 interfaceC5276, String str, boolean z) {
        super(c17249, interfaceC5276);
        if (z) {
            this.f55985 = "[ZIJDFCSB]*" + C3939.m11985(str) + "[ZIJDFCSB]*";
            this.f55986 = true;
            return;
        }
        this.f55985 = str;
        this.f55986 = false;
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public List mo3535(C17249 c17249) {
        boolean zEquals;
        InterfaceC19150 interfaceC19150Mo3570;
        ArrayList arrayList = new ArrayList();
        for (C0657 c0657 : c17249.f52880.values()) {
            if (mo7875(c0657)) {
                for (C1032 c1032 : c0657.mo2696()) {
                    if (mo11597(c1032) && c1032.mo3568().equals("Ljava/lang/String;")) {
                        String strM13421 = C4570.m13421(c1032);
                        boolean z = this.f55986;
                        String str = this.f55985;
                        if (z) {
                            zEquals = strM13421.matches(str);
                        } else {
                            zEquals = strM13421.equals(str);
                        }
                        if (zEquals && (interfaceC19150Mo3570 = c1032.mo3570()) != null && mo1730(c1032, interfaceC19150Mo3570)) {
                            arrayList.add(c1032);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo7875(C0657 c0657) {
        return EnumC15657.PUBLIC.m36866(c0657.mo2700()) && "Ljava/lang/Object;".equals(c0657.mo2695());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        C17249 c17249 = this.f76507;
        C19388 c19388 = new C19388(c17249);
        this.f55984 = c19388;
        c19388.m44656(c1032);
        for (InterfaceC5471 interfaceC5471 : this.f55984.m44655()) {
            String strMo3566 = interfaceC5471.mo3566();
            if (c17249.f52881) {
                strMo3566.getClass();
                switch (strMo3566) {
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo3566.startsWith("Ljava/util/concurrent/") || strMo3566.startsWith("Lorg/xml/") || strMo3566.startsWith("Lorg/json/") || strMo3566.startsWith("Ljavax/xml/") || strMo3566.startsWith("Landroid/view/") || strMo3566.startsWith("Landroid/graphics/")) {
                            return false;
                        }
                        break;
                }
            } else {
                strMo3566.getClass();
                switch (strMo3566) {
                    case "Ljava/io/RandomAccessFile;":
                    case "Ljava/text/SimpleDateFormat;":
                    case "Ljava/util/Calendar;":
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/io/File;":
                    case "Ljava/util/Date;":
                    case "Ljava/io/FileInputStream;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/io/FileOutputStream;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo3566.startsWith("Ljava/nio/file/") || strMo3566.startsWith("Ljava/util/concurrent/") || strMo3566.startsWith("Lorg/xml/") || strMo3566.startsWith("Lorg/json/") || strMo3566.startsWith("Ljavax/xml/") || strMo3566.startsWith("Landroid/app/") || strMo3566.startsWith("Landroid/view/") || strMo3566.startsWith("Landroid/content/") || strMo3566.startsWith("Landroid/graphics/") || strMo3566.startsWith("Landroid/os/")) {
                            return false;
                        }
                        break;
                }
            }
            if (strMo3566.equals("Ljava/lang/Runtime;") && interfaceC5471.getName().equals("exec")) {
                return false;
            }
            if (strMo3566.equals("Ljava/lang/Thread;") && interfaceC5471.getName().equals("start")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo11597(C1032 c1032) {
        return EnumC15657.PUBLIC.m36866(c1032.mo3567()) && EnumC15657.STATIC.m36866(c1032.mo3567());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41952() {
        Iterator it = this.f55984.m44655().iterator();
        if (!it.hasNext()) {
            return true;
        }
        String strMo3566 = ((InterfaceC5471) it.next()).mo3566();
        return strMo3566.startsWith("Ljava/lang/") || strMo3566.startsWith("Ljavax/crypto/") || strMo3566.equals("Ljava/io/ByteArrayOutputStream;");
    }
}
