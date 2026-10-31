.class public final Ll/ۧۜᩳ;
.super Ll/۬ۗܿ;
.source "K5R1"


# instance fields
.field public final synthetic ۟:Ll/ۜۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;Ll/ۜۜᩳ;)V
    .locals 0

    .line 292
    iput-object p1, p0, Ll/ۧۜᩳ;->۟:Ll/ۜۜᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 295
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 296
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 297
    iget-object v1, p0, Ll/ۧۜᩳ;->۟:Ll/ۜۜᩳ;

    iget-object v2, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v2, v2, Ll/᩻ۜᩳ;->۫:Ll/۠ܿܽ;

    invoke-virtual {v2, v0}, Ll/۠ܿܽ;->֫(Ljava/lang/String;)V

    .line 298
    iget-object v0, v1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 299
    iget-object v0, v1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩻ۜᩳ;->᩺:Z

    .line 301
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
