.class public final Ll/ۚۚ᩵;
.super Ll/ۨܺ᩵;
.source "49VB"


# static fields
.field public static final ᩻:Ll/֫᩻֨;


# instance fields
.field public ܳ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 60
    const-class v0, Ll/ۚۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۚۚ᩵;->᩻:Ll/֫᩻֨;

    .line 88
    :try_start_0
    new-instance v0, Ll/ۚۚ᩵;

    const-string v1, "S-1-1-0"

    invoke-direct {v0, v1}, Ll/ۚۚ᩵;-><init>(Ljava/lang/String;)V

    .line 89
    new-instance v0, Ll/ۚۚ᩵;

    const-string v1, "S-1-3-0"

    invoke-direct {v0, v1}, Ll/ۚۚ᩵;-><init>(Ljava/lang/String;)V

    .line 90
    new-instance v0, Ll/ۚۚ᩵;

    const-string v1, "S-1-5-18"

    invoke-direct {v0, v1}, Ll/ۚۚ᩵;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 92
    sget-object v1, Ll/ۚۚ᩵;->᩻:Ll/֫᩻֨;

    const-string v2, "Failed to create builtin SIDs"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 153
    invoke-direct {p0}, Ll/ۨܺ᩵;-><init>()V

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Ll/ۚۚ᩵;->ܳ:Ljava/lang/String;

    .line 119
    iput-object v0, p0, Ll/ۚۚ᩵;->ܿ:Ljava/lang/String;

    .line 154
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v1, "-"

    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_3

    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "S"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 159
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result p1

    iput-byte p1, p0, Ll/ۨܺ᩵;->ۧ:B

    .line 160
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    const-string v1, "0x"

    .line 162
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 163
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x10

    invoke-static {p1, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    goto :goto_0

    .line 165
    :cond_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    :goto_0
    const/4 p1, 0x6

    new-array p1, p1, [B

    .line 167
    iput-object p1, p0, Ll/ۨܺ᩵;->֫:[B

    const/4 p1, 0x5

    :goto_1
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 169
    iget-object v3, p0, Ll/ۨܺ᩵;->֫:[B

    const-wide/16 v4, 0x100

    rem-long v4, v1, v4

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v3, p1

    const/16 v3, 0x8

    shr-long/2addr v1, v3

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    .line 173
    :cond_1
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-lez p1, :cond_2

    .line 175
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۨܺ᩵;->ܽ:[I

    const/4 p1, 0x0

    .line 176
    :goto_2
    iget-byte v1, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-ge p1, v1, :cond_2

    .line 177
    iget-object v1, p0, Ll/ۨܺ᩵;->ܽ:[I

    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v3, v2

    aput v3, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_2
    return-void

    .line 157
    :cond_3
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Bad textual SID format: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>([BI)V
    .locals 4

    .line 130
    invoke-direct {p0}, Ll/ۨܺ᩵;-><init>()V

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Ll/ۚۚ᩵;->ܳ:Ljava/lang/String;

    .line 119
    iput-object v0, p0, Ll/ۚۚ᩵;->ܿ:Ljava/lang/String;

    add-int/lit8 v0, p2, 0x1

    .line 131
    aget-byte v1, p1, p2

    iput-byte v1, p0, Ll/ۨܺ᩵;->ۧ:B

    add-int/lit8 v1, p2, 0x2

    .line 132
    aget-byte v0, p1, v0

    iput-byte v0, p0, Ll/ۨܺ᩵;->ᩳ:B

    const/4 v0, 0x6

    new-array v2, v0, [B

    .line 133
    iput-object v2, p0, Ll/ۨܺ᩵;->֫:[B

    const/4 v3, 0x0

    .line 134
    invoke-static {p1, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p2, 0x8

    .line 136
    iget-byte v0, p0, Ll/ۨܺ᩵;->ᩳ:B

    const/16 v1, 0x64

    if-gt v0, v1, :cond_1

    .line 138
    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۨܺ᩵;->ܽ:[I

    .line 139
    :goto_0
    iget-byte v0, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-ge v3, v0, :cond_0

    .line 140
    iget-object v0, p0, Ll/ۨܺ᩵;->ܽ:[I

    invoke-static {p2, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    aput v1, v0, v3

    add-int/lit8 p2, p2, 0x4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 137
    :cond_1
    new-instance p1, Ll/۬ۡ᩵;

    const-string p2, "Invalid SID sub_authority_count"

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 137
    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 369
    instance-of v0, p1, Ll/ۚۚ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 370
    check-cast p1, Ll/ۚۚ᩵;

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 373
    :cond_0
    iget-byte v2, p1, Ll/ۨܺ᩵;->ᩳ:B

    iget-byte v3, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-ne v2, v3, :cond_5

    :goto_0
    add-int/lit8 v2, v3, -0x1

    if-lez v3, :cond_2

    .line 376
    iget-object v3, p1, Ll/ۨܺ᩵;->ܽ:[I

    aget v3, v3, v2

    iget-object v4, p0, Ll/ۨܺ᩵;->ܽ:[I

    aget v4, v4, v2

    if-eq v3, v4, :cond_1

    return v1

    :cond_1
    move v3, v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x6

    if-ge v2, v3, :cond_4

    .line 381
    iget-object v3, p1, Ll/ۨܺ᩵;->֫:[B

    aget-byte v3, v3, v2

    iget-object v4, p0, Ll/ۨܺ᩵;->֫:[B

    aget-byte v4, v4, v2

    if-eq v3, v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 386
    :cond_4
    iget-byte p1, p1, Ll/ۨܺ᩵;->ۧ:B

    iget-byte v2, p0, Ll/ۨܺ᩵;->ۧ:B

    if-ne p1, v2, :cond_5

    return v0

    :cond_5
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 359
    iget-object v0, p0, Ll/ۨܺ᩵;->֫:[B

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    const/4 v1, 0x0

    .line 360
    :goto_0
    iget-byte v2, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-ge v1, v2, :cond_0

    .line 361
    iget-object v2, p0, Ll/ۨܺ᩵;->ܽ:[I

    aget v2, v2, v1

    const v3, 0x1003f

    mul-int v2, v2, v3

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 399
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "S-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-byte v1, p0, Ll/ۨܺ᩵;->ۧ:B

    and-int/lit16 v1, v1, 0xff

    const-string v2, "-"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 401
    iget-object v1, p0, Ll/ۨܺ᩵;->֫:[B

    const/4 v3, 0x0

    aget-byte v4, v1, v3

    if-nez v4, :cond_2

    const/4 v4, 0x1

    aget-byte v1, v1, v4

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v5, 0x0

    const/4 v1, 0x5

    move-wide v7, v5

    :goto_0
    if-le v1, v4, :cond_1

    .line 408
    iget-object v9, p0, Ll/ۨܺ᩵;->֫:[B

    aget-byte v9, v9, v1

    int-to-long v9, v9

    const-wide/16 v11, 0xff

    and-long/2addr v9, v11

    long-to-int v11, v7

    shl-long/2addr v9, v11

    add-long/2addr v5, v9

    const-wide/16 v9, 0x8

    add-long/2addr v7, v9

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 411
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    :goto_1
    const-string v1, "0x"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 403
    iget-object v1, p0, Ll/ۨܺ᩵;->֫:[B

    const/4 v4, 0x6

    invoke-static {v1, v3, v4}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 414
    :goto_2
    iget-byte v1, p0, Ll/ۨܺ᩵;->ᩳ:B

    if-ge v3, v1, :cond_3

    .line 0
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 415
    iget-object v1, p0, Ll/ۨܺ᩵;->ܽ:[I

    aget v1, v1, v3

    int-to-long v4, v1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 425
    iget-object v0, p0, Ll/ۚۚ᩵;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "BUILTIN"

    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Ll/ۚۚ᩵;->ܿ:Ljava/lang/String;

    return-object v0

    .line 437
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۚۚ᩵;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\\"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚۚ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 442
    :cond_1
    invoke-virtual {p0}, Ll/ۚۚ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
