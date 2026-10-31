.class public final Ll/ᩳۢ᩵;
.super Ljava/lang/Object;
.source "QA30"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܺۢ᩵;

.field public final synthetic ᩹:Ll/۬ۜ᩵;


# direct methods
.method public constructor <init>(Ll/ܺۢ᩵;Ll/۬ۜ᩵;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۢ᩵;->᩸:Ll/ܺۢ᩵;

    iput-object p2, p0, Ll/ᩳۢ᩵;->᩹:Ll/۬ۜ᩵;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1314
    iget-object v0, p0, Ll/ᩳۢ᩵;->᩸:Ll/ܺۢ᩵;

    iget-object v1, p0, Ll/ᩳۢ᩵;->᩹:Ll/۬ۜ᩵;

    invoke-virtual {v0, v1}, Ll/ܺۢ᩵;->֫(Ll/۬ۜ᩵;)V

    return-void
.end method
