.class public final Ll/ܽ᩹ۢ;
.super Ljava/lang/Object;
.source "E1UJ"


# static fields
.field public static final ۧ:Ll/ۧ᩹ۢ;


# instance fields
.field public final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ll/ۧ᩹ۢ;

    invoke-direct {v0}, Ll/ۧ᩹ۢ;-><init>()V

    sput-object v0, Ll/ܽ᩹ۢ;->ۧ:Ll/ۧ᩹ۢ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x105

    new-array v0, v0, [I

    .line 17
    iput-object v0, p0, Ll/ܽ᩹ۢ;->֫:[I

    .line 23
    invoke-virtual {p0}, Ll/ܽ᩹ۢ;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 41
    sget-object v0, Ll/ܽ᩹ۢ;->ۧ:Ll/ۧ᩹ۢ;

    invoke-virtual {v0}, Ll/ۧ᩹ۢ;->֫()V

    .line 42
    iget-object v0, v0, Ll/ۧ᩹ۢ;->֫:[I

    iget-object v1, p0, Ll/ܽ᩹ۢ;->֫:[I

    const/16 v2, 0x105

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    .line 53
    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v1, "rgb:"

    .line 57
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    const/4 v3, 0x4

    .line 65
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    mul-int/lit8 v4, v1, 0x2

    sub-int/2addr v2, v4

    .line 66
    rem-int/lit8 v4, v2, 0x3

    if-eqz v4, :cond_1

    goto :goto_1

    .line 67
    :cond_1
    div-int/lit8 v2, v2, 0x3

    mul-int/lit8 v4, v2, 0x4

    int-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 68
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v4, v6

    const-wide v6, 0x406fe00000000000L    # 255.0

    div-double/2addr v6, v4

    add-int v4, v3, v2

    .line 71
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    add-int/2addr v1, v2

    add-int/2addr v3, v1

    add-int v5, v3, v2

    .line 73
    invoke-virtual {p2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v3, v1

    add-int/2addr v2, v3

    .line 75
    invoke-virtual {p2, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x10

    .line 77
    invoke-static {v4, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    int-to-double v2, v2

    mul-double v2, v2, v6

    double-to-int v2, v2

    .line 78
    invoke-static {v5, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-double v3, v3

    mul-double v3, v3, v6

    double-to-int v3, v3

    .line 79
    invoke-static {p2, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p2

    int-to-double v0, p2

    mul-double v0, v0, v6

    double-to-int p2, v0

    const/high16 v0, -0x1000000

    shl-int/lit8 v1, v2, 0x10

    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x8

    or-int/2addr v0, v1

    or-int/2addr v0, p2

    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :goto_1
    if-eqz v0, :cond_3

    .line 91
    iget-object p2, p0, Ll/ܽ᩹ۢ;->֫:[I

    aput v0, p2, p1

    :cond_3
    return-void
.end method
