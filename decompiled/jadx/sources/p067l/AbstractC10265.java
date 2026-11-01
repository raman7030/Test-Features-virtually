package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10265 {

    /* JADX INFO: renamed from: ֫ */
    public C8377 f28417;

    /* JADX INFO: renamed from: ۧ */
    public int f28418;

    /* JADX INFO: renamed from: ܳ */
    public Object f28419;

    /* JADX INFO: renamed from: ܽ */
    public boolean f28420;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f28421;

    /* JADX INFO: renamed from: ᩳ */
    public String f28422;

    /* JADX INFO: renamed from: ۧ */
    public Object mo23881(Object obj) {
        return obj;
    }

    public AbstractC10265(C8377 c8377, String str) {
        this.f28418 = 0;
        this.f28420 = false;
        this.f28422 = str;
        this.f28417 = c8377;
    }

    public AbstractC10265(C8377 c8377, String str, Object obj) {
        this(c8377, str);
        m23880(obj);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m23884() {
        this.f28418 = 0;
        this.f28420 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23880(Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList arrayList = this.f28421;
        if (arrayList != null) {
            arrayList.add(obj);
            return;
        }
        if (this.f28419 == null) {
            this.f28419 = obj;
            return;
        }
        ArrayList arrayList2 = new ArrayList(5);
        this.f28421 = arrayList2;
        arrayList2.add(this.f28419);
        this.f28419 = null;
        this.f28421.add(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m23882() {
        ArrayList arrayList;
        return (this.f28419 != null && this.f28418 < 1) || ((arrayList = this.f28421) != null && this.f28418 < arrayList.size());
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m23879() {
        int size = this.f28419 != null ? 1 : 0;
        ArrayList arrayList = this.f28421;
        if (arrayList != null) {
            size = arrayList.size();
        }
        String str = this.f28422;
        if (size == 0) {
            throw new C3559(str);
        }
        int i = this.f28418;
        if (i >= size) {
            if (size == 1) {
                return mo23881(this.f28419);
            }
            throw new C7583(str);
        }
        Object obj = this.f28419;
        if (obj != null) {
            this.f28418 = i + 1;
            return mo23881(obj);
        }
        Object objMo23881 = mo23881(this.f28421.get(i));
        this.f28418++;
        return objMo23881;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m23883() {
        int size = this.f28419 != null ? 1 : 0;
        ArrayList arrayList = this.f28421;
        if (arrayList != null) {
            size = arrayList.size();
        }
        if (this.f28420 || (this.f28418 >= size && size == 1)) {
            return ((C16969) this).f28417.m19528(m23879(), (Object) null);
        }
        return m23879();
    }
}
