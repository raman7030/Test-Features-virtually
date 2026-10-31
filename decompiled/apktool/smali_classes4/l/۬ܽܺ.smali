.class public final Ll/۬ܽܺ;
.super Ll/ᩴᩴܺ;
.source "DBGV"


# instance fields
.field public ۙ:I

.field public final ᩶:[Ll/֫ۖܺ;

.field public final ᩹:[Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 56
    :goto_0
    invoke-direct {p0, v1}, Ll/ᩴᩴܺ;-><init>(Z)V

    .line 57
    new-array v1, p1, [Ll/֫ۖܺ;

    iput-object v1, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    .line 58
    new-array p1, p1, [Z

    iput-object p1, p0, Ll/۬ܽܺ;->᩹:[Z

    .line 59
    iput v0, p0, Ll/۬ܽܺ;->ۙ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    .line 343
    new-instance v0, Ll/ۖᩳܺ;

    const-string v1, "stack: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 343
    throw v0
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 132
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    return v0
.end method

.method public final ֨()Ll/۬ܽܺ;
    .locals 5

    .line 68
    new-instance v0, Ll/۬ܽܺ;

    iget-object v1, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    array-length v2, v1

    invoke-direct {v0, v2}, Ll/۬ܽܺ;-><init>(I)V

    .line 70
    iget-object v2, v0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    iget-object v1, v0, Ll/۬ܽܺ;->᩹:[Z

    iget-object v2, p0, Ll/۬ܽܺ;->᩹:[Z

    array-length v3, v2

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    iget v1, p0, Ll/۬ܽܺ;->ۙ:I

    iput v1, v0, Ll/۬ܽܺ;->ۙ:I

    return-object v0
.end method

.method public final ֫(I)Ll/֫ۖܺ;
    .locals 1

    if-ltz p1, :cond_1

    .line 207
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    if-ge p1, v0, :cond_0

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 211
    iget-object p1, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    const-string p1, "underflow"

    .line 208
    invoke-static {p1}, Ll/۬ܽܺ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 204
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "n < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/֫ۖܺ;)V
    .locals 4

    .line 277
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 280
    :try_start_0
    invoke-interface {p2}, Ll/֫ۖܺ;->ۢ()Ll/֫ۖܺ;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 287
    iget-object p1, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    .line 290
    invoke-interface {v1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ܺܺ;->᩻()I

    move-result v2

    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۟ܺܺ;->᩻()I

    move-result v3

    if-ne v2, v3, :cond_0

    .line 296
    aput-object p2, p1, v0

    return-void

    .line 291
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "incompatible substitution: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "<invalid>"

    if-nez v1, :cond_1

    move-object v1, v0

    goto :goto_0

    .line 333
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 292
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_2

    goto :goto_1

    .line 333
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 293
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 291
    invoke-static {p1}, Ll/۬ܽܺ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 283
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫ۖܺ;)V
    .locals 6

    .line 157
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 162
    :try_start_0
    invoke-interface {p1}, Ll/֫ۖܺ;->ۢ()Ll/֫ۖܺ;

    move-result-object p1

    .line 163
    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺܺ;->᩻()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    iget v1, p0, Ll/۬ܽܺ;->ۙ:I

    add-int v2, v1, v0

    iget-object v3, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    array-length v4, v3

    const/4 v5, 0x0

    if-gt v2, v4, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 175
    aput-object v5, v3, v1

    add-int/lit8 v1, v1, 0x1

    .line 176
    iput v1, p0, Ll/۬ܽܺ;->ۙ:I

    .line 179
    :cond_0
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    aput-object p1, v3, v0

    add-int/lit8 v0, v0, 0x1

    .line 180
    iput v0, p0, Ll/۬ܽܺ;->ۙ:I

    return-void

    :cond_1
    const-string p1, "overflow"

    .line 170
    invoke-static {p1}, Ll/۬ܽܺ;->֫(Ljava/lang/String;)V

    throw v5

    .line 166
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۖᩳܺ;)V
    .locals 5

    .line 84
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    if-ne v1, v0, :cond_0

    const-string v2, "top0"

    goto :goto_1

    :cond_0
    sub-int v2, v0, v1

    .line 87
    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    const-string v3, "stack["

    const-string v4, "]: "

    .line 0
    invoke-static {v3, v2, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 89
    iget-object v3, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    aget-object v3, v3, v1

    if-nez v3, :cond_1

    const-string v3, "<invalid>"

    goto :goto_2

    .line 333
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 90
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {p1, v2}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۚ()V
    .locals 4

    .line 139
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 141
    :goto_0
    iget v2, p0, Ll/۬ܽܺ;->ۙ:I

    if-ge v1, v2, :cond_0

    .line 142
    iget-object v2, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    .line 143
    iget-object v2, p0, Ll/۬ܽܺ;->᩹:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 146
    :cond_0
    iput v0, p0, Ll/۬ܽܺ;->ۙ:I

    return-void
.end method

.method public final ۠()Ll/֫ۖܺ;
    .locals 6

    .line 253
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    const/4 v0, 0x0

    .line 255
    invoke-virtual {p0, v0}, Ll/۬ܽܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object v1

    .line 257
    iget v2, p0, Ll/۬ܽܺ;->ۙ:I

    add-int/lit8 v3, v2, -0x1

    const/4 v4, 0x0

    iget-object v5, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    aput-object v4, v5, v3

    .line 258
    iget-object v4, p0, Ll/۬ܽܺ;->᩹:[Z

    aput-boolean v0, v4, v3

    .line 259
    invoke-interface {v1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺܺ;->᩻()I

    move-result v0

    sub-int/2addr v2, v0

    iput v2, p0, Ll/۬ܽܺ;->ۙ:I

    return-object v1
.end method

.method public final ۧ(Ll/۟ܺܺ;)V
    .locals 4

    .line 101
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    if-nez v0, :cond_0

    goto :goto_1

    .line 106
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 108
    invoke-virtual {p1}, Ll/۟ܺܺ;->ۚ()Ll/۟ܺܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 110
    :goto_0
    iget v2, p0, Ll/۬ܽܺ;->ۙ:I

    if-ge v1, v2, :cond_2

    .line 111
    iget-object v2, p0, Ll/۬ܽܺ;->᩶:[Ll/֫ۖܺ;

    aget-object v3, v2, v1

    if-ne v3, p1, :cond_1

    .line 112
    aput-object v0, v2, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۧ(I)Z
    .locals 2

    if-ltz p1, :cond_1

    .line 227
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    if-ge p1, v0, :cond_0

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 231
    iget-object p1, p0, Ll/۬ܽܺ;->᩹:[Z

    aget-boolean p1, p1, v0

    return p1

    .line 228
    :cond_0
    new-instance p1, Ll/ۖᩳܺ;

    const-string v0, "stack: underflow"

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 228
    throw p1

    .line 224
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "n < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܶ()V
    .locals 3

    .line 187
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 189
    iget v0, p0, Ll/۬ܽܺ;->ۙ:I

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۬ܽܺ;->᩹:[Z

    aput-boolean v1, v2, v0

    return-void
.end method

.method public final ᩳ(I)Ll/۟ܺܺ;
    .locals 0

    .line 243
    invoke-virtual {p0, p1}, Ll/۬ܽܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    return-object p1
.end method
