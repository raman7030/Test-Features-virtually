package l;

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
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC21681 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f69543;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f69544;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4348 f69545;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f69547;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f69550;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f69551;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f69542 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f69541 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f69546 = new ArrayList(10);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15329 f69549 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4192 f69548 = null;

    public ViewOnClickListenerC21681(Main main, View view) {
        this.f69550 = main;
        this.f69551 = view;
        this.f69543 = LayoutInflater.from(main);
        this.f69547 = main.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48951(View view, C8275 c8275) {
        if (c8275 != null) {
            CharSequence charSequence = c8275.f25446;
            boolean z = c8275.f25447;
            view.setTag(c8275);
            TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageTintList(C21943.f70268);
            textView.setText(charSequence);
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "￼");
                float textSize = textView.getTextSize();
                spannableStringBuilder.setSpan(new C1219(Math.max(C11266.m27878(4.0f), Math.round(0.28f * textSize)), Math.max(C11266.m27878(4.0f), Math.round(0.14f * textSize)), Math.max(1, Math.round(textSize * 0.02f))), length, length + 1, 33);
                charSequence = spannableStringBuilder;
            }
            textView.setText(charSequence);
            textView.setEllipsize(z ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END);
            int i = c8275.f25444;
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
            if (c8275.f25443) {
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m48953() {
        if (!ApplicationC20075.f65008.getBoolean("sdrmlct", true)) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C8275) arrayList.get(i)).f25447) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48950(View view) {
        int i = 0;
        view.findViewById(R.id.MT_Protector).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.double_row_menu_tip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.double_row_menu_tip_close);
        textView.setTextColor(C21943.f70269);
        String string = this.f69550.getString(R.string.MT_Protector, "￼");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf("￼");
        if (iIndexOf >= 0) {
            float textSize = textView.getTextSize();
            int iMax = Math.max(C11266.m27878(4.0f), Math.round(0.28f * textSize));
            int iMax2 = Math.max(C11266.m27878(2.0f), Math.round(textSize * 0.06f));
            spannableStringBuilder.setSpan(new C1219(iMax, iMax2, iMax2), iIndexOf, iIndexOf + 1, 33);
        }
        textView.setText(spannableStringBuilder);
        imageView.setColorFilter(C21943.f70269);
        imageView.setOnClickListener(new ViewOnClickListenerC5453(this, view, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48952(ViewOnClickListenerC21681 viewOnClickListenerC21681, View view) {
        C4348 c4348;
        ApplicationC20075.f65008.edit().putBoolean("sdrmlct", false).apply();
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        if (Build.VERSION.SDK_INT > 22 || (c4348 = viewOnClickListenerC21681.f69545) == null || !c4348.isShowing()) {
            return;
        }
        View viewFindViewById = viewOnClickListenerC21681.f69545.getContentView().findViewById(R.id.double_row_menu_tip_text);
        C4348 c4349 = viewOnClickListenerC21681.f69545;
        c4349.setHeight((c4349.getHeight() - viewFindViewById.getHeight()) - 1);
        C4348 c43410 = viewOnClickListenerC21681.f69545;
        c43410.update(c43410.getWidth(), viewOnClickListenerC21681.f69545.getHeight());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48954() {
        int i;
        int i2;
        int i3;
        int iMakeMeasureSpec;
        C8275 c8275;
        int i4;
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM10216.findViewById(R.id.linearLayout);
        C4348 c4348 = new C4348(abstractActivityC3346, null, R.attr.MT_Protector);
        this.f69545 = c4348;
        Drawable background = c4348.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            i = rect.left + rect.right;
            i2 = rect.top + rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        int i5 = this.f69547 - i;
        int i6 = 0;
        int measuredHeight = 0;
        int i7 = 0;
        int measuredHeight2 = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            int size = arrayList.size();
            i3 = f69541;
            iMakeMeasureSpec = f69542;
            if (i6 >= size) {
                break;
            }
            int i8 = i6 + 1;
            C8275 c8276 = (C8275) arrayList.get(i6);
            int i9 = i2;
            if (i8 != arrayList.size()) {
                i4 = i6 + 2;
                c8275 = (C8275) arrayList.get(i8);
            } else {
                c8275 = null;
                i4 = i8;
            }
            int i10 = i4;
            View viewInflate = this.f69543.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            if (measuredHeight == 0) {
                viewInflate.measure(iMakeMeasureSpec, i3);
                measuredHeight = viewInflate.getMeasuredHeight();
            }
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m48951(viewFindViewById, c8276);
            m48951(viewFindViewById2, c8275);
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
        boolean zM48953 = m48953();
        if (zM48953) {
            m48950(viewM10216);
        }
        this.f69545.setContentView(viewM10216);
        if (Build.VERSION.SDK_INT <= 22) {
            if (zM48953) {
                if (i7 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                viewM10216.measure(iMakeMeasureSpec, i3);
                measuredHeight2 = viewM10216.getMeasuredHeight();
            }
            this.f69545.setWidth(i7 + i);
            int identifier = abstractActivityC3346.getResources().getIdentifier("status_bar_height", "dimen", "android");
            this.f69545.setHeight(Math.min(measuredHeight2 + i11, (abstractActivityC3346.getWindow().getDecorView().getHeight() - (identifier > 0 ? abstractActivityC3346.getResources().getDimensionPixelSize(identifier) : 0)) - i11));
        }
        this.f69545.setOutsideTouchable(true);
        this.f69545.setFocusable(true);
        this.f69545.setInputMethodMode(2);
        ((FrameLayout) abstractActivityC3346.m10241(android.R.id.content)).getChildAt(0).getWindowVisibleDisplayFrame(new Rect());
        View view = this.f69551;
        view.getLocationInWindow(new int[2]);
        this.f69545.showAtLocation(view, 17, 0, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48959() {
        C8275 c8275;
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        LinearLayout linearLayout = (LinearLayout) viewM10216.findViewById(R.id.linearLayout);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C8275 c8276 = (C8275) arrayList.get(i);
            if (i2 != arrayList.size()) {
                i += 2;
                c8275 = (C8275) arrayList.get(i2);
            } else {
                c8275 = null;
                i = i2;
            }
            View viewInflate = this.f69543.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
            View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
            m48951(viewFindViewById, c8276);
            m48951(viewFindViewById2, c8275);
            linearLayout.addView(viewInflate);
        }
        if (m48953()) {
            m48950(viewM10216);
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        this.f69544 = c19258.m44438();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48960() {
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ViewGroup.LayoutParams layoutParams = viewM10216.getLayoutParams();
        layoutParams.width = -1;
        viewM10216.setLayoutParams(layoutParams);
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.width = 0;
        viewFindViewById.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) viewM10216.findViewById(R.id.linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        layoutParams3.width = -1;
        linearLayout.setLayoutParams(layoutParams3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C8275 c8275 = (C8275) arrayList.get(i);
            View viewInflate = this.f69543.inflate(R.layout.MT_Protector, (ViewGroup) linearLayout, false);
            m48951(viewInflate, c8275);
            linearLayout.addView(viewInflate);
            i = i2;
        }
        if (m48953()) {
            m48950(viewM10216);
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        this.f69544 = c19258.m44438();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        C11003.requireNonNull(tag);
        C8275 c8275 = (C8275) tag;
        if (c8275.f25443) {
            InterfaceC15329 interfaceC15329 = this.f69549;
            if (interfaceC15329 != null) {
                interfaceC15329.mo8585(c8275.f25445);
            }
            C4348 c4348 = this.f69545;
            if (c4348 != null) {
                c4348.dismiss();
                this.f69545 = null;
            }
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f69544;
            if (dialogInterfaceC0206 != null) {
                dialogInterfaceC0206.dismiss();
                this.f69544 = null;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C4192 c4192;
        Object tag = view.getTag();
        C11003.requireNonNull(tag);
        C8275 c8275 = (C8275) tag;
        if (!c8275.f25447 || (c4192 = this.f69548) == null) {
            return false;
        }
        if (!C16560.m38981(c4192.f13647, c4192.f13648, c4192.f13649, c4192.f13650, c8275.f25445)) {
            return false;
        }
        C4348 c4348 = this.f69545;
        if (c4348 != null) {
            c4348.dismiss();
            this.f69545 = null;
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f69544;
        if (dialogInterfaceC0206 == null) {
            return true;
        }
        dialogInterfaceC0206.dismiss();
        this.f69544 = null;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48955(int i, int i2) {
        this.f69546.add(new C8275(this.f69550.getString(i), i2, 0, true, false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48956(String str, int i, int i2, boolean z, boolean z2) {
        this.f69546.add(new C8275(str, i, i2, z, z2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48958(InterfaceC15329 interfaceC15329) {
        this.f69549 = interfaceC15329;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48957(C4192 c4192) {
        this.f69548 = c4192;
    }
}
