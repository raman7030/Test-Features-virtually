.class public final Ll/۠ۨܿ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/BroadcastReceiver;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 120
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "ScreenColorPicker.ACTION_START"

    .line 121
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ScreenColorPicker.ACTION_STOP"

    .line 122
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Ll/۠ۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    invoke-static {v0, p1}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 128
    iget-object p1, p0, Ll/۠ۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
