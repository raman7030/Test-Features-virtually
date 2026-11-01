package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes3.dex */
public final class C15858 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21895 f45933;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C15858(AbstractC21895 abstractC21895) {
        this.f45933 = abstractC21895;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String[] strArr;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int iIndexOf;
        AbstractC21895 abstractC21895 = this.f45933;
        EnumC8483 enumC8483 = abstractC21895.f68857[i];
        abstractC21895.m49379();
        switch (C24576.f77807[enumC8483.ordinal()]) {
            case 1:
                strArr = abstractC21895.f68850;
                z = true;
                z2 = true;
                z3 = false;
                if (strArr != null && abstractC21895.f68861.getCount() != strArr.length) {
                    String str = (String) abstractC21895.f68865.getSelectedItem();
                    List listAsList = Arrays.asList(strArr);
                    abstractC21895.f68849.clear();
                    abstractC21895.f68849.addAll(listAsList);
                    abstractC21895.f68861.notifyDataSetChanged();
                    iIndexOf = listAsList.indexOf(str);
                    if (iIndexOf == -1 && (iIndexOf = listAsList.indexOf(abstractC21895.f68850[3])) == -1) {
                        iIndexOf = 0;
                    }
                    abstractC21895.f68865.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC21895.f68853.setVisibility(0);
                    abstractC21895.f68847.setVisibility(0);
                    if (z3) {
                        abstractC21895.f68859.setVisibility(0);
                    } else {
                        abstractC21895.f68859.setVisibility(8);
                    }
                } else {
                    abstractC21895.f68853.setVisibility(8);
                    abstractC21895.f68847.setVisibility(8);
                    abstractC21895.f68859.setVisibility(8);
                }
                if (z) {
                    abstractC21895.f68870.setVisibility(0);
                    abstractC21895.f68869.setVisibility(0);
                    abstractC21895.f68867.setVisibility(0);
                    abstractC21895.f68852.setVisibility(0);
                } else {
                    abstractC21895.f68870.setVisibility(8);
                    abstractC21895.f68869.setVisibility(8);
                    abstractC21895.f68867.setVisibility(8);
                    abstractC21895.f68852.setVisibility(8);
                }
                TextView textView = abstractC21895.f68851;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView.setAlpha(f);
                abstractC21895.f68865.setEnabled(strArr != null);
                return;
            case 2:
                strArr = abstractC21895.f68860;
                z = true;
                z2 = true;
                z3 = true;
                if (strArr != null) {
                    String str2 = (String) abstractC21895.f68865.getSelectedItem();
                    List listAsList2 = Arrays.asList(strArr);
                    abstractC21895.f68849.clear();
                    abstractC21895.f68849.addAll(listAsList2);
                    abstractC21895.f68861.notifyDataSetChanged();
                    iIndexOf = listAsList2.indexOf(str2);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC21895.f68865.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC21895.f68853.setVisibility(0);
                    abstractC21895.f68847.setVisibility(0);
                    if (z3) {
                        abstractC21895.f68859.setVisibility(0);
                    } else {
                        abstractC21895.f68859.setVisibility(8);
                    }
                } else {
                    abstractC21895.f68853.setVisibility(8);
                    abstractC21895.f68847.setVisibility(8);
                    abstractC21895.f68859.setVisibility(8);
                }
                if (z) {
                    abstractC21895.f68870.setVisibility(0);
                    abstractC21895.f68869.setVisibility(0);
                    abstractC21895.f68867.setVisibility(0);
                    abstractC21895.f68852.setVisibility(0);
                } else {
                    abstractC21895.f68870.setVisibility(8);
                    abstractC21895.f68869.setVisibility(8);
                    abstractC21895.f68867.setVisibility(8);
                    abstractC21895.f68852.setVisibility(8);
                }
                TextView textView2 = abstractC21895.f68851;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView2.setAlpha(f);
                abstractC21895.f68865.setEnabled(strArr != null);
                return;
            case 3:
                strArr = null;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str3 = (String) abstractC21895.f68865.getSelectedItem();
                    List listAsList3 = Arrays.asList(strArr);
                    abstractC21895.f68849.clear();
                    abstractC21895.f68849.addAll(listAsList3);
                    abstractC21895.f68861.notifyDataSetChanged();
                    iIndexOf = listAsList3.indexOf(str3);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC21895.f68865.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC21895.f68853.setVisibility(0);
                    abstractC21895.f68847.setVisibility(0);
                    if (z3) {
                        abstractC21895.f68859.setVisibility(0);
                    } else {
                        abstractC21895.f68859.setVisibility(8);
                    }
                } else {
                    abstractC21895.f68853.setVisibility(8);
                    abstractC21895.f68847.setVisibility(8);
                    abstractC21895.f68859.setVisibility(8);
                }
                if (z) {
                    abstractC21895.f68870.setVisibility(0);
                    abstractC21895.f68869.setVisibility(0);
                    abstractC21895.f68867.setVisibility(0);
                    abstractC21895.f68852.setVisibility(0);
                } else {
                    abstractC21895.f68870.setVisibility(8);
                    abstractC21895.f68869.setVisibility(8);
                    abstractC21895.f68867.setVisibility(8);
                    abstractC21895.f68852.setVisibility(8);
                }
                TextView textView3 = abstractC21895.f68851;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView3.setAlpha(f);
                abstractC21895.f68865.setEnabled(strArr != null);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                strArr = abstractC21895.f68866;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str4 = (String) abstractC21895.f68865.getSelectedItem();
                    List listAsList4 = Arrays.asList(strArr);
                    abstractC21895.f68849.clear();
                    abstractC21895.f68849.addAll(listAsList4);
                    abstractC21895.f68861.notifyDataSetChanged();
                    iIndexOf = listAsList4.indexOf(str4);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC21895.f68865.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC21895.f68853.setVisibility(0);
                    abstractC21895.f68847.setVisibility(0);
                    if (z3) {
                        abstractC21895.f68859.setVisibility(0);
                    } else {
                        abstractC21895.f68859.setVisibility(8);
                    }
                } else {
                    abstractC21895.f68853.setVisibility(8);
                    abstractC21895.f68847.setVisibility(8);
                    abstractC21895.f68859.setVisibility(8);
                }
                if (z) {
                    abstractC21895.f68870.setVisibility(0);
                    abstractC21895.f68869.setVisibility(0);
                    abstractC21895.f68867.setVisibility(0);
                    abstractC21895.f68852.setVisibility(0);
                } else {
                    abstractC21895.f68870.setVisibility(8);
                    abstractC21895.f68869.setVisibility(8);
                    abstractC21895.f68867.setVisibility(8);
                    abstractC21895.f68852.setVisibility(8);
                }
                TextView textView4 = abstractC21895.f68851;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView4.setAlpha(f);
                abstractC21895.f68865.setEnabled(strArr != null);
                return;
            default:
                throw new RuntimeException(enumC8483.toString());
        }
    }
}
