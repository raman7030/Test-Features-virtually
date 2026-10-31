.class public Lbin/mt/json/Location;
.super Ljava/lang/Object;
.source "Location.java"


# instance fields
.field public final column:I

.field public final line:I

.field public final offset:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Lbin/mt/json/Location;->offset:I

    .line 49
    iput p3, p0, Lbin/mt/json/Location;->column:I

    .line 50
    iput p2, p0, Lbin/mt/json/Location;->line:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 72
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 75
    :cond_2
    check-cast p1, Lbin/mt/json/Location;

    .line 76
    iget v2, p0, Lbin/mt/json/Location;->offset:I

    iget v3, p1, Lbin/mt/json/Location;->offset:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lbin/mt/json/Location;->column:I

    iget v3, p1, Lbin/mt/json/Location;->column:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lbin/mt/json/Location;->line:I

    iget p1, p1, Lbin/mt/json/Location;->line:I

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public hashCode()I
    .locals 1

    .line 61
    iget v0, p0, Lbin/mt/json/Location;->offset:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lbin/mt/json/Location;->line:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lbin/mt/json/Location;->column:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
