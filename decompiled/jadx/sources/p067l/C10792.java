package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10792 {

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f29905 = new ArrayList(5);

    /* JADX INFO: renamed from: ۧ */
    public static List m24866() {
        m24869();
        return (List) C7480.stream(f29905).filter(new C6611(0)).collect(C24205.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24863(TextView textView, C23021 c23021) {
        if (c23021 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(C7050.m16203(R.string.MT_Protector, c23021.m51407()));
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24864(DialogInterfaceC2564 dialogInterfaceC2564, View view, boolean z) {
        boolean z2 = !z;
        dialogInterfaceC2564.m3854(z2);
        m24862(dialogInterfaceC2564.m3860(), z2);
        m24862(dialogInterfaceC2564.m3859(), z2);
        m24862(dialogInterfaceC2564.m3861(), z2);
        m24862(view.findViewById(R.id.spinner1), z2);
        m24862(view.findViewById(R.id.spinner2), z2);
        m24862(view.findViewById(R.id.switch1), z2);
        m24862(view.findViewById(R.id.switch2), z2);
        m24862(view.findViewById(R.id.switch3), z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24862(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24873 m24861(AbstractActivityC5549 abstractActivityC5549, View view, C18483 c18483) {
        C0990 c0990 = (C0990) view.findViewById(R.id.switch2);
        if (c0990 != null) {
            c0990.setVisibility(8);
        }
        return new C13317(m24867(abstractActivityC5549, view, c18483));
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8780 m24857(AbstractActivityC5549 abstractActivityC5549, View view, String str) {
        C0990 c0990 = (C0990) view.findViewById(R.id.switch2);
        C18483 c18483M45070 = C19825.m45070(str);
        if (str == null || str.isEmpty()) {
            c0990.setVisibility(8);
        } else {
            c0990.setText(C7050.m16203(R.string.MT_Protector, str));
        }
        if (c18483M45070 != null && m24860(c18483M45070.m42021()) == null) {
            c18483M45070 = null;
        }
        if (c18483M45070 == null) {
            c0990.setChecked(false);
            c18483M45070 = new C18483(ApplicationC21448.f67649.getString("auto_signature_key", ""), m24858(), ApplicationC21448.f67649.getString("v1_signature_filename", null), ApplicationC21448.f67649.getBoolean("kv1sd", false));
        } else {
            c0990.setChecked(true);
        }
        return new C24045(m24867(abstractActivityC5549, view, c18483M45070), c0990.getVisibility() == 0, c0990, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC24873 m24867(final AbstractActivityC5549 abstractActivityC5549, View view, C18483 c18483) {
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        final C0990 c0990 = (C0990) view.findViewById(R.id.switch1);
        C0990 c0991 = (C0990) view.findViewById(R.id.switch3);
        C11463 c11463 = new C11463(spinner);
        m24869();
        int iM29939 = C13076.m29939(36.0f);
        Context context = view.getContext();
        ArrayList arrayList = f29905;
        spinner.setAdapter((SpinnerAdapter) new C15327(context, arrayList, iM29939));
        spinner.setOnItemSelectedListener(new C9293(c11463));
        String strM42021 = c18483.m42021();
        int i = 0;
        if (!strM42021.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((AbstractC14973) arrayList.get(i2)).mo12362().equals(strM42021)) {
                    i = i2;
                    break;
                }
            }
        }
        spinner.setSelection(i);
        spinner.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12804(abstractActivityC5549, new C4086(strM42021, spinner, c11463)));
        spinner2.setAdapter((SpinnerAdapter) new C18167(iM29939, view.getContext(), (List) C23573.stream(EnumC10104.values()).map(new C5270(0)).collect(C24205.toList())));
        spinner2.setOnItemSelectedListener(new C19509(c0990, c0991));
        int iOrdinal = c18483.m42022().ordinal();
        spinner2.setSelection(iOrdinal);
        AdapterView.OnItemSelectedListener onItemSelectedListener = spinner2.getOnItemSelectedListener();
        C12826.requireNonNull(onItemSelectedListener);
        onItemSelectedListener.onItemSelected(null, null, iOrdinal, 0L);
        c0990.setTag(c18483.m42020());
        c0990.setChecked(!TextUtils.isEmpty(c18483.m42020()));
        c0990.setOnClickListener(new View.OnClickListener() { // from class: l.۬ۛܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                C0990 c0992 = c0990;
                C18838 c18838 = new C18838(abstractActivityC55410, c0992);
                c18838.m33344(R.string.MT_Protector);
                c18838.m33342(R.string.MT_Protector);
                c18838.m33336((CharSequence) c0992.getTag());
                c18838.m33367();
                c18838.m33365(6);
                c18838.m33352(true);
            }
        });
        if (c0991 != null) {
            c0991.setChecked(c18483.m42019());
        }
        return new C13987(spinner, spinner2, c0990, c0991, c11463);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC10104 m24858() {
        int i = 0;
        int i2 = ApplicationC21448.f67649.getInt("auto_signature_scheme", 0);
        if (i2 < 0 || i2 >= EnumC10104.values().length) {
            ApplicationC21448.f67649.edit().mo27875(0, "auto_signature_scheme").apply();
        } else {
            i = i2;
        }
        return EnumC10104.values()[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13457 m24859(C18483 c18483) {
        AbstractC14973 abstractC14973M24860 = m24860(c18483.m42021());
        if (abstractC14973M24860 == null) {
            abstractC14973M24860 = (AbstractC14973) f29905.get(0);
        }
        return new C13457(abstractC14973M24860, c18483.m42022(), c18483.m42020(), c18483.m42019());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24865(InterfaceC22192 interfaceC22192, AbstractC14973 abstractC14973, AbstractActivityC5549 abstractActivityC5549) {
        if (abstractC14973 instanceof C23691) {
            new C11976(interfaceC22192, abstractC14973, abstractActivityC5549).m22250();
            return;
        }
        C7952 c7952 = new C7952(interfaceC22192, abstractC14973, abstractActivityC5549);
        c7952.m30672(abstractC14973.m34290());
        c7952.m30675();
        c7952.m30669(abstractC14973.mo12362());
        c7952.m30673();
        c7952.m30670();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC14973 m24860(String str) {
        m24869();
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (AbstractC14973 abstractC14973 : f29905) {
            if (abstractC14973.mo12362().equals(str)) {
                return abstractC14973;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m24869() {
        ArrayList arrayList = f29905;
        arrayList.clear();
        arrayList.add(C16984.m38573());
        AbstractC17043 abstractC17043M24868 = m24868();
        if (abstractC17043M24868.mo25094()) {
            int i = 1;
            for (AbstractC17043 abstractC17043 : (List) C7480.stream(abstractC17043M24868.mo25500(true)).filter(new C17280(i)).sorted(new C5604(i)).collect(C24205.toList())) {
                String lowerCase = abstractC17043.getName().toLowerCase();
                if (lowerCase.endsWith(".pk8")) {
                    AbstractC17043 abstractC17043M38684 = abstractC17043M24868.m38684(abstractC17043.m38675() + ".x509.pem");
                    if (abstractC17043M38684.mo25094()) {
                        arrayList.add(new C14303(abstractC17043M38684, abstractC17043));
                    }
                } else if (lowerCase.endsWith("aes")) {
                    arrayList.add(new C21680(abstractC17043));
                } else if (lowerCase.endsWith("enc")) {
                    arrayList.add(new C23691(abstractC17043));
                } else {
                    arrayList.add(new C6927(abstractC17043));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m24868() {
        return C17853.m40542().m38684("keys");
    }
}
