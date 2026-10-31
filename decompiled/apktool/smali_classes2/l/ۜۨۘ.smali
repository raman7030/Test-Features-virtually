.class public final Ll/ۜۨۘ;
.super Ljava/lang/Object;
.source "H8ZV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩷ۨۘ;

.field public final synthetic ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/᩷ۨۘ;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۨۘ;->᩸:Ll/᩷ۨۘ;

    iput-object p2, p0, Ll/ۜۨۘ;->᩹:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 168
    iget-object v0, p0, Ll/ۜۨۘ;->᩸:Ll/᩷ۨۘ;

    iget-object v1, v0, Ll/᩷ۨۘ;->᩸:Ll/ۢۨۘ;

    invoke-static {v1}, Ll/ۢۨۘ;->ᩳ(Ll/ۢۨۘ;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v0, v0, Ll/᩷ۨۘ;->᩹:Ll/ܿۨۘ;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    .line 169
    iget-object v1, p0, Ll/ۜۨۘ;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 114
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 172
    invoke-virtual {v0, v1}, Ll/ܿۨۘ;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
