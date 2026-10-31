package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A52J */
/* JADX INFO: loaded from: classes2.dex */
public class C6847 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f21189;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6847 m18531(String str) {
        return new C6847(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6847 m18530() {
        return new C6847(String.valueOf(','));
    }

    public C6847(String str) {
        str.getClass();
        this.f21189 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18534(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m18532(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f21189);
                    sb.append(m18532(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m18533(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        m18534(sb, it);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence m18532(Object obj) {
        C11003.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
