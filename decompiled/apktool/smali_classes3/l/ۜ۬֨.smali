.class public final Ll/ۜ۬֨;
.super Ll/ܳ֨۠;
.source "542M"


# instance fields
.field public final synthetic ֫:Ll/ܶ۬֨;


# direct methods
.method public constructor <init>(Ll/ܶ۬֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2858
    iput-object p1, p0, Ll/ۜ۬֨;->֫:Ll/ܶ۬֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿ᩵۠;)V
    .locals 1

    .line 2861
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/᩶֡֨;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2862
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ܿ᩵۠;)V

    .line 2863
    iget-object v0, p0, Ll/ۜ۬֨;->֫:Ll/ܶ۬֨;

    invoke-static {v0, p1}, Ll/ܶ۬֨;->֫(Ll/ܶ۬֨;Ll/ܿ᩵۠;)V

    :cond_0
    return-void
.end method
