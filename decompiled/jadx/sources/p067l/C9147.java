package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.۟֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9147 extends AbstractC6465 {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final /* synthetic */ int f24787 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public int f24788;

    /* JADX INFO: renamed from: ۛ */
    public float f24789;

    /* JADX INFO: renamed from: ۟ */
    public ViewGroup f24790;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f24791;

    /* JADX INFO: renamed from: ۨ */
    public int f24792;

    /* JADX INFO: renamed from: ܰ */
    public C22988 f24793;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f24794;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final LinearLayout f24795;

    /* JADX INFO: renamed from: ᩺ */
    public final float f24796;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9147(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9147(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24795 = linearLayout;
        float fM14818 = m14818(24.0f);
        setClipToPadding(false);
        int i2 = (int) fM14818;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        float fM14819 = m14818(2.0f);
        this.f24791 = fM14819;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f24792 = i3;
        this.f24788 = i3;
        this.f24794 = 300.0f;
        this.f24789 = 0.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16489.f48443);
            C13045.m29865(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(2, i3);
            this.f24792 = color;
            this.f24788 = typedArrayObtainStyledAttributes.getColor(6, color);
            this.f24794 = typedArrayObtainStyledAttributes.getFloat(8, 300.0f);
            this.f24789 = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            this.f24791 = typedArrayObtainStyledAttributes.getDimension(7, fM14819);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f24796 = m14830();
        if (isInEditMode()) {
            m14821(0, 5);
            addView(m21091(false));
        }
        InterfaceC23229 interfaceC23229M14833 = m14833();
        if (interfaceC23229M14833 == null || !((C22085) interfaceC23229M14833).m49710()) {
            View view = this.f24790;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f24790);
            }
            ViewGroup viewGroupM21091 = m21091(false);
            this.f24790 = viewGroupM21091;
            addView(viewGroupM21091);
            this.f24793 = new C22988(this.f24790, AbstractC3541.f7180);
            C23658 c23658 = new C23658(0.0f);
            c23658.m52604(this.f24789);
            c23658.m52607(this.f24794);
            C22988 c22988 = this.f24793;
            C13045.m29861(c22988);
            c22988.m51317(c23658);
        }
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final void mo14820(final int i) {
        ViewGroup viewGroupM21091 = m21091(true);
        viewGroupM21091.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C9147.f24787;
                C9147 c9147 = this.f75892;
                if (c9147.m14827()) {
                    InterfaceC23229 interfaceC23229M14833 = c9147.m14833();
                    int iM49706 = interfaceC23229M14833 != null ? ((C22085) interfaceC23229M14833).m49706() : 0;
                    int i3 = i;
                    if (i3 < iM49706) {
                        InterfaceC23229 interfaceC23229M14834 = c9147.m14833();
                        C13045.m29861(interfaceC23229M14834);
                        ((C22085) interfaceC23229M14834).m49707(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM21091.findViewById(R.id.MT_Protector);
        C13045.m29862((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f16715.add((ImageView) viewFindViewById);
        this.f24795.addView(viewGroupM21091);
    }

    /* JADX INFO: renamed from: ֫ */
    private final ViewGroup m21091(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C13045.m29862((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.MT_Protector);
        imageView.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM14830 = (int) (z ? m14830() : this.f24796);
        layoutParams2.height = iM14830;
        layoutParams2.width = iM14830;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m14828(), 0, (int) m14828(), 0);
        m21093(imageView, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m21093(View view, boolean z) {
        Drawable background = view.findViewById(R.id.MT_Protector).getBackground();
        C13045.m29862((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f24791, this.f24788);
        } else {
            gradientDrawable.setColor(this.f24792);
        }
        gradientDrawable.setCornerRadius(m14831());
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۡ */
    public final void mo14824() {
        LinearLayout linearLayout = this.f24795;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19925.m45229(this.f16715, 1);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۧ */
    public final void mo14826(int i) {
        Object obj = this.f16715.get(i);
        C13045.m29865(obj, "get(...)");
        m21093((View) obj, true);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13171 mo14819() {
        return new C15181(this);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۜ */
    public final EnumC21218 mo14823() {
        return EnumC21218.SPRING;
    }
}
