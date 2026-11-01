package p067l;

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
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8698 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public String f23553;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f23554;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC9368 f23555;

    /* JADX INFO: renamed from: ܳ */
    public HashMap f23556 = new HashMap();

    /* JADX INFO: renamed from: ܺ */
    public String f23557;

    /* JADX INFO: renamed from: ᩷ */
    public C18280 f23558;

    /* JADX INFO: renamed from: ᩻ */
    public C12917 f23559;

    public C8698(ActivityC9368 activityC9368, String str) {
        this.f23555 = activityC9368;
        this.f23554 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f23555);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        HashMap map = this.f23556;
        String str = this.f23554;
        C6190 c6190M45791 = C20272.m45791(C18524.m42109(str, new String[0]));
        if (c6190M45791 == null) {
            throw new Exception();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM14010 = c6190M45791.m14010();
        Rect rectCopyBounds = drawableM14010.copyBounds();
        drawableM14010.setBounds(0, 0, 256, 256);
        drawableM14010.draw(canvas);
        drawableM14010.setBounds(rectCopyBounds);
        C19561 c19561 = new C19561(str);
        try {
            boolean z = c19561.getEntry("assets/xposed_init") != null;
            C5738 entry = c19561.getEntry(C18010.m40987(1));
            int i = 2;
            while (true) {
                for (C9952 c9952 : (AbstractC20050) C14645.m33466(c19561.m44448(entry)).mo29500()) {
                    String type = c9952.getType();
                    if (!map.containsKey(type)) {
                        map.put(type, new C4675(c9952));
                    }
                }
                int i2 = i + 1;
                C5738 entry2 = c19561.getEntry(C18010.m40987(i));
                if (entry2 == null) {
                    break;
                }
                i = i2;
                entry = entry2;
            }
            c19561.close();
            C18280 c18280 = new C18280();
            this.f23558 = c18280;
            c18280.f54574 = C24414.m53855();
            this.f23558.f54578 = c6190M45791.m14015();
            this.f23558.f54576 = c6190M45791.m14014();
            this.f23558.f54580 = c6190M45791.m14012();
            C18280 c18281 = this.f23558;
            c18281.f54577 = bitmapCreateBitmap;
            c18281.f54572 = System.currentTimeMillis();
            this.f23557 = String.valueOf(c6190M45791.m14018());
            this.f23553 = C24158.m53411(c6190M45791.m14017());
            String str2 = this.f23558.f54576;
            C12917 c12917 = new C12917();
            c12917.f36316 = true;
            c12917.f36313 = false;
            c12917.f36315 = z;
            c12917.f36317 = false;
            c12917.f36318 = C17588.m40053(str2, ".**");
            AbstractC17043 abstractC17043M38684 = C17853.m40542().m38684("protector/config/" + str2 + ".json");
            if (abstractC17043M38684.mo25094() && abstractC17043M38684.mo25093()) {
                try {
                    c12917.m29595(abstractC17043M38684.m38647());
                } catch (IOException unused) {
                }
            }
            this.f23559 = c12917;
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC9368 activityC9368 = this.f23555;
        View viewM12252 = activityC9368.m12252(R.layout.MT_Protector);
        ImageView imageView = (ImageView) viewM12252.findViewById(R.id.icon);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12097 = (C12096) viewM12252.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM12252.findViewById(R.id.button1);
        View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        activityC9368.f25533 = c12097;
        final String str = this.f23554;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۢۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8331 c8331 = this.f25645.f23555.f25532;
                C12096 c12098 = c12097;
                String string = c12098.m32590() == 0 ? str : c12098.m32500().toString();
                c8331.getClass();
                C8331.m19221(c8331, R.string.MT_Protector, string, null, 12);
            }
        });
        checkBox.setChecked(this.f23559.f36316);
        checkBox2.setChecked(this.f23559.f36313);
        checkBox3.setChecked(this.f23559.f36315);
        checkBox4.setChecked(false);
        c12097.mo27932((CharSequence) this.f23559.f36314);
        c12096.mo27932((CharSequence) this.f23559.f36318);
        c12096.mo27941(c12096.m32590());
        imageView.setImageBitmap(this.f23558.f54577);
        textView.setText(this.f23558.f54578);
        textView2.setText(this.f23558.f54580);
        textView3.setText(this.f23557);
        textView4.setText(this.f23558.f54576);
        textView5.setText(this.f23553);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8698 c8698 = this.f8736;
                ActivityC9368 activityC9369 = c8698.f23555;
                String string = c12096.m32500().toString();
                String string2 = c12097.m32500().toString();
                Collection collectionValues = c8698.f23556.values();
                int i = ActivityC9368.f25528;
                new C11381(activityC9369, string, string2, collectionValues).m22250();
            }
        });
        C20671 c20671BuildDialog = activityC9368.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧۡۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                dialogInterfaceC2564M46732.m3860().setEnabled(checkBox.isChecked() || checkBox4.isChecked());
            }
        });
        checkBox4.setOnCheckedChangeListener(new C18085());
        C7204.m16545(dialogInterfaceC2564M46732);
        Button buttonM3860 = dialogInterfaceC2564M46732.m3860();
        final String str2 = this.f23554;
        buttonM3860.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                final C8698 c8698 = this.f59155;
                C12917 c12917 = c8698.f23558.f54579;
                C12096 c12098 = c12096;
                c12917.f36318 = c12098.m32500().toString();
                c8698.f23558.f54579.f36316 = checkBox.isChecked();
                c8698.f23558.f54579.f36313 = checkBox2.isChecked();
                c8698.f23558.f54579.f36315 = checkBox3.isChecked();
                c8698.f23558.f54579.f36317 = checkBox4.isChecked();
                c8698.f23558.f54579.f36314 = c12097.m32500().toString().trim();
                c8698.f23558.f54572 = System.currentTimeMillis();
                ActivityC9368 activityC9369 = c8698.f23555;
                String str3 = c8698.f23558.f54579.f36314;
                Collection<C4675> collectionValues = c8698.f23556.values();
                C18280 c18280 = c8698.f23558;
                int i = ActivityC9368.f25528;
                boolean z2 = false;
                try {
                    C23470 c23470M52208 = C23470.m52208(str3);
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : c18280.f54579.f36318.split("\n")) {
                        if (!str4.isEmpty()) {
                            arrayList.add(new C5365(str4, true));
                        }
                    }
                    Collections.sort(arrayList);
                    int i2 = 0;
                    int i3 = 0;
                    for (C4675 c4675 : collectionValues) {
                        String strM52209 = c23470M52208.m52209(c4675.f10535);
                        if (!c4675.f10534) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                C5365 c5365 = (C5365) it.next();
                                if (c5365.m11627(strM52209)) {
                                    z = !c5365.f12651;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2++;
                            i3 += c4675.f10536;
                        }
                    }
                    if (i2 == 0) {
                        C22682.m50793(R.string.MT_Protector);
                        int iM29939 = C13076.m29939(6.0f);
                        int iM299310 = C13076.m29939(3.0f);
                        float f = -iM29939;
                        float f2 = iM29939;
                        float f3 = -iM299310;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(c12098, "translationX", 0.0f, f, 0.0f, f2, 0.0f, f, 0.0f, f2, 0.0f, f3, 0.0f, iM299310, 0.0f, f3, 0.0f).setDuration(1000L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        duration.start();
                    } else if (i2 > C17548.m39927() || i3 > C17548.m39943()) {
                        C20671 c20671BuildDialog2 = activityC9369.buildDialog();
                        c20671BuildDialog2.m46727(R.string.MT_Protector);
                        c20671BuildDialog2.m46718(activityC9369.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i3)));
                        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
                        c20671BuildDialog2.m46732();
                    } else {
                        z2 = true;
                    }
                } catch (Exception e) {
                    activityC9369.m12259(new Exception(activityC9369.getString(R.string.MT_Protector), e), (DialogInterface.OnDismissListener) null);
                }
                if (z2) {
                    C20671 c20671BuildDialog3 = activityC9369.buildDialog();
                    c20671BuildDialog3.m46727(R.string.MT_Protector);
                    c20671BuildDialog3.m46710(R.string.MT_Protector);
                    final String str5 = str2;
                    final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                    c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۡۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C8698 c8699 = c8698;
                            C18280 c18281 = c8699.f23558;
                            String str6 = c18281.f54576;
                            C12917 c12918 = c18281.f54579;
                            AbstractC17043 abstractC17043M38684 = C17853.m40542().m38684("protector/config/" + str6 + ".json");
                            if (abstractC17043M38684.mo25094()) {
                                abstractC17043M38684.mo25503();
                            }
                            try {
                                abstractC17043M38684.mo37342();
                                abstractC17043M38684.m38668(c12918.m29594());
                            } catch (IOException unused) {
                            }
                            ActivityC9368 activityC93610 = c8699.f23555;
                            C18280 c18282 = c8699.f23558;
                            int i5 = ActivityC9368.f25528;
                            new C10710(activityC93610, c18282, str5).m22250();
                            dialogInterfaceC2564.dismiss();
                        }
                    });
                    c20671BuildDialog3.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog3.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ۡۢ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C8698 c8699 = c8698;
                            ActivityC9368 activityC93610 = c8699.f23555;
                            C12917 c12918 = c8699.f23558.f54579;
                            String str6 = c12918.f36318;
                            String str7 = c12918.f36314;
                            Collection collectionValues2 = c8699.f23556.values();
                            int i5 = ActivityC9368.f25528;
                            new C11381(activityC93610, str6, str7, collectionValues2).m22250();
                        }
                    });
                    c20671BuildDialog3.m46732();
                }
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܿۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC9368 activityC9369 = this.f56040.f23555;
                int i = ActivityC9368.f25528;
                String[] strArr = {activityC9369.getString(R.string.MT_Protector), activityC9369.getString(R.string.MT_Protector), activityC9369.getString(R.string.MT_Protector), activityC9369.getString(R.string.MT_Protector)};
                SpannableString spannableString = new SpannableString(C11567.m26627(strArr));
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String str3 = strArr[i3];
                    int iIndexOf = str3.indexOf(10) + 1;
                    if (iIndexOf != 0) {
                        int i4 = iIndexOf + i2;
                        spannableString.setSpan(new ForegroundColorSpan(C23223.f72980), i4, str3.length() + i2, 17);
                        spannableString.setSpan(new RelativeSizeSpan(0.85f), i4, str3.length() + i2, 17);
                        int length = str3.length() + 3 + i2;
                        if (length < spannableString.length()) {
                            spannableString.setSpan(new AbsoluteSizeSpan(C13076.m29941(6.0f)), length - 3, length, 17);
                        }
                        i2 = length;
                    }
                }
                C20671 c20671BuildDialog2 = activityC9369.buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46718(spannableString);
                c20671BuildDialog2.m46736(R.string.MT_Protector, null);
                c20671BuildDialog2.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20671BuildDialog2.m46732();
                C10884.m25069(dialogInterfaceC2564M46733);
                dialogInterfaceC2564M46733.m3861().setOnClickListener(new ViewOnClickListenerC16838(1, activityC9369));
            }
        });
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
