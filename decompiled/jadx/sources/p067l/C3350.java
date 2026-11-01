package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.IDEAEngine;

/* JADX INFO: renamed from: l.֨ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3350 {

    /* JADX INFO: renamed from: ֫ */
    public final File f6550;

    public C3350(File file) {
        this.f6550 = file;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m5859() {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f6550);
                try {
                    byte[] bArr = new byte[IDEAEngine.BASE];
                    int i = 0;
                    while (i < 65537) {
                        int i2 = fileInputStream.read(bArr, i, IDEAEngine.BASE - i);
                        if (i2 == -1) {
                            break;
                        }
                        i += i2;
                    }
                    if (i > 65536) {
                        throw new IOException("MCP credential store is too large");
                    }
                    CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                    JSONObject jSONObjectAsObject = JSON.parse(charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)).toString()).asObject();
                    m5858(jSONObjectAsObject, "version", "credentials");
                    String string = jSONObjectAsObject.get("version").toString();
                    if (!"1".equals(string) && !"2".equals(string)) {
                        throw new IOException("Unsupported MCP credential store version");
                    }
                    JSONArray jSONArrayAsArray = jSONObjectAsObject.get("credentials").asArray();
                    if (jSONArrayAsArray.size() > 32) {
                        throw new IOException("Too many MCP credentials");
                    }
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Iterator it = jSONArrayAsArray.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject2 = ((JSONValue) it.next()).asObject();
                        if ("1".equals(string)) {
                            m5858(jSONObjectAsObject2, "credentialId", "clientName", "digest", "createdAt", "lastUsedAt", "lastIp");
                        } else {
                            m5858(jSONObjectAsObject2, "credentialId", "clientName", "digest", "token", "createdAt", "lastUsedAt", "lastIp");
                        }
                        String strAsString = jSONObjectAsObject2.get("credentialId").asString();
                        String strAsString2 = jSONObjectAsObject2.get("clientName").asString();
                        String strAsString3 = jSONObjectAsObject2.get("digest").asString();
                        String strAsString4 = jSONObjectAsObject2.get("lastIp").asString();
                        long jAsLong = jSONObjectAsObject2.get("createdAt").asLong();
                        long jAsLong2 = jSONObjectAsObject2.get("lastUsedAt").asLong();
                        C7374.m17086(strAsString2);
                        if (!C7374.m17083(16, strAsString) || !hashSet.add(strAsString) || strAsString3.length() != 64 || jAsLong < 0 || jAsLong2 < 0 || strAsString4.length() > 128) {
                            throw new IOException("Invalid MCP credential metadata");
                        }
                        for (int i3 = 0; i3 < strAsString3.length(); i3++) {
                            char cCharAt = strAsString3.charAt(i3);
                            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                                throw new IOException("Invalid MCP credential digest");
                            }
                        }
                        String strAsString5 = "1".equals(string) ? "" : jSONObjectAsObject2.get("token").asString();
                        if (!strAsString5.isEmpty() && !C7374.m17084(strAsString5, strAsString, strAsString3)) {
                            throw new IOException("Invalid MCP credential token");
                        }
                        arrayList.add(new C20115(strAsString, strAsString2, strAsString3, strAsString5, jAsLong, jAsLong2, strAsString4));
                    }
                    fileInputStream.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RuntimeException unused) {
                throw new IOException("Invalid MCP credential store");
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5860(ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add(((C20115) it.next()).m45558());
        }
        byte[] bytes = JSON.object().add("version", 2).add("credentials", jSONArrayArray).toString().getBytes(StandardCharsets.UTF_8);
        File file = this.f6550;
        File parentFile = file.getParentFile();
        if (bytes.length > 65536 || parentFile == null || (!parentFile.isDirectory() && !parentFile.mkdirs())) {
            throw new IOException("Cannot prepare MCP credential store");
        }
        File file2 = new File(parentFile, file.getName() + ".tmp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Cannot publish MCP credential store");
                }
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (file2.exists()) {
                file2.delete();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5858(JSONObject jSONObject, String... strArr) throws IOException {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C12826.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C21562.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IOException("Invalid MCP credential store fields");
    }
}
