package l;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C4IM */
/* JADX INFO: loaded from: classes3.dex */
public class C14433 extends ImageView {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44241;

    public C14433(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5262 c5262M21453 = C8084.m21453(this, attributeSet, 0);
        this.f44241 = c5262M21453.f3757;
        int i = c5262M21453.f16467;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = c5262M21453.f16466;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    public C14433(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5262 c5262M21453 = C8084.m21453(this, attributeSet, i);
        this.f44241 = c5262M21453.f3757;
        int i2 = c5262M21453.f16467;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
        int i3 = c5262M21453.f16466;
        if (i3 > 0) {
            super.setBackgroundResource(i3);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        List list = C8084.f24900;
        if (uri != null) {
            try {
                setImageDrawable(new C1734(getContext().getContentResolver(), uri));
                return;
            } catch (IOException unused) {
            }
        }
        super.setImageURI(uri);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (C8084.m21455((ImageView) this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        if (C8084.m21455((ImageView) this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z = this.f44241;
        return new C0322(super.onSaveInstanceState(), z ? getDrawable() : null, z ? getBackground() : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0322)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0322 c0322 = (C0322) parcelable;
        super.onRestoreInstanceState(c0322.getSuperState());
        c0322.m1731(getDrawable(), 0);
        c0322.m1731(getBackground(), 1);
    }
}
