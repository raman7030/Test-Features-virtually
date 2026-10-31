.class public final Ll/ᩳ᩺ۖ;
.super Ll/ܽۨۖ;
.source "89DN"


# instance fields
.field public ܳ:I

.field public ܿ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method

.method public static ֫(III)V
    .locals 4

    if-ltz p0, :cond_0

    if-ltz p1, :cond_0

    sub-int v0, p2, p1

    if-gt p0, v0, :cond_0

    return-void

    .line 84
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", length="

    const-string v2, ", size="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p0, v1, v2, p1}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 84
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(I)B
    .locals 2

    const/4 v0, 0x1

    .line 69
    iget v1, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    invoke-static {p1, v0, v1}, Ll/ᩳ᩺ۖ;->֫(III)V

    .line 70
    iget-object v0, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    invoke-virtual {v0}, Ll/ۤܰۖ;->֫()[B

    move-result-object v0

    iget v1, p0, Ll/ᩳ᩺ۖ;->ܳ:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final ֫(I[BII)V
    .locals 2

    .line 52
    iget v0, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    invoke-static {p1, p4, v0}, Ll/ᩳ᩺ۖ;->֫(III)V

    .line 53
    array-length v0, p2

    invoke-static {p3, p4, v0}, Ll/ᩳ᩺ۖ;->֫(III)V

    .line 54
    iget-object v0, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    invoke-virtual {v0}, Ll/ۤܰۖ;->֫()[B

    move-result-object v0

    iget v1, p0, Ll/ᩳ᩺ۖ;->ܳ:I

    add-int/2addr v1, p1

    invoke-static {v0, v1, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۜ()[B
    .locals 3

    .line 74
    iget v0, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 75
    invoke-virtual {p0, v2, v1, v2, v0}, Ll/ᩳ᩺ۖ;->֫(I[BII)V

    return-object v1
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 1

    const/4 v0, 0x2

    .line 34
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 35
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ll/ᩳ᩺ۖ;->ܳ:I

    const/4 v0, 0x1

    .line 36
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 37
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v0

    iput v0, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    .line 38
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    const/4 v0, 0x4

    .line 39
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 40
    iget v0, p0, Ll/ᩳ᩺ۖ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 41
    iget v0, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 45
    iget v0, p0, Ll/ᩳ᩺ۖ;->ܿ:I

    return v0
.end method
