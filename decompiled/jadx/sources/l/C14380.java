package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14380 extends AbstractC1661 implements Function {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f43322;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f43323;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f43324;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f43325;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C16560 c16560 = (C16560) obj;
        if (!c16560.m39035("local") || c16560.m39038()) {
            return Boolean.FALSE;
        }
        if (c16560.m38991().equals(this.f43323)) {
            C21374.m48457(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c16560.m39020(), new String[0]);
        for (InterfaceC17889 interfaceC17889 : this.f43322) {
            if (interfaceC17889.isDirectory() && abstractC15440M39866.m36504(interfaceC17889.mo24433())) {
                c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, interfaceC17889.getName()), false);
                return Boolean.FALSE;
            }
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C17203.class);
        c0994.m3478(this.f43322);
        c0994.m3480(c16560);
        c0994.m3474("ARG_MSG_FROM", this.f43325);
        c0994.m3474("ARG_MSG_TO", c16560.m38990());
        c0994.m3474("sourcePath", this.f43324);
        c0994.m3474("targetPath", c16560.m39020());
        c0994.m3469();
        return Boolean.TRUE;
    }

    public C14380() {
        super(android.R.string.cut, R.drawable.MT_Protector);
        this.f43322 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("local");
        if (c2450.m7923()) {
            throw new IllegalStateException("Search results do not support single-window move.");
        }
        this.f43322 = c2450.m7909();
        this.f43323 = c2450.m7914();
        this.f43324 = c2450.m7925();
        this.f43325 = c2450.m7912();
        c2450.m7921().m38996(R.string.MT_Protector, this);
    }
}
