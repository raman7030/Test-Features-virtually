.class public final Ll/ۤܳۚ;
.super Ljava/lang/Object;
.source "R2RY"

# interfaces
.implements Ll/᩵֫ۚ;


# instance fields
.field public ֫:Ll/᩵֫ۚ;

.field public final synthetic ۧ:Ll/ۛܳۚ;


# direct methods
.method public constructor <init>(Ll/ۛܳۚ;Ll/᩵֫ۚ;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܳۚ;->ۧ:Ll/ۛܳۚ;

    .line 63
    iput-object p2, p0, Ll/ۤܳۚ;->֫:Ll/᩵֫ۚ;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/util/List;
    .locals 3

    .line 81
    iget-object v0, p0, Ll/ۤܳۚ;->ۧ:Ll/ۛܳۚ;

    iget-object v0, v0, Ll/ۛܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->᩵()Ll/᩶᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۤܳۚ;->֫:Ll/᩵֫ۚ;

    .line 82
    invoke-interface {v1}, Ll/᩵֫ۚ;->ۜ()Ljava/util/List;

    move-result-object v1

    .line 110
    new-instance v2, Ll/ܺ᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v2
.end method

.method public final ۢ()Ljava/lang/Iterable;
    .locals 3

    .line 88
    iget-object v0, p0, Ll/ۤܳۚ;->ۧ:Ll/ۛܳۚ;

    iget-object v0, v0, Ll/ۛܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ܿ()Ll/֫ܳۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۤܳۚ;->֫:Ll/᩵֫ۚ;

    .line 89
    invoke-interface {v1}, Ll/᩵֫ۚ;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    .line 125
    new-instance v2, Ll/ۘ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ۘ᩻ۚ;-><init>(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)V

    return-object v2
.end method

.method public final ᩷()Ljava/lang/Iterable;
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ۤܳۚ;->ۧ:Ll/ۛܳۚ;

    iget-object v0, v0, Ll/ۛܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۢ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۤܳۚ;->֫:Ll/᩵֫ۚ;

    .line 75
    invoke-interface {v1}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v1

    .line 125
    new-instance v2, Ll/ۘ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ۘ᩻ۚ;-><init>(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)V

    return-object v2
.end method

.method public final ᩻()I
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۤܳۚ;->֫:Ll/᩵֫ۚ;

    invoke-interface {v0}, Ll/᩵֫ۚ;->᩻()I

    move-result v0

    return v0
.end method
