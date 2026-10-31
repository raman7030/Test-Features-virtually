package l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import bin.mt.plugin.api.util.Consumer;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩻ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23674 implements InterfaceC7961, InterfaceC18862, InterfaceC1702, ISequentialOutStream, Consumer, OnGetOaidListener, InterfaceC6403, InterfaceC13191 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76700;

    public /* synthetic */ C23674(Object obj) {
        this.f76700 = obj;
    }

    public /* synthetic */ C23674(C0425 c0425, C6404 c6404) {
        this.f76700 = c6404;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        ((DualProgressDialog) this.f76700).lambda$new$0((CharSequence) obj);
    }

    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
    public void onGetOaid(String str) {
        ((java.util.function.Consumer) this.f76700).n(str);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        ((C3267) this.f76700).m10048((C0052) abstractC5698);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        C6404 c6404 = (C6404) this.f76700;
        ((InterfaceC1131) obj).mo3866(c6404);
        int i = c6404.f19815;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            return ((InterfaceC10405) this.f76700).write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC13191
    /* JADX INFO: renamed from: ֫ */
    public Object mo23247(int i, int i2, byte[] bArr) {
        return ((C6136) this.f76700).f18880.mo15926(i, i2, bArr);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        C20549.m47081(((C16560) this.f76700).m39056(), abstractC15440, (List) null);
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        List<InterfaceC17889> list = (List) this.f76700;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        for (InterfaceC17889 interfaceC17889 : list) {
            if (spannableStringBuilder.length() < 1000) {
                if (spannableStringBuilder.length() > 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70257), length, length + 2, 17);
                }
                spannableStringBuilder.append((CharSequence) interfaceC17889.getName());
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC17889.getName());
        }
        String string = sb.toString();
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new ViewOnClickListenerC18759(1, string));
        C19890.m45741(textView);
    }
}
