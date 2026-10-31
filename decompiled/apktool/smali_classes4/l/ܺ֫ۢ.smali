.class public final Ll/ܺ֫ۢ;
.super Ljava/lang/Object;
.source "Z1GQ"

# interfaces
.implements Lbin/mt/plugin/api/util/ResultCallback;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 835
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ֫ۢ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onSuccess()V
    .locals 1

    .line 838
    iget-object v0, p0, Ll/ܺ֫ۢ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
