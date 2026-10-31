.class public final Ll/֨ۨۡ;
.super Ljava/lang/Object;
.source "D73Y"


# static fields
.field public static final ֫:[I

.field public static final ۧ:Ll/ۚۨۡ;

.field public static volatile ܽ:Ll/֡ۨۡ;

.field public static volatile ᩳ:Ll/ۚۨۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/high16 v0, 0x1800000

    const/high16 v1, 0x3000000

    const/high16 v2, 0xc00000

    .line 16
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/֨ۨۡ;->֫:[I

    .line 19
    new-instance v0, Ll/ᩴۨۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v1, Ll/᩵ۨۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Ll/֨ۨۡ;->ۧ:Ll/ۚۨۡ;

    .line 39
    sput-object v0, Ll/֨ۨۡ;->ܽ:Ll/֡ۨۡ;

    .line 40
    sput-object v1, Ll/֨ۨۡ;->ᩳ:Ll/ۚۨۡ;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 2

    .line 49
    sget-object v0, Ll/֨ۨۡ;->ܽ:Ll/֡ۨۡ;

    const-string v1, "inputStream"

    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p0}, Ll/֡ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;
    .locals 2

    const-string v0, "outputStream"

    .line 57
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    sget-object v0, Ll/֨ۨۡ;->ᩳ:Ll/ۚۨۡ;

    .line 59
    invoke-interface {v0, p1}, Ll/ۚۨۡ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 60
    sget-object v0, Ll/֨ۨۡ;->ۧ:Ll/ۚۨۡ;

    .line 62
    :cond_0
    invoke-interface {v0, p0, p1}, Ll/ۚۨۡ;->֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)Ll/ۧۜ֨;
    .locals 3

    .line 69
    new-instance v0, Ll/ۧۜ֨;

    .line 98
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 157
    invoke-virtual {v0, p0}, Ll/ۧۜ֨;->ܽ(I)V

    const/4 v1, 0x7

    if-lt p0, v1, :cond_0

    const/16 v2, 0x9

    if-gt p0, v2, :cond_0

    .line 71
    sget-object v2, Ll/֨ۨۡ;->֫:[I

    sub-int/2addr p0, v1

    aget p0, v2, p0

    invoke-virtual {v0, p0}, Ll/ۧۜ֨;->֫(I)V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/ۚۨۡ;)V
    .locals 0

    .line 87
    sput-object p0, Ll/֨ۨۡ;->ᩳ:Ll/ۚۨۡ;

    return-void
.end method

.method public static ֫(Ll/ܿ᩺᩵;)V
    .locals 0

    .line 80
    sput-object p0, Ll/֨ۨۡ;->ܽ:Ll/֡ۨۡ;

    return-void
.end method
