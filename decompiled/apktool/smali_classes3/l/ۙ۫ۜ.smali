.class public final Ll/ۙ۫ۜ;
.super Ll/֡ܽ;
.source "D8GL"


# instance fields
.field public final synthetic ᩳ:Ll/ۤۤۜ;


# direct methods
.method public constructor <init>(Ll/ۤۤۜ;)V
    .locals 0

    .line 5017
    iput-object p1, p0, Ll/ۙ۫ۜ;->ᩳ:Ll/ۤۤۜ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 5020
    iget-object v0, p0, Ll/ۙ۫ۜ;->ᩳ:Ll/ۤۤۜ;

    invoke-static {v0}, Ll/ۤۤۜ;->ܽ֫(Ll/ۤۤۜ;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 5021
    invoke-static {v0}, Ll/ۤۤۜ;->ۡ֫(Ll/ۤۤۜ;)V

    return-void

    .line 5023
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
