package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes.dex */
public final class C24365 extends AbstractC3947 implements Function {

    /* JADX INFO: renamed from: ۗ */
    public List f77150;

    /* JADX INFO: renamed from: ۬ */
    public String f77151;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean zStartsWith;
        C18107 c18107 = (C18107) obj;
        String strM41284 = c18107.m41284();
        if (strM41284.equals(this.f77151)) {
            C22682.m50793(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        boolean zMo15799 = c18107.m41270().mo8217().mo15799();
        Set setM15086 = C6606.m15086(zMo15799);
        for (InterfaceC19370 interfaceC19370 : this.f77150) {
            if (interfaceC19370.isDirectory()) {
                String str = interfaceC19370.getPath() + "/";
                if (zMo15799) {
                    zStartsWith = C11567.m26633(str, strM41284);
                } else {
                    zStartsWith = strM41284.startsWith(str);
                }
                if (zStartsWith) {
                    c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, interfaceC19370.getName()), false);
                    return Boolean.FALSE;
                }
            }
            setM15086.add(interfaceC19370.getName());
        }
        for (InterfaceC19370 interfaceC19371 : c18107.m41254()) {
            if (setM15086.contains(interfaceC19371.getName())) {
                C22682.m50795((CharSequence) (C7050.m16224(R.string.MT_Protector) + ": " + interfaceC19371.getName()));
                return Boolean.FALSE;
            }
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C8272.class);
        c3313.m5781(this.f77150);
        c3313.m5783(c18107);
        c3313.m5784(c18107.m41270());
        c3313.m5777("targetPath", strM41284);
        c3313.m5772();
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964(C0168b.f616k);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        this.f77150 = c4697.m9957();
        this.f77151 = c4697.m9974();
        c4697.m9969().m41222(R.string.MT_Protector, this);
    }
}
