.class public final Ll/ܿۨܳ;
.super Ljava/lang/Object;
.source "F8CE"

# interfaces
.implements Ll/ۢۨܳ;


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x7

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x6

    .line 83
    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܿۨܳ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ۖܽ;)J
    .locals 2

    .line 74
    invoke-static {p1}, Ll/ۢۢ֡;->֫(Ll/۠ۖܽ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 0

    .line 79
    invoke-static {p1}, Ll/֨ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;
    .locals 2

    .line 88
    sget-object v0, Ll/ܿۨܳ;->֫:[I

    aget p2, v0, p2

    invoke-static {p1, p2}, Ll/֨ۨۡ;->֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;

    move-result-object p1

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-lez p2, :cond_0

    .line 89
    instance-of p2, p1, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    if-eqz p2, :cond_0

    .line 90
    new-instance p2, Ll/ۡۨܳ;

    check-cast p1, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-direct {p2, p1, p3, p4}, Ll/ۡۨܳ;-><init>(Lnet/sf/sevenzipjbinding/NativeXZOutputStream;J)V

    return-object p2

    :cond_0
    return-object p1
.end method

.method public final ֫([BI)Z
    .locals 0

    .line 69
    invoke-static {p2, p1}, Ll/ۢۢ֡;->֫(I[B)Z

    move-result p1

    return p1
.end method
