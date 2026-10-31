package l;

import java.util.BitSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC0873 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC0873 f3436 = new C19219();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC0873 f3434 = new C0167();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0873 f3433 = new C5107();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0873[] f3435 = m3215();

    public /* synthetic */ EnumC0873(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo1286(BitSet bitSet, int i);

    public EnumC0873(String str, int i) {
        super(str, i);
    }

    public static EnumC0873 valueOf(String str) {
        return (EnumC0873) Enum.valueOf(EnumC0873.class, str);
    }

    public static EnumC0873[] values() {
        return (EnumC0873[]) f3435.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0873[] m3215() {
        return new EnumC0873[]{f3436, f3434, f3433};
    }
}
