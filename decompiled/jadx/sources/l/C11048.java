package l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۧܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: WAV3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11048 extends C6192 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11048 f33221 = new C11048();

    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫ */
    public final void mo1935(AbstractC18809 abstractC18809, Object obj, int i, int i2, String str, C2581 c2581) {
        PrintStream printStream = System.err;
        StringBuilder sbM46682 = C20361.m46682("line ", i, ":", " ", i2);
        sbM46682.append(str);
        printStream.println(sbM46682.toString());
    }
}
