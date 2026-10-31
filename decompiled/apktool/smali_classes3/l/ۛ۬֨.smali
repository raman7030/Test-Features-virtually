.class public final Ll/ۛ۬֨;
.super Ll/֨᩸֨;
.source "W7SR"


# instance fields
.field public final synthetic ᩸:Ll/۫۫֨;


# direct methods
.method public constructor <init>(Ll/۫۫֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Ll/ۛ۬֨;->᩸:Ll/۫۫֨;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 194
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Ll/ۛ۬֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 0

    .line 194
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Ll/ۛ۬֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 5

    .line 197
    sget-object v0, Ll/ۢ۠֨;->᩺:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    check-cast p1, Ll/֨۫֨;

    .line 199
    new-instance v0, Ll/֨۫֨;

    iget-object v1, p0, Ll/ۛ۬֨;->᩸:Ll/۫۫֨;

    iget-object v2, v1, Ll/۫۫֨;->֡:Ll/᩶ۚ۠;

    iget-object v3, p1, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    const/4 v4, 0x0

    .line 53
    invoke-virtual {v2, v3, v4}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v2

    .line 199
    check-cast v2, Ll/۫᩵۠;

    iget-object p1, p1, Ll/֨۫֨;->ۤ:Ll/֫ۤ֨;

    invoke-direct {v0, v1, v2, p1}, Ll/֨۫֨;-><init>(Ll/۫۫֨;Ll/۫᩵۠;Ll/֫ۤ֨;)V

    return-object v0

    :cond_0
    return-object p1
.end method
