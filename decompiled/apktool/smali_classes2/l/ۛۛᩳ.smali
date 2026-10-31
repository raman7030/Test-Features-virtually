.class public final Ll/ۛۛᩳ;
.super Landroid/widget/EdgeEffect;
.source "X68P"


# instance fields
.field public final synthetic ֫:Ll/۫ۨᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Landroid/content/Context;)V
    .locals 0

    .line 6461
    iput-object p1, p0, Ll/ۛۛᩳ;->֫:Ll/۫ۨᩳ;

    invoke-direct {p0, p2}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)Z
    .locals 1

    .line 6469
    iget-object v0, p0, Ll/ۛۛᩳ;->֫:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v0, v0, Ll/᩺֫ܿ;->ܽ֫:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 p1, 0x0

    return p1
.end method

.method public final isFinished()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
