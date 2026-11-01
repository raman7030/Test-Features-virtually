package p067l;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13178 implements InterfaceC2681, InterfaceC3986, InterfaceC18067 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f37031;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37032;

    public /* synthetic */ C13178(Object obj, Object obj2) {
        this.f37031 = obj;
        this.f37032 = obj2;
    }

    @Override // p067l.InterfaceC2681
    /* JADX INFO: renamed from: ֫ */
    public void mo4147(PointF pointF, int i, int i2, float f, float f2) {
        ServiceC5428 serviceC5428 = (ServiceC5428) this.f37031;
        int[] iArr = (int[]) this.f37032;
        serviceC5428.m11910((serviceC5428.f12931.getWidth() / 2) + ((int) (iArr[0] + f)), (serviceC5428.f12931.getHeight() / 2) + ((int) (iArr[1] + f2)));
    }

    @Override // p067l.InterfaceC18067
    /* JADX INFO: renamed from: ֫ */
    public void mo14537(TextView textView, TextView textView2, Button button) {
        String str = (String) this.f37031;
        String str2 = (String) this.f37032;
        ViewOnClickListenerC16447.m37364(textView, str);
        ViewOnClickListenerC16447.m37364(textView2, str2);
        button.setVisibility(4);
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        String str = (String) this.f37031;
        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) this.f37032;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(10);
        ViewOnClickListenerC16447.m37364(textView, str);
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }
}
