.class public final Ll/᩺᩺ᩳ;
.super Ljava/lang/Object;
.source "B6NL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܰ᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/ܰ᩺ᩳ;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩺ᩳ;->᩸:Ll/ܰ᩺ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 34
    iget-object v0, p0, Ll/᩺᩺ᩳ;->᩸:Ll/ܰ᩺ᩳ;

    invoke-static {v0}, Ll/ܰ᩺ᩳ;->ۧ(Ll/ܰ᩺ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 35
    :cond_0
    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܽ()V

    return-void

    .line 36
    :cond_1
    invoke-static {v0}, Ll/ܰ᩺ᩳ;->ܽ(Ll/ܰ᩺ᩳ;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
