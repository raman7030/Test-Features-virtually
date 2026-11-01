package p067l;

import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩵ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20637 {

    /* JADX INFO: renamed from: ֫ */
    public final TreeMap f63755;

    public C20637(TreeMap treeMap) throws IOException {
        this.f63755 = treeMap;
        if (!(treeMap.get("filePath") instanceof String)) {
            throw new IOException("Legacy config has no source path");
        }
        if (treeMap.containsKey("pageMode") && !(treeMap.get("pageMode") instanceof Boolean)) {
            throw new IOException("Invalid legacy page mode");
        }
        if (m46651()) {
            Object obj = treeMap.get("pageCount");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() >= 1 && num.intValue() <= 1024) {
                    Object obj2 = treeMap.get("currentPageIndex");
                    if (obj2 instanceof Integer) {
                        Integer num2 = (Integer) obj2;
                        if (num2.intValue() >= 0 && num2.intValue() < num.intValue()) {
                            return;
                        }
                    }
                }
            }
            throw new IOException("Invalid legacy page manifest");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20637 m46647(int i, Bundle bundle) throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (str == null || (obj != null && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long))) {
                    throw new IOException("Unsupported legacy config value type");
                }
                treeMap.put(str, obj);
            }
            C20637 c20637 = new C20637(treeMap);
            c20637.m46648(i);
            return c20637;
        } catch (RuntimeException e) {
            throw new IOException("Invalid legacy fragment values", e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46651() {
        return Boolean.TRUE.equals(this.f63755.get("pageMode"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m46653() {
        if (m46651()) {
            return ((Integer) this.f63755.get("pageCount")).intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46649() {
        if (m46651()) {
            return ((Integer) this.f63755.get("currentPageIndex")).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Bundle m46652() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f63755.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (value instanceof String)) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else {
                bundle.putLong(str, ((Long) value).longValue());
            }
        }
        bundle.remove("pageMode");
        bundle.remove("pageCount");
        bundle.remove("currentPageIndex");
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m46650(int i) {
        C11996 c11996 = new C11996(m46648(i));
        c11996.writeInt(1295140419);
        c11996.writeInt(1);
        TreeMap treeMap = this.f63755;
        c11996.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            c11996.writeInt(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                c11996.mo15113(str.charAt(i2));
            }
            Object value = entry.getValue();
            if (value == null) {
                c11996.writeByte(0);
            } else if (!(value instanceof String)) {
                if (value instanceof Boolean) {
                    c11996.writeByte(2);
                    c11996.m27445(((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    c11996.writeByte(3);
                    c11996.writeInt(((Integer) value).intValue());
                } else {
                    c11996.writeByte(4);
                    c11996.m27451(((Long) value).longValue());
                }
            } else {
                String str2 = (String) value;
                c11996.writeByte(1);
                c11996.writeInt(str2.length());
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    c11996.mo15113(str2.charAt(i3));
                }
            }
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20637 m46646(int i, long j, InputStream inputStream) throws IOException {
        Object objM55106;
        C25112 c25112M55102 = C25112.m55102(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
            if (c25112M55102.readInt() != 1295140419 || c25112M55102.readInt() != 1) {
                throw new IOException("Unsupported fragment config format");
            }
            int i2 = c25112M55102.readInt();
            if (i2 < 0 || i2 > c25112M55102.m55113() / 5) {
                throw new IOException("Invalid fragment config entry count");
            }
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String strM55106 = c25112M55102.m55106(i);
                if (treeMap.containsKey(strM55106)) {
                    throw new IOException("Duplicate fragment config key");
                }
                int i4 = c25112M55102.readByte();
                if (i4 == 0) {
                    objM55106 = null;
                } else if (i4 == 1) {
                    objM55106 = c25112M55102.m55106(i);
                } else if (i4 == 2) {
                    int i5 = c25112M55102.readByte();
                    if (i5 != 0 && i5 != 255) {
                        throw new IOException("Invalid fragment config boolean");
                    }
                    objM55106 = Boolean.valueOf(i5 != 0);
                } else if (i4 == 3) {
                    objM55106 = Integer.valueOf(c25112M55102.readInt());
                } else if (i4 == 4) {
                    objM55106 = Long.valueOf(c25112M55102.readLong());
                } else {
                    throw new IOException("Unsupported fragment config value");
                }
                treeMap.put(strM55106, objM55106);
            }
            c25112M55102.m55115();
            C20637 c20637 = new C20637(treeMap);
            c25112M55102.close();
            return c20637;
        } catch (Throwable th) {
            try {
                c25112M55102.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m46648(int i) throws IOException {
        long j;
        long jM23418 = 12;
        for (Map.Entry entry : this.f63755.entrySet()) {
            long jM23419 = C10050.m23418(((String) entry.getKey()).length(), 2L, 5L, jM23418);
            Object value = entry.getValue();
            if (value instanceof String) {
                jM23418 = C10050.m23418(((String) value).length(), 2L, 4L, jM23419);
            } else {
                if (!(value instanceof Boolean)) {
                    if (value instanceof Integer) {
                        jM23419 += 4;
                    } else {
                        j = value instanceof Long ? 8L : 1L;
                    }
                    jM23418 = jM23419;
                }
                jM23419 += j;
                jM23418 = jM23419;
            }
            if (jM23418 > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
        }
        if (jM23418 <= i) {
            return (int) jM23418;
        }
        throw new IOException("Fragment config exceeds app state limit");
    }
}
