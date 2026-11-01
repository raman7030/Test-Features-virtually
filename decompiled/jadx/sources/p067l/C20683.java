package p067l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.᩵ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C20683 extends AbstractC2640 implements InterfaceC4653 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C2576 f63876;

    /* JADX INFO: renamed from: ۙ */
    public LinkedHashSet f63877;

    @Override // p067l.InterfaceC4653
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo7945(InterfaceC4653 interfaceC4653, InterfaceC10688 interfaceC10688) {
        C20683 c20683 = (C20683) interfaceC4653;
        Properties properties = new Properties();
        properties.put("style", ((EnumC11295) interfaceC10688).f31477);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C20271) this.f31649).iterator();
        String str = "";
        while (it.hasNext()) {
            for (AbstractC6462 abstractC6462 : ((C3108) this.f63876.f4255.f18964.m4259((AbstractC6462) it.next())).m5292(EnumC20544.values())) {
                if (abstractC6462.m14792(C4848.m10279((Iterable) c20683.f31649))) {
                    sb.append(str);
                    sb.append(abstractC6462);
                    str = ",";
                }
            }
        }
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + sb.toString() + "\"");
        return properties;
    }

    public C20683(C2576 c2576, AbstractC6462 abstractC6462) {
        this.f63876 = c2576;
        C20271 c20271 = new C20271();
        c20271.m45777(abstractC6462);
        super(c20271);
        this.f63877 = new LinkedHashSet();
    }

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10688[] mo7946() {
        return new InterfaceC10688[]{EnumC11295.BOUND};
    }

    @Override // p067l.AbstractC2640
    /* JADX INFO: renamed from: ܿ */
    public final Iterable mo4028() {
        return this.f63877;
    }

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo7943(InterfaceC10688 interfaceC10688) {
        if (interfaceC10688 == EnumC11295.BOUND) {
            return this.f63877;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet m46749() {
        HashSet hashSet = new HashSet();
        m46748(hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46748(HashSet hashSet) {
        if (hashSet.add(this)) {
            Iterator it = this.f63877.iterator();
            while (it.hasNext()) {
                ((C20683) it.next()).m46748(hashSet);
            }
        }
    }

    @Override // p067l.InterfaceC4653
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo7944() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + this.f31649.toString() + "\"");
        return properties;
    }
}
