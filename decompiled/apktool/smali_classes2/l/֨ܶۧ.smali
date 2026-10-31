.class public final Ll/֨ܶۧ;
.super Ljava/lang/Object;
.source "B4RX"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ܶۧ;


# direct methods
.method public constructor <init>(Ll/۠ܶۧ;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܶۧ;->᩸:Ll/۠ܶۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/֨ܶۧ;->᩸:Ll/۠ܶۧ;

    iput p2, v0, Ll/۠ܶۧ;->ۛ:I

    const/4 p2, -0x1

    .line 93
    invoke-virtual {v0, p1, p2}, Ll/ܳ᩸ۧ;->onClick(Landroid/content/DialogInterface;I)V

    .line 95
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
