.class public final Ll/᩹ܺ֡;
.super Ljava/lang/Object;
.source "C650"


# instance fields
.field public final ֫:Ll/ۙܺ֡;


# direct methods
.method public constructor <init>(Ll/ۙܺ֡;)V
    .locals 0

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 360
    iput-object p1, p0, Ll/᩹ܺ֡;->֫:Ll/ۙܺ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 366
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    .line 368
    invoke-virtual {v0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Ll/᩹ܺ֡;->֫:Ll/ۙܺ֡;

    invoke-virtual {v0}, Ll/ۚܺ֡;->᩸()Ljava/net/InetAddress;

    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v1

    if-nez v1, :cond_0

    .line 371
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method
