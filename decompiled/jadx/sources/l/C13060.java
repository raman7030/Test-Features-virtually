package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I6X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13060 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39082 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX WARN: Type inference failed for: r2v8, types: [l.᩶ۤ᩻] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31629(final AbstractActivityC3346 abstractActivityC3346, int i, C0421 c0421) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final ImageView imageView = (ImageView) viewM10216.findViewById(R.id.icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        int iM27878 = C11266.m27878(48.0f);
        marginLayoutParams.height = iM27878;
        marginLayoutParams.width = iM27878;
        marginLayoutParams.topMargin = C11266.m27878(4.0f);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setTranslationY(-marginLayoutParams.topMargin);
        final int[] iArr = {C21404.m48482(i)};
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.MT_Protector);
        int iRound = Math.round((Math.min(imageView.getLayoutParams().width, imageView.getLayoutParams().height) * 0.39999998f) / 2.0f);
        imageView.setPadding(iRound, iRound, iRound, iRound);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(abstractActivityC3346.getString(R.string.MT_Protector));
        int iM48483 = C21404.m48483(abstractActivityC3346, iArr[0]);
        gradientDrawable.setColor(iM48483);
        imageView.setImageTintList(ColorStateList.valueOf(C7466.m20002(iM48483) > 220 ? -12895429 : -1));
        ?? r2 = new View.OnClickListener() { // from class: l.᩶ۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                iArr[0] = iIntValue;
                int iM48484 = C21404.m48483(abstractActivityC3346, iIntValue);
                gradientDrawable.setColor(iM48484);
                imageView.setImageTintList(ColorStateList.valueOf(C7466.m20002(iM48484) > 220 ? -12895429 : -1));
            }
        };
        m31630(abstractActivityC3346, (ImageView) viewM10216.findViewById(R.id.MT_Protector), 16777216, C21404.m48483(abstractActivityC3346, 16777216), r2);
        m31630(abstractActivityC3346, (ImageView) viewM10216.findViewById(R.id.MT_Protector), 0, C21404.m48483(abstractActivityC3346, 0), r2);
        C16900 c16900 = (C16900) viewM10216.findViewById(R.id.MT_Protector).getLayoutParams();
        C16900 c16901 = (C16900) viewM10216.findViewById(R.id.MT_Protector).getLayoutParams();
        C16900 c16902 = (C16900) viewM10216.findViewById(R.id.MT_Protector).getLayoutParams();
        C16900 c16903 = (C16900) viewM10216.findViewById(R.id.divider).getLayoutParams();
        c16900.f51945 = R.id.MT_Protector;
        c16900.f51895 = R.id.MT_Protector;
        c16901.f51945 = R.id.MT_Protector;
        c16901.f51895 = R.id.MT_Protector;
        c16902.f51945 = R.id.MT_Protector;
        c16902.f51895 = R.id.MT_Protector;
        c16903.f51945 = R.id.MT_Protector;
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        for (int i2 = 0; i2 < 14; i2++) {
            ImageView imageView2 = (ImageView) viewM10216.findViewById(f39082[i2]);
            ColorStateList imageTintList = imageView2.getImageTintList();
            C11003.requireNonNull(imageTintList);
            int defaultColor = imageTintList.getDefaultColor();
            m31630(abstractActivityC3346, imageView2, defaultColor, defaultColor, r2);
        }
        ImageView imageView3 = (ImageView) viewM10216.findViewById(R.id.MT_Protector);
        imageView3.setContentDescription(abstractActivityC3346.getString(R.string.MT_Protector));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(abstractActivityC3347, false);
                final GradientDrawable gradientDrawable2 = gradientDrawable;
                final ImageView imageView4 = imageView;
                final int[] iArr2 = iArr;
                dialogInterfaceOnClickListenerC3677.m11203(new InterfaceC2266() { // from class: l.ۗۤ᩻
                    @Override // l.InterfaceC2266
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo7493(int i3) {
                        int iM48482 = C21404.m48482(i3);
                        iArr2[0] = iM48482;
                        int iM48484 = C21404.m48483(abstractActivityC3347, iM48482);
                        gradientDrawable2.setColor(iM48484);
                        imageView4.setImageTintList(ColorStateList.valueOf(C7466.m20002(iM48484) > 220 ? -12895429 : -1));
                    }
                });
                dialogInterfaceOnClickListenerC3677.m11202(C21404.m48483(abstractActivityC3347, iArr2[0]));
            }
        });
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3134(2, c0421, iArr));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C5088.m14637(c19258BuildDialog.m44438());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31630(AbstractActivityC3346 abstractActivityC3346, ImageView imageView, int i, int i2, ViewOnClickListenerC20117 viewOnClickListenerC20117) {
        String string;
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setTag(Integer.valueOf(i));
        int i3 = C21404.f68902;
        if (i == 0 || i == 16777216) {
            string = abstractActivityC3346.getString(R.string.MT_Protector);
        } else {
            string = String.format(Locale.ROOT, "#%06X", Integer.valueOf(16777215 & i2));
        }
        imageView.setContentDescription(string);
        imageView.setOnClickListener(viewOnClickListenerC20117);
    }
}
