.class public final Ll/ܿܽ֨;
.super Ll/۟֫֨;
.source "U7DO"


# instance fields
.field public ᩷ۧ:I


# direct methods
.method public constructor <init>(Ll/᩷ۧ֨;)V
    .locals 1

    .line 21
    sget-object v0, Ll/ܶۨۚ;->֡ܳ:Ll/ܶۨۚ;

    .line 64
    invoke-direct {p0, p1}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    .line 65
    iput-object v0, p0, Ll/۟֫֨;->ۜۧ:Ll/ܶۨۚ;

    const/4 p1, -0x1

    .line 18
    iput p1, p0, Ll/ܿܽ֨;->᩷ۧ:I

    .line 22
    sget-object p1, Ll/֨۟ۚ;->ۨ:Ll/֨۟ۚ;

    iput-object p1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    return-void
.end method


# virtual methods
.method public final ۡ()I
    .locals 2

    .line 35
    iget v0, p0, Ll/ܿܽ֨;->᩷ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-super {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v0

    :cond_0
    return v0
.end method

.method public final ۡ(I)V
    .locals 0

    .line 30
    iput p1, p0, Ll/ܿܽ֨;->᩷ۧ:I

    return-void
.end method
