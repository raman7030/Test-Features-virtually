.class public final Ll/ܿ᩻֫;
.super Ll/ۜ᩻֫;
.source "J4LB"


# instance fields
.field public final synthetic ֫:Ll/ۡ᩻֫;

.field public final synthetic ۧ:Ll/᩷ᩳ;

.field public final synthetic ܽ:Ll/᩸ᩳ;

.field public final synthetic ܿ:Ll/ܽ᩵;

.field public final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;Ll/ܽ᩵;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩸ᩳ;Ll/᩷ᩳ;)V
    .locals 0

    .line 3595
    iput-object p1, p0, Ll/ܿ᩻֫;->֫:Ll/ۡ᩻֫;

    iput-object p2, p0, Ll/ܿ᩻֫;->ܿ:Ll/ܽ᩵;

    iput-object p3, p0, Ll/ܿ᩻֫;->ᩳ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ll/ܿ᩻֫;->ܽ:Ll/᩸ᩳ;

    iput-object p5, p0, Ll/ܿ᩻֫;->ۧ:Ll/᩷ᩳ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/ۜ᩻֫;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 3598
    iget-object v0, p0, Ll/ܿ᩻֫;->֫:Ll/ۡ᩻֫;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v1

    .line 3599
    iget-object v2, p0, Ll/ܿ᩻֫;->ܿ:Ll/ܽ᩵;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ll/ܽ᩵;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ᩳ;

    .line 3600
    iget-object v3, p0, Ll/ܿ᩻֫;->ܽ:Ll/᩸ᩳ;

    iget-object v4, p0, Ll/ܿ᩻֫;->ۧ:Ll/᩷ᩳ;

    invoke-virtual {v2, v1, v0, v3, v4}, Ll/᩵ᩳ;->֫(Ljava/lang/String;Ll/᩻ۡ֫;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ܿ᩻֫;->ᩳ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
