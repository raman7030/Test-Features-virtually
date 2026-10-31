.class public final Ll/ۢۘۘ;
.super Ljava/lang/Object;
.source "57ZT"

# interfaces
.implements Ll/᩷ۜۘ;


# instance fields
.field public ֫:Ll/ۖۘۘ;

.field public ۧ:[B

.field public ܽ:Ll/ܶۘۘ;

.field public ܿ:[B

.field public ᩳ:Ll/۟ۢۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 40
    iput-object v0, p0, Ll/ۢۘۘ;->ܿ:[B

    return-void
.end method


# virtual methods
.method public final end()V
    .locals 5

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Ll/ۢۘۘ;->ۧ:[B

    .line 57
    iget-object v1, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    if-eqz v1, :cond_2

    .line 154
    iget-object v1, v1, Ll/᩶ۘۘ;->ܿ:Ll/۠ۘۘ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    iget-object v1, v1, Ll/۠ۘۘ;->֫:Ll/᩵ۘۘ;

    if-eqz v1, :cond_1

    .line 606
    invoke-virtual {v1}, Ll/᩵ۘۘ;->֫()V

    .line 607
    iput-object v0, v1, Ll/᩵ۘۘ;->᩹:[B

    .line 608
    iput-object v0, v1, Ll/᩵ۘۘ;->ۢ:[I

    .line 59
    :cond_1
    :goto_0
    iput-object v0, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    .line 61
    :cond_2
    iget-object v1, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    if-eqz v1, :cond_5

    .line 148
    iget-object v2, v1, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    if-nez v2, :cond_3

    goto :goto_2

    .line 1430
    :cond_3
    iget v3, v2, Ll/ܺۘۘ;->֫ۧ:I

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_4

    const/16 v4, 0x71

    if-eq v3, v4, :cond_4

    const/16 v4, 0x29a

    if-eq v3, v4, :cond_4

    goto :goto_1

    .line 1434
    :cond_4
    iput-object v0, v2, Ll/ܺۘۘ;->۫֫:[B

    .line 1435
    iput-object v0, v2, Ll/ܺۘۘ;->ۢ֫:[B

    .line 1436
    iput-object v0, v2, Ll/ܺۘۘ;->ܿ֫:[S

    .line 1437
    iput-object v0, v2, Ll/ܺۘۘ;->ۨ֫:[S

    .line 1438
    iput-object v0, v2, Ll/ܺۘۘ;->᩻ۧ:[B

    .line 151
    :goto_1
    iput-object v0, v1, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    .line 278
    iput-object v0, v1, Ll/᩶ۘۘ;->᩻:[B

    .line 279
    iput-object v0, v1, Ll/᩶ۘۘ;->᩷:[B

    .line 280
    iput-object v0, v1, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 63
    :goto_2
    iput-object v0, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    .line 65
    :cond_5
    iput-object v0, p0, Ll/ۢۘۘ;->ᩳ:Ll/۟ۢۘ;

    return-void
.end method

.method public final ֫(IILl/۟ۢۘ;)V
    .locals 0

    .line 70
    iput-object p3, p0, Ll/ۢۘۘ;->ᩳ:Ll/۟ۢۘ;

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    .line 77
    :try_start_0
    new-instance p1, Ll/ۖۘۘ;

    invoke-direct {p1, p2}, Ll/ۖۘۘ;-><init>(I)V

    iput-object p1, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;
    :try_end_0
    .catch Ll/ۘۘۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 79
    new-instance p2, Ljava/io/UncheckedIOException;

    invoke-direct {p2, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p2

    :cond_0
    if-nez p1, :cond_1

    .line 82
    new-instance p1, Ll/ܶۘۘ;

    .line 61
    invoke-direct {p1}, Ll/᩶ۘۘ;-><init>()V

    .line 137
    new-instance p2, Ll/۠ۘۘ;

    invoke-direct {p2, p1}, Ll/۠ۘۘ;-><init>(Ll/ܶۘۘ;)V

    iput-object p2, p1, Ll/᩶ۘۘ;->ܿ:Ll/۠ۘۘ;

    .line 138
    invoke-virtual {p2}, Ll/۠ۘۘ;->ۧ()I

    .line 82
    iput-object p1, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    const/16 p1, 0x1000

    new-array p1, p1, [B

    .line 83
    iput-object p1, p0, Ll/ۢۘۘ;->ۧ:[B

    .line 47
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/ۢۘۘ;->ᩳ:Ll/۟ۢۘ;

    if-nez p1, :cond_2

    invoke-static {}, Ll/᩶᩷ۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object p1

    .line 48
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫([B[I)[B
    .locals 9

    .line 126
    iget-object v0, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    iput-object p1, v0, Ll/᩶ۘۘ;->᩻:[B

    const/4 v1, 0x5

    .line 127
    iput v1, v0, Ll/᩶ۘۘ;->ۜ:I

    const/4 v2, 0x0

    .line 128
    aget v3, p2, v2

    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    const/4 v0, 0x0

    .line 131
    :goto_0
    iget-object v3, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    iget-object v4, p0, Ll/ۢۘۘ;->ܿ:[B

    iput-object v4, v3, Ll/᩶ۘۘ;->᩷:[B

    .line 132
    iput v2, v3, Ll/᩶ۘۘ;->ۢ:I

    const/16 v5, 0x1000

    .line 133
    iput v5, v3, Ll/᩶ۘۘ;->ܽ:I

    .line 143
    iget-object v3, v3, Ll/᩶ۘۘ;->ܿ:Ll/۠ۘۘ;

    if-nez v3, :cond_0

    const/4 v3, -0x2

    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {v3}, Ll/۠ۘۘ;->֫()I

    move-result v3

    :goto_1
    const/4 v6, -0x5

    if-eq v3, v6, :cond_5

    if-eqz v3, :cond_2

    .line 47
    iget-object p1, p0, Ll/ۢۘۘ;->ᩳ:Ll/۟ۢۘ;

    if-nez p1, :cond_1

    invoke-static {}, Ll/᩶᩷ۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object p1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object p1

    .line 48
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1

    .line 137
    :cond_2
    iget-object v3, p0, Ll/ۢۘۘ;->ۧ:[B

    array-length v6, v3

    add-int/lit16 v7, v0, 0x1000

    iget-object v8, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    iget v8, v8, Ll/᩶ۘۘ;->ܽ:I

    sub-int/2addr v7, v8

    if-ge v6, v7, :cond_4

    .line 138
    array-length v6, v3

    mul-int/lit8 v6, v6, 0x2

    if-ge v6, v7, :cond_3

    goto :goto_3

    :cond_3
    move v7, v6

    .line 141
    :goto_3
    new-array v6, v7, [B

    .line 142
    invoke-static {v3, v2, v6, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 143
    iput-object v6, p0, Ll/ۢۘۘ;->ۧ:[B

    .line 145
    :cond_4
    iget-object v3, p0, Ll/ۢۘۘ;->ۧ:[B

    iget-object v6, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    iget v6, v6, Ll/᩶ۘۘ;->ܽ:I

    rsub-int v6, v6, 0x1000

    invoke-static {v4, v2, v3, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    iget-object v3, p0, Ll/ۢۘۘ;->ܽ:Ll/ܶۘۘ;

    iget v3, v3, Ll/᩶ۘۘ;->ܽ:I

    sub-int/2addr v5, v3

    add-int/2addr v0, v5

    .line 147
    aput v0, p2, v2

    goto :goto_0

    .line 150
    :cond_5
    array-length v3, p1

    sub-int/2addr v3, v1

    if-le v0, v3, :cond_6

    add-int/lit8 v3, v0, 0x5

    .line 151
    new-array v3, v3, [B

    .line 152
    invoke-static {p1, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    iget-object p1, p0, Ll/ۢۘۘ;->ۧ:[B

    invoke-static {p1, v2, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v3

    goto :goto_4

    .line 156
    :cond_6
    iget-object v3, p0, Ll/ۢۘۘ;->ۧ:[B

    invoke-static {v3, v2, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    :goto_4
    aput v0, p2, v2

    return-object p1
.end method

.method public final ۧ([B[I)[B
    .locals 7

    .line 90
    iget-object v0, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    iput-object p1, v0, Ll/᩶ۘۘ;->᩻:[B

    const/4 v1, 0x5

    .line 91
    iput v1, v0, Ll/᩶ۘۘ;->ۜ:I

    const/4 v2, 0x0

    .line 92
    aget v3, p2, v2

    sub-int/2addr v3, v1

    iput v3, v0, Ll/᩶ۘۘ;->ۧ:I

    .line 98
    :cond_0
    iget-object v0, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    iget-object v3, p0, Ll/ۢۘۘ;->ܿ:[B

    iput-object v3, v0, Ll/᩶ۘۘ;->᩷:[B

    .line 99
    iput v2, v0, Ll/᩶ۘۘ;->ۢ:I

    const/16 v4, 0x1000

    .line 100
    iput v4, v0, Ll/᩶ۘۘ;->ܽ:I

    .line 136
    iget-object v0, v0, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    if-nez v0, :cond_1

    const/4 v0, -0x2

    goto :goto_0

    .line 139
    :cond_1
    invoke-virtual {v0}, Ll/ܺۘۘ;->ܽ()I

    move-result v0

    :goto_0
    if-eqz v0, :cond_3

    .line 47
    iget-object v0, p0, Ll/ۢۘۘ;->ᩳ:Ll/۟ۢۘ;

    if-nez v0, :cond_2

    invoke-static {}, Ll/᩶᩷ۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    .line 48
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    .line 104
    :cond_3
    iget-object v0, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    iget v0, v0, Ll/᩶ۘۘ;->ܽ:I

    sub-int/2addr v4, v0

    .line 105
    array-length v0, p1

    add-int v5, v1, v4

    add-int/lit8 v6, v5, 0x34

    if-ge v0, v6, :cond_4

    mul-int/lit8 v6, v6, 0x2

    .line 106
    new-array v0, v6, [B

    .line 107
    array-length v6, p1

    invoke-static {p1, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 110
    :cond_4
    invoke-static {v3, v2, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v1, v5

    .line 116
    :goto_2
    iget-object v0, p0, Ll/ۢۘۘ;->֫:Ll/ۖۘۘ;

    iget v0, v0, Ll/᩶ۘۘ;->ܽ:I

    if-eqz v0, :cond_0

    .line 118
    aput v1, p2, v2

    return-object p1
.end method
