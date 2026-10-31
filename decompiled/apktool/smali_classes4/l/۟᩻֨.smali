.class public final Ll/۟᩻֨;
.super Ll/᩺᩻֨;
.source "M1RW"


# instance fields
.field public final ֫:Ll/ۧۜ֨;

.field public final ۧ:[B


# direct methods
.method public constructor <init>(Ll/ۧۜ֨;)V
    .locals 5

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [B

    .line 11
    iput-object v1, p0, Ll/۟᩻֨;->ۧ:[B

    .line 18
    invoke-virtual {p1}, Ll/ۧۜ֨;->ܳ()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    aput-byte v3, v1, v3

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, Ll/ۧۜ֨;->ܽ()I

    move-result v2

    const/16 v4, 0x1000

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr v2, v0

    .line 23
    invoke-static {v2}, Ll/ۖ᩷֨;->ۧ(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x17

    int-to-byte v0, v0

    aput-byte v0, v1, v3

    .line 27
    :goto_0
    invoke-virtual {p1}, Ll/ۧۜ֨;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۜ֨;

    iput-object p1, p0, Ll/۟᩻֨;->֫:Ll/ۧۜ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)Ll/ۛ᩻֨;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/۟᩻֨;->֫:Ll/ۧۜ֨;

    invoke-virtual {v0, p1, p2}, Ll/ۧۜ֨;->֫(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)Ll/ۛ᩻֨;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ()[B
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۟᩻֨;->ۧ:[B

    return-object v0
.end method
