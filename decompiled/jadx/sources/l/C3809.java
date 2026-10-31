package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3809 implements Supplier {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12007;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12008;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12009;

    public /* synthetic */ C3809(int i, Object obj, Object obj2) {
        this.f12008 = i;
        this.f12009 = obj;
        this.f12007 = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f12008;
        Object obj = this.f12007;
        Object obj2 = this.f12009;
        switch (i) {
            case 0:
                C6319 c6319 = (C6319) obj2;
                c6319.getClass();
                return new C5425(c6319, (C6570) obj);
            default:
                C5931 c5931 = ((C19914) obj2).f64350;
                AbstractC10370 abstractC10370 = ((C14163) obj).f42771;
                C11576 c11576 = C11886.f35440;
                return c5931.m16617(new C11576("compiler", "class.file.not.found", abstractC10370));
        }
    }
}
