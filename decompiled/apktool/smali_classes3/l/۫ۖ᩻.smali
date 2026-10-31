.class public final synthetic Ll/۫ۖ᩻;
.super Ljava/lang/Object;
.source "Q87M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic ۙ:Ll/֨ᩳ֡;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ᩸:Ll/۟ۖ᩻;

.field public final synthetic ᩹:Lcom/amazonaws/services/s3/model/PutObjectRequest;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۖ᩻;Lcom/amazonaws/services/s3/model/PutObjectRequest;Ljava/util/concurrent/atomic/AtomicReference;Ll/֨ᩳ֡;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۖ᩻;->᩸:Ll/۟ۖ᩻;

    iput-object p2, p0, Ll/۫ۖ᩻;->᩹:Lcom/amazonaws/services/s3/model/PutObjectRequest;

    iput-object p3, p0, Ll/۫ۖ᩻;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ll/۫ۖ᩻;->ۙ:Ll/֨ᩳ֡;

    iput-object p5, p0, Ll/۫ۖ᩻;->ۗ:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Ll/۫ۖ᩻;->ۙ:Ll/֨ᩳ֡;

    iget-object v1, p0, Ll/۫ۖ᩻;->ۗ:Ljava/util/concurrent/CountDownLatch;

    iget-object v2, p0, Ll/۫ۖ᩻;->᩸:Ll/۟ۖ᩻;

    iget-object v3, p0, Ll/۫ۖ᩻;->᩹:Lcom/amazonaws/services/s3/model/PutObjectRequest;

    iget-object v4, p0, Ll/۫ۖ᩻;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v3, v4, v0, v1}, Ll/۟ۖ᩻;->֫(Ll/۟ۖ᩻;Lcom/amazonaws/services/s3/model/PutObjectRequest;Ljava/util/concurrent/atomic/AtomicReference;Ll/֨ᩳ֡;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
