.class public final Ll/֨ܳۧ;
.super Ljava/lang/Object;
.source "F8QN"

# interfaces
.implements Ll/۠ܳۧ;


# instance fields
.field public final synthetic ᩸:Ljava/util/concurrent/Executor;

.field public final synthetic ᩹:Ll/ܽܳۧ;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll/ܽܳۧ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܳۧ;->᩸:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll/֨ܳۧ;->᩹:Ll/ܽܳۧ;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/֨ܳۧ;->᩸:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/֨ܳۧ;->᩹:Ll/ܽܳۧ;

    iget-object v1, p0, Ll/֨ܳۧ;->᩸:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1}, Ll/ܽܳۧ;->accept(Ljava/lang/Object;)V

    return-void
.end method
