.class public final synthetic Ll/᩷۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/۠۫ܿ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Ll/ܽᩴۢ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Ll/ܽᩴۢ;Ll/֡ۚۢ;Ll/۠۫ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۫ܿ;->᩸:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/᩷۫ܿ;->᩹:Ll/ܽᩴۢ;

    iput-object p3, p0, Ll/᩷۫ܿ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/᩷۫ܿ;->ۙ:Ll/۠۫ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 569
    iget-object p1, p0, Ll/᩷۫ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 570
    iget-object p1, p0, Ll/᩷۫ܿ;->᩹:Ll/ܽᩴۢ;

    invoke-virtual {p1}, Ll/ܽᩴۢ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/֫ۚۢ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 571
    iget-object p1, p0, Ll/᩷۫ܿ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 572
    iget-object p1, p0, Ll/᩷۫ܿ;->ۙ:Ll/۠۫ܿ;

    invoke-virtual {p1}, Ll/۠۫ܿ;->ۧ()V

    return-void

    :cond_0
    const p1, 0x7f120838

    .line 574
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method
