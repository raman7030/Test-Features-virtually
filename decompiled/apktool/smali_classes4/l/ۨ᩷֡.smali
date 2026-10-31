.class public final Ll/ۨ᩷֡;
.super Ljava/lang/Object;
.source "PAGY"

# interfaces
.implements Ll/᩺᩷֡;


# instance fields
.field public final ֫:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/nio/charset/Charset;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۨ᩷֡;->֫:Ljava/nio/charset/Charset;

    return-void
.end method


# virtual methods
.method public final ֫(II[B)Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨ᩷֡;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p3, p1, p2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)[B
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۨ᩷֡;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    return-object p1
.end method
