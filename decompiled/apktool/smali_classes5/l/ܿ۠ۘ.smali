.class public final synthetic Ll/ܿ۠ۘ;
.super Ljava/lang/Object;
.source "B7KV"

# interfaces
.implements Ll/֫᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۙ֨ۘ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ֨ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۠ۘ;->᩸:Ll/ۙ֨ۘ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 13
    new-instance v0, Ll/ܳ۠ۘ;

    iget-object v1, p0, Ll/ܿ۠ۘ;->᩸:Ll/ۙ֨ۘ;

    invoke-direct {v0, v1}, Ll/ܳ۠ۘ;-><init>(Ll/ۙ֨ۘ;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object v0
.end method
