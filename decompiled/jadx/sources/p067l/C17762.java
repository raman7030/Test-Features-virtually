package p067l;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܺ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17762 implements InterfaceC22948 {

    /* JADX INFO: renamed from: ۡ */
    public static final HashSet f53041 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final File f53042;

    /* JADX INFO: renamed from: ۜ */
    public boolean f53043;

    /* JADX INFO: renamed from: ۢ */
    public long f53044;

    /* JADX INFO: renamed from: ۧ */
    public final C19104 f53045;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f53046;

    /* JADX INFO: renamed from: ܽ */
    public final C22458 f53047;

    /* JADX INFO: renamed from: ܿ */
    public C10207 f53048;

    /* JADX INFO: renamed from: ᩳ */
    public final C8195 f53049;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f53050;

    /* JADX INFO: renamed from: ᩻ */
    public final Random f53051;

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ֫ */
    public final synchronized File mo40350(String str, long j, long j2) {
        C4352 c4352M43407;
        File file;
        C23877.m52960(!this.f53043);
        m40352();
        c4352M43407 = this.f53045.m43407(str);
        c4352M43407.getClass();
        C23877.m52960(c4352M43407.m8993(j, j2));
        if (!this.f53042.exists()) {
            m40342(this.f53042);
            m40347();
        }
        this.f53047.m50421(this, j2);
        file = new File(this.f53042, Integer.toString(this.f53051.nextInt(10)));
        if (!file.exists()) {
            m40342(file);
        }
        return C5023.m10689(file, c4352M43407.f9744, j, System.currentTimeMillis());
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C9046 mo40351(String str) {
        C4352 c4352M43407;
        C23877.m52960(!this.f53043);
        c4352M43407 = this.f53045.m43407(str);
        return c4352M43407 != null ? c4352M43407.m8985() : C9046.f24551;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40352() {
        C10207 c10207 = this.f53048;
        if (c10207 != null) {
            throw c10207;
        }
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo40353(File file, long j) {
        boolean z = true;
        C23877.m52960(!this.f53043);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C5023 c5023M10690 = C5023.m10690(file, j, -9223372036854775807L, this.f53045);
            c5023M10690.getClass();
            C4352 c4352M43407 = this.f53045.m43407(c5023M10690.f76936);
            c4352M43407.getClass();
            C23877.m52960(c4352M43407.m8993(c5023M10690.f76935, c5023M10690.f76933));
            long jM34406 = C15033.m34406(c4352M43407.m8985());
            if (jM34406 != -1) {
                if (c5023M10690.f76935 + c5023M10690.f76933 > jM34406) {
                    z = false;
                }
                C23877.m52960(z);
            }
            if (this.f53049 == null) {
                m40344(c5023M10690);
                this.f53045.m43412();
                notifyAll();
                return;
            }
            try {
                this.f53049.m18985(file.getName(), c5023M10690.f76933, c5023M10690.f76934);
                m40344(c5023M10690);
                try {
                    this.f53045.m43412();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new C10207(e);
                }
            } catch (IOException e2) {
                throw new C10207(e2);
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo40354(String str, C25139 c25139) {
        C23877.m52960(!this.f53043);
        m40352();
        this.f53045.m43409(str, c25139);
        try {
            this.f53045.m43412();
        } catch (IOException e) {
            throw new C10207(e);
        }
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo40355(C24288 c24288) {
        C23877.m52960(!this.f53043);
        C4352 c4352M43407 = this.f53045.m43407(c24288.f76936);
        c4352M43407.getClass();
        c4352M43407.m8986(c24288.f76935);
        this.f53045.m43413(c4352M43407.f9745);
        notifyAll();
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ۧ */
    public final synchronized long mo40356(String str, long j, long j2) {
        long j3;
        long j4 = C14849.FOREVER_NS;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = j;
        j3 = 0;
        while (j6 < j4) {
            long jMo40364 = mo40364(str, j6, j4 - j6);
            if (jMo40364 > 0) {
                j3 += jMo40364;
            } else {
                jMo40364 = -jMo40364;
            }
            j6 += jMo40364;
        }
        return j3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized TreeSet m40357(String str) {
        C4352 c4352M43407;
        C23877.m52960(!this.f53043);
        c4352M43407 = this.f53045.m43407(str);
        return (c4352M43407 == null || c4352M43407.m8992()) ? new TreeSet() : new TreeSet((Collection) c4352M43407.m8990());
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m40358() {
        if (this.f53043) {
            return;
        }
        this.f53046.clear();
        m40347();
        try {
            try {
                this.f53045.m43412();
            } catch (IOException e) {
                C21334.m48348("Storing index file failed", e);
            }
            m40348(this.f53042);
            this.f53043 = true;
        } catch (Throwable th) {
            m40348(this.f53042);
            this.f53043 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m40359(C24288 c24288) {
        C23877.m52960(!this.f53043);
        m40349(c24288);
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized boolean m40360(String str, long j, long j2) {
        C4352 c4352M43407;
        C23877.m52960(!this.f53043);
        c4352M43407 = this.f53045.m43407(str);
        return c4352M43407 != null && c4352M43407.m8983(j, j2) >= j2;
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ܽ */
    public final synchronized C24288 mo40361(String str, long j, long j2) {
        C5023 c5023M8991;
        C23877.m52960(!this.f53043);
        m40352();
        C4352 c4352M43407 = this.f53045.m43407(str);
        if (c4352M43407 != null) {
            while (true) {
                c5023M8991 = c4352M43407.m8991(j, j2);
                if (!c5023M8991.f76938) {
                    break;
                }
                File file = c5023M8991.f76937;
                file.getClass();
                if (file.length() == c5023M8991.f76933) {
                    break;
                }
                m40347();
            }
        } else {
            c5023M8991 = new C5023(str, j, j2, -9223372036854775807L, null);
        }
        if (c5023M8991.f76938) {
            return m40340(str, c5023M8991);
        }
        if (this.f53045.m43410(str).m8995(j, c5023M8991.f76933)) {
            return c5023M8991;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m40362(String str) {
        C23877.m52960(!this.f53043);
        Iterator it = m40357(str).iterator();
        while (it.hasNext()) {
            m40349((C24288) it.next());
        }
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ܿ */
    public final synchronized C24288 mo40363(String str, long j, long j2) {
        C24288 c24288Mo40361;
        C23877.m52960(!this.f53043);
        m40352();
        while (true) {
            c24288Mo40361 = mo40361(str, j, j2);
            if (c24288Mo40361 == null) {
                wait();
            }
        }
        return c24288Mo40361;
    }

    @Override // p067l.InterfaceC22948
    /* JADX INFO: renamed from: ᩳ */
    public final synchronized long mo40364(String str, long j, long j2) {
        C4352 c4352M43407;
        C23877.m52960(!this.f53043);
        if (j2 == -1) {
            j2 = C14849.FOREVER_NS;
        }
        c4352M43407 = this.f53045.m43407(str);
        return c4352M43407 != null ? c4352M43407.m8983(j, j2) : -j2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized void m40348(File file) {
        f53041.remove(file.getAbsoluteFile());
    }

    public C17762(File file, C22458 c22458, C22083 c22083) {
        boolean zAdd;
        C19104 c19104 = new C19104(c22083, file);
        C8195 c8195 = new C8195(c22083);
        synchronized (C17762.class) {
            zAdd = f53041.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f53042 = file;
        this.f53047 = c22458;
        this.f53045 = c19104;
        this.f53049 = c8195;
        this.f53046 = new HashMap();
        this.f53051 = new Random();
        this.f53050 = true;
        this.f53044 = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C11058(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40346(C17762 c17762) {
        long j;
        C8195 c8195 = c17762.f53049;
        C19104 c19104 = c17762.f53045;
        File file = c17762.f53042;
        if (!file.exists()) {
            try {
                m40342(file);
            } catch (C10207 e) {
                c17762.f53048 = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            C21334.m48347(str);
            c17762.f53048 = new C10207(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    C21334.m48347("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        c17762.f53044 = j;
        if (j == -1) {
            try {
                c17762.f53044 = m40345(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                C21334.m48348(str2, e2);
                c17762.f53048 = new C10207(str2, e2);
                return;
            }
        }
        try {
            c19104.m43408(c17762.f53044);
            if (c8195 != null) {
                c8195.m18983(c17762.f53044);
                HashMap mapM18982 = c8195.m18982();
                c17762.m40343(file, true, fileArrListFiles, mapM18982);
                c8195.m18986(mapM18982.keySet());
            } else {
                c17762.m40343(file, true, fileArrListFiles, null);
            }
            c19104.m43411();
            try {
                c19104.m43412();
            } catch (IOException e3) {
                C21334.m48348("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            C21334.m48348(str3, e4);
            c17762.f53048 = new C10207(str3, e4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40343(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (!z || name.indexOf(46) != -1) {
                if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    C12219 c12219 = map != null ? (C12219) map.remove(name) : null;
                    if (c12219 != null) {
                        j2 = c12219.f34154;
                        j = c12219.f34153;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C5023 c5023M10690 = C5023.m10690(file2, j2, j, this.f53045);
                    if (c5023M10690 != null) {
                        m40344(c5023M10690);
                    } else {
                        file2.delete();
                    }
                }
            } else {
                m40343(file2, false, file2.listFiles(), map);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5023 m40340(String str, C5023 c5023) {
        boolean z;
        if (!this.f53050) {
            return c5023;
        }
        File file = c5023.f76937;
        file.getClass();
        String name = file.getName();
        long j = c5023.f76933;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C8195 c8195 = this.f53049;
        if (c8195 != null) {
            try {
                c8195.m18985(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                C21334.m48351("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C4352 c4352M43407 = this.f53045.m43407(str);
        c4352M43407.getClass();
        C5023 c5023M8984 = c4352M43407.m8984(c5023, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.f53046.get(c5023.f76936);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC16911) arrayList.get(size)).mo38484(this, c5023, c5023M8984);
            }
        }
        this.f53047.mo38484(this, c5023, c5023M8984);
        return c5023M8984;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40344(C5023 c5023) {
        String str = c5023.f76936;
        this.f53045.m43410(str).m8987(c5023);
        ArrayList arrayList = (ArrayList) this.f53046.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC16911) arrayList.get(size)).mo38483(this, c5023);
                }
            }
        }
        this.f53047.mo38483(this, c5023);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40349(C24288 c24288) {
        String str = c24288.f76936;
        C19104 c19104 = this.f53045;
        C4352 c4352M43407 = c19104.m43407(str);
        if (c4352M43407 == null || !c4352M43407.m8988(c24288)) {
            return;
        }
        C8195 c8195 = this.f53049;
        if (c8195 != null) {
            File file = c24288.f76937;
            file.getClass();
            String name = file.getName();
            try {
                c8195.m18984(name);
            } catch (IOException unused) {
                C6988.m16054("Failed to remove file index entry for: ", name);
            }
        }
        c19104.m43413(c4352M43407.f9745);
        ArrayList arrayList = (ArrayList) this.f53046.get(c24288.f76936);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC16911) arrayList.get(size)).mo38485(c24288);
                }
            }
        }
        this.f53047.mo38485(c24288);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40347() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f53045.m43406().iterator();
        while (it.hasNext()) {
            for (C24288 c24288 : ((C4352) it.next()).m8990()) {
                File file = c24288.f76937;
                file.getClass();
                if (file.length() != c24288.f76933) {
                    arrayList.add(c24288);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m40349((C24288) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m40345(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, C17588.m40053(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40342(File file) throws C10207 {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        C21334.m48347(str);
        throw new C10207(str);
    }
}
