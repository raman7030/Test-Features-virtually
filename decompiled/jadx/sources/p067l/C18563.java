package p067l;

import java.nio.charset.StandardCharsets;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: l.ܿ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YU */
/* JADX INFO: loaded from: classes4.dex */
public class C18563 implements InterfaceC23458 {

    /* JADX INFO: renamed from: ᩸ */
    public final Object f55405;

    @Override // p067l.InterfaceC23458
    public int size() {
        return (((String) this.f55405).length() * 2) + 4;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public int mo11078(int i, byte[] bArr) {
        C3775.m7364(3, i, bArr);
        int i2 = i + 2;
        byte[] bytes = ((String) this.f55405).getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        C3775.m7364(0L, length, bArr);
        return (length + 2) - i;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo36006(int i) {
        ((WebSettingsBoundaryInterface) this.f55405).setForceDark(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo36008() {
        ((WebSettingsBoundaryInterface) this.f55405).setForceDarkBehavior(1);
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo36007() {
        ((WebSettingsBoundaryInterface) this.f55405).setAlgorithmicDarkeningAllowed(false);
    }
}
