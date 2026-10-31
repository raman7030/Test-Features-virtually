.class public final Ll/۟ۙܳ;
.super Ljava/lang/Object;
.source "1B34"

# interfaces
.implements Ll/᩺ܺܳ;


# instance fields
.field public final synthetic ۙ:Ljava/util/LinkedHashMap;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩸:Ll/ܿۗܳ;

.field public final synthetic ᩹:Ll/֫ۗܳ;


# direct methods
.method public constructor <init>(Ll/ܿۗܳ;Ljava/util/LinkedHashMap;Ll/֫ۗܳ;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۙܳ;->᩸:Ll/ܿۗܳ;

    iput-object p2, p0, Ll/۟ۙܳ;->ۙ:Ljava/util/LinkedHashMap;

    iput-object p3, p0, Ll/۟ۙܳ;->᩹:Ll/֫ۗܳ;

    iput-object p4, p0, Ll/۟ۙܳ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    .locals 4

    .line 322
    iget-object v0, p0, Ll/۟ۙܳ;->᩹:Ll/֫ۗܳ;

    :try_start_0
    iget-object v1, p0, Ll/۟ۙܳ;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ll/֫ۗܳ;->֫(Ljava/lang/String;Z)V

    if-eqz p2, :cond_0

    .line 324
    iget-object v2, p0, Ll/۟ۙܳ;->᩸:Ll/ܿۗܳ;

    invoke-static {p2}, Ll/ܿۗܳ;->֫(Ljava/io/InputStream;)Ljava/io/BufferedInputStream;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ܿۗܳ;->֫(Ll/ܿۗܳ;Ljava/io/BufferedInputStream;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 325
    new-instance v2, Ll/۫ۙܳ;

    invoke-direct {v2, p1, v1}, Ll/۫ۙܳ;-><init>(Ll/ᩳۜܳ;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ll/֫ۗܳ;->֫(Ll/۫ۙܳ;)V

    .line 326
    iget-object p1, p0, Ll/۟ۙܳ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
    :cond_0
    invoke-static {p2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 330
    throw p1
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩻()Z
    .locals 1

    .line 341
    iget-object v0, p0, Ll/۟ۙܳ;->᩸:Ll/ܿۗܳ;

    invoke-static {v0}, Ll/ܿۗܳ;->ۧ(Ll/ܿۗܳ;)Z

    move-result v0

    return v0
.end method
