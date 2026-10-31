.class public final Ll/ۤۡܺ;
.super Ljava/lang/Object;
.source "UBJN"


# static fields
.field public static final ᩳ:Ll/ۤۡܺ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/۬ܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Ll/ۤۡܺ;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2, v2}, Ll/ۤۡܺ;-><init>(Ll/۬ܺܺ;II)V

    sput-object v0, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    return-void
.end method

.method public constructor <init>(Ll/۬ܺܺ;II)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-lt p2, v0, :cond_1

    if-lt p3, v0, :cond_0

    .line 69
    iput-object p1, p0, Ll/ۤۡܺ;->ܽ:Ll/۬ܺܺ;

    .line 70
    iput p2, p0, Ll/ۤۡܺ;->֫:I

    .line 71
    iput p3, p0, Ll/ۤۡܺ;->ۧ:I

    return-void

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "line < -1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "address < -1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 106
    instance-of v0, p1, Ll/ۤۡܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    .line 114
    :cond_1
    check-cast p1, Ll/ۤۡܺ;

    .line 116
    iget v2, p0, Ll/ۤۡܺ;->֫:I

    iget v3, p1, Ll/ۤۡܺ;->֫:I

    if-ne v2, v3, :cond_3

    .line 146
    iget v2, p0, Ll/ۤۡܺ;->ۧ:I

    iget v3, p1, Ll/ۤۡܺ;->ۧ:I

    if-ne v2, v3, :cond_3

    iget-object p1, p1, Ll/ۤۡܺ;->ܽ:Ll/۬ܺܺ;

    iget-object v2, p0, Ll/ۤۡܺ;->ܽ:Ll/۬ܺܺ;

    if-eq v2, p1, :cond_2

    if-eqz v2, :cond_3

    .line 148
    invoke-virtual {v2, p1}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۤۡܺ;->ܽ:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->hashCode()I

    move-result v0

    iget v1, p0, Ll/ۤۡܺ;->֫:I

    add-int/2addr v0, v1

    iget v1, p0, Ll/ۤۡܺ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 81
    iget-object v1, p0, Ll/ۤۡܺ;->ܽ:Ll/۬ܺܺ;

    if-eqz v1, :cond_0

    .line 82
    invoke-virtual {v1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    :cond_0
    iget v1, p0, Ll/ۤۡܺ;->ۧ:I

    if-ltz v1, :cond_1

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x40

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    iget v1, p0, Ll/ۤۡܺ;->֫:I

    if-gez v1, :cond_2

    const-string v1, "????"

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 95
    :cond_2
    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 176
    iget v0, p0, Ll/ۤۡܺ;->ۧ:I

    return v0
.end method

.method public final ֫(Ll/ۤۡܺ;)Z
    .locals 1

    .line 135
    iget v0, p0, Ll/ۤۡܺ;->ۧ:I

    iget p1, p1, Ll/ۤۡܺ;->ۧ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
