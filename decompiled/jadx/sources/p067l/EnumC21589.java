package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩶ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1L9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21589 {
    LEFT(0),
    RIGHT(1);


    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ boolean f68069 = false;

    /* JADX INFO: renamed from: ᩸ */
    public final int f68071;

    EnumC21589(int i) {
        this.f68071 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21589 m48779(int i) {
        if (i == 0) {
            return LEFT;
        }
        if (i == 1) {
            return RIGHT;
        }
        throw new IndexOutOfBoundsException(C20778.m46922(i, "index: "));
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC21589 m48781(boolean z) {
        return z ? LEFT : RIGHT;
    }

    /* JADX INFO: renamed from: ܽ */
    public static EnumC21589 m48782(boolean z) {
        return z ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21589 m48780(List list, Object obj) {
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf != -1) {
            return m48779(iIndexOf);
        }
        return null;
    }

    public int getIndex() {
        return this.f68071;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m48792() {
        return this.f68071 == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC21589 m48801() {
        return m48792() ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC21589 m48791(boolean z) {
        return z ? m48801() : this;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m48794(int i, int i2) {
        return m48792() ? i : i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m48787(Object obj, Object obj2) {
        return m48792() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object m48797(Object obj, Object obj2) {
        return m48792() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m48793(boolean[] zArr) {
        return zArr[this.f68071];
    }

    /* JADX INFO: renamed from: ֫ */
    public int m48786(int[] iArr) {
        return iArr[this.f68071];
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m48790(Object[] objArr) {
        return objArr[this.f68071];
    }

    /* JADX INFO: renamed from: ۧ */
    public Object m48800(Object[] objArr) {
        return objArr[this.f68071];
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m48788(List list) {
        return list.get(this.f68071);
    }

    /* JADX INFO: renamed from: ۧ */
    public Object m48798(List list) {
        return list.get(this.f68071);
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m48789(C5495 c5495) {
        return m48792() ? c5495.f42436 : c5495.f42437;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object m48799(C5495 c5495) {
        return m48792() ? c5495.f42436 : c5495.f42437;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m48796(InterfaceC20248 interfaceC20248) {
        return m48792() ? interfaceC20248.mo17398() : interfaceC20248.mo17396();
    }

    /* JADX INFO: renamed from: ֫ */
    public int m48785(InterfaceC20248 interfaceC20248) {
        return m48792() ? interfaceC20248.mo17388() : interfaceC20248.mo17400();
    }

    /* JADX INFO: renamed from: ۧ */
    public int m48795(InterfaceC2812 interfaceC2812) {
        return m48792() ? interfaceC2812.mo4445() : interfaceC2812.mo4448();
    }

    /* JADX INFO: renamed from: ֫ */
    public int m48784(InterfaceC2812 interfaceC2812) {
        return m48792() ? interfaceC2812.mo4443() : interfaceC2812.mo4452();
    }
}
