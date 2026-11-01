package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plugin.api.p002ui.dialog.BaseCancelableDialog;
import bin.p000mt.plugin.api.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۗ */
/* JADX INFO: compiled from: G55Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1514 implements InterfaceC9934, InterfaceC18263, InterfaceC3986, Consumer, InterfaceC22339 {
    /* JADX INFO: renamed from: ֫ */
    public static View m34686(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34687(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((BaseCancelableDialog) obj).dismiss();
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        return Long.valueOf(((C14596) obj).f41683);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        textView.setText("0");
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new ArrayList();
    }
}
