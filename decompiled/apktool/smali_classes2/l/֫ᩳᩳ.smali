.class public final Ll/֫ᩳᩳ;
.super Ljava/lang/Object;
.source "L19N"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۫:Ll/ۗ᩺ۡ;

.field public final synthetic ۬:Ll/ܳܰۡ;

.field public final synthetic ᩶:Ll/ܿۖ᩷;

.field public final ᩸:Ljava/lang/ThreadLocal;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/lang/ThreadLocal;Ljava/lang/String;Ll/ܿۖ᩷;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ܳܰۡ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/֫ᩳᩳ;->᩶:Ll/ܿۖ᩷;

    iput-object p5, p0, Ll/֫ᩳᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p6, p0, Ll/֫ᩳᩳ;->۬:Ll/ܳܰۡ;

    iput-object p7, p0, Ll/֫ᩳᩳ;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 269
    iput-object p1, p0, Ll/֫ᩳᩳ;->۫:Ll/ۗ᩺ۡ;

    .line 270
    iput-object p2, p0, Ll/֫ᩳᩳ;->᩸:Ljava/lang/ThreadLocal;

    .line 271
    iput-object p3, p0, Ll/֫ᩳᩳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 276
    iget-object v0, p0, Ll/֫ᩳᩳ;->۫:Ll/ۗ᩺ۡ;

    iget-object v1, p0, Ll/֫ᩳᩳ;->᩶:Ll/ܿۖ᩷;

    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/֫ᩳᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 280
    :try_start_0
    iget-object v3, p0, Ll/֫ᩳᩳ;->᩸:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/MessageDigest;

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    iget-object v4, p0, Ll/֫ᩳᩳ;->۬:Ll/ܳܰۡ;

    invoke-virtual {v4}, Ll/ܳܰۡ;->֫()Ll/ᩳܰۡ;

    move-result-object v4

    .line 282
    invoke-virtual {v4, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    .line 283
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 284
    iget-object v4, p0, Ll/֫ᩳᩳ;->᩹:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 285
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩹()Ljava/lang/String;

    .line 286
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 290
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 0
    :cond_1
    iget-object v1, p0, Ll/֫ᩳᩳ;->ۗ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_3
    :goto_0
    return-void
.end method
