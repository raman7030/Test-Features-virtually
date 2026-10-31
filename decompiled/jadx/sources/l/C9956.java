package l;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۤ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9956 extends AbstractC4311 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30061 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f30062;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArgbEvaluator f30063;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f30064;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f30065;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinearLayout f30066;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f30067;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9956(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9956(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        this.f30063 = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f30066 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f30066;
        if (linearLayout2 == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.f30067 = 2.5f;
        if (attributeSet != null) {
            Context context2 = getContext();
            C11233.m27803(context2, "getContext(...)");
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C14857.f45326, 0, 0);
            this.f30062 = typedArrayObtainStyledAttributes.getColor(8, -16711681);
            m12961();
            float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
            this.f30067 = f;
            if (f < 1.0f) {
                this.f30067 = 1.0f;
            }
            this.f30064 = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f30065 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m12957(0, 5);
            m12968();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m25110() {
        return this.f30062;
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ֫ */
    public final void mo12956(final int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        int iM12966 = (int) m12966();
        layoutParams2.height = iM12966;
        layoutParams2.width = iM12966;
        layoutParams2.setMargins((int) m12964(), 0, (int) m12964(), 0);
        C2900 c2900 = new C2900();
        c2900.setCornerRadius(m12967());
        if (isInEditMode()) {
            c2900.setColor(i == 0 ? this.f30062 : m12965());
        } else {
            InterfaceC21950 interfaceC21950M12969 = m12969();
            C11233.m27799(interfaceC21950M12969);
            c2900.setColor(((C20746) interfaceC21950M12969).m47382() == i ? this.f30062 : m12965());
        }
        imageView.setBackground(c2900);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.۬֨ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C9956.f30061;
                C9956 c9956 = this.f38385;
                if (c9956.m12963()) {
                    InterfaceC21950 interfaceC21950M129610 = c9956.m12969();
                    int iM47379 = interfaceC21950M129610 != null ? ((C20746) interfaceC21950M129610).m47379() : 0;
                    int i3 = i;
                    if (i3 < iM47379) {
                        InterfaceC21950 interfaceC21950M129611 = c9956.m12969();
                        C11233.m27799(interfaceC21950M129611);
                        ((C20746) interfaceC21950M129611).m47380(i3);
                    }
                }
            }
        });
        int i2 = (int) (this.f30065 * 0.8f);
        viewInflate.setPadding(i2, viewInflate.getPaddingTop(), i2, viewInflate.getPaddingBottom());
        int i3 = (int) (this.f30065 * 2);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i3, viewInflate.getPaddingRight(), i3);
        this.f13900.add(imageView);
        LinearLayout linearLayout = this.f30066;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        } else {
            C11233.m27804("linearLayout");
            throw null;
        }
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۡ */
    public final void mo12960() {
        LinearLayout linearLayout = this.f30066;
        if (linearLayout == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C18473.m42953(this.f13900, 1);
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11367 mo12955() {
        return new C12072(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۧ */
    public final void mo12962(int i) {
        Object obj = this.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        Drawable background = imageView.getBackground();
        C2900 c2900 = background instanceof C2900 ? (C2900) background : null;
        if (c2900 != null) {
            InterfaceC21950 interfaceC21950M12969 = m12969();
            C11233.m27799(interfaceC21950M12969);
            if (i == ((C20746) interfaceC21950M12969).m47382()) {
                c2900.setColor(this.f30062);
            } else {
                if (this.f30064) {
                    InterfaceC21950 interfaceC21950M129610 = m12969();
                    C11233.m27799(interfaceC21950M129610);
                    if (i < ((C20746) interfaceC21950M129610).m47382()) {
                        c2900.setColor(this.f30062);
                    }
                }
                c2900.setColor(m12965());
            }
        }
        imageView.setBackground(c2900);
        imageView.invalidate();
    }

    @Override // l.AbstractC4311
    /* JADX INFO: renamed from: ۜ */
    public final EnumC19834 mo12959() {
        return EnumC19834.DEFAULT;
    }
}
