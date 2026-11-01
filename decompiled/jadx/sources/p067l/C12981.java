package p067l;

import android.text.TextUtils;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B3F */
/* JADX INFO: loaded from: classes3.dex */
public final class C12981 {

    /* JADX INFO: renamed from: ֫ */
    public static SoftReference f36526;

    /* JADX INFO: renamed from: ۧ */
    public static SoftReference f36527;

    /* JADX INFO: renamed from: ۜ */
    public static int m29759(int i) {
        int i2 = i >>> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m29773(int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int i5 = i2;
            int i6 = i;
            i = i5;
            if (!z) {
                return i4;
            }
            z = (i == i3 && (i & 1) == ((i6 >> 6) & 1)) ? false : true;
            i2 = i >> 7;
            i4++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized C24538 m29762() {
        C24538 c24538;
        SoftReference softReference = f36526;
        if (softReference != null && (c24538 = (C24538) softReference.get()) != null) {
            return c24538;
        }
        try {
            C24538 c24539 = new C24538(C10135.m23615("/assets/1"));
            f36526 = new SoftReference(c24539);
            return c24539;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized C19015 m29766() {
        C19015 c19015;
        SoftReference softReference = f36527;
        if (softReference != null && (c19015 = (C19015) softReference.get()) != null) {
            return c19015;
        }
        C19015 c19016 = new C19015(m29762());
        f36527 = new SoftReference(c19016);
        return c19016;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Class m29754(InterfaceC12374 interfaceC12374) {
        C13045.m29867(interfaceC12374, "<this>");
        Class clsMo19593 = ((InterfaceC14445) interfaceC12374).mo19593();
        if (!clsMo19593.isPrimitive()) {
            return clsMo19593;
        }
        String name = clsMo19593.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals(ClassTransform.DOUBLE) ? clsMo19593 : Double.class;
            case 104431:
                return !name.equals(ClassTransform.INTEGER) ? clsMo19593 : Integer.class;
            case 3039496:
                return !name.equals(ClassTransform.BYTE) ? clsMo19593 : Byte.class;
            case 3052374:
                return !name.equals(ClassTransform.CHARACTER) ? clsMo19593 : Character.class;
            case 3327612:
                return !name.equals(ClassTransform.LONG) ? clsMo19593 : Long.class;
            case 3625364:
                return !name.equals(ClassTransform.VOID) ? clsMo19593 : Void.class;
            case 64711720:
                return !name.equals(ClassTransform.BOOLEAN) ? clsMo19593 : Boolean.class;
            case 97526364:
                return !name.equals(ClassTransform.FLOAT) ? clsMo19593 : Float.class;
            case 109413500:
                return !name.equals(ClassTransform.SHORT) ? clsMo19593 : Short.class;
            default:
                return clsMo19593;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29758(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        if (!(obj instanceof CharSequence) || !(obj2 instanceof CharSequence)) {
            return obj.equals(obj2);
        }
        return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳ */
    public static JSONObject m29764() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "mt_apk_workspace_open.path value. Use mt://current-apk for the current APK, data.items[i].path (mt://workspace/<workspaceId>) returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, data.items[i].path returned by mt_apk_list_available_apks, an allowed absolute APK path, or a path already present in nextActions[].arguments. File URIs and other URI schemes are not accepted.")), ClassTransform.BOOLEAN, "Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.", "temporary", "Arguments for mt_apk_workspace_open.");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m29770() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id to inspect; empty string reads the base workspace.")).add("view", C3935.m7775("string", "List view.")).add("prefix", C3935.m7775("string", "Prefix filter.")), "integer", "Page size.", "limit", "Arguments for mt_apk_list.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29757(EnumC3167 enumC3167, EnumC5850 enumC5850) {
        if (enumC3167.f6090 != enumC5850) {
            throw new IllegalArgumentException(C20865.m47154("Invalid opcode ", enumC3167.f6089, " for ", enumC5850.name()));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29767(int i) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v15, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m29774() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C3935.m7775("string", "Exact dex_class locator such as dex_class:Lcom/example/Foo;. Copy the full locator; Java names such as com.example.Foo are invalid.")), "integer", "Maximum fields plus methods.", "limit", "Arguments for mt_apk_dex_read_class_outline.");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29763(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static JSONObject m29761() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C3935.m7775("string", "Text locator.")).add("limit", C3935.m7775("integer", "Line limit.")).add("maxChars", C3935.m7775("integer", "Maximum returned text characters.")).add("startLine", C3935.m7775("integer", "0-based first line within this read target; dex_method and dex_field use member-relative lines. Smali .line N directives are original Java source debug lines, not read_text positions. edit_text does not accept line coordinates.")), "integer", "0-based code point column within startLine.", "startColumn", "Arguments for mt_apk_read_text.");
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m29765(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v65535, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static JSONObject m29760() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C3935.m7775("string", "ZIP entry locator.")).add("byteOffset", C3935.m7775("integer", "Byte offset.")), "integer", "Maximum bytes.", "maxBytes", "Arguments for mt_apk_read_bytes.");
    }

    /* JADX INFO: renamed from: ᩷ */
    public static JSONObject m29772() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id to inspect; empty string reads the base workspace.")).add("reads", C9417.m21913("type", "array", "description", "Resource reads. Runtime accepts 1..200 items.").add("items", C20175.m45657(JSON.object().add("locator", C3935.m7775("string", "Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.")), "string", "Exact public resource variant to read, such as default; not wildcard *.", "variant", "One resource value read."))).add("maxValueChars", C3935.m7775("integer", "Maximum chars per decoded value summary; suggested value is 4096.")).add("maxValueXmlChars", C3935.m7775("integer", "Maximum chars for complete valueXml; suggested value is 32768.")).add("maxItemsPerValue", C3935.m7775("integer", "Maximum item_list children per top-level value; suggested value is 50.")), "integer", "Reference summary depth; suggested value is 0, allowed values are 0 or 1.", "resolveDepth", "Arguments for mt_apk_resource_read.");
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m29769(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static JSONObject m29768() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C3935.m7775("string", "ZIP entry locator for the native ELF.")).add("addressKind", C3935.m7769("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C3935.m7775("string", "Unsigned address string to pass as mt_apk_native_disassemble.address. Interpret it using this action's addressKind, and copy both values unchanged.")).add("instructionMode", C3935.m7769("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("stopAtSymbolBoundary", C3935.m7775(ClassTransform.BOOLEAN, "Whether to stop at the containing best-effort sized ELF symbol boundary when available.")).add("maxBytes", C3935.m7775("integer", "Maximum bytes to read for this instruction window.")), "integer", "Maximum instructions to include in disassemblyText.", "maxInstructions", "Arguments for mt_apk_native_disassemble.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29755(int i) {
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 5, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m29771(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29756(int i, int i2) {
        if (i > i2) {
            if (i2 == 0) {
                throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m29753() {
        return C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Copy nextActions[0].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, use \"available_apks\".")).add("editSessionId", C3935.m7775("string", "Copy nextActions[0].arguments.editSessionId, or use data.editSessionId from the result that produced data.pagination.nextCursor. Empty string means the base APK or mt_apk_list_available_apks continuation.")).add("nextCursor", C3935.m7775("string", "Copy nextActions[0].arguments.nextCursor or data.pagination.nextCursor unchanged. Do not parse or modify the cursor.")), "integer", "Copy limit from the matching continuation action; see mt_apk_continue.limit for allowed adjustments.", "limit", "Arguments for mt_apk_continue.");
    }
}
