.class public final Ll/᩹֡ܳ;
.super Ll/֡۬ܿ;
.source "XAJ9"


# instance fields
.field public final ۬:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 528
    invoke-static {p2}, Ll/ۤ֡ܳ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    .line 535
    array-length v1, v0

    int-to-long v1, v1

    const-string v3, "link:"

    invoke-virtual {v3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, v1, v2, p2}, Ll/֡۬ܿ;-><init>(Ljava/lang/String;JLjava/lang/Object;)V

    .line 536
    iput-object v0, p0, Ll/᩹֡ܳ;->۬:[B

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 2

    .line 541
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ll/᩹֡ܳ;->۬:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
