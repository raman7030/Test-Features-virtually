.class public final Ll/᩸ۖ;
.super Ljava/lang/Object;
.source "95GJ"


# instance fields
.field public final ֫:Landroid/view/View;

.field public final ۧ:Ll/ۗۜ;

.field public ܽ:Ll/ܶۖ;

.field public final ܿ:Ll/ᩳ᩷;

.field public ᩳ:Ll/۠ۖ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 1

    const v0, 0x7f0403bd

    .line 83
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;II)V
    .locals 8

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p2, p0, Ll/᩸ۖ;->֫:Landroid/view/View;

    .line 108
    new-instance v2, Ll/ۗۜ;

    invoke-direct {v2, p1}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/᩸ۖ;->ۧ:Ll/ۗۜ;

    .line 109
    new-instance v0, Ll/ۚۖ;

    invoke-direct {v0, p0}, Ll/ۚۖ;-><init>(Ll/᩸ۖ;)V

    invoke-virtual {v2, v0}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    .line 123
    new-instance v7, Ll/ᩳ᩷;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move v5, p4

    invoke-direct/range {v0 .. v6}, Ll/ᩳ᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;ZII)V

    iput-object v7, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    .line 124
    invoke-virtual {v7, p3}, Ll/ᩳ᩷;->֫(I)V

    .line 125
    new-instance p1, Ll/֨ۖ;

    invoke-direct {p1, p0}, Ll/֨ۖ;-><init>(Ll/᩸ۖ;)V

    invoke-virtual {v7, p1}, Ll/ᩳ᩷;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 247
    iget-object v0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-virtual {v0, p1}, Ll/ᩳ᩷;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/۠ۖ;)V
    .locals 0

    .line 266
    iput-object p1, p0, Ll/᩸ۖ;->ᩳ:Ll/۠ۖ;

    return-void
.end method

.method public final ֫(Ll/ܶۖ;)V
    .locals 0

    .line 257
    iput-object p1, p0, Ll/᩸ۖ;->ܽ:Ll/ܶۖ;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-virtual {v0}, Ll/ᩳ᩷;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/ۗۜ;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/᩸ۖ;->ۧ:Ll/ۗۜ;

    return-object v0
.end method

.method public final ܿ()V
    .locals 2

    .line 238
    iget-object v0, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    .line 142
    invoke-virtual {v0}, Ll/ᩳ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 143
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    const/4 v0, 0x1

    .line 279
    iget-object v1, p0, Ll/᩸ۖ;->ܿ:Ll/ᩳ᩷;

    invoke-virtual {v1, v0}, Ll/ᩳ᩷;->֫(Z)V

    return-void
.end method
