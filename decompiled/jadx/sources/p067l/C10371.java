package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10371 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f28708 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final char[] f28709 = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* JADX INFO: renamed from: ᩳ */
    public static final SecureRandom f28710 = new SecureRandom();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f28711 = C17853.f53285.m38684("mcp");

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 m24028() {
        return this.f28711;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24025(AbstractC17043 abstractC17043, String str) {
        AbstractC17043 abstractC17043M38684 = this.f28711.m38684(str);
        return !abstractC17043M38684.mo25094() && abstractC17043.mo25502(abstractC17043M38684);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 m24029(String str) {
        return this.f28711.m38684(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m24024() throws Throwable {
        AbstractC17043 abstractC17043 = this.f28711;
        boolean zMo25094 = abstractC17043.mo25094();
        AbstractC17043 abstractC17044 = null;
        int i = 0;
        try {
            abstractC17043.m38666();
            int i2 = (zMo25094 || !abstractC17043.mo25094()) ? 0 : 1;
            while (i < 100) {
                try {
                    AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".tmp-" + UUID.randomUUID());
                    try {
                        if (abstractC17043M38684.mo25094()) {
                            i++;
                        } else {
                            abstractC17043M38684.m38666();
                            try {
                                abstractC17043M38684.m38684("entries").m38666();
                                abstractC17043M38684.m38684("cache").m38684("dex").m38666();
                                return abstractC17043M38684;
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                i = 1;
                            }
                        }
                    } catch (IOException | RuntimeException e2) {
                        e = e2;
                        i = i2;
                    }
                    e = e;
                    abstractC17044 = abstractC17043M38684;
                } catch (IOException | RuntimeException e3) {
                    int i3 = i2;
                    e = e3;
                    i = i3;
                }
                if (abstractC17044 != null && abstractC17044.mo25094()) {
                    m24015(abstractC17044);
                    i = 1;
                }
                if (((zMo25094 || !abstractC17043.mo25094()) ? i : 1) != 0) {
                    C17548.m39937();
                }
                throw e;
            }
            throw new IOException("Unable to create temporary workspace");
        } catch (IOException e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m24026() throws IOException {
        for (int i = 0; i < 100; i++) {
            char[] cArr = new char[8];
            for (int i2 = 0; i2 < 8; i2++) {
                SecureRandom secureRandom = f28710;
                char[] cArr2 = f28709;
                cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
            }
            String str = new String(cArr);
            if (!this.f28711.m38684(str).mo25094()) {
                return str;
            }
        }
        throw new IOException("Unable to allocate workspace id");
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24018(AbstractC17043 abstractC17043) {
        m24020(abstractC17043);
        if (abstractC17043.mo25094()) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete ")));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m24020(AbstractC17043 abstractC17043) throws IOException {
        if (abstractC17043.mo25094()) {
            if (abstractC17043.mo25087() && !abstractC17043.m38691()) {
                Iterator it = abstractC17043.mo25500(true).iterator();
                while (it.hasNext()) {
                    m24020((AbstractC17043) it.next());
                }
            }
            if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24015(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo25094()) {
            if (abstractC17043.mo25087()) {
                Iterator it = abstractC17043.mo25500(true).iterator();
                while (it.hasNext()) {
                    m24015((AbstractC17043) it.next());
                }
            }
            abstractC17043.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24009(C19561 c19561, AbstractC17043 abstractC17043) throws IOException {
        try {
            MessageDigest messageDigestM36668 = C16111.m36668();
            InterfaceC9866 interfaceC9866M44473 = c19561.m44473();
            interfaceC9866M44473.seek(0L);
            long length = interfaceC9866M44473.length();
            byte[] bArr = new byte[8192];
            OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
            while (length > 0) {
                try {
                    int i = interfaceC9866M44473.read(bArr, 0, (int) Math.min(8192, length));
                    if (i < 0) {
                        throw new IOException("Unexpected EOF while copying archive");
                    }
                    messageDigestM36668.update(bArr, 0, i);
                    outputStreamMo25506.write(bArr, 0, i);
                    length -= (long) i;
                } catch (Throwable th) {
                    if (outputStreamMo25506 != null) {
                        try {
                            outputStreamMo25506.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw e;
            }
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
            return C16111.m36665(messageDigestM36668.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final C2994 m24023(AbstractC17043 abstractC17043) {
        String strM31907;
        C2994 c2994;
        AbstractC17043 abstractC17044 = this.f28711;
        String strM31908 = null;
        if (!abstractC17044.mo25094() || !abstractC17044.mo25087()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo25495 = abstractC17043.mo25495();
        if (strMo25495 == null) {
            strM31907 = null;
        } else {
            try {
                strM31907 = C14059.m31907(strMo25495, "sourcePath");
            } catch (C5276 unused) {
                strM31907 = null;
            }
        }
        if (strM31907 == null) {
            return null;
        }
        long jMo25101 = abstractC17043.mo25101();
        long jMo25091 = abstractC17043.mo25091();
        int i = 1;
        for (AbstractC17043 abstractC17045 : abstractC17044.mo25500(true)) {
            if (abstractC17045.mo25087()) {
                try {
                    JSONObject jSONObjectM24019 = m24019(abstractC17045);
                    if (jSONObjectM24019.getInt("schemaVersion", -1) == i) {
                        String string = jSONObjectM24019.getString("workspaceId", strM31908);
                        if (abstractC17045.getName().equals(string) && m24021(string)) {
                            C2994 c2995 = new C2994(abstractC17045, string);
                            c2995.f5313 = jSONObjectM24019.getBoolean("temporary", false);
                            String string2 = jSONObjectM24019.getString("sourcePath", strM31908);
                            if (string2 != null) {
                                try {
                                    strM31908 = C14059.m31907(string2, "sourcePath");
                                } catch (C5276 unused2) {
                                }
                            }
                            c2995.f5319 = strM31908;
                            c2995.f5312 = jSONObjectM24019.getLong("sourceSize", -1L);
                            c2995.f5315 = jSONObjectM24019.getLong("sourceLastModified", -1L);
                            c2995.f5321 = jSONObjectM24019.getString("originalSha256", null);
                            c2995.f5311 = jSONObjectM24019.getLong("createdAt", -1L);
                            c2995.f5322 = jSONObjectM24019.getLong("lastAccessedAt", -1L);
                            if (c2995.f5313 || c2995.f5319 == null || c2995.f5312 < 0 || c2995.f5315 < 0 || c2995.f5321 == null || c2995.f5311 < 0) {
                                c2994 = 0;
                            } else {
                                c2994 = c2995;
                            }
                        } else {
                            c2994 = 0;
                        }
                    }
                } catch (Exception unused3) {
                }
                if (c2994 != 0 && strM31907.equals(c2994.f5319) && jMo25101 == c2994.f5312 && jMo25091 == c2994.f5315) {
                    c2994 = strM31908;
                    arrayList.add(c2994);
                }
                c2994 = strM31908;
                c2994 = strM31908;
                c2994 = strM31908;
                c2994 = strM31908;
                strM31908 = null;
                i = 1;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final String strM24016 = m24016(abstractC17043);
        return (C2994) C7480.stream(arrayList).filter(new Predicate() { // from class: l.ۘ᩷ۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m14507or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strM24016.equals(((C2994) obj).f5321);
            }
        }).max(C10162.comparingLong(new C20430())).orElse(null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C2994 m24027(String str) throws C5276 {
        if (!m24021(str)) {
            throw C5276.m11409(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        }
        try {
            C2994 c2994M24017 = m24017(this.f28711.m38684(str), str);
            m24010(c2994M24017);
            return c2994M24017;
        } catch (C3665 unused) {
            throw C5276.m11409(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        } catch (C5276 e) {
            throw e;
        } catch (C7689 e2) {
            throw C19553.m44408(e2.f20155, e2.f20156);
        } catch (Exception unused2) {
            throw C5276.m11409(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2994 m24022(String str) {
        if (m24021(str)) {
            AbstractC17043 abstractC17043M38684 = this.f28711.m38684(str);
            try {
                JSONObject jSONObjectM24019 = m24019(abstractC17043M38684);
                if (jSONObjectM24019.getInt("schemaVersion", -1) != 1) {
                    throw new C3665();
                }
                if (!str.equals(jSONObjectM24019.getString("workspaceId", null))) {
                    throw new C3665();
                }
                C2994 c2994 = new C2994(abstractC17043M38684, str);
                c2994.f5313 = jSONObjectM24019.getBoolean("temporary", false);
                return c2994;
            } catch (C3665 unused) {
                throw C5276.m11409(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
            }
        }
        throw C5276.m11409(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24011(AbstractC17043 abstractC17043, long j) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC17043.m38684("metadata.json").m38664(), StandardCharsets.UTF_8));
            while (jSONObject.contains("lastAccessedAt")) {
                jSONObject.remove("lastAccessedAt");
            }
            jSONObject.put("lastAccessedAt", j);
            m24012(abstractC17043, jSONObject);
        } catch (Exception e) {
            throw new IOException("Unable to read metadata", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24012(AbstractC17043 abstractC17043, JSONObject jSONObject) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("metadata.json");
        abstractC17043M38684.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043M38684.m38678(".metadata");
        try {
            abstractC17043M38678.m38660(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            abstractC17043M38678.mo25509().mo12969(abstractC17043M38684);
        } finally {
            abstractC17043M38678.mo25503();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static JSONObject m24019(AbstractC17043 abstractC17043) throws C3665 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("metadata.json");
        if (!abstractC17043M38684.mo25093()) {
            throw new C3665();
        }
        try {
            return new JSONObject(new String(abstractC17043M38684.m38664(), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            throw new C3665();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m24014(AbstractC17043 abstractC17043, String str) {
        return abstractC17043.m38684("cache").m38684("dex").m38684(str + ".type_index");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m24021(String str) {
        if (str != null && str.length() == 8) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r13.f5325 >= 0) goto L56;
     */
    /* JADX INFO: renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2994 m24017(AbstractC17043 abstractC17043, String str) throws C3665, C7689 {
        String strM31907;
        JSONObject jSONObjectM24019 = m24019(abstractC17043);
        boolean z = true;
        if (jSONObjectM24019.getInt("schemaVersion", -1) != 1) {
            throw new C3665();
        }
        String string = jSONObjectM24019.getString("workspaceId", null);
        if (!str.equals(string)) {
            throw new C3665();
        }
        C2994 c2994 = new C2994(abstractC17043, string);
        c2994.f5313 = jSONObjectM24019.getBoolean("temporary", false);
        String string2 = jSONObjectM24019.getString("sourcePath", null);
        if (string2 == null) {
            strM31907 = null;
        } else {
            try {
                strM31907 = C14059.m31907(string2, "sourcePath");
            } catch (C5276 unused) {
                strM31907 = null;
            }
        }
        c2994.f5319 = strM31907;
        c2994.f5312 = jSONObjectM24019.getLong("sourceSize", -1L);
        c2994.f5315 = jSONObjectM24019.getLong("sourceLastModified", -1L);
        c2994.f5321 = jSONObjectM24019.getString("originalSha256", null);
        c2994.f5311 = jSONObjectM24019.getLong("createdAt", -1L);
        c2994.f5322 = jSONObjectM24019.getLong("lastAccessedAt", -1L);
        if (c2994.f5319 == null || c2994.f5312 < 0 || c2994.f5315 < 0 || c2994.f5321 == null || c2994.f5311 < 0) {
            throw new C3665();
        }
        JSONValue jSONValue = jSONObjectM24019.get("resourceStatus");
        if (jSONValue == null || jSONValue.isNull()) {
            throw new C7689(c2994.f5319, c2994.f5313);
        }
        if (jSONValue.isString()) {
            c2994.f5316 = jSONValue.asString();
            c2994.f5318 = jSONObjectM24019.getString("resourceError", null);
            JSONValue jSONValue2 = jSONObjectM24019.get("resourceSha256");
            JSONValue jSONValue3 = jSONObjectM24019.get("resourceLength");
            if (!"available".equals(c2994.f5316)) {
                if (jSONValue2 == null && jSONValue3 == null) {
                    z = false;
                }
                c2994.f5314 = z;
                c2994.f5324 = null;
                c2994.f5325 = -1L;
            } else if (jSONValue2 == null && jSONValue3 == null) {
                c2994.f5314 = true;
            } else {
                if (jSONValue2 == null || jSONValue3 == null || !jSONValue2.isString() || !jSONValue3.isNumber()) {
                    throw new C7689(c2994.f5319, c2994.f5313);
                }
                try {
                    c2994.f5324 = jSONValue2.asString();
                    c2994.f5325 = jSONValue3.asLong();
                    String str2 = c2994.f5324;
                    if (str2 != null && str2.length() == 64) {
                        for (int i = 0; i < str2.length(); i++) {
                            if (Character.digit(str2.charAt(i), 16) != -1) {
                            }
                        }
                    }
                    throw new C7689(c2994.f5319, c2994.f5313);
                } catch (RuntimeException unused2) {
                    throw new C7689(c2994.f5319, c2994.f5313);
                }
            }
            JSONValue jSONValue4 = jSONObjectM24019.get("dexFiles");
            if (jSONValue4 == null || jSONValue4.isNull()) {
                throw new C7689(c2994.f5319, c2994.f5313);
            }
            if (jSONValue4.isArray()) {
                for (JSONValue jSONValue5 : jSONValue4.asArray()) {
                    if (!jSONValue5.isObject()) {
                        throw new C7689(c2994.f5319, c2994.f5313);
                    }
                    JSONObject jSONObjectAsObject = jSONValue5.asObject();
                    c2994.f5317.add(new C21101(jSONObjectAsObject.getString("entryName", null), jSONObjectAsObject.getString(C0172c.f705a, null), jSONObjectAsObject.getString(C0708d.f2599O, null), jSONObjectAsObject.getString("indexCachePath", null)));
                }
                return c2994;
            }
            throw new C7689(c2994.f5319, c2994.f5313);
        }
        throw new C7689(c2994.f5319, c2994.f5313);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24010(C2994 c2994) throws C5276 {
        String str = c2994.f5316;
        AbstractC17043 abstractC17043 = c2994.f5320;
        if (!"absent".equals(str) && !"available".equals(str) && !"extract_error".equals(str) && !"parse_error".equals(str)) {
            throw C19553.m44408(c2994.f5319, c2994.f5313);
        }
        if (!abstractC17043.m38684("original.apk").mo25093()) {
            throw C19553.m44408(c2994.f5319, c2994.f5313);
        }
        for (C21101 c21101 : c2994.f5317) {
            String str2 = c21101.f66303;
            String str3 = c21101.f66300;
            if (!"available".equals(str2) && !C0708d.f2599O.equals(str2) && !"skipped".equals(str2)) {
                throw C19553.m44408(c2994.f5319, c2994.f5313);
            }
            if ("available".equals(c21101.f66303) && (str3 == null || !abstractC17043.m38684("entries").m38684(str3).mo25093() || !m24014(abstractC17043, str3).mo25093())) {
                throw C19553.m44408(c2994.f5319, c2994.f5313);
            }
        }
        if (("available".equals(c2994.f5316) || "parse_error".equals(c2994.f5316)) && !abstractC17043.m38684("entries").m38684("resources.arsc").mo25093()) {
            throw C19553.m44408(c2994.f5319, c2994.f5313);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24013(AbstractC17043 abstractC17043, C2994 c2994) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (C21101 c21101 : c2994.f5317) {
            jSONArrayArray.add(JSON.object().add("entryName", c21101.f66300).add(C0172c.f705a, c21101.f66303).add(C0708d.f2599O, c21101.f66301).add("indexCachePath", c21101.f66302));
        }
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("workspaceId", c2994.f5323).add("temporary", c2994.f5313).add("sourcePath", c2994.f5319).add("sourceSize", c2994.f5312).add("sourceLastModified", c2994.f5315).add("originalSha256", c2994.f5321).add("createdAt", c2994.f5311).add("lastAccessedAt", c2994.f5322).add("dexFiles", jSONArrayArray).add("resourceStatus", c2994.f5316).add("resourceError", c2994.f5318);
        if ("available".equals(c2994.f5316) && (str = c2994.f5324) != null && c2994.f5325 >= 0) {
            jSONObjectAdd.add("resourceSha256", str);
            jSONObjectAdd.add("resourceLength", c2994.f5325);
        }
        m24012(abstractC17043, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m24016(AbstractC17043 abstractC17043) throws IOException {
        try {
            MessageDigest messageDigestM36668 = C16111.m36668();
            C16111.m36661(messageDigestM36668, abstractC17043.mo29987());
            return C16111.m36665(messageDigestM36668.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
