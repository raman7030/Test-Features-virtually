package l;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֫᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A734 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2087 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6960;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f6961;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7026 f6962;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeSet f6959 = new TreeSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6963 = new ArrayList();

    public C2087(int i, String str, C7026 c7026) {
        this.f6960 = i;
        this.f6961 = str;
        this.f6962 = c7026;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2793 m6865(long j, long j2) {
        long j3;
        C2793 c2793 = new C2793(this.f6961, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f6959;
        C2793 c2794 = (C2793) treeSet.floor(c2793);
        if (c2794 != null && c2794.f74190 + c2794.f74188 > j) {
            return c2794;
        }
        C2793 c2795 = (C2793) treeSet.ceiling(c2793);
        if (c2795 != null) {
            long j4 = c2795.f74190 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j2 = Math.min(j4, j2);
                j3 = j2;
            }
        } else {
            j3 = j2;
        }
        return new C2793(this.f6961, j, j3, -9223372036854775807L, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7026 m6859() {
        return this.f6962;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6863(C23959 c23959) {
        C7026 c7026 = this.f6962;
        C7026 c7026M18995 = c7026.m18995(c23959);
        this.f6962 = c7026M18995;
        return !c7026M18995.equals(c7026);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m6868() {
        return this.f6963.isEmpty();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6867(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6963;
            if (i >= arrayList.size()) {
                return false;
            }
            C7542 c7542 = (C7542) arrayList.get(i);
            long j3 = c7542.f23308;
            long j4 = c7542.f23307;
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m6869(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6963;
            if (i < arrayList.size()) {
                C7542 c7542 = (C7542) arrayList.get(i);
                long j3 = c7542.f23308;
                if (j3 <= j) {
                    long j4 = c7542.f23307;
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
                arrayList.add(new C7542(j, j2));
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6860(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6963;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C7542) arrayList.get(i)).f23308 == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6861(C2793 c2793) {
        this.f6959.add(c2793);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TreeSet m6864() {
        return this.f6959;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m6857(long j, long j2) {
        C22632.m50631(j >= 0);
        C22632.m50631(j2 >= 0);
        C2793 c2793M6865 = m6865(j, j2);
        long j3 = c2793M6865.f74188;
        boolean z = c2793M6865.f74193;
        long j4 = C13132.FOREVER_NS;
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
        long jMax = c2793M6865.f74190 + j3;
        if (jMax < j4) {
            for (C2793 c2793 : this.f6959.tailSet(c2793M6865, false)) {
                long j6 = c2793.f74190;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + c2793.f74188);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2793 m6858(C2793 c2793, long j, boolean z) {
        File file;
        TreeSet treeSet = this.f6959;
        C22632.m50634(treeSet.remove(c2793));
        File file2 = c2793.f74192;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM8629 = C2793.m8629(parentFile, this.f6960, c2793.f74190, j);
            if (file2.renameTo(fileM8629)) {
                file = fileM8629;
            } else {
                C19956.m46037("Failed to rename " + file2 + " to " + fileM8629);
                file = file2;
            }
        } else {
            file = file2;
        }
        C22632.m50634(c2793.f74193);
        C2793 c2794 = new C2793(c2793.f74191, c2793.f74190, c2793.f74188, j, file);
        treeSet.add(c2794);
        return c2794;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m6866() {
        return this.f6959.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6862(C23064 c23064) {
        if (!this.f6959.remove(c23064)) {
            return false;
        }
        File file = c23064.f74192;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final int hashCode() {
        return this.f6962.hashCode() + C11010.m27349(this.f6960 * 31, 31, this.f6961);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2087.class == obj.getClass()) {
            C2087 c2087 = (C2087) obj;
            if (this.f6960 == c2087.f6960 && this.f6961.equals(c2087.f6961) && this.f6959.equals(c2087.f6959) && this.f6962.equals(c2087.f6962)) {
                return true;
            }
        }
        return false;
    }
}
