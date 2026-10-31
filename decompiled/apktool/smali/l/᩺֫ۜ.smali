.class public final Ll/᩺֫ۜ;
.super Ll/ۙۛ᩻;
.source "C75V"


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

    .line 47
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 48
    iput-object p1, p0, Ll/᩺֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 49
    iput-object v0, p0, Ll/᩺֫ۜ;->֫:Ll/᩹ۧۜ;

    .line 50
    iput-object v1, p0, Ll/᩺֫ۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/ܺ۟᩻;Ll/۠۟᩻;Ll/᩺֫ۜ;Ll/ܳ᩻ۜ;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 162
    iget-object v0, p2, Ll/᩺֫ۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/۠۟᩻;->ܿ:Ljava/lang/String;

    new-instance v3, Ll/ۨ֫ۜ;

    invoke-direct {v3, p0, p1, p2, p3}, Ll/ۨ֫ۜ;-><init>(Ll/ܺ۟᩻;Ll/۠۟᩻;Ll/᩺֫ۜ;Ll/ܳ᩻ۜ;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p0, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩺֫ۜ;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/۠۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 164
    iget-object p0, p0, Ll/᩺֫ۜ;->֫:Ll/᩹ۧۜ;

    .line 166
    invoke-static {p1, p2, p0, p4, p3}, Ll/ۤ֫ۜ;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/۠۟᩻;)Ll/ۙ֫ۜ;

    move-result-object p0

    .line 165
    invoke-static {p0}, Ll/۫֫ۜ;->֫(Ll/ۙ֫ۜ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 73
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

    .line 137
    invoke-static {p1}, Ll/۫֫ۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 145
    iget-object v0, p0, Ll/᩺֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    const/4 v1, 0x0

    .line 157
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 158
    invoke-static {p1}, Ll/ۙ۟᩻;->ܿ(Lbin/mt/json/JSONObject;)Ll/۠۟᩻;

    move-result-object v1

    iget-object p1, v1, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    .line 160
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 161
    :try_start_1
    new-instance v3, Ll/ۛ֫ۜ;

    invoke-direct {v3, p0, v1}, Ll/ۛ֫ۜ;-><init>(Ll/᩺֫ۜ;Ll/۠۟᩻;)V

    invoke-virtual {v0, p1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ۖ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 169
    sget v4, Ll/ۡۨ᩻;->֫:I

    .line 170
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    :try_start_2
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 174
    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object v4

    :catchall_0
    move-exception p1

    .line 160
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

    .line 174
    iget-object v1, v1, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 176
    :cond_0
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 177
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch executable ELF instructions using assembly source with a non-empty editSessionId. Prefer this to hand-encoding bytes for mt_apk_patch_bytes. Copy expectedHex from current mt_apk_read_bytes or mt_apk_native_disassemble output for the same editSessionId and locator; it both guards against stale reads and defines the equal-length patch window. file_offset is inside the SO entry, not the APK. Only loaded executable file-backed mappings can be patched. Alignment, instruction mode, assembly, length, and expected bytes are checked; a failure leaves the entry unchanged. Success returns assembledHex and afterHex including optional NOP padding, with nextActions to verify the result. This only validates local machine-code replacement, not control flow, stack balance, register conventions, relocations, or function semantics."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Patch Native Instructions"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩺֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. The mapped effective virtual address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit; x86 has no additional alignment requirement.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"expectedHex\": {\n    \"type\": \"string\",\n    \"description\": \"Stale-view guard bytes currently present at the patch address. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it. Use non-empty even-length hex without spaces. This defines the equal-length patch window; runtime accepts at most 256 bytes.\"\n  },\n  \"replacementAssembly\": {\n    \"type\": \"string\",\n    \"description\": \"Assembly source text containing instructions and labels only, assembled at the effective virtual address. This is not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly; do not include wa, seek commands, patch commands, or file paths. Runtime accepts 1..4096 characters.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"nop\"],\n    \"description\": \"Use none to require exact assembled length, or nop to fill a shorter assembled result with architecture NOP bytes.\"\n  }\n}\n"

    .line 81
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/᩺֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 132
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_patch_instructions"

    return-object v0
.end method
