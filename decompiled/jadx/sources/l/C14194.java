package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14194 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f42846;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C14194(AbstractC20546 abstractC20546) {
        this.f42846 = abstractC20546;
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
        AbstractC20546 abstractC20546 = this.f42846;
        EnumC6434 enumC6434 = abstractC20546.f66180[i];
        abstractC20546.m47056();
        switch (C23367.f75061[enumC6434.ordinal()]) {
            case 1:
                strArr = abstractC20546.f66173;
                z = true;
                z2 = true;
                z3 = false;
                if (strArr != null && abstractC20546.f66184.getCount() != strArr.length) {
                    String str = (String) abstractC20546.f66188.getSelectedItem();
                    List listAsList = Arrays.asList(strArr);
                    abstractC20546.f66172.clear();
                    abstractC20546.f66172.addAll(listAsList);
                    abstractC20546.f66184.notifyDataSetChanged();
                    iIndexOf = listAsList.indexOf(str);
                    if (iIndexOf == -1 && (iIndexOf = listAsList.indexOf(abstractC20546.f66173[3])) == -1) {
                        iIndexOf = 0;
                    }
                    abstractC20546.f66188.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC20546.f66176.setVisibility(0);
                    abstractC20546.f66170.setVisibility(0);
                    if (z3) {
                        abstractC20546.f66182.setVisibility(0);
                    } else {
                        abstractC20546.f66182.setVisibility(8);
                    }
                } else {
                    abstractC20546.f66176.setVisibility(8);
                    abstractC20546.f66170.setVisibility(8);
                    abstractC20546.f66182.setVisibility(8);
                }
                if (z) {
                    abstractC20546.f66193.setVisibility(0);
                    abstractC20546.f66192.setVisibility(0);
                    abstractC20546.f66190.setVisibility(0);
                    abstractC20546.f66175.setVisibility(0);
                } else {
                    abstractC20546.f66193.setVisibility(8);
                    abstractC20546.f66192.setVisibility(8);
                    abstractC20546.f66190.setVisibility(8);
                    abstractC20546.f66175.setVisibility(8);
                }
                TextView textView = abstractC20546.f66174;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView.setAlpha(f);
                abstractC20546.f66188.setEnabled(strArr != null);
                return;
            case 2:
                strArr = abstractC20546.f66183;
                z = true;
                z2 = true;
                z3 = true;
                if (strArr != null) {
                    String str2 = (String) abstractC20546.f66188.getSelectedItem();
                    List listAsList2 = Arrays.asList(strArr);
                    abstractC20546.f66172.clear();
                    abstractC20546.f66172.addAll(listAsList2);
                    abstractC20546.f66184.notifyDataSetChanged();
                    iIndexOf = listAsList2.indexOf(str2);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC20546.f66188.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC20546.f66176.setVisibility(0);
                    abstractC20546.f66170.setVisibility(0);
                    if (z3) {
                        abstractC20546.f66182.setVisibility(0);
                    } else {
                        abstractC20546.f66182.setVisibility(8);
                    }
                } else {
                    abstractC20546.f66176.setVisibility(8);
                    abstractC20546.f66170.setVisibility(8);
                    abstractC20546.f66182.setVisibility(8);
                }
                if (z) {
                    abstractC20546.f66193.setVisibility(0);
                    abstractC20546.f66192.setVisibility(0);
                    abstractC20546.f66190.setVisibility(0);
                    abstractC20546.f66175.setVisibility(0);
                } else {
                    abstractC20546.f66193.setVisibility(8);
                    abstractC20546.f66192.setVisibility(8);
                    abstractC20546.f66190.setVisibility(8);
                    abstractC20546.f66175.setVisibility(8);
                }
                TextView textView2 = abstractC20546.f66174;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView2.setAlpha(f);
                abstractC20546.f66188.setEnabled(strArr != null);
                return;
            case 3:
                strArr = null;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str3 = (String) abstractC20546.f66188.getSelectedItem();
                    List listAsList3 = Arrays.asList(strArr);
                    abstractC20546.f66172.clear();
                    abstractC20546.f66172.addAll(listAsList3);
                    abstractC20546.f66184.notifyDataSetChanged();
                    iIndexOf = listAsList3.indexOf(str3);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC20546.f66188.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC20546.f66176.setVisibility(0);
                    abstractC20546.f66170.setVisibility(0);
                    if (z3) {
                        abstractC20546.f66182.setVisibility(0);
                    } else {
                        abstractC20546.f66182.setVisibility(8);
                    }
                } else {
                    abstractC20546.f66176.setVisibility(8);
                    abstractC20546.f66170.setVisibility(8);
                    abstractC20546.f66182.setVisibility(8);
                }
                if (z) {
                    abstractC20546.f66193.setVisibility(0);
                    abstractC20546.f66192.setVisibility(0);
                    abstractC20546.f66190.setVisibility(0);
                    abstractC20546.f66175.setVisibility(0);
                } else {
                    abstractC20546.f66193.setVisibility(8);
                    abstractC20546.f66192.setVisibility(8);
                    abstractC20546.f66190.setVisibility(8);
                    abstractC20546.f66175.setVisibility(8);
                }
                TextView textView3 = abstractC20546.f66174;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView3.setAlpha(f);
                abstractC20546.f66188.setEnabled(strArr != null);
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
                strArr = abstractC20546.f66189;
                z = false;
                z2 = false;
                z3 = false;
                if (strArr != null) {
                    String str4 = (String) abstractC20546.f66188.getSelectedItem();
                    List listAsList4 = Arrays.asList(strArr);
                    abstractC20546.f66172.clear();
                    abstractC20546.f66172.addAll(listAsList4);
                    abstractC20546.f66184.notifyDataSetChanged();
                    iIndexOf = listAsList4.indexOf(str4);
                    if (iIndexOf == -1) {
                        iIndexOf = 0;
                    }
                    abstractC20546.f66188.setSelection(iIndexOf);
                }
                if (z2) {
                    abstractC20546.f66176.setVisibility(0);
                    abstractC20546.f66170.setVisibility(0);
                    if (z3) {
                        abstractC20546.f66182.setVisibility(0);
                    } else {
                        abstractC20546.f66182.setVisibility(8);
                    }
                } else {
                    abstractC20546.f66176.setVisibility(8);
                    abstractC20546.f66170.setVisibility(8);
                    abstractC20546.f66182.setVisibility(8);
                }
                if (z) {
                    abstractC20546.f66193.setVisibility(0);
                    abstractC20546.f66192.setVisibility(0);
                    abstractC20546.f66190.setVisibility(0);
                    abstractC20546.f66175.setVisibility(0);
                } else {
                    abstractC20546.f66193.setVisibility(8);
                    abstractC20546.f66192.setVisibility(8);
                    abstractC20546.f66190.setVisibility(8);
                    abstractC20546.f66175.setVisibility(8);
                }
                TextView textView4 = abstractC20546.f66174;
                if (strArr != null) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                textView4.setAlpha(f);
                abstractC20546.f66188.setEnabled(strArr != null);
                return;
            default:
                throw new RuntimeException(enumC6434.toString());
        }
    }
}
