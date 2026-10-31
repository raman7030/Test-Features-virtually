.class public abstract Ll/֨ܳۚ;
.super Ljava/lang/Object;
.source "82T8"

# interfaces
.implements Ll/ۧۧۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public final synthetic ᩶:Ll/۫ܳۚ;

.field public ᩸:Ll/ۧۧۚ;

.field public ᩹:Ll/᩵۬֡;


# direct methods
.method public constructor <init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܳۚ;->᩶:Ll/۫ܳۚ;

    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, Ll/֨ܳۚ;->᩹:Ll/᩵۬֡;

    .line 134
    iput-object p2, p0, Ll/֨ܳۚ;->᩸:Ll/ۧۧۚ;

    return-void
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 3

    .line 140
    iget-object v0, p0, Ll/֨ܳۚ;->᩹:Ll/᩵۬֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 142
    :cond_0
    iget-object v0, p0, Ll/֨ܳۚ;->᩸:Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->֡()I

    move-result v1

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    iget-object v2, p0, Ll/֨ܳۚ;->᩶:Ll/۫ܳۚ;

    invoke-static {v2, v1, v0}, Ll/۫ܳۚ;->֫(Ll/۫ܳۚ;ILl/۠ܽۚ;)Ll/۠ܽۚ;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 147
    iget-object v0, p0, Ll/֨ܳۚ;->᩸:Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->֡()I

    move-result v0

    return v0
.end method

.method public ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 162
    invoke-virtual {p0}, Ll/֨ܳۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    check-cast p1, Ll/᩵۬֡;

    iput-object p1, p0, Ll/֨ܳۚ;->᩹:Ll/᩵۬֡;

    return-void
.end method

.method public final ۚ()I
    .locals 1

    .line 157
    iget-object v0, p0, Ll/֨ܳۚ;->᩸:Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/᩺֫ۚ;->ۚ()I

    move-result v0

    return v0
.end method

.method public final ۢ()Ll/֨ۗ֡;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/֨ܳۚ;->᩸:Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    return-object v0
.end method
