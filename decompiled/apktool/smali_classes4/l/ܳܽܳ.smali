.class public final Ll/ܳܽܳ;
.super Ljava/lang/Object;
.source "P70P"


# static fields
.field public static final ֫:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ܳܽܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 0
    sget-object v0, Ll/ܳܽܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public static ۧ()Ll/ܿܽܳ;
    .locals 4

    .line 19
    new-instance v0, Ll/ܿܽܳ;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    :cond_0
    sget-object v1, Ll/ܳܽܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_1

    add-int/lit8 v3, v2, 0x1

    .line 25
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 23
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Too many open hex file channels"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
