.class public final Ll/ۧۗܳ;
.super Ljava/lang/Object;
.source "1B34"


# instance fields
.field public ֫:Ljava/util/concurrent/CountDownLatch;

.field public ۧ:Ljava/lang/Boolean;

.field public final synthetic ܽ:Ll/ܿۗܳ;


# direct methods
.method public constructor <init>(Ll/ܿۗܳ;)V
    .locals 1

    .line 473
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۗܳ;->ܽ:Ll/ܿۗܳ;

    .line 474
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Ll/ۧۗܳ;->֫:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method
