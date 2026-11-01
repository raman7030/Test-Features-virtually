package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13828 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public C19561 f39077;

    /* JADX INFO: renamed from: ۘ֫ */
    public C19561 f39078;

    /* JADX INFO: renamed from: ܺ֫ */
    public String f39079;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5459() {
        return false;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79717;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("saveAsPath"), C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        String strM13492 = m13492("inputPath1");
        String strM13493 = m13492("inputPath2");
        String strM13471 = m13471("zipPath1");
        String strM13472 = m13471("zipPath2");
        AbstractC5375 abstractC5375 = m13479().containsKey("statelessVisitor1") ? (AbstractC5375) C13589.m30905(m13496("statelessVisitor1"), false) : null;
        AbstractC5375 abstractC5376 = m13479().containsKey("statelessVisitor2") ? (AbstractC5375) C13589.m30905(m13496("statelessVisitor2"), false) : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z = strM13471 == null || strM13472 == null;
        boolean z2 = strM13471 == null && strM13472 == null;
        if (strM13471 != null) {
            C19561 c19561 = new C19561(strM13471);
            this.f39077 = c19561;
            C11817.m27083(map, c19561, strM13492, z);
            strM13492 = strM13471.concat(strM13492);
        } else if (abstractC5375 != null) {
            C11817.m27079(map, abstractC5375, strM13492, z2, "", this);
            strM13492 = abstractC5375.m11724() + strM13492;
        } else {
            C11817.m27081(map, C18524.m42109(strM13492, new String[0]), z2, "", this);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        if (strM13472 != null) {
            C19561 c19562 = new C19561(strM13472);
            this.f39078 = c19562;
            C11817.m27083(map2, c19562, strM13493, z);
            strM13493 = strM13472.concat(strM13493);
        } else if (abstractC5376 != null) {
            C11817.m27079(map2, abstractC5376, strM13493, z2, "", this);
            strM13493 = abstractC5376.m11724() + strM13493;
        } else {
            C11817.m27081(map2, C18524.m42109(strM13493, new String[0]), z2, "", this);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        this.f39079 = C10160.m23665(strM13492, strM13493, map, map2, new C14498(this));
        return m13481();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (this.f39079.isEmpty()) {
                C22682.m50799(R.string.MT_Protector);
                return;
            }
            String str = this.f39079;
            String strM16224 = C7050.m16224(R.string.MT_Protector);
            String strM13492 = m13492("saveAsPath");
            int i = C9038.f24535;
            ActivityC16573.m37551(main, str, strM16224, strM13492, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C2700.m4192(this.f39077);
        C2700.m4192(this.f39078);
        C17127.m38756();
    }
}
