package p067l;

import android.widget.BaseAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public class C4086 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C11463 f9009;

    /* JADX INFO: renamed from: ᩸ */
    public String f9010;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Spinner f9011;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo8223(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo8225(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo8226(InterfaceC24784 interfaceC24784) {
    }

    public C4086(String str, Spinner spinner, C11463 c11463) {
        this.f9011 = spinner;
        this.f9009 = c11463;
        this.f9010 = str;
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final void mo8224(InterfaceC24784 interfaceC24784) {
        try {
            this.f9010 = ((AbstractC14973) C10792.f29905.get(this.f9011.getSelectedItemPosition())).mo12362();
        } catch (Exception unused) {
        }
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
        C11463 c11463 = this.f9009;
        Spinner spinner = this.f9011;
        try {
            if (((AbstractC14973) C10792.f29905.get(spinner.getSelectedItemPosition())).mo12362().equals(this.f9010)) {
                C11463.m26462(c11463);
                return;
            }
        } catch (Exception unused) {
        }
        int i = 0;
        if (!this.f9010.isEmpty()) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = C10792.f29905;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((AbstractC14973) arrayList.get(i2)).mo12362().equals(this.f9010)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(i);
        C11463.m26462(c11463);
    }
}
