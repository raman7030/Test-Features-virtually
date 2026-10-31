.class public final Ll/ۛۙۡ;
.super Ll/ۛܿۚ;
.source "51V0"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗۡ;


# direct methods
.method public constructor <init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V
    .locals 0

    .line 74
    iput-object p1, p0, Ll/ۛۙۡ;->ۧ:Ll/ۢۗۡ;

    invoke-direct {p0, p2}, Ll/ۛܿۚ;-><init>(Ll/ܽܳۚ;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 74
    check-cast p1, Ll/ۡ֫ۚ;

    invoke-virtual {p0, p1}, Ll/ۛۙۡ;->֫(Ll/ۡ֫ۚ;)Ll/ۤܿۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡ֫ۚ;)Ll/ۤܿۚ;
    .locals 2

    .line 78
    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۙۡ;->ۧ:Ll/ۢۗۡ;

    invoke-static {v1, v0}, Ll/ۢۗۡ;->ܽ(Ll/ۢۗۡ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;Ljava/lang/String;)V

    .line 60
    new-instance v0, Ll/ۤܿۚ;

    invoke-direct {v0, p0, p1}, Ll/ۤܿۚ;-><init>(Ll/ۛܿۚ;Ll/ۡ֫ۚ;)V

    return-object v0
.end method
