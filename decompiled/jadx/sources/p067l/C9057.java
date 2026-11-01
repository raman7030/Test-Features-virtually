package p067l;

import android.content.Context;
import android.content.pm.PackageManager;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۜ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9057 implements InterfaceC4595, InterfaceC24424, ISequentialOutStream, InterfaceC20295, InterfaceC24631, InterfaceC9544, InterfaceC21477 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f24562;

    public /* synthetic */ C9057(Object obj) {
        this.f24562 = obj;
    }

    @Override // p067l.InterfaceC24424
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC24631
    /* JADX INFO: renamed from: ֫ */
    public String mo12962(C5318 c5318) {
        return (String) this.f24562;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C20457) this.f24562).mo13474(i);
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        C7996.m18520((C7996) this.f24562, (Object[]) obj);
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public void mo10533(String str) {
        ActivityC23336.m51960((ActivityC23336) this.f24562, str);
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (((InterfaceC15563) this.f24562).mo3924()) {
            throw new SevenZipException("Canceled");
        }
        return byteBuffer.remaining();
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        String string;
        Context context = (Context) this.f24562;
        String string2 = ApplicationC21448.f67649.getString("ais", "");
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

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        new DialogInterfaceOnClickListenerC20813((C18107) this.f24562, abstractC17043.mo25505());
    }
}
