.class public abstract Ll/᩻ܳ֡;
.super Ll/ᩴܳ֡;
.source "U42S"

# interfaces
.implements Ll/֨ܳ֡;


# instance fields
.field public ۖ:I

.field public ۘ:I

.field public ۜ:I

.field public ۡ:Ll/᩷᩷֡;

.field public ۢ:Ll/֡ܳ֡;

.field public ܳ:Z

.field public ܺ:I

.field public ܿ:Ll/ۚܳ֡;

.field public ᩳ:I

.field public ᩴ:I

.field public final ᩷:Ll/ܿ᩷֡;

.field public ᩻:Ll/᩺ܿ֡;


# direct methods
.method public constructor <init>(Ll/᩺ܿ֡;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ll/ᩴܳ֡;-><init>()V

    .line 38
    sget-object v0, Ll/۟ܿ֡;->֫:Ll/۟ܿ֡;

    iput-object v0, p0, Ll/᩻ܳ֡;->ܿ:Ll/ۚܳ֡;

    const/4 v0, -0x1

    .line 54
    iput v0, p0, Ll/᩻ܳ֡;->ܺ:I

    .line 73
    new-instance v0, Ll/ܿ᩷֡;

    .line 14
    invoke-direct {v0}, Ll/ܿ᩷֡;-><init>()V

    .line 73
    iput-object v0, p0, Ll/᩻ܳ֡;->᩷:Ll/ܿ᩷֡;

    const/4 v0, 0x0

    .line 74
    iput v0, p0, Ll/᩻ܳ֡;->ۜ:I

    .line 84
    iput-object p1, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    .line 85
    new-instance v0, Ll/᩷᩷֡;

    invoke-direct {v0, p0, p1}, Ll/᩷᩷֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩻ܳ֡;->ۡ:Ll/᩷᩷֡;

    return-void
.end method


# virtual methods
.method public final getInputStream()Ll/᩺ܿ֡;
    .locals 1

    .line 225
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    return-object v0
.end method

.method public final getLine()I
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 262
    check-cast v0, Ll/ۘ᩻֡;

    invoke-virtual {v0}, Ll/ۘ᩻֡;->ܽ()I

    move-result v0

    return v0
.end method

.method public nextToken()Ll/֡ܳ֡;
    .locals 12

    .line 113
    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    if-eqz v0, :cond_7

    .line 119
    invoke-interface {v0}, Ll/ܳܳ֡;->֫()I

    move-result v1

    .line 123
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Ll/᩻ܳ֡;->ܳ:Z

    if-eqz v2, :cond_0

    .line 124
    invoke-virtual {p0}, Ll/᩻ܳ֡;->ۡ()Ll/֡ܳ֡;

    .line 125
    iget-object v2, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ܽ(I)V

    return-object v2

    :cond_0
    const/4 v2, 0x0

    .line 128
    :try_start_1
    iput-object v2, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;

    const/4 v2, 0x0

    .line 129
    iput v2, p0, Ll/᩻ܳ֡;->ᩳ:I

    .line 130
    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v3

    iput v3, p0, Ll/᩻ܳ֡;->ܺ:I

    .line 150
    iget-object v3, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 131
    check-cast v3, Ll/ۘ᩻֡;

    invoke-virtual {v3}, Ll/ۘ᩻֡;->ۧ()I

    move-result v3

    iput v3, p0, Ll/᩻ܳ֡;->ۖ:I

    .line 150
    iget-object v3, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 132
    check-cast v3, Ll/ۘ᩻֡;

    invoke-virtual {v3}, Ll/ۘ᩻֡;->ܽ()I

    move-result v3

    iput v3, p0, Ll/᩻ܳ֡;->ۘ:I

    .line 135
    :cond_1
    iput v2, p0, Ll/᩻ܳ֡;->ᩴ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, -0x3

    const/4 v4, -0x1

    const/4 v5, 0x1

    .line 150
    :try_start_2
    iget-object v6, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 141
    check-cast v6, Ll/ۘ᩻֡;

    iget v7, p0, Ll/᩻ܳ֡;->ۜ:I

    invoke-virtual {v6, v0, v7}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;I)I

    move-result v6
    :try_end_2
    .catch Ll/ۜܳ֡; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v6

    .line 144
    :try_start_3
    invoke-virtual {p0, v6}, Ll/᩻ܳ֡;->֫(Ll/ۜܳ֡;)V

    .line 353
    invoke-interface {v0, v5}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v6

    if-eq v6, v4, :cond_2

    .line 150
    iget-object v6, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 355
    check-cast v6, Ll/ۘ᩻֡;

    invoke-virtual {v6, v0}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    :cond_2
    const/4 v6, -0x3

    .line 148
    :goto_1
    invoke-interface {v0, v5}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v7

    if-ne v7, v4, :cond_3

    .line 149
    iput-boolean v5, p0, Ll/᩻ܳ֡;->ܳ:Z

    .line 151
    :cond_3
    iget v4, p0, Ll/᩻ܳ֡;->ᩴ:I

    if-nez v4, :cond_4

    iput v6, p0, Ll/᩻ܳ֡;->ᩴ:I

    .line 152
    :cond_4
    iget v5, p0, Ll/᩻ܳ֡;->ᩴ:I

    if-ne v5, v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, -0x2

    if-eq v5, v3, :cond_1

    .line 156
    iget-object v2, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;

    if-nez v2, :cond_6

    .line 245
    iget-object v3, p0, Ll/᩻ܳ֡;->ܿ:Ll/ۚܳ֡;

    iget-object v4, p0, Ll/᩻ܳ֡;->ۡ:Ll/᩷᩷֡;

    iget v7, p0, Ll/᩻ܳ֡;->ᩳ:I

    iget v8, p0, Ll/᩻ܳ֡;->ܺ:I

    .line 280
    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v2

    add-int/lit8 v9, v2, -0x1

    .line 245
    iget v10, p0, Ll/᩻ܳ֡;->ۘ:I

    iget v11, p0, Ll/᩻ܳ֡;->ۖ:I

    const/4 v6, 0x0

    invoke-interface/range {v3 .. v11}, Ll/ۚܳ֡;->֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;

    move-result-object v2

    .line 235
    iput-object v2, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;

    .line 157
    :cond_6
    iget-object v2, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ܽ(I)V

    return-object v2

    :catchall_0
    move-exception v2

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ܽ(I)V

    .line 164
    throw v2

    .line 114
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "nextToken requires a non-null input stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()I
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 267
    check-cast v0, Ll/ۘ᩻֡;

    invoke-virtual {v0}, Ll/ۘ᩻֡;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۚܳ֡;)V
    .locals 0

    .line 200
    iput-object p1, p0, Ll/᩻ܳ֡;->ܿ:Ll/ۚܳ֡;

    return-void
