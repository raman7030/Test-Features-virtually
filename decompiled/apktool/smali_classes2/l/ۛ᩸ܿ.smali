.class public final synthetic Ll/ۛ᩸ܿ;
.super Ljava/lang/Object;
.source "F99O"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/᩺᩸ܿ;

.field public final synthetic ۧ:Ljava/net/ServerSocket;


# direct methods
.method public synthetic constructor <init>(Ll/᩺᩸ܿ;Ljava/net/ServerSocket;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩸ܿ;->֫:Ll/᩺᩸ܿ;

    iput-object p2, p0, Ll/ۛ᩸ܿ;->ۧ:Ljava/net/ServerSocket;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۛ᩸ܿ;->֫:Ll/᩺᩸ܿ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    iget-object v1, p0, Ll/ۛ᩸ܿ;->ۧ:Ljava/net/ServerSocket;

    invoke-virtual {v1}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩺᩸ܿ;->֫(I)V

    const/4 v0, 0x0

    return-object v0
.end method
