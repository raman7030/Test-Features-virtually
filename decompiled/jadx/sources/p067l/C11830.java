package p067l;

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
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۤ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11830 extends AbstractC6465 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final /* synthetic */ int f33018 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public int f33019;

    /* JADX INFO: renamed from: ۛ */
    public final ArgbEvaluator f33020;

    /* JADX INFO: renamed from: ۟ */
    public boolean f33021;

    /* JADX INFO: renamed from: ۨ */
    public float f33022;

    /* JADX INFO: renamed from: ܰ */
    public LinearLayout f33023;

    /* JADX INFO: renamed from: ᩺ */
    public float f33024;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11830(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        this.f33020 = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33023 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f33023;
        if (linearLayout2 == null) {
            C13045.m29866("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.f33024 = 2.5f;
        if (attributeSet != null) {
            Context context2 = getContext();
            C13045.m29865(context2, "getContext(...)");
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C16489.f48442, 0, 0);
            this.f33019 = typedArrayObtainStyledAttributes.getColor(8, -16711681);
            m14825();
            float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
            this.f33024 = f;
            if (f < 1.0f) {
                this.f33024 = 1.0f;
            }
            this.f33021 = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f33022 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m14821(0, 5);
            m14832();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m27127() {
        return this.f33019;
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final void mo14820(final int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C13045.m29862((Object) layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        int iM14830 = (int) m14830();
        layoutParams2.height = iM14830;
        layoutParams2.width = iM14830;
        layoutParams2.setMargins((int) m14828(), 0, (int) m14828(), 0);
        C5124 c5124 = new C5124();
        c5124.setCornerRadius(m14831());
        if (isInEditMode()) {
            c5124.setColor(i == 0 ? this.f33019 : m14829());
        } else {
            InterfaceC23229 interfaceC23229M14833 = m14833();
            C13045.m29861(interfaceC23229M14833);
            c5124.setColor(((C22085) interfaceC23229M14833).m49709() == i ? this.f33019 : m14829());
        }
        imageView.setBackground(c5124);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.۬֨ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C11830.f33018;
                C11830 c11830 = this.f41425;
                if (c11830.m14827()) {
                    InterfaceC23229 interfaceC23229M14834 = c11830.m14833();
                    int iM49706 = interfaceC23229M14834 != null ? ((C22085) interfaceC23229M14834).m49706() : 0;
                    int i3 = i;
                    if (i3 < iM49706) {
                        InterfaceC23229 interfaceC23229M14835 = c11830.m14833();
                        C13045.m29861(interfaceC23229M14835);
                        ((C22085) interfaceC23229M14835).m49707(i3);
                    }
                }
            }
        });
        int i2 = (int) (this.f33022 * 0.8f);
        viewInflate.setPadding(i2, viewInflate.getPaddingTop(), i2, viewInflate.getPaddingBottom());
        int i3 = (int) (this.f33022 * 2);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i3, viewInflate.getPaddingRight(), i3);
        this.f16715.add(imageView);
        LinearLayout linearLayout = this.f33023;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        } else {
            C13045.m29866("linearLayout");
            throw null;
        }
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۡ */
    public final void mo14824() {
        LinearLayout linearLayout = this.f33023;
        if (linearLayout == null) {
            C13045.m29866("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            C13045.m29866("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C19925.m45229(this.f16715, 1);
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13171 mo14819() {
        return new C13841(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۧ */
    public final void mo14826(int i) {
        Object obj = this.f16715.get(i);
        C13045.m29865(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        Drawable background = imageView.getBackground();
        C5124 c5124 = background instanceof C5124 ? (C5124) background : null;
        if (c5124 != null) {
            InterfaceC23229 interfaceC23229M14833 = m14833();
            C13045.m29861(interfaceC23229M14833);
            if (i == ((C22085) interfaceC23229M14833).m49709()) {
                c5124.setColor(this.f33019);
            } else {
                if (this.f33021) {
                    InterfaceC23229 interfaceC23229M14834 = m14833();
                    C13045.m29861(interfaceC23229M14834);
                    if (i < ((C22085) interfaceC23229M14834).m49709()) {
                        c5124.setColor(this.f33019);
                    }
                }
                c5124.setColor(m14829());
            }
        }
        imageView.setBackground(c5124);
        imageView.invalidate();
    }

    @Override // p067l.AbstractC6465
    /* JADX INFO: renamed from: ۜ */
    public final EnumC21218 mo14823() {
        return EnumC21218.DEFAULT;
    }
}
