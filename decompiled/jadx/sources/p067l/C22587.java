package p067l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩸֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C22587 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C22587 f71304 = new C22587();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullBooleanAsFalse.f70155) != 0) {
                c8760.write("false");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        if (bool.booleanValue()) {
            c8760.write("true");
        } else {
            c8760.write("false");
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        if (iM21614 == 6) {
            c9327.m21609(16);
            return Boolean.TRUE;
        }
        if (iM21614 == 7) {
            c9327.m21609(16);
            return Boolean.FALSE;
        }
        if (iM21614 == 2) {
            int iM21619 = c9327.m21619();
            c9327.m21609(16);
            if (iM21619 == 1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        Object objM30480 = c13351.m30480((Object) null);
        if (objM30480 == null) {
            return null;
        }
        return C20831.m47048(objM30480);
    }
}
