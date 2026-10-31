package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12315 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CompoundButton f36866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f36868;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ColorStateList f36864 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f36865 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f36867 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f36869 = false;

    public C12315(CompoundButton compoundButton) {
        this.f36866 = compoundButton;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29868(AttributeSet attributeSet, int i) {
        int iM50806;
        int iM50807;
        CompoundButton compoundButton = this.f36866;
        Context context = compoundButton.getContext();
        int[] iArr = C3390.f10699;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(compoundButton, compoundButton.getContext(), iArr, attributeSet, c22733M50796.m50810(), i);
        try {
            if (c22733M50796.m50802(1) && (iM50807 = c22733M50796.m50806(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C21311.m48345(compoundButton.getContext(), iM50807));
                } catch (Resources.NotFoundException unused) {
                    if (c22733M50796.m50802(0)) {
                        compoundButton.setButtonDrawable(C21311.m48345(compoundButton.getContext(), iM50806));
                    }
                }
            } else if (c22733M50796.m50802(0) && (iM50806 = c22733M50796.m50806(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C21311.m48345(compoundButton.getContext(), iM50806));
            }
            if (c22733M50796.m50802(2)) {
                C16323.m38470(compoundButton, c22733M50796.m50804(2));
            }
            if (c22733M50796.m50802(3)) {
                C16323.m38471(compoundButton, C15320.m36346(c22733M50796.m50809(3, -1), null));
            }
        } finally {
            c22733M50796.m50813();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29866(ColorStateList colorStateList) {
        this.f36864 = colorStateList;
        this.f36867 = true;
        m29865();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m29869() {
        return this.f36864;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29867(PorterDuff.Mode mode) {
        this.f36865 = mode;
        this.f36869 = true;
        m29865();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m29870() {
        return this.f36865;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29871() {
        if (this.f36868) {
            this.f36868 = false;
        } else {
            this.f36868 = true;
            m29865();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29865() {
        CompoundButton compoundButton = this.f36866;
        Drawable drawableM38469 = C16323.m38469(compoundButton);
        if (drawableM38469 != null) {
            if (this.f36867 || this.f36869) {
                Drawable drawableMutate = C8184.m21684(drawableM38469).mutate();
                if (this.f36867) {
                    C8184.m21676(drawableMutate, this.f36864);
                }
                if (this.f36869) {
                    C8184.m21679(drawableMutate, this.f36865);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
