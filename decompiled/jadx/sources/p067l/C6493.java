package p067l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۙ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AV8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6493 implements InterfaceC18147 {
    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        if ((c8760.f23752 & EnumC22172.WriteEnumUsingToString.f70155) != 0) {
            String string = ((Enum) obj).toString();
            if ((c8760.f23752 & EnumC22172.UseSingleQuotes.f70155) != 0) {
                c8760.m20250(string);
                return;
            } else {
                c8760.m20246(string, (char) 0, false);
                return;
            }
        }
        c8760.writeInt(((Enum) obj).ordinal());
    }
}
