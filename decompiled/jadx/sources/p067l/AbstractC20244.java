package p067l;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ᩴܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ASR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20244 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC13538 f62583;

    /* JADX INFO: renamed from: ۧ */
    public List f62584;

    /* JADX INFO: renamed from: ܽ */
    public int f62585;

    /* JADX INFO: renamed from: ֫ */
    public void mo3735(int i, int i2) {
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo26579(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo3736(C20915 c20915, int i, int i2) {
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public abstract String[] mo3737();

    /* JADX INFO: renamed from: ܳ */
    public abstract String[] mo6483();

    /* JADX INFO: renamed from: ܽ */
    public abstract C22926 mo3738();

    public AbstractC20244() {
        C6162 c6162 = new C6162();
        c6162.add(C12868.f36222);
        this.f62584 = c6162;
        this.f62585 = -1;
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: ᩷ */
    public C16889 mo3739() {
        String[] strArrMo3737 = mo3737();
        if (strArrMo3737 != null) {
            C16889 c16889 = C16889.f50000;
            if (strArrMo3737.length != 0) {
                String[] strArr = (String[]) Arrays.copyOf(strArrMo3737, strArrMo3737.length);
                String[] strArr2 = (String[]) Arrays.copyOf(strArrMo3737, strArrMo3737.length);
                for (int i = 0; i < strArrMo3737.length; i++) {
                    String str = strArrMo3737[i];
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
                return new C16889(strArr, strArr2, strArrMo3737);
            }
        }
        return C16889.f50000;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13538 m45729() {
        return this.f62583;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45726(AbstractC13538 abstractC13538) {
        this.f62583 = abstractC13538;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45725(C8253 c8253) {
        ((CopyOnWriteArrayList) this.f62584).add(c8253);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m45727() {
        ((CopyOnWriteArrayList) this.f62584).clear();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17560 m45730() {
        return new C17560(this.f62584);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m45731() {
        return this.f62585;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45728(int i) {
        this.f62585 = i;
    }
}
