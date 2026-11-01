package p067l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I6X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14781 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f42130 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX WARN: Type inference failed for: r2v8, types: [l.᩶ۤ᩻] */
    /* JADX INFO: renamed from: ֫ */
    public static void m33716(final AbstractActivityC5549 abstractActivityC5549, int i, C2769 c2769) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final ImageView imageView = (ImageView) viewM12252.findViewById(R.id.icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        int iM29939 = C13076.m29939(48.0f);
        marginLayoutParams.height = iM29939;
        marginLayoutParams.width = iM29939;
        marginLayoutParams.topMargin = C13076.m29939(4.0f);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setTranslationY(-marginLayoutParams.topMargin);
        final int[] iArr = {C22711.m50818(i)};
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.MT_Protector);
        int iRound = Math.round((Math.min(imageView.getLayoutParams().width, imageView.getLayoutParams().height) * 0.39999998f) / 2.0f);
        imageView.setPadding(iRound, iRound, iRound, iRound);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(abstractActivityC5549.getString(R.string.MT_Protector));
        int iM50819 = C22711.m50819(abstractActivityC5549, iArr[0]);
        gradientDrawable.setColor(iM50819);
        imageView.setImageTintList(ColorStateList.valueOf(C9464.m21977(iM50819) > 220 ? -12895429 : -1));
        ?? r2 = new View.OnClickListener() { // from class: l.᩶ۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                iArr[0] = iIntValue;
                int iM508110 = C22711.m50819(abstractActivityC5549, iIntValue);
                gradientDrawable.setColor(iM508110);
                imageView.setImageTintList(ColorStateList.valueOf(C9464.m21977(iM508110) > 220 ? -12895429 : -1));
            }
        };
        m33717(abstractActivityC5549, (ImageView) viewM12252.findViewById(R.id.MT_Protector), 16777216, C22711.m50819(abstractActivityC5549, 16777216), r2);
        m33717(abstractActivityC5549, (ImageView) viewM12252.findViewById(R.id.MT_Protector), 0, C22711.m50819(abstractActivityC5549, 0), r2);
        C1680 c1680 = (C1680) viewM12252.findViewById(R.id.MT_Protector).getLayoutParams();
        C1680 c1681 = (C1680) viewM12252.findViewById(R.id.MT_Protector).getLayoutParams();
        C1680 c1682 = (C1680) viewM12252.findViewById(R.id.MT_Protector).getLayoutParams();
        C1680 c1683 = (C1680) viewM12252.findViewById(R.id.divider).getLayoutParams();
        c1680.f55125 = R.id.MT_Protector;
        c1680.f55075 = R.id.MT_Protector;
        c1681.f55125 = R.id.MT_Protector;
        c1681.f55075 = R.id.MT_Protector;
        c1682.f55125 = R.id.MT_Protector;
        c1682.f55075 = R.id.MT_Protector;
        c1683.f55125 = R.id.MT_Protector;
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        for (int i2 = 0; i2 < 14; i2++) {
            ImageView imageView2 = (ImageView) viewM12252.findViewById(f42130[i2]);
            ColorStateList imageTintList = imageView2.getImageTintList();
            C12826.requireNonNull(imageTintList);
            int defaultColor = imageTintList.getDefaultColor();
            m33717(abstractActivityC5549, imageView2, defaultColor, defaultColor, r2);
        }
        ImageView imageView3 = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        imageView3.setContentDescription(abstractActivityC5549.getString(R.string.MT_Protector));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = new DialogInterfaceOnClickListenerC5863(abstractActivityC55410, false);
                final GradientDrawable gradientDrawable2 = gradientDrawable;
                final ImageView imageView4 = imageView;
                final int[] iArr2 = iArr;
                dialogInterfaceOnClickListenerC5863.m13163(new InterfaceC4522() { // from class: l.ۗۤ᩻
                    @Override // p067l.InterfaceC4522
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo9575(int i3) {
                        int iM50818 = C22711.m50818(i3);
                        iArr2[0] = iM50818;
                        int iM508110 = C22711.m50819(abstractActivityC55410, iM50818);
                        gradientDrawable2.setColor(iM508110);
                        imageView4.setImageTintList(ColorStateList.valueOf(C9464.m21977(iM508110) > 220 ? -12895429 : -1));
                    }
                });
                dialogInterfaceOnClickListenerC5863.m13162(C22711.m50819(abstractActivityC55410, iArr2[0]));
            }
        });
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5347(2, c2769, iArr));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C7204.m16545(c20671BuildDialog.m46732());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33717(AbstractActivityC5549 abstractActivityC5549, ImageView imageView, int i, int i2, ViewOnClickListenerC21488 viewOnClickListenerC21488) {
        String string;
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setTag(Integer.valueOf(i));
        int i3 = C22711.f71600;
        if (i == 0 || i == 16777216) {
            string = abstractActivityC5549.getString(R.string.MT_Protector);
        } else {
            string = String.format(Locale.ROOT, "#%06X", Integer.valueOf(16777215 & i2));
        }
        imageView.setContentDescription(string);
        imageView.setOnClickListener(viewOnClickListenerC21488);
    }
}
