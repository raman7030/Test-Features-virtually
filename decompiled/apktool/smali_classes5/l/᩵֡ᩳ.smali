.class public final Ll/᩵֡ᩳ;
.super Ljava/lang/Object;
.source "PAPA"

# interfaces
.implements Ll/᩵ۨᩳ;


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/֨֡ᩳ;


# direct methods
.method public constructor <init>(Ll/֨֡ᩳ;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵֡ᩳ;->ۧ:Ll/֨֡ᩳ;

    const/4 p1, 0x0

    .line 135
    iput-boolean p1, p0, Ll/᩵֡ᩳ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 2

    .line 139
    iget-object v0, p0, Ll/᩵֡ᩳ;->ۧ:Ll/֨֡ᩳ;

    invoke-static {v0}, Ll/֨֡ᩳ;->ܽ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 140
    invoke-static {v0}, Ll/֨֡ᩳ;->ܽ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v1

    iput-boolean v1, p0, Ll/᩵֡ᩳ;->֫:Z

    .line 142
    :cond_0
    iget-boolean v1, p0, Ll/᩵֡ᩳ;->֫:Z

    if-ne p1, v1, :cond_1

    return-void

    .line 144
    :cond_1
    invoke-static {v0}, Ll/֨֡ᩳ;->ܽ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 145
    invoke-static {v0}, Ll/֨֡ᩳ;->ܽ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    invoke-interface {v1, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 147
    :cond_2
    iput-boolean p1, p0, Ll/᩵֡ᩳ;->֫:Z

    .line 148
    invoke-virtual {v0}, Ll/֨֡ᩳ;->ܽ֫()Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_3

    const-string p1, "*"

    .line 0
    invoke-static {v1, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 151
    :cond_3
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/᩵֡ᩳ;->ۧ:Ll/֨֡ᩳ;

    invoke-static {v0}, Ll/֨֡ᩳ;->ᩳ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 157
    invoke-static {v0}, Ll/֨֡ᩳ;->ᩳ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object v1

    invoke-interface {v1, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 159
    :cond_0
    invoke-static {v0}, Ll/֨֡ᩳ;->ۧ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 160
    invoke-static {v0}, Ll/֨֡ᩳ;->ۧ(Ll/֨֡ᩳ;)Ll/ܰ۬;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method
