.class public final Ll/᩹۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Lcom/tencent/connect/auth/a;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/a;)V
    .locals 0

    .line 536
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۠ۘ;->᩸:Lcom/tencent/connect/auth/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 539
    iget-object p1, p0, Ll/᩹۠ۘ;->᩸:Lcom/tencent/connect/auth/a;

    invoke-virtual {p1}, Lcom/tencent/connect/auth/a;->dismiss()V

    .line 541
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܽ(Lcom/tencent/connect/auth/a;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 542
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ۠ۘ;->֫()V

    :cond_0
    return-void
.end method
