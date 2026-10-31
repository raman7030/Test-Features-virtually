.class public final Ll/۫᩶ۢ;
.super Ljava/lang/Object;
.source "T6PH"


# static fields
.field public static final ᩳ:Ll/۫᩶ۢ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 5
    new-instance v0, Ll/۫᩶ۢ;

    const-string v1, ""

    invoke-direct {v0, v1, v1}, Ll/۫᩶ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/۫᩶ۢ;->ᩳ:Ll/۫᩶ۢ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Base indent must contain only spaces or tabs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 18
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\r\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "\r"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    .line 19
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported line ending"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    const/16 v0, 0x78

    .line 21
    iput v0, p0, Ll/۫᩶ۢ;->ܽ:I

    .line 22
    iput-object p1, p0, Ll/۫᩶ۢ;->֫:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Ll/۫᩶ۢ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/۫᩶ۢ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/۫᩶ۢ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 26
    iget v0, p0, Ll/۫᩶ۢ;->ܽ:I

    return v0
.end method
