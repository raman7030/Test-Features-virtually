package p067l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import bin.p000mt.json.JSONArray;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7208 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f18811;

    /* JADX INFO: renamed from: ܳ */
    public List f18812;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C21291 f18813;

    public C7208(C21291 c21291, AbstractActivityC5549 abstractActivityC5549) {
        this.f18813 = c21291;
        this.f18811 = abstractActivityC5549;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f18811);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        List list;
        String strSubstring;
        int i = C13215.f37110;
        C25065 c25065M44754 = C19701.m44739(4179).m44754();
        if (!c25065M44754.m55016()) {
            throw new C3924(C3865.m7621(c25065M44754, R.string.MT_Protector));
        }
        int iM55012 = c25065M44754.m55012();
        if (iM55012 == 0) {
            int iM55013 = c25065M44754.m55012();
            ArrayList arrayList = new ArrayList(iM55013);
            for (int i2 = 0; i2 < iM55013; i2++) {
                long jM55013 = c25065M44754.m55013();
                String strM55011 = c25065M44754.m55011();
                int iIndexOf = strM55011.indexOf(93, 0);
                if (iIndexOf == -1 || iIndexOf == strM55011.length() - 1) {
                    strSubstring = "";
                } else {
                    int i3 = iIndexOf + 1;
                    strSubstring = strM55011.substring(i3);
                    C13045.m29865(strSubstring, "substring(...)");
                    strM55011 = strM55011.substring(0, i3);
                    C13045.m29865(strM55011, "substring(...)");
                }
                JSONArray jSONArray = new JSONArray(strM55011);
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(Integer.valueOf(jSONArray.getInt(i4)));
                }
                arrayList.add(0, new C9662(jM55013, strSubstring, arrayList2));
            }
            list = arrayList;
        } else {
            list = iM55012 != 1 ? null : Collections.EMPTY_LIST;
        }
        this.f18812 = list;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        List list = this.f18812;
        if (list == null) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (list.isEmpty()) {
            m16552((C9662) null);
            return;
        }
        final CharSequence[] charSequenceArr = new CharSequence[this.f18812.size()];
        for (int i = 0; i < this.f18812.size(); i++) {
            C9662 c9662 = (C9662) this.f18812.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C18794.m42823(c9662.m22511()));
            String strM22508 = c9662.m22508();
            if (!TextUtils.isEmpty(strM22508)) {
                spannableStringBuilder.append((CharSequence) " | ").append((CharSequence) strM22508);
            }
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c9662.m22510());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13076.m29941(12.0f)), length, length2, 17);
            charSequenceArr[i] = spannableStringBuilder;
        }
        final AbstractActivityC5549 abstractActivityC5549 = this.f18811;
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46724(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.ۡۗ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7208 c7208 = this.f29246;
                c7208.m16552((C9662) c7208.f18812.get(i2));
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3856().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܺۗ᩷
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, final int i2, long j) {
                C1898 c1898 = new C1898(adapterView.getContext(), view, 0);
                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C7208 c7208 = this.f51377;
                final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                final CharSequence[] charSequenceArr2 = charSequenceArr;
                c1898.m50636(new InterfaceC1583() { // from class: l.֡ۗ᩷
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C7208 c7209 = c7208;
                        final C21291 c21291 = c7209.f18813;
                        int itemId = menuItem.getItemId();
                        final AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                        int i3 = i2;
                        final DialogInterfaceC2564 dialogInterfaceC2565 = dialogInterfaceC2564;
                        if (itemId == R.string.MT_Protector) {
                            C9662 c9663 = (C9662) c7209.f18812.get(i3);
                            C9890 c9890 = new C9890(c21291, abstractActivityC55411, c9663, abstractActivityC55411, dialogInterfaceC2565);
                            c9890.m33344(R.string.MT_Protector);
                            c9890.m33336((CharSequence) c9663.m22508());
                            c9890.m33354(50);
                            c9890.m33352(true);
                            return true;
                        }
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            CharSequence charSequence = charSequenceArr2[i3];
                            final C9662 c9664 = (C9662) c7209.f18812.get(i3);
                            C20671 c20671BuildDialog2 = abstractActivityC55411.buildDialog();
                            c20671BuildDialog2.m46727(R.string.MT_Protector);
                            c20671BuildDialog2.m46718(C7050.m16203(R.string.MT_Protector, "\n" + ((Object) charSequence)));
                            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۗ᩷
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    new C16595(c21291, abstractActivityC55411, c9664, dialogInterfaceC2565).m22250();
                                }
                            });
                            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671BuildDialog2.m46732();
                        }
                        return true;
                    }
                });
                c1898.m50639();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m16552(final C9662 c9662) {
        int i = DialogInterfaceC2564.f4230;
        final AbstractActivityC5549 abstractActivityC5549 = this.f18811;
        C20671 c20671 = new C20671(abstractActivityC5549);
        final ArrayList arrayList = new ArrayList(5);
        if (c9662 == null) {
            c20671.m46727(R.string.MT_Protector);
            arrayList.add(new C23302(R.string.MT_Protector, true));
            arrayList.add(new C23302(R.string.MT_Protector, true));
            arrayList.add(new C23302(R.string.MT_Protector, true));
            arrayList.add(new C23302(R.string.MT_Protector, true));
            arrayList.add(new C23302(R.string.MT_Protector, false));
            arrayList.add(new C23302(R.string.MT_Protector, true));
        } else {
            c20671.m46730(C18794.m42823(c9662.m22511()));
            ArrayList arrayList2 = (ArrayList) c9662.m22509();
            arrayList.add(new C23302(R.string.MT_Protector, arrayList2.contains(0)));
            arrayList.add(new C23302(R.string.MT_Protector, arrayList2.contains(1)));
            arrayList.add(new C23302(R.string.MT_Protector, arrayList2.contains(4) || arrayList2.contains(2)));
            arrayList.add(new C23302(R.string.MT_Protector, arrayList2.contains(3)));
            arrayList.add(new C23302(R.string.MT_Protector, arrayList2.contains(5)));
            arrayList.add(new C23302(R.string.MT_Protector, true));
        }
        final C23302[] c23302Arr = (C23302[]) C7480.stream(arrayList).filter(new C4526()).toArray(new C5867());
        if (c9662 == null) {
            c20671.m46727(R.string.MT_Protector);
        } else {
            c20671.m46730(C18794.m42823(c9662.m22511()));
        }
        boolean[] zArr = new boolean[c23302Arr.length];
        Arrays.fill(zArr, true);
        c20671.m46725(c23302Arr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴۗ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                c23302Arr[i2].f73307 = z;
            }
        });
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener(this) { // from class: l.᩵ۗ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C22632(abstractActivityC5549, arrayList, c9662).m22250();
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new ViewOnClickListenerC18065(abstractActivityC5549, 1));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f18811.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
