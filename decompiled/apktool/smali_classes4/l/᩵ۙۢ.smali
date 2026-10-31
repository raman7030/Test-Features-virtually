.class public final Ll/᩵ۙۢ;
.super Ljava/lang/Object;
.source "X6OE"


# static fields
.field public static final ᩳ:Ll/᩵ۙۢ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 5
    new-instance v0, Ll/᩵ۙۢ;

    const-string v1, ""

    .line 12
    invoke-direct {v0, v1, v1}, Ll/᩵ۙۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    sput-object v0, Ll/᩵ۙۢ;->ᩳ:Ll/᩵ۙۢ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "\r\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "\r"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported line ending"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    :goto_0
    iput-object p2, p0, Ll/᩵ۙۢ;->ۧ:Ljava/lang/String;

    const/4 p2, 0x0

    .line 22
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p2, v0, :cond_4

    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_3

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 24
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Base indent must contain only spaces or tabs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    const/16 p2, 0x78

    .line 27
    iput p2, p0, Ll/᩵ۙۢ;->ܽ:I

    .line 28
    iput-object p1, p0, Ll/᩵ۙۢ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩵ۙۢ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/᩵ۙۢ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 34
    iget v0, p0, Ll/᩵ۙۢ;->ܽ:I

    return v0
.end method
