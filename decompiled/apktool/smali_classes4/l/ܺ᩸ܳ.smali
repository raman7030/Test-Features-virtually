.class public final synthetic Ll/ܺ᩸ܳ;
.super Ljava/lang/Object;
.source "94PF"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ᩸:Ll/֡᩸ܳ;

.field public final synthetic ᩹:Ll/᩵᩸ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩸ܳ;Ll/᩵᩸ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸ܳ;->᩸:Ll/֡᩸ܳ;

    iput-object p2, p0, Ll/ܺ᩸ܳ;->᩹:Ll/᩵᩸ܳ;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 229
    iget-object p1, p0, Ll/ܺ᩸ܳ;->᩸:Ll/֡᩸ܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    iget-object v0, p0, Ll/ܺ᩸ܳ;->᩹:Ll/᩵᩸ܳ;

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    return-void
.end method
