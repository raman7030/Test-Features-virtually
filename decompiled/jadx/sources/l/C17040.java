package l;

import java.nio.charset.StandardCharsets;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: l.ܿ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YU */
/* JADX INFO: loaded from: classes4.dex */
public class C17040 implements InterfaceC22190 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f52223;

    @Override // l.InterfaceC22190
    public int size() {
        return (((String) this.f52223).length() * 2) + 4;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public int mo9010(int i, byte[] bArr) {
        C1480.m5122(3, i, bArr);
        int i2 = i + 2;
        byte[] bytes = ((String) this.f52223).getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        C1480.m5122(0L, length, bArr);
        return (length + 2) - i;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo33874(int i) {
        ((WebSettingsBoundaryInterface) this.f52223).setForceDark(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo33876() {
        ((WebSettingsBoundaryInterface) this.f52223).setForceDarkBehavior(1);
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo33875() {
        ((WebSettingsBoundaryInterface) this.f52223).setAlgorithmicDarkeningAllowed(false);
    }
}
