package p067l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3199 extends AbstractC10576 {

    /* JADX INFO: renamed from: ܿ */
    public CharSequence f6210;

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo5532() {
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m5533() {
        return this.f6210.toString();
    }

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ֫ */
    public final void mo5530(C11996 c11996, HashMap map) {
        c11996.m27461(this.f29289);
        c11996.m27461(this.f29287);
        c11996.m27461(this.f29290);
        c11996.m27461(this.f29288);
        AbstractC10576.m24368(c11996, map, this.f6210.toString());
    }

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ֫ */
    public final void mo5531(C14677 c14677, SparseArray sparseArray) {
        this.f29289 = c14677.m33580();
        this.f29287 = c14677.m33580();
        this.f29290 = c14677.m33580();
        this.f29288 = c14677.m33580();
        String str = (String) sparseArray.get(c14677.m33580());
        C12826.requireNonNull(str);
        this.f6210 = str;
    }

    public final String toString() {
        return "XmlText{text='" + ((Object) this.f6210) + "', line=" + this.f29289 + ", column=" + this.f29287 + ", startPosition=" + this.f29290 + ", endPosition=" + this.f29288 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3199.class == obj.getClass()) {
            C3199 c3199 = (C3199) obj;
            if (this.f29289 != c3199.f29289 || this.f29287 != c3199.f29287) {
                return false;
            }
            CharSequence charSequence = this.f6210;
            if (charSequence != null) {
                return c3199.f6210 != null && charSequence.toString().equals(c3199.f6210.toString());
            }
            if (c3199.f6210 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f6210;
        return ((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.f29289) * 31) + this.f29287;
    }
}
