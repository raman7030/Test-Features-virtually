.class public final Ll/֡ܶܽ;
.super Ll/۬ۗܿ;
.source "4646"


# instance fields
.field public final synthetic ۟:Ll/۠ܶܽ;


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;Ll/۠ܶܽ;)V
    .locals 0

    .line 332
    iput-object p1, p0, Ll/֡ܶܽ;->۟:Ll/۠ܶܽ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 335
    iget-object v0, p0, Ll/֡ܶܽ;->۟:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v1, v1, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget v2, v2, Ll/֨ܶܽ;->۟:I

    invoke-virtual {v1, v2}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۗܿܽ;->ۧ(Ljava/lang/String;)V

    .line 336
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/֨ܶܽ;->ۙ:Z

    .line 337
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 338
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
