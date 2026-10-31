.class public final synthetic Ll/֨ۚ֫;
.super Ljava/lang/Object;
.source "L8SE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/۠ۚ֫;

.field public final synthetic ᩸:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILl/۠ۚ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۚ֫;->᩸:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Ll/֨ۚ֫;->᩹:I

    iput-object p3, p0, Ll/֨ۚ֫;->᩶:Ll/۠ۚ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 225
    iget-object v0, p0, Ll/֨ۚ֫;->᩸:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۚ֫;

    .line 226
    iget v2, p0, Ll/֨ۚ֫;->᩹:I

    iget-object v3, p0, Ll/֨ۚ֫;->᩶:Ll/۠ۚ֫;

    invoke-virtual {v1, v2, v3}, Ll/᩸ۚ֫;->֫(ILl/۠ۚ֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method
