.class public final Ll/᩵ۧ֫;
.super Ljava/lang/Object;
.source "O607"

# interfaces
.implements Ll/ۚ۟;


# instance fields
.field public final synthetic ᩸:Ll/۬ۧ֫;


# direct methods
.method public constructor <init>(Ll/۬ۧ֫;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۧ֫;->᩸:Ll/۬ۧ֫;

    return-void
.end method


# virtual methods
.method public final perform(Landroid/view/View;Ll/ۢ۟;)Z
    .locals 2

    .line 262
    invoke-static {p1}, Ll/۬ۧ֫;->ܳ(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Ll/᩵ۧ֫;->᩸:Ll/۬ۧ֫;

    invoke-virtual {p2, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 1809
    invoke-virtual {p2, p1, v0}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
