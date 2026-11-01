package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6893 extends AbstractC7564 {
    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m15807() {
        int iM37586;
        int iM37587;
        iM37586 = 0;
        for (InterfaceC24904 interfaceC24904 : this.f20656) {
            C22161 c22161 = null;
            try {
                try {
                    ((C2869) this.f20655).mo13867(interfaceC24904);
                    C22161 c22162 = new C22161((C2869) this.f20655);
                    try {
                        interfaceC24904.mo8319(c22162.f32279 || c22162.f32285);
                        DataInputStream dataInputStreamMo8317 = interfaceC24904.mo8317(C18189.m41402of(this.f20655));
                        try {
                            c22162.m49966(dataInputStreamMo8317, C10697.get(interfaceC24904.getName(), new String[0]));
                            dataInputStreamMo8317.close();
                            ((C2869) this.f20655).m48074(new C21646());
                            ((C2869) this.f20655).m48092().mo4345(c22162.f70102, C18189.m41402of(".jasm"), this.f20655);
                            c22162.mo5334();
                            ((C2869) this.f20655).m48092().mo4347(c22162.f70102);
                            ((C2869) this.f20655).m48086().flush();
                            iM37586 += ((C16583) ((C2869) this.f20655).m48082()).m37586(iM37586, interfaceC24904);
                            ((C16583) ((C2869) this.f20655).m48082()).m37587();
                        } catch (Throwable th) {
                            try {
                                dataInputStreamMo8317.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        c22161 = c22162;
                        c22161.m49971();
                        ((C2869) this.f20655).m48073(e);
                        ((C2869) this.f20655).m48083(e);
                        iM37587 = ((C16583) ((C2869) this.f20655).m48082()).m37586(iM37586, interfaceC24904);
                        iM37586 += iM37587;
                        ((C16583) ((C2869) this.f20655).m48082()).m37587();
                        return iM37586;
                    } catch (ClassFormatError e2) {
                        e = e2;
                        c22161 = c22162;
                        c22161.m49971();
                        ((C2869) this.f20655).m48073(e);
                        ((C2869) this.f20655).m48083(e);
                        iM37587 = ((C16583) ((C2869) this.f20655).m48082()).m37586(iM37586, interfaceC24904);
                        iM37586 += iM37587;
                        ((C16583) ((C2869) this.f20655).m48082()).m37587();
                        return iM37586;
                    } catch (Error e3) {
                        e = e3;
                        c22161 = c22162;
                        c22161.m49971();
                        ((C2869) this.f20655).m48073(e);
                        ((C2869) this.f20655).m48083(e);
                        iM37587 = ((C16583) ((C2869) this.f20655).m48082()).m37586(iM37586, interfaceC24904);
                        iM37586 += iM37587;
                        ((C16583) ((C2869) this.f20655).m48082()).m37587();
                        return iM37586;
                    } catch (Exception e4) {
                        e = e4;
                        c22161 = c22162;
                        c22161.m49971();
                        ((C2869) this.f20655).m48073(e);
                        ((C2869) this.f20655).m48083(e);
                        iM37587 = ((C16583) ((C2869) this.f20655).m48082()).m37586(iM37586, interfaceC24904);
                        iM37586 += iM37587;
                        ((C16583) ((C2869) this.f20655).m48082()).m37587();
                        return iM37586;
                    }
                } catch (FileNotFoundException e5) {
                    ((C2869) this.f20655).m48083(e5);
                    ((C2869) this.f20655).mo13866("No such file: {0}", interfaceC24904);
                    iM37586 = 1;
                    ((C16583) ((C2869) this.f20655).m48082()).m37587();
                    return iM37586;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (ClassFormatError e7) {
                e = e7;
            } catch (Error e8) {
                e = e8;
            } catch (Exception e9) {
                e = e9;
            }
        }
        return iM37586;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x012e A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013a A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:10:0x0028, B:12:0x0030, B:81:0x0193, B:13:0x0037, B:15:0x003f, B:16:0x0046, B:18:0x004e, B:19:0x005b, B:21:0x0063, B:22:0x006a, B:24:0x0072, B:25:0x0079, B:27:0x0081, B:28:0x0088, B:30:0x0090, B:31:0x009a, B:33:0x00a2, B:34:0x00b1, B:36:0x00b9, B:37:0x00c6, B:39:0x00ce, B:40:0x00e6, B:42:0x00ee, B:43:0x00f3, B:45:0x00fb, B:46:0x0104, B:48:0x010c, B:49:0x0115, B:51:0x011b, B:52:0x0120, B:54:0x0128, B:55:0x012e, B:57:0x0134, B:59:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x014b, B:66:0x0151, B:69:0x015c, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0173, B:77:0x0178, B:78:0x0179, B:79:0x018a, B:80:0x018b, B:82:0x0196, B:85:0x019d, B:86:0x01ac), top: B:89:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C6893(C2775 c2775, C22893 c22893, C4117 c4117, String... strArr) {
        super(c2775, c22893);
        this.f20656.add(c4117);
        ArrayList arrayList = this.f20656;
        AbstractC21279 abstractC21279 = this.f20655;
        try {
            C12949.m29681();
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                switch (str.hashCode()) {
                    case -620636114:
                        if (str.equals("-sysinfo")) {
                            C12949.m29677(EnumC4231.SYSINFO);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        if (str.equals("-")) {
                            m18171();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1495:
                        if (str.equals("-d")) {
                            i++;
                            m18172(EnumC17527.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1497:
                        if (str.equals("-f")) {
                            i++;
                            m18172(EnumC17527.FILE, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1498:
                        if (str.equals("-g")) {
                            C12949.m29682();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1511:
                        if (str.equals("-t")) {
                            C12949.m29677(EnumC4231.VERBOSE);
                            C12949.m29677(EnumC4231.TRACE);
                            ((C2869) abstractC21279).m48077();
                            ((C2869) abstractC21279).m48085();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1513:
                        if (str.equals("-v")) {
                            C12949.m29677(EnumC4231.VERBOSE);
                            ((C2869) abstractC21279).m48077();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1514:
                        if (str.equals("-w")) {
                            ((C2869) abstractC21279).m48079();
                            i++;
                            m18172(EnumC17527.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46541:
                        if (str.equals("-gg")) {
                            C12949.m29682();
                            C12949.m29677(EnumC4231.EXTRA_DETAILED_Output);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46589:
                        if (str.equals("-hx")) {
                            C12949.m29677(EnumC4231.HEX);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46754:
                        if (str.equals("-nc")) {
                            C12949.m29677(EnumC4231.NO_COMMENTS);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46816:
                        if (str.equals("-pc")) {
                            C12949.m29677(EnumC4231.PRINT_BCI);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1440158:
                        if (str.equals("-dls")) {
                            ((C2869) abstractC21279).m48076(new C10152());
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1398427585:
                        if (str.equals("-table")) {
                            C12949.m29677(EnumC4231.TABLE);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1713741480:
                        if (str.equals("-best-effort")) {
                            C12949.m29677(EnumC4231.BEST_EFFORT);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    default:
                        if (str.startsWith("-")) {
                            arrayList.add(new C18198(str));
                        } else if (str.startsWith("-drop")) {
                            if (m15806("-drop", str, "DROP", EnumC4231.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m15806("-lnt", str, "LINE_NUMBER_TABLE", EnumC4231.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C2869) abstractC21279).mo13866("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m15806("-lvt", str, "LOCAL_VARIABLE", EnumC4231.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                }
            }
            if (arrayList.isEmpty()) {
                ((C2869) abstractC21279).mo13866("No input files specified.", new Object[0]);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException unused) {
            ((C16583) ((C2869) abstractC21279).m48082()).m37587();
            System.exit(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m15806(String str, String str2, String str3, EnumC4231 enumC4231) {
        String strSubstring = str2.substring(str.length());
        int length = strSubstring.length();
        int iCharCount = 0;
        while (true) {
            AbstractC21279 abstractC21279 = this.f20655;
            if (iCharCount >= length) {
                if (enumC4231.m8594()) {
                    enumC4231.m8593();
                    return true;
                }
                ((C2869) abstractC21279).mo13866("Not implemented yet: {0}", str.concat(":all"));
                return false;
            }
            int iCodePointAt = strSubstring.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (!strSubstring.matches("^[:=-]+.*")) {
                    ((C2869) abstractC21279).mo13866("Not implemented yet: {0}", str.concat(strSubstring));
                    return false;
                }
                String[] strArrSplit = strSubstring.substring(1).split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    EnumC4231 enumC4231M8585 = EnumC4231.m8585(str3, strArrSplit[i]);
                    if (enumC4231M8585 == null || !enumC4231M8585.name().startsWith(str3)) {
                        ((C2869) abstractC21279).mo13866("Invalid parameter \"{0}\" of option: {1}", strArrSplit[i], str);
                        return false;
                    }
                    if (!enumC4231M8585.m8594()) {
                        ((C2869) abstractC21279).mo13866("Not implemented yet: {0}", C24104.m53357(str, ":", strArrSplit[i]));
                        return false;
                    }
                    enumC4231M8585.m8593();
                    if (enumC4231M8585.equals(enumC4231)) {
                        break;
                    }
                }
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
