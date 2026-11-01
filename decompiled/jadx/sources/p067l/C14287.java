package p067l;

import android.os.SystemClock;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۫ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes4.dex */
public class C14287 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public ArrayList f40692 = new ArrayList();

    /* JADX INFO: renamed from: ܺ֫ */
    public ArrayList f40693 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5459() {
        return false;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        C19210.m43749(strM13492, EnumC17868.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C20689 c20689 = new C20689(strArrM13494.length);
        c20689.m46753(new C24523(this));
        int length = 1000 / strArrM13494.length;
        if (length > 200) {
            length = 200;
        }
        for (String str : strArrM13494) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            String name = abstractC17043M42109.getName();
            c20689.m46754(1);
            mo13456(name);
            if (length > 0) {
                SystemClock.sleep(length);
            }
            try {
                C18524.m42109(C11419.m26403(strM13492, name), new String[0]).mo29995(abstractC17043M42109.mo34129());
                this.f40692.add(name);
            } catch (IOException unused) {
                this.f40693.add(name);
            }
            if (mo3924()) {
                return C18736.m42768();
            }
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79716;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
        ArrayList arrayList = this.f40693;
        if (arrayList.isEmpty()) {
            return;
        }
        abstractActivityC5549.m12254(R.string.MT_Protector, C11567.m26623(arrayList, "\n"), false);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        ArrayList arrayList = this.f40692;
        if (arrayList.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) arrayList);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16224(R.string.MT_Protector);
    }
}
