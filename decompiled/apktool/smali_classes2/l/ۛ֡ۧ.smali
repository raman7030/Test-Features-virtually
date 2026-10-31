.class public final Ll/ۛ֡ۧ;
.super Ljava/lang/Object;
.source "J8MH"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:[B

.field public final ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Ll/ۛ֡ۧ;->ܿ:I

    const/16 p1, 0x83

    new-array p1, p1, [B

    .line 47
    iput-object p1, p0, Ll/ۛ֡ۧ;->ܽ:[B

    const/4 v0, 0x2

    const/4 v1, 0x1

    aput-byte v1, p1, v0

    return-void
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 4

    .line 85
    iget-boolean v0, p0, Ll/ۛ֡ۧ;->ۧ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sub-int/2addr p2, p1

    .line 89
    iget-object v0, p0, Ll/ۛ֡ۧ;->ܽ:[B

    array-length v1, v0

    iget v2, p0, Ll/ۛ֡ۧ;->ᩳ:I

    add-int v3, v2, p2

    if-ge v1, v3, :cond_1

    add-int/2addr v2, p2

    mul-int/lit8 v2, v2, 0x2

    .line 90
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۛ֡ۧ;->ܽ:[B

    .line 92
    :cond_1
    iget-object v0, p0, Ll/ۛ֡ۧ;->ܽ:[B

    iget v1, p0, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    iget p1, p0, Ll/ۛ֡ۧ;->ᩳ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ۛ֡ۧ;->ᩳ:I

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Ll/ۛ֡ۧ;->֫:Z

    return v0
.end method

.method public final ֫(I)Z
    .locals 2

    .line 104
    iget-boolean v0, p0, Ll/ۛ֡ۧ;->ۧ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 107
    :cond_0
    iget v0, p0, Ll/ۛ֡ۧ;->ᩳ:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ۛ֡ۧ;->ᩳ:I

    .line 108
    iput-boolean v1, p0, Ll/ۛ֡ۧ;->ۧ:Z

    const/4 p1, 0x1

    .line 109
    iput-boolean p1, p0, Ll/ۛ֡ۧ;->֫:Z

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Ll/ۛ֡ۧ;->ۧ:Z

    .line 54
    iput-boolean v0, p0, Ll/ۛ֡ۧ;->֫:Z

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 68
    iget-boolean v0, p0, Ll/ۛ֡ۧ;->ۧ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 69
    iget v0, p0, Ll/ۛ֡ۧ;->ܿ:I

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/ۛ֡ۧ;->ۧ:Z

    if-eqz v1, :cond_1

    const/4 p1, 0x3

    .line 72
    iput p1, p0, Ll/ۛ֡ۧ;->ᩳ:I

    .line 73
    iput-boolean v2, p0, Ll/ۛ֡ۧ;->֫:Z

    :cond_1
    return-void
.end method
