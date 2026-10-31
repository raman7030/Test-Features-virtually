.class public final Ll/ۖ᩵֡;
.super Ll/ۡ֨֡;
.source "R90A"


# instance fields
.field public final ֫:Ll/ᩳۚ֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ll/ᩳۚ֡;

    invoke-direct {v0}, Ll/ᩳۚ֡;-><init>()V

    iput-object v0, p0, Ll/ۖ᩵֡;->֫:Ll/ᩳۚ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 0

    .line 30
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨ֡֡;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۖ᩵֡;->֫:Ll/ᩳۚ֡;

    return-object v0
.end method

.method public final ܿ()Ll/ᩳۚ֡;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۖ᩵֡;->֫:Ll/ᩳۚ֡;

    return-object v0
.end method
