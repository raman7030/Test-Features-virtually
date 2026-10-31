.class public final synthetic Ll/ܰܶۡ;
.super Ljava/lang/Object;
.source "V4WQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ܶۡ;

.field public final synthetic ᩹:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܶۡ;Ljava/lang/Exception;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܶۡ;->᩸:Ll/۟ܶۡ;

    iput-object p2, p0, Ll/ܰܶۡ;->᩹:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܰܶۡ;->᩹:Ljava/lang/Exception;

    .line 4
    iget-object v1, p0, Ll/ܰܶۡ;->᩸:Ll/۟ܶۡ;

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    :try_start_0
    invoke-virtual {v1, v0}, Ll/۟ܶۡ;->֫(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    invoke-virtual {v1}, Ll/۟ܶۡ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ll/۟ܶۡ;->ᩳ()V

    .line 226
    throw v0
.end method
