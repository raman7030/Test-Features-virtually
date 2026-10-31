.class public final Ll/ܳܳۜ;
.super Ll/ۙۛ᩻;
.source "Z76Q"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ܳܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 52
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 115
    invoke-static {p1}, Ll/ۨܺܺ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 123
    iget-object v0, p0, Ll/ܳܳۜ;->ܽ:Ll/᩵᩻ۜ;

    .line 132
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 133
    invoke-static {p1}, Ll/۬ܳۜ;->ᩴ(Lbin/mt/json/JSONObject;)Ll/۟᩻ۜ;

    move-result-object p1

    .line 134
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 135
    :try_start_1
    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ll/۟᩻ۜ;)Ll/۫ۜۜ;

    move-result-object p1

    .line 137
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 138
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/ۨܺܺ;->֫(Ll/۫ۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :try_start_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object v0

    :catchall_0
    move-exception p1

    .line 134
    :try_start_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 141
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 142
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch raw bytes in one zip_entry inside an APK edit session identified by a non-empty editSessionId; the base workspace cannot be modified. Use it as the deliberate raw-byte fallback for equal-length in-place replacement only. For executable ELF instructions, prefer mt_apk_native_patch_instructions so ELF mapping, instruction mode, alignment, assembly, and replacement length are validated; do not hand-encode machine instructions for this tool when the change can be expressed through mt_apk_native_patch_instructions.replacementAssembly. Use this tool for ELF code only when exact raw machine bytes are intentionally required or the semantic instruction tool does not apply. Each patches[] item provides byteOffset, expectedHex, and replacementHex; expectedHex is checked against the entry view at the start of the call before any bytes are written. Runtime accepts 1..200 items, each 1..4096 bytes, total 1..65536 bytes; ranges must not overlap, adjacent ranges are valid, and replacementHex equal to expectedHex is a valid no-op counted in bytesPatched. expectedHex/replacementHex are case-insensitive hex without separators and must have the same byte count. This tool accepts only zip_entry: locators and rejects dex, resources.arsc, AXML, directories, missing, or deleted entries. Text entries may be patched as raw bytes; afterward read_text/edit_text works only if the bytes still decode, and old read_text targetVersion values are stale. For SO/ELF entries, no ELF semantics are checked; verify with mt_apk_read_bytes or native read/disassemble/xref tools after patching."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch APK Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܳܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: is accepted.\"\n  },\n  \"patches\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic byte replacements for this one locator. Runtime requires 1..200 items, no overlapping byte ranges, max 4096 bytes per item and 65536 total bytes.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"byteOffset\": {\n          \"type\": \"integer\",\n          \"description\": \"0-based byte offset inside the ZIP entry. Runtime accepts 0..2147483647.\"\n        },\n        \"expectedHex\": {\n          \"type\": \"string\",\n          \"description\": \"Current bytes expected at byteOffset, as non-empty even-length hex without spaces. Case-insensitive input.\"\n        },\n        \"replacementHex\": {\n          \"type\": \"string\",\n          \"description\": \"Replacement bytes, as non-empty even-length hex without spaces. It must have the same byte count as expectedHex. For executable ELF instructions, prefer mt_apk_native_patch_instructions instead of hand-encoding machine instructions here.\"\n        }\n      },\n      \"required\": [\n        \"byteOffset\",\n        \"expectedHex\",\n        \"replacementHex\"\n      ]\n    }\n  }\n}\n"

    .line 60
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ܳܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 110
    :cond_0
    invoke-static {}, Ll/ۨܺܺ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_patch_bytes"

    return-object v0
.end method
