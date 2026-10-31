.class public final Ll/ۗܿܺ;
.super Ll/ܿᩴܺ;
.source "4BFE"


# instance fields
.field public final ᩶:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 80
    iput p2, p0, Ll/ۗܿܺ;->᩶:I

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;I)Ll/ۗܿܺ;
    .locals 3

    .line 60
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 61
    new-instance v1, Ll/ۗܿܺ;

    invoke-direct {v1, v0, p1}, Ll/ۗܿܺ;-><init>(II)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 64
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܿܺ;

    .line 102
    invoke-virtual {v1, p1, v2}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v1
.end method


# virtual methods
.method public final ֨()I
    .locals 2

    .line 113
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 92
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙܿܺ;

    .line 387
    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    invoke-virtual {v0}, Ll/ۙܿܺ;->ۧ()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 10

    .line 130
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v0

    .line 131
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 133
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    .line 137
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙܿܺ;

    .line 138
    invoke-virtual {v4}, Ll/ۙܿܺ;->ۧ()I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto :goto_2

    .line 142
    :cond_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->ᩳ()I

    move-result v7

    .line 352
    invoke-virtual {v4}, Ll/ۙܿܺ;->ܺ()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1

    goto :goto_2

    .line 358
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "  "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/ۙܿܺ;->ۡ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 359
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v7, :cond_2

    .line 360
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    goto :goto_1

    :cond_2
    sub-int/2addr v7, v6

    .line 362
    :goto_1
    invoke-static {v4, v6, v7, v8}, Ll/ۚᩴܺ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_2
    if-eqz v6, :cond_3

    .line 149
    invoke-virtual {p1, v5, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_3

    :cond_3
    if-eqz v5, :cond_4

    const-string v4, ""

    .line 151
    invoke-virtual {p1, v5, v4}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_4
    if-ge v3, v1, :cond_6

    .line 157
    invoke-virtual {p0, v3}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܿܺ;

    .line 159
    :try_start_0
    invoke-virtual {v2, p1}, Ll/ۙܿܺ;->֫(Ll/ᩳᩴܺ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "...while writing "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object p1

    throw p1

    .line 167
    :cond_6
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->ܳ()I

    move-result p1

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    .line 168
    invoke-virtual {p0}, Ll/ۗܿܺ;->֨()I

    move-result v0

    if-ne p1, v0, :cond_7

    return-void

    .line 169
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "write length mismatch; expected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p0}, Ll/ۗܿܺ;->֨()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " but actually wrote "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۠()I
    .locals 7

    .line 193
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 197
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙܿܺ;

    .line 200
    instance-of v4, v3, Ll/᩸ܿܺ;

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    .line 201
    move-object v4, v3

    check-cast v4, Ll/᩸ܿܺ;

    invoke-virtual {v4}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v4

    .line 202
    instance-of v6, v4, Ll/ܽܺܺ;

    if-eqz v6, :cond_1

    .line 203
    check-cast v4, Ll/ܽܺܺ;

    .line 205
    invoke-virtual {v3}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۬ܿܺ;->֫()I

    move-result v3

    const/16 v6, 0x71

    if-ne v3, v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 139
    :goto_1
    invoke-virtual {v4, v5}, Ll/ܽܺܺ;->֫(Z)Ll/᩺ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰܺܺ;->֨()I

    move-result v3

    goto :goto_2

    .line 207
    :cond_1
    instance-of v3, v4, Ll/᩻ܺܺ;

    if-eqz v3, :cond_2

    .line 208
    check-cast v4, Ll/᩻ܺܺ;

    .line 209
    invoke-virtual {v4}, Ll/᩻ܺܺ;->ᩴ()Ll/᩺ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰܺܺ;->֨()I

    move-result v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    .line 211
    :cond_3
    instance-of v4, v3, Ll/ᩳܳܺ;

    if-eqz v4, :cond_5

    .line 212
    invoke-virtual {v3}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۬ܿܺ;->֫()I

    move-result v4

    const/16 v6, 0xfa

    if-ne v4, v6, :cond_4

    .line 215
    check-cast v3, Ll/ᩳܳܺ;

    .line 221
    invoke-virtual {v3, v5}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/ۙܺܺ;

    .line 222
    invoke-virtual {v3}, Ll/ۙܺܺ;->ܺ()Ll/᩺ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰܺܺ;->֨()I

    move-result v3

    add-int/2addr v3, v5

    :goto_2
    if-le v3, v2, :cond_5

    move v2, v3

    goto :goto_3

    .line 213
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Expecting invoke-polymorphic"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return v2
.end method

.method public final ܶ()I
    .locals 1

    .line 182
    iget v0, p0, Ll/ۗܿܺ;->᩶:I

    return v0
.end method
