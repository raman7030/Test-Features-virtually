.class public final Ll/ܰ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Lbin/mt/plugin/api/util/ResultCallback;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;

.field public final synthetic ۧ:Ll/ۡ᩹ۡ;


# direct methods
.method public constructor <init>(Ll/ۡ᩹ۡ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩷ᩳ;->ۧ:Ll/ۡ᩹ۡ;

    iput-object p2, p0, Ll/ܰ᩷ᩳ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onSuccess()V
    .locals 1

    .line 1284
    iget-object v0, p0, Ll/ܰ᩷ᩳ;->ۧ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰ᩷ᩳ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
