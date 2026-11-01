package p067l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes4.dex */
public class C15386 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۡۨۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f82202 = {3478, -1111, -1093, -1108, -1089, -1125, -1111, -1142, -1093, -1106, -1102, -1101, -1100, -1110, -1105, -1106, -1142, -1093, -1106, -1102, -1045, -1101, -1100, -1110, -1105, -1106, -1142, -1093, -1106, -1102, -1048, -1101, -1090, -1048, -1100, -1093, -1097, -1089, -1101, -1091, -1100, -1099, -1112, -1089, -1125, -1090, -1090, -1131, -1112, -1122, -1089, -1098, -1101, -1100, -1092, -1099, -1036, -1104, -1111, -1099, -1100, -1108, -1089, -1112, -1111, -1101, -1099, -1100, -1127, -1099, -1090, -1089, -1092, -1101, -1098, -1089, -1048, -1092, -1101, -1098, -1089, -1045, -1093, -1118, -1097, -1098, -1106, -1117, -1110, -1089, -1096, -1035, -1093, -1035, -25472, -25402, -28766, -21072, -29313, -27657, 30870, -27669, -22666, 29713, -30948, -24158};

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f43964;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f43965;

    /* JADX INFO: renamed from: ܺ֫ */
    public AtomicInteger f43966 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC17043 f43967;

    /* JADX INFO: renamed from: ᩵֫ */
    public AbstractC17043 f43968;

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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 193201. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public p067l.C18736 mo5125() {
        /*
            Method dump skipped, instruction units count: 19320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C15386.mo5125():l.ܿ۠ۢ");
    }

    /* JADX INFO: renamed from: ֫ */
    private String m35057(C19561 c19561, C14281 c14281, String str) throws Throwable {
        C16820 c16820M38130 = C16820.m38130(c19561.m44448(c19561.m44470(str)));
        c16820M38130.m38143(c14281, this.f43964, this.f43968);
        return c16820M38130.m38152();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        this.f43965 = true;
        m35058(main, c18736);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35058(ContextWrapper contextWrapper, C18736 c18736) {
        if (c18736.m42773()) {
            if (this.f43966.get() == 0) {
                this.f43967.mo25503();
                C22682.m50799(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC23283.class);
                intent.setData(this.f43967.m38680());
                intent.putExtra("savedAsPath", m13492("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043;
        if (!this.f43965) {
            m35058(C7050.m16232(), c18736);
        }
        if (!c18736.m42773() && (abstractC17043 = this.f43967) != null) {
            abstractC17043.mo25503();
        }
        AbstractC17043 abstractC17044 = this.f43968;
        if (abstractC17044 != null) {
            abstractC17044.mo25503();
        }
        C17127.m38756();
    }
}
