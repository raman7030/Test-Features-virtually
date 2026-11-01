package p067l;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7988 implements InterfaceC9329 {

    /* JADX INFO: renamed from: ܽ */
    public static final HashSet f21000 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final String f21001;

    /* JADX INFO: renamed from: ۧ */
    public final String f21002;

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo11485();

    public AbstractC7988(String str, String str2) {
        this.f21002 = str;
        this.f21001 = str2;
        f21000.add(this);
    }

    @Override // p067l.InterfaceC9329
    /* JADX INFO: renamed from: ֫ */
    public final String mo18498() {
        return this.f21002;
    }

    @Override // p067l.InterfaceC9329
    public final boolean isSupported() {
        return mo11485() || mo18499();
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo18499() {
        HashSet hashSet = C16704.f49192;
        String str = this.f21001;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Set m18497() {
        return C21562.unmodifiableSet(f21000);
    }
}
