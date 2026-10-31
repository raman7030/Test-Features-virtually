package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.֡᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6L2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0616 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17760 f2371;

    public C0616(C17760 c17760) {
        this.f2371 = c17760;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m2546(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "recursive", "simple", "cursor", "limit");
        final String strM15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(strM15720, "entryPath", true);
        final boolean zM15719 = C5556.m15719(jSONObject, "recursive");
        final boolean zM157110 = C5556.m15719(jSONObject, "simple");
        final String strM15721 = C5556.m15720(jSONObject, "cursor");
        final int iM15710 = C5556.m15710(jSONObject, "limit", 1, 1000);
        if (!strM15720.isEmpty() && !strM15720.endsWith("/")) {
            throw C5556.m15714(JSON.value(strM15720), "entryPath", "A ZIP directory path must end with /; use an empty string for the root");
        }
        return m2538(jSONObject, strM15720, false, new InterfaceC19668() { // from class: l.ۖ᩵ۜ
            @Override // l.InterfaceC19668
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2542(strM15720, zM15719, strM15721, iM15710, zM157110, str, c18090, c12619, c7383);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2542(String str, boolean z, String str2, int i, boolean z2, String str3, C18090 c18090, C12619 c12619, C7383 c7383) throws C3059 {
        int i2;
        boolean z3;
        String str4;
        C23734 c23734 = new C23734(c18090.m42210());
        if (!str.isEmpty() && c18090.getEntry(str) == null && c23734.m4933(str) == null) {
            throw m2544("ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist", str3, str);
        }
        String strM34531 = C14460.m34531(C14460.m34534().digest(C7416.m19939("layout", "zip-list-v2", MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("recursive", z).add("size", c12619.m30884()).add("modifiedAt", c12619.m30883()).add(am.bp, c7383.f22729).toString().getBytes(StandardCharsets.UTF_8)));
        String str5 = "The ZIP cursor is no longer valid; restart with cursor=\"\"";
        if (!str2.isEmpty()) {
            int iIndexOf = str2.indexOf(46);
            if (iIndexOf > 0 && iIndexOf <= 10 && str2.substring(iIndexOf + 1).equals(strM34531)) {
                try {
                    int i3 = Integer.parseInt(str2.substring(0, iIndexOf));
                    i2 = (i3 > 0 && Integer.toString(i3).equals(str2.substring(0, iIndexOf))) ? i3 : 0;
                } catch (NumberFormatException unused) {
                }
            }
            throw m2544("ZIP_INVALID_CURSOR", "The ZIP cursor is no longer valid; restart with cursor=\"\"", str3, str);
        }
        JSONArray jSONArrayArray = JSON.array();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c23734.m4934(str, C8200.comparing(new C6639(2))).iterator());
        int i4 = 0;
        while (true) {
            if (arrayDeque.isEmpty()) {
                z3 = false;
                break;
            }
            C5556.m15716();
            Iterator it = (Iterator) arrayDeque.peek();
            if (it.hasNext()) {
                C3545 c3545 = (C3545) it.next();
                int i5 = i4 + 1;
                if (i4 < i2) {
                    str5 = str5;
                } else {
                    if (jSONArrayArray.size() == i) {
                        z3 = true;
                        i4 = i5;
                        break;
                    }
                    String strSubstring = c3545.getName().substring(str.length());
                    if (z2) {
                        str5 = str5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        long size = c3545.getSize();
                        String str6 = "-";
                        sb.append(size >= 0 ? Long.toString(size) : "-");
                        sb.append(" ");
                        long jM10793 = c3545.m10793();
                        sb.append(jM10793 >= 0 ? Long.toString(jM10793) : "-");
                        sb.append(" ");
                        if (!c3545.isDirectory() && c3545.m10808()) {
                            str6 = "e";
                        }
                        strSubstring = C23202.m51498(sb, str6, " ", strSubstring);
                    }
                    jSONArrayArray.add(strSubstring);
                }
                if (z && c3545.isDirectory()) {
                    arrayDeque.push(c23734.m4934(c3545.getName(), C8200.comparing(new C6639(2))).iterator());
                }
                i4 = i5;
                str5 = str5;
            } else {
                arrayDeque.pop();
            }
        }
        if (i2 > i4) {
            throw m2544("ZIP_INVALID_CURSOR", str5, str3, str);
        }
        JSONObject jSONObjectAdd = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str).add("listing", jSONArrayArray);
        JSONObject jSONObjectAdd2 = JSON.object().add("hasMore", z3);
        if (z3) {
            str4 = (jSONArrayArray.size() + i2) + "." + strM34531;
        } else {
            str4 = "";
        }
        return jSONObjectAdd.add("pagination", jSONObjectAdd2.add("nextCursor", str4));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2548(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "encoding", "startLine", "startColumn", "limit", "maxChars");
        final String strM15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(strM15720, "entryPath", false);
        final String strM15721 = C5556.m15720(jSONObject, "password");
        final String strM15722 = C5556.m15720(jSONObject, "encoding");
        final long jM48626 = C21474.m48626(jSONObject, "startLine", 0L, 9007199254740991L);
        final long jM48627 = C21474.m48626(jSONObject, "startColumn", 0L, 9007199254740991L);
        final int iM15710 = C5556.m15710(jSONObject, "limit", 1, 2000);
        final int iM15711 = C5556.m15710(jSONObject, "maxChars", 2, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        return m2538(jSONObject, strM15720, false, new InterfaceC19668() { // from class: l.ۡ᩵ۜ
            @Override // l.InterfaceC19668
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2540(strM15720, strM15721, strM15722, jM48626, jM48627, iM15710, iM15711, str, c18090);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2540(String str, String str2, String str3, long j, long j2, int i, int i2, String str4, C18090 c18090) throws C3059 {
        try {
            C18962 c18962 = new C18962(c18090.m42189(m2545(c18090, str4, str, str2)));
            try {
                C23089 c23089M5241 = C1532.m5241(c18962, str3, j, j2, i, i2);
                c18962.close();
                if (c23089M5241.f74245) {
                    return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str4, "entryPath", str).add(TextBundle.TEXT_ENTRY, c23089M5241.f74238).add("encoding", c23089M5241.f74236).add("startLine", j).add("startColumn", j2).add("nextLine", c23089M5241.f74240).add("nextColumn", c23089M5241.f74242).add("returnedLineCount", c23089M5241.f74244).add("returnedCodePoints", c23089M5241.f74237).add("hasMore", c23089M5241.f74243);
                }
                C3059 c3059M2544 = m2544("ZIP_OFFSET_OUT_OF_RANGE", "The requested text position is outside the ZIP entry", str4, str);
                c3059M2544.f9609.add("finalLine", c23089M5241.f74241).add("finalColumn", c23089M5241.f74239);
                throw c3059M2544;
            } catch (Throwable th) {
                try {
                    c18962.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (CharacterCodingException | C6156 unused) {
            throw m2544("ZIP_TEXT_DECODE_FAILED", "The ZIP entry is not valid in the selected text encoding", str4, str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2547(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "byteOffset", "maxBytes");
        final String strM15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(strM15720, "entryPath", false);
        final String strM15721 = C5556.m15720(jSONObject, "password");
        final long jM48626 = C21474.m48626(jSONObject, "byteOffset", 0L, 9007199254740991L);
        final int iM15710 = C5556.m15710(jSONObject, "maxBytes", 1, 65536);
        return m2538(jSONObject, strM15720, false, new InterfaceC19668() { // from class: l.ܺ᩵ۜ
            @Override // l.InterfaceC19668
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2539(strM15720, strM15721, iM15710, jM48626, str, c18090);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2539(String str, String str2, int i, long j, String str3, C18090 c18090) throws C3059, IOException {
        C3545 c3545M2545 = m2545(c18090, str3, str, str2);
        byte[] bArrCopyOf = new byte[i];
        C18962 c18962 = new C18962(c18090.m42189(c3545M2545));
        long j2 = 0;
        while (true) {
            if (j2 < j) {
                try {
                    int i2 = c18962.read(bArrCopyOf, 0, (int) Math.min(i, j - j2));
                    if (i2 < 0) {
                        C3059 c3059M2544 = m2544("ZIP_OFFSET_OUT_OF_RANGE", "The byte offset is past the end of the ZIP entry", str3, str);
                        c3059M2544.f9609.add("size", j2);
                        throw c3059M2544;
                    }
                    j2 += (long) i2;
                } catch (Throwable th) {
                    try {
                        c18962.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                int i3 = 0;
                while (i3 < i) {
                    int i4 = c18962.read(bArrCopyOf, i3, i - i3);
                    if (i4 < 0) {
                        break;
                    }
                    i3 += i4;
                }
                boolean z = c18962.read() >= 0;
                long jM48627 = C21474.m48627("byteOffset", j, i3);
                long size = z ? c3545M2545.getSize() : jM48627;
                if (size < 0 || size > 9007199254740991L) {
                    size = -1;
                }
                long j3 = size;
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("byteOffset", j);
                if (i3 != i) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("hex", C13573.m32618(bArrCopyOf)).add("nextByteOffset", jM48627).add("totalBytes", j3).add("hasMore", z);
                c18962.close();
                return jSONObjectAdd2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2549(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "password");
        final String strM15720 = C5556.m15720(jSONObject, "password");
        return m2538(jSONObject, "", true, new InterfaceC19668() { // from class: l.ۘ᩵ۜ
            @Override // l.InterfaceC19668
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2541(strM15720, str, c18090);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2541(String str, String str2, C18090 c18090) throws C3059 {
        int i = 0;
        try {
            byte[] bArr = new byte[65536];
            for (C3545 c3545 : c18090.m42205()) {
                c3545.getName();
                C5556.m15716();
                if (!c3545.isDirectory()) {
                    if (c3545.m10808() && str.isEmpty()) {
                        throw m2544("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str2, c3545.getName());
                    }
                    c18090.m42192(str);
                    C18962 c18962 = new C18962(c18090.m42202(c3545));
                    while (c18962.read(bArr) >= 0) {
                        try {
                            C5556.m15716();
                        } catch (Throwable th) {
                            try {
                                c18962.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c18962.close();
                    i++;
                }
            }
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("checkedEntries", i);
        } catch (IOException e) {
            C3059 c3059M2543 = m2543(e, str2, "", true);
            c3059M2543.f9609.put("checkedEntries", 0);
            throw c3059M2543;
        } catch (RuntimeException unused) {
            C3059 c3059M2544 = m2544("ZIP_TEST_FAILED", "The ZIP test could not be completed", str2, "");
            c3059M2544.f9609.put("checkedEntries", 0);
            throw c3059M2544;
        } catch (C3059 e2) {
            e2.f9609.put(MotionUtils.EASING_TYPE_PATH, str2).put("entryPath", "").put("checkedEntries", 0);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m2538(JSONObject jSONObject, String str, boolean z, InterfaceC19668 interfaceC19668) throws C3059 {
        boolean z2;
        C17760 c17760 = this.f2371;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), c7383M41607, MotionUtils.EASING_TYPE_PATH);
        try {
            C10000 c10000M41608 = c17760.m41608(strM41599);
            try {
                C5556.m15716();
                C12619 c12619M15715 = C5556.m15715(c17760, strM41599, false);
                JSONObject jSONObject2 = null;
                try {
                    try {
                        C18090 c18090M42167 = C18090.m42167(c12619M15715.m30882(), z);
                        try {
                            try {
                                JSONObject jSONObjectMo8480 = interfaceC19668.mo8480(strM41599, c18090M42167, c12619M15715, c7383M41607);
                                C5556.m15716();
                                C12619 c12619M41613 = c17760.m41613(strM41599);
                                if (c12619M41613.m30885() != EnumC3447.REGULAR || c12619M15715.m30884() != c12619M41613.m30884() || c12619M15715.m30883() != c12619M41613.m30883()) {
                                    throw m2544("ZIP_CHANGED_DURING_READ", "The ZIP file changed during this read; start again", strM41599, str);
                                }
                                c17760.m41607().m19883(strM41599);
                                c18090M42167.close();
                                c10000M41608.close();
                                return jSONObjectMo8480;
                            } catch (IOException e) {
                                e = e;
                                z2 = true;
                                C3059 c3059M2543 = m2543(e, strM41599, str, z && !z2 && ((e instanceof ZipException) || (e instanceof EOFException)));
                                if (z && "ZIP_READ_FAILED".equals(c3059M2543.f9610)) {
                                    c3059M2543 = m2544("ZIP_TEST_FAILED", "The ZIP test could not be completed", strM41599, str);
                                }
                                if (z && 0 != 0) {
                                    c3059M2543.f9609.put("checkedEntries", jSONObject2.getInt("checkedEntries"));
                                }
                                throw c3059M2543;
                            }
                        } catch (Throwable th) {
                            try {
                                c18090M42167.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (RuntimeException unused) {
                        throw m2544(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP operation could not be completed", strM41599, str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
            } catch (Throwable th3) {
                try {
                    c10000M41608.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C3059 e3) {
            e = e3;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", strM41599, str);
            }
            JSONObject jSONObject3 = e.f9609;
            jSONObject3.put(MotionUtils.EASING_TYPE_PATH, strM41599);
            if (jSONObject3.get("entryPath") == null) {
                jSONObject3.put("entryPath", str);
            }
            if (z && jSONObject3.get("checkedEntries") == null) {
                jSONObject3.put("checkedEntries", 0);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m2545(C18090 c18090, String str, String str2, String str3) throws C3059 {
        C3545 entry = c18090.getEntry(str2);
        if (entry == null) {
            throw m2544("ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist", str, str2);
        }
        if (entry.isDirectory()) {
            throw m2544("ZIP_ENTRY_IS_DIRECTORY", "A directory cannot be read as file content", str, str2);
        }
        if (entry.m10808() && str3.isEmpty()) {
            throw m2544("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str, entry.getName());
        }
        c18090.m42192(str3);
        return entry;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m2543(IOException iOException, String str, String str2, boolean z) {
        if (Thread.currentThread().isInterrupted()) {
            return m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
        }
        boolean z2 = false;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof InterruptedIOException) {
                return m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
            }
            if (cause instanceof C13855) {
                z2 = true;
            }
        }
        if (z2) {
            return m2544(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP storage could not be read", str, str2);
        }
        if (iOException instanceof C3979) {
            return m2544("ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry", str, str2);
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented") || lowerCase.contains("requires a dictionary")) {
            return C3059.m9369("ZIP_UNSUPPORTED", "The ZIP uses an unsupported compression, encryption, or archive feature", "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "entryPath", str2));
        }
        return m2544(z ? "ZIP_INVALID" : "ZIP_READ_FAILED", z ? "ZIP structure, length, checksum, or authentication validation failed" : "The ZIP file or entry could not be read", str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m2544(String str, String str2, String str3, String str4) {
        return C5556.m15713(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str4), str, str2);
    }
}
