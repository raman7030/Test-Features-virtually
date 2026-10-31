.class public Ll/۟֫֨;
.super Ll/ۨܽ֨;
.source "77DE"


# instance fields
.field public ۜۧ:Ll/ܶۨۚ;

.field public ᩻ۧ:[I


# virtual methods
.method public final ֫(ILjava/io/DataInputStream;)V
    .locals 3

    .line 69
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x2

    if-ne p1, v1, :cond_1

    .line 73
    new-array p1, v0, [I

    iput-object p1, p0, Ll/۟֫֨;->᩻ۧ:[I

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 75
    iget-object v1, p0, Ll/۟֫֨;->᩻ۧ:[I

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    aput v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 71
    :cond_1
    new-instance p1, Ljava/lang/ClassFormatError;

    iget-object p2, p0, Ll/۟֫֨;->ۜۧ:Ll/ܶۨۚ;

    invoke-virtual {p2}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object p2

    const-string v0, "_attribute: Invalid attribute length"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 71
    invoke-direct {p1, p2}, Ljava/lang/ClassFormatError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۙ()V
    .locals 10

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    iget-object v2, p0, Ll/۟֫֨;->᩻ۧ:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    const-string v3, ";"

    .line 93
    iget-boolean v4, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v4, :cond_0

    const-string v5, ""

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    const/4 v6, 0x0

    :goto_1
    if-gt v6, v2, :cond_4

    const-string v7, ", "

    if-eqz v4, :cond_2

    const-string v8, "#"

    .line 96
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v8, v8, v6

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-ne v6, v2, :cond_1

    move-object v8, v3

    goto :goto_2

    :cond_1
    move-object v8, v7

    :goto_2
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    :cond_2
    iget-object v8, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget-object v9, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v9, v9, v6

    invoke-virtual {v8, v9}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ne v6, v2, :cond_3

    move-object v7, v5

    :cond_3
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 100
    :cond_4
    iget-object v2, p0, Ll/۟֫֨;->ۜۧ:Ll/ܶۨۚ;

    invoke-virtual {v2}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v3

    invoke-virtual {p0, v3, v2}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    if-eqz v4, :cond_6

    .line 102
    iget-boolean v2, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-eqz v2, :cond_5

    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 105
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۢܽ֨;->ۢ()I

    move-result v2

    invoke-virtual {p0, v2, v0}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 228
    iget-object v2, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v2, v0}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " // "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 108
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۚ()V
    .locals 0

    .line 135
    invoke-virtual {p0}, Ll/۟֫֨;->ᩴ()V

    return-void
.end method

.method public final ᩴ()V
    .locals 2

    .line 82
    iget-object v0, p0, Ll/۟֫֨;->᩻ۧ:[I

    array-length v0, v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 83
    invoke-virtual {p0}, Ll/۟֫֨;->᩹()V

    return-void

    .line 85
    :cond_0
    invoke-virtual {p0}, Ll/۟֫֨;->ۙ()V

    return-void
.end method

.method public ᩹()V
    .locals 10

    .line 113
    iget-object v0, p0, Ll/۟֫֨;->ۜۧ:Ll/ܶۨۚ;

    invoke-virtual {v0}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ltz v1, :cond_d

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    const-string v4, " "

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    const v5, 0x7fffffff

    .line 0
    div-int/2addr v5, v1

    if-gt v3, v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_1

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v2, "Repeating 1 bytes String "

    const-string v3, " times will produce a String exceeding maximum size."

    invoke-static {v1, v2, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string v4, ""

    .line 115
    :goto_1
    iget-object v1, p0, Ll/۟֫֨;->᩻ۧ:[I

    array-length v1, v1

    sub-int/2addr v1, v3

    const/4 v5, 0x0

    :goto_2
    if-gt v5, v1, :cond_c

    .line 117
    iget-boolean v6, p0, Ll/ۢܽ֨;->֫֫:Z

    const-string v7, ","

    const-string v8, ";"

    if-eqz v6, :cond_9

    .line 118
    iget-boolean v6, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-eqz v6, :cond_6

    if-nez v5, :cond_4

    move-object v6, v0

    goto :goto_3

    :cond_4
    move-object v6, v4

    .line 119
    :goto_3
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v9

    invoke-virtual {p0, v9, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    iget-object v6, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v6, v6, v5

    .line 120
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v6, v9, v2

    const-string v6, "#%d"

    .line 19
    invoke-static {v6, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 228
    iget-object v9, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v9, v6}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    if-ne v5, v1, :cond_5

    move-object v7, v8

    .line 120
    :cond_5
    invoke-virtual {p0, v7}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_6
    if-nez v5, :cond_7

    move-object v6, v0

    goto :goto_4

    :cond_7
    move-object v6, v4

    .line 122
    :goto_4
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v9

    invoke-virtual {p0, v9, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    iget-object v6, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v6, v6, v5

    .line 123
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    if-ne v5, v1, :cond_8

    move-object v7, v8

    :cond_8
    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v6, v8, v2

    aput-object v7, v8, v3

    const-string v6, "#%d%s"

    .line 19
    invoke-static {v6, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 123
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۢ()I

    move-result v7

    invoke-virtual {p0, v7, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 228
    iget-object v7, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v7, v6}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    .line 123
    iget-object v6, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget-object v7, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v7, v7, v5

    .line 124
    invoke-virtual {v6, v7}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v6

    .line 19
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, " // "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 124
    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    if-nez v5, :cond_a

    move-object v6, v0

    goto :goto_5

    :cond_a
    move-object v6, v4

    .line 127
    :goto_5
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v9

    invoke-virtual {p0, v9, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    iget-object v6, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget-object v9, p0, Ll/۟֫֨;->᩻ۧ:[I

    aget v9, v9, v5

    .line 128
    invoke-virtual {v6, v9}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v6

    .line 228
    iget-object v9, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v9, v6}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    if-ne v5, v1, :cond_b

    move-object v7, v8

    .line 128
    :cond_b
    invoke-virtual {p0, v7}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :cond_c
    return-void

    .line 0
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "count is negative: "

    invoke-static {v1, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
