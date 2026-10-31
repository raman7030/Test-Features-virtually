.class public final Ll/᩹᩻ۚ;
.super Ll/ۢ۬֡;
.source "42RT"


# instance fields
.field public final synthetic ֫:Ll/᩶᩻ۚ;

.field public ۧ:Ll/ۚ֫ۚ;


# direct methods
.method public constructor <init>(Ll/᩶᩻ۚ;Ll/ۚ֫ۚ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ll/᩹᩻ۚ;->֫:Ll/᩶᩻ۚ;

    .line 62
    iput-object p2, p0, Ll/᩹᩻ۚ;->ۧ:Ll/ۚ֫ۚ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩹᩻ۚ;->ۧ:Ll/ۚ֫ۚ;

    invoke-interface {v0}, Ll/ۚ֫ۚ;->֫()I

    move-result v0

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 3

    .line 78
    iget-object v0, p0, Ll/᩹᩻ۚ;->֫:Ll/᩶᩻ۚ;

    iget-object v0, v0, Ll/᩶᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->᩻()Ll/ܺܳۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩹᩻ۚ;->ۧ:Ll/ۚ֫ۚ;

    invoke-interface {v1}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v1

    .line 110
    new-instance v2, Ll/ܺ᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v2
.end method

.method public final ܽ()I
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩹᩻ۚ;->ۧ:Ll/ۚ֫ۚ;

    invoke-interface {v0}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v0

    return v0
.end method
