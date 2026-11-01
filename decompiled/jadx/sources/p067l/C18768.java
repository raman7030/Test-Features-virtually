package p067l;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 14K2 */
/* JADX INFO: loaded from: classes4.dex */
public class C18768 extends ImageButton {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56087;

    public C18768(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7369 c7369M23421 = C10051.m23421(this, attributeSet, 0);
        this.f56087 = c7369M23421.f6529;
        int i = c7369M23421.f19304;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = c7369M23421.f19303;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    public C18768(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7369 c7369M23421 = C10051.m23421(this, attributeSet, i);
        this.f56087 = c7369M23421.f6529;
        int i2 = c7369M23421.f19304;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
        int i3 = c7369M23421.f19303;
        if (i3 > 0) {
            super.setBackgroundResource(i3);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        List list = C10051.f27811;
        if (uri != null) {
            try {
                setImageDrawable(new C4016(getContext().getContentResolver(), uri));
                return;
            } catch (IOException unused) {
            }
        }
        super.setImageURI(uri);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (C10051.m23423((ImageView) this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        if (C10051.m23423((ImageView) this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z = this.f56087;
        return new C2674(super.onSaveInstanceState(), z ? getDrawable() : null, z ? getBackground() : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2674)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2674 c2674 = (C2674) parcelable;
        super.onRestoreInstanceState(c2674.getSuperState());
        c2674.m4129(getDrawable(), 0);
        c2674.m4129(getBackground(), 1);
    }
}
