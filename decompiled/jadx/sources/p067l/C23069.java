package p067l;

/* JADX INFO: renamed from: l.᩸᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes.dex */
public final class C23069 {

    /* JADX INFO: renamed from: ۧ */
    public static final C3622 f72479 = new C3622();

    /* JADX INFO: renamed from: ֫ */
    public final C17032 f72480;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11277 m51457(Class cls) {
        C10606.m24401(cls);
        InterfaceC8455 interfaceC8455Mo6843 = this.f72480.mo6843(cls);
        if (interfaceC8455Mo6843.mo19676()) {
            if (AbstractC23049.class.isAssignableFrom(cls)) {
                return C22538.m50508(C10606.m24410(), C11237.m26031(), interfaceC8455Mo6843.mo19677());
            }
            return C22538.m50508(C10606.m24398(), C11237.m26030(), interfaceC8455Mo6843.mo19677());
        }
        if (AbstractC23049.class.isAssignableFrom(cls)) {
            if (C10328.f28607[interfaceC8455Mo6843.mo19678().ordinal()] != 1) {
                return C16501.m37430(interfaceC8455Mo6843, C5103.m10871(), AbstractC2951.m4875(), C10606.m24410(), C11237.m26031(), C18513.m42062());
            }
            return C16501.m37430(interfaceC8455Mo6843, C5103.m10871(), AbstractC2951.m4875(), C10606.m24410(), null, C18513.m42062());
        }
        if (C10328.f28607[interfaceC8455Mo6843.mo19678().ordinal()] != 1) {
            return C16501.m37430(interfaceC8455Mo6843, C5103.m10870(), AbstractC2951.m4874(), C10606.m24398(), C11237.m26030(), C18513.m42061());
        }
        return C16501.m37430(interfaceC8455Mo6843, C5103.m10870(), AbstractC2951.m4874(), C10606.m24398(), null, C18513.m42061());
    }

    public C23069() {
        InterfaceC21867 interfaceC21867;
        C20367 c20367M45968 = C20367.m45968();
        try {
            int i = C20427.f63114;
            interfaceC21867 = (InterfaceC21867) C20427.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC21867 = f72479;
        }
        C17032 c17032 = new C17032(c20367M45968, interfaceC21867);
        byte[] bArr = C15671.f44805;
        this.f72480 = c17032;
    }
}
