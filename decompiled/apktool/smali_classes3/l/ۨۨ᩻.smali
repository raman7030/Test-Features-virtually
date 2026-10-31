.class public final Ll/ۨۨ᩻;
.super Ljava/lang/Object;
.source "L78I"


# instance fields
.field public ֫:Ll/۠᩺᩻;


# direct methods
.method public static ֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;)Ll/۠ۛ֡;
    .locals 2

    .line 67
    iget-object v0, p1, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    .line 60
    invoke-virtual {p0, v0}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object p0

    .line 88
    new-instance v0, Ll/۠ۛ֡;

    iget v1, p1, Ll/ܿ᩺᩻;->֫:I

    iget p1, p1, Ll/ܿ᩺᩻;->ᩳ:I

    invoke-direct {v0, p0, v1, p1}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public static ֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/۬ۛ֡;)Ll/۠ۛ֡;
    .locals 3

    .line 88
    :try_start_0
    new-instance v0, Ll/۠ۛ֡;

    iget v1, p1, Ll/ܿ᩺᩻;->֫:I

    iget v2, p1, Ll/ܿ᩺᩻;->ᩳ:I

    invoke-direct {v0, p2, v1, v2}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    .line 258
    iget-object p1, p1, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-static {p1}, Ll/ܳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 259
    invoke-virtual {v0}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    .line 260
    :cond_0
    iget-object p1, p0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    iget-boolean p2, p0, Ll/ܳ᩻ۜ;->ۙ:Z

    invoke-static {p1, p2}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    :catch_0
    iget-object p1, p0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    iget-boolean p0, p0, Ll/ܳ᩻ۜ;->ۙ:Z

    invoke-static {p1, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 264
    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;Ll/ܿܿۜ;)Ll/ۛۨ᩻;
    .locals 2

    .line 230
    invoke-virtual {p3}, Ll/᩺ۖܽ;->ܽ()V

    .line 231
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    iget-object v1, p2, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, p3, p4, p5}, Ll/ᩴ᩺᩻;->֫(Ljava/lang/String;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;)Ll/ܺ᩺᩻;

    move-result-object p4

    iget-boolean p5, p4, Ll/ܺ᩺᩻;->֫:Z

    .line 233
    iget-boolean p4, p4, Ll/ܺ᩺᩻;->ۧ:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    .line 234
    new-instance p1, Ll/ۛۨ᩻;

    invoke-direct {p1, p5, v1, v0}, Ll/ۛۨ᩻;-><init>(ZZLl/ۗۛ᩻;)V

    return-object p1

    .line 237
    :cond_0
    :try_start_0
    iget-object p4, p2, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {p6, p4}, Ll/ܿܿۜ;->֫(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object p4

    .line 238
    invoke-static {p1, p2, p4}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/۬ۛ֡;)Ll/۠ۛ֡;

    move-result-object p1

    .line 57
    new-instance p2, Ll/᩹ܶ֡;

    invoke-direct {p2}, Ll/᩹ܶ֡;-><init>()V

    .line 58
    invoke-static {p3, p1, p2}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V

    .line 240
    new-instance p1, Ll/ۛۨ᩻;

    const/4 p2, 0x1

    invoke-direct {p1, p5, p2, v0}, Ll/ۛۨ᩻;-><init>(ZZLl/ۗۛ᩻;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 245
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    const-string p1, "Failed to disassemble class"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "SMALI_READ_FAILED"

    .line 244
    invoke-static {p2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 246
    new-instance p2, Ll/ۛۨ᩻;

    invoke-direct {p2, p5, v1, p1}, Ll/ۛۨ᩻;-><init>(ZZLl/ۗۛ᩻;)V

    return-object p2

    :catch_1
    move-exception p1

    .line 242
    new-instance p2, Ll/ۛۨ᩻;

    invoke-direct {p2, p5, v1, p1}, Ll/ۛۨ᩻;-><init>(ZZLl/ۗۛ᩻;)V

    return-object p2
.end method

.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/ܺۨ᩻;)Ll/۠ۛ֡;
    .locals 3

    if-nez p3, :cond_0

    .line 77
    invoke-static {p1, p2}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;)Ll/۠ۛ֡;

    move-result-object p1

    return-object p1

    .line 79
    :cond_0
    iget-object v0, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v1, p2, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    new-instance v2, Ll/ᩴۡܳ;

    invoke-direct {v2, p0, p1}, Ll/ᩴۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, v0, v1, v2}, Ll/ܺۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡܳ;)Ll/۬ۛ֡;

    move-result-object p1

    .line 88
    new-instance p3, Ll/۠ۛ֡;

    iget v0, p2, Ll/ܿ᩺᩻;->֫:I

    iget p2, p2, Ll/ܿ᩺᩻;->ᩳ:I

    invoke-direct {p3, p1, v0, p2}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object p3
