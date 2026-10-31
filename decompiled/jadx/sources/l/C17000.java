package l;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܿ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17000 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22372 f52144;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10651 f52145;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12392 f52146;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver f52147;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnScrollChangedListenerC16294 f52148;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Point f52149;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52150;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f52151;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Point f52152;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52153;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52154;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f52155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11915 f52156;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f52157;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.۠۟ᩳ, l.ۧ֡ᩳ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewTreeObserver$OnScrollChangedListener, l.ܽ֡ᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C17000(C22372 c22372, C11915 c11915, Point point, Point point2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f52151 = handler;
        this.f52144 = c22372;
        this.f52156 = c11915;
        C12392 c12392 = c22372.f72517;
        this.f52146 = c12392;
        this.f52152 = new Point(point);
        this.f52149 = new Point(point2);
        this.f52153 = c12392.m30444();
        this.f52150 = c12392.m30448();
        this.f52155 = c12392.getScrollX();
        this.f52154 = c12392.m30408();
        ?? r4 = new InterfaceC8035() { // from class: l.ۧ֡ᩳ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i, int i2) {
                C17000.m39889(this.f32044, i, i2);
            }
        };
        this.f52145 = r4;
        ?? r5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.ܽ֡ᩳ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C17000.m39888(this.f50121);
            }
        };
        this.f52148 = r5;
        ViewTreeObserver viewTreeObserver = c12392.getViewTreeObserver();
        this.f52147 = viewTreeObserver;
        c12392.m30330((InterfaceC8035) r4);
        viewTreeObserver.addOnScrollChangedListener(r5);
        handler.post(new RunnableC17706(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39889(C17000 c17000, int i, int i2) {
        if (i == c17000.f52153 && i2 == c17000.f52150) {
            return;
        }
        c17000.f52157 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39888(C17000 c17000) {
        C12392 c12392 = c17000.f52146;
        if (c12392.getScrollX() == c17000.f52155 && c12392.m30408() == c17000.f52154) {
            return;
        }
        c17000.f52157 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39890(C17000 c17000) {
        ViewTreeObserver viewTreeObserver = c17000.f52147;
        Point point = c17000.f52149;
        C22372 c22372 = c17000.f52144;
        C11915 c11915 = c17000.f52156;
        C12392 c12392 = c17000.f52146;
        boolean zM50230 = c22372.m50230(c11915, c12392);
        if (zM50230 && !c17000.f52157 && c12392.m30370()) {
            c17000.f52151.postDelayed(new RunnableC17706(c17000), 10L);
            return;
        }
        c12392.m30332(c17000.f52145);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(c17000.f52148);
        }
        if (zM50230 && !c17000.f52157 && c11915.f35630.mo1601().m52350().m14691()) {
            int i = c11915.f35619;
            if (i >= 0) {
                c12392.mo25919(i);
                if (c11915.f35626) {
                    c12392.m30426(c12392.m30390(point.x), c12392.m30521(point.y));
                    return;
                } else {
                    c12392.m30430(false);
                    return;
                }
            }
            Point point2 = c17000.f52152;
            C19287.m44466(point2.x, point2.y - 1).m44474(c12392);
            c12392.m30426(c12392.m30390(point.x), c12392.m30521(point.y));
        }
    }
}
