package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Arrays;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9846 {

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f29745;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f29746;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f29747;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f29748;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f29749;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f29750;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f29751;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f29752;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f29753;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f29754;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f29755;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f29756;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f29757;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29758;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f29759;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29760;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f29761;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f29762;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f29763;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f29764;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f29765;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f29766;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f29767;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f29768;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f29769;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f29770;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int[] f29771;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f29772;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29773;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f29774;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f29775;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f29776;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public float f29777;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29778;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f29779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29780;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f29781;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f29782;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f29783;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f29784;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29785;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f29786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29787;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f29788;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f29789;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f29790;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29791;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f29792;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f29793;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f29794;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f29795;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f29796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f29797;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f29798;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f29799;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public String f29800;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29801;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f29802;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f29803;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f29804;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f29805;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f29806;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f29807;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24918(C9846 c9846) {
        this.f29764 = c9846.f29764;
        this.f29769 = c9846.f29769;
        this.f29751 = c9846.f29751;
        this.f29782 = c9846.f29782;
        this.f29801 = c9846.f29801;
        this.f29803 = c9846.f29803;
        this.f29797 = c9846.f29797;
        this.f29780 = c9846.f29780;
        this.f29765 = c9846.f29765;
        this.f29757 = c9846.f29757;
        this.f29794 = c9846.f29794;
        this.f29784 = c9846.f29784;
        this.f29767 = c9846.f29767;
        this.f29791 = c9846.f29791;
        this.f29787 = c9846.f29787;
        this.f29750 = c9846.f29750;
        this.f29747 = c9846.f29747;
        this.f29761 = c9846.f29761;
        this.f29793 = c9846.f29793;
        this.f29756 = c9846.f29756;
        this.f29772 = c9846.f29772;
        this.f29802 = c9846.f29802;
        this.f29770 = c9846.f29770;
        this.f29781 = c9846.f29781;
        this.f29806 = c9846.f29806;
        this.f29789 = c9846.f29789;
        this.f29768 = c9846.f29768;
        this.f29785 = c9846.f29785;
        this.f29786 = c9846.f29786;
        this.f29805 = c9846.f29805;
        this.f29753 = c9846.f29753;
        this.f29749 = c9846.f29749;
        this.f29773 = c9846.f29773;
        this.f29752 = c9846.f29752;
        this.f29796 = c9846.f29796;
        this.f29760 = c9846.f29760;
        this.f29783 = c9846.f29783;
        this.f29748 = c9846.f29748;
        this.f29795 = c9846.f29795;
        this.f29746 = c9846.f29746;
        this.f29766 = c9846.f29766;
        this.f29798 = c9846.f29798;
        this.f29775 = c9846.f29775;
        this.f29762 = c9846.f29762;
        this.f29804 = c9846.f29804;
        this.f29759 = c9846.f29759;
        this.f29758 = c9846.f29758;
        this.f29755 = c9846.f29755;
        this.f29754 = c9846.f29754;
        this.f29779 = c9846.f29779;
        this.f29778 = c9846.f29778;
        this.f29777 = c9846.f29777;
        this.f29776 = c9846.f29776;
        this.f29788 = c9846.f29788;
        this.f29792 = c9846.f29792;
        this.f29807 = c9846.f29807;
        this.f29790 = c9846.f29790;
        int[] iArr = c9846.f29771;
        if (iArr != null) {
            this.f29771 = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f29771 = null;
        }
        this.f29800 = c9846.f29800;
        this.f29799 = c9846.f29799;
        this.f29763 = c9846.f29763;
        this.f29774 = c9846.f29774;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29745 = sparseIntArray;
        sparseIntArray.append(39, 24);
        sparseIntArray.append(40, 25);
        sparseIntArray.append(42, 28);
        sparseIntArray.append(43, 29);
        sparseIntArray.append(48, 35);
        sparseIntArray.append(47, 34);
        sparseIntArray.append(21, 4);
        sparseIntArray.append(20, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(56, 6);
        sparseIntArray.append(57, 7);
        sparseIntArray.append(28, 17);
        sparseIntArray.append(29, 18);
        sparseIntArray.append(30, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(44, 31);
        sparseIntArray.append(45, 32);
        sparseIntArray.append(27, 10);
        sparseIntArray.append(26, 9);
        sparseIntArray.append(60, 13);
        sparseIntArray.append(63, 16);
        sparseIntArray.append(61, 14);
        sparseIntArray.append(58, 11);
        sparseIntArray.append(62, 15);
        sparseIntArray.append(59, 12);
        sparseIntArray.append(51, 38);
        sparseIntArray.append(37, 37);
        sparseIntArray.append(36, 39);
        sparseIntArray.append(50, 40);
        sparseIntArray.append(35, 20);
        sparseIntArray.append(49, 36);
        sparseIntArray.append(25, 5);
        sparseIntArray.append(38, 76);
        sparseIntArray.append(46, 76);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(19, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(22, 61);
        sparseIntArray.append(24, 62);
        sparseIntArray.append(23, 63);
        sparseIntArray.append(55, 69);
        sparseIntArray.append(34, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24917(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69983);
        this.f29751 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f29745;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.f29799 = typedArrayObtainStyledAttributes.getBoolean(index, this.f29799);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.f29750 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29750);
                        break;
                    case 2:
                        this.f29773 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29773);
                        break;
                    case 3:
                        this.f29787 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29787);
                        break;
                    case 4:
                        this.f29791 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29791);
                        break;
                    case 5:
                        this.f29770 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f29768 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f29768);
                        break;
                    case 7:
                        this.f29785 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f29785);
                        break;
                    case 8:
                        this.f29752 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29752);
                        break;
                    case 9:
                        this.f29756 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29756);
                        break;
                    case 10:
                        this.f29793 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29793);
                        break;
                    case 11:
                        this.f29795 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29795);
                        break;
                    case 12:
                        this.f29746 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29746);
                        break;
                    case 13:
                        this.f29760 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29760);
                        break;
                    case 14:
                        this.f29748 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29748);
                        break;
                    case 15:
                        this.f29766 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29766);
                        break;
                    case 16:
                        this.f29783 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29783);
                        break;
                    case 17:
                        this.f29801 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f29801);
                        break;
                    case 18:
                        this.f29803 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f29803);
                        break;
                    case 19:
                        this.f29797 = typedArrayObtainStyledAttributes.getFloat(index, this.f29797);
                        break;
                    case 20:
                        this.f29772 = typedArrayObtainStyledAttributes.getFloat(index, this.f29772);
                        break;
                    case 21:
                        this.f29782 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f29782);
                        break;
                    case 22:
                        this.f29769 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f29769);
                        break;
                    case 23:
                        this.f29805 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29805);
                        break;
                    case 24:
                        this.f29780 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29780);
                        break;
                    case 25:
                        this.f29765 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29765);
                        break;
                    case 26:
                        this.f29786 = typedArrayObtainStyledAttributes.getInt(index, this.f29786);
                        break;
                    case 27:
                        this.f29753 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29753);
                        break;
                    case 28:
                        this.f29757 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29757);
                        break;
                    case 29:
                        this.f29794 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29794);
                        break;
                    case 30:
                        this.f29796 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29796);
                        break;
                    case 31:
                        this.f29747 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29747);
                        break;
                    case 32:
                        this.f29761 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29761);
                        break;
                    case 33:
                        this.f29749 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29749);
                        break;
                    case 34:
                        this.f29767 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29767);
                        break;
                    case 35:
                        this.f29784 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29784);
                        break;
                    case 36:
                        this.f29802 = typedArrayObtainStyledAttributes.getFloat(index, this.f29802);
                        break;
                    case 37:
                        this.f29775 = typedArrayObtainStyledAttributes.getFloat(index, this.f29775);
                        break;
                    case 38:
                        this.f29798 = typedArrayObtainStyledAttributes.getFloat(index, this.f29798);
                        break;
                    case 39:
                        this.f29762 = typedArrayObtainStyledAttributes.getInt(index, this.f29762);
                        break;
                    case 40:
                        this.f29804 = typedArrayObtainStyledAttributes.getInt(index, this.f29804);
                        break;
                    default:
                        switch (i2) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                this.f29759 = typedArrayObtainStyledAttributes.getInt(index, this.f29759);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                this.f29758 = typedArrayObtainStyledAttributes.getInt(index, this.f29758);
                                break;
                            case 56:
                                this.f29755 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29755);
                                break;
                            case 57:
                                this.f29754 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29754);
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f29779 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29779);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                this.f29778 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29778);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f29781 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f29781);
                                        break;
                                    case 62:
                                        this.f29806 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29806);
                                        break;
                                    case 63:
                                        this.f29789 = typedArrayObtainStyledAttributes.getFloat(index, this.f29789);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.f29777 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.f29776 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                break;
                                            case 72:
                                                this.f29788 = typedArrayObtainStyledAttributes.getInt(index, this.f29788);
                                                break;
                                            case 73:
                                                this.f29792 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f29792);
                                                break;
                                            case 74:
                                                this.f29800 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f29774 = typedArrayObtainStyledAttributes.getBoolean(index, this.f29774);
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                            case 77:
                                                this.f29790 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.f29763 = typedArrayObtainStyledAttributes.getBoolean(index, this.f29763);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
