package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1WW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19433 extends AbstractC18091 {

    /* JADX INFO: renamed from: ۖ */
    public C20795 f59181;

    /* JADX INFO: renamed from: ۡ */
    public final String f59182;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f59183;

    public AbstractC19433(C18762 c18762, InterfaceC7383 interfaceC7383, String str, boolean z) {
        super(c18762, interfaceC7383);
        if (z) {
            this.f59182 = "[ZIJDFCSB]*" + C6112.m13905(str) + "[ZIJDFCSB]*";
            this.f59183 = true;
            return;
        }
        this.f59182 = str;
        this.f59183 = false;
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public List mo5822(C18762 c18762) {
        boolean zEquals;
        InterfaceC20568 interfaceC20568Mo5857;
        ArrayList arrayList = new ArrayList();
        for (C2993 c2993 : c18762.f56062.values()) {
            if (mo9923(c2993)) {
                for (C3349 c3349 : c2993.mo5035()) {
                    if (mo13533(c3349) && c3349.mo5855().equals("Ljava/lang/String;")) {
                        String strM15309 = C6712.m15309(c3349);
                        boolean z = this.f59183;
                        String str = this.f59182;
                        if (z) {
                            zEquals = strM15309.matches(str);
                        } else {
                            zEquals = strM15309.equals(str);
                        }
                        if (zEquals && (interfaceC20568Mo5857 = c3349.mo5857()) != null && mo4128(c3349, interfaceC20568Mo5857)) {
                            arrayList.add(c3349);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo9923(C2993 c2993) {
        return EnumC17248.PUBLIC.m39032(c2993.mo5039()) && "Ljava/lang/Object;".equals(c2993.mo5034());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX INFO: renamed from: ֫ */
    public boolean mo4128(C3349 c3349, InterfaceC20568 interfaceC20568) {
        C18762 c18762 = this.f79251;
        C20795 c20795 = new C20795(c18762);
        this.f59181 = c20795;
        c20795.m46950(c3349);
        for (InterfaceC7568 interfaceC7568 : this.f59181.m46949()) {
            String strMo5853 = interfaceC7568.mo5853();
            if (c18762.f56063) {
                strMo5853.getClass();
                switch (strMo5853) {
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo5853.startsWith("Ljava/util/concurrent/") || strMo5853.startsWith("Lorg/xml/") || strMo5853.startsWith("Lorg/json/") || strMo5853.startsWith("Ljavax/xml/") || strMo5853.startsWith("Landroid/view/") || strMo5853.startsWith("Landroid/graphics/")) {
                            return false;
                        }
                        break;
                }
            } else {
                strMo5853.getClass();
                switch (strMo5853) {
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
                        if (strMo5853.startsWith("Ljava/nio/file/") || strMo5853.startsWith("Ljava/util/concurrent/") || strMo5853.startsWith("Lorg/xml/") || strMo5853.startsWith("Lorg/json/") || strMo5853.startsWith("Ljavax/xml/") || strMo5853.startsWith("Landroid/app/") || strMo5853.startsWith("Landroid/view/") || strMo5853.startsWith("Landroid/content/") || strMo5853.startsWith("Landroid/graphics/") || strMo5853.startsWith("Landroid/os/")) {
                            return false;
                        }
                        break;
                }
            }
            if (strMo5853.equals("Ljava/lang/Runtime;") && interfaceC7568.getName().equals("exec")) {
                return false;
            }
            if (strMo5853.equals("Ljava/lang/Thread;") && interfaceC7568.getName().equals("start")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo13533(C3349 c3349) {
        return EnumC17248.PUBLIC.m39032(c3349.mo5854()) && EnumC17248.STATIC.m39032(c3349.mo5854());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44201() {
        Iterator it = this.f59181.m46949().iterator();
        if (!it.hasNext()) {
            return true;
        }
        String strMo5853 = ((InterfaceC7568) it.next()).mo5853();
        return strMo5853.startsWith("Ljava/lang/") || strMo5853.startsWith("Ljavax/crypto/") || strMo5853.equals("Ljava/io/ByteArrayOutputStream;");
    }
}
