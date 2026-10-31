package l;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ᩴܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ASR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18809 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11753 f59356;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f59357;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59358;

    /* JADX INFO: renamed from: ֫ */
    public void mo1327(int i, int i2) {
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo24565(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo1328(C19515 c19515, int i, int i2) {
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public abstract String[] mo1329();

    /* JADX INFO: renamed from: ܳ */
    public abstract String[] mo4239();

    /* JADX INFO: renamed from: ܽ */
    public abstract C21631 mo1330();

    public AbstractC18809() {
        C3992 c3992 = new C3992();
        c3992.add(C11048.f33221);
        this.f59357 = c3992;
        this.f59358 = -1;
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: ᩷ */
    public C15279 mo1331() {
        String[] strArrMo1329 = mo1329();
        if (strArrMo1329 != null) {
            C15279 c15279 = C15279.f46873;
            if (strArrMo1329.length != 0) {
                String[] strArr = (String[]) Arrays.copyOf(strArrMo1329, strArrMo1329.length);
                String[] strArr2 = (String[]) Arrays.copyOf(strArrMo1329, strArrMo1329.length);
                for (int i = 0; i < strArrMo1329.length; i++) {
                    String str = strArrMo1329[i];
                    if (str != null) {
                        if (!str.isEmpty()) {
                            char cCharAt = str.charAt(0);
                            if (cCharAt == '\'') {
                                strArr2[i] = null;
                            } else if (Character.isUpperCase(cCharAt)) {
                                strArr[i] = null;
                            } else {
                                strArr[i] = null;
                                strArr2[i] = null;
                            }
                        } else {
                            strArr[i] = null;
                            strArr2[i] = null;
                        }
                    }
                }
                return new C15279(strArr, strArr2, strArrMo1329);
            }
        }
        return C15279.f46873;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC11753 m43460() {
        return this.f59356;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43457(AbstractC11753 abstractC11753) {
        this.f59356 = abstractC11753;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43456(C6192 c6192) {
        ((CopyOnWriteArrayList) this.f59357).add(c6192);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m43458() {
        ((CopyOnWriteArrayList) this.f59357).clear();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15985 m43461() {
        return new C15985(this.f59357);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43462() {
        return this.f59358;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43459(int i) {
        this.f59358 = i;
    }
}
