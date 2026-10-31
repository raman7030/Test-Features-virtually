.class public final Ll/᩷ܽۘ;
.super Ll/ۢܽۘ;
.source "8897"


# instance fields
.field public final ۗ:[B

.field public ۙ:I

.field public ۬:I


# direct methods
.method public constructor <init>(JI[B)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p4, p0, Ll/᩷ܽۘ;->ۗ:[B

    .line 35
    iput-wide p1, p0, Ll/ۢܽۘ;->᩶:J

    const/4 p1, 0x0

    .line 36
    iput p1, p0, Ll/᩷ܽۘ;->ۙ:I

    .line 37
    iput p3, p0, Ll/᩷ܽۘ;->۬:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 60
    iget v0, p0, Ll/᩷ܽۘ;->۬:I

    return v0
.end method

.method public final ۧ([B)I
    .locals 4

    .line 47
    array-length v0, p1

    .line 48
    iget v1, p0, Ll/᩷ܽۘ;->۬:I

    if-le v0, v1, :cond_0

    move v0, v1

    .line 51
    :cond_0
    iget v1, p0, Ll/᩷ܽۘ;->ۙ:I

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩷ܽۘ;->ۗ:[B

    invoke-static {v3, v1, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    iget p1, p0, Ll/᩷ܽۘ;->ۙ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩷ܽۘ;->ۙ:I

    .line 53
    iget p1, p0, Ll/᩷ܽۘ;->۬:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/᩷ܽۘ;->۬:I

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 42
    iget v0, p0, Ll/᩷ܽۘ;->۬:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
