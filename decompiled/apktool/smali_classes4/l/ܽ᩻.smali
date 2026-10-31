.class public final Ll/ܽ᩻;
.super Ljava/lang/Object;
.source "45OX"

# interfaces
.implements Ll/᩹᩺;


# instance fields
.field public final synthetic ֫:Ll/ܿ᩻;


# direct methods
.method public constructor <init>(Ll/ܿ᩻;)V
    .locals 0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩻;->֫:Ll/ܿ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;)V
    .locals 0

    .line 162
    iget-object p1, p0, Ll/ܽ᩻;->֫:Ll/ܿ᩻;

    iget-object p1, p1, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 163
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
