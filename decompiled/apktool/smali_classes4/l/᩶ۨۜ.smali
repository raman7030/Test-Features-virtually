.class public final Ll/᩶ۨۜ;
.super Ljava/lang/Object;
.source "Q6MT"


# static fields
.field public static final ֫:Ll/᩶ۨۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 200
    new-instance v0, Ll/᩶ۨۜ;

    .line 209
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 200
    sput-object v0, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 3

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    const v0, 0xf4240

    if-gt p1, v0, :cond_0

    if-gt p2, v0, :cond_0

    int-to-long v0, p1

    int-to-long p1, p2

    mul-long v0, v0, p1

    const-wide/32 p1, 0x10000000

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    return-void

    .line 224
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Image dimensions exceed safe decode limits"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
