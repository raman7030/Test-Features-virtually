.class public final synthetic Ll/ۜ᩹᩻;
.super Ljava/lang/Object;
.source "35GV"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩹᩻;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 103
    iget-object p1, p0, Ll/ۜ᩹᩻;->᩸:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    .line 104
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
