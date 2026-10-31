.class public final synthetic Ll/᩸ۘ᩻;
.super Ljava/lang/Object;
.source "J7J5"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۘ᩻;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۘ᩻;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۘ᩻;->᩸:Ll/᩹ۘ᩻;

    iput p2, p0, Ll/᩸ۘ᩻;->᩹:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 231
    iget p1, p0, Ll/᩸ۘ᩻;->᩹:I

    invoke-static {p1}, Ll/۫᩻᩻;->ۧ(I)V

    .line 232
    iget-object p2, p0, Ll/᩸ۘ᩻;->᩸:Ll/᩹ۘ᩻;

    iget-object p2, p2, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    invoke-static {p2}, Ll/᩶ۘ᩻;->֫(Ll/᩶ۘ᩻;)Ll/۠ۘ᩻;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    return-void
.end method
