.class public final Ll/ᩳۧۜ;
.super Ll/ۙۛ᩻;
.source "J75M"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 31
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ᩳۧۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 48
    iput-object v0, p0, Ll/ᩳۧۜ;->֫:Ll/᩹ۧۜ;

    .line 49
    iput-object v1, p0, Ll/ᩳۧۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/ܺ۟᩻;Ll/ܶ۟᩻;Ll/ᩳۧۜ;Ll/ܳ᩻ۜ;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 155
    iget-object v0, p2, Ll/ᩳۧۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/ܶ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/ܶ۟᩻;->ܿ:Ljava/lang/String;

    new-instance v3, Ll/ܽۧۜ;

    invoke-direct {v3, p0, p1, p2, p3}, Ll/ܽۧۜ;-><init>(Ll/ܺ۟᩻;Ll/ܶ۟᩻;Ll/ᩳۧۜ;Ll/ܳ᩻ۜ;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p0, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ᩳۧۜ;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/ܶ۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 157
    iget-object p0, p0, Ll/ᩳۧۜ;->֫:Ll/᩹ۧۜ;

    .line 159
    invoke-static {p1, p2, p0, p4, p3}, Ll/֫ۧۜ;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/ܶ۟᩻;)Ll/ۗ֫ۜ;

    move-result-object p0

    .line 158
    invoke-static {p0}, Ll/۫֫ۜ;->֫(Ll/ۗ֫ۜ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 72
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

    .line 131
    invoke-static {p1}, Ll/۫֫ۜ;->ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 139
    iget-object v0, p0, Ll/ᩳۧۜ;->ܿ:Ll/᩵᩻ۜ;

    const/4 v1, 0x0

    .line 150
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 151
    invoke-static {p1}, Ll/ۙ۟᩻;->ܳ(Lbin/mt/json/JSONObject;)Ll/ܶ۟᩻;

    move-result-object v1

    iget-object p1, v1, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    .line 153
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 154
    :try_start_1
    new-instance v3, Ll/ۧۧۜ;

    invoke-direct {v3, p0, v1}, Ll/ۧۧۜ;-><init>(Ll/ᩳۧۜ;Ll/ܶ۟᩻;)V

    invoke-virtual {v0, p1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ۖ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 162
    sget v4, Ll/ۡۨ᩻;->֫:I

    .line 163
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    :try_start_2
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 167
    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object v4

    :catchall_0
    move-exception p1

    .line 153
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_0

    .line 167
    iget-object v1, v1, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 169
    :cond_0
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 170
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch one UTF-8 string in an ELF shared object using a non-empty editSessionId. expectedText guards against stale content. Choose paddingMode for equal-length, NUL-terminated, or space-padded text; growth can only consume existing padding. The complete patch window is limited to 4096 UTF-8 bytes. This tool does not resize entries, update length fields, rewrite pointers, or relocate references. Use mt_apk_patch_bytes for raw bytes or embedded NUL. Success returns beforeHex/afterHex and an mt_apk_read_bytes action to inspect the patched window."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch Native UTF-8 String"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ᩳۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. virtual maps an ELF virtual address to file-backed bytes. file_offset uses an ELF file offset within the SO zip_entry bytes; it is not an APK container offset and does not require a loaded mapping.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or SO file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"expectedText\": {\n    \"type\": \"string\",\n    \"description\": \"Current UTF-8 text at the target address. This is the stale-view guard; copy it from native_strings context or decoded bytes. Must be non-empty, valid for strict UTF-8 encoding, and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"replacementText\": {\n    \"type\": \"string\",\n    \"description\": \"Replacement UTF-8 text. Empty string is allowed for null_pad or space_pad; none still requires equal UTF-8 byte length. Must be valid for strict UTF-8 encoding and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"null_pad\", \"space_pad\"],\n    \"description\": \"All lengths below are UTF-8 byte lengths. none requires equal lengths and patches exactly expectedText bytes. null_pad is for NUL-terminated C strings: the window is max(expectedText bytes, replacementText bytes)+1, and growth requires existing zero padding plus a final NUL. space_pad is for fixed-width visible strings: the window is max(expectedText bytes, replacementText bytes), and growth requires existing ASCII spaces. Both padded modes verify the padding they consume. The complete window limit is 4096 UTF-8 bytes; null_pad includes its final NUL, so its longest text is 4095 UTF-8 bytes.\"\n  }\n}\n"

    .line 80
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ᩳۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 126
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_patch_string"

    return-object v0
.end method
