package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5770 implements InterfaceC18530 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f14169 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // p067l.InterfaceC18530
    /* JADX INFO: renamed from: ֫ */
    public final C6441 mo12931(C24406 c24406) {
        C11155 c11155M53830 = c24406.m53830();
        c11155M53830.m25724();
        char cM25726 = c11155M53830.m25726();
        if (cM25726 == '\n') {
            c11155M53830.m25724();
            return new C6441(new C24684(), c11155M53830.m25725());
        }
        if (!f14169.matcher(String.valueOf(cM25726)).matches()) {
            return new C6441(new C14625("\\"), c11155M53830.m25725());
        }
        c11155M53830.m25724();
        return new C6441(new C14625(String.valueOf(cM25726)), c11155M53830.m25725());
    }
}
