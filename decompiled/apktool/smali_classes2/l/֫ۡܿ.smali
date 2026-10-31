.class public final synthetic Ll/֫ۡܿ;
.super Ljava/lang/Object;
.source "O700"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۡܿ;->᩸:Ll/۫ۨᩳ;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/֫ۡܿ;->᩸:Ll/۫ۨᩳ;

    .line 185
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
