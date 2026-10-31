.class public final Ll/۠ܳۘ;
.super Ljava/lang/Object;
.source "E1N7"

# interfaces
.implements Ll/֨ܳۘ;


# instance fields
.field public final ֫:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/۠ܳۘ;->֫:[I

    return-void
.end method

.method private ᩳ(I)V
    .locals 4

    .line 103
    iget-object v0, p0, Ll/۠ܳۘ;->֫:[I

    if-ltz p1, :cond_0

    .line 94
    array-length v1, v0

    if-ge p1, v1, :cond_0

    return-void

    .line 104
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Wrong line: "

    const-string v3, ". Available lines count: "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 94
    array-length v0, v0

    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/۠ܳۘ;->֫:[I

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Ll/۠ܳۘ;->ᩳ(I)V

    .line 71
    iget-object v0, p0, Ll/۠ܳۘ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Ll/۠ܳۘ;->ᩳ(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 65
    :cond_0
    iget-object v0, p0, Ll/۠ܳۘ;->֫:[I

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ܽ(I)I
    .locals 3

    .line 76
    invoke-direct {p0, p1}, Ll/۠ܳۘ;->ᩳ(I)V

    .line 77
    iget-object v0, p0, Ll/۠ܳۘ;->֫:[I

    aget v1, v0, p1

    array-length v0, v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v2

    return v1
.end method
