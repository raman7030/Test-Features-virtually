package p067l;

import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.ܶܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C16924 implements InterfaceC17282 {

    /* JADX INFO: renamed from: ܶۢۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f82240;

    /* JADX INFO: renamed from: ֫ */
    public ActivityC17874 f50094;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23631 f50095;

    static {
        ApplicationC14266.m56479(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        f82240 = new short[]{3204, -20959, -20944, -20938, -20940, -20964, -20930, -20939, -20940, -20942, -20956, -20957, -20957, -20940, -20929, -20955, -20991, -20944, -20938, -20940, -20968, -20929, -20939, -20940, -20951, -20868};
    }

    @Override // p067l.InterfaceC17282
    /* JADX INFO: renamed from: ۧ */
    public native void mo38503();

    public C16924(C23631 c23631, ActivityC17874 activityC17874) {
        this.f50095 = c23631;
        this.f50094 = activityC17874;
        if (c23631.f8383 == null) {
            c23631.f8383 = (C21620) new C6874(activityC17874).m15765(C21620.class);
        }
        if (c23631.f8381 == null) {
            c23631.f8381 = (C13992) new C6874(activityC17874).m15765(C13992.class);
        }
    }

    @Override // p067l.InterfaceC17282
    public final String getTitle() {
        return this.f50095.m52579();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    private void m38501(java.lang.CharSequence r37, java.lang.String r38, p067l.C24301 r39) {
        /*
            Method dump skipped, instruction units count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C16924.m38501(java.lang.CharSequence, java.lang.String, l.᩺ܶᩳ):void");
    }

    @Override // p067l.InterfaceC17282
    /* JADX INFO: renamed from: ֫ */
    public final void mo38502(Exception exc) {
        this.f50095.m52484(exc, this.f50094);
    }
}
