.class public final Ll/ۡ᩶֡;
.super Ljava/lang/Object;
.source "O69P"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:[Ll/ܺ᩶֡;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V
    .locals 4

    .line 1053
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1054
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܿ()I

    move-result v0

    if-gez v0, :cond_0

    mul-int/lit8 v1, v0, -0x1

    .line 1057
    new-array v1, v1, [Ll/ܺ᩶֡;

    iput-object v1, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    goto :goto_0

    .line 1059
    :cond_0
    new-array v1, v0, [Ll/ܺ᩶֡;

    iput-object v1, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    :goto_0
    const/4 v1, 0x0

    .line 1062
    :goto_1
    iget-object v2, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 1064
    :try_start_0
    new-instance v3, Ll/ܺ᩶֡;

    invoke-direct {v3, p1, p2}, Ll/ܺ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    aput-object v3, v2, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1066
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error while reading EncodedTypeAddrPair at index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    :cond_1
    if-gtz v0, :cond_2

    .line 1071
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result p1

    iput p1, p0, Ll/ۡ᩶֡;->ۧ:I

    return-void

    :cond_2
    const/4 p1, -0x1

    .line 1073
    iput p1, p0, Ll/ۡ᩶֡;->ۧ:I

    return-void
.end method

.method public constructor <init>([Ll/ܺ᩶֡;I)V
    .locals 0

    .line 1041
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1042
    iput-object p1, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    .line 1043
    iput p2, p0, Ll/ۡ᩶֡;->ۧ:I

    return-void
.end method

.method public static ֫(IILl/ۡ᩶֡;)I
    .locals 2

    .line 1103
    iput p0, p2, Ll/ۡ᩶֡;->ᩳ:I

    .line 1104
    iput p1, p2, Ll/ۡ᩶֡;->֫:I

    .line 1106
    iget-object p1, p2, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v0, p1

    .line 1107
    iget p2, p2, Ll/ۡ᩶֡;->ۧ:I

    const/4 v1, -0x1

    if-le p2, v1, :cond_0

    mul-int/lit8 v0, v0, -0x1

    .line 1109
    invoke-static {p2}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p2

    add-int/2addr p0, p2

    .line 1111
    :cond_0
    invoke-static {v0}, Ll/ۧᩳܽ;->᩻(I)I

    move-result p2

    add-int/2addr p2, p0

    .line 1113
    array-length p0, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    aget-object v1, p1, v0

    .line 1114
    invoke-static {v1}, Ll/ܺ᩶֡;->֫(Ll/ܺ᩶֡;)I

    move-result v1

    add-int/2addr p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static ֫(Ll/ۡ᩶֡;)I
    .locals 1

    .line 1090
    iget v0, p0, Ll/ۡ᩶֡;->ᩳ:I

    iget p0, p0, Ll/ۡ᩶֡;->֫:I

    sub-int/2addr v0, p0

    return v0
.end method

.method public static ֫(Ll/ۡ᩶֡;Ll/֫ۗ֡;)V
    .locals 5

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    iget-object v0, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v1, v0

    .line 1148
    iget p0, p0, Ll/ۡ᩶֡;->ۧ:I

    const/4 v2, -0x1

    if-le p0, v2, :cond_0

    mul-int/lit8 v1, v1, -0x1

    .line 1151
    :cond_0
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܿ(I)I

    .line 1153
    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 1154
    invoke-static {v4, p1}, Ll/ܺ᩶֡;->֫(Ll/ܺ᩶֡;Ll/֫ۗ֡;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-le p0, v2, :cond_2

    .line 1158
    invoke-virtual {p1, p0}, Ll/֫ۗ֡;->ܳ(I)I

    :cond_2
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 1178
    const-class v2, Ll/ۡ᩶֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 1182
    :cond_1
    check-cast p1, Ll/ۡ᩶֡;

    iget-object v2, p1, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    .line 1183
    iget-object v3, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v4, v3

    array-length v5, v2

    if-ne v4, v5, :cond_5

    iget v4, p0, Ll/ۡ᩶֡;->ۧ:I

    iget p1, p1, Ll/ۡ᩶֡;->ۧ:I

    if-eq v4, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 1187
    :goto_0
    array-length v4, v3

    if-ge p1, v4, :cond_4

    .line 1188
    aget-object v4, v3, p1

    aget-object v5, v2, p1

    invoke-virtual {v4, v5}, Ll/ܺ᩶֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1166
    iget-object v0, p0, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    mul-int/lit8 v3, v3, 0x1f

    .line 1167
    invoke-virtual {v4}, Ll/ܺ᩶֡;->hashCode()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v3, v3, 0x1f

    .line 1169
    iget v0, p0, Ll/ۡ᩶֡;->ۧ:I

    add-int/2addr v3, v0

    return v3
.end method

.method public final ֫()I
    .locals 1

    .line 1082
    iget v0, p0, Ll/ۡ᩶֡;->ۧ:I

    return v0
.end method
