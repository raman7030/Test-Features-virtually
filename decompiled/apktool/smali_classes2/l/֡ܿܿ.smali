.class public final synthetic Ll/֡ܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֡ܳܿ;

.field public final synthetic ᩹:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܿܿ;->᩸:Ll/֡ܳܿ;

    iput-object p2, p0, Ll/֡ܿܿ;->᩹:Ll/᩻ܳܿ;

    iput p3, p0, Ll/֡ܿܿ;->᩶:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    sget p1, Ll/֡ܳܿ;->֨ۧ:I

    .line 264
    iget-object p1, p0, Ll/֡ܿܿ;->᩹:Ll/᩻ܳܿ;

    invoke-virtual {p1}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    iget v0, p0, Ll/֡ܿܿ;->᩶:I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 265
    iget-object p1, p1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1, v0}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    .line 266
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    const/4 p1, 0x0

    .line 267
    iget-object p2, p0, Ll/֡ܿܿ;->᩸:Ll/֡ܳܿ;

    invoke-virtual {p2, p1}, Ll/֡ܳܿ;->֫(Z)V

    return-void
.end method
