.class public final Ll/ۙ᩸᩵;
.super Ll/۫۠᩵;
.source "B99Q"

# interfaces
.implements Ll/᩹᩸᩵;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:[Ljava/lang/Enum;


# direct methods
.method public constructor <init>([Ljava/lang/Enum;)V
    .locals 1

    const-string v0, "entries"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 92
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 88
    new-instance v0, Ll/ۗ᩸᩵;

    iget-object v1, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    invoke-direct {v0, v1}, Ll/ۗ᩸᩵;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 48
    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    .line 70
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v1, "<this>"

    .line 0
    iget-object v2, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    invoke-static {v2, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v0, :cond_1

    .line 1592
    array-length v1, v2

    if-ge v0, v1, :cond_1

    aget-object v0, v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ne v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    .line 59
    iget-object v0, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    array-length v1, v0

    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    .line 60
    aget-object p1, v0, p1

    return-object p1

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    .line 0
    invoke-static {v2, p1, v1, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 48
    instance-of v0, p1, Ljava/lang/Enum;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    .line 78
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v2, "<this>"

    .line 0
    iget-object v3, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    invoke-static {v3, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v0, :cond_1

    .line 1592
    array-length v2, v3

    if-ge v0, v2, :cond_1

    aget-object v2, v3, v0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    .line 48
    instance-of v0, p1, Ljava/lang/Enum;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    .line 78
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v2, "<this>"

    .line 0
    iget-object v3, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    invoke-static {v3, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v0, :cond_1

    .line 1592
    array-length v2, v3

    if-ge v0, v2, :cond_1

    aget-object v2, v3, v0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۙ᩸᩵;->᩸:[Ljava/lang/Enum;

    array-length v0, v0

    return v0
.end method
