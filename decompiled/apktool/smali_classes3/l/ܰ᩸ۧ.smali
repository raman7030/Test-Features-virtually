.class public final Ll/ܰ᩸ۧ;
.super Ljava/lang/Object;
.source "6ALU"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/۟᩸ۧ;


# direct methods
.method public constructor <init>(Ll/۟᩸ۧ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ܰ᩸ۧ;->᩸:Ll/۟᩸ۧ;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 3
    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Landroid/view/View;)V

    .line 49
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 210
    iget-object p1, p0, Ll/ܰ᩸ۧ;->᩸:Ll/۟᩸ۧ;

    invoke-static {p1}, Ll/۟᩸ۧ;->ۧ(Ll/۟᩸ۧ;)Ll/֡ܽ;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 73
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object p3

    check-cast p3, Ll/ܳۤۧ;

    .line 211
    invoke-virtual {p3}, Ll/ܳۤۧ;->ܿ()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 73
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ܳۤۧ;

    .line 211
    invoke-virtual {p1}, Ll/ܳۤۧ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 210
    :goto_0
    invoke-virtual {p2, p1}, Ll/֡ܽ;->֫(Z)V

    return-void
.end method
