package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes5.dex */
public class C22635 extends C21865 {
    public static final long serialVersionUID = 0;

    public C22635(C15828 c15828, final InterfaceC19740 interfaceC19740, final C18258 c18258, final C8005 c8005, C4271 c4271) {
        super(c15828, new Supplier() { // from class: l.ܶۘ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                InterfaceC19740 interfaceC19741 = interfaceC19740;
                return c8005.m18548(interfaceC19741.mo23287() == EnumC18398.SOURCE ? "bad.source.file.header" : "bad.class.file.header", interfaceC19741, c18258);
            }
        }, c4271);
    }
}
