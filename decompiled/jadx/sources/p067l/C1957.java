package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes.dex */
public final class C1957 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC1082 f75521;

    /* JADX INFO: renamed from: ᩸ */
    public int f75523;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f75524 = false;

    /* JADX INFO: renamed from: ᩶ */
    public int f75522 = -1;

    public C1957(AbstractC1082 abstractC1082) {
        this.f75521 = abstractC1082;
        this.f75523 = abstractC1082.mo14309() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75522 < this.f75523;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f75522++;
        this.f75524 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f75524) {
            throw new IllegalStateException();
        }
        this.f75521.mo14305(this.f75522);
        this.f75522--;
        this.f75523--;
        this.f75524 = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f75524) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f75521.mo14302(this.f75522, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f75524) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f75521.mo14302(this.f75522, 1);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f75524) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f75521.mo14303(this.f75522, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f75524) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f75522;
        AbstractC1082 abstractC1082 = this.f75521;
        Object objMo14302 = abstractC1082.mo14302(i, 0);
        if (key != objMo14302 && (key == null || !key.equals(objMo14302))) {
            return false;
        }
        Object value = entry.getValue();
        Object objMo14303 = abstractC1082.mo14302(this.f75522, 1);
        return value == objMo14303 || (value != null && value.equals(objMo14303));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f75524) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f75522;
        AbstractC1082 abstractC1082 = this.f75521;
        Object objMo14302 = abstractC1082.mo14302(i, 0);
        Object objMo14303 = abstractC1082.mo14302(this.f75522, 1);
        return (objMo14302 == null ? 0 : objMo14302.hashCode()) ^ (objMo14303 != null ? objMo14303.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
