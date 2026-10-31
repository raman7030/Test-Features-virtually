.class public final Ll/ۡܺܽ;
.super Ljava/lang/Object;
.source "X55S"


# instance fields
.field public final ֫:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Ll/ۡܺܽ;->֫:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public final ֫()[B
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۡܺܽ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
