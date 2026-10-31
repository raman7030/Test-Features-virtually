package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AM9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17336 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Bundle m40666(C15818... c15818Arr) {
        Bundle bundle = new Bundle(c15818Arr.length);
        for (C15818 c15818 : c15818Arr) {
            String str = (String) c15818.m37450();
            Object objM37451 = c15818.m37451();
            if (objM37451 == null) {
                bundle.putString(str, null);
            } else if (objM37451 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM37451).booleanValue());
            } else if (objM37451 instanceof Byte) {
                bundle.putByte(str, ((Number) objM37451).byteValue());
            } else if (objM37451 instanceof Character) {
                bundle.putChar(str, ((Character) objM37451).charValue());
            } else if (objM37451 instanceof Double) {
                bundle.putDouble(str, ((Number) objM37451).doubleValue());
            } else if (objM37451 instanceof Float) {
                bundle.putFloat(str, ((Number) objM37451).floatValue());
            } else if (objM37451 instanceof Integer) {
                bundle.putInt(str, ((Number) objM37451).intValue());
            } else if (objM37451 instanceof Long) {
                bundle.putLong(str, ((Number) objM37451).longValue());
            } else if (objM37451 instanceof Short) {
                bundle.putShort(str, ((Number) objM37451).shortValue());
            } else if (objM37451 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM37451);
            } else if (objM37451 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM37451);
            } else if (objM37451 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM37451);
            } else if (objM37451 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM37451);
            } else if (objM37451 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM37451);
            } else if (objM37451 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM37451);
            } else if (objM37451 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM37451);
            } else if (objM37451 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM37451);
            } else if (objM37451 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM37451);
            } else if (objM37451 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM37451);
            } else if (objM37451 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM37451);
            } else if (objM37451 instanceof Object[]) {
                Class<?> componentType = objM37451.getClass().getComponentType();
                C11233.m27799(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objM37451);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objM37451);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM37451);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) objM37451);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (objM37451 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM37451);
            } else if (objM37451 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM37451);
            } else if (objM37451 instanceof Size) {
                C18042.m42096(bundle, str, (Size) objM37451);
            } else if (objM37451 instanceof SizeF) {
                C18042.m42097(bundle, str, (SizeF) objM37451);
            } else {
                throw new IllegalArgumentException("Illegal value type " + objM37451.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }
}
