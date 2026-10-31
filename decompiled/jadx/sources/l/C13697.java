package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes4.dex */
public class C13697 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۡۨۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f40882 = {3478, -1111, -1093, -1108, -1089, -1125, -1111, -1142, -1093, -1106, -1102, -1101, -1100, -1110, -1105, -1106, -1142, -1093, -1106, -1102, -1045, -1101, -1100, -1110, -1105, -1106, -1142, -1093, -1106, -1102, -1048, -1101, -1090, -1048, -1100, -1093, -1097, -1089, -1101, -1091, -1100, -1099, -1112, -1089, -1125, -1090, -1090, -1131, -1112, -1122, -1089, -1098, -1101, -1100, -1092, -1099, -1036, -1104, -1111, -1099, -1100, -1108, -1089, -1112, -1111, -1101, -1099, -1100, -1127, -1099, -1090, -1089, -1092, -1101, -1098, -1089, -1048, -1092, -1101, -1098, -1089, -1045, -1093, -1118, -1097, -1098, -1106, -1117, -1110, -1089, -1096, -1035, -1093, -1035, -25472, -25402, -28766, -21072, -29313, -27657, 30870, -27669, -22666, 29713, -30948, -24158};

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f40883;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f40884;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40885 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f40886;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f40887;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("saveAsPath"), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 193201. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public l.C17222 mo2780() {
        /*
            Method dump skipped, instruction units count: 19320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13697.mo2780():l.ܿ۠ۢ");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m32942(C18090 c18090, C12534 c12534, String str) throws Throwable {
        C15206 c15206M35970 = C15206.m35970(c18090.m42189(c18090.m42211(str)));
        c15206M35970.m35983(c12534, this.f40883, this.f40887);
        return c15206M35970.m35992();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        this.f40884 = true;
        m32943(main, c17222);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32943(ContextWrapper contextWrapper, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f40885.get() == 0) {
                this.f40886.mo23552();
                C21374.m48463(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC22006.class);
                intent.setData(this.f40886.m36522());
                intent.putExtra("savedAsPath", m11556("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440;
        if (!this.f40884) {
            m32943(C4925.m14335(), c17222);
        }
        if (!c17222.m40526() && (abstractC15440 = this.f40886) != null) {
            abstractC15440.mo23552();
        }
        AbstractC15440 abstractC15441 = this.f40887;
        if (abstractC15441 != null) {
            abstractC15441.mo23552();
        }
        C15528.m36596();
    }
}
