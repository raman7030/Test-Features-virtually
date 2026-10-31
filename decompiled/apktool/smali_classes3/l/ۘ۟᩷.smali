.class public final Ll/ۘ۟᩷;
.super Ljava/lang/Object;
.source "M1KQ"

# interfaces
.implements Ll/ۙۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/ᩴ۟᩷;

.field public final synthetic ۧ:Ll/ܿۛ᩷;

.field public final synthetic ܽ:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/ᩴ۟᩷;Ll/᩺ۤܿ;Ll/ܿۛ᩷;)V
    .locals 0

    .line 629
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۟᩷;->֫:Ll/ᩴ۟᩷;

    iput-object p2, p0, Ll/ۘ۟᩷;->ܽ:Ll/᩺ۤܿ;

    iput-object p3, p0, Ll/ۘ۟᩷;->ۧ:Ll/ܿۛ᩷;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 647
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f120202

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۘ۟᩷;->ܽ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 2

    .line 652
    iget-object v0, p0, Ll/ۘ۟᩷;->֫:Ll/ᩴ۟᩷;

    iget-object v0, v0, Ll/ᩴ۟᩷;->᩶:Ll/᩵۟᩷;

    invoke-static {v0}, Ll/᩵۟᩷;->ۡ(Ll/᩵۟᩷;)Ll/ۘۛ᩷;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ۘۛ᩷;->֫(Ll/֨ۛ᩷;Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 632
    iget-object v0, p0, Ll/ۘ۟᩷;->ܽ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 657
    iget-object v0, p0, Ll/ۘ۟᩷;->ܽ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 642
    iget-object v0, p0, Ll/ۘ۟᩷;->ܽ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܽ()Ll/ܿۛ᩷;
    .locals 1

    .line 637
    iget-object v0, p0, Ll/ۘ۟᩷;->ۧ:Ll/ܿۛ᩷;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 662
    new-instance v0, Ll/ۤۛ᩷;

    iget-object v1, p0, Ll/ۘ۟᩷;->ۧ:Ll/ܿۛ᩷;

    invoke-direct {v0, v1}, Ll/ۤۛ᩷;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Ll/ۤۛ᩷;->֫()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const v0, 0x7f120903

    .line 667
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method
