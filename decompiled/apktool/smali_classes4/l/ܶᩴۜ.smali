.class public final Ll/ܶᩴۜ;
.super Ljava/lang/Object;
.source "N6WI"

# interfaces
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:[Ll/ۙܺۜ;

.field public final synthetic ۛ:Ll/ܿۘۜ;

.field public final synthetic ۤ:Z

.field public final synthetic ۫:J

.field public final synthetic ۬:Ll/ۡۘۜ;

.field public final synthetic ᩶:[I

.field public ᩸:Ljava/lang/String;

.field public final synthetic ᩹:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ll/ۡۘۜ;Z[IJ[Ll/ۙܺۜ;Ll/ܿۘۜ;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܶᩴۜ;->ۗ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܶᩴۜ;->᩹:[Ljava/lang/String;

    iput-object p4, p0, Ll/ܶᩴۜ;->۬:Ll/ۡۘۜ;

    iput-boolean p5, p0, Ll/ܶᩴۜ;->ۤ:Z

    iput-object p6, p0, Ll/ܶᩴۜ;->᩶:[I

    iput-wide p7, p0, Ll/ܶᩴۜ;->۫:J

    iput-object p9, p0, Ll/ܶᩴۜ;->ۙ:[Ll/ۙܺۜ;

    iput-object p10, p0, Ll/ܶᩴۜ;->ۛ:Ll/ܿۘۜ;

    .line 129
    iput-object p1, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 13

    const-string v0, "FILE_TEXT_ENCODING_MISMATCH"

    .line 133
    iget-object v1, p0, Ll/ܶᩴۜ;->ۙ:[Ll/ۙܺۜ;

    iget-object v2, p1, Ll/ܶۖۜ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    .line 134
    invoke-static {v2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;)V

    const/high16 v2, 0x80000

    .line 135
    invoke-static {p1, v2}, Ll/᩻ᩴۜ;->֫(Ll/ܶۖۜ;I)[B

    move-result-object p1

    .line 136
    iget-object v2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {v2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;)V

    .line 139
    :try_start_0
    iget-object v2, p0, Ll/ܶᩴۜ;->ۗ:Ljava/lang/String;

    invoke-static {v2, p1}, Ll/۬ܺۜ;->֫(Ljava/lang/String;[B)Ll/᩶ܺۜ;

    move-result-object v2
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ll/᩹ܺۜ; {:try_start_0 .. :try_end_0} :catch_3

    iget-object v3, v2, Ll/᩶ܺۜ;->ۧ:Ljava/lang/String;

    .line 145
    iget-object v2, v2, Ll/᩶ܺۜ;->֫:Ljava/lang/String;

    iget-object v4, p0, Ll/ܶᩴۜ;->᩹:[Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    .line 149
    :try_start_1
    iget-object v2, p0, Ll/ܶᩴۜ;->۬:Ll/ۡۘۜ;

    iget-boolean v6, p0, Ll/ܶᩴۜ;->ۤ:Z

    invoke-virtual {v2, v3, v6}, Ll/ۡۘۜ;->֫(Ljava/lang/String;Z)Ll/ۢۘۜ;

    move-result-object v2
    :try_end_1
    .catch Ll/᩻ۘۜ; {:try_start_1 .. :try_end_1} :catch_2

    .line 153
    invoke-virtual {v2}, Ll/ۢۘۜ;->֫()I

    move-result v6

    iget-object v7, p0, Ll/ܶᩴۜ;->᩶:[I

    aput v6, v7, v5

    const-wide/16 v8, -0x1

    .line 154
    iget-wide v10, p0, Ll/ܶᩴۜ;->۫:J

    cmp-long v12, v10, v8

    if-eqz v12, :cond_1

    int-to-long v8, v6

    cmp-long v6, v10, v8

    if-nez v6, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "path"

    iget-object v0, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "expectedReplacements"

    .line 158
    invoke-virtual {p1, p2, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "actualReplacements"

    aget v0, v7, v5

    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "FILE_TEXT_REPLACEMENT_COUNT_MISMATCH"

    const-string v0, "The selected replacement count differs from expectedReplacements. No changes were published."

    const-string v1, "warning"

    const/4 v2, 0x0

    .line 155
    invoke-static {p2, v0, v1, v2, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 160
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ll/ۢۘۜ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 162
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    .line 165
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Ll/ۢۘۜ;->ܽ()Ljava/lang/String;

    move-result-object p1

    aget-object v2, v4, v5

    const/high16 v3, 0xa00000

    invoke-static {v3, p1, v2}, Ll/۬ܺۜ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۙܺۜ;

    move-result-object p1

    aput-object p1, v1, v5
    :try_end_2
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/ۗܺۜ; {:try_start_2 .. :try_end_2} :catch_0

    .line 172
    iget-object v2, p0, Ll/ܶᩴۜ;->ۛ:Ll/ܿۘۜ;

    iget-object p1, p1, Ll/ۙܺۜ;->֫:[B

    invoke-virtual {v2, p1}, Ll/ܿۘۜ;->֫([B)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 177
    aget-object p1, v1, v5

    iget-object p1, p1, Ll/ۙܺۜ;->֫:[B

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 179
    :goto_1
    iget-object p1, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {p1}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p1, "The replacement would change the physical BOM. Adjust the pattern or replacement text to preserve it."

    .line 173
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_0
    move-exception p1

    .line 169
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    iget-wide v0, p1, Ll/ۗܺۜ;->᩸:J

    invoke-static {v0, v1}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {p2, p1}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_1
    const-string p1, "The replacement cannot be represented in the selected encoding."

    .line 167
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    const-string v0, "FILE_TEXT_ENCODE_FAILED"

    invoke-static {v0, p1, p2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 151
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/᩹ᩴۜ;->֫(Ll/᩻ۘۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_3
    const-string p1, "Copy the current file\'s encoding including its physical BOM."

    .line 143
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_4
    const-string p1, "The file is not valid in the selected encoding."

    .line 141
    iget-object p2, p0, Ll/ܶᩴۜ;->᩸:Ljava/lang/String;

    const-string v0, "FILE_TEXT_DECODE_FAILED"

    invoke-static {v0, p1, p2}, Ll/᩹ᩴۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
