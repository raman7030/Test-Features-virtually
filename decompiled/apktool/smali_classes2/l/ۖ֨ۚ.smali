.class public abstract Ll/ۖ֨ۚ;
.super Ljava/lang/Object;
.source "U4HR"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Ll/ܺ֨ۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Ll/ۖ֨ۚ;->֫:I

    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 42
    iget v0, p0, Ll/ۖ֨ۚ;->֫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 46
    iput p1, p0, Ll/ۖ֨ۚ;->֫:I

    return-void
.end method

.method public final ۜ()I
    .locals 1

    .line 34
    iget v0, p0, Ll/ۖ֨ۚ;->ۧ:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 38
    iput p1, p0, Ll/ۖ֨ۚ;->ۧ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 470
    iget-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->᩶:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 2

    .line 454
    iget-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->۫:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 446
    iget-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->ۙ:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 462
    iget-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->۬:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 490
    iget-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->ۗ:Ll/ܺ֨ۚ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩻()V
    .locals 1

    const/4 v0, -0x1

    .line 28
    iput v0, p0, Ll/ۖ֨ۚ;->ۧ:I

    .line 29
    iput v0, p0, Ll/ۖ֨ۚ;->֫:I

    return-void
.end method
