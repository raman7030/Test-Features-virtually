package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19149 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f57216;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f57218 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f57217 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C19820 m43629(String str) {
        HashMap map = this.f57217;
        C19820 c19820 = (C19820) map.get(str);
        if (c19820 != null) {
            return c19820;
        }
        C19820 c19821 = new C19820(str, -1);
        map.put(str, c19821);
        return c19821;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19820 m43628(int i, String str) {
        if (i == 0) {
            return m43629(str);
        }
        String str2 = i + "-" + str;
        HashMap map = this.f57218;
        C19820 c19820 = (C19820) map.get(str2);
        if (c19820 != null) {
            return c19820;
        }
        C19820 c19821 = new C19820(str, i);
        map.put(str2, c19821);
        return c19821;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14971 m43627(boolean z) {
        final ArrayList arrayList = new ArrayList();
        HashMap map = this.f57218;
        final C17441 c17441 = new C17441(map.size());
        C7480.stream(map.values()).sorted().forEach(new Consumer() { // from class: l.ۧ᩺ۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C19820 c19820 = (C19820) obj;
                arrayList.add(c19820);
                c17441.add(c19820.f60275);
            }
        });
        this.f57216 = c17441.mo5873();
        C7480.stream(this.f57217.values()).sorted().forEach(new Consumer() { // from class: l.ܽ᩺ۡ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                arrayList.add((C19820) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
        C14971 c14971 = new C14971();
        c14971.m34280(z);
        for (int i = 0; i < arrayList.size(); i++) {
            C19820 c19820 = (C19820) arrayList.get(i);
            c19820.f60276 = i;
            c14971.m34281(c19820.f60274);
        }
        return c14971;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m43630() {
        int[] iArr = this.f57216;
        if (iArr != null) {
            return iArr;
        }
        throw new IllegalStateException();
    }
}
