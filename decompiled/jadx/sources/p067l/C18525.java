package p067l;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܿ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18525 {

    /* JADX INFO: renamed from: ֫ */
    public final C23631 f55324;

    /* JADX INFO: renamed from: ۖ */
    public final C12491 f55325;

    /* JADX INFO: renamed from: ۘ */
    public final C14146 f55326;

    /* JADX INFO: renamed from: ۜ */
    public final ViewTreeObserver f55327;

    /* JADX INFO: renamed from: ۡ */
    public final ViewTreeObserverOnScrollChangedListenerC17854 f55328;

    /* JADX INFO: renamed from: ۢ */
    public final Point f55329;

    /* JADX INFO: renamed from: ۧ */
    public final int f55330;

    /* JADX INFO: renamed from: ܳ */
    public final Handler f55331;

    /* JADX INFO: renamed from: ܺ */
    public final Point f55332;

    /* JADX INFO: renamed from: ܽ */
    public final int f55333;

    /* JADX INFO: renamed from: ܿ */
    public final int f55334;

    /* JADX INFO: renamed from: ᩳ */
    public final int f55335;

    /* JADX INFO: renamed from: ᩷ */
    public final C13693 f55336;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f55337;

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
    public C18525(C23631 c23631, C13693 c13693, Point point, Point point2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f55331 = handler;
        this.f55324 = c23631;
        this.f55336 = c13693;
        C14146 c14146 = c23631.f75242;
        this.f55326 = c14146;
        this.f55332 = new Point(point);
        this.f55329 = new Point(point2);
        this.f55333 = c14146.m32508();
        this.f55330 = c14146.m32512();
        this.f55335 = c14146.getScrollX();
        this.f55334 = c14146.m32472();
        ?? r4 = new InterfaceC10005() { // from class: l.ۧ֡ᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i, int i2) {
                C18525.m42132(this.f35015, i, i2);
            }
        };
        this.f55325 = r4;
        ?? r5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.ܽ֡ᩳ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C18525.m42131(this.f53288);
            }
        };
        this.f55328 = r5;
        ViewTreeObserver viewTreeObserver = c14146.getViewTreeObserver();
        this.f55327 = viewTreeObserver;
        c14146.m32394((InterfaceC10005) r4);
        viewTreeObserver.addOnScrollChangedListener(r5);
        handler.post(new RunnableC19196(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42132(C18525 c18525, int i, int i2) {
        if (i == c18525.f55333 && i2 == c18525.f55330) {
            return;
        }
        c18525.f55337 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42131(C18525 c18525) {
        C14146 c14146 = c18525.f55326;
        if (c14146.getScrollX() == c18525.f55335 && c14146.m32472() == c18525.f55334) {
            return;
        }
        c18525.f55337 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42133(C18525 c18525) {
        ViewTreeObserver viewTreeObserver = c18525.f55327;
        Point point = c18525.f55329;
        C23631 c23631 = c18525.f55324;
        C13693 c13693 = c18525.f55336;
        C14146 c14146 = c18525.f55326;
        boolean zM52570 = c23631.m52570(c13693, c14146);
        if (zM52570 && !c18525.f55337 && c14146.m32434()) {
            c18525.f55331.postDelayed(new RunnableC19196(c18525), 10L);
            return;
        }
        c14146.m32396(c18525.f55325);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(c18525.f55328);
        }
        if (zM52570 && !c18525.f55337 && c13693.f38639.mo3999().m54753().m16599()) {
            int i = c13693.f38628;
            if (i >= 0) {
                c14146.mo27941(i);
                if (c13693.f38635) {
                    c14146.m32490(c14146.m32454(point.x), c14146.m32585(point.y));
                    return;
                } else {
                    c14146.m32494(false);
                    return;
                }
            }
            Point point2 = c18525.f55332;
            C20699.m46760(point2.x, point2.y - 1).m46768(c14146);
            c14146.m32490(c14146.m32454(point.x), c14146.m32585(point.y));
        }
    }
}
