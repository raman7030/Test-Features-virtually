.class public final Ll/ۘᩳ۠;
.super Ll/۫ۚ֨;
.source "B7KX"


# instance fields
.field public final synthetic ܳ֫:Z

.field public ܽ֫:Ll/ۙ֨֨;

.field public final synthetic ܿ֫:Ll/֫ۤ֨;

.field public final synthetic ᩳ֫:Ll/ۚᩳ۠;

.field public final synthetic ᩻֫:Ll/۫᩵۠;


# direct methods
.method public constructor <init>(Ll/ۚᩳ۠;Ll/ۙ֨֨;Ll/᩶֡֨;Ll/֫ۤ֨;ZLl/۫᩵۠;)V
    .locals 0

    .line 559
    iput-object p1, p0, Ll/ۘᩳ۠;->ᩳ֫:Ll/ۚᩳ۠;

    iput-object p4, p0, Ll/ۘᩳ۠;->ܿ֫:Ll/֫ۤ֨;

    iput-boolean p5, p0, Ll/ۘᩳ۠;->ܳ֫:Z

    iput-object p6, p0, Ll/ۘᩳ۠;->᩻֫:Ll/۫᩵۠;

    invoke-direct {p0, p2, p3}, Ll/۫ۚ֨;-><init>(Ll/ۙ֨֨;Ll/᩶֡֨;)V

    return-void
.end method


# virtual methods
.method public final ۨ()Ll/ۙ֨֨;
    .locals 5

    .line 564
    iget-object v0, p0, Ll/ۘᩳ۠;->ܽ֫:Ll/ۙ֨֨;

    if-nez v0, :cond_0

    .line 565
    new-instance v0, Ll/֡ᩳ۠;

    iget-object v1, p0, Ll/ۘᩳ۠;->ܿ֫:Ll/֫ۤ֨;

    iget-object v1, v1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v1, v1, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    invoke-virtual {p0}, Ll/۫ۚ֨;->᩺()Ll/ۙ֨֨;

    move-result-object v2

    iget-boolean v3, p0, Ll/ۘᩳ۠;->ܳ֫:Z

    iget-object v4, p0, Ll/ۘᩳ۠;->ᩳ֫:Ll/ۚᩳ۠;

    invoke-direct {v0, v4, v1, v2, v3}, Ll/֡ᩳ۠;-><init>(Ll/ۚᩳ۠;Ll/֡֡֨;Ll/ۙ֨֨;Z)V

    iget-object v1, p0, Ll/ۘᩳ۠;->᩻֫:Ll/۫᩵۠;

    .line 585
    invoke-virtual {v1, v0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    .line 586
    iget-object v0, v0, Ll/֡ᩳ۠;->ᩳ:Ll/ۙ֨֨;

    .line 565
    iput-object v0, p0, Ll/ۘᩳ۠;->ܽ֫:Ll/ۙ֨֨;

    .line 566
    :cond_0
    iget-object v0, p0, Ll/ۘᩳ۠;->ܽ֫:Ll/ۙ֨֨;

    return-object v0
.end method
