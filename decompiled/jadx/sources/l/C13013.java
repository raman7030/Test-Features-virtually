package l;

/* JADX INFO: renamed from: l.۬ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5YJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13013 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        int length;
        int iIndexOf;
        C11955 c11955 = new C11955();
        String strM29186 = ((C11955) c16040.m37919()).m29186();
        String strM29187 = ((C11955) c16040.m37919()).m29186();
        String strM29188 = ((C11955) c16040.m37919()).m29186();
        int iIndexOf2 = strM29188.indexOf(strM29187);
        c11955.m29155((iIndexOf2 == -1 || (iIndexOf = strM29188.indexOf(strM29186, (length = strM29187.length() + iIndexOf2))) == -1) ? "" : strM29188.substring(length, iIndexOf));
        c16040.m37918(c11955);
    }
}
