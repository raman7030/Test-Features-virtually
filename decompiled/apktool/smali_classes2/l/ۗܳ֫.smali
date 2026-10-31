.class public final Ll/ۗܳ֫;
.super Ljava/lang/Object;
.source "Z4K7"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤܳ֫;


# direct methods
.method public constructor <init>(Ll/ۤܳ֫;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗܳ֫;->᩸:Ll/ۤܳ֫;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 132
    iget-object p1, p0, Ll/ۗܳ֫;->᩸:Ll/ۤܳ֫;

    invoke-static {p1}, Ll/ۤܳ֫;->֫(Ll/ۤܳ֫;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 133
    invoke-static {p1}, Ll/ۤܳ֫;->֫(Ll/ۤܳ֫;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤܳ֫;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
