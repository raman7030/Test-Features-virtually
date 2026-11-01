package p067l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5594 implements InterfaceC16992, Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C5594 f13555 = new C5594();

    /* JADX INFO: renamed from: ᩸ */
    public List f13556;

    /* JADX INFO: renamed from: ᩹ */
    public List f13557;

    public C5594() {
        List list = Collections.EMPTY_LIST;
        this.f13557 = list;
        this.f13556 = list;
    }

    public final Object clone() {
        try {
            return (C5594) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class clsM41004 = c18020.m41004();
        boolean zM12389 = m12389(clsM41004, true);
        boolean zM123810 = m12389(clsM41004, false);
        if (zM12389 || zM123810) {
            return new C6935(this, zM123810, zM12389, c14271, c18020);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12390(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m12389(field.getType(), z)) {
            return true;
        }
        List list = z ? this.f13557 : this.f13556;
        if (list.isEmpty()) {
            return false;
        }
        new C4174(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC17623) it.next()).m40147()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12389(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            int i = C15140.f43223;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f13557 : this.f13556).iterator();
        while (it.hasNext()) {
            if (((InterfaceC17623) it.next()).m40146()) {
                return true;
            }
        }
        return false;
    }
}
