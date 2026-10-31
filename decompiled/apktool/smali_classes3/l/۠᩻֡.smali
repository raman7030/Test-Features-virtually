.class public final Ll/۠᩻֡;
.super Ljava/lang/Object;
.source "EAS0"

# interfaces
.implements Ll/ᩴ᩻֡;


# instance fields
.field public final ֫:Ll/ᩴ᩻֡;

.field public final ۧ:I


# direct methods
.method public constructor <init>(ILl/ᩴ᩻֡;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Ll/۠᩻֡;->ۧ:I

    .line 45
    iput-object p2, p0, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

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
    instance-of v1, p1, Ll/۠᩻֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 118
    :cond_1
    check-cast p1, Ll/۠᩻֡;

    .line 119
    iget v1, p0, Ll/۠᩻֡;->ۧ:I

    iget v3, p1, Ll/۠᩻֡;->ۧ:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

    iget-object p1, p1, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    const/4 v0, 0x0

    .line 104
    iget v1, p0, Ll/۠᩻֡;->ۧ:I

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 105
    iget-object v1, p0, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    .line 106
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩻ܳ֡;)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

    invoke-interface {v0, p1}, Ll/ᩴ᩻֡;->֫(Ll/᩻ܳ֡;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()Ll/ᩴ᩻֡;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۠᩻֡;->֫:Ll/ᩴ᩻֡;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/۠᩻֡;->ۧ:I

    return v0
.end method
