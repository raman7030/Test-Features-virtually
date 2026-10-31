.class public final Ll/ܶܳ֡;
.super Ljava/lang/Object;
.source "LARQ"

# interfaces
.implements Ll/۠ܳ֡;


# static fields
.field public static final ܿ:Ll/ܶܳ֡;

.field public static final ᩳ:[Ljava/lang/String;


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:[Ljava/lang/String;

.field public final ܽ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 17
    sput-object v0, Ll/ܶܳ֡;->ᩳ:[Ljava/lang/String;

    .line 27
    new-instance v1, Ll/ܶܳ֡;

    invoke-direct {v1, v0, v0, v0}, Ll/ܶܳ֡;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v1, Ll/ܶܳ֡;->ܿ:Ll/ܶܳ֡;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    sget-object v0, Ll/ܶܳ֡;->ᩳ:[Ljava/lang/String;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Ll/ܶܳ֡;->ۧ:[Ljava/lang/String;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v0

    .line 73
    :goto_1
    iput-object p2, p0, Ll/ܶܳ֡;->ܽ:[Ljava/lang/String;

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, v0

    .line 74
    :goto_2
    iput-object p3, p0, Ll/ܶܳ֡;->֫:[Ljava/lang/String;

    .line 76
    array-length p3, p3

    array-length p1, p1

    array-length p2, p2

    .line 78
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 77
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_0

    .line 157
    iget-object v0, p0, Ll/ܶܳ֡;->֫:[Ljava/lang/String;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 158
    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 164
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܶܳ֡;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 169
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܶܳ֡;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    .line 174
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_0

    .line 135
    iget-object v0, p0, Ll/ܶܳ֡;->ۧ:[Ljava/lang/String;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 136
    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_0

    .line 144
    iget-object v0, p0, Ll/ܶܳ֡;->ܽ:[Ljava/lang/String;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 145
    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const-string p1, "EOF"

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
