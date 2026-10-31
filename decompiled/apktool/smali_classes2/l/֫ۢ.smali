.class public final Ll/֫ۢ;
.super Ll/ᩳ᩷;
.source "P55W"


# instance fields
.field public final synthetic ܺ:Ll/ܿۢ;


# direct methods
.method public constructor <init>(Ll/ܿۢ;Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;)V
    .locals 7

    .line 715
    iput-object p1, p0, Ll/֫ۢ;->ܺ:Ll/ܿۢ;

    const v5, 0x7f040020

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 78
    invoke-direct/range {v0 .. v6}, Ll/ᩳ᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 717
    invoke-virtual {p0, p2}, Ll/ᩳ᩷;->֫(I)V

    .line 718
    iget-object p1, p1, Ll/ܿۢ;->ۜ֫:Ll/ۧۢ;

    invoke-virtual {p0, p1}, Ll/ᩳ᩷;->֫(Ll/ܿ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܿ()V
    .locals 2

    .line 723
    iget-object v0, p0, Ll/֫ۢ;->ܺ:Ll/ܿۢ;

    invoke-static {v0}, Ll/ܿۢ;->֫(Ll/ܿۢ;)Ll/ۗۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 724
    invoke-static {v0}, Ll/ܿۢ;->ۧ(Ll/ܿۢ;)Ll/ۗۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۜ;->close()V

    :cond_0
    const/4 v1, 0x0

    .line 726
    iput-object v1, v0, Ll/ܿۢ;->ᩳ֫:Ll/֫ۢ;

    .line 728
    invoke-super {p0}, Ll/ᩳ᩷;->ܿ()V

    return-void
.end method
