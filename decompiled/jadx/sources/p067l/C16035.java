package p067l;

import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16035 extends AbstractC3947 implements Function {

    /* JADX INFO: renamed from: ۗ */
    public List f46413;

    /* JADX INFO: renamed from: ۤ */
    public String f46414;

    /* JADX INFO: renamed from: ۫ */
    public String f46415;

    /* JADX INFO: renamed from: ۬ */
    public String f46416;

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
        C18107 c18107 = (C18107) obj;
        if (!c18107.m41261("local") || c18107.m41264()) {
            return Boolean.FALSE;
        }
        if (c18107.m41217().equals(this.f46414)) {
            C22682.m50793(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c18107.m41246(), new String[0]);
        for (InterfaceC19370 interfaceC19370 : this.f46413) {
            if (interfaceC19370.isDirectory() && abstractC17043M42109.m38662(interfaceC19370.mo26445())) {
                c18107.m41282().m12257(C7050.m16203(R.string.MT_Protector, interfaceC19370.getName()), false);
                return Boolean.FALSE;
            }
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C18718.class);
        c3313.m5781(this.f46413);
        c3313.m5783(c18107);
        c3313.m5777("ARG_MSG_FROM", this.f46416);
        c3313.m5777("ARG_MSG_TO", c18107.m41216());
        c3313.m5777("sourcePath", this.f46415);
        c3313.m5777("targetPath", c18107.m41246());
        c3313.m5772();
        return Boolean.TRUE;
    }

    public C16035() {
        super(android.R.string.cut, R.drawable.MT_Protector);
        this.f46413 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("local") && !c4697.m9971();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("local");
        if (c4697.m9971()) {
            throw new IllegalStateException("Search results do not support single-window move.");
        }
        this.f46413 = c4697.m9957();
        this.f46414 = c4697.m9962();
        this.f46415 = c4697.m9973();
        this.f46416 = c4697.m9960();
        c4697.m9969().m41222(R.string.MT_Protector, this);
    }
}
