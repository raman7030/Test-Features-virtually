package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.᩵ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C19271 extends AbstractC0286 implements InterfaceC2404 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0219 f60646;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f60647;

    @Override // l.InterfaceC2404
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo5712(InterfaceC2404 interfaceC2404, InterfaceC8754 interfaceC8754) {
        C19271 c19271 = (C19271) interfaceC2404;
        Properties properties = new Properties();
        properties.put("style", ((EnumC9393) interfaceC8754).f28528);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C18837) this.f28700).iterator();
        String str = "";
        while (it.hasNext()) {
            for (AbstractC4308 abstractC4308 : ((C0779) this.f60646.f1476.f16125.m1868((AbstractC4308) it.next())).m2963(EnumC19125.values())) {
                if (abstractC4308.m12928(C2609.m8235((Iterable) c19271.f28700))) {
                    sb.append(str);
                    sb.append(abstractC4308);
                    str = ",";
                }
            }
        }
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + sb.toString() + "\"");
        return properties;
    }

    public C19271(C0219 c0219, AbstractC4308 abstractC4308) {
        this.f60646 = c0219;
        C18837 c18837 = new C18837();
        c18837.m43511(abstractC4308);
        super(c18837);
        this.f60647 = new LinkedHashSet();
    }

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8754[] mo5713() {
        return new InterfaceC8754[]{EnumC9393.BOUND};
    }

    @Override // l.AbstractC0286
    /* JADX INFO: renamed from: ܿ */
    public final Iterable mo1628() {
        return this.f60647;
    }

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5710(InterfaceC8754 interfaceC8754) {
        if (interfaceC8754 == EnumC9393.BOUND) {
            return this.f60647;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet m44455() {
        HashSet hashSet = new HashSet();
        m44454(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44454(HashSet hashSet) {
        if (hashSet.add(this)) {
            Iterator it = this.f60647.iterator();
            while (it.hasNext()) {
                ((C19271) it.next()).m44454(hashSet);
            }
        }
    }

    @Override // l.InterfaceC2404
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo5711() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + this.f28700.toString() + "\"");
        return properties;
    }
}
