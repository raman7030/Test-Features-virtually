package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩵ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeMap f60524;

    public C19222(TreeMap treeMap) throws IOException {
        this.f60524 = treeMap;
        if (!(treeMap.get("filePath") instanceof String)) {
            throw new IOException("Legacy config has no source path");
        }
        if (treeMap.containsKey("pageMode") && !(treeMap.get("pageMode") instanceof Boolean)) {
            throw new IOException("Invalid legacy page mode");
        }
        if (m44357()) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19222 m44353(int i, Bundle bundle) throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (str == null || (obj != null && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long))) {
                    throw new IOException("Unsupported legacy config value type");
                }
                treeMap.put(str, obj);
            }
            C19222 c19222 = new C19222(treeMap);
            c19222.m44354(i);
            return c19222;
        } catch (RuntimeException e) {
            throw new IOException("Invalid legacy fragment values", e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44357() {
        return Boolean.TRUE.equals(this.f60524.get("pageMode"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44359() {
        if (m44357()) {
            return ((Integer) this.f60524.get("pageCount")).intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44355() {
        if (m44357()) {
            return ((Integer) this.f60524.get("currentPageIndex")).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle m44358() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f60524.entrySet()) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m44356(int i) {
        C10130 c10130 = new C10130(m44354(i));
        c10130.writeInt(1295140419);
        c10130.writeInt(1);
        TreeMap treeMap = this.f60524;
        c10130.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            c10130.writeInt(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                c10130.mo13231(str.charAt(i2));
            }
            Object value = entry.getValue();
            if (value == null) {
                c10130.writeByte(0);
            } else if (!(value instanceof String)) {
                if (value instanceof Boolean) {
                    c10130.writeByte(2);
                    c10130.m25425(((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    c10130.writeByte(3);
                    c10130.writeInt(((Integer) value).intValue());
                } else {
                    c10130.writeByte(4);
                    c10130.m25431(((Long) value).longValue());
                }
            } else {
                String str2 = (String) value;
                c10130.writeByte(1);
                c10130.writeInt(str2.length());
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    c10130.mo13231(str2.charAt(i3));
                }
            }
        }
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19222 m44352(int i, long j, InputStream inputStream) throws IOException {
        Object objM52700;
        C23930 c23930M52696 = C23930.m52696(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
            if (c23930M52696.readInt() != 1295140419 || c23930M52696.readInt() != 1) {
                throw new IOException("Unsupported fragment config format");
            }
            int i2 = c23930M52696.readInt();
            if (i2 < 0 || i2 > c23930M52696.m52707() / 5) {
                throw new IOException("Invalid fragment config entry count");
            }
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String strM52700 = c23930M52696.m52700(i);
                if (treeMap.containsKey(strM52700)) {
                    throw new IOException("Duplicate fragment config key");
                }
                int i4 = c23930M52696.readByte();
                if (i4 == 0) {
                    objM52700 = null;
                } else if (i4 == 1) {
                    objM52700 = c23930M52696.m52700(i);
                } else if (i4 == 2) {
                    int i5 = c23930M52696.readByte();
                    if (i5 != 0 && i5 != 255) {
                        throw new IOException("Invalid fragment config boolean");
                    }
                    objM52700 = Boolean.valueOf(i5 != 0);
                } else if (i4 == 3) {
                    objM52700 = Integer.valueOf(c23930M52696.readInt());
                } else if (i4 == 4) {
                    objM52700 = Long.valueOf(c23930M52696.readLong());
                } else {
                    throw new IOException("Unsupported fragment config value");
                }
                treeMap.put(strM52700, objM52700);
            }
            c23930M52696.m52709();
            C19222 c19222 = new C19222(treeMap);
            c23930M52696.close();
            return c19222;
        } catch (Throwable th) {
            try {
                c23930M52696.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m44354(int i) throws IOException {
        long j;
        long jM21450 = 12;
        for (Map.Entry entry : this.f60524.entrySet()) {
            long jM21451 = C8083.m21450(((String) entry.getKey()).length(), 2L, 5L, jM21450);
            Object value = entry.getValue();
            if (value instanceof String) {
                jM21450 = C8083.m21450(((String) value).length(), 2L, 4L, jM21451);
            } else {
                if (!(value instanceof Boolean)) {
                    if (value instanceof Integer) {
                        jM21451 += 4;
                    } else {
                        j = value instanceof Long ? 8L : 1L;
                    }
                    jM21450 = jM21451;
                }
                jM21451 += j;
                jM21450 = jM21451;
            }
            if (jM21450 > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
        }
        if (jM21450 <= i) {
            return (int) jM21450;
        }
        throw new IOException("Fragment config exceeds app state limit");
    }
}
