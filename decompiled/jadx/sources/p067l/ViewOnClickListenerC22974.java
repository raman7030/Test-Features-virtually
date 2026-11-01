package p067l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC22974 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ */
    public LayoutInflater f72248;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f72249;

    /* JADX INFO: renamed from: ۛ */
    public C1058 f72250;

    /* JADX INFO: renamed from: ۫ */
    public final int f72252;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractActivityC5549 f72255;

    /* JADX INFO: renamed from: ᩹ */
    public View f72256;

    /* JADX INFO: renamed from: ᩺ */
    public static final int f72247 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۨ */
    public static final int f72246 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۤ */
    public ArrayList f72251 = new ArrayList(10);

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC16937 f72254 = null;

    /* JADX INFO: renamed from: ۬ */
    public C6353 f72253 = null;

    public ViewOnClickListenerC22974(Main main, View view) {
        this.f72255 = main;
        this.f72256 = view;
        this.f72248 = LayoutInflater.from(main);
        this.f72252 = main.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51300(View view, C10233 c10233) {
        if (c10233 != null) {
            CharSequence charSequence = c10233.f28356;
            boolean z = c10233.f28357;
            view.setTag(c10233);
            TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageTintList(C23223.f72979);
            textView.setText(charSequence);
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "￼");
                float textSize = textView.getTextSize();
                spannableStringBuilder.setSpan(new C3527(Math.max(C13076.m29939(4.0f), Math.round(0.28f * textSize)), Math.max(C13076.m29939(4.0f), Math.round(0.14f * textSize)), Math.max(1, Math.round(textSize * 0.02f))), length, length + 1, 33);
                charSequence = spannableStringBuilder;
            }
            textView.setText(charSequence);
            textView.setEllipsize(z ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END);
            int i = c10233.f28354;
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
            if (c10233.f28353) {
                view.setOnClickListener(this);
            } else if (z) {
                imageView.setDuplicateParentStateEnabled(false);
                textView.setDuplicateParentStateEnabled(false);
                imageView.setEnabled(false);
                textView.setEnabled(false);
            } else {
                view.setEnabled(false);
            }
            if (z) {
                view.setOnLongClickListener(this);
                return;
            }
            return;
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m51302() {
        if (!ApplicationC21448.f67649.getBoolean("sdrmlct", true)) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f72251;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C10233) arrayList.get(i)).f28357) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51299(View view) {
        int i = 0;
        view.findViewById(R.id.MT_Protector).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.double_row_menu_tip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.double_row_menu_tip_close);
        textView.setTextColor(C23223.f72980);
        String string = this.f72255.getString(R.string.MT_Protector, "￼");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("￼");
        if (iIndexOf >= 0) {
            float textSize = textView.getTextSize();
            int iMax = Math.max(C13076.m29939(4.0f), Math.round(0.28f * textSize));
            int iMax2 = Math.max(C13076.m29939(2.0f), Math.round(textSize * 0.06f));
            spannableStringBuilder.setSpan(new C3527(iMax, iMax2, iMax2), iIndexOf, iIndexOf + 1, 33);
        }
        textView.setText(spannableStringBuilder);
        imageView.setColorFilter(C23223.f72980);
        imageView.setOnClickListener(new ViewOnClickListenerC7551(this, view, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51301(ViewOnClickListenerC22974 viewOnClickListenerC22974, View view) {
        C1058 c1058;
        ApplicationC21448.f67649.edit().putBoolean("sdrmlct", false).apply();
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        if (Build.VERSION.SDK_INT > 22 || (c1058 = viewOnClickListenerC22974.f72250) == null || !c1058.isShowing()) {
            return;
        }
        View viewFindViewById = viewOnClickListenerC22974.f72250.getContentView().findViewById(R.id.double_row_menu_tip_text);
        C1058 c1059 = viewOnClickListenerC22974.f72250;
        c1059.setHeight((c1059.getHeight() - viewFindViewById.getHeight()) - 1);
        C1058 c10510 = viewOnClickListenerC22974.f72250;
        c10510.update(c10510.getWidth(), viewOnClickListenerC22974.f72250.getHeight());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51303() {
        int i;
        int i2;
        int i3;
        int iMakeMeasureSpec;
        C10233 c10233;
        int i4;
        AbstractActivityC5549 abstractActivityC5549 = this.f72255;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM12252.findViewById(R.id.linearLayout);
        C1058 c1058 = new C1058(abstractActivityC5549, null, R.attr.MT_Protector);
        this.f72250 = c1058;
        Drawable background = c1058.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            i = rect.left + rect.right;
            i2 = rect.top + rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        int i5 = this.f72252 - i;
        int i6 = 0;
        int measuredHeight = 0;
        int i7 = 0;
        int measuredHeight2 = 0;
        while (true) {
            ArrayList arrayList = this.f72251;
            int size = arrayList.size();
            i3 = f72246;
            iMakeMeasureSpec = f72247;
            if (i6 >= size) {
                break;
            }
            int i8 = i6 + 1;
            C10233 c10234 = (C10233) arrayList.get(i6);
            int i9 = i2;
            if (i8 != arrayList.size()) {
                i4 = i6 + 2;
                c10233 = (C10233) arrayList.get(i8);
            } else {
                c10233 = null;
                i4 = i8;
            }
            int i10 = i4;
            View viewInflate = this.f72248.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            if (measuredHeight == 0) {
                viewInflate.measure(iMakeMeasureSpec, i3);
                measuredHeight = viewInflate.getMeasuredHeight();
            }
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m51300(viewFindViewById, c10234);
            m51300(viewFindViewById2, c10233);
            linearLayout.addView(viewInflate);
            measuredHeight2 += measuredHeight;
            if (i7 != i5) {
                int iMax = Math.max(viewFindViewById.getMeasuredWidth(), viewFindViewById2.getMeasuredWidth()) << 1;
                if (iMax > i7) {
                    i7 = iMax;
                }
                if (i7 > i5) {
                    i7 = i5;
                }
            }
            i2 = i9;
            i6 = i10;
        }
        int i11 = i2;
        boolean zM51302 = m51302();
        if (zM51302) {
            m51299(viewM12252);
        }
        this.f72250.setContentView(viewM12252);
        if (Build.VERSION.SDK_INT <= 22) {
            if (zM51302) {
                if (i7 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                viewM12252.measure(iMakeMeasureSpec, i3);
                measuredHeight2 = viewM12252.getMeasuredHeight();
            }
            this.f72250.setWidth(i7 + i);
            int identifier = abstractActivityC5549.getResources().getIdentifier("status_bar_height", "dimen", "android");
            this.f72250.setHeight(Math.min(measuredHeight2 + i11, (abstractActivityC5549.getWindow().getDecorView().getHeight() - (identifier > 0 ? abstractActivityC5549.getResources().getDimensionPixelSize(identifier) : 0)) - i11));
        }
        this.f72250.setOutsideTouchable(true);
        this.f72250.setFocusable(true);
        this.f72250.setInputMethodMode(2);
        ((FrameLayout) abstractActivityC5549.m12277(android.R.id.content)).getChildAt(0).getWindowVisibleDisplayFrame(new Rect());
        View view = this.f72256;
        view.getLocationInWindow(new int[2]);
        this.f72250.showAtLocation(view, 17, 0, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51308() {
        C10233 c10233;
        AbstractActivityC5549 abstractActivityC5549 = this.f72255;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM12252.findViewById(R.id.linearLayout);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f72251;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C10233 c10234 = (C10233) arrayList.get(i);
            if (i2 != arrayList.size()) {
                i += 2;
                c10233 = (C10233) arrayList.get(i2);
            } else {
                c10233 = null;
                i = i2;
            }
            View viewInflate = this.f72248.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m51300(viewFindViewById, c10234);
            m51300(viewFindViewById2, c10233);
            linearLayout.addView(viewInflate);
        }
        if (m51302()) {
            m51299(viewM12252);
        }
        int i3 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        this.f72249 = c20671.m46732();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51309() {
        AbstractActivityC5549 abstractActivityC5549 = this.f72255;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewM12252.getLayoutParams();
        layoutParams.width = -1;
        viewM12252.setLayoutParams(layoutParams);
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.width = 0;
        viewFindViewById.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) viewM12252.findViewById(R.id.linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        layoutParams3.width = -1;
        linearLayout.setLayoutParams(layoutParams3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f72251;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C10233 c10233 = (C10233) arrayList.get(i);
            View viewInflate = this.f72248.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            m51300(viewInflate, c10233);
            linearLayout.addView(viewInflate);
            i = i2;
        }
        if (m51302()) {
            m51299(viewM12252);
        }
        int i3 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        this.f72249 = c20671.m46732();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        C12826.requireNonNull(tag);
        C10233 c10233 = (C10233) tag;
        if (c10233.f28353) {
            InterfaceC16937 interfaceC16937 = this.f72254;
            if (interfaceC16937 != null) {
                interfaceC16937.mo10648(c10233.f28355);
            }
            C1058 c1058 = this.f72250;
            if (c1058 != null) {
                c1058.dismiss();
                this.f72250 = null;
            }
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f72249;
            if (dialogInterfaceC2564 != null) {
                dialogInterfaceC2564.dismiss();
                this.f72249 = null;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C6353 c6353;
        Object tag = view.getTag();
        C12826.requireNonNull(tag);
        C10233 c10233 = (C10233) tag;
        if (!c10233.f28357 || (c6353 = this.f72253) == null) {
            return false;
        }
        if (!C18107.m41207(c6353.f16460, c6353.f16461, c6353.f16462, c6353.f16463, c10233.f28355)) {
            return false;
        }
        C1058 c1058 = this.f72250;
        if (c1058 != null) {
            c1058.dismiss();
            this.f72250 = null;
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f72249;
        if (dialogInterfaceC2564 == null) {
            return true;
        }
        dialogInterfaceC2564.dismiss();
        this.f72249 = null;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51304(int i, int i2) {
        this.f72251.add(new C10233(this.f72255.getString(i), i2, 0, true, false));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51305(String str, int i, int i2, boolean z, boolean z2) {
        this.f72251.add(new C10233(str, i, i2, z, z2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51307(InterfaceC16937 interfaceC16937) {
        this.f72254 = interfaceC16937;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51306(C6353 c6353) {
        this.f72253 = c6353;
    }
}
