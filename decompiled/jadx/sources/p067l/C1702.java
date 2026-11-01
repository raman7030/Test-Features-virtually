package p067l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ۫ */
/* JADX INFO: compiled from: 0AM9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1702 {
    /* JADX INFO: renamed from: ֫ */
    public static final Bundle m42917(C17402... c17402Arr) {
        Bundle bundle = new Bundle(c17402Arr.length);
        for (C17402 c17402 : c17402Arr) {
            String str = (String) c17402.m39622();
            Object objM39623 = c17402.m39623();
            if (objM39623 == null) {
                bundle.putString(str, null);
            } else if (objM39623 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM39623).booleanValue());
            } else if (objM39623 instanceof Byte) {
                bundle.putByte(str, ((Number) objM39623).byteValue());
            } else if (objM39623 instanceof Character) {
                bundle.putChar(str, ((Character) objM39623).charValue());
            } else if (objM39623 instanceof Double) {
                bundle.putDouble(str, ((Number) objM39623).doubleValue());
            } else if (objM39623 instanceof Float) {
                bundle.putFloat(str, ((Number) objM39623).floatValue());
            } else if (objM39623 instanceof Integer) {
                bundle.putInt(str, ((Number) objM39623).intValue());
            } else if (objM39623 instanceof Long) {
                bundle.putLong(str, ((Number) objM39623).longValue());
            } else if (objM39623 instanceof Short) {
                bundle.putShort(str, ((Number) objM39623).shortValue());
            } else if (objM39623 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM39623);
            } else if (objM39623 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM39623);
            } else if (objM39623 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM39623);
            } else if (objM39623 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM39623);
            } else if (objM39623 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM39623);
            } else if (objM39623 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM39623);
            } else if (objM39623 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM39623);
            } else if (objM39623 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM39623);
            } else if (objM39623 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM39623);
            } else if (objM39623 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM39623);
            } else if (objM39623 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM39623);
            } else if (objM39623 instanceof Object[]) {
                Class<?> componentType = objM39623.getClass().getComponentType();
                C13045.m29861(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objM39623);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objM39623);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM39623);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) objM39623);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (objM39623 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM39623);
            } else if (objM39623 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM39623);
            } else if (objM39623 instanceof Size) {
                C1737.m44347(bundle, str, (Size) objM39623);
            } else if (objM39623 instanceof SizeF) {
                C1737.m44348(bundle, str, (SizeF) objM39623);
            } else {
                throw new IllegalArgumentException("Illegal value type " + objM39623.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
