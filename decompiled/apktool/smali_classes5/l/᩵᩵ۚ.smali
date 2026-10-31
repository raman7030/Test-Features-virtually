.class public final Ll/᩵᩵ۚ;
.super Ll/ۚ᩵ۚ;
.source "K5QL"


# instance fields
.field public final synthetic ᩶:Ll/֡᩵ۚ;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/֡᩵ۚ;ILjava/util/Iterator;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/᩵᩵ۚ;->᩶:Ll/֡᩵ۚ;

    add-int/lit8 p2, p2, -0x1

    .line 73
    iput p2, p0, Ll/᩵᩵ۚ;->᩹:I

    .line 74
    iput-object p3, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 79
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    if-nez v0, :cond_0

    .line 81
    :try_start_0
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩶:Ll/֡᩵ۚ;

    iget v1, p0, Ll/᩵᩵ۚ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/֡᩵ۚ;->֫(Ll/֡᩵ۚ;I)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 83
    :catch_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 86
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 96
    iget v0, p0, Ll/᩵᩵ۚ;->᩹:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 79
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    if-nez v0, :cond_0

    .line 81
    :try_start_0
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩶:Ll/֡᩵ۚ;

    iget v1, p0, Ll/᩵᩵ۚ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/֡᩵ۚ;->֫(Ll/֡᩵ۚ;I)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 83
    :catch_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 86
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 102
    iget v1, p0, Ll/᩵᩵ۚ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩵᩵ۚ;->᩹:I

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 108
    iget v0, p0, Ll/᩵᩵ۚ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Ll/᩵᩵ۚ;->᩸:Ljava/util/Iterator;

    .line 115
    :try_start_0
    iget-object v0, p0, Ll/᩵᩵ۚ;->᩶:Ll/֡᩵ۚ;

    iget v1, p0, Ll/᩵᩵ۚ;->᩹:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ll/᩵᩵ۚ;->᩹:I

    invoke-static {v0, v1}, Ll/֡᩵ۚ;->֫(Ll/֡᩵ۚ;I)Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 117
    :catch_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 123
    iget v0, p0, Ll/᩵᩵ۚ;->᩹:I

    return v0
.end method
