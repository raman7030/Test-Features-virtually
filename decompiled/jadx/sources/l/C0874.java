package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0874 extends AbstractC8636 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f3437;

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo3218() {
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m3219() {
        return this.f3437.toString();
    }

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3216(C10130 c10130, HashMap map) {
        c10130.m25441(this.f26371);
        c10130.m25441(this.f26369);
        c10130.m25441(this.f26372);
        c10130.m25441(this.f26370);
        AbstractC8636.m22399(c10130, map, this.f3437.toString());
    }

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3217(C12951 c12951, SparseArray sparseArray) {
        this.f26371 = c12951.m31493();
        this.f26369 = c12951.m31493();
        this.f26372 = c12951.m31493();
        this.f26370 = c12951.m31493();
        String str = (String) sparseArray.get(c12951.m31493());
        C11003.requireNonNull(str);
        this.f3437 = str;
    }

    public final String toString() {
        return "XmlText{text='" + ((Object) this.f3437) + "', line=" + this.f26371 + ", column=" + this.f26369 + ", startPosition=" + this.f26372 + ", endPosition=" + this.f26370 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0874.class == obj.getClass()) {
            C0874 c0874 = (C0874) obj;
            if (this.f26371 != c0874.f26371 || this.f26369 != c0874.f26369) {
                return false;
            }
            CharSequence charSequence = this.f3437;
            if (charSequence != null) {
                return c0874.f3437 != null && charSequence.toString().equals(c0874.f3437.toString());
            }
            if (c0874.f3437 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f3437;
        return ((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.f26371) * 31) + this.f26369;
    }
}
