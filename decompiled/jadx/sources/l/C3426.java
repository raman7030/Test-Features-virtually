package l;

import android.view.View;
import android.widget.Spinner;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes2.dex */
public class C3426 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Spinner f10807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8365 f10808;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20065 f10809;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18949 f10810;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f10812;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20065 f10813;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Spinner f10814;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C11188 f10804 = new C11188("text_translator_src", "text_translator_tar");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C11188 f10803 = new C11188("text_translator_dic_src", "text_translator_dic_tar");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f10805 = ((C20510) C15297.m36318()).getOrDefault("auto", "auto");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10811 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f10806 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10422(int i) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10423(InterfaceC13303 interfaceC13303) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11188 m10406(boolean z) {
        return z ? f10803 : f10804;
    }

    public C3426(Spinner spinner, C18949 c18949, final Spinner spinner2, C20065 c20065, final Spinner spinner3, C20065 c20066, View view) {
        this.f10810 = c18949;
        this.f10814 = spinner2;
        this.f10809 = c20065;
        this.f10807 = spinner3;
        this.f10813 = c20066;
        String string = ApplicationC20075.f65008.getString("text_translator_engine", null);
        if (string != null) {
            int count = c18949.getCount();
            for (int i = 0; i < count; i++) {
                InterfaceC8365 interfaceC8365 = (InterfaceC8365) c18949.getItem(i);
                C11003.requireNonNull(interfaceC8365);
                if (string.equals(interfaceC8365.getId())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        f10804.m27761();
        f10803.m27761();
        C21771 c21771 = new C21771(this, c18949, c20065, c20066);
        spinner.setOnItemSelectedListener(c21771);
        c18949.registerDataSetObserver(new C22476(spinner, c18949, c21771));
        spinner2.setOnItemSelectedListener(new C20360(this, c20065, view));
        spinner3.setOnItemSelectedListener(new C4837(this, c20066, view));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩴܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3426.m10410(this.f47226, spinner2, spinner3);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10410(C3426 c3426, Spinner spinner, Spinner spinner2) {
        InterfaceC8365 interfaceC8365 = c3426.f10808;
        List listMo6558 = interfaceC8365.mo6558();
        List listMo6556 = interfaceC8365.mo6556();
        if (listMo6558.isEmpty() || listMo6556.isEmpty() || !c3426.m10419()) {
            return;
        }
        C11188 c11188 = interfaceC8365 instanceof C13575 ? f10803 : f10804;
        String strM27757 = c11188.m27757();
        C1309 c1309M10405 = m10405(c11188.m27759(), listMo6558);
        if (c1309M10405 == null) {
            return;
        }
        int i = c1309M10405.f4710;
        if (!interfaceC8365.mo6555()) {
            C1309 c1309M10406 = m10405(strM27757, listMo6556);
            if (c1309M10406 == null) {
                return;
            }
            c3426.f10812 = System.currentTimeMillis();
            spinner.setSelection(i);
            spinner2.setSelection(c1309M10406.f4710);
            c3426.mo10423(interfaceC8365.mo6552(c1309M10405, c1309M10406));
            return;
        }
        if (interfaceC8365.mo6551(i, strM27757) == -1) {
            return;
        }
        spinner.setSelection(i);
        c11188.m27760(strM27757);
        c3426.m10407(i, c11188);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2072 m10424() {
        return this.f10810;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1309 m10405(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C5543 c5543 = (C5543) list.get(i);
            if (c5543.f17149.equals(str)) {
                return new C1309(i, c5543);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m10419() {
        if ((this.f10808 instanceof C13575) || !this.f10811 || !this.f10806) {
            return false;
        }
        C11188 c11188 = f10804;
        return !C11003.equals(c11188.m27757(), c11188.m27759());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10409(C3426 c3426, View view) {
        boolean zM10419 = c3426.m10419();
        if (view.isEnabled() != zM10419) {
            view.setEnabled(zM10419);
            view.setAlpha(zM10419 ? 0.6f : 0.4f);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10426() {
        int i = 0;
        while (true) {
            C18949 c18949 = this.f10810;
            if (i < c18949.getCount()) {
                InterfaceC8365 interfaceC8365 = (InterfaceC8365) c18949.getItem(i);
                if (interfaceC8365 != null) {
                    interfaceC8365.mo6553();
                }
                i++;
            } else {
                m10417();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10421() {
        List listM5956 = C1789.m5956();
        int i = 0;
        boolean z = false;
        while (true) {
            C18949 c18949 = this.f10810;
            if (i >= c18949.getCount()) {
                break;
            }
            InterfaceC8365 interfaceC8365 = (InterfaceC8365) c18949.getItem(i);
            if ((interfaceC8365 instanceof C13575) && ((C13575) interfaceC8365).m32632(listM5956)) {
                z = true;
            }
            i++;
        }
        if (z && (this.f10808 instanceof C13575)) {
            m10417();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m10417() {
        boolean zIsEmpty = this.f10808.mo6558().isEmpty();
        C20065 c20065 = this.f10809;
        if (zIsEmpty) {
            m10414(c20065, "-- ERROR --");
            m10414(this.f10813, "-- ERROR --");
            return;
        }
        c20065.m6822();
        c20065.m6819();
        List listMo6558 = this.f10808.mo6558();
        C11188 c11188 = this.f10808 instanceof C13575 ? f10803 : f10804;
        int size = listMo6558.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C5543 c5543 = (C5543) listMo6558.get(i2);
            c20065.m6820(c5543.f17149);
            if (c5543.f17149.equals(c11188.m27757())) {
                i = i2;
            }
        }
        c20065.notifyDataSetChanged();
        this.f10814.setSelection(i);
        c11188.m27758((String) c20065.getItem(i));
        m10407(i, c11188);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m10407(int i, C11188 c11188) {
        this.f10812 = System.currentTimeMillis();
        this.f10808.mo6554(i);
        boolean zIsEmpty = this.f10808.mo6556().isEmpty();
        C20065 c20065 = this.f10813;
        if (zIsEmpty) {
            m10414(c20065, "-- ERROR --");
            return;
        }
        c20065.m6822();
        c20065.m6819();
        List listMo6556 = this.f10808.mo6556();
        int size = listMo6556.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C5543 c5543 = (C5543) listMo6556.get(i3);
            c20065.m6820(c5543.f17149);
            if (c5543.f17149.equals(c11188.m27759())) {
                i2 = i3;
            }
        }
        c20065.notifyDataSetChanged();
        this.f10807.setSelection(i2);
        c11188.m27760((String) c20065.getItem(i2));
        C5543 c5544 = (C5543) this.f10808.mo6558().get(i);
        C5543 c5545 = (C5543) this.f10808.mo6556().get(i2);
        if (c5544.f17148.equals(c5545.f17148)) {
            return;
        }
        mo10423(this.f10808.mo6552(new C1309(i, c5544), new C1309(i2, c5545)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10414(C20065 c20065, String str) {
        c20065.m6822();
        c20065.m6819();
        c20065.m6820(str);
        c20065.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13303 m10425() {
        InterfaceC8365 interfaceC8365 = this.f10808;
        if (interfaceC8365 == null || interfaceC8365.mo6558().isEmpty() || interfaceC8365.mo6556().isEmpty()) {
            return null;
        }
        int selectedItemPosition = this.f10814.getSelectedItemPosition();
        int selectedItemPosition2 = this.f10807.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= interfaceC8365.mo6558().size() || selectedItemPosition2 < 0 || selectedItemPosition2 >= interfaceC8365.mo6556().size()) {
            return null;
        }
        C5543 c5543 = (C5543) interfaceC8365.mo6558().get(selectedItemPosition);
        C5543 c5544 = (C5543) interfaceC8365.mo6556().get(selectedItemPosition2);
        if (c5543.f17148.equals(c5544.f17148)) {
            return null;
        }
        return interfaceC8365.mo6552(new C1309(selectedItemPosition, c5543), new C1309(selectedItemPosition2, c5544));
    }
}
