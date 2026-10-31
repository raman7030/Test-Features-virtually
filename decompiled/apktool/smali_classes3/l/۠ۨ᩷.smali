.class public final synthetic Ll/۠ۨ᩷;
.super Ljava/lang/Object;
.source "V1EH"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ljava/io/BufferedOutputStream;


# direct methods
.method public synthetic constructor <init>(ZLjava/io/BufferedOutputStream;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/۠ۨ᩷;->᩸:Z

    iput-object p2, p0, Ll/۠ۨ᩷;->᩹:Ljava/io/BufferedOutputStream;

    iput-object p3, p0, Ll/۠ۨ᩷;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 180
    new-instance v0, Ll/۬ۨ᩷;

    iget-boolean v1, p0, Ll/۠ۨ᩷;->᩸:Z

    iget-object v2, p0, Ll/۠ۨ᩷;->᩹:Ljava/io/BufferedOutputStream;

    iget-object v3, p0, Ll/۠ۨ᩷;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1, v2, v3}, Ll/۬ۨ᩷;-><init>(ZLjava/io/BufferedOutputStream;Ljava/util/concurrent/atomic/AtomicInteger;)V

    return-object v0
.end method
