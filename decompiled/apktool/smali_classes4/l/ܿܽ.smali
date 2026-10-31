.class public final synthetic Ll/ܿܽ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܳܽ;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܽ;->᩸:Ll/ܳܽ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1241
    iget-object v0, p0, Ll/ܿܽ;->᩸:Ll/ܳܽ;

    iget-object v1, v0, Ll/ܳܽ;->᩶:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 1242
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    const/4 v1, 0x0

    .line 1243
    iput-object v1, v0, Ll/ܳܽ;->᩶:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method
