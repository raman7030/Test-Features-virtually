package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.d;
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
public final class C8420 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25794 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final char[] f25795 = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f25796 = new SecureRandom();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f25797 = C16293.f50118.m36526("mcp");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m22058() {
        return this.f25797;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22055(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 abstractC15440M36526 = this.f25797.m36526(str);
        return !abstractC15440M36526.mo23120() && abstractC15440.mo23551(abstractC15440M36526);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m22059(String str) {
        return this.f25797.m36526(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m22054() throws Throwable {
        AbstractC15440 abstractC15440 = this.f25797;
        boolean zMo23120 = abstractC15440.mo23120();
        AbstractC15440 abstractC15441 = null;
        int i = 0;
        try {
            abstractC15440.m36508();
            int i2 = (zMo23120 || !abstractC15440.mo23120()) ? 0 : 1;
            while (i < 100) {
                try {
                    AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".tmp-" + UUID.randomUUID());
                    try {
                        if (abstractC15440M36526.mo23120()) {
                            i++;
                        } else {
                            abstractC15440M36526.m36508();
                            try {
                                abstractC15440M36526.m36526("entries").m36508();
                                abstractC15440M36526.m36526("cache").m36526("dex").m36508();
                                return abstractC15440M36526;
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
                    abstractC15441 = abstractC15440M36526;
                } catch (IOException | RuntimeException e3) {
                    int i3 = i2;
                    e = e3;
                    i = i3;
                }
                if (abstractC15441 != null && abstractC15441.mo23120()) {
                    m22045(abstractC15441);
                    i = 1;
                }
                if (((zMo23120 || !abstractC15440.mo23120()) ? i : 1) != 0) {
                    C15972.m37753();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m22056() throws IOException {
        for (int i = 0; i < 100; i++) {
            char[] cArr = new char[8];
            for (int i2 = 0; i2 < 8; i2++) {
                SecureRandom secureRandom = f25796;
                char[] cArr2 = f25795;
                cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
            }
            String str = new String(cArr);
            if (!this.f25797.m36526(str).mo23120()) {
                return str;
            }
        }
        throw new IOException("Unable to allocate workspace id");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22048(AbstractC15440 abstractC15440) {
        m22050(abstractC15440);
        if (abstractC15440.mo23120()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m22050(AbstractC15440 abstractC15440) throws IOException {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m22050((AbstractC15440) it.next());
                }
            }
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22045(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m22045((AbstractC15440) it.next());
                }
            }
            abstractC15440.mo23552();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22039(C18090 c18090, AbstractC15440 abstractC15440) throws IOException {
        try {
            MessageDigest messageDigestM34534 = C14460.m34534();
            InterfaceC7889 interfaceC7889M42214 = c18090.m42214();
            interfaceC7889M42214.seek(0L);
            long length = interfaceC7889M42214.length();
            byte[] bArr = new byte[8192];
            OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
            while (length > 0) {
                try {
                    int i = interfaceC7889M42214.read(bArr, 0, (int) Math.min(8192, length));
                    if (i < 0) {
                        throw new IOException("Unexpected EOF while copying archive");
                    }
                    messageDigestM34534.update(bArr, 0, i);
                    outputStreamMo23555.write(bArr, 0, i);
                    length -= (long) i;
                } catch (Throwable th) {
                    if (outputStreamMo23555 != null) {
                        try {
                            outputStreamMo23555.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw e;
            }
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
            return C14460.m34531(messageDigestM34534.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0658 m22053(AbstractC15440 abstractC15440) {
        String strM29847;
        C0658 c0658;
        AbstractC15440 abstractC15441 = this.f25797;
        String strM29848 = null;
        if (!abstractC15441.mo23120() || !abstractC15441.mo23113()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo23544 = abstractC15440.mo23544();
        if (strMo23544 == null) {
            strM29847 = null;
        } else {
            try {
                strM29847 = C12301.m29847(strMo23544, "sourcePath");
            } catch (C3059 unused) {
                strM29847 = null;
            }
        }
        if (strM29847 == null) {
            return null;
        }
        long jMo23127 = abstractC15440.mo23127();
        long jMo23117 = abstractC15440.mo23117();
        int i = 1;
        for (AbstractC15440 abstractC15442 : abstractC15441.mo23549(true)) {
            if (abstractC15442.mo23113()) {
                try {
                    JSONObject jSONObjectM22049 = m22049(abstractC15442);
                    if (jSONObjectM22049.getInt("schemaVersion", -1) == i) {
                        String string = jSONObjectM22049.getString("workspaceId", strM29848);
                        if (abstractC15442.getName().equals(string) && m22051(string)) {
                            C0658 c0659 = new C0658(abstractC15442, string);
                            c0659.f2540 = jSONObjectM22049.getBoolean("temporary", false);
                            String string2 = jSONObjectM22049.getString("sourcePath", strM29848);
                            if (string2 != null) {
                                try {
                                    strM29848 = C12301.m29847(string2, "sourcePath");
                                } catch (C3059 unused2) {
                                }
                            }
                            c0659.f2546 = strM29848;
                            c0659.f2539 = jSONObjectM22049.getLong("sourceSize", -1L);
                            c0659.f2542 = jSONObjectM22049.getLong("sourceLastModified", -1L);
                            c0659.f2548 = jSONObjectM22049.getString("originalSha256", null);
                            c0659.f2538 = jSONObjectM22049.getLong("createdAt", -1L);
                            c0659.f2549 = jSONObjectM22049.getLong("lastAccessedAt", -1L);
                            if (c0659.f2540 || c0659.f2546 == null || c0659.f2539 < 0 || c0659.f2542 < 0 || c0659.f2548 == null || c0659.f2538 < 0) {
                                c0658 = 0;
                            } else {
                                c0658 = c0659;
                            }
                        } else {
                            c0658 = 0;
                        }
                    }
                } catch (Exception unused3) {
                }
                if (c0658 != 0 && strM29847.equals(c0658.f2546) && jMo23127 == c0658.f2539 && jMo23117 == c0658.f2542) {
                    c0658 = strM29848;
                    arrayList.add(c0658);
                }
                c0658 = strM29848;
                c0658 = strM29848;
                c0658 = strM29848;
                c0658 = strM29848;
                strM29848 = null;
                i = 1;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final String strM22046 = m22046(abstractC15440);
        return (C0658) C5378.stream(arrayList).filter(new Predicate() { // from class: l.ۘ᩷ۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strM22046.equals(((C0658) obj).f2548);
            }
        }).max(C8200.comparingLong(new C19004())).orElse(null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0658 m22057(String str) throws C3059 {
        if (!m22051(str)) {
            throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        }
        try {
            C0658 c0658M22047 = m22047(this.f25797.m36526(str), str);
            m22040(c0658M22047);
            return c0658M22047;
        } catch (C1364 unused) {
            throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        } catch (C3059 e) {
            throw e;
        } catch (C5598 e2) {
            throw C18081.m42149(e2.f17311, e2.f17312);
        } catch (Exception unused2) {
            throw C3059.m9367(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0658 m22052(String str) {
        if (m22051(str)) {
            AbstractC15440 abstractC15440M36526 = this.f25797.m36526(str);
            try {
                JSONObject jSONObjectM22049 = m22049(abstractC15440M36526);
                if (jSONObjectM22049.getInt("schemaVersion", -1) != 1) {
                    throw new C1364();
                }
                if (!str.equals(jSONObjectM22049.getString("workspaceId", null))) {
                    throw new C1364();
                }
                C0658 c0658 = new C0658(abstractC15440M36526, str);
                c0658.f2540 = jSONObjectM22049.getBoolean("temporary", false);
                return c0658;
            } catch (C1364 unused) {
                throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
            }
        }
        throw C3059.m9367(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22041(AbstractC15440 abstractC15440, long j) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC15440.m36526("metadata.json").m36506(), StandardCharsets.UTF_8));
            while (jSONObject.contains("lastAccessedAt")) {
                jSONObject.remove("lastAccessedAt");
            }
            jSONObject.put("lastAccessedAt", j);
            m22042(abstractC15440, jSONObject);
        } catch (Exception e) {
            throw new IOException("Unable to read metadata", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22042(AbstractC15440 abstractC15440, JSONObject jSONObject) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("metadata.json");
        abstractC15440M36526.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440M36526.m36520(".metadata");
        try {
            abstractC15440M36520.m36502(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            abstractC15440M36520.mo23558().mo10993(abstractC15440M36526);
        } finally {
            abstractC15440M36520.mo23552();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static JSONObject m22049(AbstractC15440 abstractC15440) throws C1364 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("metadata.json");
        if (!abstractC15440M36526.mo23119()) {
            throw new C1364();
        }
        try {
            return new JSONObject(new String(abstractC15440M36526.m36506(), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            throw new C1364();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22044(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526("cache").m36526("dex").m36526(str + ".type_index");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m22051(String str) {
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
    
        if (r13.f2552 >= 0) goto L56;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0658 m22047(AbstractC15440 abstractC15440, String str) throws C1364, C5598 {
        String strM29847;
        JSONObject jSONObjectM22049 = m22049(abstractC15440);
        boolean z = true;
        if (jSONObjectM22049.getInt("schemaVersion", -1) != 1) {
            throw new C1364();
        }
        String string = jSONObjectM22049.getString("workspaceId", null);
        if (!str.equals(string)) {
            throw new C1364();
        }
        C0658 c0658 = new C0658(abstractC15440, string);
        c0658.f2540 = jSONObjectM22049.getBoolean("temporary", false);
        String string2 = jSONObjectM22049.getString("sourcePath", null);
        if (string2 == null) {
            strM29847 = null;
        } else {
            try {
                strM29847 = C12301.m29847(string2, "sourcePath");
            } catch (C3059 unused) {
                strM29847 = null;
            }
        }
        c0658.f2546 = strM29847;
        c0658.f2539 = jSONObjectM22049.getLong("sourceSize", -1L);
        c0658.f2542 = jSONObjectM22049.getLong("sourceLastModified", -1L);
        c0658.f2548 = jSONObjectM22049.getString("originalSha256", null);
        c0658.f2538 = jSONObjectM22049.getLong("createdAt", -1L);
        c0658.f2549 = jSONObjectM22049.getLong("lastAccessedAt", -1L);
        if (c0658.f2546 == null || c0658.f2539 < 0 || c0658.f2542 < 0 || c0658.f2548 == null || c0658.f2538 < 0) {
            throw new C1364();
        }
        JSONValue jSONValue = jSONObjectM22049.get("resourceStatus");
        if (jSONValue == null || jSONValue.isNull()) {
            throw new C5598(c0658.f2546, c0658.f2540);
        }
        if (jSONValue.isString()) {
            c0658.f2543 = jSONValue.asString();
            c0658.f2545 = jSONObjectM22049.getString("resourceError", null);
            JSONValue jSONValue2 = jSONObjectM22049.get("resourceSha256");
            JSONValue jSONValue3 = jSONObjectM22049.get("resourceLength");
            if (!"available".equals(c0658.f2543)) {
                if (jSONValue2 == null && jSONValue3 == null) {
                    z = false;
                }
                c0658.f2541 = z;
                c0658.f2551 = null;
                c0658.f2552 = -1L;
            } else if (jSONValue2 == null && jSONValue3 == null) {
                c0658.f2541 = true;
            } else {
                if (jSONValue2 == null || jSONValue3 == null || !jSONValue2.isString() || !jSONValue3.isNumber()) {
                    throw new C5598(c0658.f2546, c0658.f2540);
                }
                try {
                    c0658.f2551 = jSONValue2.asString();
                    c0658.f2552 = jSONValue3.asLong();
                    String str2 = c0658.f2551;
                    if (str2 != null && str2.length() == 64) {
                        for (int i = 0; i < str2.length(); i++) {
                            if (Character.digit(str2.charAt(i), 16) != -1) {
                            }
                        }
                    }
                    throw new C5598(c0658.f2546, c0658.f2540);
                } catch (RuntimeException unused2) {
                    throw new C5598(c0658.f2546, c0658.f2540);
                }
            }
            JSONValue jSONValue4 = jSONObjectM22049.get("dexFiles");
            if (jSONValue4 == null || jSONValue4.isNull()) {
                throw new C5598(c0658.f2546, c0658.f2540);
            }
            if (jSONValue4.isArray()) {
                for (JSONValue jSONValue5 : jSONValue4.asArray()) {
                    if (!jSONValue5.isObject()) {
                        throw new C5598(c0658.f2546, c0658.f2540);
                    }
                    JSONObject jSONObjectAsObject = jSONValue5.asObject();
                    c0658.f2544.add(new C19710(jSONObjectAsObject.getString("entryName", null), jSONObjectAsObject.getString(c.a, null), jSONObjectAsObject.getString(d.O, null), jSONObjectAsObject.getString("indexCachePath", null)));
                }
                return c0658;
            }
            throw new C5598(c0658.f2546, c0658.f2540);
        }
        throw new C5598(c0658.f2546, c0658.f2540);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22040(C0658 c0658) throws C3059 {
        String str = c0658.f2543;
        AbstractC15440 abstractC15440 = c0658.f2547;
        if (!"absent".equals(str) && !"available".equals(str) && !"extract_error".equals(str) && !"parse_error".equals(str)) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
        if (!abstractC15440.m36526("original.apk").mo23119()) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
        for (C19710 c19710 : c0658.f2544) {
            String str2 = c19710.f63672;
            String str3 = c19710.f63669;
            if (!"available".equals(str2) && !d.O.equals(str2) && !"skipped".equals(str2)) {
                throw C18081.m42149(c0658.f2546, c0658.f2540);
            }
            if ("available".equals(c19710.f63672) && (str3 == null || !abstractC15440.m36526("entries").m36526(str3).mo23119() || !m22044(abstractC15440, str3).mo23119())) {
                throw C18081.m42149(c0658.f2546, c0658.f2540);
            }
        }
        if (("available".equals(c0658.f2543) || "parse_error".equals(c0658.f2543)) && !abstractC15440.m36526("entries").m36526("resources.arsc").mo23119()) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22043(AbstractC15440 abstractC15440, C0658 c0658) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (C19710 c19710 : c0658.f2544) {
            jSONArrayArray.add(JSON.object().add("entryName", c19710.f63669).add(c.a, c19710.f63672).add(d.O, c19710.f63670).add("indexCachePath", c19710.f63671));
        }
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("workspaceId", c0658.f2550).add("temporary", c0658.f2540).add("sourcePath", c0658.f2546).add("sourceSize", c0658.f2539).add("sourceLastModified", c0658.f2542).add("originalSha256", c0658.f2548).add("createdAt", c0658.f2538).add("lastAccessedAt", c0658.f2549).add("dexFiles", jSONArrayArray).add("resourceStatus", c0658.f2543).add("resourceError", c0658.f2545);
        if ("available".equals(c0658.f2543) && (str = c0658.f2551) != null && c0658.f2552 >= 0) {
            jSONObjectAdd.add("resourceSha256", str);
            jSONObjectAdd.add("resourceLength", c0658.f2552);
        }
        m22042(abstractC15440, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m22046(AbstractC15440 abstractC15440) throws IOException {
        try {
            MessageDigest messageDigestM34534 = C14460.m34534();
            C14460.m34527(messageDigestM34534, abstractC15440.mo27926());
            return C14460.m34531(messageDigestM34534.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
