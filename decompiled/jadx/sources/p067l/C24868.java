package p067l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import bin.p000mt.plugin.api.p002ui.dialog.DualProgressDialog;
import bin.p000mt.plugin.api.util.Consumer;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩻ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24868 implements InterfaceC9934, InterfaceC20295, InterfaceC3986, ISequentialOutStream, Consumer, OnGetOaidListener, InterfaceC8453, InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f79450;

    public /* synthetic */ C24868(Object obj) {
        this.f79450 = obj;
    }

    public /* synthetic */ C24868(C2772 c2772, C8454 c8454) {
        this.f79450 = c8454;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((DualProgressDialog) this.f79450).lambda$new$0((CharSequence) obj);
    }

    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
    public void onGetOaid(String str) {
        ((java.util.function.Consumer) this.f79450).m45213n(str);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        ((C5473) this.f79450).m12081((C2417) abstractC7783);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        return false;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        C8454 c8454 = (C8454) this.f79450;
        ((InterfaceC3443) obj).mo6107(c8454);
        int i = c8454.f22687;
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            return ((InterfaceC12257) this.f79450).write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // p067l.InterfaceC14905
    /* JADX INFO: renamed from: ֫ */
    public Object mo25191(int i, int i2, byte[] bArr) {
        return ((C8200) this.f79450).f21738.mo17847(i, i2, bArr);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C21898.m49404(((C18107) this.f79450).m41282(), abstractC17043, (List) null);
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        List<InterfaceC19370> list = (List) this.f79450;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        for (InterfaceC19370 interfaceC19370 : list) {
            if (spannableStringBuilder.length() < 1000) {
                if (spannableStringBuilder.length() > 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72969), length, length + 2, 17);
                }
                spannableStringBuilder.append((CharSequence) interfaceC19370.getName());
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC19370.getName());
        }
        String string = sb.toString();
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new ViewOnClickListenerC20197(1, string));
        C21272.m48052(textView);
    }
}
