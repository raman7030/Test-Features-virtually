.class public final synthetic Ll/ۧ᩵ᩳ;
.super Ljava/lang/Object;
.source "16SF"

# interfaces
.implements Ll/۠ۜ᩵;


# instance fields
.field public final synthetic ᩸:Ll/᩵᩵ᩳ;

.field public final synthetic ᩹:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Ll/᩵᩵ᩳ;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩵ᩳ;->᩸:Ll/᩵᩵ᩳ;

    iput-object p2, p0, Ll/ۧ᩵ᩳ;->᩹:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 0
    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Ll/ۧ᩵ᩳ;->᩸:Ll/᩵᩵ᩳ;

    iget-object v0, p0, Ll/ۧ᩵ᩳ;->᩹:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Ll/᩵᩵ᩳ;->ۧ(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
