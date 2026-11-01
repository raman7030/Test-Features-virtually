package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.Attributes;

/* JADX INFO: renamed from: l.ᩳܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1VO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19648 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f59773 = {C0698cb.f2569k, 10};

    /* JADX INFO: renamed from: ֫ */
    public static void m44670(ByteArrayOutputStream byteArrayOutputStream, String str, Attributes attributes) throws IOException {
        m44672(byteArrayOutputStream, "Name", str);
        if (!attributes.isEmpty()) {
            m44673(byteArrayOutputStream, m44668(attributes));
        }
        byteArrayOutputStream.write(f59773);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44669(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(f59773);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44671(ByteArrayOutputStream byteArrayOutputStream, Attributes.Name name, String str) throws IOException {
        m44672(byteArrayOutputStream, name.toString(), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44672(OutputStream outputStream, String str, String str2) throws IOException {
        int iMin;
        byte[] bytes = C24104.m53357(str, ": ", str2).getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = f59773;
            if (length <= 0) {
                outputStream.write(bArr);
                return;
            }
            if (z) {
                iMin = Math.min(length, 70);
            } else {
                outputStream.write(bArr);
                outputStream.write(32);
                iMin = Math.min(length, 69);
            }
            outputStream.write(bytes, i, iMin);
            i += iMin;
            length -= iMin;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static TreeMap m44668(Attributes attributes) {
        Set<Map.Entry<Object, Object>> setEntrySet = attributes.entrySet();
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Object, Object> entry : setEntrySet) {
            treeMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44673(OutputStream outputStream, TreeMap treeMap) throws IOException {
        for (Map.Entry entry : treeMap.entrySet()) {
            m44672(outputStream, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
