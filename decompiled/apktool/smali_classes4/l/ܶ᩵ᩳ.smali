.class public final synthetic Ll/ܶ᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/ܶۜ᩵;
.implements Ll/۠ۜ᩵;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶ᩵ᩳ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܶ᩵ᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p2}, Ll/ۨ᩵ᩳ;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܶ᩵ᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Lbin/mt/plugin/api/util/ResultCallback;

    .line 6
    check-cast p1, Ljava/lang/Void;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 343
    invoke-interface {v0}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    return-void

    .line 344
    :cond_1
    invoke-static {p2}, Ll/ᩳ᩸ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    return-void
.end method
