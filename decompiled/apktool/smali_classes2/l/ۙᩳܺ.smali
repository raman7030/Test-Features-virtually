.class public abstract Ll/ۙᩳܺ;
.super Ljava/lang/Object;
.source "PBHV"


# instance fields
.field public final ֫:Ll/۠ᩳܺ;

.field public final ۧ:Ll/᩹ᩳܺ;

.field public final ܽ:Ll/۫ܺܺ;

.field public final ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩹ᩳܺ;Ll/۫ܺܺ;ILl/۠ᩳܺ;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_1

    if-eqz p4, :cond_0

    .line 88
    iput-object p1, p0, Ll/ۙᩳܺ;->ۧ:Ll/᩹ᩳܺ;

    .line 89
    iput-object p2, p0, Ll/ۙᩳܺ;->ܽ:Ll/۫ܺܺ;

    .line 90
    iput p3, p0, Ll/ۙᩳܺ;->ܿ:I

    .line 91
    iput-object p4, p0, Ll/ۙᩳܺ;->֫:Ll/۠ᩳܺ;

    const/4 p1, -0x1

    .line 92
    iput p1, p0, Ll/ۙᩳܺ;->ᩳ:I

    return-void

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "attributeFactory == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "offset < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(IILl/᩶ܺܺ;Ll/ܰᩳܺ;)Ll/ۛᩳܺ;
.end method

.method public final ۧ()I
    .locals 2

    .line 130
    iget-object v0, p0, Ll/ۙᩳܺ;->ۧ:Ll/᩹ᩳܺ;

    invoke-virtual {v0}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v0

    .line 131
    iget v1, p0, Ll/ۙᩳܺ;->ܿ:I

    invoke-virtual {v0, v1}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v0

    return v0
.end method

.method public final ܳ()V
    .locals 15

    .line 119
    iget v0, p0, Ll/ۙᩳܺ;->ᩳ:I

    if-gez v0, :cond_1

    const-string v0, "]"

    const-string v1, "s["

    const-string v2, "...while parsing "

    .line 185
    invoke-virtual {p0}, Ll/ۙᩳܺ;->֫()I

    move-result v3

    .line 186
    invoke-virtual {p0}, Ll/ۙᩳܺ;->ۧ()I

    move-result v4

    .line 187
    iget v5, p0, Ll/ۙᩳܺ;->ܿ:I

    add-int/lit8 v5, v5, 0x2

    .line 189
    iget-object v6, p0, Ll/ۙᩳܺ;->ۧ:Ll/᩹ᩳܺ;

    invoke-virtual {v6}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v7

    .line 190
    invoke-virtual {v6}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v8

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v4, :cond_0

    .line 199
    :try_start_0
    invoke-virtual {v7, v5}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v10

    add-int/lit8 v11, v5, 0x2

    .line 200
    invoke-virtual {v7, v11}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v11

    add-int/lit8 v12, v5, 0x4

    .line 201
    invoke-virtual {v7, v12}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v12

    .line 202
    invoke-virtual {v8, v11}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v11

    check-cast v11, Ll/۬ܺܺ;

    .line 203
    invoke-virtual {v8, v12}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v12

    check-cast v12, Ll/۬ܺܺ;

    add-int/lit8 v5, v5, 0x6

    .line 221
    new-instance v13, Ll/ܶᩳܺ;

    iget-object v14, p0, Ll/ۙᩳܺ;->֫:Ll/۠ᩳܺ;

    invoke-direct {v13, v6, v3, v5, v14}, Ll/ܶᩳܺ;-><init>(Ll/᩹ᩳܺ;IILl/۠ᩳܺ;)V

    .line 225
    invoke-virtual {v13}, Ll/ܶᩳܺ;->֫()I

    move-result v5

    .line 226
    invoke-virtual {v13}, Ll/ܶᩳܺ;->ۧ()Ll/ܰᩳܺ;

    move-result-object v13

    .line 227
    invoke-virtual {v13}, Ll/ᩴᩴܺ;->ܺ()V

    .line 228
    new-instance v14, Ll/᩶ܺܺ;

    invoke-direct {v14, v11, v12}, Ll/᩶ܺܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    .line 229
    invoke-virtual {p0, v9, v10, v14, v13}, Ll/ۙᩳܺ;->֫(IILl/᩶ܺܺ;Ll/ܰᩳܺ;)Ll/ۛᩳܺ;
    :try_end_0
    .catch Ll/᩺ᩳܺ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :catch_0
    move-exception v3

    .line 243
    new-instance v4, Ll/᩺ᩳܺ;

    const/4 v5, 0x0

    .line 69
    invoke-direct {v4, v5, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 244
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۙᩳܺ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 246
    throw v4

    :catch_1
    move-exception v3

    .line 239
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۙᩳܺ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 241
    throw v3

    .line 250
    :cond_0
    iput v5, p0, Ll/ۙᩳܺ;->ᩳ:I

    :cond_1
    return-void
.end method

.method public final ܽ()Ll/۫ܺܺ;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۙᩳܺ;->ܽ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public abstract ܿ()Ljava/lang/String;
.end method

.method public final ᩳ()I
    .locals 1

    .line 102
    invoke-virtual {p0}, Ll/ۙᩳܺ;->ܳ()V

    .line 103
    iget v0, p0, Ll/ۙᩳܺ;->ᩳ:I

    return v0
.end method
