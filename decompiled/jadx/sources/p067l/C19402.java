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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ᩳ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19402 extends AbstractC6465 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final /* synthetic */ int f57936 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public int f57937;

    /* JADX INFO: renamed from: ۛ */
    public int f57938;

    /* JADX INFO: renamed from: ۟ */
    public C22988 f57939;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f57940;

    /* JADX INFO: renamed from: ۨ */
    public ViewGroup f57941;

    /* JADX INFO: renamed from: ܰ */
    public C22988 f57942;

    /* JADX INFO: renamed from: ܽ֫ */
    public final LinearLayout f57943;

    /* JADX INFO: renamed from: ᩺ */
    public ImageView f57944;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19402(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19402(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57943 = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        float fM14818 = m14818(2.0f);
        this.f57940 = fM14818;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f57938 = i3;
        this.f57937 = i3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16489.f48444);
            C13045.m29865(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(1, i3);
            this.f57938 = color;
            this.f57937 = typedArrayObtainStyledAttributes.getColor(5, color);
            this.f57940 = typedArrayObtainStyledAttributes.getDimension(6, fM14818);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m14821(0, 5);
            addView(m44179(false));
        }
        InterfaceC23229 interfaceC23229M14833 = m14833();
        if (interfaceC23229M14833 == null || !((C22085) interfaceC23229M14833).m49710()) {
            View view = this.f57944;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f57944);
            }
            ViewGroup viewGroupM44179 = m44179(false);
            this.f57941 = viewGroupM44179;
            this.f57944 = (ImageView) viewGroupM44179.findViewById(R.id.MT_Protector);
            addView(this.f57941);
            this.f57939 = new C22988(this.f57941, AbstractC3541.f7180);
            C23658 c23658 = new C23658(0.0f);
            c23658.m52604(1.0f);
            c23658.m52607(300.0f);
            C22988 c22988 = this.f57939;
            C13045.m29861(c22988);
            c22988.m51317(c23658);
            this.f57942 = new C22988(this.f57941, new C18060(this));
            C23658 c23659 = new C23658(0.0f);
            c23659.m52604(1.0f);
            c23659.m52607(300.0f);
            C22988 c22989 = this.f57942;
            C13045.m29861(c22989);
            c22989.m51317(c23659);
        }
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final void mo14820(final int i) {
        ViewGroup viewGroupM44179 = m44179(true);
        viewGroupM44179.setOnClickListener(new View.OnClickListener() { // from class: l.֫۠ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C19402.f57936;
                C19402 c19402 = this.f8660;
                if (c19402.m14827()) {
                    InterfaceC23229 interfaceC23229M14833 = c19402.m14833();
                    int iM49706 = interfaceC23229M14833 != null ? ((C22085) interfaceC23229M14833).m49706() : 0;
                    int i3 = i;
                    if (i3 < iM49706) {
                        InterfaceC23229 interfaceC23229M14834 = c19402.m14833();
                        C13045.m29861(interfaceC23229M14834);
                        ((C22085) interfaceC23229M14834).m49707(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM44179.findViewById(R.id.MT_Protector);
        C13045.m29862((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f16715.add((ImageView) viewFindViewById);
        this.f57943.addView(viewGroupM44179);
    }

    /* JADX INFO: renamed from: ֫ */
    private final ViewGroup m44179(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C13045.m29862((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        viewFindViewById.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM14830 = (int) m14830();
        layoutParams2.height = iM14830;
        layoutParams2.width = iM14830;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m14828(), 0, (int) m14828(), 0);
        m44181(viewFindViewById, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m44181(View view, boolean z) {
        Drawable background = view.getBackground();
        C13045.m29862((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f57940, this.f57937);
        } else {
            gradientDrawable.setColor(this.f57938);
        }
        gradientDrawable.setCornerRadius(m14831());
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۧ */
    public final void mo14826(int i) {
        Object obj = this.f16715.get(i);
        C13045.m29865(obj, "get(...)");
        m44181((View) obj, true);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۡ */
    public final void mo14824() {
        LinearLayout linearLayout = this.f57943;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19925.m45229(this.f16715, 1);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13171 mo14819() {
        return new C12697(this);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۜ */
    public final EnumC21218 mo14823() {
        return EnumC21218.WORM;
    }
}
