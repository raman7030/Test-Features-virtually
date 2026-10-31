.class public Ll/ۨۗۡ;
.super Ll/ᩳ۬֡;
.source "E1V9"


# instance fields
.field public final ᩶:Ll/ܽܳۚ;

.field public ᩹:Ll/᩷֫ۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/᩷֫ۚ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ۨۗۡ;->᩶:Ll/ܽܳۚ;

    .line 22
    iput-object p2, p0, Ll/ۨۗۡ;->᩹:Ll/᩷֫ۚ;

    return-void
.end method


# virtual methods
.method public getElements()Ljava/util/Set;
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ۨۗۡ;->᩶:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֫()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۗۡ;->᩹:Ll/᩷֫ۚ;

    invoke-interface {v1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩸᩻ۚ;->֫(Ljava/util/Set;Ll/ᩳ᩻ۚ;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 33
    iget-object v0, p0, Ll/ۨۗۡ;->᩶:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۨۗۡ;->᩹:Ll/᩷֫ۚ;

    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 27
    iget-object v0, p0, Ll/ۨۗۡ;->᩹:Ll/᩷֫ۚ;

    invoke-interface {v0}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    return v0
.end method
