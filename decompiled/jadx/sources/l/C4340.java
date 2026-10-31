package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۙ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AV8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4340 implements InterfaceC16602 {
    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
            String string = ((Enum) obj).toString();
            if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                c6725.m18302(string);
                return;
            } else {
                c6725.m18298(string, (char) 0, false);
                return;
            }
        }
        c6725.writeInt(((Enum) obj).ordinal());
    }
}
