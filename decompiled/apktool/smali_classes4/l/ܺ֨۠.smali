.class public abstract Ll/ܺ֨۠;
.super Ljava/lang/Object;
.source "U410"

# interfaces
.implements Ll/۬ۖ֨;


# instance fields
.field public ֫:Ll/ۖܶ۠;

.field public ۧ:Ll/ۡ֨۠;

.field public ܽ:I

.field public ܿ:Ll/ܰᩴ֨;

.field public ᩳ:Ll/ܳܶ۠;


# direct methods
.method public constructor <init>(Ll/ܳܶ۠;Ll/ۡ֨۠;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 91
    iput v0, p0, Ll/ܺ֨۠;->ܽ:I

    .line 98
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ֨۠;->֫:Ll/ۖܶ۠;

    .line 534
    new-instance v0, Ll/᩷֨۠;

    invoke-direct {v0, p0}, Ll/᩷֨۠;-><init>(Ll/ܺ֨۠;)V

    iput-object v0, p0, Ll/ܺ֨۠;->ܿ:Ll/ܰᩴ֨;

    .line 105
    iput-object p1, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    .line 106
    iput-object p2, p0, Ll/ܺ֨۠;->ۧ:Ll/ۡ֨۠;

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x18

    const/4 v1, 0x0

    if-gt p0, v0, :cond_0

    const-string v0, "                        "

    .line 370
    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 372
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    if-ge v1, p0, :cond_1

    const-string v2, " "

    .line 374
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 375
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 389
    invoke-static {p0}, Ll/ܺ֨۠;->֫(I)Ljava/lang/String;

    move-result-object p0

    .line 390
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n"

    .line 392
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v2, p1

    const-string v3, ""

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, p1, v4

    .line 393
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    move-object v3, v1

    goto :goto_0

    .line 397
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫᩵۠;)Ljava/lang/String;
    .locals 3

    .line 232
    sget-object v0, Ll/ۢ֨۠;->ۧ:[I

    invoke-virtual {p0}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 240
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unexpected tree kind "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/۬ܺ֨;->֫()Ll/ۗܺ֨;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 146
    :cond_1
    :goto_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 148
    :try_start_0
    new-instance v1, Ll/᩸ۚ۠;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/᩸ۚ۠;-><init>(Ljava/io/Writer;Z)V

    .line 209
    invoke-virtual {v1, p0, v2}, Ll/᩸ۚ۠;->֫(Ll/ۚۚ۠;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\s+"

    const-string v1, " "

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "/\\*missing\\*/"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_2

    return-object p0

    .line 163
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xa

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[...]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x5

    .line 0
    invoke-static {v1, p0, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 153
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 234
    :cond_3
    check-cast p0, Ll/ܶ֡۠;

    iget-object p0, p0, Ll/ܶ֡۠;->ۗ:Ll/۫᩵۠;

    invoke-static {p0}, Ll/ܺ֨۠;->֫(Ll/۫᩵۠;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;
    .locals 6

    .line 691
    invoke-virtual {p0}, Ll/ܽܶ۠;->᩻()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, -0x1

    const/4 v4, 0x1

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 129
    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 134
    sget-object v0, Ll/ۢ֨۠;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v4, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 139
    invoke-virtual {p0}, Ll/ܽܶ۠;->᩻()I

    move-result p0

    goto :goto_1

    .line 141
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown diagnostic position: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    .line 138
    :cond_2
    invoke-virtual {p0}, Ll/ܽܶ۠;->getColumnNumber()J

    move-result-wide p0

    goto :goto_2

    .line 137
    :cond_3
    invoke-virtual {p0}, Ll/ܽܶ۠;->getLineNumber()J

    move-result-wide p0

    goto :goto_2

    .line 136
    :cond_4
    invoke-virtual {p0}, Ll/ܽܶ۠;->ܳ()I

    move-result p0

    goto :goto_1

    .line 135
    :cond_5
    invoke-virtual {p0}, Ll/ܽܶ۠;->ۜ()I

    move-result p0

    :goto_1
    int-to-long p0, p0

    .line 130
    :goto_2
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽܶ۠;Z)Ljava/lang/String;
    .locals 0

    .line 146
    invoke-virtual {p0}, Ll/ܽܶ۠;->ۢ()Ll/ᩳ᩶۠;

    move-result-object p0

    if-eqz p0, :cond_2

    if-eqz p1, :cond_0

    .line 150
    invoke-interface {p0}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 151
    :cond_0
    instance-of p1, p0, Ll/۫ܳ۠;

    if-eqz p1, :cond_1

    check-cast p0, Ll/۫ܳ۠;

    .line 152
    invoke-virtual {p0}, Ll/۫ܳ۠;->ܳ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 154
    :cond_1
    sget p1, Ll/۫ܳ۠;->ᩳ:I

    .line 540
    invoke-interface {p0}, Ll/۟᩹۠;->toUri()Ljava/net/URI;

    move-result-object p0

    .line 541
    invoke-virtual {p0}, Ljava/net/URI;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object p0

    const-string p1, "/"

    .line 542
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 148
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܺ֨۠;)Ll/ۖܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ֨۠;->֫:Ll/ۖܶ۠;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܺ֨۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺ֨۠;->֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public bridge synthetic getConfiguration()Ll/ۙۖ֨;
    .locals 1

    .line 75
    invoke-virtual {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v0

    return-object v0
.end method

.method public getConfiguration()Ll/ۡ֨۠;
    .locals 1

    .line 401
    iget-object v0, p0, Ll/ܺ֨۠;->ۧ:Ll/ۡ֨۠;

    return-object v0
.end method

.method public varargs ֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽܶ۠;I)Ljava/lang/String;
    .locals 7

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܿ()Ll/ܳ۠۠;

    move-result-object v1

    .line 313
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result v2

    .line 314
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result p1

    const/4 v3, -0x1

    if-eq p1, v3, :cond_8

    const/4 p1, 0x0

    if-nez v1, :cond_0

    goto :goto_2

    .line 116
    :cond_0
    :try_start_0
    invoke-virtual {v1, v2}, Ll/ܳ۠۠;->֫(I)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 119
    :cond_1
    iget v3, v1, Ll/ܳ۠۠;->ܳ:I

    .line 120
    :goto_0
    iget v4, v1, Ll/ܳ۠۠;->ۧ:I

    if-ge v3, v4, :cond_2

    iget-object v4, v1, Ll/ܳ۠۠;->֫:[C

    aget-char v4, v4, v3

    const/16 v5, 0xd

    if-eq v4, v5, :cond_2

    const/16 v5, 0xa

    if-eq v4, v5, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 122
    :cond_2
    iget v4, v1, Ll/ܳ۠۠;->ܳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v3, v4

    if-nez v3, :cond_3

    .line 126
    :goto_1
    iput-object p1, v1, Ll/ܳ۠۠;->֫:[C

    goto :goto_2

    .line 124
    :cond_3
    :try_start_1
    new-instance v5, Ljava/lang/String;

    iget-object v6, v1, Ll/ܳ۠۠;->֫:[C

    invoke-direct {v5, v6, v4, v3}, Ljava/lang/String;-><init>([CII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    iput-object p1, v1, Ll/ܳ۠۠;->֫:[C

    move-object p1, v5

    :goto_2
    if-nez p1, :cond_4

    const-string p1, ""

    return-object p1

    .line 319
    :cond_4
    invoke-static {p2, p1}, Ll/ܺ֨۠;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    .line 320
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠۠;->֫(IZ)I

    move-result v1

    .line 321
    iget-object v2, p0, Ll/ܺ֨۠;->ۧ:Ll/ۡ֨۠;

    .line 513
    iget-boolean v2, v2, Ll/ۡ֨۠;->֫:Z

    if-eqz v2, :cond_7

    const-string v2, "\n"

    .line 322
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v2, v1, -0x1

    if-ge v3, v2, :cond_6

    .line 324
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x9

    if-ne v2, v4, :cond_5

    const-string v2, "\t"

    goto :goto_4

    :cond_5
    const-string v2, " "

    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    const-string p1, "^"

    .line 326
    invoke-static {p2, p1}, Ll/ܺ֨۠;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p2

    .line 126
    iput-object p1, v1, Ll/ܳ۠۠;->֫:[C

    .line 127
    throw p2

    .line 315
    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public ֫(Ll/ܽܶ۠;Ljava/lang/Object;Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 181
    instance-of v0, p2, Ll/ܽܶ۠;

    if-eqz v0, :cond_0

    check-cast p2, Ll/ܽܶ۠;

    .line 183
    iget p1, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺ֨۠;->ܽ:I

    .line 185
    :try_start_0
    invoke-interface {p0, p2, p3}, Ll/۬ۖ֨;->֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    iget p2, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/ܺ֨۠;->ܽ:I

    return-object p1

    :catchall_0
    move-exception p1

    iget p2, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/ܺ֨۠;->ܽ:I

    .line 189
    throw p1

    .line 192
    :cond_0
    instance-of v0, p2, Ll/۫᩵۠;

    if-eqz v0, :cond_1

    check-cast p2, Ll/۫᩵۠;

    .line 193
    invoke-static {p2}, Ll/ܺ֨۠;->֫(Ll/۫᩵۠;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 195
    :cond_1
    instance-of v0, p2, Ljava/lang/Iterable;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, p2, Ll/᩷۠ᩴ;

    if-nez v1, :cond_3

    .line 254
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, ""

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 257
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    invoke-virtual {p0, p1, v2, p3}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ljava/lang/Object;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    goto :goto_0

    .line 261
    :cond_2
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 198
    :cond_3
    instance-of p1, p2, Ll/ۙ֨֨;

    if-eqz p1, :cond_4

    check-cast p2, Ll/ۙ֨֨;

    .line 199
    iget-object p1, p0, Ll/ܺ֨۠;->ܿ:Ll/ܰᩴ֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    invoke-virtual {p2, p1, p3}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 201
    :cond_4
    instance-of p1, p2, Ll/ۛ֡֨;

    if-eqz p1, :cond_5

    check-cast p2, Ll/ۛ֡֨;

    .line 202
    iget-object p1, p0, Ll/ܺ֨۠;->ܿ:Ll/ܰᩴ֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    invoke-virtual {p2, p1, p3}, Ll/ۛ֡֨;->֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 204
    :cond_5
    instance-of p1, p2, Ll/ᩳ᩶۠;

    if-eqz p1, :cond_6

    check-cast p2, Ll/ᩳ᩶۠;

    .line 205
    invoke-interface {p2}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 207
    :cond_6
    instance-of p1, p2, Ll/ۛۢ۠;

    if-eqz p1, :cond_7

    check-cast p2, Ll/ۛۢ۠;

    .line 208
    iget-object p1, p2, Ll/ۛۢ۠;->᩸:Ljava/lang/String;

    return-object p1

    .line 210
    :cond_7
    instance-of p1, p2, Ll/֡ۖ۠;

    if-eqz p1, :cond_8

    check-cast p2, Ll/֡ۖ۠;

    .line 211
    iget-object p1, p2, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    return-object p1

    .line 213
    :cond_8
    instance-of p1, p2, Ll/ۤۖ֨;

    iget-object v0, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    if-eqz p1, :cond_9

    check-cast p2, Ll/ۤۖ֨;

    .line 214
    invoke-interface {p2, p3, v0}, Ll/ۤۖ֨;->֫(Ljava/util/Locale;Ll/ۨۖ֨;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 216
    :cond_9
    instance-of p1, p2, Ll/ۧۡ۠;

    if-eqz p1, :cond_a

    check-cast p2, Ll/ۧۡ۠;

    .line 217
    iget-object p1, p2, Ll/ۧۡ۠;->᩶:Ljava/lang/String;

    return-object p1

    .line 219
    :cond_a
    instance-of p1, p2, Ll/ܽ֡֨;

    if-eqz p1, :cond_b

    check-cast p2, Ll/ܽ֡֨;

    .line 220
    iget-object p1, p2, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    return-object p1

    .line 222
    :cond_b
    instance-of p1, p2, Ll/ᩴۚ۠;

    if-eqz p1, :cond_c

    check-cast p2, Ll/ᩴۚ۠;

    .line 223
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "compiler.misc.tree.tag."

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    .line 45
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    .line 224
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    .line 223
    invoke-virtual {v0, p3, p1, p2}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 227
    :cond_c
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽܶ۠;)Z
    .locals 2

    .line 351
    iget-object v0, p0, Ll/ܺ֨۠;->ۧ:Ll/ۡ֨۠;

    .line 478
    iget-object v0, v0, Ll/ۡ֨۠;->ܽ:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    .line 351
    sget-object v1, Ll/᩹ۖ֨;->ۙ:Ll/᩹ۖ֨;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܺ()Ll/۬۠۠;

    move-result-object v0

    sget-object v1, Ll/۬۠۠;->ۙ:Ll/۬۠۠;

    if-eq v0, v1, :cond_0

    .line 353
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic ۧ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 75
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ܽ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 4

    .line 110
    sget-object v0, Ll/ۢ֨۠;->ܽ:[I

    invoke-virtual {p1}, Ll/ܽܶ۠;->ܺ()Ll/۬۠۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string p1, "compiler.err.error"

    new-array v0, v3, [Ljava/lang/Object;

    .line 347
    invoke-virtual {v2, p2, p1, v0}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 116
    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown diagnostic type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ܽܶ۠;->ܺ()Ll/۬۠۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_1
    const-string p1, "compiler.warn.warning"

    new-array v0, v3, [Ljava/lang/Object;

    .line 347
    invoke-virtual {v2, p2, p1, v0}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, "compiler.note.note"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {v2, p2, p1, v0}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public final ܽ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 122
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ֨۠;->֫:Ll/ۖܶ۠;

    .line 123
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ܿ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract ܿ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
.end method

.method public final ᩳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;
    .locals 5

    .line 165
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 166
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 167
    invoke-virtual {p0, p1, v4, p2}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ljava/lang/Object;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ᩻(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;
    .locals 5

    .line 272
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 273
    sget-object v1, Ll/᩶ۖ֨;->᩹:Ll/᩶ۖ֨;

    .line 474
    iget-object v2, p0, Ll/ܺ֨۠;->ۧ:Ll/ۡ֨۠;

    iget-object v3, v2, Ll/ۡ֨۠;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    .line 274
    iget v4, p0, Ll/ܺ֨۠;->ܽ:I

    if-ge v4, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 275
    :cond_1
    :goto_0
    iget v1, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܺ֨۠;->ܽ:I

    .line 277
    :try_start_0
    sget-object v1, Ll/᩶ۖ֨;->᩶:Ll/᩶ۖ֨;

    .line 474
    iget-object v2, v2, Ll/ۡ֨۠;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 279
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۡ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽܶ۠;

    if-eq v1, v3, :cond_2

    if-ge v2, v1, :cond_3

    .line 304
    :cond_2
    invoke-interface {p0, v4, p2}, Ll/۬ۖ֨;->֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 281
    invoke-virtual {v0, v4}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 289
    :cond_3
    iget p1, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܺ֨۠;->ܽ:I

    return-object v0

    :catchall_0
    move-exception p1

    iget p2, p0, Ll/ܺ֨۠;->ܽ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/ܺ֨۠;->ܽ:I

    .line 290
    throw p1
.end method
