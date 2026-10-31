.class public final Ll/֫ܳۚ;
.super Ljava/lang/Object;
.source "Y2SQ"

# interfaces
.implements Ll/ᩳ᩻ۚ;


# instance fields
.field public final ֫:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/֫ܳۚ;->֫:Ll/ܽܳۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 48
    check-cast p1, Ll/۠֫ۚ;

    .line 59
    invoke-interface {p1}, Ll/۠֫ۚ;->ܽ()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    return-object p1

    .line 65
    :cond_0
    new-instance v0, Ll/ܰܿۚ;

    check-cast p1, Ll/᩶֫ۚ;

    .line 181
    invoke-direct {v0, p0, p1}, Ll/ۨܿۚ;-><init>(Ll/֫ܳۚ;Ll/۠֫ۚ;)V

    return-object v0

    .line 63
    :cond_1
    new-instance v0, Ll/᩺ܿۚ;

    check-cast p1, Ll/ܶ֫ۚ;

    .line 170
    invoke-direct {v0, p0, p1}, Ll/ۨܿۚ;-><init>(Ll/֫ܳۚ;Ll/۠֫ۚ;)V

    return-object v0

    .line 61
    :cond_2
    new-instance v0, Ll/۟ܿۚ;

    check-cast p1, Ll/ۗ֫ۚ;

    invoke-direct {v0, p0, p1}, Ll/۟ܿۚ;-><init>(Ll/֫ܳۚ;Ll/ۗ֫ۚ;)V

    return-object v0
.end method
