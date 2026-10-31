.class public final synthetic Ll/۠᩻ۡ;
.super Ljava/lang/Object;
.source "A924"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩻ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩻ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩻ۡ;->᩸:Ll/ܶ᩻ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۠᩻ۡ;->᩸:Ll/ܶ᩻ۡ;

    .line 258
    iget-object v0, v0, Ll/ܶ᩻ۡ;->ܳ:Ll/ܽܰ᩵;

    if-eqz v0, :cond_0

    .line 259
    invoke-interface {v0}, Ll/ܽܰ᩵;->cancel()V

    :cond_0
    return-void
.end method
