package p067l;

import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7BU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3729 extends AbstractC3947 implements Function {

    /* JADX INFO: renamed from: ۗ */
    public List f7901;

    /* JADX INFO: renamed from: ۫ */
    public String f7902;

    /* JADX INFO: renamed from: ۬ */
    public String f7903;

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
        final C18107 c18107 = (C18107) obj;
        if (!c18107.m41261("local") || c18107.m41264()) {
            return Boolean.FALSE;
        }
        if (c18107.m41217().equals(this.f7902)) {
            if (this.f7901.size() != 1) {
                C22682.m50793(R.string.MT_Protector);
                return Boolean.FALSE;
            }
            final InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f7901.get(0);
            C21165.m47772(c18107.m41282(), interfaceC19370, c18107.m41284(), new InterfaceC20494() { // from class: l.֡᩺ܳ
                @Override // p067l.InterfaceC20494
                /* JADX INFO: renamed from: ֫ */
                public final void mo5165(String str) {
                    InterfaceC19370 interfaceC19371 = interfaceC19370;
                    List listSingletonList = Collections.singletonList(interfaceC19371);
                    String name = interfaceC19371.getName();
                    String str2 = interfaceC19371.isDirectory() ? str : null;
                    C18107 c18108 = c18107;
                    C3729.m7186(listSingletonList, c18108, name, str2, c18108.m41284(), str).m5772();
                }
            });
            return Boolean.TRUE;
        }
        m7186(this.f7901, c18107, this.f7903, c18107.m41216(), c18107.m41284(), null).m5772();
        return Boolean.TRUE;
    }

    public C3729() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f7901 = Collections.EMPTY_LIST;
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
            throw new IllegalStateException("Search results do not support single-window copy.");
        }
        this.f7901 = c4697.m9957();
        this.f7902 = c4697.m9962();
        this.f7903 = c4697.m9960();
        c4697.m9969().m41222(R.string.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3313 m7186(List list, C18107 c18107, String str, String str2, String str3, String str4) {
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C7753.class);
        c3313.m5786(list);
        c3313.m5783(c18107);
        c3313.m5777("ARG_MSG_FROM", str);
        c3313.m5777("targetPath", str3);
        if (str2 != null) {
            c3313.m5777("ARG_MSG_TO", str2);
        }
        if (str4 != null) {
            c3313.m5777("replacedName", str4);
        }
        return c3313;
    }
}
