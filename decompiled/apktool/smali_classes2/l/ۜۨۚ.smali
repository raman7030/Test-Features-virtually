.class public Ll/ۜۨۚ;
.super Ljava/lang/Object;
.source "U7D3"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Ll/ۜۨۚ;->᩸:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p1, p0, Ll/ۜۨۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/ۜۨۚ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۜۨۚ;->᩸:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ֫()Z
    .locals 2

    .line 45
    iget v0, p0, Ll/ۜۨۚ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
