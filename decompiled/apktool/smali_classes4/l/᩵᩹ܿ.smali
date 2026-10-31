.class public final synthetic Ll/᩵᩹ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩵᩶ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩵᩶ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩹ܿ;->᩸:Ll/᩵᩶ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/᩵᩹ܿ;->᩸:Ll/᩵᩶ܿ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-ge v2, v3, :cond_1

    const-wide/16 v3, 0x64

    .line 1677
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 1678
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ܳ()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1682
    :cond_1
    :goto_1
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1683
    iget-object v0, v0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
