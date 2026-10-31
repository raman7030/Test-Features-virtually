package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6660 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f20677;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20678;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f20679;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f20680 = new HashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f20681;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16742 f20682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11099 f20683;

    public C6660(ActivityC7365 activityC7365, String str) {
        this.f20679 = activityC7365;
        this.f20678 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f20679);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        HashMap map = this.f20680;
        String str = this.f20678;
        C4021 c4021M43525 = C18838.m43525(C16999.m39866(str, new String[0]));
        if (c4021M43525 == null) {
            throw new Exception();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM12090 = c4021M43525.m12090();
        Rect rectCopyBounds = drawableM12090.copyBounds();
        drawableM12090.setBounds(0, 0, 256, 256);
        drawableM12090.draw(canvas);
        drawableM12090.setBounds(rectCopyBounds);
        C18090 c18090 = new C18090(str);
        try {
            boolean z = c18090.getEntry("assets/xposed_init") != null;
            C3545 entry = c18090.getEntry(C16458.m38762(1));
            int i = 2;
            while (true) {
                for (C7980 c7980 : (AbstractC18605) C12918.m31380(c18090.m42189(entry)).mo27438()) {
                    String type = c7980.getType();
                    if (!map.containsKey(type)) {
                        map.put(type, new C2427(c7980));
                    }
                }
                int i2 = i + 1;
                C3545 entry2 = c18090.getEntry(C16458.m38762(i));
                if (entry2 == null) {
                    break;
                }
                i = i2;
                entry = entry2;
            }
            c18090.close();
            C16742 c16742 = new C16742();
            this.f20682 = c16742;
            c16742.f51391 = C23196.m51459();
            this.f20682.f51395 = c4021M43525.m12095();
            this.f20682.f51393 = c4021M43525.m12094();
            this.f20682.f51397 = c4021M43525.m12092();
            C16742 c16743 = this.f20682;
            c16743.f51394 = bitmapCreateBitmap;
            c16743.f51389 = System.currentTimeMillis();
            this.f20681 = String.valueOf(c4021M43525.m12098());
            this.f20677 = C22927.m51020(c4021M43525.m12097());
            String str2 = this.f20682.f51393;
            C11099 c11099 = new C11099();
            c11099.f33314 = true;
            c11099.f33311 = false;
            c11099.f33313 = z;
            c11099.f33315 = false;
            c11099.f33316 = C16014.m37867(str2, ".**");
            AbstractC15440 abstractC15440M36526 = C16293.m38327().m36526("protector/config/" + str2 + ".json");
            if (abstractC15440M36526.mo23120() && abstractC15440M36526.mo23119()) {
                try {
                    c11099.m27533(abstractC15440M36526.m36489());
                } catch (IOException unused) {
                }
            }
            this.f20683 = c11099;
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC7365 activityC7365 = this.f20679;
        View viewM10216 = activityC7365.m10216(R.layout.MT_Protector);
        ImageView imageView = (ImageView) viewM10216.findViewById(R.id.icon);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10236 = (C10235) viewM10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM10216.findViewById(R.id.button1);
        View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        activityC7365.f22620 = c10236;
        final String str = this.f20678;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۢۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6273 c6273 = this.f22733.f20679.f22619;
                C10235 c10237 = c10236;
                String string = c10237.m30526() == 0 ? str : c10237.m30436().toString();
                c6273.getClass();
                C6273.m17283(c6273, R.string.MT_Protector, string, null, 12);
            }
        });
        checkBox.setChecked(this.f20683.f33314);
        checkBox2.setChecked(this.f20683.f33311);
        checkBox3.setChecked(this.f20683.f33313);
        checkBox4.setChecked(false);
        c10236.mo25910((CharSequence) this.f20683.f33312);
        c10235.mo25910((CharSequence) this.f20683.f33316);
        c10235.mo25919(c10235.m30526());
        imageView.setImageBitmap(this.f20682.f51394);
        textView.setText(this.f20682.f51395);
        textView2.setText(this.f20682.f51397);
        textView3.setText(this.f20681);
        textView4.setText(this.f20682.f51393);
        textView5.setText(this.f20677);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6660 c6660 = this.f5958;
                ActivityC7365 activityC7366 = c6660.f20679;
                String string = c10235.m30436().toString();
                String string2 = c10236.m30436().toString();
                Collection collectionValues = c6660.f20680.values();
                int i = ActivityC7365.f22615;
                new C9483(activityC7366, string, string2, collectionValues).m20274();
            }
        });
        C19258 c19258BuildDialog = activityC7365.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧۡۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                dialogInterfaceC0206M44438.m1447().setEnabled(checkBox.isChecked() || checkBox4.isChecked());
            }
        });
        checkBox4.setOnCheckedChangeListener(new C16537());
        C5088.m14637(dialogInterfaceC0206M44438);
        Button buttonM1447 = dialogInterfaceC0206M44438.m1447();
        final String str2 = this.f20678;
        buttonM1447.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                final C6660 c6660 = this.f55958;
                C11099 c11099 = c6660.f20682.f51396;
                C10235 c10237 = c10235;
                c11099.f33316 = c10237.m30436().toString();
                c6660.f20682.f51396.f33314 = checkBox.isChecked();
                c6660.f20682.f51396.f33311 = checkBox2.isChecked();
                c6660.f20682.f51396.f33313 = checkBox3.isChecked();
                c6660.f20682.f51396.f33315 = checkBox4.isChecked();
                c6660.f20682.f51396.f33312 = c10236.m30436().toString().trim();
                c6660.f20682.f51389 = System.currentTimeMillis();
                ActivityC7365 activityC7366 = c6660.f20679;
                String str3 = c6660.f20682.f51396.f33312;
                Collection<C2427> collectionValues = c6660.f20680.values();
                C16742 c16742 = c6660.f20682;
                int i = ActivityC7365.f22615;
                boolean z2 = false;
                try {
                    C22203 c22203M49881 = C22203.m49881(str3);
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : c16742.f51396.f33316.split("\n")) {
                        if (!str4.isEmpty()) {
                            arrayList.add(new C3153(str4, true));
                        }
                    }
                    Collections.sort(arrayList);
                    int i2 = 0;
                    int i3 = 0;
                    for (C2427 c2427 : collectionValues) {
                        String strM49882 = c22203M49881.m49882(c2427.f7744);
                        if (!c2427.f7743) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                C3153 c3153 = (C3153) it.next();
                                if (c3153.m9583(strM49882)) {
                                    z = !c3153.f9848;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2++;
                            i3 += c2427.f7745;
                        }
                    }
                    if (i2 == 0) {
                        C21374.m48457(R.string.MT_Protector);
                        int iM27878 = C11266.m27878(6.0f);
                        int iM27879 = C11266.m27878(3.0f);
                        float f = -iM27878;
                        float f2 = iM27878;
                        float f3 = -iM27879;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(c10237, "translationX", 0.0f, f, 0.0f, f2, 0.0f, f, 0.0f, f2, 0.0f, f3, 0.0f, iM27879, 0.0f, f3, 0.0f).setDuration(1000L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        duration.start();
                    } else if (i2 > C15972.m37743() || i3 > C15972.m37759()) {
                        C19258 c19258BuildDialog2 = activityC7366.buildDialog();
                        c19258BuildDialog2.m44433(R.string.MT_Protector);
                        c19258BuildDialog2.m44424(activityC7366.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i3)));
                        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
                        c19258BuildDialog2.m44438();
                    } else {
                        z2 = true;
                    }
                } catch (Exception e) {
                    activityC7366.m10223(new Exception(activityC7366.getString(R.string.MT_Protector), e), (DialogInterface.OnDismissListener) null);
                }
                if (z2) {
                    C19258 c19258BuildDialog3 = activityC7366.buildDialog();
                    c19258BuildDialog3.m44433(R.string.MT_Protector);
                    c19258BuildDialog3.m44416(R.string.MT_Protector);
                    final String str5 = str2;
                    final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                    c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۡۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C6660 c6661 = c6660;
                            C16742 c16743 = c6661.f20682;
                            String str6 = c16743.f51393;
                            C11099 c110910 = c16743.f51396;
                            AbstractC15440 abstractC15440M36526 = C16293.m38327().m36526("protector/config/" + str6 + ".json");
                            if (abstractC15440M36526.mo23120()) {
                                abstractC15440M36526.mo23552();
                            }
                            try {
                                abstractC15440M36526.mo35195();
                                abstractC15440M36526.m36510(c110910.m27532());
                            } catch (IOException unused) {
                            }
                            ActivityC7365 activityC7367 = c6661.f20679;
                            C16742 c16744 = c6661.f20682;
                            int i5 = ActivityC7365.f22615;
                            new C8777(activityC7367, c16744, str5).m20274();
                            dialogInterfaceC0206.dismiss();
                        }
                    });
                    c19258BuildDialog3.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog3.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ۡۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C6660 c6661 = c6660;
                            ActivityC7365 activityC7367 = c6661.f20679;
                            C11099 c110910 = c6661.f20682.f51396;
                            String str6 = c110910.f33316;
                            String str7 = c110910.f33312;
                            Collection collectionValues2 = c6661.f20680.values();
                            int i5 = ActivityC7365.f22615;
                            new C9483(activityC7367, str6, str7, collectionValues2).m20274();
                        }
                    });
                    c19258BuildDialog3.m44438();
                }
            }
        });
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܿۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7365 activityC7366 = this.f52857.f20679;
                int i = ActivityC7365.f22615;
                String[] strArr = {activityC7366.getString(R.string.MT_Protector), activityC7366.getString(R.string.MT_Protector), activityC7366.getString(R.string.MT_Protector), activityC7366.getString(R.string.MT_Protector)};
                SpannableString spannableString = new SpannableString(C9679.m24613(strArr));
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String str3 = strArr[i3];
                    int iIndexOf = str3.indexOf(10) + 1;
                    if (iIndexOf != 0) {
                        int i4 = iIndexOf + i2;
                        spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), i4, str3.length() + i2, 17);
                        spannableString.setSpan(new RelativeSizeSpan(0.85f), i4, str3.length() + i2, 17);
                        int length = str3.length() + 3 + i2;
                        if (length < spannableString.length()) {
                            spannableString.setSpan(new AbsoluteSizeSpan(C11266.m27880(6.0f)), length - 3, length, 17);
                        }
                        i2 = length;
                    }
                }
                C19258 c19258BuildDialog2 = activityC7366.buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44424(spannableString);
                c19258BuildDialog2.m44442(R.string.MT_Protector, null);
                c19258BuildDialog2.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19258BuildDialog2.m44438();
                C8960.m23095(dialogInterfaceC0206M44439);
                dialogInterfaceC0206M44439.m1448().setOnClickListener(new ViewOnClickListenerC15225(1, activityC7366));
            }
        });
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
