package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C12024 extends ActionMode {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f35977;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC3557 f35978;

    public C12024(Context context, AbstractC3557 abstractC3557) {
        this.f35977 = context;
        this.f35978 = abstractC3557;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f35978.m10835();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f35978.m10828(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f35978.mo10834(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f35978.mo10827(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f35978.mo10839();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f35978.mo10824();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC21114(this.f35977, this.f35978.mo10836());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f35978.mo10840();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f35978.mo10833(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f35978.mo10837();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f35978.mo10825(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f35978.mo10832();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f35978.mo10826(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f35978.mo10838();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f35978.m10830();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f35978.mo10829(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f35978.mo10831();
    }
}
