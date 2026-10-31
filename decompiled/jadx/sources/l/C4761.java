package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4761 extends AbstractC5467 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m13927() {
        int iM35434;
        int iM35435;
        iM35434 = 0;
        for (InterfaceC23712 interfaceC23712 : this.f17810) {
            C20826 c20826 = null;
            try {
                try {
                    ((C0527) this.f17809).mo11947(interfaceC23712);
                    C20826 c20827 = new C20826((C0527) this.f17809);
                    try {
                        interfaceC23712.mo6121(c20827.f29330 || c20827.f29336);
                        DataInputStream dataInputStreamMo6119 = interfaceC23712.mo6119(C16646.of(this.f17809));
                        try {
                            c20827.m47638(dataInputStreamMo6119, C8763.get(interfaceC23712.getName(), new String[0]));
                            dataInputStreamMo6119.close();
                            ((C0527) this.f17809).m45762(new C20284());
                            ((C0527) this.f17809).m45780().mo1969(c20827.f67419, C16646.of(".jasm"), this.f17809);
                            c20827.mo3021();
                            ((C0527) this.f17809).m45780().mo1971(c20827.f67419);
                            ((C0527) this.f17809).m45774().flush();
                            iM35434 += ((C14957) ((C0527) this.f17809).m45770()).m35434(iM35434, interfaceC23712);
                            ((C14957) ((C0527) this.f17809).m45770()).m35435();
                        } catch (Throwable th) {
                            try {
                                dataInputStreamMo6119.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        c20826 = c20827;
                        c20826.m47643();
                        ((C0527) this.f17809).m45761(e);
                        ((C0527) this.f17809).m45771(e);
                        iM35435 = ((C14957) ((C0527) this.f17809).m45770()).m35434(iM35434, interfaceC23712);
                        iM35434 += iM35435;
                        ((C14957) ((C0527) this.f17809).m45770()).m35435();
                        return iM35434;
                    } catch (ClassFormatError e2) {
                        e = e2;
                        c20826 = c20827;
                        c20826.m47643();
                        ((C0527) this.f17809).m45761(e);
                        ((C0527) this.f17809).m45771(e);
                        iM35435 = ((C14957) ((C0527) this.f17809).m45770()).m35434(iM35434, interfaceC23712);
                        iM35434 += iM35435;
                        ((C14957) ((C0527) this.f17809).m45770()).m35435();
                        return iM35434;
                    } catch (Error e3) {
                        e = e3;
                        c20826 = c20827;
                        c20826.m47643();
                        ((C0527) this.f17809).m45761(e);
                        ((C0527) this.f17809).m45771(e);
                        iM35435 = ((C14957) ((C0527) this.f17809).m45770()).m35434(iM35434, interfaceC23712);
                        iM35434 += iM35435;
                        ((C14957) ((C0527) this.f17809).m45770()).m35435();
                        return iM35434;
                    } catch (Exception e4) {
                        e = e4;
                        c20826 = c20827;
                        c20826.m47643();
                        ((C0527) this.f17809).m45761(e);
                        ((C0527) this.f17809).m45771(e);
                        iM35435 = ((C14957) ((C0527) this.f17809).m45770()).m35434(iM35434, interfaceC23712);
                        iM35434 += iM35435;
                        ((C14957) ((C0527) this.f17809).m45770()).m35435();
                        return iM35434;
                    }
                } catch (FileNotFoundException e5) {
                    ((C0527) this.f17809).m45771(e5);
                    ((C0527) this.f17809).mo11946("No such file: {0}", interfaceC23712);
                    iM35434 = 1;
                    ((C14957) ((C0527) this.f17809).m45770()).m35435();
                    return iM35434;
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
        return iM35434;
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
    public C4761(C0428 c0428, C21596 c21596, C1840 c1840, String... strArr) {
        super(c0428, c21596);
        this.f17810.add(c1840);
        ArrayList arrayList = this.f17810;
        AbstractC19898 abstractC19898 = this.f17809;
        try {
            C11133.m27619();
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                switch (str.hashCode()) {
                    case -620636114:
                        if (str.equals("-sysinfo")) {
                            C11133.m27615(EnumC1960.SYSINFO);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        if (str.equals("-")) {
                            m16251();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1495:
                        if (str.equals("-d")) {
                            i++;
                            m16252(EnumC15950.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1497:
                        if (str.equals("-f")) {
                            i++;
                            m16252(EnumC15950.FILE, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1498:
                        if (str.equals("-g")) {
                            C11133.m27620();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1511:
                        if (str.equals("-t")) {
                            C11133.m27615(EnumC1960.VERBOSE);
                            C11133.m27615(EnumC1960.TRACE);
                            ((C0527) abstractC19898).m45765();
                            ((C0527) abstractC19898).m45773();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1513:
                        if (str.equals("-v")) {
                            C11133.m27615(EnumC1960.VERBOSE);
                            ((C0527) abstractC19898).m45765();
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1514:
                        if (str.equals("-w")) {
                            ((C0527) abstractC19898).m45767();
                            i++;
                            m16252(EnumC15950.DIR, i, strArr);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46541:
                        if (str.equals("-gg")) {
                            C11133.m27620();
                            C11133.m27615(EnumC1960.EXTRA_DETAILED_Output);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46589:
                        if (str.equals("-hx")) {
                            C11133.m27615(EnumC1960.HEX);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46754:
                        if (str.equals("-nc")) {
                            C11133.m27615(EnumC1960.NO_COMMENTS);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 46816:
                        if (str.equals("-pc")) {
                            C11133.m27615(EnumC1960.PRINT_BCI);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1440158:
                        if (str.equals("-dls")) {
                            ((C0527) abstractC19898).m45764(new C8190());
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1398427585:
                        if (str.equals("-table")) {
                            C11133.m27615(EnumC1960.TABLE);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    case 1713741480:
                        if (str.equals("-best-effort")) {
                            C11133.m27615(EnumC1960.BEST_EFFORT);
                        } else if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                    default:
                        if (str.startsWith("-")) {
                            arrayList.add(new C16656(str));
                        } else if (str.startsWith("-drop")) {
                            if (m13926("-drop", str, "DROP", EnumC1960.DROP_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else if (str.startsWith("-lnt")) {
                            if (m13926("-lnt", str, "LINE_NUMBER_TABLE", EnumC1960.LINE_NUMBER_TABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            if (str.startsWith("-lvt")) {
                                ((C0527) abstractC19898).mo11946("Invalid option: {0}", str);
                                throw new IllegalArgumentException();
                            }
                            if (m13926("-lvt", str, "LOCAL_VARIABLE", EnumC1960.LOCAL_VARIABLE_All)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                        break;
                }
            }
            if (arrayList.isEmpty()) {
                ((C0527) abstractC19898).mo11946("No input files specified.", new Object[0]);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException unused) {
            ((C14957) ((C0527) abstractC19898).m45770()).m35435();
            System.exit(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13926(String str, String str2, String str3, EnumC1960 enumC1960) {
        String strSubstring = str2.substring(str.length());
        int length = strSubstring.length();
        int iCharCount = 0;
        while (true) {
            AbstractC19898 abstractC19898 = this.f17809;
            if (iCharCount >= length) {
                if (enumC1960.m6453()) {
                    enumC1960.m6452();
                    return true;
                }
                ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", str.concat(":all"));
                return false;
            }
            int iCodePointAt = strSubstring.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (!strSubstring.matches("^[:=-]+.*")) {
                    ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", str.concat(strSubstring));
                    return false;
                }
                String[] strArrSplit = strSubstring.substring(1).split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    EnumC1960 enumC1960M6444 = EnumC1960.m6444(str3, strArrSplit[i]);
                    if (enumC1960M6444 == null || !enumC1960M6444.name().startsWith(str3)) {
                        ((C0527) abstractC19898).mo11946("Invalid parameter \"{0}\" of option: {1}", strArrSplit[i], str);
                        return false;
                    }
                    if (!enumC1960M6444.m6453()) {
                        ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", C22870.m50967(str, ":", strArrSplit[i]));
                        return false;
                    }
                    enumC1960M6444.m6452();
                    if (enumC1960M6444.equals(enumC1960)) {
                        break;
                    }
                }
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
