.class public final Ll/ۛ۟᩻;
.super Ll/ۙۛ᩻;
.source "F762"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܳ:Ll/᩵᩻ۜ;

.field public final ܽ:Ll/ۗ۟᩻;

.field public ܿ:Lbin/mt/json/JSONObject;

.field public final ᩳ:Ll/ܰ۟᩻;


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

    .line 45
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ۛ۟᩻;->ܳ:Ll/᩵᩻ۜ;

    .line 47
    iput-object v0, p0, Ll/ۛ۟᩻;->֫:Ll/᩹ۧۜ;

    .line 48
    iput-object v1, p0, Ll/ۛ۟᩻;->ᩳ:Ll/ܰ۟᩻;

    .line 49
    new-instance p1, Ll/ۗ۟᩻;

    .line 392
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ۛ۟᩻;->ܽ:Ll/ۗ۟᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ۟᩻;Ll/ᩴ۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ۛ۟᩻;->֫:Ll/᩹ۧۜ;

    iget-object p0, p0, Ll/ۛ۟᩻;->ܽ:Ll/ۗ۟᩻;

    invoke-static {v0, p2, p1, p0}, Ll/۬۟᩻;->֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/ᩴ۟᩻;Ll/ۗ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۛ۟᩻;Ll/ᩴ۟᩻;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 152
    iget-object v0, p0, Ll/ۛ۟᩻;->ᩳ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/ᩴ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p1, Ll/ᩴ۟᩻;->ܿ:Ljava/lang/String;

    new-instance v3, Ll/ۤ۟᩻;

    invoke-direct {v3, p0, p1}, Ll/ۤ۟᩻;-><init>(Ll/ۛ۟᩻;Ll/ᩴ۟᩻;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 69
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 488
    invoke-static {p1}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    invoke-static {p1}, Ll/ۜ֫ۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto :goto_0

    .line 490
    :cond_0
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_0
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 487
    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 137
    iget-object v0, p0, Ll/ۛ۟᩻;->ܳ:Ll/᩵᩻ۜ;

    .line 148
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->֫(Lbin/mt/json/JSONObject;)Ll/ᩴ۟᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v1, p1, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    .line 150
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 151
    :try_start_2
    new-instance v3, Ll/۫۟᩻;

    invoke-direct {v3, p0, p1}, Ll/۫۟᩻;-><init>(Ll/ۛ۟᩻;Ll/ᩴ۟᩻;)V

    invoke-virtual {v0, v1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 156
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 160
    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 162
    sget p1, Ll/ۡۨ᩻;->֫:I

    return-object v4

    :catchall_0
    move-exception v1

    .line 150
    :try_start_4
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    goto :goto_1

    :catchall_3
    move-exception v1

    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_0

    .line 160
    iget-object p1, p1, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 162
    :cond_0
    sget p1, Ll/ۡۨ᩻;->֫:I

    .line 163
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Disassemble an instruction window from an executable ELF mapping. Use mt_apk_native_map_address when unsure whether an address is code. file_offset means an offset inside the SO entry, not the APK. Pass editSessionId=\"\" for the base APK. The result disassemblyText uses \"0x<hex-address>: <hex-bytes> <assembly>\"; displayed addresses are virtual addresses with the 0x prefix and no leading zero padding. Machine bytes are contiguous lowercase hex in original byte order. archBits is the ELF bit width, while instructionSet and instructionWidth describe the decoded instructions. Missing symbol metadata falls back to the requested byte window. If incompleteInstructionAtEnd=true, retry the same address with a larger maxBytes. When hasMore=true, copy the purpose=continue action from nextActions and call its tool, mt_apk_native_disassemble, with its complete arguments for the next window. Do not pass this action to mt_apk_continue. To edit code, first disassemble the same location with a non-empty editSessionId, then use mt_apk_native_patch_instructions. Use addressKind=virtual, effectiveAddress or any displayed address copied unchanged, and resolvedInstructionMode. Build expectedHex by concatenating the byte columns of contiguous selected lines, at most 256 bytes. Use mt_apk_patch_bytes only when exact raw machine bytes are intentionally required."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Disassemble Native Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۛ۟᩻;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to disassemble the edited session view; pass an empty string to disassemble the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"stopAtSymbolBoundary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether to stop before the end of the containing best-effort sized ELF symbol when available. Use true when following an xref/source address for containing-symbol context; use false for a normal maxBytes-bounded window without a symbol-end cap. This does not move the start address back to the symbol start.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes in the instruction window. Valid range is 1..4096.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum instructions to include in disassemblyText. Valid range is 1..200.\"\n  }\n}\n"

    .line 77
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۟᩻;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۛ۟᩻;->ܿ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 127
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۟᩻;->ܿ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_disassemble"

    return-object v0
.end method
