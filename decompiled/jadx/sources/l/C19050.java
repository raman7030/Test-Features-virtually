package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes5.dex */
public class C19050 extends C2095 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f60000;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f60001;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final View.OnKeyListener f60002;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f60003;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public TextView f60004;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public SeekBar f60005;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f60006;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f60007;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f60008;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f60009;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f60010;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final SeekBar.OnSeekBarChangeListener f60011;

    public C19050(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f60011 = new C9172(this);
        this.f60002 = new ViewOnKeyListenerC16226(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29907, i, 0);
        this.f60001 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i3 = this.f60001;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f60003) {
            this.f60003 = i2;
            mo6922();
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f60007) {
            this.f60007 = Math.min(this.f60003 - this.f60001, Math.abs(i4));
            mo6922();
        }
        this.f60006 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f60008 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f60009 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C19050(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        c21167.itemView.setOnKeyListener(this.f60002);
        this.f60005 = (SeekBar) c21167.m48107(R.id.MT_Protector);
        TextView textView = (TextView) c21167.m48107(R.id.MT_Protector);
        this.f60004 = textView;
        if (this.f60008) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f60004 = null;
        }
        SeekBar seekBar = this.f60005;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f60011);
        this.f60005.setMax(this.f60003 - this.f60001);
        int i = this.f60007;
        if (i != 0) {
            this.f60005.setKeyProgressIncrement(i);
        } else {
            this.f60007 = this.f60005.getKeyProgressIncrement();
        }
        this.f60005.setProgress(this.f60000 - this.f60001);
        m43912(this.f60000);
        this.f60005.setEnabled(mo6936());
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6895(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m43910(m6885(((Integer) obj).intValue()), true);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43910(int i, boolean z) {
        int i2 = this.f60001;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f60003;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f60000) {
            this.f60000 = i;
            m43912(i);
            m6914(i);
            if (z) {
                mo6922();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43911(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f60001;
        if (progress != this.f60000) {
            m6893((Serializable) Integer.valueOf(progress));
            m43910(progress, false);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m43912(int i) {
        TextView textView = this.f60004;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C4233 c4233 = new C4233();
        c4233.f13727 = this.f60000;
        c4233.f13729 = this.f60001;
        c4233.f13728 = this.f60003;
        return c4233;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C4233.class)) {
            super.mo6892(parcelable);
            return;
        }
        C4233 c4233 = (C4233) parcelable;
        super.mo6892(c4233.getSuperState());
        this.f60000 = c4233.f13727;
        this.f60001 = c4233.f13729;
        this.f60003 = c4233.f13728;
        mo6922();
    }
}