.end method

.method public final ֫(Ll/ܳ᩻ۜ;Ljava/lang/String;ZLl/ܺۨ᩻;)Ll/ܶ᩺᩻;
    .locals 2

    .line 49
    iget-object v0, p1, Ll/ܳ᩻ۜ;->ۧ:Ljava/util/HashMap;

    invoke-static {p2}, Ll/ܳ᩺᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿ᩺᩻;

    if-eqz p2, :cond_6

    .line 170
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    iget-object v1, p2, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    .line 171
    invoke-virtual {p4}, Ll/ܺۨ᩻;->֫()Ll/۬ۜᩳ;

    move-result-object p4

    .line 170
    invoke-virtual {v0, v1, p4}, Ll/ᩴ᩺᩻;->֫(Ljava/lang/String;Ll/۬ۜᩳ;)Ll/ܺ᩺᩻;

    move-result-object p4

    iget-object v0, p4, Ll/ܺ᩺᩻;->ܽ:Ljava/lang/String;

    .line 172
    iget-boolean p4, p4, Ll/ܺ᩺᩻;->֫:Z

    if-eqz p4, :cond_0

    .line 173
    invoke-virtual {p0, p1}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;)V

    :cond_0
    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    .line 176
    new-instance p1, Ll/ܶ᩺᩻;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {p1, v0, p2, p3}, Ll/ܶ᩺᩻;-><init>(Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    return-object p1

    .line 179
    :cond_1
    :try_start_0
    invoke-static {p1, p2}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;)Ll/۠ۛ֡;

    move-result-object p1

    if-eqz v0, :cond_2

    goto :goto_0

    .line 49
    :cond_2
    new-instance p2, Ll/᩹ܶ֡;

    invoke-direct {p2}, Ll/᩹ܶ֡;-><init>()V

    .line 37
    new-instance p4, Ll/ۨۖܽ;

    invoke-direct {p4}, Ll/ۨۖܽ;-><init>()V

    .line 43
    new-instance v0, Ll/᩺ۖܽ;

    invoke-direct {v0, p4}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-static {v0, p1, p2}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V

    .line 39
    invoke-virtual {p4}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz p3, :cond_3

    .line 182
    invoke-static {p1}, Ll/ۡ۠ۘ;->ۧ(Ll/۠ۛ֡;)Ljava/util/LinkedHashMap;

    move-result-object p2

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_1
    if-eqz p3, :cond_4

    .line 184
    invoke-static {p1}, Ll/ۡ۠ۘ;->֫(Ll/۠ۛ֡;)Ljava/util/LinkedHashMap;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 185
    :goto_2
    new-instance p3, Ll/ܶ᩺᩻;

    invoke-direct {p3, v0, p2, p1}, Ll/ܶ᩺᩻;-><init>(Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    const-string p1, "Failed to disassemble class"

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_3
    const-string p2, "SMALI_READ_FAILED"

    .line 189
    invoke-static {p2, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 187
    throw p1

    .line 51
    :cond_6
    iget-object p1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    const-string p2, ""

    .line 180
    invoke-static {p1, p2}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 51
    throw p1
.end method

.method public final ֫(Ll/۠᩺᩻;)V
    .locals 0

    .line 42
    iput-object p1, p0, Ll/ۨۨ᩻;->֫:Ll/۠᩺᩻;

    return-void
.end method

.method public final ֫(Ll/ܳ᩻ۜ;)V
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ۨۨ᩻;->֫:Ll/۠᩺᩻;

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {v0, p1}, Ll/۠᩺᩻;->ۧ(Ll/ܳ᩻ۜ;)V

    :cond_0
    return-void
.end method
