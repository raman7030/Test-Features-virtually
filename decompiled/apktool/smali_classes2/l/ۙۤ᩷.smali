.class public final synthetic Ll/ۙۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗۤ᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۗۤ᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۤ᩷;->᩸:Ll/ۗۤ᩷;

    iput p2, p0, Ll/ۙۤ᩷;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 796
    iget-object v0, p0, Ll/ۙۤ᩷;->᩸:Ll/ۗۤ᩷;

    iget-object v1, v0, Ll/ۗۤ᩷;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/ۙۤ᩷;->᩹:I

    if-ne v2, v1, :cond_0

    .line 797
    iget-object v0, v0, Ll/ۗۤ᩷;->ܿ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ۨ(Ll/ܿۛ᩷;)V

    :cond_0
    return-void
.end method
