package p067l;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 874P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9046 implements InterfaceC16421 {

    /* JADX INFO: renamed from: ܽ */
    public static final C9046 f24551 = new C9046(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: ֫ */
    public int f24552;

    /* JADX INFO: renamed from: ۧ */
    public final Map f24553;

    public C9046() {
        this(Collections.EMPTY_MAP);
    }

    public C9046(Map map) {
        this.f24553 = C21562.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m20951() {
        return this.f24553.entrySet();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m20954(String str) {
        byte[] bArr = (byte[]) this.f24553.get(str);
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m20950(long j, String str) {
        byte[] bArr = (byte[]) this.f24553.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20953(String str) {
        return this.f24553.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9046.class != obj.getClass()) {
            return false;
        }
        return m20949(this.f24553, ((C9046) obj).f24553);
    }

    public final int hashCode() {
        if (this.f24552 == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f24553.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f24552 = iHashCode;
        }
        return this.f24552;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20949(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9046 m20952(C25139 c25139) {
        byte[] bytes;
        Map map = this.f24553;
        HashMap map2 = new HashMap(map);
        List listM55197 = c25139.m55197();
        for (int i = 0; i < listM55197.size(); i++) {
            map2.remove(listM55197.get(i));
        }
        for (Map.Entry entry : c25139.m55193().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(StandardCharsets.UTF_8);
            } else if (value instanceof byte[]) {
                bytes = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            map2.put(str, bytes);
        }
        return m20949(map, map2) ? this : new C9046(map2);
    }
}
