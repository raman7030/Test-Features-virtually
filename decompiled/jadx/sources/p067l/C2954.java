package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
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
public final class C2954 {

    /* JADX INFO: renamed from: ֫ */
    public final C19247 f5145;

    public C2954(C19247 c19247) {
        this.f5145 = c19247;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m4902(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "recursive", "simple", "cursor", "limit");
        final String strM17634 = C7649.m17634(jSONObject, "entryPath");
        C7649.m17632(strM17634, "entryPath", true);
        final boolean zM17633 = C7649.m17633(jSONObject, "recursive");
        final boolean zM17634 = C7649.m17633(jSONObject, "simple");
        final String strM17635 = C7649.m17634(jSONObject, "cursor");
        final int iM17624 = C7649.m17624(jSONObject, "limit", 1, 1000);
        if (!strM17634.isEmpty() && !strM17634.endsWith("/")) {
            throw C7649.m17628(JSON.value(strM17634), "entryPath", "A ZIP directory path must end with /; use an empty string for the root");
        }
        return m4894(jSONObject, strM17634, false, new InterfaceC21061() { // from class: l.ۖ᩵ۜ
            @Override // p067l.InterfaceC21061
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo10527(String str, C19561 c19561, C14362 c14362, C9385 c9385) {
                return C2954.m4898(strM17634, zM17633, strM17635, iM17624, zM17634, str, c19561, c14362, c9385);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m4898(String str, boolean z, String str2, int i, boolean z2, String str3, C19561 c19561, C14362 c14362, C9385 c9385) throws C5276 {
        int i2;
        boolean z3;
        String str4;
        C24925 c24925 = new C24925(c19561.m44469());
        if (!str.isEmpty() && c19561.getEntry(str) == null && c24925.m7176(str) == null) {
            throw m4900("ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist", str3, str);
        }
        String strM36665 = C16111.m36665(C16111.m36668().digest(C9417.m21913("layout", "zip-list-v2", MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("recursive", z).add("size", c14362.m32961()).add("modifiedAt", c14362.m32960()).add(C0655am.f2341bp, c9385.f25641).toString().getBytes(StandardCharsets.UTF_8)));
        String str5 = "The ZIP cursor is no longer valid; restart with cursor=\"\"";
        if (!str2.isEmpty()) {
            int iIndexOf = str2.indexOf(46);
            if (iIndexOf > 0 && iIndexOf <= 10 && str2.substring(iIndexOf + 1).equals(strM36665)) {
                try {
                    int i3 = Integer.parseInt(str2.substring(0, iIndexOf));
                    i2 = (i3 > 0 && Integer.toString(i3).equals(str2.substring(0, iIndexOf))) ? i3 : 0;
                } catch (NumberFormatException unused) {
                }
            }
            throw m4900("ZIP_INVALID_CURSOR", "The ZIP cursor is no longer valid; restart with cursor=\"\"", str3, str);
        }
        JSONArray jSONArrayArray = JSON.array();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c24925.m7177(str, C10162.comparing(new C8678(2))).iterator());
        int i4 = 0;
        while (true) {
            if (arrayDeque.isEmpty()) {
                z3 = false;
                break;
            }
            C7649.m17630();
            Iterator it = (Iterator) arrayDeque.peek();
            if (it.hasNext()) {
                C5738 c5738 = (C5738) it.next();
                int i5 = i4 + 1;
                if (i4 < i2) {
                    str5 = str5;
                } else {
                    if (jSONArrayArray.size() == i) {
                        z3 = true;
                        i4 = i5;
                        break;
                    }
                    String strSubstring = c5738.getName().substring(str.length());
                    if (z2) {
                        str5 = str5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        long size = c5738.getSize();
                        String str6 = "-";
                        sb.append(size >= 0 ? Long.toString(size) : "-");
                        sb.append(" ");
                        long jM12774 = c5738.m12774();
                        sb.append(jM12774 >= 0 ? Long.toString(jM12774) : "-");
                        sb.append(" ");
                        if (!c5738.isDirectory() && c5738.m12789()) {
                            str6 = "e";
                        }
                        strSubstring = C24420.m53894(sb, str6, " ", strSubstring);
                    }
                    jSONArrayArray.add(strSubstring);
                }
                if (z && c5738.isDirectory()) {
                    arrayDeque.push(c24925.m7177(c5738.getName(), C10162.comparing(new C8678(2))).iterator());
                }
                i4 = i5;
                str5 = str5;
            } else {
                arrayDeque.pop();
            }
        }
        if (i2 > i4) {
            throw m4900("ZIP_INVALID_CURSOR", str5, str3, str);
        }
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str).add("listing", jSONArrayArray);
        JSONObject jSONObjectAdd2 = JSON.object().add("hasMore", z3);
        if (z3) {
            str4 = (jSONArrayArray.size() + i2) + "." + strM36665;
        } else {
            str4 = "";
        }
        return jSONObjectAdd.add("pagination", jSONObjectAdd2.add("nextCursor", str4));
    }

    /* JADX INFO: renamed from: ܽ */
    public final JSONObject m4904(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "encoding", "startLine", "startColumn", "limit", "maxChars");
        final String strM17634 = C7649.m17634(jSONObject, "entryPath");
        C7649.m17632(strM17634, "entryPath", false);
        final String strM17635 = C7649.m17634(jSONObject, "password");
        final String strM17636 = C7649.m17634(jSONObject, "encoding");
        final long jM50963 = C22777.m50963(jSONObject, "startLine", 0L, 9007199254740991L);
        final long jM50964 = C22777.m50963(jSONObject, "startColumn", 0L, 9007199254740991L);
        final int iM17624 = C7649.m17624(jSONObject, "limit", 1, 2000);
        final int iM17625 = C7649.m17624(jSONObject, "maxChars", 2, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        return m4894(jSONObject, strM17634, false, new InterfaceC21061() { // from class: l.ۡ᩵ۜ
            @Override // p067l.InterfaceC21061
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo10527(String str, C19561 c19561, C14362 c14362, C9385 c9385) {
                return C2954.m4896(strM17634, strM17635, strM17636, jM50963, jM50964, iM17624, iM17625, str, c19561);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m4896(String str, String str2, String str3, long j, long j2, int i, int i2, String str4, C19561 c19561) throws C5276 {
        try {
            C20390 c20390 = new C20390(c19561.m44448(m4901(c19561, str4, str, str2)));
            try {
                C24312 c24312M7469 = C3824.m7469(c20390, str3, j, j2, i, i2);
                c20390.close();
                if (c24312M7469.f76991) {
                    return C9417.m21913(MotionUtils.EASING_TYPE_PATH, str4, "entryPath", str).add(TextBundle.TEXT_ENTRY, c24312M7469.f76984).add("encoding", c24312M7469.f76982).add("startLine", j).add("startColumn", j2).add("nextLine", c24312M7469.f76986).add("nextColumn", c24312M7469.f76988).add("returnedLineCount", c24312M7469.f76990).add("returnedCodePoints", c24312M7469.f76983).add("hasMore", c24312M7469.f76989);
                }
                C5276 c5276M4900 = m4900("ZIP_OFFSET_OUT_OF_RANGE", "The requested text position is outside the ZIP entry", str4, str);
                c5276M4900.f12412.add("finalLine", c24312M7469.f76987).add("finalColumn", c24312M7469.f76985);
                throw c5276M4900;
            } catch (Throwable th) {
                try {
                    c20390.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (CharacterCodingException | C8219 unused) {
            throw m4900("ZIP_TEXT_DECODE_FAILED", "The ZIP entry is not valid in the selected text encoding", str4, str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final JSONObject m4903(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "byteOffset", "maxBytes");
        final String strM17634 = C7649.m17634(jSONObject, "entryPath");
        C7649.m17632(strM17634, "entryPath", false);
        final String strM17635 = C7649.m17634(jSONObject, "password");
        final long jM50963 = C22777.m50963(jSONObject, "byteOffset", 0L, 9007199254740991L);
        final int iM17624 = C7649.m17624(jSONObject, "maxBytes", 1, 65536);
        return m4894(jSONObject, strM17634, false, new InterfaceC21061() { // from class: l.ܺ᩵ۜ
            @Override // p067l.InterfaceC21061
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo10527(String str, C19561 c19561, C14362 c14362, C9385 c9385) {
                return C2954.m4895(strM17634, strM17635, iM17624, jM50963, str, c19561);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m4895(String str, String str2, int i, long j, String str3, C19561 c19561) throws C5276, IOException {
        C5738 c5738M4901 = m4901(c19561, str3, str, str2);
        byte[] bArrCopyOf = new byte[i];
        C20390 c20390 = new C20390(c19561.m44448(c5738M4901));
        long j2 = 0;
        while (true) {
            if (j2 < j) {
                try {
                    int i2 = c20390.read(bArrCopyOf, 0, (int) Math.min(i, j - j2));
                    if (i2 < 0) {
                        C5276 c5276M4900 = m4900("ZIP_OFFSET_OUT_OF_RANGE", "The byte offset is past the end of the ZIP entry", str3, str);
                        c5276M4900.f12412.add("size", j2);
                        throw c5276M4900;
                    }
                    j2 += (long) i2;
                } catch (Throwable th) {
                    try {
                        c20390.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                int i3 = 0;
                while (i3 < i) {
                    int i4 = c20390.read(bArrCopyOf, i3, i - i3);
                    if (i4 < 0) {
                        break;
                    }
                    i3 += i4;
                }
                boolean z = c20390.read() >= 0;
                long jM50964 = C22777.m50964("byteOffset", j, i3);
                long size = z ? c5738M4901.getSize() : jM50964;
                if (size < 0 || size > 9007199254740991L) {
                    size = -1;
                }
                long j3 = size;
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("byteOffset", j);
                if (i3 != i) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("hex", C15268.m34730(bArrCopyOf)).add("nextByteOffset", jM50964).add("totalBytes", j3).add("hasMore", z);
                c20390.close();
                return jSONObjectAdd2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final JSONObject m4905(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "password");
        final String strM17634 = C7649.m17634(jSONObject, "password");
        return m4894(jSONObject, "", true, new InterfaceC21061() { // from class: l.ۘ᩵ۜ
            @Override // p067l.InterfaceC21061
            /* JADX INFO: renamed from: ֫ */
            public final JSONObject mo10527(String str, C19561 c19561, C14362 c14362, C9385 c9385) {
                return C2954.m4897(strM17634, str, c19561);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m4897(String str, String str2, C19561 c19561) throws C5276 {
        int i = 0;
        try {
            byte[] bArr = new byte[65536];
            for (C5738 c5738 : c19561.m44464()) {
                c5738.getName();
                C7649.m17630();
                if (!c5738.isDirectory()) {
                    if (c5738.m12789() && str.isEmpty()) {
                        throw m4900("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str2, c5738.getName());
                    }
                    c19561.m44451(str);
                    C20390 c20390 = new C20390(c19561.m44461(c5738));
                    while (c20390.read(bArr) >= 0) {
                        try {
                            C7649.m17630();
                        } catch (Throwable th) {
                            try {
                                c20390.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c20390.close();
                    i++;
                }
            }
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("checkedEntries", i);
        } catch (IOException e) {
            C5276 c5276M4899 = m4899(e, str2, "", true);
            c5276M4899.f12412.put("checkedEntries", 0);
            throw c5276M4899;
        } catch (RuntimeException unused) {
            C5276 c5276M4900 = m4900("ZIP_TEST_FAILED", "The ZIP test could not be completed", str2, "");
            c5276M4900.f12412.put("checkedEntries", 0);
            throw c5276M4900;
        } catch (C5276 e2) {
            e2.f12412.put(MotionUtils.EASING_TYPE_PATH, str2).put("entryPath", "").put("checkedEntries", 0);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private JSONObject m4894(JSONObject jSONObject, String str, boolean z, InterfaceC21061 interfaceC21061) throws C5276 {
        boolean z2;
        C19247 c19247 = this.f5145;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(C7649.m17634(jSONObject, MotionUtils.EASING_TYPE_PATH), c9385M43852, MotionUtils.EASING_TYPE_PATH);
        try {
            C11872 c11872M43853 = c19247.m43853(strM43844);
            try {
                C7649.m17630();
                C14362 c14362M17629 = C7649.m17629(c19247, strM43844, false);
                JSONObject jSONObject2 = null;
                try {
                    try {
                        C19561 c19561M44426 = C19561.m44426(c14362M17629.m32959(), z);
                        try {
                            try {
                                JSONObject jSONObjectMo10527 = interfaceC21061.mo10527(strM43844, c19561M44426, c14362M17629, c9385M43852);
                                C7649.m17630();
                                C14362 c14362M43858 = c19247.m43858(strM43844);
                                if (c14362M43858.m32962() != EnumC5645.REGULAR || c14362M17629.m32961() != c14362M43858.m32961() || c14362M17629.m32960() != c14362M43858.m32960()) {
                                    throw m4900("ZIP_CHANGED_DURING_READ", "The ZIP file changed during this read; start again", strM43844, str);
                                }
                                c19247.m43852().m21856(strM43844);
                                c19561M44426.close();
                                c11872M43853.close();
                                return jSONObjectMo10527;
                            } catch (IOException e) {
                                e = e;
                                z2 = true;
                                C5276 c5276M4899 = m4899(e, strM43844, str, z && !z2 && ((e instanceof ZipException) || (e instanceof EOFException)));
                                if (z && "ZIP_READ_FAILED".equals(c5276M4899.f12413)) {
                                    c5276M4899 = m4900("ZIP_TEST_FAILED", "The ZIP test could not be completed", strM43844, str);
                                }
                                if (z && 0 != 0) {
                                    c5276M4899.f12412.put("checkedEntries", jSONObject2.getInt("checkedEntries"));
                                }
                                throw c5276M4899;
                            }
                        } catch (Throwable th) {
                            try {
                                c19561M44426.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (RuntimeException unused) {
                        throw m4900(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP operation could not be completed", strM43844, str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
            } catch (Throwable th3) {
                try {
                    c11872M43853.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C5276 e3) {
            e = e3;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f12413)) {
                e = m4900("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", strM43844, str);
            }
            JSONObject jSONObject3 = e.f12412;
            jSONObject3.put(MotionUtils.EASING_TYPE_PATH, strM43844);
            if (jSONObject3.get("entryPath") == null) {
                jSONObject3.put("entryPath", str);
            }
            if (z && jSONObject3.get("checkedEntries") == null) {
                jSONObject3.put("checkedEntries", 0);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5738 m4901(C19561 c19561, String str, String str2, String str3) throws C5276 {
        C5738 entry = c19561.getEntry(str2);
        if (entry == null) {
            throw m4900("ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist", str, str2);
        }
        if (entry.isDirectory()) {
            throw m4900("ZIP_ENTRY_IS_DIRECTORY", "A directory cannot be read as file content", str, str2);
        }
        if (entry.m12789() && str3.isEmpty()) {
            throw m4900("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str, entry.getName());
        }
        c19561.m44451(str3);
        return entry;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m4899(IOException iOException, String str, String str2, boolean z) {
        if (Thread.currentThread().isInterrupted()) {
            return m4900("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
        }
        boolean z2 = false;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof InterruptedIOException) {
                return m4900("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
            }
            if (cause instanceof C15536) {
                z2 = true;
            }
        }
        if (z2) {
            return m4900(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP storage could not be read", str, str2);
        }
        if (iOException instanceof C6150) {
            return m4900("ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry", str, str2);
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented") || lowerCase.contains("requires a dictionary")) {
            return C5276.m11411("ZIP_UNSUPPORTED", "The ZIP uses an unsupported compression, encryption, or archive feature", "fatal", null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "entryPath", str2));
        }
        return m4900(z ? "ZIP_INVALID" : "ZIP_READ_FAILED", z ? "ZIP structure, length, checksum, or authentication validation failed" : "The ZIP file or entry could not be read", str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m4900(String str, String str2, String str3, String str4) {
        return C7649.m17627(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str4), str, str2);
    }
}
