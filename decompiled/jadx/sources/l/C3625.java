package l;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3625 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13758 f11473 = C13758.m33067((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7858 f11474;

    public C3625(AbstractC7858 abstractC7858) {
        this.f11474 = abstractC7858;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11104(C19854 c19854, C18711 c18711, AbstractC7858 abstractC7858) throws C18442 {
        C2903 c2903 = new C2903();
        C23279 c23279 = new C23279();
        c2903.m8839(InterfaceC14106.class, c23279);
        C11781.m28823(c2903).m28828("allowStringFolding", "false");
        C11781.m28823(c2903).m28828("--enable-preview", "true");
        try {
            new C11844(c2903, true, StandardCharsets.UTF_8).m28936(EnumC21101.PLATFORM_CLASS_PATH, AbstractC14545.of());
            C2214 c2214 = new C2214(URI.create("source"), EnumC16866.SOURCE, c19854);
            C22364.m50099(c2903).m7284(c2214);
            C1323 c1323M33988 = C15684.m36959(c2903).m36960(c19854.m45663(), true, true, true, false).m33988();
            c1323M33988.f4745 = c2214;
            c19854.m45660(c1323M33988);
            Iterable iterableM22954 = C8882.m22954(c23279.m51594(), new C15618());
            if (!C8882.m22957(iterableM22954)) {
                throw new C18442(C8882.m22949(iterableM22954, new C15942(10)));
            }
            C13675 c13675 = new C13675(c19854, c18711);
            new C3894(c13675, abstractC7858.mo21059().m3026()).m11845(c1323M33988);
            c13675.m32913(c19854.m45663().length());
            c13675.m32900();
            C18616 c18616 = new C18616();
            AbstractC4628 abstractC4628ListIterator = c13675.m32911().listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                ((InterfaceC12265) abstractC4628ListIterator.next()).mo7732(c18616);
            }
            AbstractC3799 abstractC3799M43157 = c18616.m43157();
            abstractC3799M43157.mo7731(c18711.m43331(), new C9444());
            abstractC3799M43157.mo7733(c18711);
            c18711.m43330();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11105(AbstractC21189 abstractC21189, AbstractC17660 abstractC17660) {
        String strMo48138 = abstractC21189.mo48138();
        AbstractC14545 abstractC14545Of = AbstractC14545.of((Object) C13758.m33067((Integer) 0, Integer.valueOf(strMo48138.length())));
        C19854 c19854 = new C19854(strMo48138);
        AbstractC7858 abstractC7858 = this.f11474;
        if (abstractC7858.mo21058()) {
            c19854 = C20122.m46376(c19854, abstractC14545Of);
        }
        String strM31534 = C12970.m31534(strMo48138);
        C18711 c18711 = new C18711(strM31534, c19854, new C0096(strM31534, abstractC7858));
        try {
            m11104(c19854, c18711, abstractC7858);
            String strM43323 = C18711.m43323(strMo48138, c18711.m43326(c19854.m45659((Collection) abstractC14545Of)));
            strM43323.getClass();
            abstractC17660.mo24410().append((CharSequence) strM43323);
        } catch (C0270 e) {
            throw new C18442(e.m1583());
        }
    }
}
