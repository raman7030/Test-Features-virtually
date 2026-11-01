package p067l;

import android.view.View;
import android.widget.Spinner;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes2.dex */
public class C5625 {

    /* JADX INFO: renamed from: ۢ */
    public Spinner f13612;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC10319 f13613;

    /* JADX INFO: renamed from: ܳ */
    public C21438 f13614;

    /* JADX INFO: renamed from: ܽ */
    public C20378 f13615;

    /* JADX INFO: renamed from: ᩳ */
    public long f13617;

    /* JADX INFO: renamed from: ᩷ */
    public C21438 f13618;

    /* JADX INFO: renamed from: ᩻ */
    public Spinner f13619;

    /* JADX INFO: renamed from: ܺ */
    public static C13002 f13609 = new C13002("text_translator_src", "text_translator_tar");

    /* JADX INFO: renamed from: ۡ */
    public static C13002 f13608 = new C13002("text_translator_dic_src", "text_translator_dic_tar");

    /* JADX INFO: renamed from: ֫ */
    public String f13610 = ((C21862) C16907.m38479()).getOrDefault("auto", "auto");

    /* JADX INFO: renamed from: ܿ */
    public boolean f13616 = false;

    /* JADX INFO: renamed from: ۜ */
    public boolean f13611 = false;

    /* JADX INFO: renamed from: ֫ */
    public void mo12461(int i) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12462(InterfaceC15012 interfaceC15012) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13002 m12445(boolean z) {
        return z ? f13608 : f13609;
    }

