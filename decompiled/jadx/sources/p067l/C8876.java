package p067l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A52J */
/* JADX INFO: loaded from: classes2.dex */
public class C8876 {

    /* JADX INFO: renamed from: ֫ */
    public final String f24067;

    /* JADX INFO: renamed from: ֫ */
    public static C8876 m20480(String str) {
        return new C8876(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8876 m20479() {
        return new C8876(String.valueOf(','));
    }

    public C8876(String str) {
        str.getClass();
        this.f24067 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20483(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m20481(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f24067);
                    sb.append(m20481(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m20482(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        m20483(sb, it);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public CharSequence m20481(Object obj) {
        C12826.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
