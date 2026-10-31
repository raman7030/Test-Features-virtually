.class public final Ll/֫᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Runnable;

.field public final synthetic ᩹:Ll/ۧ᩹ۘ;


# direct methods
.method public constructor <init>(Ll/ۧ᩹ۘ;Ljava/lang/Runnable;)V
    .locals 0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫᩹ۘ;->᩹:Ll/ۧ᩹ۘ;

    iput-object p2, p0, Ll/֫᩹ۘ;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 177
    iget-object v0, p0, Ll/֫᩹ۘ;->᩹:Ll/ۧ᩹ۘ;

    :try_start_0
    iget-object v1, p0, Ll/֫᩹ۘ;->᩸:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-virtual {v0}, Ll/ۧ᩹ۘ;->ۧ()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۧ᩹ۘ;->ۧ()V

    .line 180
    throw v1
.end method
