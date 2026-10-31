package l;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ۤۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10213 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        String strM29186 = ((C11955) c16040.m37919()).m29186();
        C11955 c11955 = new C11955();
        try {
            c11955.m29154(new FileInputStream(new File(strM29186)));
        } catch (Exception unused) {
        }
        c16040.m37918(c11955);
    }
}
