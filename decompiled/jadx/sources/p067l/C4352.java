package p067l;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֫᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A734 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4352 {

    /* JADX INFO: renamed from: ۧ */
    public final int f9744;

    /* JADX INFO: renamed from: ܽ */
    public final String f9745;

    /* JADX INFO: renamed from: ܿ */
    public C9046 f9746;

    /* JADX INFO: renamed from: ֫ */
    public final TreeSet f9743 = new TreeSet();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f9747 = new ArrayList();

    public C4352(int i, String str, C9046 c9046) {
        this.f9744 = i;
        this.f9745 = str;
        this.f9746 = c9046;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5023 m8991(long j, long j2) {
        long j3;
        C5023 c5023 = new C5023(this.f9745, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f9743;
        C5023 c5024 = (C5023) treeSet.floor(c5023);
        if (c5024 != null && c5024.f76935 + c5024.f76933 > j) {
            return c5024;
        }
        C5023 c5025 = (C5023) treeSet.ceiling(c5023);
        if (c5025 != null) {
            long j4 = c5025.f76935 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new C5023(this.f9745, j, j3, -9223372036854775807L, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9046 m8985() {
        return this.f9746;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8989(C25139 c25139) {
        C9046 c9046 = this.f9746;
        C9046 c9046M20952 = c9046.m20952(c25139);
        this.f9746 = c9046M20952;
        return !c9046M20952.equals(c9046);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m8994() {
        return this.f9747.isEmpty();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8993(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9747;
            if (i >= arrayList.size()) {
                return false;
            }
            C9536 c9536 = (C9536) arrayList.get(i);
            long j3 = c9536.f26221;
            long j4 = c9536.f26220;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m8995(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9747;
            if (i < arrayList.size()) {
                C9536 c9536 = (C9536) arrayList.get(i);
                long j3 = c9536.f26221;
                if (j3 <= j) {
                    long j4 = c9536.f26220;
                    if (j4 == -1 || j3 + j4 > j) {
                        return false;
                    }
                    i++;
                } else {
                    if (j2 == -1 || j + j2 > j3) {
                        return false;
                    }
                    i++;
                }
            } else {
                arrayList.add(new C9536(j, j2));
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8986(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9747;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C9536) arrayList.get(i)).f26221 == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8987(C5023 c5023) {
        this.f9743.add(c5023);
    }

    /* JADX INFO: renamed from: ۧ */
    public final TreeSet m8990() {
        return this.f9743;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m8983(long j, long j2) {
        C23877.m52957(j >= 0);
        C23877.m52957(j2 >= 0);
        C5023 c5023M8991 = m8991(j, j2);
        long j3 = c5023M8991.f76933;
        boolean z = c5023M8991.f76938;
        long j4 = C14849.FOREVER_NS;
        if (!z) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long jMax = c5023M8991.f76935 + j3;
        if (jMax < j4) {
            for (C5023 c5023 : this.f9743.tailSet(c5023M8991, false)) {
                long j6 = c5023.f76935;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + c5023.f76933);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5023 m8984(C5023 c5023, long j, boolean z) {
        File file;
        TreeSet treeSet = this.f9743;
        C23877.m52960(treeSet.remove(c5023));
        File file2 = c5023.f76937;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM10689 = C5023.m10689(parentFile, this.f9744, c5023.f76935, j);
            if (file2.renameTo(fileM10689)) {
                file = fileM10689;
            } else {
                C21334.m48351("Failed to rename " + file2 + " to " + fileM10689);
                file = file2;
            }
        } else {
            file = file2;
        }
        C23877.m52960(c5023.f76938);
        C5023 c5024 = new C5023(c5023.f76936, c5023.f76935, c5023.f76933, j, file);
        treeSet.add(c5024);
        return c5024;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8992() {
        return this.f9743.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8988(C24288 c24288) {
        if (!this.f9743.remove(c24288)) {
            return false;
        }
        File file = c24288.f76937;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final int hashCode() {
        return this.f9746.hashCode() + C12832.m29411(this.f9744 * 31, 31, this.f9745);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4352.class == obj.getClass()) {
            C4352 c4352 = (C4352) obj;
            if (this.f9744 == c4352.f9744 && this.f9745.equals(c4352.f9745) && this.f9743.equals(c4352.f9743) && this.f9746.equals(c4352.f9746)) {
                return true;
            }
        }
        return false;
    }
}
