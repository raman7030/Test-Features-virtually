package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B688 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19096 extends BaseAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f60136;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23537 f60137;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C19096(ActivityC6604 activityC6604) {
        this.f60136 = activityC6604;
        this.f60137 = activityC6604.f20336;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int[] iArr = C4279.f13828;
        C23537 c23537 = this.f60137;
        switch (iArr[c23537.m52000().ordinal()]) {
            case 1:
                return c23537.f75578.mo14956() + 3;
            case 2:
                return c23537.f75588 ? c23537.f75584 : c23537.f75567.size();
            case 3:
                return c23537.f75573.size();
            case 4:
                return c23537.f75577.mo12851();
            case 5:
                return c23537.f75574.mo2871();
            case 6:
                return c23537.f75588 ? c23537.f75584 : c23537.f75579.size();
            case 7:
            case 8:
            case 9:
                return c23537.f75580 ? c23537.f75564 : c23537.f75566.mo29409();
            case 10:
                return c23537.f75572.size();
            default:
                return 0;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C21421 c21421;
        if (view == null) {
            view = this.f60136.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C18342.m42765(view);
            c21421 = new C21421(view);
            view.setTag(c21421);
        } else {
            c21421 = (C21421) view.getTag();
        }
        try {
            m43983(c21421, i);
            return view;
        } catch (Exception e) {
            TextView textView = c21421.f68984;
            TextView textView2 = c21421.f68986;
            TextView textView3 = c21421.f68985;
            textView.setVisibility(4);
            c21421.f68984.setText((CharSequence) null);
            textView3.setVisibility(8);
            textView3.setText((CharSequence) null);
            textView2.setSingleLine();
            textView2.setText(e.toString());
            return view;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43983(C21421 c21421, int i) {
        c21421.f68984.setVisibility(4);
        TextView textView = c21421.f68984;
        textView.setText((CharSequence) null);
        TextView textView2 = c21421.f68985;
        textView2.setVisibility(8);
        textView2.setText((CharSequence) null);
        TextView textView3 = c21421.f68986;
        textView3.setSingleLine();
        int[] iArr = C4279.f13828;
        C23537 c23537 = this.f60137;
        switch (iArr[c23537.m52000().ordinal()]) {
            case 1:
                if (i == 0) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 1) {
                    textView3.setText(R.string.MT_Protector);
                } else if (i == 2) {
                    textView3.setText(R.string.search_by_id);
                } else {
                    textView3.setText(c23537.f75578.mo14957(i - 3).getPackageName());
                }
                break;
            case 2:
                if (c23537.f75588) {
                    textView3.setText(c23537.f75567.m47858(c23537.f75582[i]));
                } else {
                    textView3.setText(c23537.f75567.m47858(i));
                }
                break;
            case 3:
                C5193 c5193 = (C5193) c23537.f75573.get(i);
                C18906 c18906 = c5193.f16276;
                C4794 c4794 = c5193.f16278;
                textView3.setText(c18906.getPath());
                textView3.setSingleLine(false);
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C21943.f70273);
                if (c4794 != null) {
                    textView2.setText(m43982(c23537.f75567, c4794.mo5004(), c4794.getValue(), textView2));
                } else {
                    textView2.setText(c5193.f16277);
                }
                break;
            case 4:
                C8322 c8322 = c23537.f75577;
                textView.setVisibility(0);
                textView.setText(String.format("  %02X%02X", Integer.valueOf(c8322.mo12858()), Integer.valueOf(c8322.getType(i).mo2870())));
                textView3.setText(c8322.getType(i).getTypeName());
                break;
            case 5:
                textView3.setText(c23537.f75574.mo2877(i).mo18744());
                break;
            case 6:
                if (c23537.f75588) {
                    i = c23537.f75582[i];
                }
                C18906 c18907 = (C18906) c23537.f75579.get(i);
                textView.setVisibility(0);
                textView.setText(String.format("  %04X", Integer.valueOf(c18907.mo47883())));
                m43984(c23537, c18907, c21421);
                break;
            case 7:
            case 8:
            case 9:
                if (c23537.f75580) {
                    i = c23537.f75571[i];
                }
                C4794 value = c23537.f75566.getValue(i);
                textView3.setText(c23537.f75569.m30772(value.mo5006()));
                textView2.setVisibility(0);
                textView2.setBackgroundColor(0);
                textView2.setTextColor(C21943.f70273);
                textView2.setText(m43982(c23537.f75567, value.mo5004(), value.getValue(), textView2));
                break;
            case 10:
                C18906 c18908 = (C18906) c23537.f75572.get(i);
                m43984(c23537, c18908, c21421);
                textView3.setText(c18908.getPath());
                textView3.setSingleLine(false);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43984(C23537 c23537, C18906 c18906, C21421 c21421) {
        TextView textView = c21421.f68986;
        TextView textView2 = c21421.f68985;
        textView.setText(c18906.mo29406());
        C20317 type = c18906.getType();
        if ((type == null || !type.getTypeName().equals("id")) && !c18906.mo29412()) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C21943.f70273);
            textView2.setText(m43982(c23537.f75567, c18906.getValue(0).mo5004(), c18906.getValue(0).getValue(), textView2));
            return;
        }
        if (c18906.mo29412() && type.getTypeName().equals("style") && c18906.getParent() != 0) {
            textView2.setVisibility(0);
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C21943.f70273);
            textView2.setText(c23537.f75569.m30772(c18906.getParent()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43982(InterfaceC12743 interfaceC12743, int i, int i2, TextView textView) {
        if (i == 3) {
            return ((AbstractC21023) interfaceC12743).m47858(i2);
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
                    textView.setTextColor(C7466.m20005(i2, C21943.f70284));
                }
                textView.setBackgroundColor(i2);
            }
            return String.format("Color: %08X", Integer.valueOf(i2));
        }
        if (i == 4) {
            return C0253.m1519(i2);
        }
        if (i == 5) {
            return "Dimen: " + C3213.m9856(i2, 1) + C3213.f10105[i2 & 15];
        }
        if (i == 6) {
            int i3 = i2 & 15;
            return "Frac: " + C3213.m9856(i2, C3213.f10106[i3]) + C3213.f10107[i3];
        }
        if (i == 17) {
            return C13540.m32584(new StringBuilder("Hex: "), i2);
        }
        if (i == 16) {
            return C19370.m44628(i2, "Dec: ");
        }
        if (i == 18) {
            StringBuilder sb = new StringBuilder("Boolean: ");
            sb.append(i2 != 0);
            return sb.toString();
        }
        if (i != 0) {
            return C18307.m42646("Unknown Type ID: ", i, i2, " Data: ");
        }
        return null;
    }
}
