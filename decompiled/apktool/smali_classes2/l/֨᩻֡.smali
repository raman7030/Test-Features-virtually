.class public final Ll/֨᩻֡;
.super Ljava/lang/Object;
.source "AARL"

# interfaces
.implements Ll/ᩴ᩻֡;


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Ll/֨᩻֡;->ۧ:I

    .line 42
    iput p2, p0, Ll/֨᩻֡;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 114
    :cond_0
    instance-of v1, p1, Ll/֨᩻֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 118
    :cond_1
    check-cast p1, Ll/֨᩻֡;

    .line 119
    iget v1, p0, Ll/֨᩻֡;->ۧ:I

    iget v3, p1, Ll/֨᩻֡;->ۧ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/֨᩻֡;->֫:I

    iget p1, p1, Ll/֨᩻֡;->֫:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 70
    sget-object v0, Ll/֡᩻֡;->᩶:Ll/֡᩻֡;

    .line 103
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 104
    iget v1, p0, Ll/֨᩻֡;->ۧ:I

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 105
    iget v1, p0, Ll/֨᩻֡;->֫:I

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    const/4 v1, 0x3

    .line 106
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩻ܳ֡;)V
    .locals 2

    .line 97
    iget v0, p0, Ll/֨᩻֡;->ۧ:I

    iget v1, p0, Ll/֨᩻֡;->֫:I

    invoke-virtual {p1, v0, v1}, Ll/ᩴܳ֡;->֫(II)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
