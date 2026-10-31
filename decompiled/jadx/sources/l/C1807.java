package l;

import android.widget.BaseAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public class C1807 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9569 f6230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f6231;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f6232;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    public C1807(String str, Spinner spinner, C9569 c9569) {
        this.f6232 = spinner;
        this.f6230 = c9569;
        this.f6231 = str;
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6027(InterfaceC23586 interfaceC23586) {
        try {
            this.f6231 = ((AbstractC13262) C8863.f26982.get(this.f6232.getSelectedItemPosition())).mo10324();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        C9569 c9569 = this.f6230;
        Spinner spinner = this.f6232;
        try {
            if (((AbstractC13262) C8863.f26982.get(spinner.getSelectedItemPosition())).mo10324().equals(this.f6231)) {
                C9569.m24450(c9569);
                return;
            }
        } catch (Exception unused) {
        }
        int i = 0;
        if (!this.f6231.isEmpty()) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = C8863.f26982;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((AbstractC13262) arrayList.get(i2)).mo10324().equals(this.f6231)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(i);
        C9569.m24450(c9569);
    }
}
