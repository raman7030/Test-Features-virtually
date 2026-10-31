package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: G55Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13540 implements InterfaceC7961, InterfaceC16724, InterfaceC1702, Consumer, InterfaceC21013 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m32583(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32584(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        ((BaseCancelableDialog) obj).dismiss();
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        return Long.valueOf(((C12866) obj).f38639);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        textView.setText("0");
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return new ArrayList();
    }
}
