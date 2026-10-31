package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.json.JSONArray;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5092 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f15976;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f15977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19910 f15978;

    public C5092(C19910 c19910, AbstractActivityC3346 abstractActivityC3346) {
        this.f15978 = c19910;
        this.f15976 = abstractActivityC3346;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f15976);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        List list;
        String strSubstring;
        int i = C11413.f34113;
        C23881 c23881M42495 = C18237.m42480(4179).m42495();
        if (!c23881M42495.m52607()) {
            throw new C1637(C1575.m5392(c23881M42495, R.string.MT_Protector));
        }
        int iM52603 = c23881M42495.m52603();
        if (iM52603 == 0) {
            int iM52604 = c23881M42495.m52603();
            ArrayList arrayList = new ArrayList(iM52604);
            for (int i2 = 0; i2 < iM52604; i2++) {
                long jM52604 = c23881M42495.m52604();
                String strM52602 = c23881M42495.m52602();
                int iIndexOf = strM52602.indexOf(93, 0);
                if (iIndexOf == -1 || iIndexOf == strM52602.length() - 1) {
                    strSubstring = "";
                } else {
                    int i3 = iIndexOf + 1;
                    strSubstring = strM52602.substring(i3);
                    C11233.m27803(strSubstring, "substring(...)");
                    strM52602 = strM52602.substring(0, i3);
                    C11233.m27803(strM52602, "substring(...)");
                }
                JSONArray jSONArray = new JSONArray(strM52602);
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(Integer.valueOf(jSONArray.getInt(i4)));
                }
                arrayList.add(0, new C7674(jM52604, strSubstring, arrayList2));
            }
            list = arrayList;
        } else {
            list = iM52603 != 1 ? null : Collections.EMPTY_LIST;
        }
        this.f15977 = list;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        List list = this.f15977;
        if (list == null) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (list.isEmpty()) {
            m14644((C7674) null);
            return;
        }
        final CharSequence[] charSequenceArr = new CharSequence[this.f15977.size()];
        for (int i = 0; i < this.f15977.size(); i++) {
            C7674 c7674 = (C7674) this.f15977.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C17283.m40572(c7674.m20531()));
            String strM20528 = c7674.m20528();
            if (!TextUtils.isEmpty(strM20528)) {
                spannableStringBuilder.append((CharSequence) " | ").append((CharSequence) strM20528);
            }
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c7674.m20530());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C11266.m27880(12.0f)), length, length2, 17);
            charSequenceArr[i] = spannableStringBuilder;
        }
        final AbstractActivityC3346 abstractActivityC3346 = this.f15976;
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44430(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.ۡۗ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C5092 c5092 = this.f26328;
                c5092.m14644((C7674) c5092.f15977.get(i2));
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1443().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܺۗ᩷
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, final int i2, long j) {
                C21282 c21282 = new C21282(adapterView.getContext(), view, 0);
                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C5092 c5092 = this.f48239;
                final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                final CharSequence[] charSequenceArr2 = charSequenceArr;
                c21282.m48302(new InterfaceC14930() { // from class: l.֡ۗ᩷
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C5092 c5093 = c5092;
                        final C19910 c19910 = c5093.f15978;
                        int itemId = menuItem.getItemId();
                        final AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                        int i3 = i2;
                        final DialogInterfaceC0206 dialogInterfaceC0207 = dialogInterfaceC0206;
                        if (itemId == R.string.MT_Protector) {
                            C7674 c7675 = (C7674) c5093.f15977.get(i3);
                            C7914 c7914 = new C7914(c19910, abstractActivityC3348, c7675, abstractActivityC3348, dialogInterfaceC0207);
                            c7914.m31258(R.string.MT_Protector);
                            c7914.m31250((CharSequence) c7675.m20528());
                            c7914.m31268(50);
                            c7914.m31266(true);
                            return true;
                        }
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            CharSequence charSequence = charSequenceArr2[i3];
                            final C7674 c7676 = (C7674) c5093.f15977.get(i3);
                            C19258 c19258BuildDialog2 = abstractActivityC3348.buildDialog();
                            c19258BuildDialog2.m44433(R.string.MT_Protector);
                            c19258BuildDialog2.m44424(C4925.m14306(R.string.MT_Protector, "\n" + ((Object) charSequence)));
                            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۗ᩷
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    new C14969(c19910, abstractActivityC3348, c7676, dialogInterfaceC0207).m20274();
                                }
                            });
                            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258BuildDialog2.m44438();
                        }
                        return true;
                    }
                });
                c21282.m48305();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m14644(final C7674 c7674) {
        int i = DialogInterfaceC0206.f1451;
        final AbstractActivityC3346 abstractActivityC3346 = this.f15976;
        C19258 c19258 = new C19258(abstractActivityC3346);
        final ArrayList arrayList = new ArrayList(5);
        if (c7674 == null) {
            c19258.m44433(R.string.MT_Protector);
            arrayList.add(new C22026(R.string.MT_Protector, true));
            arrayList.add(new C22026(R.string.MT_Protector, true));
            arrayList.add(new C22026(R.string.MT_Protector, true));
            arrayList.add(new C22026(R.string.MT_Protector, true));
            arrayList.add(new C22026(R.string.MT_Protector, false));
            arrayList.add(new C22026(R.string.MT_Protector, true));
        } else {
            c19258.m44436(C17283.m40572(c7674.m20531()));
            ArrayList arrayList2 = (ArrayList) c7674.m20529();
            arrayList.add(new C22026(R.string.MT_Protector, arrayList2.contains(0)));
            arrayList.add(new C22026(R.string.MT_Protector, arrayList2.contains(1)));
            arrayList.add(new C22026(R.string.MT_Protector, arrayList2.contains(4) || arrayList2.contains(2)));
            arrayList.add(new C22026(R.string.MT_Protector, arrayList2.contains(3)));
            arrayList.add(new C22026(R.string.MT_Protector, arrayList2.contains(5)));
            arrayList.add(new C22026(R.string.MT_Protector, true));
        }
        final C22026[] c22026Arr = (C22026[]) C5378.stream(arrayList).filter(new C2270()).toArray(new C3681());
        if (c7674 == null) {
            c19258.m44433(R.string.MT_Protector);
        } else {
            c19258.m44436(C17283.m40572(c7674.m20531()));
        }
        boolean[] zArr = new boolean[c22026Arr.length];
        Arrays.fill(zArr, true);
        c19258.m44431(c22026Arr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴۗ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                c22026Arr[i2].f70590 = z;
            }
        });
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener(this) { // from class: l.᩵ۗ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C21321(abstractActivityC3346, arrayList, c7674).m20274();
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC16516(abstractActivityC3346, 1));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f15976.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
