package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۜ */
/* JADX INFO: compiled from: I4IH */
/* JADX INFO: loaded from: classes3.dex */
public class C1239 extends LinearLayout implements InterfaceC2029, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ֫֫ */
    public ImageView f27603;

    /* JADX INFO: renamed from: ۗ */
    public ImageView f27604;

    /* JADX INFO: renamed from: ۙ */
    public boolean f27605;

    /* JADX INFO: renamed from: ۛ */
    public C1134 f27606;

    /* JADX INFO: renamed from: ۟ */
    public Drawable f27607;

    /* JADX INFO: renamed from: ۤ */
    public LayoutInflater f27608;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f27609;

    /* JADX INFO: renamed from: ۨ */
    public boolean f27610;

    /* JADX INFO: renamed from: ۫ */
    public ImageView f27611;

    /* JADX INFO: renamed from: ۬ */
    public boolean f27612;

    /* JADX INFO: renamed from: ܰ */
    public TextView f27613;

    /* JADX INFO: renamed from: ܽ֫ */
    public Context f27614;

    /* JADX INFO: renamed from: ᩳ֫ */
    public TextView f27615;

    /* JADX INFO: renamed from: ᩶ */
    public LinearLayout f27616;

    /* JADX INFO: renamed from: ᩸ */
    public Drawable f27617;

    /* JADX INFO: renamed from: ᩹ */
    public CheckBox f27618;

    /* JADX INFO: renamed from: ᩺ */
    public RadioButton f27619;

    @Override // p067l.InterfaceC2029
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public C1239(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1239(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1970 c1970M53129 = C1970.m53129(getContext(), attributeSet, C1010.f13511, i, 0);
        this.f27617 = c1970M53129.m53148(5);
        this.f27609 = c1970M53129.m53139(1, -1);
        this.f27610 = c1970M53129.m53134(7, false);
        this.f27614 = context;
        this.f27607 = c1970M53129.m53148(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.MT_Protector, 0);
        this.f27612 = typedArrayObtainStyledAttributes.hasValue(0);
        c1970M53129.m53146();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f27617);
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f27615 = textView;
        int i = this.f27609;
        if (i != -1) {
            textView.setTextAppearance(this.f27614, i);
        }
        this.f27613 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f27603 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f27607);
        }
        this.f27604 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27616 = (LinearLayout) findViewById(R.id.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    @Override // p067l.InterfaceC2029
    public final void initialize(C1134 c1134, int i) {
        CompoundButton compoundButton;
        View view;
        int i2;
        ImageView imageView;
        this.f27606 = c1134;
        setVisibility(c1134.isVisible() ? 0 : 8);
        CharSequence charSequenceM18373 = c1134.m18373(this);
        if (charSequenceM18373 != null) {
            this.f27615.setText(charSequenceM18373);
            if (this.f27615.getVisibility() != 0) {
                this.f27615.setVisibility(0);
            }
        } else if (this.f27615.getVisibility() != 8) {
            this.f27615.setVisibility(8);
        }
        boolean zIsCheckable = c1134.isCheckable();
        if (zIsCheckable || this.f27619 != null || this.f27618 != null) {
            if (this.f27606.m18381()) {
                if (this.f27619 == null) {
                    if (this.f27608 == null) {
                        this.f27608 = LayoutInflater.from(getContext());
                    }
                    RadioButton radioButton = (RadioButton) this.f27608.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f27619 = radioButton;
                    LinearLayout linearLayout = this.f27616;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f27619;
                view = this.f27618;
            } else {
                if (this.f27618 == null) {
                    if (this.f27608 == null) {
                        this.f27608 = LayoutInflater.from(getContext());
                    }
                    CheckBox checkBox = (CheckBox) this.f27608.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                    this.f27618 = checkBox;
                    LinearLayout linearLayout2 = this.f27616;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f27618;
                view = this.f27619;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.f27606.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            } else {
                CheckBox checkBox2 = this.f27618;
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton2 = this.f27619;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean z = true;
        boolean z2 = c1134.f20887.isShortcutsVisible() && c1134.m18388() != 0;
        c1134.m18388();
        if (z2) {
            C1134 c1135 = this.f27606;
            if (!c1135.f20887.isShortcutsVisible() || c1135.m18388() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            this.f27613.setText(this.f27606.m18384());
        }
        if (this.f27613.getVisibility() != i2) {
            this.f27613.setVisibility(i2);
        }
        Drawable icon = c1134.getIcon();
        if (!this.f27606.f20887.getOptionalIconsVisible() && !this.f27605) {
            z = false;
        }
        if ((z || this.f27610) && ((imageView = this.f27611) != null || icon != null || this.f27610)) {
            if (imageView == null) {
                if (this.f27608 == null) {
                    this.f27608 = LayoutInflater.from(getContext());
                }
                ImageView imageView2 = (ImageView) this.f27608.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
                this.f27611 = imageView2;
                LinearLayout linearLayout3 = this.f27616;
                if (linearLayout3 != null) {
                    linearLayout3.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (icon != null || this.f27610) {
                ImageView imageView3 = this.f27611;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f27611.getVisibility() != 0) {
                    this.f27611.setVisibility(0);
                }
            } else {
                this.f27611.setVisibility(8);
            }
        }
        setEnabled(c1134.isEnabled());
        boolean zHasSubMenu = c1134.hasSubMenu();
        ImageView imageView4 = this.f27603;
        if (imageView4 != null) {
            imageView4.setVisibility(zHasSubMenu ? 0 : 8);
        }
        setContentDescription(c1134.getContentDescription());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23278() {
        this.f27605 = true;
        this.f27610 = true;
    }

    @Override // p067l.InterfaceC2029
    public final C1134 getItemData() {
        return this.f27606;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f27611 != null && this.f27610) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f27611.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23279(boolean z) {
        ImageView imageView = this.f27604;
        if (imageView != null) {
            imageView.setVisibility((this.f27612 || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f27604;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27604.getLayoutParams();
        rect.top = this.f27604.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }
}
