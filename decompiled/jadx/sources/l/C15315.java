package l;

import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.ܶܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C15315 implements InterfaceC15692 {

    /* JADX INFO: renamed from: ܶۢۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f46968;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ActivityC16315 f46969;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f46970;

    static {
        ApplicationC12518.m30701(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        f46968 = new short[]{3204, -20959, -20944, -20938, -20940, -20964, -20930, -20939, -20940, -20942, -20956, -20957, -20957, -20940, -20929, -20955, -20991, -20944, -20938, -20940, -20968, -20929, -20939, -20940, -20951, -20868};
    }

    @Override // l.InterfaceC15692
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public native void mo36341();

    public C15315(C22372 c22372, ActivityC16315 activityC16315) {
        this.f46970 = c22372;
        this.f46969 = activityC16315;
        if (c22372.f5603 == null) {
            c22372.f5603 = (C20256) new C4741(activityC16315).m13885(C20256.class);
        }
        if (c22372.f5601 == null) {
            c22372.f5601 = (C12230) new C4741(activityC16315).m13885(C12230.class);
        }
    }

    @Override // l.InterfaceC15692
    public final String getTitle() {
        return this.f46970.m50239();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36339(java.lang.CharSequence r37, java.lang.String r38, l.C23077 r39) {
        /*
            Method dump skipped, instruction units count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15315.m36339(java.lang.CharSequence, java.lang.String, l.᩺ܶᩳ):void");
    }

    @Override // l.InterfaceC15692
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36340(Exception exc) {
        this.f46970.m50144(exc, this.f46969);
    }
}
