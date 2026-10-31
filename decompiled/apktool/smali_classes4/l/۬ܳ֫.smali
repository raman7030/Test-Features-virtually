.class public final Ll/۬ܳ֫;
.super Ljava/lang/Object;
.source "Z4K7"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۤܳ֫;


# direct methods
.method public constructor <init>(Ll/ۤܳ֫;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܳ֫;->᩸:Ll/ۤܳ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 144
    check-cast p1, Ll/᩻ۡ֫;

    if-eqz p1, :cond_2

    .line 148
    iget-object p1, p0, Ll/۬ܳ֫;->᩸:Ll/ۤܳ֫;

    invoke-static {p1}, Ll/ۤܳ֫;->ܽ(Ll/ۤܳ֫;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object v0

    .line 150
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    .line 154
    invoke-static {p1}, Ll/ۤܳ֫;->֫(Ll/ۤܳ֫;)Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 155
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    invoke-static {p1}, Ll/ۤܳ֫;->֫(Ll/ۤܳ֫;)Landroid/app/Dialog;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    :cond_0
    invoke-static {p1}, Ll/ۤܳ֫;->֫(Ll/ۤܳ֫;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void

    .line 151
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method
