.class public final Ll/ܿۜᩳ;
.super Ll/۬ۗܿ;
.source "K5R1"


# instance fields
.field public final synthetic ۟:Ll/ۜۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;Ll/ۜۜᩳ;)V
    .locals 0

    .line 572
    iput-object p1, p0, Ll/ܿۜᩳ;->۟:Ll/ۜۜᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 575
    iget-object v0, p0, Ll/ܿۜᩳ;->۟:Ll/ۜۜᩳ;

    iget-object v1, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v2, v1, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    iget v1, v1, Ll/᩻ۜᩳ;->ۖ֫:I

    invoke-virtual {v2, v1}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۗܿܽ;->ۧ(Ljava/lang/String;)V

    .line 576
    iget-object v1, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/᩻ۜᩳ;->᩺:Z

    .line 577
    iget-object v0, v0, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 578
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
