package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩸֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21274 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21274 f68621 = new C21274();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullBooleanAsFalse.f67472) != 0) {
                c6725.write("false");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (bool.booleanValue()) {
            c6725.write("true");
        } else {
            c6725.write("false");
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        if (iM19646 == 6) {
            c7322.m19641(16);
            return Boolean.TRUE;
        }
        if (iM19646 == 7) {
            c7322.m19641(16);
            return Boolean.FALSE;
        }
        if (iM19646 == 2) {
            int iM19651 = c7322.m19651();
            c7322.m19641(16);
            if (iM19651 == 1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        Object objM28434 = c11556.m28434((Object) null);
        if (objM28434 == null) {
            return null;
        }
        return C19426.m44754(objM28434);
    }
}
