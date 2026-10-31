.class public Ll/ۨܿۚ;
.super Ljava/lang/Object;
.source "Y2SQ"

# interfaces
.implements Ll/۠֫ۚ;
.implements Ll/᩹֫ۚ;


# instance fields
.field public ᩸:Ll/۠֫ۚ;

.field public final synthetic ᩹:Ll/֫ܳۚ;


# direct methods
.method public constructor <init>(Ll/֫ܳۚ;Ll/۠֫ۚ;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨܿۚ;->᩹:Ll/֫ܳۚ;

    .line 76
    iput-object p2, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/᩹֫ۚ;

    invoke-interface {v0}, Ll/᩹֫ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/᩹֫ۚ;

    invoke-interface {v0}, Ll/᩹֫ۚ;->getSignature()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۨܿۚ;->᩹:Ll/֫ܳۚ;

    iget-object v0, v0, Ll/֫ܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v1, Ll/᩹֫ۚ;

    invoke-interface {v1}, Ll/᩹֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    invoke-interface {v0}, Ll/۠֫ۚ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    invoke-interface {v0}, Ll/۠֫ۚ;->ᩳ()I

    move-result v0

    return v0
.end method
