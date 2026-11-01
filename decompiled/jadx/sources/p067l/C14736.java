package p067l;

/* JADX INFO: renamed from: l.۬ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5YJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14736 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        int length;
        int iIndexOf;
        C13731 c13731 = new C13731();
        String strM31240 = ((C13731) c17613.m40106()).m31240();
        String strM31241 = ((C13731) c17613.m40106()).m31240();
        String strM31242 = ((C13731) c17613.m40106()).m31240();
        int iIndexOf2 = strM31242.indexOf(strM31241);
        c13731.m31209((iIndexOf2 == -1 || (iIndexOf = strM31242.indexOf(strM31240, (length = strM31241.length() + iIndexOf2))) == -1) ? "" : strM31242.substring(length, iIndexOf));
        c17613.m40105(c13731);
    }
}
