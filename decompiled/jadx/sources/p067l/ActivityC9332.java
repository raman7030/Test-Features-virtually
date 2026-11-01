package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9RZ */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC9332 extends AbstractActivityC14026 {

    /* JADX INFO: renamed from: ᩶ۧ */
    public C9848 f25407;

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo21647() {
        return "INTERNAL:ArscTranslationEditor";
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public String mo119() {
        return "ArscConfigTranslationMode";
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo21648() {
        return true;
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean mo21651() {
        return true;
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo21655() {
        return true;
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ֫ */
    public void mo21646(boolean z) {
        int i = C18524.f55316;
        this.f25407 = new C9848(C18524.m42105(getIntent()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ܳ֫ */
    public void mo21649() {
        ArrayList arrayList = new ArrayList(this.f25407.size());
        int size = this.f25407.size();
        for (int i = 0; i < size; i++) {
            C16553 c16553 = (C16553) this.f25407.get(i);
            C10674 c10674 = new C10674(c16553.f48617, i, c16553.f48618, false);
            c10674.f29536 = c16553.f48620;
            arrayList.add(c10674);
        }
        m31853(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ֫ */
    public void mo21645(RunnableC20062 runnableC20062) {
        ArrayList arrayListM31856 = m31856();
        if (arrayListM31856.size() != this.f25407.size()) {
            throw new IllegalStateException();
        }
        int size = arrayListM31856.size();
        for (int i = 0; i < size; i++) {
            C10674 c10674 = (C10674) arrayListM31856.get(i);
            ((C16553) this.f25407.get(i)).f48620 = c10674.f29536;
        }
        try {
            this.f25407.m23123();
            runnableC20062.run();
        } catch (IOException e) {
            m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo21650(String str) {
        if (str != null && (str.contains("<") || str.contains(C0233a.f1084p))) {
            try {
                C9196 c9196 = new C9196();
                c9196.m21166(new StringReader(str));
                do {
                } while (c9196.m21167() != 1);
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence mo21653(String str) {
        if (str == null) {
            return null;
        }
        int iMin = Math.min(str.length(), 200);
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<' || cCharAt == '&') {
                return C5883.m13215(str);
            }
        }
        return str;
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ܿ֫ */
    public final void mo21652() {
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }

    @Override // p067l.AbstractActivityC14026
    /* JADX INFO: renamed from: ᩺ */
    public final String mo21654() {
        String strTrim = getString(R.string.MT_Protector).trim();
        String string = getString(R.string.MT_Protector);
        if (strTrim.endsWith(".")) {
            return strTrim.substring(0, strTrim.length() - 1) + ", " + string;
        }
        if (!strTrim.endsWith("。")) {
            return C24104.m53357(strTrim, ", ", string);
        }
        return strTrim.substring(0, strTrim.length() - 1) + "，" + string;
    }
}