    public C5625(Spinner spinner, C20378 c20378, final Spinner spinner2, C21438 c21438, final Spinner spinner3, C21438 c21439, View view) {
        this.f13615 = c20378;
        this.f13619 = spinner2;
        this.f13614 = c21438;
        this.f13612 = spinner3;
        this.f13618 = c21439;
        String string = ApplicationC21448.f67649.getString("text_translator_engine", null);
        if (string != null) {
            int count = c20378.getCount();
            for (int i = 0; i < count; i++) {
                InterfaceC10319 interfaceC10319 = (InterfaceC10319) c20378.getItem(i);
                C12826.requireNonNull(interfaceC10319);
                if (string.equals(interfaceC10319.getId())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        f13609.m29823();
        f13608.m29823();
        C23060 c23060 = new C23060(this, c20378, c21438, c21439);
        spinner.setOnItemSelectedListener(c23060);
        c20378.registerDataSetObserver(new C23730(spinner, c20378, c23060));
        spinner2.setOnItemSelectedListener(new C21719(this, c21438, view));
        spinner3.setOnItemSelectedListener(new C6966(this, c21439, view));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩴܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5625.m12449(this.f50355, spinner2, spinner3);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12449(C5625 c5625, Spinner spinner, Spinner spinner2) {
        InterfaceC10319 interfaceC10319 = c5625.f13613;
        List listMo8700 = interfaceC10319.mo8700();
        List listMo8698 = interfaceC10319.mo8698();
        if (listMo8700.isEmpty() || listMo8698.isEmpty() || !c5625.m12458()) {
            return;
        }
        C13002 c13002 = interfaceC10319 instanceof C15270 ? f13608 : f13609;
        String strM29819 = c13002.m29819();
        C3613 c3613M12444 = m12444(c13002.m29821(), listMo8700);
        if (c3613M12444 == null) {
            return;
        }
        int i = c3613M12444.f7481;
        if (!interfaceC10319.mo8697()) {
            C3613 c3613M12445 = m12444(strM29819, listMo8698);
            if (c3613M12445 == null) {
                return;
            }
            c5625.f13617 = System.currentTimeMillis();
            spinner.setSelection(i);
            spinner2.setSelection(c3613M12445.f7481);
            c5625.mo12462(interfaceC10319.mo8694(c3613M12444, c3613M12445));
            return;
        }
        if (interfaceC10319.mo8693(i, strM29819) == -1) {
            return;
        }
        spinner.setSelection(i);
        c13002.m29822(strM29819);
        c5625.m12446(i, c13002);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4338 m12463() {
        return this.f13615;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3613 m12444(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C7637 c7637 = (C7637) list.get(i);
            if (c7637.f19990.equals(str)) {
                return new C3613(i, c7637);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m12458() {
        if ((this.f13613 instanceof C15270) || !this.f13616 || !this.f13611) {
            return false;
        }
        C13002 c13002 = f13609;
        return !C12826.equals(c13002.m29819(), c13002.m29821());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12448(C5625 c5625, View view) {
        boolean zM12458 = c5625.m12458();
        if (view.isEnabled() != zM12458) {
            view.setEnabled(zM12458);
            view.setAlpha(zM12458 ? 0.6f : 0.4f);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12465() {
        int i = 0;
        while (true) {
            C20378 c20378 = this.f13615;
            if (i < c20378.getCount()) {
                InterfaceC10319 interfaceC10319 = (InterfaceC10319) c20378.getItem(i);
                if (interfaceC10319 != null) {
                    interfaceC10319.mo8695();
                }
                i++;
            } else {
                m12456();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12460() {
        List listM8151 = C4069.m8151();
        int i = 0;
        boolean z = false;
        while (true) {
            C20378 c20378 = this.f13615;
            if (i >= c20378.getCount()) {
                break;
            }
            InterfaceC10319 interfaceC10319 = (InterfaceC10319) c20378.getItem(i);
            if ((interfaceC10319 instanceof C15270) && ((C15270) interfaceC10319).m34744(listM8151)) {
                z = true;
            }
            i++;
        }
        if (z && (this.f13613 instanceof C15270)) {
            m12456();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m12456() {
        boolean zIsEmpty = this.f13613.mo8700().isEmpty();
        C21438 c21438 = this.f13614;
        if (zIsEmpty) {
            m12453(c21438, "-- ERROR --");
            m12453(this.f13618, "-- ERROR --");
            return;
        }
        c21438.m8948();
        c21438.m8945();
        List listMo8700 = this.f13613.mo8700();
        C13002 c13002 = this.f13613 instanceof C15270 ? f13608 : f13609;
        int size = listMo8700.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C7637 c7637 = (C7637) listMo8700.get(i2);
            c21438.m8946(c7637.f19990);
            if (c7637.f19990.equals(c13002.m29819())) {
                i = i2;
            }
        }
        c21438.notifyDataSetChanged();
        this.f13619.setSelection(i);
        c13002.m29820((String) c21438.getItem(i));
        m12446(i, c13002);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m12446(int i, C13002 c13002) {
        this.f13617 = System.currentTimeMillis();
        this.f13613.mo8696(i);
        boolean zIsEmpty = this.f13613.mo8698().isEmpty();
        C21438 c21438 = this.f13618;
        if (zIsEmpty) {
            m12453(c21438, "-- ERROR --");
            return;
        }
        c21438.m8948();
        c21438.m8945();
        List listMo8698 = this.f13613.mo8698();
        int size = listMo8698.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C7637 c7637 = (C7637) listMo8698.get(i3);
            c21438.m8946(c7637.f19990);
            if (c7637.f19990.equals(c13002.m29821())) {
                i2 = i3;
            }
        }
        c21438.notifyDataSetChanged();
        this.f13612.setSelection(i2);
        c13002.m29822((String) c21438.getItem(i2));
        C7637 c7638 = (C7637) this.f13613.mo8700().get(i);
        C7637 c7639 = (C7637) this.f13613.mo8698().get(i2);
        if (c7638.f19989.equals(c7639.f19989)) {
            return;
        }
        mo12462(this.f13613.mo8694(new C3613(i, c7638), new C3613(i2, c7639)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12453(C21438 c21438, String str) {
        c21438.m8948();
        c21438.m8945();
        c21438.m8946(str);
        c21438.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC15012 m12464() {
        InterfaceC10319 interfaceC10319 = this.f13613;
        if (interfaceC10319 == null || interfaceC10319.mo8700().isEmpty() || interfaceC10319.mo8698().isEmpty()) {
            return null;
        }
        int selectedItemPosition = this.f13619.getSelectedItemPosition();
        int selectedItemPosition2 = this.f13612.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= interfaceC10319.mo8700().size() || selectedItemPosition2 < 0 || selectedItemPosition2 >= interfaceC10319.mo8698().size()) {
            return null;
        }
        C7637 c7637 = (C7637) interfaceC10319.mo8700().get(selectedItemPosition);
        C7637 c7638 = (C7637) interfaceC10319.mo8698().get(selectedItemPosition2);
        if (c7637.f19989.equals(c7638.f19989)) {
            return null;
        }
        return interfaceC10319.mo8694(new C3613(selectedItemPosition, c7637), new C3613(selectedItemPosition2, c7638));
    }
}
