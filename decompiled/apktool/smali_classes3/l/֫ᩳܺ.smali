.class public final Ll/֫ᩳܺ;
.super Ll/ܰܽܺ;
.source "3BCT"


# instance fields
.field public final ᩹:[Ll/֫ۖܺ;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 41
    :goto_0
    invoke-direct {p0, v0}, Ll/ᩴᩴܺ;-><init>(Z)V

    .line 47
    new-array p1, p1, [Ll/֫ۖܺ;

    iput-object p1, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    return-void
.end method


# virtual methods
.method public final get(I)Ll/֫ۖܺ;
    .locals 3

    .line 184
    iget-object v0, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 287
    :cond_0
    new-instance v0, Ll/ۖᩳܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "local "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": invalid"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p1, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 287
    throw v0
.end method

.method public final ֨()Ll/֫ᩳܺ;
    .locals 0

    return-object p0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 81
    :goto_0
    iget-object v2, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 82
    aget-object v2, v2, v1

    if-nez v2, :cond_0

    const-string v2, "<invalid>"

    goto :goto_1

    .line 83
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 84
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "locals["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ᩳܺ;)Ll/֫ᩳܺ;
    .locals 7

    .line 44
    iget-object v0, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    if-ne p0, p1, :cond_0

    goto :goto_2

    .line 118
    :cond_0
    :try_start_0
    array-length v1, v0

    iget-object v2, p1, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v2, v2

    const/4 v3, 0x0

    if-ne v2, v1, :cond_6

    const/4 v2, 0x0

    move-object v4, v3

    :goto_0
    if-ge v2, v1, :cond_4

    .line 176
    aget-object v5, v0, v2

    iget-object v6, p1, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    aget-object v6, v6, v2

    .line 59
    invoke-static {v5, v6}, Ll/᩺ۤۡ;->ۧ(Ll/֫ۖܺ;Ll/֫ۖܺ;)Ll/֫ۖܺ;

    move-result-object v6

    if-eq v6, v5, :cond_3

    if-nez v4, :cond_1

    .line 67
    invoke-virtual {p0}, Ll/֫ᩳܺ;->ۚ()Ll/֫ᩳܺ;

    move-result-object v4

    :cond_1
    if-nez v6, :cond_2

    .line 167
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 168
    iget-object v5, v4, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    aput-object v3, v5, v2

    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {v4, v2, v6}, Ll/֫ᩳܺ;->֫(ILl/֫ۖܺ;)V

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-nez v4, :cond_5

    :goto_2
    return-object p0

    .line 82
    :cond_5
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v4

    .line 53
    :cond_6
    new-instance v0, Ll/ۖᩳܺ;

    const-string v1, "mismatched maxLocals values"

    .line 60
    invoke-direct {v0, v1, v3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 53
    throw v0
    :try_end_0
    .catch Ll/ۖᩳܺ; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "underlay locals:"

    .line 252
    invoke-virtual {v0, v1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 253
    invoke-virtual {p0, v0}, Ll/֫ᩳܺ;->֫(Ll/ۖᩳܺ;)V

    const-string v1, "overlay locals:"

    .line 254
    invoke-virtual {v0, v1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 255
    invoke-virtual {p1, v0}, Ll/֫ᩳܺ;->֫(Ll/ۖᩳܺ;)V

    .line 256
    throw v0
.end method

.method public final ֫(Ll/ܰܽܺ;I)Ll/۟ܽܺ;
    .locals 2

    .line 267
    new-instance v0, Ll/۟ܽܺ;

    .line 118
    iget-object v1, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v1, v1

    .line 267
    invoke-direct {v0, v1}, Ll/۟ܽܺ;-><init>(I)V

    .line 268
    invoke-virtual {v0, p1, p2}, Ll/۟ܽܺ;->֫(Ll/ܰܽܺ;I)Ll/۟ܽܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܰܽܺ;)Ll/ܰܽܺ;
    .locals 1

    .line 231
    instance-of v0, p1, Ll/֫ᩳܺ;

    if-eqz v0, :cond_0

    .line 232
    check-cast p1, Ll/֫ᩳܺ;

    invoke-virtual {p0, p1}, Ll/֫ᩳܺ;->֫(Ll/֫ᩳܺ;)Ll/֫ᩳܺ;

    move-result-object p1

    return-object p1

    .line 235
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܰܽܺ;->֫(Ll/ܰܽܺ;)Ll/ܰܽܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/֫ۖܺ;)V
    .locals 3

    .line 126
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 129
    :try_start_0
    invoke-interface {p2}, Ll/֫ۖܺ;->ۢ()Ll/֫ۖܺ;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_2

    .line 140
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺܺ;->ܶ()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    .line 141
    aput-object v1, v2, v0

    .line 144
    :cond_0
    aput-object p2, v2, p1

    if-eqz p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    .line 147
    aget-object p2, v2, p1

    if-eqz p2, :cond_1

    .line 148
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->ܶ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 149
    aput-object v1, v2, p1

    :cond_1
    return-void

    .line 136
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "idx < 0"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 132
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۖᩳܺ;)V
    .locals 4

    const/4 v0, 0x0

    .line 67
    :goto_0
    iget-object v1, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 68
    aget-object v1, v1, v0

    if-nez v1, :cond_0

    const-string v1, "<invalid>"

    goto :goto_1

    .line 69
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 70
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "locals["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸ۡܺ;)V
    .locals 1

    .line 159
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Ll/֫ᩳܺ;->֫(ILl/֫ۖܺ;)V

    return-void
.end method

.method public final ۚ()Ll/֫ᩳܺ;
    .locals 5

    .line 55
    new-instance v0, Ll/֫ᩳܺ;

    iget-object v1, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v2, v1

    invoke-direct {v0, v2}, Ll/֫ᩳܺ;-><init>(I)V

    .line 57
    iget-object v2, v0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public final bridge synthetic ۚ()Ll/ܰܽܺ;
    .locals 1

    .line 32
    invoke-virtual {p0}, Ll/֫ᩳܺ;->ۚ()Ll/֫ᩳܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v0, v0

    return v0
.end method

.method public final ۧ(Ll/۟ܺܺ;)V
    .locals 5

    .line 95
    iget-object v0, p0, Ll/֫ᩳܺ;->᩹:[Ll/֫ۖܺ;

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 104
    invoke-virtual {p1}, Ll/۟ܺܺ;->ۚ()Ll/۟ܺܺ;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 107
    aget-object v4, v0, v3

    if-ne v4, p1, :cond_1

    .line 108
    aput-object v2, v0, v3

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
