.class public final Ll/ܽۢ۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public ܽ:Z

.field public final synthetic ᩳ:Ll/ܳۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Z)V
    .locals 1

    .line 363
    iput-object p1, p0, Ll/ܽۢ۠;->ᩳ:Ll/ܳۢ۠;

    const/4 v0, 0x4

    .line 364
    invoke-direct {p0, p1, v0}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    .line 365
    iput-boolean p2, p0, Ll/ܽۢ۠;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 374
    iget-boolean v0, p0, Ll/ܽۢ۠;->ܽ:Z

    if-eqz v0, :cond_0

    const-string v0, "super"

    return-object v0

    :cond_0
    const-string v0, "this"

    return-object v0
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 3

    .line 369
    iget-object v0, p0, Ll/ܽۢ۠;->ᩳ:Ll/ܳۢ۠;

    iget-object v1, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v2, 0x2a

    invoke-virtual {v1, v2}, Ll/֨᩷۠;->ܽ(I)V

    .line 370
    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    aget-object v0, v0, v1

    return-object v0
.end method
