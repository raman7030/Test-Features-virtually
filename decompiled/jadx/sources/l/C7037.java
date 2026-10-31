package l;

import android.content.Context;
import android.content.pm.PackageManager;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۜ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7037 implements InterfaceC2343, InterfaceC23206, ISequentialOutStream, InterfaceC18862, InterfaceC23425, InterfaceC7550, InterfaceC20106 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21681;

    public /* synthetic */ C7037(Object obj) {
        this.f21681 = obj;
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC23425
    /* JADX INFO: renamed from: ֫ */
    public String mo10986(C3104 c3104) {
        return (String) this.f21681;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((C19032) this.f21681).mo11538(i);
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        C5921.m16594((C5921) this.f21681, (Object[]) obj);
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public void mo8486(String str) {
        ActivityC22062.m49624((ActivityC22062) this.f21681, str);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (((InterfaceC13883) this.f21681).mo1526()) {
            throw new SevenZipException("Canceled");
        }
        return byteBuffer.remaining();
    }

    @Override // l.InterfaceC7550
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        String string;
        Context context = (Context) this.f21681;
        String string2 = ApplicationC20075.f65008.getString("ais", "");
        if (string2.isEmpty()) {
            return context.getString(R.string.MT_Protector);
        }
        if (string2.equals("com.android.vending")) {
            string = context.getString(R.string.MT_Protector);
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                string = packageManager.getApplicationInfo(string2, 0).loadLabel(packageManager).toString();
            } catch (PackageManager.NameNotFoundException unused) {
                return string2;
            }
        }
        return string + " (" + string2 + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        new DialogInterfaceOnClickListenerC19407((C16560) this.f21681, abstractC15440.mo23554());
    }
}