.end method

.method public final ֫(Ll/ۜܳ֡;)V
    .locals 9

    .line 360
    iget v0, p0, Ll/᩻ܳ֡;->ܺ:I

    iget-object v1, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v2

    invoke-static {v0, v2}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/᩺ܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object v0

    .line 361
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "token recognition error at: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-char v5, v0, v4

    int-to-char v6, v5

    .line 376
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    const/4 v7, -0x1

    if-eq v5, v7, :cond_3

    const/16 v7, 0xd

    if-eq v5, v7, :cond_2

    const/16 v7, 0x9

    if-eq v5, v7, :cond_1

    const/16 v7, 0xa

    if-eq v5, v7, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, "\\n"

    goto :goto_1

    :cond_1
    const-string v6, "\\t"

    goto :goto_1

    :cond_2
    const-string v6, "\\r"

    goto :goto_1

    :cond_3
    const-string v6, "<EOF>"

    .line 370
    :goto_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 372
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 363
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ᩳ()Ll/ܺܳ֡;

    move-result-object v2

    .line 364
    iget v5, p0, Ll/᩻ܳ֡;->ۘ:I

    iget v6, p0, Ll/᩻ܳ֡;->ۖ:I

    const/4 v4, 0x0

    move-object v3, p0

    move-object v8, p1

    invoke-virtual/range {v2 .. v8}, Ll/ܺܳ֡;->֫(Ll/ᩴܳ֡;Ljava/lang/Object;IILjava/lang/String;Ll/ۖܳ֡;)V

    return-void
.end method

.method public final ۖ()V
    .locals 2

    .line 192
    iget-object v0, p0, Ll/᩻ܳ֡;->᩷:Ll/ܿ᩷֡;

    invoke-virtual {v0}, Ll/ܿ᩷֡;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 30
    invoke-virtual {v0}, Ll/ܿ᩷֡;->ܽ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/ܿ᩷֡;->ܽ(I)I

    move-result v0

    .line 182
    iput v0, p0, Ll/᩻ܳ֡;->ۜ:I

    return-void

    .line 192
    :cond_0
    new-instance v0, Ljava/util/EmptyStackException;

    invoke-direct {v0}, Ljava/util/EmptyStackException;-><init>()V

    throw v0
.end method

.method public final ۡ()Ll/֡ܳ֡;
    .locals 9

    .line 252
    invoke-virtual {p0}, Ll/᩻ܳ֡;->֫()I

    move-result v8

    .line 253
    invoke-virtual {p0}, Ll/᩻ܳ֡;->getLine()I

    move-result v7

    .line 254
    iget-object v0, p0, Ll/᩻ܳ֡;->ܿ:Ll/ۚܳ֡;

    iget-object v1, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v5

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v1

    add-int/lit8 v6, v1, -0x1

    iget-object v1, p0, Ll/᩻ܳ֡;->ۡ:Ll/᩷᩷֡;

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface/range {v0 .. v8}, Ll/ۚܳ֡;->֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;

    move-result-object v0

    .line 235
    iput-object v0, p0, Ll/᩻ܳ֡;->ۢ:Ll/֡ܳ֡;

    return-object v0
.end method

.method public final ۧ()Ll/ۚܳ֡;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/᩻ܳ֡;->ܿ:Ll/ۚܳ֡;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 2

    .line 150
    iget-object v0, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    .line 290
    check-cast v0, Ll/ۘ᩻֡;

    iget-object v1, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-virtual {v0, v1}, Ll/ۘ᩻֡;->ۧ(Ll/᩺ܿ֡;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
