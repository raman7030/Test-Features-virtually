package l;

import android.text.TextUtils;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B3F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11166 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SoftReference f33526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static SoftReference f33527;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m27697(int i) {
        int i2 = i >>> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m27711(int i) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized C23326 m27700() {
        C23326 c23326;
        SoftReference softReference = f33526;
        if (softReference != null && (c23326 = (C23326) softReference.get()) != null) {
            return c23326;
        }
        try {
            C23326 c23327 = new C23326(C8172.m21646("/assets/1"));
            f33526 = new SoftReference(c23327);
            return c23327;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized C17515 m27704() {
        C17515 c17515;
        SoftReference softReference = f33527;
        if (softReference != null && (c17515 = (C17515) softReference.get()) != null) {
            return c17515;
        }
        C17515 c17516 = new C17515(m27700());
        f33527 = new SoftReference(c17516);
        return c17516;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Class m27692(InterfaceC10527 interfaceC10527) {
        C11233.m27805(interfaceC10527, "<this>");
        Class clsMo17650 = ((InterfaceC12706) interfaceC10527).mo17650();
        if (!clsMo17650.isPrimitive()) {
            return clsMo17650;
        }
        String name = clsMo17650.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals(ClassTransform.DOUBLE) ? clsMo17650 : Double.class;
            case 104431:
                return !name.equals(ClassTransform.INTEGER) ? clsMo17650 : Integer.class;
            case 3039496:
                return !name.equals(ClassTransform.BYTE) ? clsMo17650 : Byte.class;
            case 3052374:
                return !name.equals(ClassTransform.CHARACTER) ? clsMo17650 : Character.class;
            case 3327612:
                return !name.equals(ClassTransform.LONG) ? clsMo17650 : Long.class;
            case 3625364:
                return !name.equals(ClassTransform.VOID) ? clsMo17650 : Void.class;
            case 64711720:
                return !name.equals(ClassTransform.BOOLEAN) ? clsMo17650 : Boolean.class;
            case 97526364:
                return !name.equals(ClassTransform.FLOAT) ? clsMo17650 : Float.class;
            case 109413500:
                return !name.equals(ClassTransform.SHORT) ? clsMo17650 : Short.class;
            default:
                return clsMo17650;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27696(Object obj, Object obj2) {
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m27702() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "mt_apk_workspace_open.path value. Use mt://current-apk for the current APK, data.items[i].path (mt://workspace/<workspaceId>) returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, data.items[i].path returned by mt_apk_list_available_apks, an allowed absolute APK path, or a path already present in nextActions[].arguments. File URIs and other URI schemes are not accepted.")), ClassTransform.BOOLEAN, "Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.", "temporary", "Arguments for mt_apk_workspace_open.");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m27708() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id to inspect; empty string reads the base workspace.")).add("view", C1648.m5545("string", "List view.")).add("prefix", C1648.m5545("string", "Prefix filter.")), "integer", "Page size.", "limit", "Arguments for mt_apk_list.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27695(EnumC0841 enumC0841, EnumC3664 enumC3664) {
        if (enumC0841.f3316 != enumC3664) {
            throw new IllegalArgumentException(C19462.m44858("Invalid opcode ", enumC0841.f3315, " for ", enumC3664.name()));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27705(int i) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v15, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m27712() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C1648.m5545("string", "Exact dex_class locator such as dex_class:Lcom/example/Foo;. Copy the full locator; Java names such as com.example.Foo are invalid.")), "integer", "Maximum fields plus methods.", "limit", "Arguments for mt_apk_dex_read_class_outline.");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27701(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m27699() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C1648.m5545("string", "Text locator.")).add("limit", C1648.m5545("integer", "Line limit.")).add("maxChars", C1648.m5545("integer", "Maximum returned text characters.")).add("startLine", C1648.m5545("integer", "0-based first line within this read target; dex_method and dex_field use member-relative lines. Smali .line N directives are original Java source debug lines, not read_text positions. edit_text does not accept line coordinates.")), "integer", "0-based code point column within startLine.", "startColumn", "Arguments for mt_apk_read_text.");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m27703(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v65535, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m27698() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id to inspect; empty string reads the base workspace.")).add("locator", C1648.m5545("string", "ZIP entry locator.")).add("byteOffset", C1648.m5545("integer", "Byte offset.")), "integer", "Maximum bytes.", "maxBytes", "Arguments for mt_apk_read_bytes.");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m27710() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id to inspect; empty string reads the base workspace.")).add("reads", C7416.m19939("type", "array", "description", "Resource reads. Runtime accepts 1..200 items.").add("items", C18736.m43390(JSON.object().add("locator", C1648.m5545("string", "Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.")), "string", "Exact public resource variant to read, such as default; not wildcard *.", "variant", "One resource value read."))).add("maxValueChars", C1648.m5545("integer", "Maximum chars per decoded value summary; suggested value is 4096.")).add("maxValueXmlChars", C1648.m5545("integer", "Maximum chars for complete valueXml; suggested value is 32768.")).add("maxItemsPerValue", C1648.m5545("integer", "Maximum item_list children per top-level value; suggested value is 50.")), "integer", "Reference summary depth; suggested value is 0, allowed values are 0 or 1.", "resolveDepth", "Arguments for mt_apk_resource_read.");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m27707(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static JSONObject m27706() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C1648.m5545("string", "ZIP entry locator for the native ELF.")).add("addressKind", C1648.m5539("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C1648.m5545("string", "Unsigned address string to pass as mt_apk_native_disassemble.address. Interpret it using this action's addressKind, and copy both values unchanged.")).add("instructionMode", C1648.m5539("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("stopAtSymbolBoundary", C1648.m5545(ClassTransform.BOOLEAN, "Whether to stop at the containing best-effort sized ELF symbol boundary when available.")).add("maxBytes", C1648.m5545("integer", "Maximum bytes to read for this instruction window.")), "integer", "Maximum instructions to include in disassemblyText.", "maxInstructions", "Arguments for mt_apk_native_disassemble.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27693(int i) {
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 5, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m27709(int i) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27694(int i, int i2) {
        if (i > i2) {
            if (i2 == 0) {
                throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0", Integer.valueOf(i)));
            }
            throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m27691() {
        return C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Copy nextActions[0].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, use \"available_apks\".")).add("editSessionId", C1648.m5545("string", "Copy nextActions[0].arguments.editSessionId, or use data.editSessionId from the result that produced data.pagination.nextCursor. Empty string means the base APK or mt_apk_list_available_apks continuation.")).add("nextCursor", C1648.m5545("string", "Copy nextActions[0].arguments.nextCursor or data.pagination.nextCursor unchanged. Do not parse or modify the cursor.")), "integer", "Copy limit from the matching continuation action; see mt_apk_continue.limit for allowed adjustments.", "limit", "Arguments for mt_apk_continue.");
    }
}
