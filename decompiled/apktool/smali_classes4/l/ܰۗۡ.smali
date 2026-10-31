.class public Ll/ܰۗۡ;
.super Ljava/lang/Object;
.source "G1V7"

# interfaces
.implements Ll/᩵֫ۚ;


# instance fields
.field public final ֫:Ll/᩵֫ۚ;

.field public final ۧ:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/᩵֫ۚ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ܰۗۡ;->ۧ:Ll/ܽܳۚ;

    .line 24
    iput-object p2, p0, Ll/ܰۗۡ;->֫:Ll/᩵֫ۚ;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/util/List;
    .locals 2

    .line 42
    iget-object v0, p0, Ll/ܰۗۡ;->ۧ:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->᩵()Ll/᩶᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ܰۗۡ;->֫:Ll/᩵֫ۚ;

    .line 43
    invoke-interface {v1}, Ll/᩵֫ۚ;->ۜ()Ljava/util/List;

    move-result-object v1

    .line 42
    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/lang/Iterable;
    .locals 2

    .line 49
    iget-object v0, p0, Ll/ܰۗۡ;->ۧ:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ܿ()Ll/֫ܳۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ܰۗۡ;->֫:Ll/᩵֫ۚ;

    .line 50
    invoke-interface {v1}, Ll/᩵֫ۚ;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    .line 49
    invoke-static {v1, v0}, Ll/᩸᩻ۚ;->֫(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ܰۗۡ;->֫:Ll/᩵֫ۚ;

    invoke-interface {v0}, Ll/᩵֫ۚ;->᩻()I

    move-result v0

    return v0
.end method
