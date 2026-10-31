.class public final synthetic Ll/֨᩸ۡ;
.super Ljava/lang/Object;
.source "X53D"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Landroid/view/View;

.field public final synthetic ᩸:Landroid/widget/ListView;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩸ۡ;->᩸:Landroid/widget/ListView;

    iput-object p2, p0, Ll/֨᩸ۡ;->᩹:Landroid/view/View;

    iput-object p3, p0, Ll/֨᩸ۡ;->᩶:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/֨᩸ۡ;->᩹:Landroid/view/View;

    iget-object v1, p0, Ll/֨᩸ۡ;->᩶:Landroid/view/View;

    iget-object v2, p0, Ll/֨᩸ۡ;->᩸:Landroid/widget/ListView;

    invoke-static {v2, v0, v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
