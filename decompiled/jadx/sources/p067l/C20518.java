package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B688 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20518 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC8645 f63370;

    /* JADX INFO: renamed from: ᩹ */
    public final C24738 f63371;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20518(ActivityC8645 activityC8645) {
        this.f63370 = activityC8645;
        this.f63371 = activityC8645.f23213;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int[] iArr = C6436.f16645;
        C24738 c24738 = this.f63371;
        switch (iArr[c24738.m54402().ordinal()]) {
            case 1:
                return c24738.f78324.mo16866() + 3;
            case 2:
                return c24738.f78334 ? c24738.f78330 : c24738.f78313.size();
            case 3:
                return c24738.f78319.size();
            case 4:
                return c24738.f78323.mo14715();
            case 5:
                return c24738.f78320.mo5200();
            case 6:
                return c24738.f78334 ? c24738.f78330 : c24738.f78325.size();
            case 7:
            case 8:
            case 9:
                return c24738.f78326 ? c24738.f78310 : c24738.f78312.mo31471();
            case 10:
                return c24738.f78318.size();
            default:
                return 0;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22727 c22727;
        if (view == null) {
            view = this.f63370.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C19801.m45027(view);
            c22727 = new C22727(view);
            view.setTag(c22727);
        } else {
            c22727 = (C22727) view.getTag();
        }
        try {
            m46277(c22727, i);
            return view;
        } catch (Exception e) {
            TextView textView = c22727.f71682;
            TextView textView2 = c22727.f71684;
            TextView textView3 = c22727.f71683;
            textView.setVisibility(4);
            c22727.f71682.setText((CharSequence) null);
            textView3.setVisibility(8);
            textView3.setText((CharSequence) null);
            textView2.setSingleLine();
            textView2.setText(e.toString());
            return view;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46277(C22727 c22727, int i) {
        c22727.f71682.setVisibility(4);
        TextView textView = c22727.f71682;
        textView.setText((CharSequence) null);
        TextView textView2 = c22727.f71683;
        textView2.setVisibility(8);
        textView2.setText((CharSequence) null);
        TextView textView3 = c22727.f71684;
        textView3.setSingleLine();
        int[] iArr = C6436.f16645;
        C24738 c24738 = this.f63371;
        switch (iArr[c24738.m54402().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 1) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 2) {
                    textView3.setText(R.string.search_by_id);
                } else {
                    textView3.setText(c24738.f78324.mo16867(i - 3).getPackageName());
                }
                break;
            case 2:
                if (c24738.f78334) {
                    textView3.setText(c24738.f78313.m50188(c24738.f78328[i]));
                } else {
                    textView3.setText(c24738.f78313.m50188(i));
                }
                break;
            case 3:
                C7304 c7304 = (C7304) c24738.f78319.get(i);
                C20337 c20337 = c7304.f19117;
                C6925 c6925 = c7304.f19119;
                textView3.setText(c20337.getPath());
                textView3.setSingleLine(false);
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C23223.f72984);
                if (c6925 != null) {
                    textView2.setText(m46276(c24738.f78313, c6925.mo7247(), c6925.getValue(), textView2));
                } else {
                    textView2.setText(c7304.f19118);
                }
                break;
            case 4:
                C10278 c10278 = c24738.f78323;
                textView.setVisibility(0);
                textView.setText(String.format("  %02X%02X", Integer.valueOf(c10278.mo14722()), Integer.valueOf(c10278.getType(i).mo5199())));
                textView3.setText(c10278.getType(i).getTypeName());
                break;
            case 5:
                textView3.setText(c24738.f78320.mo5206(i).mo20694());
                break;
            case 6:
                if (c24738.f78334) {
                    i = c24738.f78328[i];
                }
                C20337 c20338 = (C20337) c24738.f78325.get(i);
                textView.setVisibility(0);
                textView.setText(String.format("  %04X", Integer.valueOf(c20338.mo50213())));
                m46278(c24738, c20338, c22727);
                break;
            case 7:
            case 8:
            case 9:
                if (c24738.f78326) {
                    i = c24738.f78317[i];
                }
                C6925 value = c24738.f78312.getValue(i);
                textView3.setText(c24738.f78315.m32844(value.mo7249()));
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C23223.f72984);
                textView2.setText(m46276(c24738.f78313, value.mo7247(), value.getValue(), textView2));
                break;
            case 10:
                C20337 c20339 = (C20337) c24738.f78318.get(i);
                m46278(c24738, c20339, c22727);
                textView3.setText(c20339.getPath());
                textView3.setSingleLine(false);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46278(C24738 c24738, C20337 c20337, C22727 c22727) {
        TextView textView = c22727.f71684;
        TextView textView2 = c22727.f71683;
        textView.setText(c20337.mo31468());
        C21678 type = c20337.getType();
        if ((type == null || !type.getTypeName().equals("id")) && !c20337.mo31474()) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C23223.f72984);
            textView2.setText(m46276(c24738.f78313, c20337.getValue(0).mo7247(), c20337.getValue(0).getValue(), textView2));
            return;
        }
        if (c20337.mo31474() && type.getTypeName().equals("style") && c20337.getParent() != 0) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C23223.f72984);
            textView2.setText(c24738.f78315.m32844(c20337.getParent()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46276(InterfaceC14480 interfaceC14480, int i, int i2, TextView textView) {
        if (i == 3) {
            return ((AbstractC22349) interfaceC14480).m50188(i2);
        }
        if (i == 1 || i == 7) {
            return String.format("Ref: @%08X", Integer.valueOf(i2));
        }
        if (i == 2 || i == 8) {
            return String.format("Attr: ?%08X", Integer.valueOf(i2));
        }
        if (i >= 28 && i <= 31) {
            if (textView != null) {
                if (((i2 >>> 24) & 255) > 64) {
                    textView.setTextColor(C9464.m21980(i2, C23223.f72995));
                }
                textView.setBackgroundColor(i2);
            }
            return String.format("Color: %08X", Integer.valueOf(i2));
        }
        if (i == 4) {
            return C2609.m3917(i2);
        }
        if (i == 5) {
            return "Dimen: " + C5422.m11903(i2, 1) + C5422.f12912[i2 & 15];
        }
        if (i == 6) {
            int i3 = i2 & 15;
            return "Frac: " + C5422.m11903(i2, C5422.f12913[i3]) + C5422.f12914[i3];
        }
        if (i == 17) {
            return C1514.m34687(new StringBuilder("Hex: "), i2);
        }
        if (i == 16) {
            return C20778.m46922(i2, "Dec: ");
        }
        if (i == 18) {
            StringBuilder sb = new StringBuilder("Boolean: ");
            sb.append(i2 != 0);
            return sb.toString();
        }
        if (i != 0) {
            return C19768.m44907("Unknown Type ID: ", i, i2, " Data: ");
        }
        return null;
    }
}
