.class public final synthetic Ll/۬֨ۘ;
.super Ljava/lang/Object;
.source "K7JY"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤ֨ۘ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۤ֨ۘ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬֨ۘ;->᩸:Ll/ۤ֨ۘ;

    iput p2, p0, Ll/۬֨ۘ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    sget p1, Ll/ۤ֨ۘ;->ۧ֫:I

    .line 102
    iget-object p1, p0, Ll/۬֨ۘ;->᩸:Ll/ۤ֨ۘ;

    invoke-virtual {p1}, Ll/ۙ֨ۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ll/᩷۠ۘ;

    invoke-virtual {v0}, Ll/᩷۠ۘ;->֫()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ll/۬֨ۘ;->᩹:I

    if-ge v1, v0, :cond_1

    .line 103
    invoke-virtual {p1}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast p1, Ll/᩷۠ۘ;

    invoke-virtual {p1, v1}, Ll/᩷۠ۘ;->֫(I)V

    :cond_1
    return-void
.end method
