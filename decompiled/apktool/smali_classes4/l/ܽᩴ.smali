.class public final synthetic Ll/ܽᩴ;
.super Ljava/lang/Object;
.source "V659"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽᩴ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽᩴ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
