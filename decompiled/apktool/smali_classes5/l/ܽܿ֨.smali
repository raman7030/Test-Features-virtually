.class public final Ll/ܽܿ֨;
.super Ll/ۨܽ֨;
.source "J7CR"


# instance fields
.field public final ۜۧ:Z

.field public ᩻ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܿᩳ֨;Z)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    .line 50
    iput-boolean p2, p0, Ll/ܽܿ֨;->ۜۧ:Z

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/util/ArrayList;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public final ۧ(Ljava/io/DataInputStream;)V
    .locals 10

    .line 62
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    .line 63
    iget-object v1, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v2, "ParameterAnnotationData[%d]:"

    invoke-virtual {v1, v2, v4}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 66
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    .line 67
    iget-object v4, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v6, v8, v5

    aput-object v7, v8, v3

    const-string v6, " Param#[%d]: numAnnotations= %d"

    invoke-virtual {v4, v6, v8}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    if-lez v2, :cond_1

    .line 70
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_0

    .line 72
    new-instance v7, Ll/ۜ֫֨;

    iget-object v8, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    iget-boolean v9, p0, Ll/ܽܿ֨;->ۜۧ:Z

    invoke-direct {v7, v8, v9}, Ll/ۜ֫֨;-><init>(Ll/ۨܽ֨;Z)V

    .line 73
    invoke-virtual {v7, p1}, Ll/ۜ֫֨;->ۧ(Ljava/io/DataInputStream;)V

    .line 74
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 76
    :cond_0
    iget-object v2, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 78
    :cond_1
    iget-object v2, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ᩹()I
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܽܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
