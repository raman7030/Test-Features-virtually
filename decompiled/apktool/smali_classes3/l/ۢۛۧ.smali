.class public final synthetic Ll/ۢۛۧ;
.super Ljava/lang/Object;
.source "C5U9"

# interfaces
.implements Ll/ܳ۫;


# instance fields
.field public final synthetic ֫:Ll/ܽۨۧ;

.field public final synthetic ۧ:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۨۧ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۛۧ;->֫:Ll/ܽۨۧ;

    iput-object p2, p0, Ll/ۢۛۧ;->ۧ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ۢۛۧ;->֫:Ll/ܽۨۧ;

    invoke-virtual {v0}, Ll/ܽۨۧ;->cancel()V

    .line 340
    iget-object v0, p0, Ll/ۢۛۧ;->ۧ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
