package p067l;

/* JADX INFO: renamed from: l.ۢᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C11650 {

    /* JADX INFO: renamed from: ֫ */
    public String[] f32495;

    /* JADX INFO: renamed from: ۧ */
    public final C19244 f32496;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7884[] f32497;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC23977[] f32498;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f32499 = false;

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC7884 m26784(C11650 c11650, C2479 c2479) {
        c11650.getClass();
        if (c2479.m3545() != c11650.f32496) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (c2479.m3527()) {
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        return c11650.f32497[c2479.m3531()];
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC23977 m26786(C11650 c11650, C16561 c16561) {
        c11650.getClass();
        if (c16561.m37541() != c11650.f32496) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
        return c11650.f32498[c16561.m37539()];
    }

    public C11650(C19244 c19244, String[] strArr) {
        this.f32496 = c19244;
        this.f32495 = strArr;
        this.f32497 = new InterfaceC7884[c19244.getFields().size()];
        this.f32498 = new InterfaceC23977[c19244.m43834().size()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26787(Class cls, Class cls2) {
        if (this.f32499) {
            return;
        }
        synchronized (this) {
            if (this.f32499) {
                return;
            }
            int length = this.f32497.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                C2479 c2479 = (C2479) this.f32496.getFields().get(i);
                if (c2479.m3540() != null) {
                    int iM37539 = c2479.m3540().m37539() + length;
                    String[] strArr = this.f32495;
                    if (iM37539 < strArr.length) {
                        str = strArr[iM37539];
                    }
                }
                String str2 = str;
                if (c2479.mo3530()) {
                    if (c2479.m3539() == EnumC19915.MESSAGE) {
                        if (c2479.m3538()) {
                            this.f32497[i] = new C13249(c2479, cls);
                        } else {
                            this.f32497[i] = new C18354(cls, cls2, this.f32495[i]);
                        }
                    } else if (c2479.m3539() == EnumC19915.ENUM) {
                        this.f32497[i] = new C9225(c2479, this.f32495[i], cls, cls2);
                    } else {
                        this.f32497[i] = new C12991(cls, cls2, this.f32495[i]);
                    }
                } else if (c2479.m3539() == EnumC19915.MESSAGE) {
                    this.f32497[i] = new C25060(c2479, this.f32495[i], cls, cls2, str2);
                } else if (c2479.m3539() == EnumC19915.ENUM) {
                    this.f32497[i] = new C19696(c2479, this.f32495[i], cls, cls2, str2);
                } else if (c2479.m3539() == EnumC19915.STRING) {
                    this.f32497[i] = new C8967(c2479, this.f32495[i], cls, cls2, str2);
                } else {
                    this.f32497[i] = new C16342(c2479, this.f32495[i], cls, cls2, str2);
                }
                i++;
            }
            for (int i2 = 0; i2 < this.f32496.m43834().size(); i2++) {
                if (i2 < this.f32496.m43840().size()) {
                    this.f32498[i2] = new C15259(this.f32496, this.f32495[i2 + length], cls, cls2);
                } else {
                    this.f32498[i2] = new C22379(this.f32496, i2);
                }
            }
            this.f32499 = true;
            this.f32495 = null;
        }
    }
}
