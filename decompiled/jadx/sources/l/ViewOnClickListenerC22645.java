package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC22645 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f73146;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f73147;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15293 f73148;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8817 f73149 = C8817.m22788();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1973 f73150;

    public ViewOnClickListenerC22645(C15293 c15293, C10235 c10235, C10235 c10236, InterfaceC1973 interfaceC1973) {
        this.f73148 = c15293;
        this.f73146 = c10235;
        this.f73147 = c10236;
        this.f73150 = interfaceC1973;
    }

    @Override // android.view.View.OnClickListener
    @InterfaceC4801
    public void onClick(View view) {
        C11146 c11146M36304 = this.f73148.m36304();
        C10235 c10235 = this.f73146;
        boolean zHasFocus = c10235.hasFocus();
        C8817 c8817 = this.f73149;
        C10235 c10236 = this.f73147;
        if ((zHasFocus || c10236.hasFocus()) && c11146M36304.mo27661()) {
            if (!c10235.hasFocus()) {
                c10235 = c10236;
            }
            if (c11146M36304.mo14042() || !c8817.m22793()) {
                c11146M36304.mo14041(view, c10235);
                return;
            }
            return;
        }
        if (c11146M36304.mo14042() || !c8817.m22793()) {
            c11146M36304.mo14040(view, this.f73150);
        }
    }

    @Override // android.view.View.OnLongClickListener
    @InterfaceC4801
    public boolean onLongClick(View view) {
        C11146 c11146M36303 = this.f73148.m36303();
        if (c11146M36303 == null) {
            return false;
        }
        C10235 c10235 = this.f73146;
        boolean zHasFocus = c10235.hasFocus();
        C10235 c10236 = this.f73147;
        if ((zHasFocus || c10236.hasFocus()) && c11146M36303.mo27661()) {
            if (!c10235.hasFocus()) {
                c10235 = c10236;
            }
            c11146M36303.mo14041(view, c10235);
            return true;
        }
        c11146M36303.mo14040(view, this.f73150);
        return true;
    }
}
