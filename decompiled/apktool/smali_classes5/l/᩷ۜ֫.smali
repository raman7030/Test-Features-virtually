.class public final Ll/᩷ۜ֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Ll/᩷ᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۚۜ֫;


# direct methods
.method public constructor <init>(Ll/ۚۜ֫;)V
    .locals 0

    .line 2678
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۜ֫;->֫:Ll/ۚۜ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 2678
    check-cast p1, Ll/ۜᩳ;

    .line 2681
    iget-object v0, p0, Ll/᩷ۜ֫;->֫:Ll/ۚۜ֫;

    iget-object v1, v0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۜ֫;

    if-nez v1, :cond_0

    goto :goto_0

    .line 2686
    :cond_0
    iget-object v2, v1, Ll/ۘۜ֫;->᩹:Ljava/lang/String;

    .line 2687
    iget v1, v1, Ll/ۘۜ֫;->᩸:I

    .line 2688
    invoke-static {v0}, Ll/ۚۜ֫;->֫(Ll/ۚۜ֫;)Ll/ۨۜ֫;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۨۜ֫;->ᩳ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 2698
    :cond_1
    invoke-virtual {p1}, Ll/ۜᩳ;->ۧ()I

    move-result v2

    .line 2699
    invoke-virtual {p1}, Ll/ۜᩳ;->֫()Landroid/content/Intent;

    move-result-object p1

    .line 2698
    invoke-virtual {v0, v1, v2, p1}, Ll/ۡ᩻֫;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method
