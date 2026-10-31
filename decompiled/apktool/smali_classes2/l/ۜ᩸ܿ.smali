.class public final synthetic Ll/ۜ᩸ܿ;
.super Ljava/lang/Object;
.source "O9SL"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۡ᩸ܿ;

.field public final synthetic ۧ:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩸ܿ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩸ܿ;->֫:Ll/ۡ᩸ܿ;

    iput-object p2, p0, Ll/ۜ᩸ܿ;->ۧ:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۜ᩸ܿ;->֫:Ll/ۡ᩸ܿ;

    .line 4
    iget-object v1, p0, Ll/ۜ᩸ܿ;->ۧ:Ll/ܶ᩵ܿ;

    .line 281
    invoke-virtual {v0, v1}, Ll/ۡ᩸ܿ;->ܽ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
