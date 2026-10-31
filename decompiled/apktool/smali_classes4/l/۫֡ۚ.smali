.class public final Ll/۫֡ۚ;
.super Ll/᩶֡ۚ;
.source "ABJU"


# instance fields
.field public final ᩺:Ll/֫᩸ۚ;


# direct methods
.method public constructor <init>(Ll/ܽ֨ۚ;Ll/ܺ֡ۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, v0, p2}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 18
    new-instance p1, Ll/֫᩸ۚ;

    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    iput-object p1, p0, Ll/۫֡ۚ;->᩺:Ll/֫᩸ۚ;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 123
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/۫֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۚ;
    .locals 1

    .line 123
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/۫֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/᩶֡ۚ;
    .locals 1

    .line 123
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/۫֡ۚ;

    return-object v0
.end method

.method public final ۧ(Ll/ۨ֡ۚ;)V
    .locals 1

    .line 51
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->ۧ(Ll/ۨ֡ۚ;)V

    .line 52
    iget-object v0, p0, Ll/۫֡ۚ;->᩺:Ll/֫᩸ۚ;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/᩶֡ۚ;)V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/۫֡ۚ;->᩺:Ll/֫᩸ۚ;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method
