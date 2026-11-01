package p067l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩻ */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C1438 extends ActionMode {

    /* JADX INFO: renamed from: ֫ */
    public final Context f38988;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC1018 f38989;

    public C1438(Context context, AbstractC1018 abstractC1018) {
        this.f38988 = context;
        this.f38989 = abstractC1018;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f38989.m12815();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f38989.m12808(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f38989.mo12814(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f38989.mo12807(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f38989.mo12819();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f38989.mo12804();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1889(this.f38988, this.f38989.mo12816());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f38989.mo12820();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f38989.mo12813(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f38989.mo12817();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f38989.mo12805(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f38989.mo12812();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f38989.mo12806(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f38989.mo12818();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f38989.m12810();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f38989.mo12809(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f38989.mo12811();
    }
}
