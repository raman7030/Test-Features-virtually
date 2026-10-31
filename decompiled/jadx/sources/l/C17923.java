package l;

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
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ᩳ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17923 extends AbstractC4311 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54739 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f54740;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f54741;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21696 f54742;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f54743;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewGroup f54744;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21696 f54745;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final LinearLayout f54746;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ImageView f54747;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17923(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17923(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54746 = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        float fM12954 = m12954(2.0f);
        this.f54743 = fM12954;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i3 = typedValue.data;
        this.f54741 = i3;
        this.f54740 = i3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14857.f45328);
            C11233.m27803(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(1, i3);
            this.f54741 = color;
            this.f54740 = typedArrayObtainStyledAttributes.getColor(5, color);
            this.f54743 = typedArrayObtainStyledAttributes.getDimension(6, fM12954);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m12957(0, 5);
            addView(m41930(false));
        }
        InterfaceC21950 interfaceC21950M12969 = m12969();
        if (interfaceC21950M12969 == null || !((C20746) interfaceC21950M12969).m47383()) {
            View view = this.f54747;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f54747);
            }
            ViewGroup viewGroupM41930 = m41930(false);
            this.f54744 = viewGroupM41930;
            this.f54747 = (ImageView) viewGroupM41930.findViewById(R.id.MT_Protector);
            addView(this.f54744);
            this.f54742 = new C21696(this.f54744, AbstractC1234.f4411);
            C22401 c22401 = new C22401(0.0f);
            c22401.m50264(1.0f);
            c22401.m50267(300.0f);
            C21696 c21696 = this.f54742;
            C11233.m27799(c21696);
            c21696.m48968(c22401);
            this.f54745 = new C21696(this.f54744, new C16511(this));
            C22401 c22402 = new C22401(0.0f);
            c22402.m50264(1.0f);
            c22402.m50267(300.0f);
            C21696 c21697 = this.f54745;
            C11233.m27799(c21697);
            c21697.m48968(c22402);
        }
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ֫ */
    public final void mo12956(final int i) {
        ViewGroup viewGroupM41930 = m41930(true);
        viewGroupM41930.setOnClickListener(new View.OnClickListener() { // from class: l.֫۠ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C17923.f54739;
                C17923 c17923 = this.f5881;
                if (c17923.m12963()) {
                    InterfaceC21950 interfaceC21950M12969 = c17923.m12969();
                    int iM47379 = interfaceC21950M12969 != null ? ((C20746) interfaceC21950M12969).m47379() : 0;
                    int i3 = i;
                    if (i3 < iM47379) {
                        InterfaceC21950 interfaceC21950M129610 = c17923.m12969();
                        C11233.m27799(interfaceC21950M129610);
                        ((C20746) interfaceC21950M129610).m47380(i3);
                    }
                }
            }
        });
        View viewFindViewById = viewGroupM41930.findViewById(R.id.MT_Protector);
        C11233.m27800((Object) viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f13900.add((ImageView) viewFindViewById);
        this.f54746.addView(viewGroupM41930);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final ViewGroup m41930(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        C11233.m27800((Object) viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        viewFindViewById.setBackgroundResource(z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int iM12966 = (int) m12966();
        layoutParams2.height = iM12966;
        layoutParams2.width = iM12966;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m12964(), 0, (int) m12964(), 0);
        m41932(viewFindViewById, z);
        return viewGroup;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m41932(View view, boolean z) {
        Drawable background = view.getBackground();
        C11233.m27800((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f54743, this.f54740);
        } else {
            gradientDrawable.setColor(this.f54741);
        }
        gradientDrawable.setCornerRadius(m12967());
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۧ */
    public final void mo12962(int i) {
        Object obj = this.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        m41932((View) obj, true);
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۡ */
    public final void mo12960() {
        LinearLayout linearLayout = this.f54746;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C18473.m42953(this.f13900, 1);
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11367 mo12955() {
        return new C10868(this);
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۜ */
    public final EnumC19834 mo12959() {
        return EnumC19834.WORM;
    }
}
