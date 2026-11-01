package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes5.dex */
public class C20474 extends C4360 {

    /* JADX INFO: renamed from: ֫ۧ */
    public int f63229;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f63230;

    /* JADX INFO: renamed from: ۟֫ */
    public final View.OnKeyListener f63231;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f63232;

    /* JADX INFO: renamed from: ۧۧ */
    public TextView f63233;

    /* JADX INFO: renamed from: ۨ֫ */
    public SeekBar f63234;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f63235;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f63236;

    /* JADX INFO: renamed from: ܽۧ */
    public boolean f63237;

    /* JADX INFO: renamed from: ܿۧ */
    public boolean f63238;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f63239;

    /* JADX INFO: renamed from: ᩺֫ */
    public final SeekBar.OnSeekBarChangeListener f63240;

    public C20474(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f63240 = new C11086(this);
        this.f63231 = new ViewOnKeyListenerC17790(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32864, i, 0);
        this.f63230 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i3 = this.f63230;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f63232) {
            this.f63232 = i2;
            mo9048();
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f63236) {
            this.f63236 = Math.min(this.f63232 - this.f63230, Math.abs(i4));
            mo9048();
        }
        this.f63235 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f63237 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f63238 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C20474(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        c22486.itemView.setOnKeyListener(this.f63231);
        this.f63234 = (SeekBar) c22486.m50437(R.id.MT_Protector);
        TextView textView = (TextView) c22486.m50437(R.id.MT_Protector);
        this.f63233 = textView;
        if (this.f63237) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f63233 = null;
        }
        SeekBar seekBar = this.f63234;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f63240);
        this.f63234.setMax(this.f63232 - this.f63230);
        int i = this.f63236;
        if (i != 0) {
            this.f63234.setKeyProgressIncrement(i);
        } else {
            this.f63236 = this.f63234.getKeyProgressIncrement();
        }
        this.f63234.setProgress(this.f63229 - this.f63230);
        m46181(this.f63229);
        this.f63234.setEnabled(mo9062());
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9021(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m46179(m9011(((Integer) obj).intValue()), true);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9013(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46179(int i, boolean z) {
        int i2 = this.f63230;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f63232;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f63229) {
            this.f63229 = i;
            m46181(i);
            m9040(i);
            if (z) {
                mo9048();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46180(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f63230;
        if (progress != this.f63229) {
            m9019((Serializable) Integer.valueOf(progress));
            m46179(progress, false);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m46181(int i) {
        TextView textView = this.f63233;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m9032()) {
            return absSavedState;
        }
        C6392 c6392 = new C6392();
        c6392.f16540 = this.f63229;
        c6392.f16542 = this.f63230;
        c6392.f16541 = this.f63232;
        return c6392;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C6392.class)) {
            super.mo9018(parcelable);
            return;
        }
        C6392 c6392 = (C6392) parcelable;
        super.mo9018(c6392.getSuperState());
        this.f63229 = c6392.f16540;
        this.f63230 = c6392.f16542;
        this.f63232 = c6392.f16541;
        mo9048();
    }
}
