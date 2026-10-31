.class public abstract Ll/ۛᩳܽ;
.super Ljava/lang/Object;
.source "Z634"

# interfaces
.implements Ll/֨᩻ܽ;


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public final ᩸:Ll/᩷᩻ܽ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩷ᩳܽ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Ll/ۛᩳܽ;->᩶:I

    .line 22
    iput-object p1, p0, Ll/ۛᩳܽ;->᩸:Ll/᩷᩻ܽ;

    return-void
.end method


# virtual methods
.method public getEntry()Ll/᩷᩻ܽ;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۛᩳܽ;->᩸:Ll/᩷᩻ܽ;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 51
    iget v0, p0, Ll/ۛᩳܽ;->᩹:I

    return v0
.end method

.method public ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/ۛᩳܽ;->᩸:Ll/᩷᩻ܽ;

    invoke-interface {v0}, Ll/᩷᩻ܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 9

    .line 101
    check-cast p1, Ll/֨᩻ܽ;

    .line 102
    invoke-virtual {p0}, Ll/ۛᩳܽ;->᩵ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/֨᩻ܽ;->᩵ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 61
    :cond_0
    iget v0, p0, Ll/ۛᩳܽ;->᩶:I

    .line 105
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v1

    const-string v2, " "

    if-ne v0, v1, :cond_f

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 108
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 112
    invoke-virtual {p0}, Ll/ۛᩳܽ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ll/֨᩻ܽ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 113
    :cond_1
    invoke-virtual {p0}, Ll/ۛᩳܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ll/֨᩻ܽ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 114
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v3

    invoke-interface {v3}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/֨᩻ܽ;->᩷֫()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    iget v3, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/ۛᩳܽ;->ᩳ֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 118
    :try_start_0
    invoke-virtual {p0}, Ll/ۛᩳܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v0

    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/۠᩻ܽ;->֫(Ll/۠᩻ܽ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 120
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 122
    :cond_4
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    if-eq v0, v1, :cond_e

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    const/16 v1, 0x12

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v0, v1, :cond_7

    .line 125
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    .line 126
    :goto_1
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :goto_2
    if-ne v0, v1, :cond_d

    goto/16 :goto_3

    :cond_7
    if-ne v0, v4, :cond_9

    .line 131
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_3

    .line 134
    :cond_8
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v4

    invoke-interface {v4}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    if-ne v0, v3, :cond_b

    .line 138
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    invoke-static {v0}, Ll/۫ܽܽ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result p1

    invoke-static {p1}, Ll/۫ܽܽ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto/16 :goto_3

    .line 141
    :cond_a
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v4

    invoke-interface {v4}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    const/4 v1, 0x6

    if-ne v0, v1, :cond_d

    .line 145
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    invoke-static {v0}, Ll/۫ܽܽ;->ۜ(I)Ljava/lang/String;

    move-result-object v0

    .line 146
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result p1

    invoke-static {p1}, Ll/۫ܽܽ;->ۜ(I)Ljava/lang/String;

    move-result-object p1

    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_3

    .line 148
    :cond_c
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v4

    invoke-interface {v4}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 152
    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v5

    aput-object v2, v3, v6

    const/4 v1, 0x2

    aput-object v7, v3, v1

    const/4 v1, 0x3

    aput-object v8, v3, v1

    aput-object p1, v3, v4

    const-string p1, "%s %d(0x%08x) %d(0x%08x)"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_3
    return-void

    .line 106
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v3

    invoke-interface {v3}, Ll/᩷᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    iget v3, p0, Ll/ۛᩳܽ;->᩶:I

    .line 106
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۖ()I
    .locals 1

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    return v0
.end method

.method public final ۘ()Z
    .locals 2

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    const/16 v1, 0x1c

    if-gt v1, v0, :cond_0

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ֫()I
    .locals 1

    .line 61
    iget v0, p0, Ll/ۛᩳܽ;->᩶:I

    return v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۛᩳܽ;->᩸:Ll/᩷᩻ܽ;

    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public ܿۧ()Ll/ۗ᩻ܽ;
    .locals 2

    .line 81
    invoke-virtual {p0}, Ll/ۛᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۢ᩻ܽ;->᩻ۧ()Ll/۫᩻ܽ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v1

    invoke-interface {v0, v1}, Ll/۫᩻ܽ;->getItem(I)Ll/ۗ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ֫()Z
    .locals 2

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵ۧ()Z
    .locals 4

    .line 56
    iget v0, p0, Ll/ۛᩳܽ;->ۙ:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v3, 0x7

    if-eq v0, v3, :cond_0

    const/16 v3, 0x8

    if-eq v0, v3, :cond_0

    return v2

    .line 93
    :cond_0
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    return v1
.end method
