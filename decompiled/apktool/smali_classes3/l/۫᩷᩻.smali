.class public final synthetic Ll/۫᩷᩻;
.super Ljava/lang/Object;
.source "W79N"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ۢۢ᩻;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:Ljava/lang/Runnable;

.field public final synthetic ᩹:Ll/֫ۢ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/۬᩷᩻;Ll/֫ۢ᩻;Ljava/lang/Object;Ll/ۢۢ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩷᩻;->᩸:Ljava/lang/Runnable;

    iput-object p2, p0, Ll/۫᩷᩻;->᩹:Ll/֫ۢ᩻;

    iput-object p3, p0, Ll/۫᩷᩻;->᩶:Ljava/lang/Object;

    iput-object p4, p0, Ll/۫᩷᩻;->ۙ:Ll/ۢۢ᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1356
    iget-object v0, p0, Ll/۫᩷᩻;->᩸:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1357
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1359
    :cond_0
    new-instance v0, Ll/ܳۜ᩻;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۫᩷᩻;->ۙ:Ll/ۢۢ᩻;

    iget-object v3, p0, Ll/۫᩷᩻;->᩶:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ll/ܳۜ᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ll/۫᩷᩻;->᩹:Ll/֫ۢ᩻;

    check-cast v1, Ll/᩵ۢ᩻;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v1, 0x1d4c0

    .line 282
    invoke-static {v3, v1, v2, v0}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V

    return-void
.end method
