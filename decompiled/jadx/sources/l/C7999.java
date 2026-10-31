package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4IH */
/* JADX INFO: loaded from: classes3.dex */
public class C7999 extends LinearLayout implements InterfaceC23935, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ImageView f24689;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ImageView f24690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24691;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5882 f24692;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable f24693;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f24694;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f24695;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24696;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ImageView f24697;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f24698;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f24699;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Context f24700;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public TextView f24701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinearLayout f24702;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f24703;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CheckBox f24704;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public RadioButton f24705;

    @Override // l.InterfaceC23935
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public C7999(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C7999(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C22733 c22733M50796 = C22733.m50796(getContext(), attributeSet, C3390.f10704, i, 0);
        this.f24703 = c22733M50796.m50815(5);
        this.f24695 = c22733M50796.m50806(1, -1);
        this.f24696 = c22733M50796.m50801(7, false);
        this.f24700 = context;
        this.f24693 = c22733M50796.m50815(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.MT_Protector, 0);
        this.f24698 = typedArrayObtainStyledAttributes.hasValue(0);
        c22733M50796.m50813();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f24703);
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f24701 = textView;
        int i = this.f24695;
        if (i != -1) {
            textView.setTextAppearance(this.f24700, i);
        }
        this.f24699 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f24689 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f24693);
        }
        this.f24690 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24702 = (LinearLayout) findViewById(R.id.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    @Override // l.InterfaceC23935
    public final void initialize(C5882 c5882, int i) {
        CompoundButton compoundButton;
        View view;
        int i2;
        ImageView imageView;
        this.f24692 = c5882;
        setVisibility(c5882.isVisible() ? 0 : 8);
        CharSequence charSequenceM16447 = c5882.m16447(this);
        if (charSequenceM16447 != null) {
            this.f24701.setText(charSequenceM16447);
            if (this.f24701.getVisibility() != 0) {
                this.f24701.setVisibility(0);
            }
        } else if (this.f24701.getVisibility() != 8) {
            this.f24701.setVisibility(8);
        }
        boolean zIsCheckable = c5882.isCheckable();
        if (zIsCheckable || this.f24705 != null || this.f24704 != null) {
            if (this.f24692.m16455()) {
                if (this.f24705 == null) {
                    if (this.f24694 == null) {
                        this.f24694 = LayoutInflater.from(getContext());
                    }
                    RadioButton radioButton = (RadioButton) this.f24694.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f24705 = radioButton;
                    LinearLayout linearLayout = this.f24702;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f24705;
                view = this.f24704;
            } else {
                if (this.f24704 == null) {
                    if (this.f24694 == null) {
                        this.f24694 = LayoutInflater.from(getContext());
                    }
                    CheckBox checkBox = (CheckBox) this.f24694.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f24704 = checkBox;
                    LinearLayout linearLayout2 = this.f24702;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f24704;
                view = this.f24705;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.f24692.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            } else {
                CheckBox checkBox2 = this.f24704;
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton2 = this.f24705;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean z = true;
        boolean z2 = c5882.f18032.isShortcutsVisible() && c5882.m16462() != 0;
        c5882.m16462();
        if (z2) {
            C5882 c5883 = this.f24692;
            if (!c5883.f18032.isShortcutsVisible() || c5883.m16462() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            this.f24699.setText(this.f24692.m16458());
        }
        if (this.f24699.getVisibility() != i2) {
            this.f24699.setVisibility(i2);
        }
        Drawable icon = c5882.getIcon();
        if (!this.f24692.f18032.getOptionalIconsVisible() && !this.f24691) {
            z = false;
        }
        if ((z || this.f24696) && ((imageView = this.f24697) != null || icon != null || this.f24696)) {
            if (imageView == null) {
                if (this.f24694 == null) {
                    this.f24694 = LayoutInflater.from(getContext());
                }
                ImageView imageView2 = (ImageView) this.f24694.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                this.f24697 = imageView2;
                LinearLayout linearLayout3 = this.f24702;
                if (linearLayout3 != null) {
                    linearLayout3.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (icon != null || this.f24696) {
                ImageView imageView3 = this.f24697;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f24697.getVisibility() != 0) {
                    this.f24697.setVisibility(0);
                }
            } else {
                this.f24697.setVisibility(8);
            }
        }
        setEnabled(c5882.isEnabled());
        boolean zHasSubMenu = c5882.hasSubMenu();
        ImageView imageView4 = this.f24689;
        if (imageView4 != null) {
            imageView4.setVisibility(zHasSubMenu ? 0 : 8);
        }
        setContentDescription(c5882.getContentDescription());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21312() {
        this.f24691 = true;
        this.f24696 = true;
    }

    @Override // l.InterfaceC23935
    public final C5882 getItemData() {
        return this.f24692;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f24697 != null && this.f24696) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f24697.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21313(boolean z) {
        ImageView imageView = this.f24690;
        if (imageView != null) {
            imageView.setVisibility((this.f24698 || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f24690;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24690.getLayoutParams();
        rect.top = this.f24690.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }
}
