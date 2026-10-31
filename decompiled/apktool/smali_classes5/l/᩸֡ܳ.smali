.class public final Ll/᩸֡ܳ;
.super Ll/֡۬ܿ;
.source "XAJ9"


# instance fields
.field public final ۬:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 1

    .line 500
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p4, p1, p2, v0}, Ll/֡۬ܿ;-><init>(Ljava/lang/String;JLjava/lang/Object;)V

    .line 501
    iput-object p3, p0, Ll/᩸֡ܳ;->۬:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 2

    .line 507
    iget-object v0, p0, Ll/᩸֡ܳ;->۬:Ll/ܶ᩵ܿ;

    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 509
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܰ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 511
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-static {v0}, Ll/ۤ֡ܳ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v1

    .line 513
    :cond_0
    throw v1
.end method
