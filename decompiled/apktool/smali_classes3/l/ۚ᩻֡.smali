.class public final Ll/ۚ᩻֡;
.super Ljava/lang/Object;
.source "PARF"

# interfaces
.implements Ll/ᩴ᩻֡;


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Ll/ۚ᩻֡;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 82
    :cond_0
    instance-of v1, p1, Ll/ۚ᩻֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 86
    :cond_1
    check-cast p1, Ll/ۚ᩻֡;

    iget p1, p1, Ll/ۚ᩻֡;->֫:I

    iget v1, p0, Ll/ۚ᩻֡;->֫:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 46
    sget-object v0, Ll/֡᩻֡;->᩹:Ll/֡᩻֡;

    .line 72
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 73
    iget v1, p0, Ll/ۚ᩻֡;->֫:I

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    const/4 v1, 0x2

    .line 74
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 91
    iget v0, p0, Ll/ۚ᩻֡;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "channel(%d)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻ܳ֡;)V
    .locals 1

    .line 66
    iget v0, p0, Ll/ۚ᩻֡;->֫:I

    .line 316
    iput v0, p1, Ll/᩻ܳ֡;->ᩳ:I

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
