.class public final Ll/ۧۢ᩵;
.super Ljava/lang/Object;
.source "QA30"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۖۢ᩵;


# direct methods
.method public constructor <init>(Ll/ۖۢ᩵;Ll/ܶۢ᩵;)V
    .locals 0

    .line 1117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۢ᩵;->᩸:Ll/ۖۢ᩵;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1121
    iget-object v0, p0, Ll/ۧۢ᩵;->᩸:Ll/ۖۢ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 172
    throw v0
.end method
