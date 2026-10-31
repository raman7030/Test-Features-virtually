.class public final synthetic Ll/֡᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۨܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩵ᩳ;->᩸:Ll/ۨܶᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֡᩵ᩳ;->᩸:Ll/ۨܶᩳ;

    .line 341
    :try_start_0
    invoke-virtual {v0}, Ll/ۨܶᩳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 341
    throw v1
.end method
